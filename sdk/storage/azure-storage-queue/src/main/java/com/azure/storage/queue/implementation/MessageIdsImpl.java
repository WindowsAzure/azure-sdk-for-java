// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.queue.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
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
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.storage.queue.implementation.models.MessageIdsDeleteResponse;
import com.azure.storage.queue.implementation.models.MessageIdsUpdateResponse;
import com.azure.storage.queue.implementation.models.QueueMessage;
import com.azure.storage.queue.implementation.models.StorageErrorException;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in MessageIds. */
public final class MessageIdsImpl {
    /** The proxy service used to perform REST calls. */
    private final MessageIdsService service;

    /** The service client containing this operation class. */
    private final AzureQueueStorageImpl client;

    /**
     * Initializes an instance of MessageIdsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    MessageIdsImpl(AzureQueueStorageImpl client) {
        this.service =
                RestProxy.create(MessageIdsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureQueueStorageMessageIds to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{url}")
    @ServiceInterface(name = "AzureQueueStorageMes")
    private interface MessageIdsService {
        @Put("/{queueName}/messages/{messageid}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        @UnexpectedResponseExceptionType(com.azure.storage.queue.models.QueueStorageException.class)
        Mono<MessageIdsUpdateResponse> update(
                @HostParam("url") String url,
                @PathParam("queueName") String queueName,
                @PathParam("messageid") String messageid,
                @QueryParam("popreceipt") String popReceipt,
                @QueryParam("visibilitytimeout") int visibilitytimeout,
                @QueryParam("timeout") Integer timeout,
                @HeaderParam("x-ms-version") String version,
                @HeaderParam("x-ms-client-request-id") String requestId,
                @BodyParam("application/xml") QueueMessage queueMessage,
                @HeaderParam("Accept") String accept,
                Context context);

        @Delete("/{queueName}/messages/{messageid}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        @UnexpectedResponseExceptionType(com.azure.storage.queue.models.QueueStorageException.class)
        Mono<MessageIdsDeleteResponse> delete(
                @HostParam("url") String url,
                @PathParam("queueName") String queueName,
                @PathParam("messageid") String messageid,
                @QueryParam("popreceipt") String popReceipt,
                @QueryParam("timeout") Integer timeout,
                @HeaderParam("x-ms-version") String version,
                @HeaderParam("x-ms-client-request-id") String requestId,
                @HeaderParam("Accept") String accept,
                Context context);
    }

    /**
     * The Update operation was introduced with version 2011-08-18 of the Queue service API. The Update Message
     * operation updates the visibility timeout of a message. You can also use this operation to update the contents of
     * a message. A message must be in a format that can be included in an XML request with UTF-8 encoding, and the
     * encoded message can be up to 64KB in size.
     *
     * @param queueName The queue name.
     * @param messageid The message ID name.
     * @param popReceipt Required. Specifies the valid pop receipt value returned from an earlier call to the Get
     *     Messages or Update Message operation.
     * @param visibilitytimeout Optional. Specifies the new visibility timeout value, in seconds, relative to server
     *     time. The default value is 30 seconds. A specified value must be larger than or equal to 1 second, and cannot
     *     be larger than 7 days, or larger than 2 hours on REST protocol versions prior to version 2011-08-18. The
     *     visibility timeout of a message can be set to a value later than the expiry time.
     * @param timeout The The timeout parameter is expressed in seconds. For more information, see &lt;a
     *     href="https://docs.microsoft.com/en-us/rest/api/storageservices/setting-timeouts-for-queue-service-operations&gt;Setting
     *     Timeouts for Queue Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when storage analytics logging is enabled.
     * @param queueMessage A Message object which can be stored in a Queue.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws StorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<MessageIdsUpdateResponse> updateWithResponseAsync(
            String queueName,
            String messageid,
            String popReceipt,
            int visibilitytimeout,
            Integer timeout,
            String requestId,
            QueueMessage queueMessage,
            Context context) {
        final String accept = "application/xml";
        return service.update(
                this.client.getUrl(),
                queueName,
                messageid,
                popReceipt,
                visibilitytimeout,
                timeout,
                this.client.getVersion(),
                requestId,
                queueMessage,
                accept,
                context);
    }

    /**
     * The Delete operation deletes the specified message.
     *
     * @param queueName The queue name.
     * @param messageid The message ID name.
     * @param popReceipt Required. Specifies the valid pop receipt value returned from an earlier call to the Get
     *     Messages or Update Message operation.
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
    public Mono<MessageIdsDeleteResponse> deleteWithResponseAsync(
            String queueName, String messageid, String popReceipt, Integer timeout, String requestId, Context context) {
        final String accept = "application/xml";
        return service.delete(
                this.client.getUrl(),
                queueName,
                messageid,
                popReceipt,
                timeout,
                this.client.getVersion(),
                requestId,
                accept,
                context);
    }
}
