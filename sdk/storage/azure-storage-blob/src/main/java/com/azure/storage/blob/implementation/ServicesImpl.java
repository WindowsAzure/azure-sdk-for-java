// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.implementation.RestProxy;
import com.azure.core.util.Context;
import com.azure.storage.blob.implementation.models.ServicesGetAccountInfoResponse;
import com.azure.storage.blob.implementation.models.ServicesGetPropertiesResponse;
import com.azure.storage.blob.implementation.models.ServicesGetStatisticsResponse;
import com.azure.storage.blob.implementation.models.ServicesGetUserDelegationKeyResponse;
import com.azure.storage.blob.implementation.models.ServicesListBlobContainersSegmentResponse;
import com.azure.storage.blob.implementation.models.ServicesSetPropertiesResponse;
import com.azure.storage.blob.implementation.models.ServicesSubmitBatchResponse;
import com.azure.storage.blob.models.BlobStorageException;
import com.azure.storage.blob.models.BlobServiceProperties;
import com.azure.storage.blob.models.KeyInfo;
import com.azure.storage.blob.models.ListBlobContainersIncludeType;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * Services.
 */
public final class ServicesImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private ServicesService service;

    /**
     * The service client containing this operation class.
     */
    private AzureBlobStorageImpl client;

    /**
     * Initializes an instance of ServicesImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public ServicesImpl(AzureBlobStorageImpl client) {
        this.service = RestProxy.create(ServicesService.class, client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureBlobStorageServices to
     * be used by the proxy service to perform REST calls.
     */
    @Host("{url}")
    @ServiceInterface(name = "AzureBlobStorageServices")
    private interface ServicesService {
        @Put("")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(BlobStorageException.class)
        Mono<ServicesSetPropertiesResponse> setProperties(@HostParam("url") String url, @BodyParam("application/xml; charset=utf-8") BlobServiceProperties blobServiceProperties, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("restype") String restype, @QueryParam("comp") String comp, Context context);

        @Get("")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(BlobStorageException.class)
        Mono<ServicesGetPropertiesResponse> getProperties(@HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("restype") String restype, @QueryParam("comp") String comp, Context context);

        @Get("")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(BlobStorageException.class)
        Mono<ServicesGetStatisticsResponse> getStatistics(@HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("restype") String restype, @QueryParam("comp") String comp, Context context);

        @Get("")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(BlobStorageException.class)
        Mono<ServicesListBlobContainersSegmentResponse> listBlobContainersSegment(@HostParam("url") String url, @QueryParam("prefix") String prefix, @QueryParam("marker") String marker1, @QueryParam("maxresults") Integer maxresults, @QueryParam("include") ListBlobContainersIncludeType include, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("comp") String comp, Context context);

        @Post("")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(BlobStorageException.class)
        Mono<ServicesGetUserDelegationKeyResponse> getUserDelegationKey(@HostParam("url") String url, @BodyParam("application/xml; charset=utf-8") KeyInfo keyInfo, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("restype") String restype, @QueryParam("comp") String comp, Context context);

        @Get("")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(BlobStorageException.class)
        Mono<ServicesGetAccountInfoResponse> getAccountInfo(@HostParam("url") String url, @HeaderParam("x-ms-version") String version, @QueryParam("restype") String restype, @QueryParam("comp") String comp, Context context);

        @Post("")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(BlobStorageException.class)
        Mono<ServicesSubmitBatchResponse> submitBatch(@HostParam("url") String url, @BodyParam("application/xml; charset=utf-8") Flux<ByteBuffer> body, @HeaderParam("Content-Length") long contentLength, @HeaderParam("Content-Type") String multipartContentType, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("comp") String comp, Context context);
    }

    /**
     * Sets properties for a storage account's Blob service endpoint, including properties for Storage Analytics and CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param blobServiceProperties The StorageService properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServicesSetPropertiesResponse> setPropertiesWithRestResponseAsync(BlobServiceProperties blobServiceProperties, Context context) {
        final Integer timeout = null;
        final String requestId = null;
        final String restype = "service";
        final String comp = "properties";
        return service.setProperties(this.client.getUrl(), blobServiceProperties, timeout, this.client.getVersion(), requestId, restype, comp, context);
    }

    /**
     * Sets properties for a storage account's Blob service endpoint, including properties for Storage Analytics and CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param blobServiceProperties The StorageService properties.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServicesSetPropertiesResponse> setPropertiesWithRestResponseAsync(BlobServiceProperties blobServiceProperties, Integer timeout, String requestId, Context context) {
        final String restype = "service";
        final String comp = "properties";
        return service.setProperties(this.client.getUrl(), blobServiceProperties, timeout, this.client.getVersion(), requestId, restype, comp, context);
    }

    /**
     * gets the properties of a storage account's Blob service, including properties for Storage Analytics and CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServicesGetPropertiesResponse> getPropertiesWithRestResponseAsync(Context context) {
        final Integer timeout = null;
        final String requestId = null;
        final String restype = "service";
        final String comp = "properties";
        return service.getProperties(this.client.getUrl(), timeout, this.client.getVersion(), requestId, restype, comp, context);
    }

    /**
     * gets the properties of a storage account's Blob service, including properties for Storage Analytics and CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServicesGetPropertiesResponse> getPropertiesWithRestResponseAsync(Integer timeout, String requestId, Context context) {
        final String restype = "service";
        final String comp = "properties";
        return service.getProperties(this.client.getUrl(), timeout, this.client.getVersion(), requestId, restype, comp, context);
    }

    /**
     * Retrieves statistics related to replication for the Blob service. It is only available on the secondary location endpoint when read-access geo-redundant replication is enabled for the storage account.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServicesGetStatisticsResponse> getStatisticsWithRestResponseAsync(Context context) {
        final Integer timeout = null;
        final String requestId = null;
        final String restype = "service";
        final String comp = "stats";
        return service.getStatistics(this.client.getUrl(), timeout, this.client.getVersion(), requestId, restype, comp, context);
    }

    /**
     * Retrieves statistics related to replication for the Blob service. It is only available on the secondary location endpoint when read-access geo-redundant replication is enabled for the storage account.
     *
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServicesGetStatisticsResponse> getStatisticsWithRestResponseAsync(Integer timeout, String requestId, Context context) {
        final String restype = "service";
        final String comp = "stats";
        return service.getStatistics(this.client.getUrl(), timeout, this.client.getVersion(), requestId, restype, comp, context);
    }

    /**
     * The List Containers Segment operation returns a list of the containers under the specified account.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServicesListBlobContainersSegmentResponse> listBlobContainersSegmentWithRestResponseAsync(Context context) {
        final String prefix = null;
        final String marker = null;
        final Integer maxresults = null;
        final ListBlobContainersIncludeType include = null;
        final Integer timeout = null;
        final String requestId = null;
        final String comp = "list";
        return service.listBlobContainersSegment(this.client.getUrl(), prefix, marker, maxresults, include, timeout, this.client.getVersion(), requestId, comp, context);
    }

    /**
     * The List Containers Segment operation returns a list of the containers under the specified account.
     *
     * @param prefix Filters the results to return only containers whose name begins with the specified prefix.
     * @param marker A string value that identifies the portion of the list of containers to be returned with the next listing operation. The operation returns the NextMarker value within the response body if the listing operation did not return all containers remaining to be listed with the current page. The NextMarker value can be used as the value for the marker parameter in a subsequent call to request the next page of list items. The marker value is opaque to the client.
     * @param maxresults Specifies the maximum number of containers to return. If the request does not specify maxresults, or specifies a value greater than 5000, the server will return up to 5000 items. Note that if the listing operation crosses a partition boundary, then the service will return a continuation token for retrieving the remainder of the results. For this reason, it is possible that the service will return fewer results than specified by maxresults, or than the default of 5000.
     * @param include Include this parameter to specify that the container's metadata be returned as part of the response body. Possible values include: 'metadata'.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServicesListBlobContainersSegmentResponse> listBlobContainersSegmentWithRestResponseAsync(String prefix, String marker, Integer maxresults, ListBlobContainersIncludeType include, Integer timeout, String requestId, Context context) {
        final String comp = "list";
        return service.listBlobContainersSegment(this.client.getUrl(), prefix, marker, maxresults, include, timeout, this.client.getVersion(), requestId, comp, context);
    }

    /**
     * Retrieves a user delegation key for the Blob service. This is only a valid operation when using bearer token authentication.
     *
     * @param keyInfo the KeyInfo value.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServicesGetUserDelegationKeyResponse> getUserDelegationKeyWithRestResponseAsync(KeyInfo keyInfo, Context context) {
        final Integer timeout = null;
        final String requestId = null;
        final String restype = "service";
        final String comp = "userdelegationkey";
        return service.getUserDelegationKey(this.client.getUrl(), keyInfo, timeout, this.client.getVersion(), requestId, restype, comp, context);
    }

    /**
     * Retrieves a user delegation key for the Blob service. This is only a valid operation when using bearer token authentication.
     *
     * @param keyInfo the KeyInfo value.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServicesGetUserDelegationKeyResponse> getUserDelegationKeyWithRestResponseAsync(KeyInfo keyInfo, Integer timeout, String requestId, Context context) {
        final String restype = "service";
        final String comp = "userdelegationkey";
        return service.getUserDelegationKey(this.client.getUrl(), keyInfo, timeout, this.client.getVersion(), requestId, restype, comp, context);
    }

    /**
     * Returns the sku name and account kind.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServicesGetAccountInfoResponse> getAccountInfoWithRestResponseAsync(Context context) {
        final String restype = "account";
        final String comp = "properties";
        return service.getAccountInfo(this.client.getUrl(), this.client.getVersion(), restype, comp, context);
    }

    /**
     * The Batch operation allows multiple API calls to be embedded into a single HTTP request.
     *
     * @param body Initial data.
     * @param contentLength The length of the request.
     * @param multipartContentType Required. The value of this header must be multipart/mixed with a batch boundary. Example header value: multipart/mixed; boundary=batch_&lt;GUID&gt;.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServicesSubmitBatchResponse> submitBatchWithRestResponseAsync(Flux<ByteBuffer> body, long contentLength, String multipartContentType, Context context) {
        final Integer timeout = null;
        final String requestId = null;
        final String comp = "batch";
        return service.submitBatch(this.client.getUrl(), body, contentLength, multipartContentType, timeout, this.client.getVersion(), requestId, comp, context);
    }

    /**
     * The Batch operation allows multiple API calls to be embedded into a single HTTP request.
     *
     * @param body Initial data.
     * @param contentLength The length of the request.
     * @param multipartContentType Required. The value of this header must be multipart/mixed with a batch boundary. Example header value: multipart/mixed; boundary=batch_&lt;GUID&gt;.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServicesSubmitBatchResponse> submitBatchWithRestResponseAsync(Flux<ByteBuffer> body, long contentLength, String multipartContentType, Integer timeout, String requestId, Context context) {
        final String comp = "batch";
        return service.submitBatch(this.client.getUrl(), body, contentLength, multipartContentType, timeout, this.client.getVersion(), requestId, comp, context);
    }
}
