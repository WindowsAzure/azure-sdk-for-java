// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.file;

import com.azure.core.http.HttpClient;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.implementation.logging.ServiceLogger;
import com.azure.storage.file.models.CorsRule;
import com.azure.storage.file.models.FileServiceProperties;
import com.azure.storage.file.models.ListSharesOptions;
import com.azure.storage.file.models.Metrics;
import com.azure.storage.file.models.RetentionPolicy;
import com.azure.storage.file.models.ShareItem;
import com.azure.storage.file.models.ShareProperties;
import com.azure.storage.file.models.StorageErrorException;
import reactor.test.StepVerifier;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.fail;

public class FileServiceClientAsyncTests extends FileServiceClientTestsBase {
    private final ServiceLogger logger = new ServiceLogger(FileServiceClientAsyncTests.class);

    private FileServiceAsyncClient serviceClient;

    @Override
    public void beforeTest() {
        shareName = getShareName();
        helper = new TestHelpers();

        if (interceptorManager.isPlaybackMode()) {
            serviceClient = helper.setupClient((connectionString, endpoint) -> FileServiceAsyncClient.builder()
                .connectionString(connectionString)
                .endpoint(endpoint)
                .httpClient(interceptorManager.getPlaybackClient())
                .httpLogDetailLevel(HttpLogDetailLevel.BODY_AND_HEADERS)
                .buildAsync(), true, logger);
        } else {
            serviceClient = helper.setupClient((connectionString, endpoint) -> FileServiceAsyncClient.builder()
                .connectionString(connectionString)
                .endpoint(endpoint)
                .httpClient(HttpClient.createDefault().wiretap(true))
                .httpLogDetailLevel(HttpLogDetailLevel.BODY_AND_HEADERS)
                .addPolicy(interceptorManager.getRecordPolicy())
                .buildAsync(), false, logger);
        }
    }

    @Override
    public void afterTest() {
        serviceClient.listShares(new ListSharesOptions().prefix(shareName))
            .collectList()
            .block()
            .forEach(share -> {
                ShareAsyncClient client = serviceClient.getShareAsyncClient(share.name());
                try {
                    client.delete(null).block();
                } catch (StorageErrorException ex) {
                    // Share already deleted, that's what we wanted anyways.
                }
            });
    }

    @Override
    public void getShareDoesNotCreateAShare() {
        ShareAsyncClient client = serviceClient.getShareAsyncClient(shareName);
        try {
            client.getStatistics().block();
            fail("getShareAsyncClient shouldn't create a share in Azure.");
        } catch (Exception ex) {
            helper.assertExceptionStatusCode(ex, 404);
        }
    }

    @Override
    public void createShare() {
        StepVerifier.create(serviceClient.createShare(shareName))
            .assertNext(response -> helper.assertResponseStatusCode(response, 201))
            .verifyComplete();
    }

    @Override
    public void createShareTwiceSameMetadata() {
        StepVerifier.create(serviceClient.createShare(shareName))
            .assertNext(response -> helper.assertResponseStatusCode(response, 201))
            .verifyComplete();

        StepVerifier.create(serviceClient.createShare(shareName))
            .verifyErrorSatisfies(throwable -> helper.assertExceptionStatusCode(throwable, 409));
    }

    @Override
    public void createShareTwiceDifferentMetadata() {
        Map<String, String> metadata = Collections.singletonMap("test", "metadata");

        StepVerifier.create(serviceClient.createShare(shareName))
            .assertNext(response -> helper.assertResponseStatusCode(response, 201))
            .verifyComplete();

        StepVerifier.create(serviceClient.createShare(shareName, metadata, null))
            .verifyErrorSatisfies(throwable -> helper.assertExceptionStatusCode(throwable, 409));
    }

    @Override
    public void createShareInvalidQuota() {
        StepVerifier.create(serviceClient.createShare(shareName, null, -1))
            .verifyErrorSatisfies(throwable -> helper.assertExceptionStatusCode(throwable, 400));

        StepVerifier.create(serviceClient.createShare(shareName, null, 9999999))
            .verifyErrorSatisfies(throwable -> helper.assertExceptionStatusCode(throwable, 400));
    }

    @Override
    public void deleteShare() {
        StepVerifier.create(serviceClient.createShare(shareName))
            .assertNext(response -> helper.assertResponseStatusCode(response, 201))
            .verifyComplete();

        StepVerifier.create(serviceClient.deleteShare(shareName))
            .assertNext(response -> helper.assertResponseStatusCode(response, 202))
            .verifyComplete();
    }

