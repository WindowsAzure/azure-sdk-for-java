// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.applicationconfig;

import com.azure.applicationconfig.models.Key;
import com.azure.applicationconfig.models.KeyLabelFilter;
import com.azure.applicationconfig.models.KeyValue;
import com.azure.applicationconfig.models.KeyValueFilter;
import com.azure.applicationconfig.models.KeyValueListFilter;
import com.azure.applicationconfig.models.RevisionFilter;
import com.microsoft.azure.core.InterceptorManager;
import com.microsoft.azure.core.TestMode;
import com.microsoft.azure.utils.SdkContext;
import com.microsoft.azure.v3.CloudException;
import com.microsoft.rest.v3.RestResponse;
import com.microsoft.rest.v3.http.HttpClient;
import com.microsoft.rest.v3.http.HttpPipeline;
import com.microsoft.rest.v3.http.HttpPipelineLogLevel;
import com.microsoft.rest.v3.http.HttpPipelineOptions;
import com.microsoft.rest.v3.http.Slf4jLogger;
import com.microsoft.rest.v3.http.policy.HttpLogDetailLevel;
import com.microsoft.rest.v3.http.policy.HttpLoggingPolicy;
import com.microsoft.rest.v3.http.policy.HttpPipelinePolicy;
import com.microsoft.rest.v3.http.policy.RetryPolicy;
import com.microsoft.rest.v3.http.policy.UserAgentPolicy;
import io.netty.handler.codec.http.HttpResponseStatus;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.test.StepVerifier;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

import static com.azure.applicationconfig.AzConfigClient.SDK_NAME;
import static com.azure.applicationconfig.AzConfigClient.SDK_VERSION;

public class AzConfigTest {
    private static final String PLAYBACK_URI_BASE = "http://localhost:";

    private final Logger logger = LoggerFactory.getLogger(AzConfigTest.class);

    private InterceptorManager interceptorManager;
    private AzConfigClient client;
    private String keyPrefix;

    @Rule
    public TestName testName = new TestName();

    @Before
    public void beforeTest() throws Exception {
        TestMode testMode = getTestMode();
        String playbackUri = getPlaybackUri(testMode);

        interceptorManager = InterceptorManager.create(testName.getMethodName(), testMode);
<<<<<<< HEAD

        ApplicationConfigCredentials credentials;
=======
        HttpPipelineOptions pipelineOptions = new HttpPipelineOptions(new Slf4jLogger(logger).withMinimumLogLevel(HttpPipelineLogLevel.INFO));
        AzConfigClient.AzConfigCredentials credentials;
>>>>>>> 74491aa9fe... Updating AzConfigTest to use HttpClient that enables wiretapping
        HttpPipeline pipeline;

        if (interceptorManager.isPlaybackMode()) {
            logger.info("PLAYBACK MODE");

            connectionString = "endpoint=" + playbackUri + ";Id=0000000000000;Secret=MDAwMDAw";
            credentials = ApplicationConfigCredentials.parseConnectionString(connectionString);
            List<HttpPipelinePolicy> policies = getDefaultPolicies(credentials);

            pipeline = new HttpPipeline(
                    interceptorManager.getPlaybackClient(),
                    pipelineOptions,
                    policies.toArray(new HttpPipelinePolicy[0]));

            System.out.println(playbackUri);
        } else {
            logger.info("RECORD MODE");

            String connectionString = System.getenv("AZCONFIG_CONNECTION_STRING");
            Objects.requireNonNull(connectionString, "AZCONFIG_CONNECTION_STRING expected to be set.");

            credentials = AzConfigClient.AzConfigCredentials.parseConnectionString(connectionString);
            List<HttpPipelinePolicy> policies = getDefaultPolicies(credentials);
            policies.add(interceptorManager.getRecordPolicy());

            HttpClient httpClient = HttpClient.createDefault().wiretap(true);
            pipeline = new HttpPipeline(httpClient, pipelineOptions, policies.toArray(new HttpPipelinePolicy[0]));

            interceptorManager.addTextReplacementRule(credentials.baseUri().toString(), playbackUri);
        }
        client = AzConfigClient.create(connectionString, pipeline);
        keyPrefix = SdkContext.randomResourceName("key", 8);
    }

