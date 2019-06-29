// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.queue.implementation;

import com.azure.core.annotations.BodyParam;
import com.azure.core.annotations.DELETE;
import com.azure.core.annotations.ExpectedResponses;
import com.azure.core.annotations.GET;
import com.azure.core.annotations.HeaderParam;
import com.azure.core.annotations.Host;
import com.azure.core.annotations.HostParam;
import com.azure.core.annotations.PUT;
import com.azure.core.annotations.PathParam;
import com.azure.core.annotations.QueryParam;
import com.azure.core.annotations.Service;
import com.azure.core.annotations.UnexpectedResponseExceptionType;
import com.azure.core.implementation.RestProxy;
import com.azure.core.util.Context;
import com.azure.storage.queue.models.QueuesCreateResponse;
import com.azure.storage.queue.models.QueuesDeleteResponse;
import com.azure.storage.queue.models.QueuesGetAccessPolicyResponse;
import com.azure.storage.queue.models.QueuesGetPropertiesResponse;
import com.azure.storage.queue.models.QueuesSetAccessPolicyResponse;
import com.azure.storage.queue.models.QueuesSetMetadataResponse;
import com.azure.storage.queue.models.SignedIdentifier;
import com.azure.storage.queue.models.StorageErrorException;
import java.util.List;
import java.util.Map;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * Queues.
 */