    @Override
    public void deleteShareDoesNotExist() {
        StepVerifier.create(serviceClient.deleteShare(shareName))
            .verifyErrorSatisfies(throwable -> helper.assertExceptionStatusCode(throwable, 404));
    }

    @Override
    public void deleteThenCreateShare() {
        StepVerifier.create(serviceClient.createShare(shareName))
            .assertNext(response -> helper.assertResponseStatusCode(response, 201))
            .verifyComplete();

        StepVerifier.create(serviceClient.deleteShare(shareName))
            .assertNext(response -> helper.assertResponseStatusCode(response, 202))
            .verifyComplete();

        helper.sleep(Duration.ofSeconds(45));

        StepVerifier.create(serviceClient.createShare(shareName))
            .assertNext(response -> helper.assertResponseStatusCode(response, 201))
            .verifyComplete();
    }

    @Override
    public void deleteThenCreateShareTooSoon() {
        StepVerifier.create(serviceClient.createShare(shareName))
            .assertNext(response -> helper.assertResponseStatusCode(response, 201))
            .verifyComplete();

        StepVerifier.create(serviceClient.deleteShare(shareName))
            .assertNext(response -> helper.assertResponseStatusCode(response, 202))
            .verifyComplete();

        StepVerifier.create(serviceClient.createShare(shareName))
            .verifyErrorSatisfies(throwable -> helper.assertExceptionStatusCode(throwable, 409));
    }

    @Override
    public void listShares() {
        LinkedList<ShareItem> testShares = new LinkedList<>();
        for (int i = 0; i < 3; i++) {
            ShareItem share = new ShareItem().name(shareName + i)
                .properties(new ShareProperties().quota(2));

            testShares.add(share);
            StepVerifier.create(serviceClient.createShare(share.name(), share.metadata(), share.properties().quota()))
                .assertNext(response -> helper.assertResponseStatusCode(response, 201))
                .verifyComplete();
        }

        StepVerifier.create(serviceClient.listShares(defaultOptions()))
            .assertNext(share -> helper.assertSharesAreEqual(testShares.pop(), share))
            .assertNext(share -> helper.assertSharesAreEqual(testShares.pop(), share))
            .assertNext(share -> helper.assertSharesAreEqual(testShares.pop(), share))
            .verifyComplete();
    }

    @Override
    public void listSharesWithPrefix() {
        LinkedList<ShareItem> testShares = new LinkedList<>();
        for (int i = 0; i < 3; i++) {
            ShareItem share = new ShareItem().properties(new ShareProperties().quota(2));

            if (i % 2 == 0) {
                share.name(shareName + "prefix" + i);
                testShares.add(share);
            } else {
                share.name(shareName + i);
            }

            StepVerifier.create(serviceClient.createShare(share.name(), share.metadata(), share.properties().quota()))
                .assertNext(response -> helper.assertResponseStatusCode(response, 201))
                .verifyComplete();
        }

        StepVerifier.create(serviceClient.listShares(defaultOptions().prefix(shareName + "prefix")))
            .assertNext(share -> helper.assertSharesAreEqual(testShares.pop(), share))
            .assertNext(share -> helper.assertSharesAreEqual(testShares.pop(), share))
            .verifyComplete();
    }

    @Override
    public void listSharesWithLimit() {
        LinkedList<ShareItem> testShares = new LinkedList<>();
        for (int i = 0; i < 3; i++) {
            ShareItem share = new ShareItem().name(shareName + i)
                .properties(new ShareProperties().quota(2));

            testShares.add(share);
            StepVerifier.create(serviceClient.createShare(share.name(), share.metadata(), share.properties().quota()))
                .assertNext(response -> helper.assertResponseStatusCode(response, 201))
                .verifyComplete();
        }

        StepVerifier.create(serviceClient.listShares(defaultOptions().maxResults(2)))
            .assertNext(share -> helper.assertSharesAreEqual(testShares.pop(), share))
            .assertNext(share -> helper.assertSharesAreEqual(testShares.pop(), share))
            .verifyComplete();
    }

    @Override
    public void listSharesInvalidMaxResults() {
        StepVerifier.create(serviceClient.listShares(defaultOptions().maxResults(-1)))
            .verifyErrorSatisfies(throwable -> helper.assertExceptionStatusCode(throwable, 400));

        StepVerifier.create(serviceClient.listShares(defaultOptions().maxResults(0)))
            .verifyErrorSatisfies(throwable -> helper.assertExceptionStatusCode(throwable, 400));
    }

