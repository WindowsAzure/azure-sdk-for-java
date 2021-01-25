// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.queue.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.serializer.CollectionFormat;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.storage.queue.implementation.models.ServicesGetPropertiesResponse;
import com.azure.storage.queue.implementation.models.ServicesGetStatisticsResponse;
import com.azure.storage.queue.implementation.models.ServicesListQueuesSegmentNextResponse;
import com.azure.storage.queue.implementation.models.ServicesListQueuesSegmentResponse;
import com.azure.storage.queue.implementation.models.ServicesSetPropertiesResponse;
import com.azure.storage.queue.implementation.models.StorageErrorException;
import com.azure.storage.queue.models.QueueItem;
import com.azure.storage.queue.models.QueueServiceProperties;
import java.util.List;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Services. */
public final class ServicesImpl {
    /** The proxy service used to perform REST calls. */
    private final ServicesService service;

    /** The service client containing this operation class. */
    private final AzureQueueStorageImpl client;

    /**
     * Initializes an instance of ServicesImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ServicesImpl(AzureQueueStorageImpl client) {
        this.service = RestProxy.create(ServicesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureQueueStorageServices to be used by the proxy service to perform
     * REST calls.
     */
    @Host("{url}")
    @ServiceInterface(name = "AzureQueueStorageSer")
    private interface ServicesService {
        @Put("/")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        @UnexpectedResponseExceptionType(com.azure.storage.queue.models.QueueStorageException.class)
        Mono<ServicesSetPropertiesResponse> setProperties(
                @HostParam("url") String url,
                @QueryParam("restype") String restype,
                @QueryParam("comp") String comp,
                @QueryParam("timeout") Integer timeout,
                @HeaderParam("x-ms-version") String version,
                @HeaderParam("x-ms-client-request-id") String requestId,
                @BodyParam("application/xml") QueueServiceProperties properties,
                @HeaderParam("Accept") String accept,
                Context context);

        @Get("/")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        @UnexpectedResponseExceptionType(com.azure.storage.queue.models.QueueStorageException.class)
        Mono<ServicesGetPropertiesResponse> getProperties(
                @HostParam("url") String url,
                @QueryParam("restype") String restype,
                @QueryParam("comp") String comp,
                @QueryParam("timeout") Integer timeout,
                @HeaderParam("x-ms-version") String version,
                @HeaderParam("x-ms-client-request-id") String requestId,
                @HeaderParam("Accept") String accept,
                Context context);

        @Get("/")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        @UnexpectedResponseExceptionType(com.azure.storage.queue.models.QueueStorageException.class)
        Mono<ServicesGetStatisticsResponse> getStatistics(
                @HostParam("url") String url,
                @QueryParam("restype") String restype,
                @QueryParam("comp") String comp,
                @QueryParam("timeout") Integer timeout,
                @HeaderParam("x-ms-version") String version,
                @HeaderParam("x-ms-client-request-id") String requestId,
                @HeaderParam("Accept") String accept,
                Context context);

        @Get("/")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        @UnexpectedResponseExceptionType(com.azure.storage.queue.models.QueueStorageException.class)
        Mono<ServicesListQueuesSegmentResponse> listQueuesSegment(
                @HostParam("url") String url,
                @QueryParam("comp") String comp,
                @QueryParam("prefix") String prefix,
                @QueryParam("marker") String marker,
                @QueryParam("maxresults") Integer maxresults,
                @QueryParam("include") String include,
                @QueryParam("timeout") Integer timeout,
                @HeaderParam("x-ms-version") String version,
                @HeaderParam("x-ms-client-request-id") String requestId,
                @HeaderParam("Accept") String accept,
                Context context);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        @UnexpectedResponseExceptionType(com.azure.storage.queue.models.QueueStorageException.class)
        Mono<ServicesListQueuesSegmentNextResponse> listQueuesSegmentNext(
                @PathParam(value = "nextLink", encoded = true) String nextLink,
                @HostParam("url") String url,
                @HeaderParam("x-ms-version") String version,
                @HeaderParam("x-ms-client-request-id") String requestId,
                @HeaderParam("Accept") String accept,
                Context context);
    }

