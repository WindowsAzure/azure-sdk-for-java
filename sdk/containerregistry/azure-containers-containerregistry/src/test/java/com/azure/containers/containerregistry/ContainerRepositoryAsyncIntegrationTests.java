// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry;

import com.azure.containers.containerregistry.models.ManifestOrderBy;
import com.azure.containers.containerregistry.models.RepositoryProperties;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.HttpClient;
import com.azure.core.http.netty.NettyAsyncHttpClientBuilder;
import com.azure.core.test.TestMode;
import com.azure.core.test.implementation.ImplUtils;
import com.azure.core.util.Context;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import reactor.test.StepVerifier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import static com.azure.containers.containerregistry.TestUtils.DISPLAY_NAME_WITH_ARGUMENTS;
import static com.azure.containers.containerregistry.TestUtils.HELLO_WORLD_REPOSITORY_NAME;
import static com.azure.containers.containerregistry.TestUtils.PAGESIZE_2;
import static com.azure.containers.containerregistry.TestUtils.REGISTRY_ENDPOINT;
import static com.azure.containers.containerregistry.TestUtils.REGISTRY_NAME;
import static com.azure.containers.containerregistry.TestUtils.TAG_UNKNOWN;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContainerRepositoryAsyncIntegrationTests extends ContainerRegistryClientsTestBase {

    private ContainerRepositoryAsync asyncClient;
    private ContainerRepository client;
    private RepositoryProperties contentProperties;

    @BeforeEach
    void beforeEach() {
        TestUtils.importImage(ImplUtils.getTestMode(), HELLO_WORLD_REPOSITORY_NAME, Arrays.asList("latest", "v1", "v2", "v3", "v4"));
    }

    @AfterEach
    void afterEach() {
        if (getTestMode() == TestMode.PLAYBACK) {
            return;
        }

        if (contentProperties == null) {
            return;
        }

        client = getContainerRepository(new NettyAsyncHttpClientBuilder().build());
        client.setProperties(defaultRepoWriteableProperties);
    }

    private ContainerRepositoryAsync getContainerRepositoryAsync(HttpClient httpClient) {
        return getContainerRegistryBuilder(httpClient)
            .buildAsyncClient()
            .getRepository(HELLO_WORLD_REPOSITORY_NAME);
    }

    private ContainerRepositoryAsync getUnknownContainerRepositoryAsync(HttpClient httpClient) {
        return getContainerRegistryBuilder(httpClient)
            .buildAsyncClient()
            .getRepository(TAG_UNKNOWN);
    }

    private ContainerRepository getContainerRepository(HttpClient httpClient) {
        return getContainerRegistryBuilder(httpClient)
            .buildClient()
            .getRepository(HELLO_WORLD_REPOSITORY_NAME);
    }

    private ContainerRepository getUnknownContainerRepository(HttpClient httpClient) {
        return getContainerRegistryBuilder(httpClient)
            .buildClient()
            .getRepository(TAG_UNKNOWN);
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getHttpClients")
    public void getPropertiesWithResponse(HttpClient httpClient) {
        asyncClient = getContainerRepositoryAsync(httpClient);
        client = getContainerRepository(httpClient);

        StepVerifier.create(asyncClient.getPropertiesWithResponse())
            .assertNext(res -> {
                validateProperties(res);
            })
            .verifyComplete();

        StepVerifier.create(asyncClient.getProperties())
            .assertNext(res -> {
                validateProperties(res);
            })
            .verifyComplete();

        validateProperties(client.getProperties());
        validateProperties(client.getPropertiesWithResponse(Context.NONE));
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getHttpClients")
    public void getUnknownRepositoryPropertiesWithResponse(HttpClient httpClient) {
        asyncClient = getUnknownContainerRepositoryAsync(httpClient);
        client = getUnknownContainerRepository(httpClient);

        StepVerifier.create(asyncClient.getPropertiesWithResponse())
            .verifyError(ResourceNotFoundException.class);


        StepVerifier.create(asyncClient.getProperties())
            .verifyError(ResourceNotFoundException.class);

        assertThrows(ResourceNotFoundException.class, () -> client.getPropertiesWithResponse(Context.NONE));
        assertThrows(ResourceNotFoundException.class, () -> client.getProperties());
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getHttpClients")
    public void listArtifacts(HttpClient httpClient) {
        asyncClient = getContainerRepositoryAsync(httpClient);
        client = getContainerRepository(httpClient);

        StepVerifier.create(asyncClient.listManifests())
            .recordWith(ArrayList::new)
            .thenConsumeWhile(x -> true)
            .expectRecordedMatches(artifacts -> {
                validateListArtifacts(artifacts);
                return true;
            })
            .verifyComplete();

        validateListArtifacts(client.listManifests().stream().collect(Collectors.toList()));
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getHttpClients")
    public void listArtifactsWithPageSize(HttpClient httpClient) {
        asyncClient = getContainerRepositoryAsync(httpClient);
        client = getContainerRepository(httpClient);

        StepVerifier.create(asyncClient.listManifests().byPage(PAGESIZE_2))
            .recordWith(ArrayList::new)
            .thenConsumeWhile(x -> true)
            .expectRecordedMatches(pagedResList -> validateListArtifactsByPage(pagedResList)).verifyComplete();

        validateListArtifactsByPage(client.listManifests().streamByPage(PAGESIZE_2).collect(Collectors.toList()));
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getHttpClients")
    public void listArtifactsWithInvalidPageSize(HttpClient httpClient) {
        ContainerRepositoryAsync client = getContainerRepositoryAsync(httpClient);
        StepVerifier.create(client.listManifests().byPage(-1)).expectError(IllegalArgumentException.class).verify();
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getHttpClients")
    public void listArtifactsWithPageSizeAndOrderBy(HttpClient httpClient) {
        asyncClient = getContainerRepositoryAsync(httpClient);
        client = getContainerRepository(httpClient);

        StepVerifier.create(asyncClient.listManifests(ManifestOrderBy.LAST_UPDATED_ON_ASCENDING).byPage(PAGESIZE_2))
            .recordWith(ArrayList::new)
            .thenConsumeWhile(x -> true)
            .expectRecordedMatches(pagedResList -> validateListArtifactsByPage(pagedResList, true))
            .verifyComplete();

        validateListArtifactsByPage(
            client.listManifests(ManifestOrderBy.LAST_UPDATED_ON_ASCENDING, Context.NONE).streamByPage(PAGESIZE_2).collect(Collectors.toList()),
            true);
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getHttpClients")
    public void listArtifactsWithPageSizeNoOrderBy(HttpClient httpClient) {
        asyncClient = getContainerRepositoryAsync(httpClient);
        client = getContainerRepository(httpClient);

        StepVerifier.create(asyncClient.listManifests(ManifestOrderBy.NONE).byPage(PAGESIZE_2))
            .recordWith(ArrayList::new)
            .thenConsumeWhile(x -> true)
            .expectRecordedMatches(pagedResList -> validateListArtifactsByPage(pagedResList))
            .verifyComplete();

        validateListArtifactsByPage(client.listManifests(ManifestOrderBy.NONE, Context.NONE).streamByPage(PAGESIZE_2).collect(Collectors.toList()));
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getHttpClients")
    public void setProperties(HttpClient httpClient) {
        asyncClient = getContainerRepositoryAsync(httpClient);
        client = getContainerRepository(httpClient);

        contentProperties = repoWriteableProperties;

        StepVerifier.create(asyncClient.setPropertiesWithResponse(repoWriteableProperties))
            .assertNext(res -> validateRepoContentProperties(res.getValue()))
            .verifyComplete();

        StepVerifier.create(asyncClient.setProperties(repoWriteableProperties))
            .assertNext(res -> validateRepoContentProperties(res))
            .verifyComplete();

        validateRepoContentProperties(client.setProperties(repoWriteableProperties));
        validateRepoContentProperties(client.setPropertiesWithResponse(repoWriteableProperties, Context.NONE).getValue());
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getHttpClients")
    public void convenienceMethods(HttpClient httpClient) {
        asyncClient = getContainerRepositoryAsync(httpClient);
        client = getContainerRepository(httpClient);

        if (getTestMode() != TestMode.PLAYBACK) {
            assertEquals(HELLO_WORLD_REPOSITORY_NAME, asyncClient.getName());
            assertEquals(HELLO_WORLD_REPOSITORY_NAME, client.getName());

            assertTrue(asyncClient.getFullyQualifiedName().startsWith(REGISTRY_NAME));
            assertTrue(asyncClient.getFullyQualifiedName().endsWith(HELLO_WORLD_REPOSITORY_NAME));
            assertTrue(client.getFullyQualifiedName().startsWith(REGISTRY_NAME));
            assertTrue(client.getFullyQualifiedName().endsWith(HELLO_WORLD_REPOSITORY_NAME));

            assertEquals(REGISTRY_ENDPOINT, asyncClient.getRegistryEndpoint());
            assertEquals(REGISTRY_ENDPOINT, client.getRegistryEndpoint());
        }
    }
}