    private static List<HttpPipelinePolicy> getDefaultPolicies(ApplicationConfigCredentials credentials) {
        List<HttpPipelinePolicy> policies = new ArrayList<>();
        policies.add(new UserAgentPolicy(String.format("Azure-SDK-For-Java/%s (%s)", SDK_NAME, SDK_VERSION)));
        policies.add(new RequestIdPolicy());
        policies.add(new AzConfigCredentialsPolicy(credentials));
        policies.add(new RetryPolicy());
        policies.add(new HttpLoggingPolicy(HttpLogDetailLevel.BODY_AND_HEADERS));

        return policies;
    }

    private static String getPlaybackUri(TestMode testMode) throws IOException {
        if (testMode == TestMode.RECORD) {
            Properties mavenProps = new Properties();

            try (InputStream in = AzConfigTest.class.getResourceAsStream("/maven.properties")) {
                if (in == null) {
                    throw new IOException(
                            "The file \"maven.properties\" has not been generated yet. Please execute \"mvn compile\" to generate the file.");
                }
                mavenProps.load(in);
            }

            String port = mavenProps.getProperty("playbackServerPort");
            // 11080 and 11081 needs to be in sync with values in jetty.xml file
            return PLAYBACK_URI_BASE + port;
        } else {
            return PLAYBACK_URI_BASE + "1234";
        }
    }

    private TestMode getTestMode() throws IllegalArgumentException {
        String azureTestMode = System.getenv("AZURE_TEST_MODE");

        if (azureTestMode != null) {
            try {
                return TestMode.valueOf(azureTestMode.toUpperCase(Locale.US));
            } catch (IllegalArgumentException e) {
                logger.error("Could not parse '{}' into TestEnum.", azureTestMode);
                throw e;
            }
        } else {
            logger.info("Environment variable 'AZURE_TEST_MODE' has not been set yet. Using 'Playback' mode.");
            return TestMode.PLAYBACK;
        }
    }

    @After
    public void afterTest() {
        cleanUpResources();
        interceptorManager.close();
    }

    private void cleanUpResources() {
        logger.info("Cleaning up created key values.");
        client.listKeyValues(new KeyValueListFilter().withKey(keyPrefix + "*"))
                .flatMap(keyValue -> {
                    logger.info("Deleting key:label [{}:{}]. isLocked? {}", keyValue.key(), keyValue.label(), keyValue.isLocked());

                    if (keyValue.isLocked()) {
                        return client.unlockKeyValue(keyValue.key(), keyValue.label(), null).flatMap(response -> {
                            KeyValue kv = response.body();
                            return client.deleteKeyValue(kv.key(), kv.label(), null);
                        });
                    } else {
                        return client.deleteKeyValue(keyValue.key(), keyValue.label(), null);
                    }
                }).blockLast();

        logger.info("Finished cleaning up values.");
    }

    /**
     * Verifies that a KeyValue can be added with a label, and that we can fetch that KeyValue from the service when
     * filtering by either its label or just its key.
     */
    @Test
    public void listWithKeyAndLabel() {
        final String value  = "myValue";
        final String key = SdkContext.randomResourceName(keyPrefix, 16);
        final String label = SdkContext.randomResourceName("lbl", 8);
        final KeyValue expected = new KeyValue().withKey(key).withValue(value).withLabel(label);

        StepVerifier.create(client.setKeyValue(expected))
                .assertNext(response -> assertEquals(expected, response))
                .expectComplete()
                .verify();

        StepVerifier.create(client.listKeyValues(new KeyValueListFilter().withKey(key).withLabel(label)))
                .assertNext(keyValue -> assertEquals(expected, keyValue))
                .expectComplete()
                .verify();

        StepVerifier.create(client.listKeyValues(new KeyValueListFilter().withKey(key)))
                .assertNext(keyValue -> assertEquals(expected, keyValue))
                .expectComplete()
                .verify();
    }

