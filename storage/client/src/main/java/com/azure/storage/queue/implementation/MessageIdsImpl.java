// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.queue.implementation;

import com.azure.core.annotations.BodyParam;
import com.azure.core.annotations.DELETE;
import com.azure.core.annotations.ExpectedResponses;
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
import com.azure.storage.queue.models.MessageIdsDeleteResponse;
import com.azure.storage.queue.models.MessageIdsUpdateResponse;
import com.azure.storage.queue.models.QueueMessage;
import com.azure.storage.queue.models.StorageErrorException;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * MessageIds.
 */
public final class MessageIdsImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private MessageIdsService service;

    /**
     * The service client containing this operation class.
     */
    private AzureQueueStorageImpl client;

    /**
     * Initializes an instance of MessageIdsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public MessageIdsImpl(AzureQueueStorageImpl client) {
        this.service = RestProxy.create(MessageIdsService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for MessageIds to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{url}")
    @Service("Storage Queue MessageIds")
    private interface MessageIdsService {
        @PUT("{queueName}/messages/{messageId}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<MessageIdsUpdateResponse> update(@HostParam("url") String url, @PathParam("queueName") String queueName, @PathParam("messageId") String messageId, @BodyParam("application/xml; charset=utf-8") QueueMessage queueMessage, @QueryParam("popreceipt") String popReceipt, @QueryParam("visibilitytimeout") int visibilitytimeout, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, Context context);

        @DELETE("{queueName}/messages/{messageId}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<MessageIdsDeleteResponse> delete(@HostParam("url") String url, @PathParam("queueName") String queueName, @PathParam("messageId") String messageId, @QueryParam("popreceipt") String popReceipt, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, Context context);
    }

    /**
     * The Update operation was introduced with version 2011-08-18 of the Queue service API. The Update Message operation updates the visibility timeout of a message. You can also use this operation to update the contents of a message. A message must be in a format that can be included in an XML request with UTF-8 encoding, and the encoded message can be up to 64KB in size.
     *
     * @param queueMessage A Message object which can be stored in a Queue.
     * @param popReceipt Required. Specifies the valid pop receipt value returned from an earlier call to the Get Messages or Update Message operation.
     * @param visibilitytimeout Optional. Specifies the new visibility timeout value, in seconds, relative to server time. The default value is 30 seconds. A specified value must be larger than or equal to 1 second, and cannot be larger than 7 days, or larger than 2 hours on REST protocol versions prior to version 2011-08-18. The visibility timeout of a message can be set to a value later than the expiry time.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<MessageIdsUpdateResponse> updateWithRestResponseAsync(String queueName, String messageId, QueueMessage queueMessage, String popReceipt, int visibilitytimeout, Context context) {
        final Integer timeout = null;
        final String requestId = null;
        return service.update(this.client.url(), queueName, messageId, queueMessage, popReceipt, visibilitytimeout, timeout, this.client.version(), requestId, context);
    }

    /**
     * The Update operation was introduced with version 2011-08-18 of the Queue service API. The Update Message operation updates the visibility timeout of a message. You can also use this operation to update the contents of a message. A message must be in a format that can be included in an XML request with UTF-8 encoding, and the encoded message can be up to 64KB in size.
     *
     * @param queueMessage A Message object which can be stored in a Queue.
     * @param popReceipt Required. Specifies the valid pop receipt value returned from an earlier call to the Get Messages or Update Message operation.
     * @param visibilitytimeout Optional. Specifies the new visibility timeout value, in seconds, relative to server time. The default value is 30 seconds. A specified value must be larger than or equal to 1 second, and cannot be larger than 7 days, or larger than 2 hours on REST protocol versions prior to version 2011-08-18. The visibility timeout of a message can be set to a value later than the expiry time.
     * @param timeout The The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/setting-timeouts-for-queue-service-operations&gt;Setting Timeouts for Queue Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<MessageIdsUpdateResponse> updateWithRestResponseAsync(String queueName, String messageId, QueueMessage queueMessage, String popReceipt, int visibilitytimeout, Integer timeout, String requestId, Context context) {
        return service.update(this.client.url(), queueName, messageId, queueMessage, popReceipt, visibilitytimeout, timeout, this.client.version(), requestId, context);
    }

    /**
     * The Delete operation deletes the specified message.
     *
     * @param popReceipt Required. Specifies the valid pop receipt value returned from an earlier call to the Get Messages or Update Message operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<MessageIdsDeleteResponse> deleteWithRestResponseAsync(String queueName, String messageId, String popReceipt, Context context) {
        final Integer timeout = null;
        final String requestId = null;
        return service.delete(this.client.url(), queueName, messageId, popReceipt, timeout, this.client.version(), requestId, context);
    }

    /**
     * The Delete operation deletes the specified message.
     *
     * @param popReceipt Required. Specifies the valid pop receipt value returned from an earlier call to the Get Messages or Update Message operation.
     * @param timeout The The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/setting-timeouts-for-queue-service-operations&gt;Setting Timeouts for Queue Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<MessageIdsDeleteResponse> deleteWithRestResponseAsync(String queueName, String messageId, String popReceipt, Integer timeout, String requestId, Context context) {
        return service.delete(this.client.url(), queueName, messageId, popReceipt, timeout, this.client.version(), requestId, context);
    }
}
