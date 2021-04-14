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
import java.util.stream.Stream;

import static com.azure.containers.containerregistry.TestUtils.ALPINE_REPOSITORY_NAME;
import static com.azure.containers.containerregistry.TestUtils.DISPLAY_NAME_WITH_ARGUMENTS;
import static com.azure.containers.containerregistry.TestUtils.HELLO_WORLD_REPOSITORY_NAME;
import static com.azure.containers.containerregistry.TestUtils.PAGESIZE_2;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContainerRegistryClientAsyncTest extends ContainerRegistryClientsTestBase {

    private ContainerRegistryAsyncClient client;

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

    private ContainerRegistryAsyncClient getContainerRegistryAsyncClient(HttpClient httpClient) {
        return getContainerRegistryBuilder(httpClient).buildAsyncClient();
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getHttpClients")
    public void listRepositories(HttpClient httpClient) {
        client = getContainerRegistryAsyncClient(httpClient);

        StepVerifier.create(client.listRepositories())
            .recordWith(ArrayList::new)
            .thenConsumeWhile(x -> true)
            .expectRecordedMatches(repositories -> repositories.containsAll(Arrays.asList(TestUtils.HELLO_WORLD_REPOSITORY_NAME, TestUtils.ALPINE_REPOSITORY_NAME)))
            .verifyComplete();
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getHttpClients")
    public void listRepositoriesWithPageSize(HttpClient httpClient) {
        client = getContainerRegistryAsyncClient(httpClient);

        StepVerifier.create(client.listRepositories().byPage(PAGESIZE_2))
            .assertNext(res -> {
                List<String> repositories = res.getValue();
                assertTrue(repositories.size() <= PAGESIZE_2);

                Stream<String> repoStream = repositories.stream();
                assertTrue(repoStream.filter(a -> TestUtils.ALPINE_REPOSITORY_NAME.equals(a)).findAny().isPresent());
                assertNotNull(res.getContinuationToken());
            }).expectComplete();

        // Not testing for complete since there are others as well.
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getHttpClients")
    public void listRepositoriesWithInvalidPageSize(HttpClient httpClient) {
        client = getContainerRegistryAsyncClient(httpClient);

        StepVerifier.create(client.listRepositories().byPage(-1))
            .expectErrorMatches(res -> res instanceof IllegalArgumentException)
            .verify();
    }

    // What is the prescribed way of running delete test scenarios.
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getHttpClients")
    public void deleteRepositoriesThrows(HttpClient httpClient) {
        client = getContainerRegistryAsyncClient(httpClient);

        StepVerifier.create(client.deleteRepository("missingRepo"))
            .expectErrorMatches(exception -> {
                return exception instanceof ResourceNotFoundException;
            }).verify();

        StepVerifier.create(client.deleteRepository(null))
            .expectErrorMatches(exception -> {
                return exception instanceof NullPointerException;
            }).verify();
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getHttpClients")
    public void getContainerRepositoryClient(HttpClient httpClient) {
        client = getContainerRegistryAsyncClient(httpClient);

        ContainerRepositoryAsyncClient repositoryAsyncClient = client.getRepositoryClient(HELLO_WORLD_REPOSITORY_NAME);
        assertNotNull(repositoryAsyncClient);
        StepVerifier.create(repositoryAsyncClient.getProperties())
            .assertNext(res -> validateProperties(res))
            .verifyComplete();
    }
}
