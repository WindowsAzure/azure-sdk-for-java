// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.data.customization;

import com.azure.search.data.SearchIndexAsyncClient;
import com.azure.search.data.SearchIndexClient;
import com.azure.search.data.common.credentials.ApiKeyCredentials;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SearchIndexClientBuildersTest {
    private ApiKeyCredentials apiKeyCredentials = new ApiKeyCredentials("");
    private String searchServiceName = "";
    private String indexName = "";
    private String apiVersion = "";
    private String dnsSuffix = "";

    /**
     * Builds a Sync Search Index client
     */
    private SearchIndexClientImpl buildClient(String searchServiceName, String indexName, ApiKeyCredentials apiKeyCredentials, String apiVersion, String dnsSuffix) {

        SearchIndexClientBuilder clientBuilder = new SearchIndexClientBuilder();
        SearchIndexClient client = clientBuilder
            .serviceName(searchServiceName)
            .indexName(indexName)
            .credential(apiKeyCredentials)
            .apiVersion(apiVersion)
            .searchDnsSuffix(dnsSuffix)
            .buildClient();

        Assert.assertNotNull(client);
        Assert.assertEquals(client.getClass().getSimpleName(), SearchIndexClientImpl.class.getSimpleName());

        return (SearchIndexClientImpl) client;
    }

    /**
     * Builds a Sync Search Index client
     */
    private SearchIndexClientImpl buildClient(
        String searchServiceName, String indexName, ApiKeyCredentials apiKeyCredentials, String dnsSuffix) {

        SearchIndexClientBuilder clientBuilder = new SearchIndexClientBuilder();
        SearchIndexClient client = clientBuilder
            .serviceName(searchServiceName)
            .indexName(indexName)
            .credential(apiKeyCredentials)
            .searchDnsSuffix(dnsSuffix)
            .buildClient();

        Assert.assertNotNull(client);
        Assert.assertEquals(client.getClass().getSimpleName(), SearchIndexClientImpl.class.getSimpleName());

        return (SearchIndexClientImpl) client;
    }

    /**
     * Builds an Async Search Index client
     */
    private SearchIndexAsyncClientImpl buildAsyncClient(String searchServiceName, String indexName, ApiKeyCredentials apiKeyCredentials, String apiVersion, String dnsSuffix) {

        SearchIndexClientBuilder clientBuilder = new SearchIndexClientBuilder();
        SearchIndexAsyncClient client = clientBuilder
            .serviceName(searchServiceName)
            .indexName(indexName)
            .credential(apiKeyCredentials)
            .apiVersion(apiVersion)
            .searchDnsSuffix(dnsSuffix)
            .buildAsyncClient();

        Assert.assertNotNull(client);
        Assert.assertEquals(client.getClass().getSimpleName(), SearchIndexAsyncClientImpl.class.getSimpleName());

        return (SearchIndexAsyncClientImpl) client;
    }

    /**
     * Builds an Async Search Index client
     */
    private SearchIndexAsyncClientImpl buildAsyncClient(
        String searchServiceName, String indexName, ApiKeyCredentials apiKeyCredentials, String dnsSuffix) {

        SearchIndexClientBuilder clientBuilder = new SearchIndexClientBuilder();
        SearchIndexAsyncClient client = clientBuilder
            .serviceName(searchServiceName)
            .indexName(indexName)
            .credential(apiKeyCredentials)
            .searchDnsSuffix(dnsSuffix)
            .buildAsyncClient();

        Assert.assertNotNull(client);
        Assert.assertEquals(client.getClass().getSimpleName(), SearchIndexAsyncClientImpl.class.getSimpleName());

        return (SearchIndexAsyncClientImpl) client;
    }

    private void buildClientAndVerifyInternal(boolean isAsync) {
        SearchIndexBaseClient client;
        if (isAsync) {
            client = buildClient(searchServiceName, indexName, apiKeyCredentials, apiVersion, dnsSuffix);

        } else {
            client = buildAsyncClient(searchServiceName, indexName, apiKeyCredentials, apiVersion, dnsSuffix);
        }

        assert (client.getIndexName().equals(indexName));
        assert (client.getSearchServiceName().equals(searchServiceName));
        assert (client.getApiVersion().equals(apiVersion));
        assert (client.getSearchDnsSuffix().equals(dnsSuffix));
    }

    /**
     * Verify that if the property is invalid the client builder throws exception
     */
    private void buildClientAndExpectException(boolean isAsync,
                                               String expectedMsg,
                                               String searchServiceName,
                                               String indexName,
                                               ApiKeyCredentials apiKeyCredentials,
                                               String apiVersion,
                                               String dnsSuffix) {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(expectedMsg);

        if (isAsync) {
            buildAsyncClient(searchServiceName, indexName, apiKeyCredentials, apiVersion, dnsSuffix);
        } else {
            buildClient(searchServiceName, indexName, apiKeyCredentials, apiVersion, dnsSuffix);
        }
    }

    @Before
    public void initialize() {
        apiKeyCredentials = new ApiKeyCredentials("0123");
        searchServiceName = "servicename";
        indexName = "myindex";
        apiVersion = "2019-05-06";
        dnsSuffix = "search.windows.net";
    }

    @Test
    public void buildSyncClientTest() {
        buildClient(searchServiceName, indexName, apiKeyCredentials, apiVersion, dnsSuffix);
    }

    @Test
    public void buildSyncClientUsingDefaultApiVersionTest() {
        buildClient(searchServiceName, indexName, apiKeyCredentials, dnsSuffix);
    }

    @Test
    public void buildAsyncClientTest() {
        buildAsyncClient(searchServiceName, indexName, apiKeyCredentials, apiVersion, dnsSuffix);
    }

    @Test
    public void whenApiVersionNotSpecifiedThenDefaultValueExists() {
        SearchIndexClient searchIndexClient = buildClient(searchServiceName, indexName, apiKeyCredentials, dnsSuffix);
        String expectedVersion = "2019-05-06";
        Assert.assertEquals(expectedVersion, searchIndexClient.getApiVersion());

        SearchIndexAsyncClient searchIndexAsyncClient = buildAsyncClient(
            searchServiceName, indexName, apiKeyCredentials, dnsSuffix);
        Assert.assertEquals(expectedVersion, searchIndexAsyncClient.getApiVersion());
    }

    @Test
    public void whenApiVersionSpecifiedThenSpecifiedValueExists() {
        String apiToTest = "abc";
        SearchIndexClient searchIndexClient = buildClient(
            searchServiceName, indexName, apiKeyCredentials, apiToTest, dnsSuffix);
        Assert.assertEquals(apiToTest, searchIndexClient.getApiVersion());

        SearchIndexAsyncClient searchIndexAsyncClient = buildAsyncClient(
            searchServiceName, indexName, apiKeyCredentials, apiToTest, dnsSuffix);
        Assert.assertEquals(apiToTest, searchIndexAsyncClient.getApiVersion());
    }

    @Test
    public void whenBuildAsyncClientUsingDefaultApiVersionThenSuccess() {
        buildAsyncClient(searchServiceName, indexName, apiKeyCredentials, dnsSuffix);
    }

    @Test
    public void whenBuildClientAndVerifyPropertiesThenSuccess() {
        buildClientAndVerifyInternal(false);
        buildClientAndVerifyInternal(true);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();


    @Test
    public void verifyNullSearchServiceNameIsInvalidAsyncTest() {
        buildClientAndExpectException(true, "Invalid searchServiceName", null,
                indexName, apiKeyCredentials, apiVersion, dnsSuffix);
    }

    @Test
    public void verifyNullSearchServiceNameIsInvalidTest() {
        buildClientAndExpectException(false, "Invalid searchServiceName", null,
                indexName, apiKeyCredentials, apiVersion, dnsSuffix);
    }

    @Test
    public void verifyEmptySearchServiceNameIsInvalidAsyncTest() {
        buildClientAndExpectException(false, "Invalid searchServiceName", "",
                indexName, apiKeyCredentials, apiVersion, dnsSuffix);
    }

    @Test
    public void verifyEmptySearchServiceNameIsInvalidTest() {
        buildClientAndExpectException(false, "Invalid searchServiceName", "",
            indexName, apiKeyCredentials, apiVersion, dnsSuffix);
    }

    @Test
    public void verifyNullIndexNameIsInvalidAsyncTest() {
        buildClientAndExpectException(true, "Invalid indexName", searchServiceName,
            null, apiKeyCredentials, apiVersion, dnsSuffix);
    }

    @Test
    public void verifyNullIndexNameIsInvalidTest() {
        buildClientAndExpectException(false, "Invalid indexName", searchServiceName,
                null, apiKeyCredentials, apiVersion, dnsSuffix);
    }

    @Test
    public void verifyEmptyIndexNameIsInvalidAsyncTest() {
        buildClientAndExpectException(true, "Invalid indexName", searchServiceName,
                "", apiKeyCredentials, apiVersion, dnsSuffix);
    }

    @Test
    public void verifyEmptyIndexNameIsInvalidTest() {
        buildClientAndExpectException(false, "Invalid indexName", searchServiceName,
                "", apiKeyCredentials, apiVersion, dnsSuffix);
    }

    @Test
    public void verifyNullApiKeyIsInvalidAsyncTest() {
        buildClientAndExpectException(true, "Empty apiKeyCredentials", searchServiceName,
                indexName, null, apiVersion, dnsSuffix);
    }

    @Test
    public void verifyNullApiKeyIsInvalidTest() {
        buildClientAndExpectException(false, "Empty apiKeyCredentials", searchServiceName,
                indexName, null, apiVersion, dnsSuffix);
    }

    @Test
    public void verifyEmptyApiKeyIsInvalidAsyncTest() {
        buildClientAndExpectException(true, "Empty apiKeyCredentials", searchServiceName,
                indexName, new ApiKeyCredentials(""), apiVersion, dnsSuffix);
    }

    @Test
    public void verifyEmptyApiKeyIsInvalidTest() {
        buildClientAndExpectException(false, "Empty apiKeyCredentials", searchServiceName,
                indexName, new ApiKeyCredentials(""), apiVersion, dnsSuffix);
    }

    @Test
    public void verifyNullApiVersionIsInvalidAsyncTest() {
        buildClientAndExpectException(true, "Invalid apiVersion", searchServiceName,
                indexName, apiKeyCredentials, null, dnsSuffix);
    }

    @Test
    public void verifyNullApiVersionIsInvalidTest() {
        buildClientAndExpectException(false, "Invalid apiVersion", searchServiceName,
                indexName, apiKeyCredentials, null, dnsSuffix);
    }

    @Test
    public void verifyEmptyApiVersionIsInvalidAsyncTest() {
        buildClientAndExpectException(true, "Invalid apiVersion", searchServiceName,
                indexName, apiKeyCredentials, "", dnsSuffix);
    }

    @Test
    public void verifyEmptyApiVersionIsInvalidTest() {
        buildClientAndExpectException(false, "Invalid apiVersion", searchServiceName,
                indexName, apiKeyCredentials, "", dnsSuffix);
    }

    @Test
    public void verifyNullDnsSuffixIsInvalidAsyncTest() {
        buildClientAndExpectException(true, "Invalid searchDnsSuffix", searchServiceName,
                indexName, apiKeyCredentials, apiVersion, null);
    }

    @Test
    public void verifyNullDnsSuffixIsInvalidTest() {
        buildClientAndExpectException(false, "Invalid searchDnsSuffix", searchServiceName,
                indexName, apiKeyCredentials, apiVersion, null);
    }

    @Test
    public void verifyEmptyDnsSuffixIsInvalidAsyncTest() {
        buildClientAndExpectException(true, "Invalid searchDnsSuffix", searchServiceName,
                indexName, apiKeyCredentials, apiVersion, "");
    }

    @Test
    public void verifyEmptyDnsSuffixIsInvalidTest() {
        buildClientAndExpectException(false, "Invalid searchDnsSuffix", searchServiceName,
                indexName, apiKeyCredentials, apiVersion, "");
    }

    /**
     * Verify that there is a default for the dns suffix
     */
    @Test
    public void verifyDefaultDnsSuffixIsCorrectTest() {
        SearchIndexClientBuilder clientBuilder = new SearchIndexClientBuilder();
        SearchIndexAsyncClient client = clientBuilder
            .serviceName(searchServiceName)
            .indexName(indexName)
            .credential(apiKeyCredentials)
            .apiVersion(apiVersion)
            .buildAsyncClient();

        assert (client != null);
        assert (client.getSearchDnsSuffix().equals("search.windows.net"));
    }

    /**
     * Verify that the index name can be changed after the client was already created
     */
    @Test
    public void verifyIndexNameIsChangeableTest() {

        String originalIndexName = "firstOne";
        SearchIndexAsyncClientImpl client = buildAsyncClient(searchServiceName, originalIndexName, apiKeyCredentials, apiVersion, dnsSuffix);
        assert (client.getIndexName().equals(originalIndexName));

        String otherIndexName = "ImTheSecond";
        client.setIndexName(otherIndexName);
        assert (client.getIndexName().equals(otherIndexName));
    }
}
