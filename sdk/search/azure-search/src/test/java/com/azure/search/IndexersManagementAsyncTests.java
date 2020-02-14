// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.search;

import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.Response;
import com.azure.core.util.FluxUtil;
import com.azure.search.models.AccessCondition;
import com.azure.search.models.DataSource;
import com.azure.search.models.Index;
import com.azure.search.models.Indexer;
import com.azure.search.models.IndexerExecutionStatus;
import com.azure.search.models.IndexerStatus;
import com.azure.search.models.IndexingParameters;
import com.azure.search.models.RequestOptions;
import com.azure.search.models.Skillset;
import com.azure.search.test.AccessConditionAsyncTests;
import com.azure.search.test.AccessOptions;
import io.netty.handler.codec.http.HttpResponseStatus;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class IndexersManagementAsyncTests extends IndexersManagementTestBase {
    private SearchServiceAsyncClient client;

    // commonly used lambda definitions
    private BiFunction<Indexer, AccessOptions, Mono<Indexer>> createOrUpdateIndexerAsyncFunc =
        (Indexer indexer, AccessOptions ac) ->
            createOrUpdateIndexer(indexer, ac.getAccessCondition(), ac.getRequestOptions());

    private Supplier<Indexer> newIndexerFunc =
        () -> createBaseTestIndexerObject("name", TARGET_INDEX_NAME).setDataSourceName(SQL_DATASOURCE_NAME);

    private Function<Indexer, Indexer> mutateIndexerFunc =
        (Indexer indexer) -> indexer.setDescription("ABrandNewDescription");

    private BiFunction<String, AccessOptions, Mono<Void>> deleteIndexerAsyncFunc =
        (String name, AccessOptions ac) -> deleteIndexer(name, ac.getAccessCondition(), ac.getRequestOptions());

    private Mono<Indexer> createOrUpdateIndexer(Indexer indexer, AccessCondition accessCondition,
        RequestOptions requestOptions) {
        return client.createOrUpdateIndexerWithResponse(indexer, accessCondition, requestOptions)
            .map(Response::getValue);
    }

    private Mono<Void> deleteIndexer(String indexerName,
        AccessCondition accessCondition,
        RequestOptions requestOptions) {
        return client.deleteIndexerWithResponse(indexerName, accessCondition, requestOptions).flatMap(FluxUtil::toMono);
    }

    private void createDataSourceAndIndex(String dataSourceName, String indexName) {
        // Create DataSource
        DataSource dataSource = createTestSqlDataSourceObject(dataSourceName);
        client.createOrUpdateDataSource(dataSource).block();

        // Create an index
        Index index = createTestIndexForLiveDatasource(indexName);
        client.createIndex(index).block();
    }

    private List<Indexer> prepareIndexersForCreateAndListIndexers() {
        // Create DataSource and Index
        createDataSourceAndIndex(SQL_DATASOURCE_NAME, TARGET_INDEX_NAME);

        // Create two indexers
        Indexer indexer1 = createBaseTestIndexerObject("indexer1", TARGET_INDEX_NAME)
            .setDataSourceName(SQL_DATASOURCE_NAME);
        Indexer indexer2 = createBaseTestIndexerObject("indexer2", TARGET_INDEX_NAME)
            .setDataSourceName(SQL_DATASOURCE_NAME);
        client.createIndexer(indexer1).block();
        client.createIndexer(indexer2).block();

        return Arrays.asList(indexer1, indexer2);
    }

    private Indexer createTestDataSourceAndIndexer() {
        // Create DataSource and Index
        createDataSourceAndIndex(SQL_DATASOURCE_NAME, TARGET_INDEX_NAME);

        // Create the indexer object
        Indexer indexer = createBaseTestIndexerObject("indexer", TARGET_INDEX_NAME)
            .setDataSourceName(SQL_DATASOURCE_NAME);

        client.createIndexer(indexer).block();

        return indexer;
    }

    /**
     * Creates the index and indexer in the search service and then update the indexer
     *
     * @param updatedIndexer the indexer to be updated
     * @param dataSourceName the data source name for this indexer
     */
    private void createUpdateAndValidateIndexer(Indexer updatedIndexer, String dataSourceName) {
        updatedIndexer.setDataSourceName(dataSourceName);

        // Create an index
        Index index = createTestIndexForLiveDatasource(TARGET_INDEX_NAME);
        client.createIndex(index).block();

        Indexer initial =
            createBaseTestIndexerObject("indexer", TARGET_INDEX_NAME)
                .setDataSourceName(dataSourceName)
                .setIsDisabled(true);

        // create this indexer in the service
        client.createIndexer(initial).block();

        // update the indexer in the service
        Indexer indexerResponse = client.createOrUpdateIndexer(updatedIndexer).block();

        // verify the returned updated indexer is as expected
        assert indexerResponse != null;
        setSameStartTime(updatedIndexer, indexerResponse);
        assertIndexersEqual(updatedIndexer, indexerResponse);
    }

    /**
     * Creates the index and indexer in the search service and then retrieves the indexer and validates it
     *
     * @param indexer the indexer to be created
     */
    private void createAndValidateIndexer(Indexer indexer) {
        // Create an index
        Index index = createTestIndexForLiveDatasource(TARGET_INDEX_NAME);
        client.createIndex(index).block();

        // create this indexer in the service
        Indexer indexerResponse = client.createIndexer(indexer).block();

        // verify the returned updated indexer is as expected
        assert indexerResponse != null;
        setSameStartTime(indexer, indexerResponse);
        assertIndexersEqual(indexer, indexerResponse);
    }

    @Override
    protected void beforeTest() {
        super.beforeTest();
        client = getSearchServiceClientBuilder().buildAsyncClient();
    }

    @Test
    public void canResetIndexerAndGetIndexerStatus() {
        Indexer indexer = createTestDataSourceAndIndexer();

        StepVerifier.create(client.resetIndexer(indexer.getName())
            .then(client.getIndexerStatus(indexer.getName())))
            .assertNext(indexerStatus -> {
                Assert.assertEquals(IndexerStatus.RUNNING, indexerStatus.getStatus());
                Assert.assertEquals(IndexerExecutionStatus.RESET, indexerStatus.getLastResult().getStatus());
            })
            .verifyComplete();
    }

    @Test
    public void canResetIndexerAndGetIndexerStatusWithResponse() {
        Indexer indexer = createTestDataSourceAndIndexer();

        StepVerifier.create(client.resetIndexerWithResponse(indexer.getName(), generateRequestOptions())
            .then(client.getIndexerStatusWithResponse(indexer.getName(), generateRequestOptions())))
            .assertNext(indexerStatus -> {
                Assert.assertEquals(IndexerStatus.RUNNING, indexerStatus.getValue().getStatus());
                Assert.assertEquals(IndexerExecutionStatus.RESET, indexerStatus.getValue().getLastResult().getStatus());
            })
            .verifyComplete();
    }

    @Test
    public void createIndexerReturnsCorrectDefinition() {
        Indexer expectedIndexer =
            createBaseTestIndexerObject("indexer", TARGET_INDEX_NAME)
                .setIsDisabled(true)
                .setDataSourceName(SQL_DATASOURCE_NAME)
                .setParameters(
                    new IndexingParameters()
                        .setBatchSize(50)
                        .setMaxFailedItems(10)
                        .setMaxFailedItemsPerBatch(10));

        Indexer actualIndexer = client.createIndexer(expectedIndexer).block();
        assert actualIndexer != null;

        IndexingParameters ip = new IndexingParameters();
        Map<String, Object> config = new HashMap<>();
        ip.setConfiguration(config);
        expectedIndexer.setParameters(ip); // Get returns empty dictionary.
        setSameStartTime(expectedIndexer, actualIndexer);

        assertIndexersEqual(expectedIndexer, actualIndexer);
    }

    public void canCreateAndListIndexers() {
        List<Indexer> indexers = prepareIndexersForCreateAndListIndexers();

        PagedFlux<Indexer> returnedIndexersList = client.listIndexers();
        StepVerifier
            .create(returnedIndexersList.collectList())
            .assertNext(indexersRes -> {
                Assert.assertEquals(2, indexersRes.size());
                assertIndexersEqual(indexers.get(0), indexersRes.get(0));
                assertIndexersEqual(indexers.get(1), indexersRes.get(1));
            })
            .verifyComplete();
    }

    @Test
    public void canCreateAndListIndexerNames() {
        List<Indexer> indexers = prepareIndexersForCreateAndListIndexers();

        PagedFlux<Indexer> returnedIndexersList = client.listIndexers("name", generateRequestOptions());
        StepVerifier
            .create(returnedIndexersList.collectList())
            .assertNext(indexersRes -> {
                Assert.assertEquals(2, indexersRes.size());
                Assert.assertEquals(indexers.get(0).getName(), indexersRes.get(0).getName());
                Assert.assertEquals(indexers.get(1).getName(), indexersRes.get(1).getName());

                // Assert all other fields than "name" are null:
                assertAllIndexerFieldsNullExceptName(indexersRes.get(0));
                assertAllIndexerFieldsNullExceptName(indexersRes.get(1));
            })
            .verifyComplete();
    }

    @Test
    public void createIndexerFailsWithUsefulMessageOnUserError() {
        Indexer indexer = createBaseTestIndexerObject("indexer", TARGET_INDEX_NAME)
            .setDataSourceName("thisdatasourcedoesnotexist");

        assertHttpResponseExceptionAsync(
            client.createIndexer(indexer),
            HttpResponseStatus.BAD_REQUEST,
            "This indexer refers to a data source 'thisdatasourcedoesnotexist' that doesn't exist"
        );
    }

    @Test
    public void canRunIndexer() {
        Indexer indexer = createTestDataSourceAndIndexer();
        client.runIndexer(indexer.getName());

        StepVerifier.create(client.getIndexerStatus(indexer.getName()))
            .assertNext(indexerExecutionInfo -> Assert.assertEquals(
                IndexerStatus.RUNNING, indexerExecutionInfo.getStatus()))
            .verifyComplete();
    }

    @Test
    public void canRunIndexerWithResponse() {
        Indexer indexer = createTestDataSourceAndIndexer();

        StepVerifier.create(client.runIndexerWithResponse(indexer.getName(), generateRequestOptions()))
            .assertNext(response -> Assert.assertEquals(HttpURLConnection.HTTP_ACCEPTED, response.getStatusCode()))
            .verifyComplete();

        StepVerifier.create(client.getIndexerStatus(indexer.getName()))
            .assertNext(indexerExecutionInfo -> Assert.assertEquals(IndexerStatus.RUNNING, indexerExecutionInfo.getStatus()))
            .verifyComplete();
    }

    @Test
    public void canRunIndexerAndGetIndexerStatus() {
        // When an indexer is created, the execution info may not be available immediately. Hence, a
        // pipeline policy that injects a "mock_status" query string is added to the client, which results in service
        // returning a well-known mock response
        client = getSearchServiceClientBuilderWithHttpPipelinePolicies(
            Collections.singletonList(MOCK_STATUS_PIPELINE_POLICY))
            .buildAsyncClient();

        createDataSourceAndIndex(SQL_DATASOURCE_NAME, TARGET_INDEX_NAME);

        Indexer indexer = createBaseTestIndexerObject("indexer", TARGET_INDEX_NAME)
            .setDataSourceName(SQL_DATASOURCE_NAME);

        StepVerifier.create(client.createIndexer(indexer)
            .then(client.getIndexerStatus(indexer.getName())))
            .assertNext(indexerExecutionInfo -> Assert.assertEquals(IndexerStatus.RUNNING, indexerExecutionInfo.getStatus()));

        client.runIndexerWithResponse(indexer.getName(), new RequestOptions())
            .subscribe(indexerRunResponse ->
                Assert.assertEquals(HttpResponseStatus.ACCEPTED.code(), indexerRunResponse.getStatusCode()));

        StepVerifier
            .create(client.getIndexerStatus(indexer.getName()))
            .assertNext(indexerExecutionInfo -> assertValidIndexerExecutionInfo(indexerExecutionInfo));

    }

    @Test
    public void createOrUpdateIndexerIfNotExistsFailsOnExistingResource() {
        // Prepare data source and index
        AccessConditionAsyncTests act = new AccessConditionAsyncTests();

        createDataSourceAndIndex(SQL_DATASOURCE_NAME, TARGET_INDEX_NAME);

        act.createOrUpdateIfNotExistsFailsOnExistingResourceAsync(
            createOrUpdateIndexerAsyncFunc,
            newIndexerFunc,
            mutateIndexerFunc);
    }

    @Test
    public void canUpdateIndexer() {
        DataSource dataSource = createTestSqlDataSourceObject(SQL_DATASOURCE_NAME);
        client.createOrUpdateDataSource((dataSource)).block();

        Indexer updatedExpected = createIndexerWithDifferentDescription();

        createUpdateAndValidateIndexer(updatedExpected, SQL_DATASOURCE_NAME);
    }

    @Test
    public void canUpdateIndexerFieldMapping() {
        DataSource dataSource = createTestSqlDataSourceObject(SQL_DATASOURCE_NAME);
        client.createOrUpdateDataSource((dataSource)).block();

        Indexer updatedExpected = createIndexerWithDifferentFieldMapping();

        createUpdateAndValidateIndexer(updatedExpected, SQL_DATASOURCE_NAME);
    }

    @Test
    public void canCreateIndexerWithFieldMapping() {
        DataSource dataSource = createTestSqlDataSourceObject(SQL_DATASOURCE_NAME);
        client.createOrUpdateDataSource((dataSource)).block();

        Indexer indexer = createIndexerWithDifferentFieldMapping()
            .setDataSourceName(SQL_DATASOURCE_NAME);

        createAndValidateIndexer(indexer);
    }

    @Test
    public void canUpdateIndexerDisabled() {
        DataSource dataSource = createTestSqlDataSourceObject(SQL_DATASOURCE_NAME);
        client.createOrUpdateDataSource((dataSource)).block();

        Indexer updatedExpected = createDisabledIndexer();

        createUpdateAndValidateIndexer(updatedExpected, SQL_DATASOURCE_NAME);
    }

    @Test
    public void canUpdateIndexerSchedule() {
        DataSource dataSource = createTestSqlDataSourceObject(SQL_DATASOURCE_NAME);
        client.createOrUpdateDataSource((dataSource)).block();

        Indexer updatedExpected = createIndexerWithDifferentSchedule();

        createUpdateAndValidateIndexer(updatedExpected, SQL_DATASOURCE_NAME);
    }

    @Test
    public void canCreateIndexerWithSchedule() {
        DataSource dataSource = createTestSqlDataSourceObject(SQL_DATASOURCE_NAME);
        client.createOrUpdateDataSource((dataSource)).block();

        Indexer indexer = createIndexerWithDifferentSchedule()
            .setDataSourceName(SQL_DATASOURCE_NAME);

        createAndValidateIndexer(indexer);
    }

    @Test
    public void canUpdateIndexerBatchSizeMaxFailedItems() {
        DataSource dataSource = createTestSqlDataSourceObject(SQL_DATASOURCE_NAME);
        client.createOrUpdateDataSource((dataSource)).block();

        Indexer indexer = createBaseTestIndexerObject("indexer", TARGET_INDEX_NAME);

        Indexer updatedExpected = createIndexerWithDifferentIndexingParameters(indexer);

        createUpdateAndValidateIndexer(updatedExpected, SQL_DATASOURCE_NAME);
    }

    @Test
    public void canCreateIndexerWithBatchSizeMaxFailedItems() {
        DataSource dataSource = createTestSqlDataSourceObject(SQL_DATASOURCE_NAME);
        client.createOrUpdateDataSource((dataSource)).block();

        Indexer indexer = createBaseTestIndexerObject("indexer", TARGET_INDEX_NAME);
        Indexer updatedExpected = createIndexerWithDifferentIndexingParameters(indexer)
            .setDataSourceName(SQL_DATASOURCE_NAME);

        createAndValidateIndexer(updatedExpected);
    }

    // This test currently does not pass on our Dogfood account, as the
    // Storage resource provider is not returning an answer.
    @Test
    public void canUpdateIndexerBlobParams() {
        // Create the needed Azure blob resources and data source object
        DataSource blobDataSource = createBlobDataSource();

        // Create the data source within the search service
        client.createOrUpdateDataSource((blobDataSource)).block();

        // modify the indexer's blob params
        Indexer updatedExpected = createIndexerWithStorageConfig();

        createUpdateAndValidateIndexer(updatedExpected, BLOB_DATASOURCE_NAME);
    }

    // This test currently does not pass on our Dogfood account, as the
    // Storage resource provider is not returning an answer.
    @Test
    public void canCreateIndexerWithBlobParams() {
        // Create the needed Azure blob resources and data source object
        DataSource blobDataSource = createBlobDataSource();

        // Create the data source within the search service
        DataSource dataSource = client.createOrUpdateDataSource((blobDataSource)).block();

        // modify the indexer's blob params
        Indexer indexer = createIndexerWithStorageConfig()
            .setDataSourceName(dataSource.getName());

        createAndValidateIndexer(indexer);
    }

    @Test
    public void canCreateAndDeleteIndexer() {
        createDataSourceAndIndex(SQL_DATASOURCE_NAME, TARGET_INDEX_NAME);
        Indexer indexer = createBaseTestIndexerObject("indexer", TARGET_INDEX_NAME);
        indexer.setDataSourceName(SQL_DATASOURCE_NAME);
        client.createIndexer(indexer).block();

        client.deleteIndexer(indexer.getName()).block();
        StepVerifier
            .create(client.indexerExists(indexer.getName()))
            .assertNext(Assert::assertFalse)
            .verifyComplete();
    }

    @Test
    public void canCreateAndDeleteIndexerWithResponse() {
        createDataSourceAndIndex(SQL_DATASOURCE_NAME, TARGET_INDEX_NAME);
        Indexer indexer = createBaseTestIndexerObject("indexer", TARGET_INDEX_NAME);
        indexer.setDataSourceName(SQL_DATASOURCE_NAME);
        client.createIndexer(indexer).block();

        client.deleteIndexerWithResponse(indexer.getName(), new AccessCondition(), new RequestOptions()).block();
        StepVerifier
            .create(client.indexerExistsWithResponse(indexer.getName(), new RequestOptions()))
            .assertNext(res -> Assert.assertFalse(res.getValue()))
            .verifyComplete();
    }

    @Test
    public void deleteIndexerIsIdempotent() {
        // Create Datasource
        createDataSourceAndIndex(SQL_DATASOURCE_NAME, TARGET_INDEX_NAME);

        // Create the indexer object
        Indexer indexer = createBaseTestIndexerObject("indexer", TARGET_INDEX_NAME);
        indexer.setDataSourceName(SQL_DATASOURCE_NAME);

        // Try delete before the indexer even exists.
        Response<Void> result = client.deleteIndexerWithResponse(
            indexer.getName(), new AccessCondition(), generateRequestOptions())
            .block();

        assert result != null;
        Assert.assertEquals(HttpURLConnection.HTTP_NOT_FOUND, result.getStatusCode());

        // Actually create the indexer
        client.createIndexer(indexer).block();

        // Now delete twice.
        result = client.deleteIndexerWithResponse(indexer.getName(), new AccessCondition(), generateRequestOptions())
            .block();
        assert result != null;
        Assert.assertEquals(HttpURLConnection.HTTP_NO_CONTENT, result.getStatusCode());

        result = client.deleteIndexerWithResponse(indexer.getName(), new AccessCondition(), generateRequestOptions())
            .block();
        assert result != null;
        Assert.assertEquals(HttpURLConnection.HTTP_NOT_FOUND, result.getStatusCode());
    }

    @Test
    public void canCreateAndGetIndexer() {
        String indexerName = "indexer";

        DataSource dataSource = createTestSqlDataSourceObject(SQL_DATASOURCE_NAME);
        client.createOrUpdateDataSource((dataSource)).block();

        Index index = createTestIndexForLiveDatasource(TARGET_INDEX_NAME);
        client.createIndex(index).block();

        Indexer indexer =
            createBaseTestIndexerObject(indexerName, TARGET_INDEX_NAME).setDataSourceName(dataSource.getName());

        client.createIndexer(indexer).block();
        Indexer indexerResult = client.getIndexer(indexerName).block();
        assertIndexersEqual(indexer, indexerResult);

        indexerResult = client.getIndexerWithResponse(indexerName, generateRequestOptions())
            .block().getValue();
        assertIndexersEqual(indexer, indexerResult);
    }

    @Test
    public void getIndexerThrowsOnNotFound() {
        assertHttpResponseExceptionAsync(
            client.getIndexer("thisindexerdoesnotexist"),
            HttpResponseStatus.NOT_FOUND,
            "Indexer 'thisindexerdoesnotexist' was not found"
        );
    }

    @Test
    public void createOrUpdateIndexerIfNotExistsSucceedsOnNoResource() {
        AccessConditionAsyncTests act = new AccessConditionAsyncTests();

        // Prepare data source and index
        createDataSourceAndIndex(SQL_DATASOURCE_NAME, TARGET_INDEX_NAME);

        act.createOrUpdateIfNotExistsSucceedsOnNoResourceAsync(
            createOrUpdateIndexerAsyncFunc,
            newIndexerFunc);
    }

    @Test
    public void deleteIndexerIfExistsWorksOnlyWhenResourceExists() {
        AccessConditionAsyncTests act = new AccessConditionAsyncTests();

        // Prepare data source and index
        createDataSourceAndIndex(SQL_DATASOURCE_NAME, TARGET_INDEX_NAME);

        String indexerName = "name";
        act.deleteIfExistsWorksOnlyWhenResourceExistsAsync(
            deleteIndexerAsyncFunc,
            createOrUpdateIndexerAsyncFunc,
            newIndexerFunc,
            indexerName);
    }

    @Test
    public void deleteIndexerIfNotChangedWorksOnlyOnCurrentResource() {
        AccessConditionAsyncTests act = new AccessConditionAsyncTests();

        // Prepare data source and index
        createDataSourceAndIndex(SQL_DATASOURCE_NAME, TARGET_INDEX_NAME);

        String indexerName = "name";
        act.deleteIfNotChangedWorksOnlyOnCurrentResourceAsync(
            deleteIndexerAsyncFunc,
            newIndexerFunc,
            createOrUpdateIndexerAsyncFunc,
            mutateIndexerFunc,
            indexerName);
    }

    @Test
    public void updateIndexerIfExistsFailsOnNoResource() {
        AccessConditionAsyncTests act = new AccessConditionAsyncTests();
        act.updateIfExistsFailsOnNoResourceAsync(
            newIndexerFunc,
            createOrUpdateIndexerAsyncFunc);
    }

    @Test
    public void updateIndexerIfExistsSucceedsOnExistingResource() {
        // Prepare datasource and index
        createDataSourceAndIndex(SQL_DATASOURCE_NAME, TARGET_INDEX_NAME);

        AccessConditionAsyncTests act = new AccessConditionAsyncTests();
        act.updateIfExistsSucceedsOnExistingResourceAsync(
            newIndexerFunc,
            createOrUpdateIndexerAsyncFunc,
            mutateIndexerFunc);
    }

    @Test
    public void updateIndexerIfNotChangedFailsWhenResourceChanged() {
        // Prepare datasource and index
        createDataSourceAndIndex(SQL_DATASOURCE_NAME, TARGET_INDEX_NAME);

        AccessConditionAsyncTests act = new AccessConditionAsyncTests();
        act.updateIfNotChangedFailsWhenResourceChangedAsync(
            newIndexerFunc,
            createOrUpdateIndexerAsyncFunc,
            mutateIndexerFunc);
    }

    @Test
    public void updateIndexerIfNotChangedSucceedsWhenResourceUnchanged() {
        // Prepare datasource and index
        createDataSourceAndIndex(SQL_DATASOURCE_NAME, TARGET_INDEX_NAME);

        AccessConditionAsyncTests act = new AccessConditionAsyncTests();
        act.updateIfNotChangedSucceedsWhenResourceUnchangedAsync(
            newIndexerFunc,
            createOrUpdateIndexerAsyncFunc,
            mutateIndexerFunc);
    }

    @Test
    public void canUpdateIndexerSkillset() {
        DataSource dataSource = createTestSqlDataSourceObject(SQL_DATASOURCE_NAME);
        client.createOrUpdateDataSource(dataSource).block();

        // Create a new skillset
        Skillset skillset = createSkillsetObject();
        client.createSkillset(skillset).block();

        Indexer updatedExpected = createIndexerWithDifferentSkillset(skillset.getName());
        createUpdateAndValidateIndexer(updatedExpected, SQL_DATASOURCE_NAME);
    }

    @Test
    public void canCreateIndexerWithSkillset() {
        DataSource dataSource = createTestSqlDataSourceObject(SQL_DATASOURCE_NAME);
        client.createOrUpdateDataSource(dataSource).block();

        // Create a new skillset
        Skillset skillset = createSkillsetObject();
        client.createSkillset(skillset).block();

        Indexer indexer = createIndexerWithDifferentSkillset(skillset.getName())
            .setDataSourceName(dataSource.getName());

        createAndValidateIndexer(indexer);
    }

    @Test
    public void existsReturnsTrueForExistingIndexer() {
        Indexer indexer = createTestDataSourceAndIndexer();

        StepVerifier.create(client.indexerExists(indexer.getName()))
            .expectNext(true)
            .verifyComplete();
    }

    @Test
    public void existsReturnsTrueForExistingIndexerWithResponse() {
        Indexer indexer = createTestDataSourceAndIndexer();

        StepVerifier
            .create(client.indexerExistsWithResponse(indexer.getName(), generateRequestOptions()))
            .assertNext(res -> Assert.assertTrue(res.getValue()))
            .verifyComplete();
    }

    @Test
    public void existsReturnsFalseForNonExistingIndexer() {

        StepVerifier.create(client.indexerExists("invalidindex"))
            .expectNext(false)
            .verifyComplete();
    }
}
