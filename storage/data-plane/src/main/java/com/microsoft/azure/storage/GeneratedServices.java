// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.storage;

import com.microsoft.azure.storage.blob.models.ListContainersIncludeType;
import com.microsoft.azure.storage.blob.models.ListContainersSegmentResponse;
import com.microsoft.azure.storage.blob.models.ServiceGetAccountInfoResponse;
import com.microsoft.azure.storage.blob.models.ServiceGetPropertiesResponse;
import com.microsoft.azure.storage.blob.models.ServiceGetStatisticsResponse;
import com.microsoft.azure.storage.blob.models.ServiceListContainersSegmentResponse;
import com.microsoft.azure.storage.blob.models.ServiceSetPropertiesResponse;
import com.microsoft.azure.storage.blob.models.StorageErrorException;
import com.microsoft.azure.storage.blob.models.StorageServiceProperties;
import com.microsoft.azure.storage.blob.models.StorageServiceStats;
import com.microsoft.rest.v2.Context;
import com.microsoft.rest.v2.RestProxy;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.Validator;
import com.microsoft.rest.v2.annotations.BodyParam;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.GET;
import com.microsoft.rest.v2.annotations.HeaderParam;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.HostParam;
import com.microsoft.rest.v2.annotations.PUT;
import com.microsoft.rest.v2.annotations.QueryParam;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Single;
import io.reactivex.annotations.NonNull;

/**
 * An instance of this class provides access to all the operations defined in
 * GeneratedServices.
 */
public final class GeneratedServices {
    /**
     * The proxy service used to perform REST calls.
     */
    private ServicesService service;

    /**
     * The service client containing this operation class.
     */
    private GeneratedStorageClient client;

    /**
     * Initializes an instance of GeneratedServices.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public GeneratedServices(GeneratedStorageClient client) {
        this.service = RestProxy.create(ServicesService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for GeneratedServices to be used
     * by the proxy service to perform REST calls.
     */
    @Host("{url}")
    private interface ServicesService {
        @PUT("")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Single<ServiceSetPropertiesResponse> setProperties(Context context, @HostParam("url") String url, @BodyParam("application/xml; charset=utf-8") StorageServiceProperties storageServiceProperties, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("restype") String restype, @QueryParam("comp") String comp);

        @GET("")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Single<ServiceGetPropertiesResponse> getProperties(Context context, @HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("restype") String restype, @QueryParam("comp") String comp);

        @GET("")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Single<ServiceGetStatisticsResponse> getStatistics(Context context, @HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("restype") String restype, @QueryParam("comp") String comp);

        @GET("")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Single<ServiceListContainersSegmentResponse> listContainersSegment(Context context, @HostParam("url") String url, @QueryParam("prefix") String prefix, @QueryParam("marker") String marker, @QueryParam("maxresults") Integer maxresults, @QueryParam("include") ListContainersIncludeType include, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("comp") String comp);

        @GET("")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Single<ServiceGetAccountInfoResponse> getAccountInfo(Context context, @HostParam("url") String url, @HeaderParam("x-ms-version") String version, @QueryParam("restype") String restype, @QueryParam("comp") String comp);
    }

