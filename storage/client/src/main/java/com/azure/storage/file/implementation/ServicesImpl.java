// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.file.implementation;

import com.azure.core.annotations.BodyParam;
import com.azure.core.annotations.ExpectedResponses;
import com.azure.core.annotations.GET;
import com.azure.core.annotations.HeaderParam;
import com.azure.core.annotations.Host;
import com.azure.core.annotations.HostParam;
import com.azure.core.annotations.PUT;
import com.azure.core.annotations.QueryParam;
import com.azure.core.annotations.Service;
import com.azure.core.annotations.UnexpectedResponseExceptionType;
import com.azure.core.implementation.CollectionFormat;
import com.azure.core.implementation.RestProxy;
import com.azure.core.implementation.serializer.jackson.JacksonAdapter;
import com.azure.core.util.Context;
import com.azure.storage.file.models.ListSharesIncludeType;
import com.azure.storage.file.models.ServicesGetPropertiesResponse;
import com.azure.storage.file.models.ServicesListSharesSegmentResponse;
import com.azure.storage.file.models.ServicesSetPropertiesResponse;
import com.azure.storage.file.models.StorageErrorException;
import com.azure.storage.file.models.StorageServiceProperties;
import java.util.List;
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
    private AzureFileStorageImpl client;

    /**
     * Initializes an instance of ServicesImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public ServicesImpl(AzureFileStorageImpl client) {
        this.service = RestProxy.create(ServicesService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for Services to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{url}")
    @Service("Storage Files Services")
    private interface ServicesService {
        @PUT("")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<ServicesSetPropertiesResponse> setProperties(@HostParam("url") String url, @BodyParam("application/xml; charset=utf-8") StorageServiceProperties storageServiceProperties, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @QueryParam("restype") String restype, @QueryParam("comp") String comp, Context context);

        @GET("")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<ServicesGetPropertiesResponse> getProperties(@HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @QueryParam("restype") String restype, @QueryParam("comp") String comp, Context context);

        @GET("")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<ServicesListSharesSegmentResponse> listSharesSegment(@HostParam("url") String url, @QueryParam("prefix") String prefix, @QueryParam("marker") String marker, @QueryParam("maxresults") Integer maxresults, @QueryParam("include") String include, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @QueryParam("comp") String comp, Context context);
    }

    /**
     * Sets properties for a storage account's File service endpoint, including properties for Storage Analytics metrics and CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param storageServiceProperties The StorageService properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<ServicesSetPropertiesResponse> setPropertiesWithRestResponseAsync(StorageServiceProperties storageServiceProperties, Context context) {
        final Integer timeout = null;
        final String restype = "service";
        final String comp = "properties";
        return service.setProperties(this.client.url(), storageServiceProperties, timeout, this.client.version(), restype, comp, context);
    }

    /**
     * Sets properties for a storage account's File service endpoint, including properties for Storage Analytics metrics and CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param storageServiceProperties The StorageService properties.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/Setting-Timeouts-for-File-Service-Operations?redirectedfrom=MSDN"&gt;Setting Timeouts for File Service Operations.&lt;/a&gt;.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<ServicesSetPropertiesResponse> setPropertiesWithRestResponseAsync(StorageServiceProperties storageServiceProperties, Integer timeout, Context context) {
        final String restype = "service";
        final String comp = "properties";
        return service.setProperties(this.client.url(), storageServiceProperties, timeout, this.client.version(), restype, comp, context);
    }

    /**
     * Gets the properties of a storage account's File service, including properties for Storage Analytics metrics and CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<ServicesGetPropertiesResponse> getPropertiesWithRestResponseAsync(Context context) {
        final Integer timeout = null;
        final String restype = "service";
        final String comp = "properties";
        return service.getProperties(this.client.url(), timeout, this.client.version(), restype, comp, context);
    }

    /**
     * Gets the properties of a storage account's File service, including properties for Storage Analytics metrics and CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/Setting-Timeouts-for-File-Service-Operations?redirectedfrom=MSDN"&gt;Setting Timeouts for File Service Operations.&lt;/a&gt;.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<ServicesGetPropertiesResponse> getPropertiesWithRestResponseAsync(Integer timeout, Context context) {
        final String restype = "service";
        final String comp = "properties";
        return service.getProperties(this.client.url(), timeout, this.client.version(), restype, comp, context);
    }

    /**
     * The List Shares Segment operation returns a list of the shares and share snapshots under the specified account.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<ServicesListSharesSegmentResponse> listSharesSegmentWithRestResponseAsync(Context context) {
        final String prefix = null;
        final String marker = null;
        final Integer maxresults = null;
        final Integer timeout = null;
        final String comp = "list";
        String includeConverted = null;
        return service.listSharesSegment(this.client.url(), prefix, marker, maxresults, includeConverted, timeout, this.client.version(), comp, context);
    }

    /**
     * The List Shares Segment operation returns a list of the shares and share snapshots under the specified account.
     *
     * @param prefix Filters the results to return only entries whose name begins with the specified prefix.
     * @param marker A string value that identifies the portion of the list to be returned with the next list operation. The operation returns a marker value within the response body if the list returned was not complete. The marker value may then be used in a subsequent call to request the next set of list items. The marker value is opaque to the client.
     * @param maxresults Specifies the maximum number of entries to return. If the request does not specify maxresults, or specifies a value greater than 5,000, the server will return up to 5,000 items.
     * @param include Include this parameter to specify one or more datasets to include in the response.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/Setting-Timeouts-for-File-Service-Operations?redirectedfrom=MSDN"&gt;Setting Timeouts for File Service Operations.&lt;/a&gt;.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<ServicesListSharesSegmentResponse> listSharesSegmentWithRestResponseAsync(String prefix, String marker, Integer maxresults, List<ListSharesIncludeType> include, Integer timeout, Context context) {
        final String comp = "list";
        String includeConverted = JacksonAdapter.createDefaultSerializerAdapter().serializeList(include, CollectionFormat.CSV);
        return service.listSharesSegment(this.client.url(), prefix, marker, maxresults, includeConverted, timeout, this.client.version(), comp, context);
    }
}