    @Override
    public void listSharesIncludeMetadata() {
        Map<String, String> metadata = Collections.singletonMap("test", "metadata");

        LinkedList<ShareItem> testShares = new LinkedList<>();
        for (int i = 0; i < 3; i++) {
            ShareItem share = new ShareItem().name(shareName + i)
                .properties(new ShareProperties().quota(2));

            if (i % 2 == 0) {
                share.metadata(metadata);
            }

            testShares.add(share);
            StepVerifier.create(serviceClient.createShare(share.name(), share.metadata(), share.properties().quota()))
                .assertNext(response -> helper.assertResponseStatusCode(response, 201))
                .verifyComplete();
        }

        StepVerifier.create(serviceClient.listShares(defaultOptions().includeMetadata(true)))
            .assertNext(share -> helper.assertSharesAreEqual(testShares.pop(), share))
            .assertNext(share -> helper.assertSharesAreEqual(testShares.pop(), share))
            .assertNext(share -> helper.assertSharesAreEqual(testShares.pop(), share))
            .verifyComplete();
    }

    @Override
    public void listSharesIncludeSnapshots() {
        LinkedList<ShareItem> testShares = new LinkedList<>();
        for (int i = 0; i < 3; i++) {
            ShareItem share = new ShareItem().name(shareName + i)
                .properties(new ShareProperties().quota(2));

            ShareAsyncClient client = serviceClient.getShareAsyncClient(share.name());

            StepVerifier.create(client.create(null, share.properties().quota()))
                .assertNext(response -> helper.assertResponseStatusCode(response, 201))
                .verifyComplete();

            if (i % 2 == 0) {
                StepVerifier.create(client.createSnapshot())
                    .assertNext(response -> {
                        testShares.add(new ShareItem().name(share.name())
                            .snapshot(response.value().snapshot())
                            .properties(share.properties()));

                        helper.assertResponseStatusCode(response, 201);
                    })
                    .verifyComplete();
            }

            testShares.add(share);
        }

        StepVerifier.create(serviceClient.listShares(defaultOptions().includeSnapshots(true)))
            .assertNext(share -> helper.assertSharesAreEqual(testShares.pop(), share))
            .assertNext(share -> helper.assertSharesAreEqual(testShares.pop(), share))
            .assertNext(share -> helper.assertSharesAreEqual(testShares.pop(), share))
            .assertNext(share -> helper.assertSharesAreEqual(testShares.pop(), share))
            .assertNext(share -> helper.assertSharesAreEqual(testShares.pop(), share))
            .verifyComplete();
    }

    @Override
    public void listSharesIncludeMetadataAndSnapshots() {
        Map<String, String> metadata = Collections.singletonMap("test", "metadata");

        LinkedList<ShareItem> testShares = new LinkedList<>();
        for (int i = 0; i < 3; i++) {
            ShareItem share = new ShareItem().name(shareName + i)
                .properties(new ShareProperties().quota(2));

            if (i % 2 == 0) {
                share.metadata(metadata);
            }

            ShareAsyncClient client = serviceClient.getShareAsyncClient(share.name());

            StepVerifier.create(client.create(share.metadata(), share.properties().quota()))
                .assertNext(response -> helper.assertResponseStatusCode(response, 201))
                .verifyComplete();

            if (i % 2 == 0) {
                StepVerifier.create(client.createSnapshot())
                    .assertNext(response -> {
                        testShares.add(new ShareItem().name(share.name())
                            .snapshot(response.value().snapshot())
                            .properties(share.properties()));

                        helper.assertResponseStatusCode(response, 201);
                    })
                    .verifyComplete();
            }

            testShares.add(share);
        }

        StepVerifier.create(serviceClient.listShares(defaultOptions().includeMetadata(true).includeSnapshots(true)))
            .assertNext(share -> helper.assertSharesAreEqual(testShares.pop(), share))
            .assertNext(share -> helper.assertSharesAreEqual(testShares.pop(), share))
            .assertNext(share -> helper.assertSharesAreEqual(testShares.pop(), share))
            .assertNext(share -> helper.assertSharesAreEqual(testShares.pop(), share))
            .assertNext(share -> helper.assertSharesAreEqual(testShares.pop(), share))
            .verifyComplete();
    }

