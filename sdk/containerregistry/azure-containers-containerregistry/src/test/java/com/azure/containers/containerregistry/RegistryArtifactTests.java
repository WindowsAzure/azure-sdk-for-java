// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry;

import com.azure.core.http.HttpClient;
import com.azure.core.http.netty.NettyAsyncHttpClientBuilder;
import com.azure.core.test.TestMode;
import com.azure.core.util.Context;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import java.time.Duration;
import java.util.Arrays;

import static com.azure.containers.containerregistry.TestUtils.ALPINE_REPOSITORY_NAME;
import static com.azure.containers.containerregistry.TestUtils.DISPLAY_NAME_WITH_ARGUMENTS;
import static com.azure.containers.containerregistry.TestUtils.LATEST_TAG_NAME;
import static com.azure.containers.containerregistry.TestUtils.SLEEP_TIME_IN_MILLISECONDS;
import static com.azure.containers.containerregistry.TestUtils.V1_TAG_NAME;
import static com.azure.containers.containerregistry.TestUtils.V2_TAG_NAME;
import static com.azure.containers.containerregistry.TestUtils.V3_TAG_NAME;
import static com.azure.containers.containerregistry.TestUtils.V4_TAG_NAME;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegistryArtifactTests extends ContainerRegistryClientsTestBase {
    private RegistryArtifactAsync asyncClient;
    private RegistryArtifact client;
    private String recordFileName;
    private String digest;
    private boolean reupdateManifestProperties;
    private boolean reupdateTagProperties;

    @BeforeEach
    void beforeEach() {
        TestUtils.importImage(
            getTestMode(),
            ALPINE_REPOSITORY_NAME,
            Arrays.asList(
                LATEST_TAG_NAME,
                V1_TAG_NAME,
                V2_TAG_NAME,
                V3_TAG_NAME,
                V4_TAG_NAME));
    }

    @AfterEach
    void afterEach() {
        if (getTestMode() == TestMode.PLAYBACK) {
            return;
        }

        if (reupdateManifestProperties) {
            client = getRegistryArtifactClient(new NettyAsyncHttpClientBuilder().build(), digest);
            client.updateManifestProperties(defaultManifestProperties);
        }

        if (reupdateTagProperties) {
            client = getRegistryArtifactClient(new NettyAsyncHttpClientBuilder().build(), digest);
            client.updateTagProperties(digest, defaultTagProperties);
        }
    }

    private RegistryArtifactAsync getRegistryArtifactAsyncClient(String digest) {
        return getRegistryArtifactAsyncClient(new LocalHttpClient(recordFileName), digest);
    }

    private RegistryArtifactAsync getRegistryArtifactAsyncClient(HttpClient httpClient, String digest) {
        return getContainerRegistryBuilder(httpClient)
            .buildAsyncClient()
            .getArtifact(ALPINE_REPOSITORY_NAME, digest);
    }

    private RegistryArtifact getRegistryArtifactClient(HttpClient httpClient, String digest) {
        return getContainerRegistryBuilder(httpClient)
            .buildClient()
            .getArtifact(ALPINE_REPOSITORY_NAME, digest);
    }

    private RegistryArtifact getRegistryArtifactClient(String digest) {
        return getRegistryArtifactClient(new LocalHttpClient(recordFileName), digest);
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getHttpClients")
    public void delete(HttpClient httpClient) {
        client = getRegistryArtifactClient(httpClient, V4_TAG_NAME);
        String digest = getChildArtifactDigest(client.getManifestProperties().getManifestReferences());

        asyncClient = getRegistryArtifactAsyncClient(httpClient, digest);

        Mono<Boolean> delete = asyncClient.delete()
            .delaySubscription(Duration.ofMillis(SLEEP_TIME_IN_MILLISECONDS))
            .then(asyncClient.getManifestProperties()
                .flatMap(res -> Mono.just(false))
                .onErrorResume(res -> asyncClient.delete()
                    .then(Mono.just(true))
                    .onErrorResume(err -> Mono.just(false))));

        StepVerifier.create(delete)
            .assertNext(res -> assertTrue(res))
            .verifyComplete();
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getHttpClients")
    public void deleteTag(HttpClient httpClient) {
        client = getRegistryArtifactClient(httpClient, LATEST_TAG_NAME);
        asyncClient = getRegistryArtifactAsyncClient(httpClient, LATEST_TAG_NAME);

        Mono<Boolean> delete = asyncClient.deleteTag(V3_TAG_NAME)
            .delaySubscription(Duration.ofMillis(SLEEP_TIME_IN_MILLISECONDS))
            .then(asyncClient.getTagProperties(V3_TAG_NAME)
                .flatMap(res -> Mono.just(false))
                .onErrorResume(res -> asyncClient.deleteTag(V3_TAG_NAME)
                        .then(Mono.just(true))
                        .onErrorResume(err -> Mono.just(false))));

        StepVerifier.create(delete)
            .assertNext(res -> assertTrue(res))
            .verifyComplete();

        StepVerifier.create(asyncClient.deleteTag(null))
            .expectError(NullPointerException.class)
            .verify();

        StepVerifier.create(asyncClient.deleteTag(""))
            .expectError(IllegalArgumentException.class)
            .verify();

        StepVerifier.create(asyncClient.deleteTagWithResponse(null))
            .expectError(NullPointerException.class)
            .verify();

        assertThrows(NullPointerException.class, () -> client.deleteTag(null));
        assertThrows(IllegalArgumentException.class, () -> client.deleteTag(""));
        assertThrows(NullPointerException.class, () -> client.deleteTagWithResponse(null, Context.NONE));
        assertThrows(IllegalArgumentException.class, () -> client.deleteTagWithResponse("", Context.NONE));
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getHttpClients")
    public void updateManifestProperties(HttpClient httpClient) {
        client = getRegistryArtifactClient(httpClient, V1_TAG_NAME);
        asyncClient = getRegistryArtifactAsyncClient(httpClient, V1_TAG_NAME);

        reupdateManifestProperties = true;
        digest = V1_TAG_NAME;

        StepVerifier.create(asyncClient.updateManifestProperties(manifestWriteableProperties))
            .assertNext(res -> validateManifestContentProperties(res))
            .verifyComplete();

        StepVerifier.create(asyncClient.updateManifestPropertiesWithResponse(manifestWriteableProperties))
            .assertNext(res -> validateManifestContentProperties(res.getValue()))
            .verifyComplete();

        validateManifestContentProperties(client.updateManifestProperties(manifestWriteableProperties));

        validateManifestContentProperties(client.updateManifestPropertiesWithResponse(manifestWriteableProperties, Context.NONE)
            .getValue());
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getHttpClients")
    public void updateTagProperties(HttpClient httpClient) {
        client = getRegistryArtifactClient(httpClient, V2_TAG_NAME);
        asyncClient = getRegistryArtifactAsyncClient(httpClient, V2_TAG_NAME);

        digest = V2_TAG_NAME;
        reupdateTagProperties = true;

        StepVerifier.create(asyncClient.updateTagProperties(V2_TAG_NAME, tagWriteableProperties))
            .assertNext(res -> validateTagContentProperties(res))
            .verifyComplete();

        StepVerifier.create(asyncClient.updateTagPropertiesWithResponse(V2_TAG_NAME, tagWriteableProperties))
            .assertNext(res -> validateTagContentProperties(res.getValue()))
            .verifyComplete();

        validateTagContentProperties(client.updateTagProperties(V2_TAG_NAME, tagWriteableProperties));

        validateTagContentProperties(client.updateTagPropertiesWithResponse(V2_TAG_NAME, tagWriteableProperties, Context.NONE)
            .getValue());

        StepVerifier.create(asyncClient.updateTagProperties(null, tagWriteableProperties))
            .verifyError(NullPointerException.class);

        StepVerifier.create(asyncClient.updateTagPropertiesWithResponse("", tagWriteableProperties))
            .verifyError(IllegalArgumentException.class);

        StepVerifier.create(asyncClient.updateTagProperties(LATEST_TAG_NAME, null))
            .verifyError(NullPointerException.class);

        assertThrows(NullPointerException.class, () -> client.updateTagProperties(null, tagWriteableProperties));
        assertThrows(IllegalArgumentException.class, () -> client.updateTagProperties("", tagWriteableProperties));
        assertThrows(NullPointerException.class, () -> client.updateTagProperties(LATEST_TAG_NAME, null));
    }

    @Test
    public void deleteFromRecordFile() {
        recordFileName = "RegistryArtifactTests.delete[1].json";
        client = getRegistryArtifactClient(V4_TAG_NAME);
        String digest = getChildArtifactDigest(client.getManifestProperties().getManifestReferences());

        asyncClient = getRegistryArtifactAsyncClient(digest);
        client = getRegistryArtifactClient(digest);

        StepVerifier.create(asyncClient.delete())
            .verifyComplete();

        StepVerifier.create(asyncClient.deleteWithResponse())
            .assertNext(res -> assertNull(res.getValue()))
            .verifyComplete();

        client.delete();
        assertNull(client.deleteWithResponse(Context.NONE).getValue());
    }

    @Test
    public void deleteTagFromRecordFile() {
        recordFileName = "RegistryArtifactTests.deleteTag[1].json";
        client = getRegistryArtifactClient(LATEST_TAG_NAME);
        asyncClient = getRegistryArtifactAsyncClient(LATEST_TAG_NAME);

        StepVerifier.create(asyncClient.deleteTag(V3_TAG_NAME))
            .verifyComplete();

        StepVerifier.create(asyncClient.deleteTagWithResponse(V3_TAG_NAME))
            .assertNext(res -> assertNull(res.getValue()))
            .verifyComplete();

        client.deleteTag(V3_TAG_NAME);
        assertNull(client.deleteTagWithResponse(V3_TAG_NAME, Context.NONE).getValue());
    }
}