    /**
     * Sets properties for a storage account's Blob service endpoint, including properties for Storage Analytics and CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param context The context to associate with this operation.
     * @param storageServiceProperties The StorageService properties.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void setProperties(Context context, @NonNull StorageServiceProperties storageServiceProperties, Integer timeout, String requestId) {
        setPropertiesAsync(context, storageServiceProperties, timeout, requestId).blockingAwait();
    }

    /**
     * Sets properties for a storage account's Blob service endpoint, including properties for Storage Analytics and CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param context The context to associate with this operation.
     * @param storageServiceProperties The StorageService properties.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Void> setPropertiesAsync(Context context, @NonNull StorageServiceProperties storageServiceProperties, Integer timeout, String requestId, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(setPropertiesAsync(context, storageServiceProperties, timeout, requestId), serviceCallback);
    }

    /**
     * Sets properties for a storage account's Blob service endpoint, including properties for Storage Analytics and CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param context The context to associate with this operation.
     * @param storageServiceProperties The StorageService properties.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<ServiceSetPropertiesResponse> setPropertiesWithRestResponseAsync(Context context, @NonNull StorageServiceProperties storageServiceProperties, Integer timeout, String requestId) {
        if (this.client.url() == null) {
            throw new IllegalArgumentException("Parameter this.client.url() is required and cannot be null.");
        }
        if (storageServiceProperties == null) {
            throw new IllegalArgumentException("Parameter storageServiceProperties is required and cannot be null.");
        }
        if (this.client.version() == null) {
            throw new IllegalArgumentException("Parameter this.client.version() is required and cannot be null.");
        }
        Validator.validate(storageServiceProperties);
        final String restype = "service";
        final String comp = "properties";
        return service.setProperties(context, this.client.url(), storageServiceProperties, timeout, this.client.version(), requestId, restype, comp);
    }

    /**
     * Sets properties for a storage account's Blob service endpoint, including properties for Storage Analytics and CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param context The context to associate with this operation.
     * @param storageServiceProperties The StorageService properties.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Completable setPropertiesAsync(Context context, @NonNull StorageServiceProperties storageServiceProperties, Integer timeout, String requestId) {
        return setPropertiesWithRestResponseAsync(context, storageServiceProperties, timeout, requestId)
            .toCompletable();
    }

    /**
     * gets the properties of a storage account's Blob service, including properties for Storage Analytics and CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param context The context to associate with this operation.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the StorageServiceProperties object if successful.
     */
    public StorageServiceProperties getProperties(Context context, Integer timeout, String requestId) {
        return getPropertiesAsync(context, timeout, requestId).blockingGet();
    }

    /**
     * gets the properties of a storage account's Blob service, including properties for Storage Analytics and CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param context The context to associate with this operation.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<StorageServiceProperties> getPropertiesAsync(Context context, Integer timeout, String requestId, ServiceCallback<StorageServiceProperties> serviceCallback) {
        return ServiceFuture.fromBody(getPropertiesAsync(context, timeout, requestId), serviceCallback);
    }

    /**
     * gets the properties of a storage account's Blob service, including properties for Storage Analytics and CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param context The context to associate with this operation.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<ServiceGetPropertiesResponse> getPropertiesWithRestResponseAsync(Context context, Integer timeout, String requestId) {
        if (this.client.url() == null) {
            throw new IllegalArgumentException("Parameter this.client.url() is required and cannot be null.");
        }
        if (this.client.version() == null) {
            throw new IllegalArgumentException("Parameter this.client.version() is required and cannot be null.");
        }
        final String restype = "service";
        final String comp = "properties";
        return service.getProperties(context, this.client.url(), timeout, this.client.version(), requestId, restype, comp);
    }

    /**
     * gets the properties of a storage account's Blob service, including properties for Storage Analytics and CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param context The context to associate with this operation.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<StorageServiceProperties> getPropertiesAsync(Context context, Integer timeout, String requestId) {
        return getPropertiesWithRestResponseAsync(context, timeout, requestId)
            .flatMapMaybe((ServiceGetPropertiesResponse res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * Retrieves statistics related to replication for the Blob service. It is only available on the secondary location endpoint when read-access geo-redundant replication is enabled for the storage account.
     *
     * @param context The context to associate with this operation.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the StorageServiceStats object if successful.
     */
    public StorageServiceStats getStatistics(Context context, Integer timeout, String requestId) {
        return getStatisticsAsync(context, timeout, requestId).blockingGet();
    }

