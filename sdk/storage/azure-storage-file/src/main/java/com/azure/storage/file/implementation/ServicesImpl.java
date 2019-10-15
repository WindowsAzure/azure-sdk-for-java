// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.implementation.CollectionFormat;
import com.azure.core.implementation.RestProxy;
import com.azure.core.implementation.serializer.jackson.JacksonAdapter;
import com.azure.core.util.Context;
import com.azure.storage.file.implementation.models.ListSharesIncludeType;
import com.azure.storage.file.implementation.models.ServicesGetPropertiesResponse;
import com.azure.storage.file.implementation.models.ServicesListSharesSegmentResponse;
import com.azure.storage.file.implementation.models.ServicesSetPropertiesResponse;
import com.azure.storage.file.models.FileStorageException;
import com.azure.storage.file.models.FileServiceProperties;
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
        this.service = RestProxy.create(ServicesService.class, client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureFileStorageServices to
     * be used by the proxy service to perform REST calls.
     */
    @Host("{url}")
    @ServiceInterface(name = "AzureFileStorageServices")
    private interface ServicesService {
        @Put("")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(FileStorageException.class)
        Mono<ServicesSetPropertiesResponse> setProperties(@HostParam("url") String url, @BodyParam("application/xml; charset=utf-8") FileServiceProperties fileServiceProperties, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @QueryParam("restype") String restype, @QueryParam("comp") String comp, Context context);

        @Get("")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(FileStorageException.class)
        Mono<ServicesGetPropertiesResponse> getProperties(@HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @QueryParam("restype") String restype, @QueryParam("comp") String comp, Context context);

        @Get("")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(FileStorageException.class)
        Mono<ServicesListSharesSegmentResponse> listSharesSegment(@HostParam("url") String url, @QueryParam("prefix") String prefix, @QueryParam("marker") String marker, @QueryParam("maxresults") Integer maxresults, @QueryParam("include") String include, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @QueryParam("comp") String comp, Context context);
    }

    /**
     * Sets properties for a storage account's File service endpoint, including properties for Storage Analytics metrics and CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param fileServiceProperties The FileStorage properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServicesSetPropertiesResponse> setPropertiesWithRestResponseAsync(FileServiceProperties fileServiceProperties, Context context) {
        final Integer timeout = null;
        final String restype = "service";
        final String comp = "properties";
        return service.setProperties(this.client.getUrl(), fileServiceProperties, timeout, this.client.getVersion().getVersionString(), restype, comp, context);
    }

    /**
     * Sets properties for a storage account's File service endpoint, including properties for Storage Analytics metrics and CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param fileServiceProperties The FileStorage properties.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/Setting-Timeouts-for-File-Service-Operations?redirectedfrom=MSDN"&gt;Setting Timeouts for File Service Operations.&lt;/a&gt;.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServicesSetPropertiesResponse> setPropertiesWithRestResponseAsync(FileServiceProperties fileServiceProperties, Integer timeout, Context context) {
        final String restype = "service";
        final String comp = "properties";
        return service.setProperties(this.client.getUrl(), fileServiceProperties, timeout, this.client.getVersion().getVersionString(), restype, comp, context);
    }

    /**
     * Gets the properties of a storage account's File service, including properties for Storage Analytics metrics and CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServicesGetPropertiesResponse> getPropertiesWithRestResponseAsync(Context context) {
        final Integer timeout = null;
        final String restype = "service";
        final String comp = "properties";
        return service.getProperties(this.client.getUrl(), timeout, this.client.getVersion().getVersionString(), restype, comp, context);
    }

    /**
     * Gets the properties of a storage account's File service, including properties for Storage Analytics metrics and CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/Setting-Timeouts-for-File-Service-Operations?redirectedfrom=MSDN"&gt;Setting Timeouts for File Service Operations.&lt;/a&gt;.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServicesGetPropertiesResponse> getPropertiesWithRestResponseAsync(Integer timeout, Context context) {
        final String restype = "service";
        final String comp = "properties";
        return service.getProperties(this.client.getUrl(), timeout, this.client.getVersion().getVersionString(), restype, comp, context);
    }

    /**
     * The List Shares Segment operation returns a list of the shares and share snapshots under the specified account.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServicesListSharesSegmentResponse> listSharesSegmentWithRestResponseAsync(Context context) {
        final String prefix = null;
        final String marker = null;
        final Integer maxresults = null;
        final Integer timeout = null;
        final String comp = "list";
        String includeConverted = null;
        return service.listSharesSegment(this.client.getUrl(), prefix, marker, maxresults, includeConverted, timeout, this.client.getVersion().getVersionString(), comp, context);
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServicesListSharesSegmentResponse> listSharesSegmentWithRestResponseAsync(String prefix, String marker, Integer maxresults, List<ListSharesIncludeType> include, Integer timeout, Context context) {
        final String comp = "list";
        String includeConverted = JacksonAdapter.createDefaultSerializerAdapter().serializeList(include, CollectionFormat.CSV);
        return service.listSharesSegment(this.client.getUrl(), prefix, marker, maxresults, includeConverted, timeout, this.client.getVersion().getVersionString(), comp, context);
    }
}
