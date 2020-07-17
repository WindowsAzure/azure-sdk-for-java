// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos;

import com.azure.cosmos.implementation.Configs;
import com.azure.cosmos.implementation.Constants;
import com.azure.cosmos.implementation.CosmosError;
import com.azure.cosmos.implementation.InternalObjectNode;
import com.azure.cosmos.implementation.DatabaseAccount;
import com.azure.cosmos.implementation.Document;
import com.azure.cosmos.implementation.HttpConstants;
import com.azure.cosmos.implementation.ItemSerializer;
import com.azure.cosmos.implementation.FeedResponseDiagnostics;
import com.azure.cosmos.implementation.JsonSerializable;
import com.azure.cosmos.implementation.MetadataDiagnosticsContext;
import com.azure.cosmos.implementation.QueryMetrics;
import com.azure.cosmos.implementation.ReplicationPolicy;
import com.azure.cosmos.implementation.RequestTimeline;
import com.azure.cosmos.implementation.Resource;
import com.azure.cosmos.implementation.ResourceResponse;
import com.azure.cosmos.implementation.RxDocumentServiceRequest;
import com.azure.cosmos.implementation.RxDocumentServiceResponse;
import com.azure.cosmos.implementation.SerializationDiagnosticsContext;
import com.azure.cosmos.implementation.ServiceUnavailableException;
import com.azure.cosmos.implementation.StoredProcedureResponse;
import com.azure.cosmos.implementation.Warning;
import com.azure.cosmos.implementation.directconnectivity.StoreResponse;
import com.azure.cosmos.implementation.directconnectivity.StoreResult;
import com.azure.cosmos.implementation.directconnectivity.Uri;
import com.azure.cosmos.implementation.encryption.api.DataEncryptionKeyProvider;
import com.azure.cosmos.implementation.encryption.api.EncryptionOptions;
import com.azure.cosmos.implementation.query.metrics.ClientSideMetrics;
import com.azure.cosmos.implementation.routing.PartitionKeyInternal;
import com.azure.cosmos.models.CosmosItemResponse;
import com.azure.cosmos.models.CosmosStoredProcedureProperties;
import com.azure.cosmos.models.FeedResponse;
import com.azure.cosmos.models.ModelBridgeInternal;
import com.azure.cosmos.models.PartitionKey;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.micrometer.core.instrument.MeterRegistry;

import java.net.URI;
import java.nio.ByteBuffer;
import java.time.Duration;
import java.time.Instant;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

import static com.azure.cosmos.implementation.Warning.INTERNAL_USE_ONLY_WARNING;

/**
 * DO NOT USE.
 * This is meant to be used only internally as a bridge access to classes in
 * com.azure.cosmos
 **/
@Warning(value = INTERNAL_USE_ONLY_WARNING)
public final class BridgeInternal {