    /**
     * Retrieves statistics related to replication for the Blob service. It is only available on the secondary location endpoint when read-access geo-redundant replication is enabled for the storage account.
     *
     * @param context The context to associate with this operation.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<StorageServiceStats> getStatisticsAsync(Context context, Integer timeout, String requestId, ServiceCallback<StorageServiceStats> serviceCallback) {
        return ServiceFuture.fromBody(getStatisticsAsync(context, timeout, requestId), serviceCallback);
    }

    /**
     * Retrieves statistics related to replication for the Blob service. It is only available on the secondary location endpoint when read-access geo-redundant replication is enabled for the storage account.
     *
     * @param context The context to associate with this operation.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<ServiceGetStatisticsResponse> getStatisticsWithRestResponseAsync(Context context, Integer timeout, String requestId) {
        if (this.client.url() == null) {
            throw new IllegalArgumentException("Parameter this.client.url() is required and cannot be null.");
        }
        if (this.client.version() == null) {
            throw new IllegalArgumentException("Parameter this.client.version() is required and cannot be null.");
        }
        final String restype = "service";
        final String comp = "stats";
        return service.getStatistics(context, this.client.url(), timeout, this.client.version(), requestId, restype, comp);
    }

    /**
     * Retrieves statistics related to replication for the Blob service. It is only available on the secondary location endpoint when read-access geo-redundant replication is enabled for the storage account.
     *
     * @param context The context to associate with this operation.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<StorageServiceStats> getStatisticsAsync(Context context, Integer timeout, String requestId) {
        return getStatisticsWithRestResponseAsync(context, timeout, requestId)
            .flatMapMaybe((ServiceGetStatisticsResponse res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * The List Containers Segment operation returns a list of the containers under the specified account.
     *
     * @param context The context to associate with this operation.
     * @param prefix Filters the results to return only containers whose name begins with the specified prefix.
     * @param marker A string value that identifies the portion of the list of containers to be returned with the next listing operation. The operation returns the NextMarker value within the response body if the listing operation did not return all containers remaining to be listed with the current page. The NextMarker value can be used as the value for the marker parameter in a subsequent call to request the next page of list items. The marker value is opaque to the client.
     * @param maxresults Specifies the maximum number of containers to return. If the request does not specify maxresults, or specifies a value greater than 5000, the server will return up to 5000 items. Note that if the listing operation crosses a partition boundary, then the service will return a continuation token for retrieving the remainder of the results. For this reason, it is possible that the service will return fewer results than specified by maxresults, or than the default of 5000.
     * @param include Include this parameter to specify that the container's metadata be returned as part of the response body. Possible values include: 'metadata'.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ListContainersSegmentResponse object if successful.
     */
    public ListContainersSegmentResponse listContainersSegment(Context context, String prefix, String marker, Integer maxresults, ListContainersIncludeType include, Integer timeout, String requestId) {
        return listContainersSegmentAsync(context, prefix, marker, maxresults, include, timeout, requestId).blockingGet();
    }