    /**
     * Sets properties for a storage account's Queue service endpoint, including properties for Storage Analytics and
     * CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param properties The StorageService properties.
     * @param timeout The The timeout parameter is expressed in seconds. For more information, see &lt;a
     *     href="https://docs.microsoft.com/en-us/rest/api/storageservices/setting-timeouts-for-queue-service-operations&gt;Setting
     *     Timeouts for Queue Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when storage analytics logging is enabled.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServicesSetPropertiesResponse> setPropertiesWithResponseAsync(
            QueueServiceProperties properties, Integer timeout, String requestId, Context context) {
        final String restype = "service";
        final String comp = "properties";
        final String accept = "application/xml";
        return service.setProperties(
                this.client.getUrl(),
                restype,
                comp,
                timeout,
                this.client.getVersion(),
                requestId,
                properties,
                accept,
                context);
    }

    /**
     * gets the properties of a storage account's Queue service, including properties for Storage Analytics and CORS
     * (Cross-Origin Resource Sharing) rules.
     *
     * @param timeout The The timeout parameter is expressed in seconds. For more information, see &lt;a
     *     href="https://docs.microsoft.com/en-us/rest/api/storageservices/setting-timeouts-for-queue-service-operations&gt;Setting
     *     Timeouts for Queue Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when storage analytics logging is enabled.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of a storage account's Queue service, including properties for Storage Analytics and CORS
     *     (Cross-Origin Resource Sharing) rules.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServicesGetPropertiesResponse> getPropertiesWithResponseAsync(
            Integer timeout, String requestId, Context context) {
        final String restype = "service";
        final String comp = "properties";
        final String accept = "application/xml";
        return service.getProperties(
                this.client.getUrl(), restype, comp, timeout, this.client.getVersion(), requestId, accept, context);
    }

    /**
     * Retrieves statistics related to replication for the Queue service. It is only available on the secondary location
     * endpoint when read-access geo-redundant replication is enabled for the storage account.
     *
     * @param timeout The The timeout parameter is expressed in seconds. For more information, see &lt;a
     *     href="https://docs.microsoft.com/en-us/rest/api/storageservices/setting-timeouts-for-queue-service-operations&gt;Setting
     *     Timeouts for Queue Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when storage analytics logging is enabled.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return statistics for the storage service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServicesGetStatisticsResponse> getStatisticsWithResponseAsync(
            Integer timeout, String requestId, Context context) {
        final String restype = "service";
        final String comp = "stats";
        final String accept = "application/xml";
        return service.getStatistics(
                this.client.getUrl(), restype, comp, timeout, this.client.getVersion(), requestId, accept, context);
    }

    /**
     * The List Queues Segment operation returns a list of the queues under the specified account.
     *
     * @param prefix Filters the results to return only queues whose name begins with the specified prefix.
     * @param marker A string value that identifies the portion of the list of queues to be returned with the next
     *     listing operation. The operation returns the NextMarker value within the response body if the listing
     *     operation did not return all queues remaining to be listed with the current page. The NextMarker value can be
     *     used as the value for the marker parameter in a subsequent call to request the next page of list items. The
     *     marker value is opaque to the client.
     * @param maxresults Specifies the maximum number of queues to return. If the request does not specify maxresults,
     *     or specifies a value greater than 5000, the server will return up to 5000 items. Note that if the listing
     *     operation crosses a partition boundary, then the service will return a continuation token for retrieving the
     *     remainder of the results. For this reason, it is possible that the service will return fewer results than
     *     specified by maxresults, or than the default of 5000.
     * @param include Include this parameter to specify that the queues's metadata be returned as part of the response
     *     body.
     * @param timeout The The timeout parameter is expressed in seconds. For more information, see &lt;a
     *     href="https://docs.microsoft.com/en-us/rest/api/storageservices/setting-timeouts-for-queue-service-operations&gt;Setting
     *     Timeouts for Queue Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when storage analytics logging is enabled.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the object returned when calling List Queues on a Queue Service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<QueueItem>> listQueuesSegmentSinglePageAsync(
            String prefix,
            String marker,
            Integer maxresults,
            List<String> include,
            Integer timeout,
            String requestId,
            Context context) {
        final String comp = "list";
        final String accept = "application/xml";
        String includeConverted =
                JacksonAdapter.createDefaultSerializerAdapter().serializeList(include, CollectionFormat.CSV);
        return service.listQueuesSegment(
                        this.client.getUrl(),
                        comp,
                        prefix,
                        marker,
                        maxresults,
                        includeConverted,
                        timeout,
                        this.client.getVersion(),
                        requestId,
                        accept,
                        context)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        res.getValue().getQueueItems(),
                                        res.getValue().getNextMarker(),
                                        res.getDeserializedHeaders()));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when storage analytics logging is enabled.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the object returned when calling List Queues on a Queue Service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<QueueItem>> listQueuesSegmentNextSinglePageAsync(
            String nextLink, String requestId, Context context) {
        final String accept = "application/xml";
        return service.listQueuesSegmentNext(
                        nextLink, this.client.getUrl(), this.client.getVersion(), requestId, accept, context)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        res.getValue().getQueueItems(),
                                        res.getValue().getNextMarker(),
                                        res.getDeserializedHeaders()));
    }
}
