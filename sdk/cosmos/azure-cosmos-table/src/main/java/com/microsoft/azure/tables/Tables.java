package com.microsoft.azure.tables;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Patch;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.RestProxy;
import com.microsoft.azure.tables.models.OdataMetadataFormat;
import com.microsoft.azure.tables.models.QueryOptions;
import com.microsoft.azure.tables.models.ResponseFormat;
import com.microsoft.azure.tables.models.SignedIdentifier;
import com.microsoft.azure.tables.models.TableEntityQueryResponse;
import com.microsoft.azure.tables.models.TableProperties;
import com.microsoft.azure.tables.models.TableQueryResponse;
import com.microsoft.azure.tables.models.TableResponse;
import com.microsoft.azure.tables.models.TableServiceErrorException;
import com.microsoft.azure.tables.models.TablesCreateResponse;
import com.microsoft.azure.tables.models.TablesDeleteEntityResponse;
import com.microsoft.azure.tables.models.TablesDeleteResponse;
import com.microsoft.azure.tables.models.TablesGetAccessPolicyResponse;
import com.microsoft.azure.tables.models.TablesInsertEntityResponse;
import com.microsoft.azure.tables.models.TablesMergeEntityResponse;
import com.microsoft.azure.tables.models.TablesQueryEntitiesResponse;
import com.microsoft.azure.tables.models.TablesQueryEntitiesWithPartitionAndRowKeyResponse;
import com.microsoft.azure.tables.models.TablesQueryResponse;
import com.microsoft.azure.tables.models.TablesSetAccessPolicyResponse;
import com.microsoft.azure.tables.models.TablesUpdateEntityResponse;
import java.util.List;
import java.util.Map;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Tables. */
public final class Tables {
    /** The proxy service used to perform REST calls. */
    private final TablesService service;

    /** The service client containing this operation class. */
    private final AzureTable client;