    @Test
    public void crudKeyValue() {
        String key = SdkContext.randomResourceName(keyPrefix, 8);
        KeyValue newKeyValue = new KeyValue().withKey(key).withValue("myNewValue5");
        StepVerifier.create(client.setKeyValue(newKeyValue))
                .assertNext(response -> assertEquals(newKeyValue, response))
                .expectComplete()
                .verify();

        StepVerifier.create(client.deleteKeyValue(newKeyValue.key()))
                .assertNext(response -> assertEquals(newKeyValue, response))
                .expectComplete()
                .verify();
    }

    @Test
    public void getWithLabel() {
        final String label = "myLabel";
        final String key = SdkContext.randomResourceName(keyPrefix, 16);
        final KeyValue kv = new KeyValue().withKey(key).withValue("myValue").withLabel(label);

        StepVerifier.create(client.setKeyValue(kv))
                .assertNext(response -> assertEquals(kv, response))
                .expectComplete()
                .verify();

        StepVerifier.create(client.getKeyValue(key, new KeyValueFilter().withLabel("myLabel")))
                .assertNext(response -> assertEquals(kv, response))
                .expectComplete()
                .verify();

            StepVerifier.create(client.getKeyValue(key, new KeyValueFilter().withLabel("myNonExistingLabel")))
                    .expectErrorSatisfies(error -> {
                        Assert.assertTrue(error instanceof CloudException);
                        Assert.assertEquals(404, ((CloudException) error).response().statusCode());
                    })
                    .verify();
    }

    @Test
    public void getWithEtag() {
        String key = SdkContext.randomResourceName(keyPrefix, 16);
        KeyValue expected = new KeyValue().withKey(key).withValue("myValue");
        KeyValue newExpected = new KeyValue().withKey(key).withValue("myNewValue");
        RestResponse<Map<String, String>, KeyValue> block = client.setKeyValue(expected).single().block();

        Assert.assertNotNull(block);
        assertEquals(expected, block);

        String etag = block.body().etag();
        StepVerifier.create(client.getKeyValue(key, new KeyValueFilter().withIfNoneMatch(etag)))
                .expectErrorSatisfies(ex -> {
                    Assert.assertTrue(ex instanceof CloudException);
                    // etag has not changed, so getting 304 NotModified code according to service spec
                    Assert.assertTrue(ex.getMessage().contains("304"));
                })
                .verify();

        StepVerifier.create(client.setKeyValue(newExpected))
                .assertNext(response -> assertEquals(newExpected, response))
                .expectComplete()
                .verify();
    }

    @Test
    public void lockUnlockKeyValue() {
        final String keyName = SdkContext.randomResourceName(keyPrefix, 16);
        final KeyValue expected = new KeyValue().withKey(keyName).withValue("myKeyValue");
        final KeyValue updated = new KeyValue().withKey(keyName).withValue("Some new value");
        final KeyValue updated2 = new KeyValue().withKey(keyName).withValue("Some new value, again.");

        StepVerifier.create(client.setKeyValue(expected))
                .assertNext(response -> assertEquals(expected, response))
                .expectComplete()
                .verify();

        StepVerifier.create(client.lockKeyValue(expected.key()))
                .assertNext(response -> assertEquals(expected, response))
                .expectComplete()
                .verify();

        StepVerifier.create(client.setKeyValue(updated))
                .expectErrorSatisfies(ex -> {
                    Assert.assertTrue(ex instanceof CloudException);
                    Assert.assertEquals(HttpResponseStatus.CONFLICT.code(), ((CloudException) ex).response().statusCode());
                }).verify();

        StepVerifier.create(client.unlockKeyValue(keyName).flatMap(response -> client.setKeyValue(updated2)))
                .assertNext(response -> assertEquals(updated2, response))
                .expectComplete()
                .verify();
    }

