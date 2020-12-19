// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.file.share.perf;

import com.azure.perf.test.core.NullOutputStream;
import com.azure.perf.test.core.PerfStressOptions;
import com.azure.perf.test.core.TestDataCreationHelper;
import com.azure.storage.file.share.ShareFileAsyncClient;
import com.azure.storage.file.share.ShareFileClient;
import com.azure.storage.file.share.perf.core.DirectoryTest;
import reactor.core.publisher.Mono;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.UUID;

import static com.azure.perf.test.core.TestDataCreationHelper.createRandomInputStream;

public class DownloadFileShareTest extends DirectoryTest<PerfStressOptions> {
    private static final int BUFFER_SIZE = 16 * 1024 * 1024;
    private static final OutputStream DEV_NULL = new NullOutputStream();
    private static final String FILE_NAME = "perfstress-filev11-" + UUID.randomUUID().toString();

    protected final ShareFileClient shareFileClient;
    protected final ShareFileAsyncClient shareFileAsyncClient;

    private final byte[] buffer = new byte[BUFFER_SIZE];

    public DownloadFileShareTest(PerfStressOptions options) {
        super(options);
        shareFileClient = shareDirectoryClient.getFileClient(FILE_NAME);
        shareFileAsyncClient = shareDirectoryAsyncClient.getFileClient(FILE_NAME);
    }

    private static final Path TEMP_FILE;

    static {
        try {
            TEMP_FILE = Files.createTempFile(null, null);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private Mono<Long> createTempFile() {
        try (InputStream inputStream = createRandomInputStream(options.getSize());
             OutputStream outputStream = new FileOutputStream(TEMP_FILE.toString())) {
            return Mono.just(TestDataCreationHelper.copyStream(inputStream, outputStream, 8192));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // Required resource setup goes here, upload the file to be downloaded during tests.
    public Mono<Void> globalSetupAsync() {
        return super.globalSetupAsync()
            .then(createTempFile())
            .flatMap(dataSize -> shareFileAsyncClient.create(dataSize))
            .then(shareFileAsyncClient.uploadFromFile(TEMP_FILE.toString()))
            .then();
    }

    // Perform the API call to be tested here
    @Override
    public void run() {
        shareFileClient.download(DEV_NULL);
    }

    @Override
    public Mono<Void> runAsync() {
        return shareFileAsyncClient.download()
            .map(b -> {
                int readCount = 0;
                int remaining = b.remaining();
                while (readCount < remaining) {
                    int expectedReadCount = Math.min(remaining - readCount, BUFFER_SIZE);
                    b.get(buffer, 0, expectedReadCount);
                    readCount += expectedReadCount;
                }
                return 1;
            }).then();
    }
}
