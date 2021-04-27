// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry;

import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.HttpClient;
import com.azure.core.test.implementation.ImplUtils;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import reactor.test.StepVerifier;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.azure.containers.containerregistry.TestUtils.ALPINE_REPOSITORY_NAME;
import static com.azure.containers.containerregistry.TestUtils.DISPLAY_NAME_WITH_ARGUMENTS;
import static com.azure.containers.containerregistry.TestUtils.HELLO_WORLD_REPOSITORY_NAME;
import static com.azure.containers.containerregistry.TestUtils.PAGESIZE_2;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ContainerRegistryClientAsyncIntegrationTests extends ContainerRegistryClientsTestBase {

    private ContainerRegistryAsyncClient registryClient;
    private ContainerRepositoryAsyncClient repositoryClient;

    private ContainerRegistryAsyncClient getContainerRegistryAsyncClient(HttpClient httpClient) {
        return getContainerRegistryBuilder(httpClient).buildAsyncClient();
    }

    @BeforeAll
    static void beforeAll() {
        StepVerifier.setDefaultTimeout(Duration.ofMinutes(30));
        TestUtils.importImage(ImplUtils.getTestMode(), HELLO_WORLD_REPOSITORY_NAME, Arrays.asList("latest", "v1", "v2", "v3", "v4"));
        TestUtils.importImage(ImplUtils.getTestMode(), ALPINE_REPOSITORY_NAME, Arrays.asList("latest"));
    }

    @AfterAll
    static void afterAll() {
        StepVerifier.resetDefaultTimeout();
    }


    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getHttpClients")
    public void listRepositories(HttpClient httpClient) {
        registryClient = getContainerRegistryAsyncClient(httpClient);

        StepVerifier.create(registryClient.listRepositories())
            .recordWith(ArrayList::new)
            .thenConsumeWhile(x -> true)
            .expectRecordedMatches(repositories -> repositories.containsAll(Arrays.asList(TestUtils.HELLO_WORLD_REPOSITORY_NAME, TestUtils.ALPINE_REPOSITORY_NAME)))
            .verifyComplete();
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getHttpClients")
    public void listRepositoriesWithPageSize(HttpClient httpClient) {
        registryClient = getContainerRegistryAsyncClient(httpClient);

        StepVerifier.create(registryClient.listRepositories().byPage(PAGESIZE_2))
            .recordWith(ArrayList::new)
            .thenConsumeWhile(x -> true)
            .expectRecordedMatches(pagedResList -> {
                List<String> props = new ArrayList<>();
                pagedResList.forEach(res -> res.getValue().forEach(prop -> props.add(prop)));

                props.containsAll(Arrays.asList(TestUtils.HELLO_WORLD_REPOSITORY_NAME, TestUtils.ALPINE_REPOSITORY_NAME));
                return pagedResList.stream().allMatch(res -> res.getValue().size() <= PAGESIZE_2);
            }).verifyComplete();

    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getHttpClients")
    public void deleteRepositoryWithResponseThrows(HttpClient httpClient) {
        registryClient = getContainerRegistryAsyncClient(httpClient);

        StepVerifier.create(registryClient.deleteRepositoryWithResponse("missingRepo"))
            .expectErrorMatches(exception -> {
                return exception instanceof ResourceNotFoundException;
            }).verify();

        StepVerifier.create(registryClient.deleteRepositoryWithResponse(null))
            .expectErrorMatches(exception -> {
                return exception instanceof NullPointerException;
            }).verify();
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getHttpClients")
    public void getContainerRepositoryClient(HttpClient httpClient) {
        registryClient = getContainerRegistryAsyncClient(httpClient);

        repositoryClient = registryClient.getRepositoryClient(HELLO_WORLD_REPOSITORY_NAME);
        assertNotNull(repositoryClient);
        StepVerifier.create(repositoryClient.getProperties())
            .assertNext(res -> validateProperties(res))
            .verifyComplete();
    }
}