    /**
     * The List Containers Segment operation returns a list of the containers under the specified account.
     *
     * @param context The context to associate with this operation.
     * @param prefix Filters the results to return only containers whose name begins with the specified prefix.
     * @param marker A string value that identifies the portion of the list of containers to be returned with the next listing operation. The operation returns the NextMarker value within the response body if the listing operation did not return all containers remaining to be listed with the current page. The NextMarker value can be used as the value for the marker parameter in a subsequent call to request the next page of list items. The marker value is opaque to the client.
     * @param maxresults Specifies the maximum number of containers to return. If the request does not specify maxresults, or specifies a value greater than 5000, the server will return up to 5000 items. Note that if the listing operation crosses a partition boundary, then the service will return a continuation token for retrieving the remainder of the results. For this reason, it is possible that the service will return fewer results than specified by maxresults, or than the default of 5000.
     * @param include Include this parameter to specify that the container's metadata be returned as part of the response body. Possible values include: 'metadata'.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<ListContainersSegmentResponse> listContainersSegmentAsync(Context context, String prefix, String marker, Integer maxresults, ListContainersIncludeType include, Integer timeout, String requestId, ServiceCallback<ListContainersSegmentResponse> serviceCallback) {
        return ServiceFuture.fromBody(listContainersSegmentAsync(context, prefix, marker, maxresults, include, timeout, requestId), serviceCallback);
    }

    /**
     * The List Containers Segment operation returns a list of the containers under the specified account.
     *
     * @param context The context to associate with this operation.
     * @param prefix Filters the results to return only containers whose name begins with the specified prefix.
     * @param marker A string value that identifies the portion of the list of containers to be returned with the next listing operation. The operation returns the NextMarker value within the response body if the listing operation did not return all containers remaining to be listed with the current page. The NextMarker value can be used as the value for the marker parameter in a subsequent call to request the next page of list items. The marker value is opaque to the client.
     * @param maxresults Specifies the maximum number of containers to return. If the request does not specify maxresults, or specifies a value greater than 5000, the server will return up to 5000 items. Note that if the listing operation crosses a partition boundary, then the service will return a continuation token for retrieving the remainder of the results. For this reason, it is possible that the service will return fewer results than specified by maxresults, or than the default of 5000.
     * @param include Include this parameter to specify that the container's metadata be returned as part of the response body. Possible values include: 'metadata'.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<ServiceListContainersSegmentResponse> listContainersSegmentWithRestResponseAsync(Context context, String prefix, String marker, Integer maxresults, ListContainersIncludeType include, Integer timeout, String requestId) {
        if (this.client.url() == null) {
            throw new IllegalArgumentException("Parameter this.client.url() is required and cannot be null.");
        }
        if (this.client.version() == null) {
            throw new IllegalArgumentException("Parameter this.client.version() is required and cannot be null.");
        }
        final String comp = "list";
        return service.listContainersSegment(context, this.client.url(), prefix, marker, maxresults, include, timeout, this.client.version(), requestId, comp);
    }

    /**
     * The List Containers Segment operation returns a list of the containers under the specified account.
     *
     * @param context The context to associate with this operation.
     * @param prefix Filters the results to return only containers whose name begins with the specified prefix.
     * @param marker A string value that identifies the portion of the list of containers to be returned with the next listing operation. The operation returns the NextMarker value within the response body if the listing operation did not return all containers remaining to be listed with the current page. The NextMarker value can be used as the value for the marker parameter in a subsequent call to request the next page of list items. The marker value is opaque to the client.
     * @param maxresults Specifies the maximum number of containers to return. If the request does not specify maxresults, or specifies a value greater than 5000, the server will return up to 5000 items. Note that if the listing operation crosses a partition boundary, then the service will return a continuation token for retrieving the remainder of the results. For this reason, it is possible that the service will return fewer results than specified by maxresults, or than the default of 5000.
     * @param include Include this parameter to specify that the container's metadata be returned as part of the response body. Possible values include: 'metadata'.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<ListContainersSegmentResponse> listContainersSegmentAsync(Context context, String prefix, String marker, Integer maxresults, ListContainersIncludeType include, Integer timeout, String requestId) {
        return listContainersSegmentWithRestResponseAsync(context, prefix, marker, maxresults, include, timeout, requestId)
            .flatMapMaybe((ServiceListContainersSegmentResponse res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * Returns the sku name and account kind.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void getAccountInfo(Context context) {
        getAccountInfoAsync(context).blockingAwait();
    }

    /**
     * Returns the sku name and account kind.
     *
     * @param context The context to associate with this operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Void> getAccountInfoAsync(Context context, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(getAccountInfoAsync(context), serviceCallback);
    }

    /**
     * Returns the sku name and account kind.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<ServiceGetAccountInfoResponse> getAccountInfoWithRestResponseAsync(Context context) {
        if (this.client.url() == null) {
            throw new IllegalArgumentException("Parameter this.client.url() is required and cannot be null.");
        }
        if (this.client.version() == null) {
            throw new IllegalArgumentException("Parameter this.client.version() is required and cannot be null.");
        }
        final String restype = "account";
        final String comp = "properties";
        return service.getAccountInfo(context, this.client.url(), this.client.version(), restype, comp);
    }

    /**
     * Returns the sku name and account kind.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Completable getAccountInfoAsync(Context context) {
        return getAccountInfoWithRestResponseAsync(context)
            .toCompletable();
    }
}