    private BridgeInternal() {}

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static Document documentFromObject(Object document, ObjectMapper mapper) {
        return Document.fromObject(document, mapper);
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static ByteBuffer serializeJsonToByteBuffer(Object document, ObjectMapper mapper, DataEncryptionKeyProvider dataEncryptionKeyProvider, EncryptionOptions encryptionOptions) {
        ItemSerializer.CosmosSerializer cosmosSerializer = new ItemSerializer.CosmosSerializer(dataEncryptionKeyProvider, encryptionOptions);
        return cosmosSerializer.serializeTo(document);
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static ByteBuffer serializeJsonToByteBuffer(Object document, ObjectMapper mapper) {
        return InternalObjectNode.serializeJsonToByteBuffer(document, mapper);
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static void monitorTelemetry(MeterRegistry registry) {
        CosmosAsyncClient.setMonitorTelemetry(registry);
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static <T extends Resource> ResourceResponse<T> toResourceResponse(RxDocumentServiceResponse response,
                                                                              Class<T> cls) {
        return new ResourceResponse<T>(response, cls);
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static <T extends Resource> FeedResponse<T> toFeedResponsePage(RxDocumentServiceResponse response,
                                                                          Class<T> cls) {
        return ModelBridgeInternal.toFeedResponsePage(response, cls);
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static <T> FeedResponse<T> toFeedResponsePage(List<T> results, Map<String, String> headers, boolean noChanges) {
        return ModelBridgeInternal.toFeedResponsePage(results, headers, noChanges);
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static <T extends Resource> FeedResponse<T> toChangeFeedResponsePage(RxDocumentServiceResponse response,
                                                                                Class<T> cls) {
        return ModelBridgeInternal.toChaneFeedResponsePage(response, cls);
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static StoredProcedureResponse toStoredProcedureResponse(RxDocumentServiceResponse response) {
        return new StoredProcedureResponse(response);
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static <T extends Resource> boolean noChanges(FeedResponse<T> page) {
        return ModelBridgeInternal.noChanges(page);
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static <T> FeedResponse<T> createFeedResponse(List<T> results,
            Map<String, String> headers) {
        return ModelBridgeInternal.createFeedResponse(results, headers);
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static <T> FeedResponse<T> createFeedResponseWithQueryMetrics(List<T> results,
            Map<String, String> headers, ConcurrentMap<String, QueryMetrics> queryMetricsMap) {
        return ModelBridgeInternal.createFeedResponseWithQueryMetrics(results, headers, queryMetricsMap);
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static CosmosDiagnostics createCosmosDiagnostics(Map<String, QueryMetrics> queryMetricsMap) {
        return new CosmosDiagnostics(new FeedResponseDiagnostics(queryMetricsMap));
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static <E extends CosmosException> E setResourceAddress(E e, String resourceAddress) {
        e.setResourceAddress(resourceAddress);
        return e;
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static <E extends CosmosException> long getLSN(E e) {
        return e.lsn;
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static <E extends CosmosException> String getPartitionKeyRangeId(E e) {
        return e.partitionKeyRangeId;
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static <E extends CosmosException> String getResourceAddress(E e) {
        return e.getResourceAddress();
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static <E extends CosmosException> E setLSN(E e, long lsn) {
        e.lsn = lsn;
        return e;
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static <E extends CosmosException> E setPartitionKeyRangeId(E e, String partitionKeyRangeId) {
        e.partitionKeyRangeId = partitionKeyRangeId;
        return e;
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static boolean isEnableMultipleWriteLocations(DatabaseAccount account) {
        return account.getEnableMultipleWriteLocations();
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static <E extends CosmosException> Uri getRequestUri(CosmosException cosmosException) {
        return cosmosException.requestUri;
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static <E extends CosmosException> void setRequestHeaders(CosmosException cosmosException,
                                                                     Map<String, String> requestHeaders) {
        cosmosException.requestHeaders = requestHeaders;
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static <E extends CosmosException> Map<String, String> getRequestHeaders(
        CosmosException cosmosException) {
        return cosmosException.requestHeaders;
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static String getAltLink(Resource resource) {
        return ModelBridgeInternal.getAltLink(resource);
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static void setAltLink(Resource resource, String altLink) {
        ModelBridgeInternal.setAltLink(resource, altLink);
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static void setMaxReplicaSetSize(ReplicationPolicy replicationPolicy, int value) {
        replicationPolicy.setMaxReplicaSetSize(value);
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static <T extends Resource> void putQueryMetricsIntoMap(FeedResponse<T> response, String partitionKeyRangeId,
                                                                   QueryMetrics queryMetrics) {
        ModelBridgeInternal.queryMetricsMap(response).put(partitionKeyRangeId, queryMetrics);
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static QueryMetrics createQueryMetricsFromDelimitedStringAndClientSideMetrics(
        String queryMetricsDelimitedString, ClientSideMetrics clientSideMetrics, String activityId) {
        return QueryMetrics.createFromDelimitedStringAndClientSideMetrics(queryMetricsDelimitedString,
            clientSideMetrics, activityId);
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static QueryMetrics createQueryMetricsFromCollection(Collection<QueryMetrics> queryMetricsCollection) {
        return QueryMetrics.createFromCollection(queryMetricsCollection);
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static ClientSideMetrics getClientSideMetrics(QueryMetrics queryMetrics) {
        return queryMetrics.getClientSideMetrics();
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static String getInnerErrorMessage(CosmosException cosmosException) {
        if (cosmosException == null) {
            return null;
        }
        return cosmosException.innerErrorMessage();
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static PartitionKey getPartitionKey(PartitionKeyInternal partitionKeyInternal) {
        return new PartitionKey(partitionKeyInternal);
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static <T> void setProperty(JsonSerializable jsonSerializable, String propertyName, T value) {
        ModelBridgeInternal.setProperty(jsonSerializable, propertyName, value);
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static ObjectNode getObject(JsonSerializable jsonSerializable, String propertyName) {
        return ModelBridgeInternal.getObjectNodeFromJsonSerializable(jsonSerializable, propertyName);
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static void remove(JsonSerializable jsonSerializable, String propertyName) {
        ModelBridgeInternal.removeFromJsonSerializable(jsonSerializable, propertyName);
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static CosmosStoredProcedureProperties createCosmosStoredProcedureProperties(String jsonString) {
        return ModelBridgeInternal.createCosmosStoredProcedureProperties(jsonString);
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static Object getValue(JsonNode value) {
        return ModelBridgeInternal.getValue(value);
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static CosmosException setCosmosDiagnostics(
                                            CosmosException cosmosException,
                                            CosmosDiagnostics cosmosDiagnostics) {
        return cosmosException.setDiagnostics(cosmosDiagnostics);
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static CosmosException createCosmosException(int statusCode) {
        return new CosmosException(statusCode, null, null, null);
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static CosmosException createCosmosException(int statusCode, String errorMessage) {
        CosmosException cosmosException = new CosmosException(statusCode, errorMessage, null, null);
        cosmosException.setError(new CosmosError());
        ModelBridgeInternal.setProperty(cosmosException.getError(), Constants.Properties.MESSAGE, errorMessage);
        return cosmosException;
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static CosmosException createCosmosException(int statusCode, Exception innerException) {
        return new CosmosException(statusCode, null, null, innerException);
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static CosmosException createCosmosException(int statusCode, CosmosError cosmosErrorResource,
                                                        Map<String, String> responseHeaders) {
        return new CosmosException(/* resourceAddress */ null, statusCode, cosmosErrorResource, responseHeaders);
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static CosmosException createCosmosException(String resourceAddress,
                                                        int statusCode,
                                                        CosmosError cosmosErrorResource,
                                                        Map<String, String> responseHeaders) {
        CosmosException cosmosException = new CosmosException(statusCode,
            cosmosErrorResource == null ? null : cosmosErrorResource.getMessage(), responseHeaders, null);
        cosmosException.setResourceAddress(resourceAddress);
        cosmosException.setError(cosmosErrorResource);
        return cosmosException;
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static CosmosError getCosmosError(CosmosException cosmosException) {
        return cosmosException == null ? null : cosmosException.getError();
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static CosmosException createCosmosException(String message,
                                                        Exception exception,
                                                        Map<String, String> responseHeaders,
                                                        int statusCode,
                                                        String resourceAddress) {
        CosmosException cosmosException = new CosmosException(statusCode, message, responseHeaders,
            exception);
        cosmosException.setResourceAddress(resourceAddress);
        return cosmosException;
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static Configs extractConfigs(CosmosClientBuilder cosmosClientBuilder) {
        return cosmosClientBuilder.configs();
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static CosmosClientBuilder injectConfigs(CosmosClientBuilder cosmosClientBuilder, Configs configs) {
        return cosmosClientBuilder.configs(configs);
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static String extractContainerSelfLink(CosmosAsyncContainer container) {
        return container.getLink();
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static String extractResourceSelfLink(Resource resource) {
        return resource.getSelfLink();
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static void setResourceSelfLink(Resource resource, String selfLink) {
        ModelBridgeInternal.setResourceSelfLink(resource, selfLink);
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static void setTimestamp(Resource resource, Instant date) {
        ModelBridgeInternal.setTimestamp(resource, date);
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static CosmosDiagnostics createCosmosDiagnostics() {
        return new CosmosDiagnostics();
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static void setTransportClientRequestTimelineOnDiagnostics(CosmosDiagnostics cosmosDiagnostics,
                                                                      RequestTimeline requestTimeline) {
        cosmosDiagnostics.clientSideRequestStatistics().setTransportClientRequestTimeline(requestTimeline);
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static void recordResponse(CosmosDiagnostics cosmosDiagnostics,
                                      RxDocumentServiceRequest request, StoreResult storeResult) {
        cosmosDiagnostics.clientSideRequestStatistics().recordResponse(request, storeResult);
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static void recordRetryContext(CosmosDiagnostics cosmosDiagnostics,
                                          RxDocumentServiceRequest request) {
        cosmosDiagnostics.clientSideRequestStatistics().recordRetryContext(request);
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static MetadataDiagnosticsContext getMetaDataDiagnosticContext(CosmosDiagnostics cosmosDiagnostics){
        if(cosmosDiagnostics == null) {
            return null;
        }

        return cosmosDiagnostics.clientSideRequestStatistics().getMetadataDiagnosticsContext();
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static SerializationDiagnosticsContext getSerializationDiagnosticsContext(CosmosDiagnostics cosmosDiagnostics){
        if(cosmosDiagnostics == null) {
            return null;
        }

        return cosmosDiagnostics.clientSideRequestStatistics().getSerializationDiagnosticsContext();
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static void recordGatewayResponse(CosmosDiagnostics cosmosDiagnostics,
                                             RxDocumentServiceRequest rxDocumentServiceRequest,
                                             StoreResponse storeResponse,
                                             CosmosException exception) {
        cosmosDiagnostics.clientSideRequestStatistics().recordGatewayResponse(rxDocumentServiceRequest, storeResponse, exception);
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static String recordAddressResolutionStart(CosmosDiagnostics cosmosDiagnostics,
                                                      URI targetEndpoint) {
        return cosmosDiagnostics.clientSideRequestStatistics().recordAddressResolutionStart(targetEndpoint);
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static void recordAddressResolutionEnd(CosmosDiagnostics cosmosDiagnostics,
                                                  String identifier) {
        cosmosDiagnostics.clientSideRequestStatistics().recordAddressResolutionEnd(identifier);
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static List<URI> getContactedReplicas(CosmosDiagnostics cosmosDiagnostics) {
        return cosmosDiagnostics.clientSideRequestStatistics().getContactedReplicas();
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static void setContactedReplicas(CosmosDiagnostics cosmosDiagnostics,
                                            List<URI> contactedReplicas) {
        cosmosDiagnostics.clientSideRequestStatistics().setContactedReplicas(contactedReplicas);
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static Set<URI> getFailedReplicas(CosmosDiagnostics cosmosDiagnostics) {
        return cosmosDiagnostics.clientSideRequestStatistics().getFailedReplicas();
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static <T> ConcurrentMap<String, QueryMetrics> queryMetricsFromFeedResponse(FeedResponse<T> feedResponse) {
        return ModelBridgeInternal.queryMetrics(feedResponse);
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static PartitionKeyInternal getPartitionKeyInternal(PartitionKey partitionKey) {
        return ModelBridgeInternal.getPartitionKeyInternal(partitionKey);
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static <T> InternalObjectNode getProperties(CosmosItemResponse<T> cosmosItemResponse) {
        return ModelBridgeInternal.getInternalObjectNode(cosmosItemResponse);
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static String getLink(CosmosAsyncContainer cosmosAsyncContainer) {
        return cosmosAsyncContainer.getLink();
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static CosmosAsyncConflict createCosmosAsyncConflict(String id, CosmosAsyncContainer container) {
        return new CosmosAsyncConflict(id, container);
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static CosmosAsyncContainer createCosmosAsyncContainer(String id, CosmosAsyncDatabase database) {
        return new CosmosAsyncContainer(id, database);
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static CosmosAsyncDatabase createCosmosAsyncDatabase(String id, CosmosAsyncClient client) {
        return new CosmosAsyncDatabase(id, client);
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static CosmosAsyncPermission createCosmosAsyncPermission(String id, CosmosAsyncUser user) {
        return new CosmosAsyncPermission(id, user);
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static CosmosAsyncUserDefinedFunction createCosmosAsyncUserDefinedFunction(String id, CosmosAsyncContainer container) {
        return new CosmosAsyncUserDefinedFunction(id, container);
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static CosmosAsyncUser createCosmosAsyncUser(String id, CosmosAsyncDatabase database) {
        return new CosmosAsyncUser(id, database);
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static CosmosDatabase createCosmosDatabase(String id, CosmosClient client, CosmosAsyncDatabase database) {
        return new CosmosDatabase(id, client, database);
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static CosmosUser createCosmosUser(CosmosAsyncUser asyncUser, CosmosDatabase database, String id) {
        return new CosmosUser(asyncUser, database, id);
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static ConsistencyLevel fromServiceSerializedFormat(String consistencyLevel) {
        return ConsistencyLevel.fromServiceSerializedFormat(consistencyLevel);
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static CosmosException createServiceUnavailableException(Exception innerException) {
        return new ServiceUnavailableException(innerException.getMessage(), innerException, null, null);
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static Duration getRequestTimeoutFromDirectConnectionConfig(DirectConnectionConfig directConnectionConfig) {
        return directConnectionConfig.getRequestTimeout();
    }

    @Warning(value = INTERNAL_USE_ONLY_WARNING)
    public static Duration getRequestTimeoutFromGatewayConnectionConfig(GatewayConnectionConfig gatewayConnectionConfig) {
        return gatewayConnectionConfig.getRequestTimeout();
    }
}
