// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.search;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class SearchServiceClientBuilderTests {
    private final SearchApiKeyCredential searchApiKeyCredential = new SearchApiKeyCredential("0123");
    private final String searchEndpoint = "https://test.search.windows.net";
    private final String apiVersion = "2019-05-06";

    @Test
    public void buildSyncClientTest() {
        SearchServiceClient client = new SearchServiceClientBuilder()
            .endpoint(searchEndpoint)
            .credential(searchApiKeyCredential)
            .apiVersion(apiVersion)
            .buildClient();

        Assert.assertNotNull(client);
        Assert.assertEquals(SearchServiceClient.class.getSimpleName(), client.getClass().getSimpleName());
    }

    @Test
    public void buildSyncClientUsingDefaultApiVersionTest() {
        SearchServiceClient client = new SearchServiceClientBuilder()
            .endpoint(searchEndpoint)
            .credential(searchApiKeyCredential)
            .buildClient();

        Assert.assertNotNull(client);
        Assert.assertEquals(SearchServiceClient.class.getSimpleName(), client.getClass().getSimpleName());
    }

    @Test
    public void buildAsyncClientTest() {
        SearchServiceAsyncClient client = new SearchServiceClientBuilder()
            .endpoint(searchEndpoint)
            .credential(searchApiKeyCredential)
            .apiVersion(apiVersion)
            .buildAsyncClient();

        Assert.assertNotNull(client);
        Assert.assertEquals(SearchServiceAsyncClient.class.getSimpleName(), client.getClass().getSimpleName());
    }

    @Test
    public void buildAsyncClientUsingDefaultApiVersionTest() {
        SearchServiceAsyncClient client = new SearchServiceClientBuilder()
            .endpoint(searchEndpoint)
            .credential(searchApiKeyCredential)
            .buildAsyncClient();

        Assert.assertNotNull(client);
        Assert.assertEquals(SearchServiceAsyncClient.class.getSimpleName(), client.getClass().getSimpleName());
    }

    @Test
    public void whenApiVersionNotSpecifiedThenDefaultValueExists() {
        String expectedApiVersion = "2019-05-06";

        SearchServiceClient client = new SearchServiceClientBuilder()
            .endpoint(searchEndpoint)
            .credential(searchApiKeyCredential)
            .buildClient();

        Assert.assertEquals(expectedApiVersion, client.getApiVersion());

        SearchServiceAsyncClient asyncClient = new SearchServiceClientBuilder()
            .endpoint(searchEndpoint)
            .credential(searchApiKeyCredential)
            .buildAsyncClient();
        Assert.assertEquals(expectedApiVersion, asyncClient.getApiVersion());
    }

    @Test
    public void whenApiVersionSpecifiedThenSpecifiedValueExists() {
        String expectedApiVersion = "abc";

        SearchServiceClient client = new SearchServiceClientBuilder()
            .endpoint(searchEndpoint)
            .credential(searchApiKeyCredential)
            .apiVersion(expectedApiVersion)
            .buildClient();

        Assert.assertEquals(expectedApiVersion, client.getApiVersion());

        SearchServiceAsyncClient asyncClient = new SearchServiceClientBuilder()
            .endpoint(searchEndpoint)
            .credential(searchApiKeyCredential)
            .apiVersion(expectedApiVersion)
            .buildAsyncClient();
        Assert.assertEquals(expectedApiVersion, asyncClient.getApiVersion());
    }

    @Test
    public void whenBuildClientAndVerifyPropertiesThenSuccess() {
        SearchServiceClient client = new SearchServiceClientBuilder()
            .endpoint(searchEndpoint)
            .credential(searchApiKeyCredential)
            .buildClient();

        Assert.assertEquals(searchEndpoint, client.getEndpoint());
        Assert.assertEquals(apiVersion, client.getApiVersion());

        SearchServiceAsyncClient asyncClient = new SearchServiceClientBuilder()
            .endpoint(searchEndpoint)
            .credential(searchApiKeyCredential)
            .apiVersion(apiVersion)
            .buildAsyncClient();

        Assert.assertEquals(searchEndpoint, asyncClient.getEndpoint());
        Assert.assertEquals(apiVersion, asyncClient.getApiVersion());
    }

    @Test
    public void verifyEmptyEndpointIsInvalidAsyncTest() {
        expectThrowsWithMessage("Illegal endpoint URL", () -> new SearchServiceClientBuilder()
            .endpoint("")
            .credential(searchApiKeyCredential)
            .apiVersion(apiVersion)
            .buildAsyncClient());
    }

    @Test
    public void verifyEmptyEndpointIsInvalidTest() {
        expectThrowsWithMessage("Illegal endpoint URL", () -> new SearchServiceClientBuilder()
            .endpoint("")
            .credential(searchApiKeyCredential)
            .apiVersion(apiVersion)
            .buildClient());
    }

    @Test
    public void verifyNullApiKeyIsInvalidAsyncTest() {
        expectThrowsWithMessage("Empty apiKeyCredentials", () -> new SearchServiceClientBuilder()
            .endpoint(searchEndpoint)
            .credential(null)
            .apiVersion(apiVersion)
            .buildAsyncClient());
    }

    @Test
    public void verifyNullApiKeyIsInvalidTest() {
        expectThrowsWithMessage("Empty apiKeyCredentials", () -> new SearchServiceClientBuilder()
            .endpoint(searchEndpoint)
            .credential(null)
            .apiVersion(apiVersion)
            .buildClient());
    }

    @Test
    public void verifyEmptyApiKeyIsInvalidAsyncTest() {
        expectThrowsWithMessage("Empty apiKeyCredentials", () -> new SearchServiceClientBuilder()
            .endpoint(searchEndpoint)
            .credential(new SearchApiKeyCredential(""))
            .apiVersion(apiVersion)
            .buildAsyncClient());
    }

    @Test
    public void verifyEmptyApiKeyIsInvalidTest() {
        expectThrowsWithMessage("Empty apiKeyCredentials", () -> new SearchServiceClientBuilder()
            .endpoint(searchEndpoint)
            .credential(new SearchApiKeyCredential(""))
            .apiVersion(apiVersion)
            .buildClient());
    }

    @Test
    public void verifyNullApiVersionIsInvalidAsyncTest() {
        expectThrowsWithMessage("Invalid apiVersion", () -> new SearchServiceClientBuilder()
            .endpoint(searchEndpoint)
            .credential(searchApiKeyCredential)
            .apiVersion(null)
            .buildAsyncClient());
    }

    @Test
    public void verifyNullApiVersionIsInvalidTest() {
        expectThrowsWithMessage("Invalid apiVersion", () -> new SearchServiceClientBuilder()
            .endpoint(searchEndpoint)
            .credential(searchApiKeyCredential)
            .apiVersion(null)
            .buildClient());
    }

    @Test
    public void verifyEmptyApiVersionIsInvalidAsyncTest() {
        expectThrowsWithMessage("Invalid apiVersion", () -> new SearchServiceClientBuilder()
            .endpoint(searchEndpoint)
            .credential(searchApiKeyCredential)
            .apiVersion("")
            .buildAsyncClient());
    }

    @Test
    public void verifyEmptyApiVersionIsInvalidTest() {
        expectThrowsWithMessage("Invalid apiVersion", () -> new SearchServiceClientBuilder()
            .endpoint(searchEndpoint)
            .credential(searchApiKeyCredential)
            .apiVersion("")
            .buildClient());
    }

    private void expectThrowsWithMessage(String expectedMessage, Runnable runnable) {
        try {
            runnable.run();
            Assert.fail();

        } catch (Exception e) {
            Assert.assertEquals(IllegalArgumentException.class, e.getClass());
            Assert.assertTrue(e.getMessage().contains(expectedMessage));
        }
    }
}
