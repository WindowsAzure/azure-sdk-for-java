// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.management.storage.fluent;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Patch;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.management.storage.StorageManagementClient;

import java.util.Map;

import com.azure.management.storage.fluent.inner.ListQueueInner;
import com.azure.management.storage.fluent.inner.ListQueueResourceInner;
import com.azure.management.storage.fluent.inner.StorageQueueInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Queues. */
public final class QueuesClient {
    private final ClientLogger logger = new ClientLogger(QueuesClient.class);

    /** The proxy service used to perform REST calls. */
    private final QueuesService service;

    /** The service client containing this operation class. */
    private final StorageManagementClient client;

    /**
     * Initializes an instance of QueuesClient.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public QueuesClient(StorageManagementClient client) {
        this.service = RestProxy.create(QueuesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for StorageManagementClientQueues to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "StorageManagementCli")
    private interface QueuesService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Put(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage"
                + "/storageAccounts/{accountName}/queueServices/default/queues/{queueName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<SimpleResponse<StorageQueueInner>> create(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("queueName") String queueName,
            @BodyParam("application/json") StorageQueueInner queue,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Patch(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage"
                + "/storageAccounts/{accountName}/queueServices/default/queues/{queueName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<SimpleResponse<StorageQueueInner>> update(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("queueName") String queueName,
            @BodyParam("application/json") StorageQueueInner queue,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage"
                + "/storageAccounts/{accountName}/queueServices/default/queues/{queueName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<SimpleResponse<StorageQueueInner>> get(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("queueName") String queueName,
            Context context);

        @Headers({"Accept: application/json;q=0.9", "Content-Type: application/json"})
        @Delete(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage"
                + "/storageAccounts/{accountName}/queueServices/default/queues/{queueName}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Void>> delete(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("queueName") String queueName,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage"
                + "/storageAccounts/{accountName}/queueServices/default/queues")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<SimpleResponse<ListQueueResourceInner>> list(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("$maxpagesize") String maxpagesize,
            @QueryParam("$filter") String filter,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<SimpleResponse<ListQueueResourceInner>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, Context context);
    }

    /**
     * Creates a new queue with the specified queue name, under the specified account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param queueName A queue name must be unique within a storage account and must be between 3 and 63 characters.The
     *     name must comprise of lowercase alphanumeric and dash(-) characters only, it should begin and end with an
     *     alphanumeric character and it cannot have two consecutive dash(-) characters.
     * @param metadata A name-value pair that represents queue metadata.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<StorageQueueInner>> createWithResponseAsync(
        String resourceGroupName, String accountName, String queueName, Map<String, String> metadata) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (queueName == null) {
            return Mono.error(new IllegalArgumentException("Parameter queueName is required and cannot be null."));
        }
        StorageQueueInner queue = new StorageQueueInner();
        queue.withMetadata(metadata);
        return FluxUtil
            .withContext(
                context ->
                    service
                        .create(
                            this.client.getHost(),
                            resourceGroupName,
                            accountName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            queueName,
                            queue,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Creates a new queue with the specified queue name, under the specified account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param queueName A queue name must be unique within a storage account and must be between 3 and 63 characters.The
     *     name must comprise of lowercase alphanumeric and dash(-) characters only, it should begin and end with an
     *     alphanumeric character and it cannot have two consecutive dash(-) characters.
     * @param metadata A name-value pair that represents queue metadata.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<StorageQueueInner>> createWithResponseAsync(
        String resourceGroupName, String accountName, String queueName, Map<String, String> metadata, Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (queueName == null) {
            return Mono.error(new IllegalArgumentException("Parameter queueName is required and cannot be null."));
        }
        StorageQueueInner queue = new StorageQueueInner();
        queue.withMetadata(metadata);
        return service
            .create(
                this.client.getHost(),
                resourceGroupName,
                accountName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                queueName,
                queue,
                context);
    }

    /**
     * Creates a new queue with the specified queue name, under the specified account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param queueName A queue name must be unique within a storage account and must be between 3 and 63 characters.The
     *     name must comprise of lowercase alphanumeric and dash(-) characters only, it should begin and end with an
     *     alphanumeric character and it cannot have two consecutive dash(-) characters.
     * @param metadata A name-value pair that represents queue metadata.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<StorageQueueInner> createAsync(
        String resourceGroupName, String accountName, String queueName, Map<String, String> metadata) {
        return createWithResponseAsync(resourceGroupName, accountName, queueName, metadata)
            .flatMap(
                (SimpleResponse<StorageQueueInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Creates a new queue with the specified queue name, under the specified account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param queueName A queue name must be unique within a storage account and must be between 3 and 63 characters.The
     *     name must comprise of lowercase alphanumeric and dash(-) characters only, it should begin and end with an
     *     alphanumeric character and it cannot have two consecutive dash(-) characters.
     * @param metadata A name-value pair that represents queue metadata.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public StorageQueueInner create(
        String resourceGroupName, String accountName, String queueName, Map<String, String> metadata) {
        return createAsync(resourceGroupName, accountName, queueName, metadata).block();
    }

    /**
     * Creates a new queue with the specified queue name, under the specified account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param queueName A queue name must be unique within a storage account and must be between 3 and 63 characters.The
     *     name must comprise of lowercase alphanumeric and dash(-) characters only, it should begin and end with an
     *     alphanumeric character and it cannot have two consecutive dash(-) characters.
     * @param metadata A name-value pair that represents queue metadata.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<StorageQueueInner>> updateWithResponseAsync(
        String resourceGroupName, String accountName, String queueName, Map<String, String> metadata) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (queueName == null) {
            return Mono.error(new IllegalArgumentException("Parameter queueName is required and cannot be null."));
        }
        StorageQueueInner queue = new StorageQueueInner();
        queue.withMetadata(metadata);
        return FluxUtil
            .withContext(
                context ->
                    service
                        .update(
                            this.client.getHost(),
                            resourceGroupName,
                            accountName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            queueName,
                            queue,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Creates a new queue with the specified queue name, under the specified account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param queueName A queue name must be unique within a storage account and must be between 3 and 63 characters.The
     *     name must comprise of lowercase alphanumeric and dash(-) characters only, it should begin and end with an
     *     alphanumeric character and it cannot have two consecutive dash(-) characters.
     * @param metadata A name-value pair that represents queue metadata.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<StorageQueueInner>> updateWithResponseAsync(
        String resourceGroupName, String accountName, String queueName, Map<String, String> metadata, Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (queueName == null) {
            return Mono.error(new IllegalArgumentException("Parameter queueName is required and cannot be null."));
        }
        StorageQueueInner queue = new StorageQueueInner();
        queue.withMetadata(metadata);
        return service
            .update(
                this.client.getHost(),
                resourceGroupName,
                accountName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                queueName,
                queue,
                context);
    }

    /**
     * Creates a new queue with the specified queue name, under the specified account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param queueName A queue name must be unique within a storage account and must be between 3 and 63 characters.The
     *     name must comprise of lowercase alphanumeric and dash(-) characters only, it should begin and end with an
     *     alphanumeric character and it cannot have two consecutive dash(-) characters.
     * @param metadata A name-value pair that represents queue metadata.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<StorageQueueInner> updateAsync(
        String resourceGroupName, String accountName, String queueName, Map<String, String> metadata) {
        return updateWithResponseAsync(resourceGroupName, accountName, queueName, metadata)
            .flatMap(
                (SimpleResponse<StorageQueueInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Creates a new queue with the specified queue name, under the specified account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param queueName A queue name must be unique within a storage account and must be between 3 and 63 characters.The
     *     name must comprise of lowercase alphanumeric and dash(-) characters only, it should begin and end with an
     *     alphanumeric character and it cannot have two consecutive dash(-) characters.
     * @param metadata A name-value pair that represents queue metadata.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public StorageQueueInner update(
        String resourceGroupName, String accountName, String queueName, Map<String, String> metadata) {
        return updateAsync(resourceGroupName, accountName, queueName, metadata).block();
    }

    /**
     * Gets the queue with the specified queue name, under the specified account if it exists.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param queueName A queue name must be unique within a storage account and must be between 3 and 63 characters.The
     *     name must comprise of lowercase alphanumeric and dash(-) characters only, it should begin and end with an
     *     alphanumeric character and it cannot have two consecutive dash(-) characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the queue with the specified queue name, under the specified account if it exists.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<StorageQueueInner>> getWithResponseAsync(
        String resourceGroupName, String accountName, String queueName) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (queueName == null) {
            return Mono.error(new IllegalArgumentException("Parameter queueName is required and cannot be null."));
        }
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getHost(),
                            resourceGroupName,
                            accountName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            queueName,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets the queue with the specified queue name, under the specified account if it exists.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param queueName A queue name must be unique within a storage account and must be between 3 and 63 characters.The
     *     name must comprise of lowercase alphanumeric and dash(-) characters only, it should begin and end with an
     *     alphanumeric character and it cannot have two consecutive dash(-) characters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the queue with the specified queue name, under the specified account if it exists.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<StorageQueueInner>> getWithResponseAsync(
        String resourceGroupName, String accountName, String queueName, Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (queueName == null) {
            return Mono.error(new IllegalArgumentException("Parameter queueName is required and cannot be null."));
        }
        return service
            .get(
                this.client.getHost(),
                resourceGroupName,
                accountName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                queueName,
                context);
    }

    /**
     * Gets the queue with the specified queue name, under the specified account if it exists.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param queueName A queue name must be unique within a storage account and must be between 3 and 63 characters.The
     *     name must comprise of lowercase alphanumeric and dash(-) characters only, it should begin and end with an
     *     alphanumeric character and it cannot have two consecutive dash(-) characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the queue with the specified queue name, under the specified account if it exists.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<StorageQueueInner> getAsync(String resourceGroupName, String accountName, String queueName) {
        return getWithResponseAsync(resourceGroupName, accountName, queueName)
            .flatMap(
                (SimpleResponse<StorageQueueInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets the queue with the specified queue name, under the specified account if it exists.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param queueName A queue name must be unique within a storage account and must be between 3 and 63 characters.The
     *     name must comprise of lowercase alphanumeric and dash(-) characters only, it should begin and end with an
     *     alphanumeric character and it cannot have two consecutive dash(-) characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the queue with the specified queue name, under the specified account if it exists.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public StorageQueueInner get(String resourceGroupName, String accountName, String queueName) {
        return getAsync(resourceGroupName, accountName, queueName).block();
    }

    /**
     * Deletes the queue with the specified queue name, under the specified account if it exists.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param queueName A queue name must be unique within a storage account and must be between 3 and 63 characters.The
     *     name must comprise of lowercase alphanumeric and dash(-) characters only, it should begin and end with an
     *     alphanumeric character and it cannot have two consecutive dash(-) characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(
        String resourceGroupName, String accountName, String queueName) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (queueName == null) {
            return Mono.error(new IllegalArgumentException("Parameter queueName is required and cannot be null."));
        }
        return FluxUtil
            .withContext(
                context ->
                    service
                        .delete(
                            this.client.getHost(),
                            resourceGroupName,
                            accountName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            queueName,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Deletes the queue with the specified queue name, under the specified account if it exists.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param queueName A queue name must be unique within a storage account and must be between 3 and 63 characters.The
     *     name must comprise of lowercase alphanumeric and dash(-) characters only, it should begin and end with an
     *     alphanumeric character and it cannot have two consecutive dash(-) characters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(
        String resourceGroupName, String accountName, String queueName, Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (queueName == null) {
            return Mono.error(new IllegalArgumentException("Parameter queueName is required and cannot be null."));
        }
        return service
            .delete(
                this.client.getHost(),
                resourceGroupName,
                accountName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                queueName,
                context);
    }

    /**
     * Deletes the queue with the specified queue name, under the specified account if it exists.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param queueName A queue name must be unique within a storage account and must be between 3 and 63 characters.The
     *     name must comprise of lowercase alphanumeric and dash(-) characters only, it should begin and end with an
     *     alphanumeric character and it cannot have two consecutive dash(-) characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String accountName, String queueName) {
        return deleteWithResponseAsync(resourceGroupName, accountName, queueName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes the queue with the specified queue name, under the specified account if it exists.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param queueName A queue name must be unique within a storage account and must be between 3 and 63 characters.The
     *     name must comprise of lowercase alphanumeric and dash(-) characters only, it should begin and end with an
     *     alphanumeric character and it cannot have two consecutive dash(-) characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String accountName, String queueName) {
        deleteAsync(resourceGroupName, accountName, queueName).block();
    }

    /**
     * Gets a list of all the queues under the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param maxpagesize Optional, a maximum number of queues that should be included in a list queue response.
     * @param filter Optional, When specified, only the queues with a name starting with the given filter will be
     *     listed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all the queues under the specified storage account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ListQueueInner>> listSinglePageAsync(
        String resourceGroupName, String accountName, String maxpagesize, String filter) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getHost(),
                            resourceGroupName,
                            accountName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            maxpagesize,
                            filter,
                            context))
            .<PagedResponse<ListQueueInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets a list of all the queues under the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param maxpagesize Optional, a maximum number of queues that should be included in a list queue response.
     * @param filter Optional, When specified, only the queues with a name starting with the given filter will be
     *     listed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all the queues under the specified storage account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ListQueueInner>> listSinglePageAsync(
        String resourceGroupName, String accountName, String maxpagesize, String filter, Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        return service
            .list(
                this.client.getHost(),
                resourceGroupName,
                accountName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                maxpagesize,
                filter,
                context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }

    /**
     * Gets a list of all the queues under the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param maxpagesize Optional, a maximum number of queues that should be included in a list queue response.
     * @param filter Optional, When specified, only the queues with a name starting with the given filter will be
     *     listed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all the queues under the specified storage account.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ListQueueInner> listAsync(
        String resourceGroupName, String accountName, String maxpagesize, String filter) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, accountName, maxpagesize, filter),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets a list of all the queues under the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param maxpagesize Optional, a maximum number of queues that should be included in a list queue response.
     * @param filter Optional, When specified, only the queues with a name starting with the given filter will be
     *     listed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all the queues under the specified storage account.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ListQueueInner> listAsync(
        String resourceGroupName, String accountName, String maxpagesize, String filter, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, accountName, maxpagesize, filter, context),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets a list of all the queues under the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all the queues under the specified storage account.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ListQueueInner> listAsync(String resourceGroupName, String accountName) {
        final String maxpagesize = null;
        final String filter = null;
        final Context context = null;
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, accountName, maxpagesize, filter),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets a list of all the queues under the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param maxpagesize Optional, a maximum number of queues that should be included in a list queue response.
     * @param filter Optional, When specified, only the queues with a name starting with the given filter will be
     *     listed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all the queues under the specified storage account.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ListQueueInner> list(
        String resourceGroupName, String accountName, String maxpagesize, String filter) {
        return new PagedIterable<>(listAsync(resourceGroupName, accountName, maxpagesize, filter));
    }

    /**
     * Gets a list of all the queues under the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all the queues under the specified storage account.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ListQueueInner> list(String resourceGroupName, String accountName) {
        final String maxpagesize = null;
        final String filter = null;
        final Context context = null;
        return new PagedIterable<>(listAsync(resourceGroupName, accountName, maxpagesize, filter));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response schema.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ListQueueInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        return FluxUtil
            .withContext(context -> service.listNext(nextLink, context))
            .<PagedResponse<ListQueueInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response schema.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ListQueueInner>> listNextSinglePageAsync(String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        return service
            .listNext(nextLink, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }
}
