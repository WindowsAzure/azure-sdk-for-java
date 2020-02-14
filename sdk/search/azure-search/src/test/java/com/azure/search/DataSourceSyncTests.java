// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search;

import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.search.models.AccessCondition;
import com.azure.search.models.DataContainer;
import com.azure.search.models.DataSource;
import com.azure.search.models.DataSourceCredentials;
import com.azure.search.models.DataSourceType;
import com.azure.search.models.HighWaterMarkChangeDetectionPolicy;
import com.azure.search.models.RequestOptions;
import com.azure.search.models.SoftDeleteColumnDeletionDetectionPolicy;
import com.azure.search.models.SqlIntegratedChangeTrackingPolicy;
import com.azure.search.test.AccessConditionTests;
import com.azure.search.test.AccessOptions;
import io.netty.handler.codec.http.HttpResponseStatus;
import org.junit.jupiter.api.Test;

import java.net.HttpURLConnection;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DataSourceSyncTests extends DataSourceTestBase {
    private SearchServiceClient client;

    // commonly used lambda definitions
    private BiFunction<DataSource, AccessOptions, DataSource> createOrUpdateDataSourceFunc =
        (DataSource ds, AccessOptions ac) ->
            createOrUpdateDataSource(ds, ac.getAccessCondition(), ac.getRequestOptions());

    private Supplier<DataSource> newDataSourceFunc = () -> createTestBlobDataSource(null);

    private Function<DataSource, DataSource> mutateDataSourceFunc =
        (DataSource ds) -> ds.setDescription("somethingnew");

    private BiConsumer<String, AccessOptions> deleteDataSourceFunc = (String name, AccessOptions ac) ->
        client.deleteDataSourceWithResponse(name, ac.getAccessCondition(), ac.getRequestOptions(), Context.NONE);

    @Override
    protected void beforeTest() {
        super.beforeTest();
        client = getSearchServiceClientBuilder().buildClient();
    }

    private DataSource createOrUpdateDataSource(DataSource datasource,
        AccessCondition accessCondition,
        RequestOptions requestOptions) {
        return client.createOrUpdateDataSourceWithResponse(datasource, accessCondition, requestOptions, Context.NONE)
            .getValue();
    }

    @Test
    public void canCreateAndListDataSources() {
        DataSource dataSource1 = createTestBlobDataSource(null);
        DataSource dataSource2 = createTestSqlDataSourceObject(SQL_DATASOURCE_NAME);

        client.createOrUpdateDataSource(dataSource1);
        client.createOrUpdateDataSource(dataSource2);

        Iterator<DataSource> results = client.listDataSources().iterator();

        assertEquals(dataSource1.getName(), results.next().getName());
        assertEquals(dataSource2.getName(), results.next().getName());
        assertFalse(results.hasNext());
    }

    @Test
    public void canCreateAndListDataSourcesWithResponse() {
        DataSource dataSource1 = createTestBlobDataSource(null);
        DataSource dataSource2 = createTestSqlDataSourceObject(SQL_DATASOURCE_NAME);

        client.createOrUpdateDataSourceWithResponse(
            dataSource1, new AccessCondition(), new RequestOptions(), Context.NONE);
        client.createOrUpdateDataSourceWithResponse(
            dataSource2, new AccessCondition(), new RequestOptions(), Context.NONE);

        Iterator<DataSource> results = client.listDataSources("name", new RequestOptions(), Context.NONE).iterator();

        assertEquals(dataSource1.getName(), results.next().getName());
        assertEquals(dataSource2.getName(), results.next().getName());
        assertFalse(results.hasNext());
    }

    @Test
    public void canCreateAndDeleteDatasource() {
        DataSource dataSource = createTestBlobDataSource(null);
        client.deleteDataSource(dataSource.getName());

        assertThrows(HttpResponseException.class, () -> client.getDataSource(dataSource.getName()));
    }

    @Test
    public void deleteDataSourceIsIdempotent() {
        DataSource dataSource = createTestBlobDataSource(null);

        // Try to delete before the data source exists, expect a NOT FOUND return status code
        Response<Void> result = client.deleteDataSourceWithResponse(dataSource.getName(),
            new AccessCondition(), generateRequestOptions(), Context.NONE);
        assertEquals(HttpURLConnection.HTTP_NOT_FOUND, result.getStatusCode());

        // Create the data source
        client.createOrUpdateDataSource(dataSource);

        // Delete twice, expect the first to succeed (with NO CONTENT status code) and the second to return NOT FOUND
        result = client.deleteDataSourceWithResponse(dataSource.getName(),
            new AccessCondition(), generateRequestOptions(), Context.NONE);
        assertEquals(HttpURLConnection.HTTP_NO_CONTENT, result.getStatusCode());
        // Again, expect to fail
        result = client.deleteDataSourceWithResponse(dataSource.getName(),
            new AccessCondition(), generateRequestOptions(), Context.NONE);
        assertEquals(HttpURLConnection.HTTP_NOT_FOUND, result.getStatusCode());
    }

    @Test
    public void createDataSourceFailsWithUsefulMessageOnUserError() {
        client = getSearchServiceClientBuilder().buildClient();

        DataSource dataSource = createTestSqlDataSourceObject(SQL_DATASOURCE_NAME);
        dataSource.setType(DataSourceType.fromString("thistypedoesnotexist"));

        assertHttpResponseException(
            () -> client.createOrUpdateDataSource(dataSource),
            HttpResponseStatus.BAD_REQUEST,
            "Data source type 'thistypedoesnotexist' is not supported"
        );
    }

    @Test
    public void canUpdateDataSource() {
        DataSource initial = createTestSqlDataSourceObject(SQL_DATASOURCE_NAME);

        // Create the data source
        client.createOrUpdateDataSource(initial);

        DataSource updatedExpected = createTestSqlDataSourceObject(SQL_DATASOURCE_NAME)
            .setName(initial.getName())
            .setContainer(new DataContainer().setName("somethingdifferent"))
            .setDescription("somethingdifferent")
            .setDataChangeDetectionPolicy(new HighWaterMarkChangeDetectionPolicy()
                .setHighWaterMarkColumnName("rowversion"))
            .setDataDeletionDetectionPolicy(new SoftDeleteColumnDeletionDetectionPolicy()
                .setSoftDeleteColumnName("isDeleted"));

        DataSource updatedActual = client.createOrUpdateDataSource(updatedExpected);

        updatedExpected.getCredentials().setConnectionString(null); // Create doesn't return connection strings.
        assertTrue(TestHelpers.areDataSourcesEqual(updatedActual, updatedExpected));
    }

    @Test
    public void createOrUpdateDataSourceIfNotExistsFailsOnExistingResource() {
        new AccessConditionTests().createOrUpdateIfNotExistsFailsOnExistingResource(createOrUpdateDataSourceFunc,
            newDataSourceFunc, mutateDataSourceFunc);
    }

    @Test
    public void createOrUpdateDatasourceIfNotExistsSucceedsOnNoResource() {
        new AccessConditionTests()
            .createOrUpdateIfNotExistsSucceedsOnNoResource(createOrUpdateDataSourceFunc, newDataSourceFunc);
    }

    @Test
    public void deleteDataSourceIfExistsWorksOnlyWhenResourceExists() {
        new AccessConditionTests().deleteIfExistsWorksOnlyWhenResourceExists(deleteDataSourceFunc,
            createOrUpdateDataSourceFunc, newDataSourceFunc, BLOB_DATASOURCE_TEST_NAME);
    }

    @Test
    public void deleteDataSourceIfNotChangedWorksOnlyOnCurrentResource() {
        new AccessConditionTests().deleteIfNotChangedWorksOnlyOnCurrentResource(deleteDataSourceFunc, newDataSourceFunc,
            createOrUpdateDataSourceFunc, BLOB_DATASOURCE_TEST_NAME);
    }

    @Test
    public void updateDataSourceIfExistsFailsOnNoResource() {
        new AccessConditionTests().updateIfExistsFailsOnNoResource(newDataSourceFunc, createOrUpdateDataSourceFunc);
    }

    @Test
    public void updateDataSourceIfExistsSucceedsOnExistingResource() {
        new AccessConditionTests().updateIfExistsSucceedsOnExistingResource(newDataSourceFunc,
            createOrUpdateDataSourceFunc, mutateDataSourceFunc);
    }

    @Test
    public void updateDataSourceIfNotChangedFailsWhenResourceChanged() {
        new AccessConditionTests().updateIfNotChangedFailsWhenResourceChanged(newDataSourceFunc,
            createOrUpdateDataSourceFunc, mutateDataSourceFunc);
    }

    @Test
    public void updateDataSourceIfNotChangedSucceedsWhenResourceUnchanged() {
        new AccessConditionTests().updateIfNotChangedSucceedsWhenResourceUnchanged(newDataSourceFunc,
            createOrUpdateDataSourceFunc, mutateDataSourceFunc);
    }

    @Test
    public void createDataSourceReturnsCorrectDefinition() {
        SoftDeleteColumnDeletionDetectionPolicy deletionDetectionPolicy =
            new SoftDeleteColumnDeletionDetectionPolicy()
                .setSoftDeleteColumnName("isDeleted")
                .setSoftDeleteMarkerValue("1");

        HighWaterMarkChangeDetectionPolicy changeDetectionPolicy =
            new HighWaterMarkChangeDetectionPolicy()
                .setHighWaterMarkColumnName("fakecolumn");

        // AzureSql
        createAndValidateDataSource(createTestSqlDataSourceObject(SQL_DATASOURCE_NAME, null, null));
        createAndValidateDataSource(createTestSqlDataSourceObject(SQL_DATASOURCE_NAME, deletionDetectionPolicy, null));
        createAndValidateDataSource(createTestSqlDataSourceObject(SQL_DATASOURCE_NAME, null, new
            SqlIntegratedChangeTrackingPolicy()));
        createAndValidateDataSource(createTestSqlDataSourceObject(SQL_DATASOURCE_NAME, deletionDetectionPolicy,
            changeDetectionPolicy));

        // Cosmos
        createAndValidateDataSource(createTestCosmosDataSource(null, false));
        createAndValidateDataSource(createTestCosmosDataSource(null, true));
        createAndValidateDataSource(createTestCosmosDataSource(deletionDetectionPolicy, false));
        createAndValidateDataSource(createTestCosmosDataSource(deletionDetectionPolicy, false));

        // Azure Blob Storage
        createAndValidateDataSource(createTestBlobDataSource(null));
        createAndValidateDataSource(createTestBlobDataSource(deletionDetectionPolicy));

        // Azure Table Storage
        createAndValidateDataSource(createTestTableStorageDataSource(null));
        createAndValidateDataSource(createTestBlobDataSource(deletionDetectionPolicy));
    }

    private void createAndValidateDataSource(DataSource expectedDataSource) {
        DataSource actualDataSource = client.createOrUpdateDataSource(expectedDataSource);

        expectedDataSource.setCredentials(new DataSourceCredentials().setConnectionString(null));
        assertTrue(TestHelpers.areDataSourcesEqual(actualDataSource, expectedDataSource));
        // we delete the data source because otherwise we will hit the quota limits during the tests
        client.deleteDataSource(actualDataSource.getName());

    }

    @Test
    public void getDataSourceReturnsCorrectDefinition() {
        client = getSearchServiceClientBuilder().buildClient();

        createGetAndValidateDataSource(createTestBlobDataSource(null));
        createGetAndValidateDataSource(createTestTableStorageDataSource(null));
        createGetAndValidateDataSource(createTestSqlDataSourceObject(SQL_DATASOURCE_NAME));
        createGetAndValidateDataSource(createTestCosmosDataSource(null, false));
    }

    private void createGetAndValidateDataSource(DataSource expectedDataSource) {
        client.createOrUpdateDataSource(expectedDataSource);
        String dataSourceName = expectedDataSource.getName();
        expectedDataSource.setCredentials(new DataSourceCredentials().setConnectionString(null)); // Get doesn't return connection strings.

        DataSource actualDataSource = client.getDataSource(dataSourceName);
        assertTrue(TestHelpers.areDataSourcesEqual(actualDataSource, expectedDataSource));

        actualDataSource = client.getDataSourceWithResponse(dataSourceName, generateRequestOptions(), Context.NONE)
            .getValue();
        assertTrue(TestHelpers.areDataSourcesEqual(actualDataSource, expectedDataSource));

        client.deleteDataSource(dataSourceName);
    }

    @Test
    public void getDataSourceThrowsOnNotFound() {
        client = getSearchServiceClientBuilder().buildClient();
        assertHttpResponseException(
            () -> client.getDataSource("thisdatasourcedoesnotexist"),
            HttpResponseStatus.NOT_FOUND,
            "No data source with the name 'thisdatasourcedoesnotexist' was found in service"
        );
    }

    @Test
    public void canCreateDataSource() {
        DataSource expectedDataSource = createTestBlobDataSource(null);
        DataSource actualDataSource = client.createDataSource(expectedDataSource);
        assertNotNull(actualDataSource);
        assertEquals(expectedDataSource.getName(), actualDataSource.getName());

        Iterator<DataSource> dataSources = client.listDataSources().iterator();
        assertEquals(expectedDataSource.getName(), dataSources.next().getName());
        assertFalse(dataSources.hasNext());
    }

    @Test
    public void canCreateDataSourceWithResponse() {
        DataSource expectedDataSource = createTestBlobDataSource(null);
        Response<DataSource> response = client
            .createDataSourceWithResponse(expectedDataSource, new RequestOptions(), null);
        assertNotNull(response);
        assertNotNull(response.getValue());
        assertEquals(expectedDataSource.getName(), response.getValue().getName());
        assertEquals(HttpURLConnection.HTTP_CREATED, response.getStatusCode());
    }
}