    @Test
    public void listRevisions() {
        final String keyName = SdkContext.randomResourceName(keyPrefix, 16);
        final KeyValue original = new KeyValue().withKey(keyName).withValue("myValue");
        final KeyValue updated = new KeyValue().withKey(keyName).withValue("anotherValue");
        final HashSet<String> expected = new HashSet<>();
        expected.add(original.value());
        expected.add(updated.value());

        // Create two different revisions of the same key.
        StepVerifier.create(client.setKeyValue(original))
                .assertNext(response -> assertEquals(original, response))
                .expectComplete()
                .verify();
        StepVerifier.create(client.setKeyValue(updated))
                .assertNext(response -> assertEquals(updated, response))
                .expectComplete()
                .verify();

        // Get all revisions for a key
        StepVerifier.create(client.listKeyValueRevisions(new RevisionFilter().withKey(keyPrefix + "*")))
                .assertNext(response -> {
                    Assert.assertEquals(keyName, response.key());
                    Assert.assertTrue(expected.remove(response.value()));
                })
                .assertNext(response -> {
                    Assert.assertEquals(keyName, response.key());
                    Assert.assertTrue(expected.remove(response.value()));
                })
                .expectComplete()
                .verify();

        Assert.assertTrue(expected.isEmpty());
//        Assert.assertEquals(Long.valueOf(2L), revisions);
    }

    @Test
    public void listLabels() {
        String keyName = SdkContext.randomResourceName(keyPrefix, 16);
        String label1 = keyPrefix + "-lbl1";
        String label2 = keyPrefix + "-lbl2";
        String label3 = keyPrefix + "-lbl3";
        client.setKeyValue(new KeyValue().withKey(keyName).withValue("value1").withLabel(label1)).block();
        client.setKeyValue(new KeyValue().withKey(keyName).withValue("value2").withLabel(label2)).block();
        client.setKeyValue(new KeyValue().withKey(keyName).withValue("value3").withLabel(label3)).block();

//        List<Label> labels = client.listLabels(new KeyLabelFilter().withName(keyPrefix + "-lbl*")).blockFirst().items();
//        Assert.assertEquals(3, labels.size());
//        Assert.assertEquals(1, labels.get(0).kvCount());
//        Assert.assertTrue(Pattern.matches(keyPrefix + "-lbl\\d", labels.get(0).name()));
    }

    @Test
    public void listKeys() {
        String key1 = keyPrefix + "-1";
        String key2 = keyPrefix + "-2";
        String key3 = keyPrefix + "-3";
//        client.getKeyValue("key69076343820", null).block();
        Map<String, String> tags = new HashMap<>();
        client.setKeyValue(new KeyValue().withKey(key1).withValue("value1").withLabel("label1").withContentType("testContentType").withTags(tags)).block();
        client.setKeyValue(new KeyValue().withKey(key2).withValue("value2").withLabel("label2")).block();
        client.setKeyValue(new KeyValue().withKey(key3).withValue("value3").withLabel("label3")).block();

        List<Key> keys = client.listKeys(new KeyLabelFilter().withName(keyPrefix + "*")).collectList().block();
        Assert.assertEquals(3, keys.size());
    }

    private static void assertEquals(KeyValue expected, RestResponse<Map<String, String>, KeyValue> response) {
        Assert.assertNotNull(response);
        Assert.assertEquals(200, response.statusCode());

        if (expected == null) {
            Assert.assertNull(response.body());
            return;
        }

        assertEquals(expected, response.body());
    }

    private static void assertEquals(KeyValue expected, KeyValue actual) {
        if (expected == null) {
            Assert.assertNull(actual);
            return;
        }

        Assert.assertNotNull(actual);
        Assert.assertEquals(expected.key(), actual.key());
        Assert.assertEquals(expected.label(), actual.label());
        Assert.assertEquals(expected.value(), actual.value());
        Assert.assertEquals(expected.contentType(), actual.contentType());
    }
}
