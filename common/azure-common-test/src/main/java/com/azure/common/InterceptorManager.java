// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.common;

import com.azure.common.http.*;
import com.azure.common.models.NetworkCallRecord;
import com.azure.common.models.RecordedData;
import com.azure.common.utils.SdkContext;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Mono;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

public class InterceptorManager implements Closeable {
    private final static String RECORD_FOLDER = "session-records/";

    private final Logger logger = LoggerFactory.getLogger(InterceptorManager.class);
    private final Map<String, String> textReplacementRules = new HashMap<>();
    private final String testName;
    private final TestMode testMode;

    // Stores a map of all the HTTP properties in a session
    // A state machine ensuring a test is always reset before another one is setup
    private final RecordedData recordedData;

    public InterceptorManager(String testName, TestMode testMode) throws IOException {
        this.testName = testName;
        this.testMode = testMode;

        this.recordedData = testMode == TestMode.PLAYBACK
            ? readDataFromFile()
            : new RecordedData();
    }

    public TestMode testMode() {
        return testMode;
    }

    public boolean isPlaybackMode() {
        return testMode == TestMode.PLAYBACK;
    }

    public RecordedData recordedData() {
        return recordedData;
    }

    public HttpClient getPlaybackClient() {
        return new PlaybackClient();
    }

    @Override
    public void close() {
        switch (testMode) {
            case RECORD:
                try {
                    writeDataToFile();
                } catch (IOException e) {
                    logger.error("Unable to write data to playback file.", e);
                }
                break;
            case PLAYBACK:
                // Do nothing
                break;
            default:
                System.out.println("==> Unknown AZURE_TEST_MODE: " + testMode);
        }
    }

    final class PlaybackClient implements HttpClient {
        AtomicInteger count = new AtomicInteger(0);

        @Override
        public Mono<HttpResponse> send(final HttpRequest request) {
            return Mono.defer(() -> playbackHttpResponse(request));
        }

        @Override
        public HttpClient proxy(Supplier<ProxyOptions> supplier) {
            return this;
        }

        @Override
        public HttpClient wiretap(boolean b) {
            return this;
        }

        @Override
        public HttpClient port(int i) {
            return this;
        }

        private Mono<HttpResponse> playbackHttpResponse(final HttpRequest request) {
            String incomingUrl = applyReplacementRule(request.url().toString());
            String incomingMethod = request.httpMethod().toString();

            incomingUrl = removeHost(incomingUrl);
            NetworkCallRecord networkCallRecord = null;
            synchronized (recordedData) {
                for (Iterator<NetworkCallRecord> iterator = recordedData.getNetworkCallRecords().iterator(); iterator.hasNext(); ) {
                    NetworkCallRecord record = iterator.next();
                    if (record.method().equalsIgnoreCase(incomingMethod) && removeHost(record.uri()).equalsIgnoreCase(incomingUrl)) {
                        networkCallRecord = record;
                        iterator.remove();
                        break;
                    }
                }
            }

            count.incrementAndGet();
            if (networkCallRecord == null) {
                logger.warn("NOT FOUND - Method: {} URL: {}", incomingMethod, incomingUrl);
                logger.warn("Records requested: {}. Remaining Records: {}.", count, recordedData.getNetworkCallRecords().size());

                Assert.fail("==> Unexpected request: " + incomingMethod + " " + incomingUrl);
            }

            int recordStatusCode = Integer.parseInt(networkCallRecord.response().get("StatusCode"));
            HttpHeaders headers = new HttpHeaders();

            for (Map.Entry<String, String> pair : networkCallRecord.response().entrySet()) {
                if (!pair.getKey().equals("StatusCode") && !pair.getKey().equals("Body") && !pair.getKey().equals("Content-Length")) {
                    String rawHeader = pair.getValue();
                    for (Map.Entry<String, String> rule : textReplacementRules.entrySet()) {
                        if (rule.getValue() != null) {
                            rawHeader = rawHeader.replaceAll(rule.getKey(), rule.getValue());
                        }
                    }
                    headers.set(pair.getKey(), rawHeader);
                }
            }

            String rawBody = networkCallRecord.response().get("Body");
            byte[] bytes = new byte[0];

            if (rawBody != null) {
                for (Map.Entry<String, String> rule : textReplacementRules.entrySet()) {
                    if (rule.getValue() != null) {
                        rawBody = rawBody.replaceAll(rule.getKey(), rule.getValue());
                    }
                }

                bytes = rawBody.getBytes(StandardCharsets.UTF_8);
                headers.set("Content-Length", String.valueOf(bytes.length));
            }

            HttpResponse response = new MockHttpResponse(request, recordStatusCode, headers, bytes);
            return Mono.just(response);
        }
    }

    private RecordedData readDataFromFile() throws IOException {
        File recordFile = getRecordFile(testName);
        ObjectMapper mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        RecordedData recordedData = mapper.readValue(recordFile, RecordedData.class);

        logger.info("Total records: {}", recordedData.getNetworkCallRecords().size());

        return recordedData;
    }

    private void writeDataToFile() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        File recordFile = getRecordFile(testName);
        recordFile.createNewFile();
        mapper.writeValue(recordFile, recordedData);
    }

    private static File getRecordFile(String testName) {
        URL folderUrl = InterceptorManager.class.getClassLoader().getResource(".");
        File folderFile = new File(folderUrl.getPath() + RECORD_FOLDER);
        if (!folderFile.exists()) {
            folderFile.mkdir();
        }
        String filePath = folderFile.getPath() + "/" + testName + ".json";
        System.out.println("==> Playback file path: " + filePath);
        return new File(filePath);
    }

    private String applyReplacementRule(String text) {
        for (Map.Entry<String, String> rule : textReplacementRules.entrySet()) {
            if (rule.getValue() != null) {
                text = text.replaceAll(rule.getKey(), rule.getValue());
            }
        }
        return text;
    }

    private static String removeHost(String url) {
        URI uri = URI.create(url);
        return String.format("%s?%s", uri.getPath(), uri.getQuery());
    }
}