    @Override
    public void setFileServiceProperties() {
        FileServiceProperties originalProperties = serviceClient.getProperties().block().value();

        RetentionPolicy retentionPolicy = new RetentionPolicy().enabled(true)
            .days(3);

        Metrics metrics = new Metrics().enabled(true)
            .includeAPIs(false)
            .retentionPolicy(retentionPolicy)
            .version("1.0");

        FileServiceProperties updatedProperties = new FileServiceProperties().hourMetrics(metrics)
            .minuteMetrics(metrics)
            .cors(new ArrayList<>());

        StepVerifier.create(serviceClient.setProperties(updatedProperties))
            .assertNext(response -> helper.assertResponseStatusCode(response, 202))
            .verifyComplete();

        StepVerifier.create(serviceClient.getProperties())
            .assertNext(response -> helper.assertFileServicePropertiesAreEqual(updatedProperties, response.value()))
            .verifyComplete();

        StepVerifier.create(serviceClient.setProperties(originalProperties))
            .assertNext(response -> helper.assertResponseStatusCode(response, 202))
            .verifyComplete();

        StepVerifier.create(serviceClient.getProperties())
            .assertNext(response -> helper.assertFileServicePropertiesAreEqual(originalProperties, response.value()))
            .verifyComplete();
    }

    @Override
    public void setPropertiesTooManyRules() {
        RetentionPolicy retentionPolicy = new RetentionPolicy().enabled(true)
            .days(3);

        Metrics metrics = new Metrics().enabled(true)
            .includeAPIs(false)
            .retentionPolicy(retentionPolicy)
            .version("1.0");

        List<CorsRule> cors = new ArrayList<>();
        for (int i = 0; i < 6; i ++) {
            cors.add(new CorsRule());
        }

        FileServiceProperties properties = new FileServiceProperties().hourMetrics(metrics)
            .minuteMetrics(metrics)
            .cors(cors);

        StepVerifier.create(serviceClient.setProperties(properties))
            .verifyErrorSatisfies(throwable -> helper.assertExceptionStatusCode(throwable, 400));
    }

    @Override
    public void setPropertiesInvalidAllowedHeader() {
        RetentionPolicy retentionPolicy = new RetentionPolicy().enabled(true)
            .days(3);

        Metrics metrics = new Metrics().enabled(true)
            .includeAPIs(false)
            .retentionPolicy(retentionPolicy)
            .version("1.0");

        FileServiceProperties properties = new FileServiceProperties().hourMetrics(metrics)
            .minuteMetrics(metrics)
            .cors(Collections.singletonList(new CorsRule().allowedHeaders(reallyLongString)));

        StepVerifier.create(serviceClient.setProperties(properties))
            .verifyErrorSatisfies(throwable -> helper.assertExceptionStatusCode(throwable, 400));
    }

    @Override
    public void setPropertiesInvalidExposedHeader() {
        RetentionPolicy retentionPolicy = new RetentionPolicy().enabled(true)
            .days(3);

        Metrics metrics = new Metrics().enabled(true)
            .includeAPIs(false)
            .retentionPolicy(retentionPolicy)
            .version("1.0");

        FileServiceProperties properties = new FileServiceProperties().hourMetrics(metrics)
            .minuteMetrics(metrics)
            .cors(Collections.singletonList(new CorsRule().exposedHeaders(reallyLongString)));

        StepVerifier.create(serviceClient.setProperties(properties))
            .verifyErrorSatisfies(throwable -> helper.assertExceptionStatusCode(throwable, 400));
    }

    @Override
    public void setPropertiesInvalidAllowedOrigin() {
        RetentionPolicy retentionPolicy = new RetentionPolicy().enabled(true)
            .days(3);

        Metrics metrics = new Metrics().enabled(true)
            .includeAPIs(false)
            .retentionPolicy(retentionPolicy)
            .version("1.0");

        FileServiceProperties properties = new FileServiceProperties().hourMetrics(metrics)
            .minuteMetrics(metrics)
            .cors(Collections.singletonList(new CorsRule().allowedOrigins(reallyLongString)));

        StepVerifier.create(serviceClient.setProperties(properties))
            .verifyErrorSatisfies(throwable -> helper.assertExceptionStatusCode(throwable, 400));
    }

    @Override
    public void setPropertiesInvalidAllowedMethod() {
        RetentionPolicy retentionPolicy = new RetentionPolicy().enabled(true)
            .days(3);

        Metrics metrics = new Metrics().enabled(true)
            .includeAPIs(false)
            .retentionPolicy(retentionPolicy)
            .version("1.0");

        FileServiceProperties properties = new FileServiceProperties().hourMetrics(metrics)
            .minuteMetrics(metrics)
            .cors(Collections.singletonList(new CorsRule().allowedMethods("NOTAREALHTTPMETHOD")));

        StepVerifier.create(serviceClient.setProperties(properties))
            .verifyErrorSatisfies(throwable -> helper.assertExceptionStatusCode(throwable, 400));
    }
}