public final class QueuesImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private QueuesService service;

    /**
     * The service client containing this operation class.
     */
    private AzureQueueStorageImpl client;

    /**
     * Initializes an instance of QueuesImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public QueuesImpl(AzureQueueStorageImpl client) {
        this.service = RestProxy.create(QueuesService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for Queues to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{url}")
    @Service("Storage Queue Queues")
    private interface QueuesService {
        @PUT("{queueName}")
        @ExpectedResponses({201, 204})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<QueuesCreateResponse> create(@HostParam("url") String url, @PathParam("queueName") String queueName, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-meta-") Map<String, String> metadata, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, Context context);

        @DELETE("{queueName}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<QueuesDeleteResponse> delete(@HostParam("url") String url, @PathParam("queueName") String queueName, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, Context context);

        @GET("{queueName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<QueuesGetPropertiesResponse> getProperties(@HostParam("url") String url, @PathParam("queueName") String queueName, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("comp") String comp, Context context);

        @PUT("{queueName}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<QueuesSetMetadataResponse> setMetadata(@HostParam("url") String url, @PathParam("queueName") String queueName, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-meta-") Map<String, String> metadata, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("comp") String comp, Context context);

        @GET("{queueName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<QueuesGetAccessPolicyResponse> getAccessPolicy(@HostParam("url") String url, @PathParam("queueName") String queueName, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("comp") String comp, Context context);

        @PUT("{queueName}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<QueuesSetAccessPolicyResponse> setAccessPolicy(@HostParam("url") String url, @PathParam("queueName") String queueName, @BodyParam("application/xml; charset=utf-8") SignedIdentifiersWrapper queueAcl, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("comp") String comp, Context context);
    }

    /**
     * creates a new queue under the given account.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<QueuesCreateResponse> createWithRestResponseAsync(String queueName, Context context) {
        final Integer timeout = null;
        final Map<String, String> metadata = null;
        final String requestId = null;
        return service.create(this.client.url(), queueName, timeout, metadata, this.client.version(), requestId, context);
    }

    /**
     * creates a new queue under the given account.
     *
     * @param timeout The The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/setting-timeouts-for-queue-service-operations&gt;Setting Timeouts for Queue Service Operations.&lt;/a&gt;.
     * @param metadata Optional. Include this parameter to specify that the queue's metadata be returned as part of the response body. Note that metadata requested with this parameter must be stored in accordance with the naming restrictions imposed by the 2009-09-19 version of the Queue service. Beginning with this version, all metadata names must adhere to the naming conventions for C# identifiers.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<QueuesCreateResponse> createWithRestResponseAsync(String queueName, Integer timeout, Map<String, String> metadata, String requestId, Context context) {
        return service.create(this.client.url(), queueName, timeout, metadata, this.client.version(), requestId, context);
    }

    /**
     * operation permanently deletes the specified queue.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<QueuesDeleteResponse> deleteWithRestResponseAsync(String queueName, Context context) {
        final Integer timeout = null;
        final String requestId = null;
        return service.delete(this.client.url(), queueName, timeout, this.client.version(), requestId, context);
    }

    /**
     * operation permanently deletes the specified queue.
     *
     * @param timeout The The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/setting-timeouts-for-queue-service-operations&gt;Setting Timeouts for Queue Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<QueuesDeleteResponse> deleteWithRestResponseAsync(String queueName, Integer timeout, String requestId, Context context) {
        return service.delete(this.client.url(), queueName, timeout, this.client.version(), requestId, context);
    }

    /**
     * Retrieves user-defined metadata and queue properties on the specified queue. Metadata is associated with the queue as name-values pairs.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<QueuesGetPropertiesResponse> getPropertiesWithRestResponseAsync(String queueName, Context context) {
        final Integer timeout = null;
        final String requestId = null;
        final String comp = "metadata";
        return service.getProperties(this.client.url(), queueName, timeout, this.client.version(), requestId, comp, context);
    }

    /**
     * Retrieves user-defined metadata and queue properties on the specified queue. Metadata is associated with the queue as name-values pairs.
     *
     * @param timeout The The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/setting-timeouts-for-queue-service-operations&gt;Setting Timeouts for Queue Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<QueuesGetPropertiesResponse> getPropertiesWithRestResponseAsync(String queueName, Integer timeout, String requestId, Context context) {
        final String comp = "metadata";
        return service.getProperties(this.client.url(), queueName, timeout, this.client.version(), requestId, comp, context);
    }

    /**
     * sets user-defined metadata on the specified queue. Metadata is associated with the queue as name-value pairs.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<QueuesSetMetadataResponse> setMetadataWithRestResponseAsync(String queueName, Context context) {
        final Integer timeout = null;
        final Map<String, String> metadata = null;
        final String requestId = null;
        final String comp = "metadata";
        return service.setMetadata(this.client.url(), queueName, timeout, metadata, this.client.version(), requestId, comp, context);
    }

    /**
     * sets user-defined metadata on the specified queue. Metadata is associated with the queue as name-value pairs.
     *
     * @param timeout The The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/setting-timeouts-for-queue-service-operations&gt;Setting Timeouts for Queue Service Operations.&lt;/a&gt;.
     * @param metadata Optional. Include this parameter to specify that the queue's metadata be returned as part of the response body. Note that metadata requested with this parameter must be stored in accordance with the naming restrictions imposed by the 2009-09-19 version of the Queue service. Beginning with this version, all metadata names must adhere to the naming conventions for C# identifiers.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<QueuesSetMetadataResponse> setMetadataWithRestResponseAsync(String queueName, Integer timeout, Map<String, String> metadata, String requestId, Context context) {
        final String comp = "metadata";
        return service.setMetadata(this.client.url(), queueName, timeout, metadata, this.client.version(), requestId, comp, context);
    }

    /**
     * returns details about any stored access policies specified on the queue that may be used with Shared Access Signatures.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<QueuesGetAccessPolicyResponse> getAccessPolicyWithRestResponseAsync(String queueName, Context context) {
        final Integer timeout = null;
        final String requestId = null;
        final String comp = "acl";
        return service.getAccessPolicy(this.client.url(), queueName, timeout, this.client.version(), requestId, comp, context);
    }

    /**
     * returns details about any stored access policies specified on the queue that may be used with Shared Access Signatures.
     *
     * @param timeout The The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/setting-timeouts-for-queue-service-operations&gt;Setting Timeouts for Queue Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<QueuesGetAccessPolicyResponse> getAccessPolicyWithRestResponseAsync(String queueName, Integer timeout, String requestId, Context context) {
        final String comp = "acl";
        return service.getAccessPolicy(this.client.url(), queueName, timeout, this.client.version(), requestId, comp, context);
    }

    /**
     * sets stored access policies for the queue that may be used with Shared Access Signatures.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<QueuesSetAccessPolicyResponse> setAccessPolicyWithRestResponseAsync(String queueName, Context context) {
        final Integer timeout = null;
        final String requestId = null;
        final String comp = "acl";
        SignedIdentifiersWrapper queueAclConverted = new SignedIdentifiersWrapper(null);
        return service.setAccessPolicy(this.client.url(), queueName, queueAclConverted, timeout, this.client.version(), requestId, comp, context);
    }

    /**
     * sets stored access policies for the queue that may be used with Shared Access Signatures.
     *
     * @param queueAcl the acls for the queue.
     * @param timeout The The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/setting-timeouts-for-queue-service-operations&gt;Setting Timeouts for Queue Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<QueuesSetAccessPolicyResponse> setAccessPolicyWithRestResponseAsync(String queueName, List<SignedIdentifier> queueAcl, Integer timeout, String requestId, Context context) {
        final String comp = "acl";
        SignedIdentifiersWrapper queueAclConverted = new SignedIdentifiersWrapper(queueAcl);
        return service.setAccessPolicy(this.client.url(), queueName, queueAclConverted, timeout, this.client.version(), requestId, comp, context);
    }
}