    /**
     * Initializes an instance of Tables.
     *
     * @param client the instance of the service client containing this operation class.
     */
    Tables(AzureTable client) {
        this.service = RestProxy.create(TablesService.class, client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureTableTables to be used by the proxy service to perform REST
     * calls.
     */
    @Host("{url}")
    @ServiceInterface(name = "AzureTableTables")
    private interface TablesService {
        @Get("/Tables")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<TablesQueryResponse> query(
                @HostParam("url") String url,
                @HeaderParam("x-ms-version") String version,
                @HeaderParam("x-ms-client-request-id") String requestId,
                @HeaderParam("DataServiceVersion") String dataServiceVersion,
                @QueryParam("$format") OdataMetadataFormat format,
                @QueryParam("$top") Integer top,
                @QueryParam("$select") String select,
                @QueryParam("$filter") String filter,
                @QueryParam("NextTableName") String nextTableName);

        @Post("/Tables")
        @ExpectedResponses({201, 204})
        @UnexpectedResponseExceptionType(TableServiceErrorException.class)
        Mono<TablesCreateResponse> create(
                @HostParam("url") String url,
                @HeaderParam("x-ms-version") String version,
                @HeaderParam("x-ms-client-request-id") String requestId,
                @HeaderParam("DataServiceVersion") String dataServiceVersion,
                @QueryParam("$format") OdataMetadataFormat format,
                @HeaderParam("Prefer") ResponseFormat responsePreference,
                @BodyParam("application/json") TableProperties tableProperties);

        @Delete("/Tables('{table}')")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(TableServiceErrorException.class)
        Mono<TablesDeleteResponse> delete(
                @HostParam("url") String url,
                @HeaderParam("x-ms-version") String version,
                @HeaderParam("x-ms-client-request-id") String requestId,
                @PathParam("table") String table);

        @Get("/{table}()")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(TableServiceErrorException.class)
        Mono<TablesQueryEntitiesResponse> queryEntities(
                @HostParam("url") String url,
                @QueryParam("timeout") Integer timeout,
                @HeaderParam("x-ms-version") String version,
                @HeaderParam("x-ms-client-request-id") String requestId,
                @HeaderParam("DataServiceVersion") String dataServiceVersion,
                @QueryParam("$format") OdataMetadataFormat format,
                @QueryParam("$top") Integer top,
                @QueryParam("$select") String select,
                @QueryParam("$filter") String filter,
                @PathParam("table") String table,
                @QueryParam("NextPartitionKey") String nextPartitionKey,
                @QueryParam("NextRowKey") String nextRowKey);

        @Get("/{table}(PartitionKey='{partitionKey}',RowKey='{rowKey}')")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(TableServiceErrorException.class)
        Mono<TablesQueryEntitiesWithPartitionAndRowKeyResponse> queryEntitiesWithPartitionAndRowKey(
                @HostParam("url") String url,
                @QueryParam("timeout") Integer timeout,
                @HeaderParam("x-ms-version") String version,
                @HeaderParam("x-ms-client-request-id") String requestId,
                @HeaderParam("DataServiceVersion") String dataServiceVersion,
                @QueryParam("$format") OdataMetadataFormat format,
                @QueryParam("$select") String select,
                @QueryParam("$filter") String filter,
                @PathParam("table") String table,
                @PathParam("partitionKey") String partitionKey,
                @PathParam("rowKey") String rowKey);

        @Put("/{table}(PartitionKey='{partitionKey}',RowKey='{rowKey}')")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(TableServiceErrorException.class)
        Mono<TablesUpdateEntityResponse> updateEntity(
                @HostParam("url") String url,
                @QueryParam("timeout") Integer timeout,
                @HeaderParam("x-ms-version") String version,
                @HeaderParam("x-ms-client-request-id") String requestId,
                @HeaderParam("DataServiceVersion") String dataServiceVersion,
                @QueryParam("$format") OdataMetadataFormat format,
                @PathParam("table") String table,
                @PathParam("partitionKey") String partitionKey,
                @PathParam("rowKey") String rowKey,
                @HeaderParam("If-Match") String ifMatch,
                @BodyParam("application/json") Map<String, Object> tableEntityProperties);

        @Patch("/{table}(PartitionKey='{partitionKey}',RowKey='{rowKey}')")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(TableServiceErrorException.class)
        Mono<TablesMergeEntityResponse> mergeEntity(
                @HostParam("url") String url,
                @QueryParam("timeout") Integer timeout,
                @HeaderParam("x-ms-version") String version,
                @HeaderParam("x-ms-client-request-id") String requestId,
                @HeaderParam("DataServiceVersion") String dataServiceVersion,
                @QueryParam("$format") OdataMetadataFormat format,
                @PathParam("table") String table,
                @PathParam("partitionKey") String partitionKey,
                @PathParam("rowKey") String rowKey,
                @HeaderParam("If-Match") String ifMatch,
                @BodyParam("application/json") Map<String, Object> tableEntityProperties);

        @Delete("/{table}(PartitionKey='{partitionKey}',RowKey='{rowKey}')")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(TableServiceErrorException.class)
        Mono<TablesDeleteEntityResponse> deleteEntity(
                @HostParam("url") String url,
                @QueryParam("timeout") Integer timeout,
                @HeaderParam("x-ms-version") String version,
                @HeaderParam("x-ms-client-request-id") String requestId,
                @HeaderParam("DataServiceVersion") String dataServiceVersion,
                @QueryParam("$format") OdataMetadataFormat format,
                @PathParam("table") String table,
                @PathParam("partitionKey") String partitionKey,
                @PathParam("rowKey") String rowKey,
                @HeaderParam("If-Match") String ifMatch);

        @Post("/{table}")
        @ExpectedResponses({201, 204})
        @UnexpectedResponseExceptionType(TableServiceErrorException.class)
        Mono<TablesInsertEntityResponse> insertEntity(
                @HostParam("url") String url,
                @QueryParam("timeout") Integer timeout,
                @HeaderParam("x-ms-version") String version,
                @HeaderParam("x-ms-client-request-id") String requestId,
                @HeaderParam("DataServiceVersion") String dataServiceVersion,
                @QueryParam("$format") OdataMetadataFormat format,
                @PathParam("table") String table,
                @HeaderParam("Prefer") ResponseFormat responsePreference,
                @BodyParam("application/json") Map<String, Object> tableEntityProperties);

        @Get("/{table}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(TableServiceErrorException.class)
        Mono<TablesGetAccessPolicyResponse> getAccessPolicy(
                @HostParam("url") String url,
                @QueryParam("timeout") Integer timeout,
                @HeaderParam("x-ms-version") String version,
                @HeaderParam("x-ms-client-request-id") String requestId,
                @PathParam("table") String table,
                @QueryParam("comp") String comp);

        @Put("/{table}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(TableServiceErrorException.class)
        Mono<TablesSetAccessPolicyResponse> setAccessPolicy(
                @HostParam("url") String url,
                @QueryParam("timeout") Integer timeout,
                @HeaderParam("x-ms-version") String version,
                @HeaderParam("x-ms-client-request-id") String requestId,
                @PathParam("table") String table,
                @QueryParam("comp") String comp,
                @BodyParam("application/xml") List<SignedIdentifier> tableAcl);
    }

    /**
     * Queries tables under the given account.
     *
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when analytics logging is enabled.
     * @param nextTableName A table query continuation token from a previous call.
     * @param queryOptions Parameter group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties for the table query response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TablesQueryResponse> queryWithResponseAsync(
            String requestId, String nextTableName, QueryOptions queryOptions) {
        final String dataServiceVersion = "3.0";
        OdataMetadataFormat formatInternal = null;
        if (queryOptions != null) {
            formatInternal = queryOptions.getFormat();
        }
        OdataMetadataFormat format = formatInternal;
        Integer topInternal = null;
        if (queryOptions != null) {
            topInternal = queryOptions.getTop();
        }
        Integer top = topInternal;
        String selectInternal = null;
        if (queryOptions != null) {
            selectInternal = queryOptions.getSelect();
        }
        String select = selectInternal;
        String filterInternal = null;
        if (queryOptions != null) {
            filterInternal = queryOptions.getFilter();
        }
        String filter = filterInternal;
        return service.query(
                this.client.getUrl(),
                this.client.getVersion(),
                requestId,
                dataServiceVersion,
                format,
                top,
                select,
                filter,
                nextTableName);
    }

    /**
     * Queries tables under the given account.
     *
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when analytics logging is enabled.
     * @param nextTableName A table query continuation token from a previous call.
     * @param queryOptions Parameter group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties for the table query response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TableQueryResponse> queryAsync(String requestId, String nextTableName, QueryOptions queryOptions) {
        return queryWithResponseAsync(requestId, nextTableName, queryOptions)
                .flatMap(
                        (TablesQueryResponse res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Creates a new table under the given account.
     *
     * @param tableProperties The properties for creating a table.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when analytics logging is enabled.
     * @param responsePreference Specifies whether the response should include the inserted entity in the payload.
     *     Possible values are return-no-content and return-content.
     * @param queryOptions Parameter group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws TableServiceErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response for a single table.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TablesCreateResponse> createWithResponseAsync(
            TableProperties tableProperties,
            String requestId,
            ResponseFormat responsePreference,
            QueryOptions queryOptions) {
        final String dataServiceVersion = "3.0";
        OdataMetadataFormat formatInternal = null;
        if (queryOptions != null) {
            formatInternal = queryOptions.getFormat();
        }
        OdataMetadataFormat format = formatInternal;
        return service.create(
                this.client.getUrl(),
                this.client.getVersion(),
                requestId,
                dataServiceVersion,
                format,
                responsePreference,
                tableProperties);
    }

    /**
     * Creates a new table under the given account.
     *
     * @param tableProperties The properties for creating a table.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when analytics logging is enabled.
     * @param responsePreference Specifies whether the response should include the inserted entity in the payload.
     *     Possible values are return-no-content and return-content.
     * @param queryOptions Parameter group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws TableServiceErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response for a single table.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TableResponse> createAsync(
            TableProperties tableProperties,
            String requestId,
            ResponseFormat responsePreference,
            QueryOptions queryOptions) {
        return createWithResponseAsync(tableProperties, requestId, responsePreference, queryOptions)
                .flatMap(
                        (TablesCreateResponse res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Operation permanently deletes the specified table.
     *
     * @param table The name of the table.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when analytics logging is enabled.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws TableServiceErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TablesDeleteResponse> deleteWithResponseAsync(String table, String requestId) {
        return service.delete(this.client.getUrl(), this.client.getVersion(), requestId, table);
    }

    /**
     * Operation permanently deletes the specified table.
     *
     * @param table The name of the table.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when analytics logging is enabled.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws TableServiceErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String table, String requestId) {
        return deleteWithResponseAsync(table, requestId).flatMap((TablesDeleteResponse res) -> Mono.empty());
    }

    /**
     * Queries entities in a table.
     *
     * @param table The name of the table.
     * @param timeout The timeout parameter is expressed in seconds.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when analytics logging is enabled.
     * @param nextPartitionKey An entity query continuation token from a previous call.
     * @param nextRowKey An entity query continuation token from a previous call.
     * @param queryOptions Parameter group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws TableServiceErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties for the table entity query response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TablesQueryEntitiesResponse> queryEntitiesWithResponseAsync(
            String table,
            Integer timeout,
            String requestId,
            String nextPartitionKey,
            String nextRowKey,
            QueryOptions queryOptions) {
        final String dataServiceVersion = "3.0";
        OdataMetadataFormat formatInternal = null;
        if (queryOptions != null) {
            formatInternal = queryOptions.getFormat();
        }
        OdataMetadataFormat format = formatInternal;
        Integer topInternal = null;
        if (queryOptions != null) {
            topInternal = queryOptions.getTop();
        }
        Integer top = topInternal;
        String selectInternal = null;
        if (queryOptions != null) {
            selectInternal = queryOptions.getSelect();
        }
        String select = selectInternal;
        String filterInternal = null;
        if (queryOptions != null) {
            filterInternal = queryOptions.getFilter();
        }
        String filter = filterInternal;
        return service.queryEntities(
                this.client.getUrl(),
                timeout,
                this.client.getVersion(),
                requestId,
                dataServiceVersion,
                format,
                top,
                select,
                filter,
                table,
                nextPartitionKey,
                nextRowKey);
    }

    /**
     * Queries entities in a table.
     *
     * @param table The name of the table.
     * @param timeout The timeout parameter is expressed in seconds.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when analytics logging is enabled.
     * @param nextPartitionKey An entity query continuation token from a previous call.
     * @param nextRowKey An entity query continuation token from a previous call.
     * @param queryOptions Parameter group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws TableServiceErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties for the table entity query response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TableEntityQueryResponse> queryEntitiesAsync(
            String table,
            Integer timeout,
            String requestId,
            String nextPartitionKey,
            String nextRowKey,
            QueryOptions queryOptions) {
        return queryEntitiesWithResponseAsync(table, timeout, requestId, nextPartitionKey, nextRowKey, queryOptions)
                .flatMap(
                        (TablesQueryEntitiesResponse res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Queries entities in a table.
     *
     * @param table The name of the table.
     * @param partitionKey The partition key of the entity.
     * @param rowKey The row key of the entity.
     * @param timeout The timeout parameter is expressed in seconds.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when analytics logging is enabled.
     * @param queryOptions Parameter group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws TableServiceErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties for the table entity query response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TablesQueryEntitiesWithPartitionAndRowKeyResponse> queryEntitiesWithPartitionAndRowKeyWithResponseAsync(
            String table,
            String partitionKey,
            String rowKey,
            Integer timeout,
            String requestId,
            QueryOptions queryOptions) {
        final String dataServiceVersion = "3.0";
        OdataMetadataFormat formatInternal = null;
        if (queryOptions != null) {
            formatInternal = queryOptions.getFormat();
        }
        OdataMetadataFormat format = formatInternal;
        String selectInternal = null;
        if (queryOptions != null) {
            selectInternal = queryOptions.getSelect();
        }
        String select = selectInternal;
        String filterInternal = null;
        if (queryOptions != null) {
            filterInternal = queryOptions.getFilter();
        }
        String filter = filterInternal;
        return service.queryEntitiesWithPartitionAndRowKey(
                this.client.getUrl(),
                timeout,
                this.client.getVersion(),
                requestId,
                dataServiceVersion,
                format,
                select,
                filter,
                table,
                partitionKey,
                rowKey);
    }

    /**
     * Queries entities in a table.
     *
     * @param table The name of the table.
     * @param partitionKey The partition key of the entity.
     * @param rowKey The row key of the entity.
     * @param timeout The timeout parameter is expressed in seconds.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when analytics logging is enabled.
     * @param queryOptions Parameter group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws TableServiceErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties for the table entity query response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TableEntityQueryResponse> queryEntitiesWithPartitionAndRowKeyAsync(
            String table,
            String partitionKey,
            String rowKey,
            Integer timeout,
            String requestId,
            QueryOptions queryOptions) {
        return queryEntitiesWithPartitionAndRowKeyWithResponseAsync(
                        table, partitionKey, rowKey, timeout, requestId, queryOptions)
                .flatMap(
                        (TablesQueryEntitiesWithPartitionAndRowKeyResponse res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Update entity in a table.
     *
     * @param table The name of the table.
     * @param partitionKey The partition key of the entity.
     * @param rowKey The row key of the entity.
     * @param timeout The timeout parameter is expressed in seconds.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when analytics logging is enabled.
     * @param ifMatch Match condition for an entity to be updated. If specified and a matching entity is not found, an
     *     error will be raised. To force an unconditional update, set to the wildcard character (*). If not specified,
     *     an insert will be performed when no existing entity is found to update and a replace will be performed if an
     *     existing entity is found.
     * @param tableEntityProperties The other properties of the table entity.
     * @param queryOptions Parameter group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws TableServiceErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TablesUpdateEntityResponse> updateEntityWithResponseAsync(
            String table,
            String partitionKey,
            String rowKey,
            Integer timeout,
            String requestId,
            String ifMatch,
            Map<String, Object> tableEntityProperties,
            QueryOptions queryOptions) {
        final String dataServiceVersion = "3.0";
        OdataMetadataFormat formatInternal = null;
        if (queryOptions != null) {
            formatInternal = queryOptions.getFormat();
        }
        OdataMetadataFormat format = formatInternal;
        return service.updateEntity(
                this.client.getUrl(),
                timeout,
                this.client.getVersion(),
                requestId,
                dataServiceVersion,
                format,
                table,
                partitionKey,
                rowKey,
                ifMatch,
                tableEntityProperties);
    }

    /**
     * Update entity in a table.
     *
     * @param table The name of the table.
     * @param partitionKey The partition key of the entity.
     * @param rowKey The row key of the entity.
     * @param timeout The timeout parameter is expressed in seconds.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when analytics logging is enabled.
     * @param ifMatch Match condition for an entity to be updated. If specified and a matching entity is not found, an
     *     error will be raised. To force an unconditional update, set to the wildcard character (*). If not specified,
     *     an insert will be performed when no existing entity is found to update and a replace will be performed if an
     *     existing entity is found.
     * @param tableEntityProperties The other properties of the table entity.
     * @param queryOptions Parameter group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws TableServiceErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> updateEntityAsync(
            String table,
            String partitionKey,
            String rowKey,
            Integer timeout,
            String requestId,
            String ifMatch,
            Map<String, Object> tableEntityProperties,
            QueryOptions queryOptions) {
        return updateEntityWithResponseAsync(
                        table, partitionKey, rowKey, timeout, requestId, ifMatch, tableEntityProperties, queryOptions)
                .flatMap((TablesUpdateEntityResponse res) -> Mono.empty());
    }

    /**
     * Merge entity in a table.
     *
     * @param table The name of the table.
     * @param partitionKey The partition key of the entity.
     * @param rowKey The row key of the entity.
     * @param timeout The timeout parameter is expressed in seconds.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when analytics logging is enabled.
     * @param ifMatch Match condition for an entity to be updated. If specified and a matching entity is not found, an
     *     error will be raised. To force an unconditional update, set to the wildcard character (*). If not specified,
     *     an insert will be performed when no existing entity is found to update and a merge will be performed if an
     *     existing entity is found.
     * @param tableEntityProperties The other properties of the table entity.
     * @param queryOptions Parameter group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws TableServiceErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TablesMergeEntityResponse> mergeEntityWithResponseAsync(
            String table,
            String partitionKey,
            String rowKey,
            Integer timeout,
            String requestId,
            String ifMatch,
            Map<String, Object> tableEntityProperties,
            QueryOptions queryOptions) {
        final String dataServiceVersion = "3.0";
        OdataMetadataFormat formatInternal = null;
        if (queryOptions != null) {
            formatInternal = queryOptions.getFormat();
        }
        OdataMetadataFormat format = formatInternal;
        return service.mergeEntity(
                this.client.getUrl(),
                timeout,
                this.client.getVersion(),
                requestId,
                dataServiceVersion,
                format,
                table,
                partitionKey,
                rowKey,
                ifMatch,
                tableEntityProperties);
    }

    /**
     * Merge entity in a table.
     *
     * @param table The name of the table.
     * @param partitionKey The partition key of the entity.
     * @param rowKey The row key of the entity.
     * @param timeout The timeout parameter is expressed in seconds.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when analytics logging is enabled.
     * @param ifMatch Match condition for an entity to be updated. If specified and a matching entity is not found, an
     *     error will be raised. To force an unconditional update, set to the wildcard character (*). If not specified,
     *     an insert will be performed when no existing entity is found to update and a merge will be performed if an
     *     existing entity is found.
     * @param tableEntityProperties The other properties of the table entity.
     * @param queryOptions Parameter group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws TableServiceErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> mergeEntityAsync(
            String table,
            String partitionKey,
            String rowKey,
            Integer timeout,
            String requestId,
            String ifMatch,
            Map<String, Object> tableEntityProperties,
            QueryOptions queryOptions) {
        return mergeEntityWithResponseAsync(
                        table, partitionKey, rowKey, timeout, requestId, ifMatch, tableEntityProperties, queryOptions)
                .flatMap((TablesMergeEntityResponse res) -> Mono.empty());
    }

    /**
     * Deletes the specified entity in a table.
     *
     * @param table The name of the table.
     * @param partitionKey The partition key of the entity.
     * @param rowKey The row key of the entity.
     * @param ifMatch Match condition for an entity to be deleted. If specified and a matching entity is not found, an
     *     error will be raised. To force an unconditional delete, set to the wildcard character (*).
     * @param timeout The timeout parameter is expressed in seconds.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when analytics logging is enabled.
     * @param queryOptions Parameter group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws TableServiceErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TablesDeleteEntityResponse> deleteEntityWithResponseAsync(
            String table,
            String partitionKey,
            String rowKey,
            String ifMatch,
            Integer timeout,
            String requestId,
            QueryOptions queryOptions) {
        final String dataServiceVersion = "3.0";
        OdataMetadataFormat formatInternal = null;
        if (queryOptions != null) {
            formatInternal = queryOptions.getFormat();
        }
        OdataMetadataFormat format = formatInternal;
        return service.deleteEntity(
                this.client.getUrl(),
                timeout,
                this.client.getVersion(),
                requestId,
                dataServiceVersion,
                format,
                table,
                partitionKey,
                rowKey,
                ifMatch);
    }

    /**
     * Deletes the specified entity in a table.
     *
     * @param table The name of the table.
     * @param partitionKey The partition key of the entity.
     * @param rowKey The row key of the entity.
     * @param ifMatch Match condition for an entity to be deleted. If specified and a matching entity is not found, an
     *     error will be raised. To force an unconditional delete, set to the wildcard character (*).
     * @param timeout The timeout parameter is expressed in seconds.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when analytics logging is enabled.
     * @param queryOptions Parameter group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws TableServiceErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteEntityAsync(
            String table,
            String partitionKey,
            String rowKey,
            String ifMatch,
            Integer timeout,
            String requestId,
            QueryOptions queryOptions) {
        return deleteEntityWithResponseAsync(table, partitionKey, rowKey, ifMatch, timeout, requestId, queryOptions)
                .flatMap((TablesDeleteEntityResponse res) -> Mono.empty());
    }

    /**
     * Insert entity in a table.
     *
     * @param table The name of the table.
     * @param timeout The timeout parameter is expressed in seconds.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when analytics logging is enabled.
     * @param responsePreference Specifies whether the response should include the inserted entity in the payload.
     *     Possible values are return-no-content and return-content.
     * @param tableEntityProperties The other properties of the table entity.
     * @param queryOptions Parameter group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws TableServiceErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the other properties of the table entity.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TablesInsertEntityResponse> insertEntityWithResponseAsync(
            String table,
            Integer timeout,
            String requestId,
            ResponseFormat responsePreference,
            Map<String, Object> tableEntityProperties,
            QueryOptions queryOptions) {
        final String dataServiceVersion = "3.0";
        OdataMetadataFormat formatInternal = null;
        if (queryOptions != null) {
            formatInternal = queryOptions.getFormat();
        }
        OdataMetadataFormat format = formatInternal;
        return service.insertEntity(
                this.client.getUrl(),
                timeout,
                this.client.getVersion(),
                requestId,
                dataServiceVersion,
                format,
                table,
                responsePreference,
                tableEntityProperties);
    }

    /**
     * Insert entity in a table.
     *
     * @param table The name of the table.
     * @param timeout The timeout parameter is expressed in seconds.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when analytics logging is enabled.
     * @param responsePreference Specifies whether the response should include the inserted entity in the payload.
     *     Possible values are return-no-content and return-content.
     * @param tableEntityProperties The other properties of the table entity.
     * @param queryOptions Parameter group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws TableServiceErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the other properties of the table entity.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Map<String, Object>> insertEntityAsync(
            String table,
            Integer timeout,
            String requestId,
            ResponseFormat responsePreference,
            Map<String, Object> tableEntityProperties,
            QueryOptions queryOptions) {
        return insertEntityWithResponseAsync(
                        table, timeout, requestId, responsePreference, tableEntityProperties, queryOptions)
                .flatMap(
                        (TablesInsertEntityResponse res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Retrieves details about any stored access policies specified on the table that may be used with Shared Access
     * Signatures.
     *
     * @param table The name of the table.
     * @param timeout The timeout parameter is expressed in seconds.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when analytics logging is enabled.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws TableServiceErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of signed identifiers.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TablesGetAccessPolicyResponse> getAccessPolicyWithResponseAsync(
            String table, Integer timeout, String requestId) {
        final String comp = "acl";
        return service.getAccessPolicy(this.client.getUrl(), timeout, this.client.getVersion(), requestId, table, comp);
    }

    /**
     * Retrieves details about any stored access policies specified on the table that may be used with Shared Access
     * Signatures.
     *
     * @param table The name of the table.
     * @param timeout The timeout parameter is expressed in seconds.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when analytics logging is enabled.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws TableServiceErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of signed identifiers.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<List<SignedIdentifier>> getAccessPolicyAsync(String table, Integer timeout, String requestId) {
        return getAccessPolicyWithResponseAsync(table, timeout, requestId)
                .flatMap(
                        (TablesGetAccessPolicyResponse res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Sets stored access policies for the table that may be used with Shared Access Signatures.
     *
     * @param table The name of the table.
     * @param timeout The timeout parameter is expressed in seconds.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when analytics logging is enabled.
     * @param tableAcl A collection of signed identifiers.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws TableServiceErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TablesSetAccessPolicyResponse> setAccessPolicyWithResponseAsync(
            String table, Integer timeout, String requestId, List<SignedIdentifier> tableAcl) {
        final String comp = "acl";
        return service.setAccessPolicy(
                this.client.getUrl(), timeout, this.client.getVersion(), requestId, table, comp, tableAcl);
    }

    /**
     * Sets stored access policies for the table that may be used with Shared Access Signatures.
     *
     * @param table The name of the table.
     * @param timeout The timeout parameter is expressed in seconds.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when analytics logging is enabled.
     * @param tableAcl A collection of signed identifiers.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws TableServiceErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> setAccessPolicyAsync(
            String table, Integer timeout, String requestId, List<SignedIdentifier> tableAcl) {
        return setAccessPolicyWithResponseAsync(table, timeout, requestId, tableAcl)
                .flatMap((TablesSetAccessPolicyResponse res) -> Mono.empty());
    }
}
