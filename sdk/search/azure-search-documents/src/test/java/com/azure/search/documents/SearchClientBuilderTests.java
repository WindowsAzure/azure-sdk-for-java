// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents;

import com.azure.core.credential.AzureKeyCredential;
import org.junit.jupiter.api.Test;
import reactor.test.StepVerifier;

import java.net.MalformedURLException;
import java.security.SecureRandom;

import static com.azure.search.documents.SearchServiceClientBuilderTests.request;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SearchClientBuilderTests {
    private final AzureKeyCredential searchApiKeyCredential = new AzureKeyCredential("0123");
    private final String searchEndpoint = "https://test.search.windows.net";
    private final String indexName = "myindex";
    private final SearchServiceVersion apiVersion = SearchServiceVersion.V2019_05_06_Preview;

    @Test
    public void buildSyncClientTest() {
        SearchClient client = new SearchClientBuilder()
            .endpoint(searchEndpoint)
            .credential(searchApiKeyCredential)
            .indexName(indexName)
            .serviceVersion(apiVersion)
            .buildClient();

        assertNotNull(client);
        assertEquals(SearchClient.class.getSimpleName(), client.getClass().getSimpleName());
    }

    @Test
    public void buildSyncClientUsingDefaultApiVersionTest() {
        SearchClient client = new SearchClientBuilder()
            .endpoint(searchEndpoint)
            .credential(searchApiKeyCredential)
            .indexName(indexName)
            .buildClient();

        assertNotNull(client);
        assertEquals(SearchClient.class.getSimpleName(), client.getClass().getSimpleName());
    }

    @Test
    public void buildAsyncClientTest() {
        SearchAsyncClient client = new SearchClientBuilder()
            .endpoint(searchEndpoint)
            .credential(searchApiKeyCredential)
            .indexName(indexName)
            .serviceVersion(apiVersion)
            .buildAsyncClient();

        assertNotNull(client);
        assertEquals(SearchAsyncClient.class.getSimpleName(), client.getClass().getSimpleName());
    }

    @Test
    public void buildAsyncClientUsingDefaultApiVersionTest() {
        SearchAsyncClient client = new SearchClientBuilder()
            .endpoint(searchEndpoint)
            .credential(searchApiKeyCredential)
            .indexName(indexName)
            .buildAsyncClient();

        assertNotNull(client);
        assertEquals(SearchAsyncClient.class.getSimpleName(), client.getClass().getSimpleName());
    }

    @Test
    public void whenApiVersionSpecifiedThenSpecifiedValueExists() {
        SearchServiceVersion expectedVersion = SearchServiceVersion.V2019_05_06_Preview;

        SearchClient searchClient = new SearchClientBuilder()
            .endpoint(searchEndpoint)
            .credential(searchApiKeyCredential)
            .indexName(indexName)
            .serviceVersion(expectedVersion)
            .buildClient();

        assertEquals(expectedVersion, searchClient.getServiceVersion());

        SearchAsyncClient asyncClient = new SearchClientBuilder()
            .endpoint(searchEndpoint)
            .credential(searchApiKeyCredential)
            .indexName(indexName)
            .serviceVersion(expectedVersion)
            .buildAsyncClient();
        assertEquals(expectedVersion, asyncClient.getServiceVersion());
    }

    @Test
    public void whenBuildAsyncClientUsingDefaultApiVersionThenSuccess() {
        SearchClient client = new SearchClientBuilder()
            .endpoint(searchEndpoint)
            .credential(searchApiKeyCredential)
            .indexName(indexName)
            .buildClient();

        assertEquals(apiVersion, client.getServiceVersion());

        SearchAsyncClient asyncClient = new SearchClientBuilder()
            .endpoint(searchEndpoint)
            .credential(searchApiKeyCredential)
            .indexName(indexName)
            .buildAsyncClient();

        assertEquals(apiVersion, asyncClient.getServiceVersion());
    }

    @Test
    public void whenBuildClientAndVerifyPropertiesThenSuccess() {
        SearchClient client = new SearchClientBuilder()
            .endpoint(searchEndpoint)
            .credential(searchApiKeyCredential)
            .indexName(indexName)
            .buildClient();

        assertEquals(searchEndpoint, client.getEndpoint());
        assertEquals(indexName, client.getIndexName());
        assertEquals(apiVersion, client.getServiceVersion());

        SearchAsyncClient asyncClient = new SearchClientBuilder()
            .endpoint(searchEndpoint)
            .credential(searchApiKeyCredential)
            .indexName(indexName)
            .buildAsyncClient();

        assertEquals(searchEndpoint, asyncClient.getEndpoint());
        assertEquals(indexName, asyncClient.getIndexName());
        assertEquals(apiVersion, asyncClient.getServiceVersion());
    }

    @Test
    public void emptyEndpointThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new SearchClientBuilder().endpoint(""));
    }

    @Test
    public void nullIndexNameThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new SearchClientBuilder().indexName(null));
    }

    @Test
    public void emptyIndexNameThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new SearchClientBuilder().indexName(""));
    }

    @Test
    public void nullCredentialThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new SearchClientBuilder().credential(null));
    }

    @Test
    public void credentialWithEmptyApiKeyThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new SearchClientBuilder()
            .credential(new AzureKeyCredential("")));
    }

    @Test
    public void nullApiVersionUsesLatest() {
        SearchClientBuilder builder = new SearchClientBuilder()
            .endpoint(searchEndpoint)
            .credential(searchApiKeyCredential)
            .indexName(indexName)
            .serviceVersion(null);

        assertEquals(SearchServiceVersion.getLatest(), builder.buildAsyncClient().getServiceVersion());
        assertEquals(SearchServiceVersion.getLatest(), builder.buildClient().getServiceVersion());
    }

    @Test
    public void verifyNewBuilderSetsLatestVersion() {
        SearchClient searchClient = new SearchClientBuilder()
            .endpoint(searchEndpoint)
            .credential(searchApiKeyCredential)
            .indexName("indexName")
            .buildClient();

        assertEquals(SearchServiceVersion.getLatest().getVersion(),
            searchClient.getServiceVersion().getVersion());
    }

    @Test
    public void verifyNewBuilderSetsLatestVersionAsync() {
        SearchAsyncClient searchAsyncClient = new SearchClientBuilder()
            .endpoint(searchEndpoint)
            .credential(searchApiKeyCredential)
            .indexName("indexName")
            .buildAsyncClient();

        assertEquals(SearchServiceVersion.getLatest().getVersion(),
            searchAsyncClient.getServiceVersion().getVersion());
    }

    @Test
    public void indexClientFreshDateOnRetry() throws MalformedURLException {
        byte[] randomData = new byte[256];
        new SecureRandom().nextBytes(randomData);
        SearchAsyncClient searchAsyncClient = new SearchClientBuilder()
            .endpoint(searchEndpoint)
            .credential(searchApiKeyCredential)
            .indexName("test_builder")
            .httpClient(new SearchServiceClientBuilderTests.FreshDateTestClient())
            .buildAsyncClient();

        StepVerifier.create(searchAsyncClient.getHttpPipeline().send(
            request(searchAsyncClient.getEndpoint())))
            .assertNext(response -> assertEquals(200, response.getStatusCode()))
            .verifyComplete();
    }
}
