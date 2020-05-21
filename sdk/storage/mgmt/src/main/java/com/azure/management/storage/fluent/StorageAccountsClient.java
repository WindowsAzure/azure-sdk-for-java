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
import com.azure.core.annotation.Post;
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
import com.azure.core.util.polling.AsyncPollResponse;
import com.azure.management.resources.fluentcore.collection.InnerSupportsDelete;
import com.azure.management.resources.fluentcore.collection.InnerSupportsGet;
import com.azure.management.resources.fluentcore.collection.InnerSupportsListing;
import com.azure.management.storage.StorageManagementClient;
import com.azure.management.storage.fluent.inner.BlobRestoreStatusInner;
import com.azure.management.storage.fluent.inner.CheckNameAvailabilityResultInner;
import com.azure.management.storage.fluent.inner.ListAccountSasResponseInner;
import com.azure.management.storage.fluent.inner.ListServiceSasResponseInner;
import com.azure.management.storage.fluent.inner.StorageAccountInner;
import com.azure.management.storage.fluent.inner.StorageAccountListKeysResultInner;
import com.azure.management.storage.fluent.inner.StorageAccountListResultInner;
import com.azure.management.storage.models.AccountSasParameters;
import com.azure.management.storage.models.BlobRestoreParameters;
import com.azure.management.storage.models.BlobRestoreRange;
import com.azure.management.storage.models.ListKeyExpand;
import com.azure.management.storage.models.ServiceSasParameters;
import com.azure.management.storage.models.StorageAccountCheckNameAvailabilityParameters;
import com.azure.management.storage.models.StorageAccountCreateParameters;
import com.azure.management.storage.models.StorageAccountExpand;
import com.azure.management.storage.models.StorageAccountRegenerateKeyParameters;
import com.azure.management.storage.models.StorageAccountUpdateParameters;
import java.nio.ByteBuffer;
import java.time.OffsetDateTime;
import java.util.List;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in StorageAccounts. */
public final class StorageAccountsClient
    implements InnerSupportsGet<StorageAccountInner>,
        InnerSupportsListing<StorageAccountInner>,
        InnerSupportsDelete<Void> {
    private final ClientLogger logger = new ClientLogger(StorageAccountsClient.class);

    /** The proxy service used to perform REST calls. */
    private final StorageAccountsService service;

    /** The service client containing this operation class. */
    private final StorageManagementClient client;

    /**
     * Initializes an instance of StorageAccountsClient.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public StorageAccountsClient(StorageManagementClient client) {
        this.service =
            RestProxy.create(StorageAccountsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for StorageManagementClientStorageAccounts to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "StorageManagementCli")
    private interface StorageAccountsService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Post("/subscriptions/{subscriptionId}/providers/Microsoft.Storage/checkNameAvailability")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<SimpleResponse<CheckNameAvailabilityResultInner>> checkNameAvailability(
            @HostParam("$host") String host,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @BodyParam("application/json") StorageAccountCheckNameAvailabilityParameters accountName,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Put(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage"
                + "/storageAccounts/{accountName}")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> create(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @BodyParam("application/json") StorageAccountCreateParameters parameters,
            Context context);

        @Headers({"Accept: application/json;q=0.9", "Content-Type: application/json"})
        @Delete(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage"
                + "/storageAccounts/{accountName}")
        @ExpectedResponses({200, 204})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Void>> delete(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage"
                + "/storageAccounts/{accountName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<SimpleResponse<StorageAccountInner>> getByResourceGroup(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("$expand") StorageAccountExpand expand,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Patch(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage"
                + "/storageAccounts/{accountName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<SimpleResponse<StorageAccountInner>> update(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @BodyParam("application/json") StorageAccountUpdateParameters parameters,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Storage/storageAccounts")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<SimpleResponse<StorageAccountListResultInner>> list(
            @HostParam("$host") String host,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage"
                + "/storageAccounts")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<SimpleResponse<StorageAccountListResultInner>> listByResourceGroup(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage"
                + "/storageAccounts/{accountName}/listKeys")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<SimpleResponse<StorageAccountListKeysResultInner>> listKeys(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("$expand") ListKeyExpand expand,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage"
                + "/storageAccounts/{accountName}/regenerateKey")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<SimpleResponse<StorageAccountListKeysResultInner>> regenerateKey(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @BodyParam("application/json") StorageAccountRegenerateKeyParameters regenerateKey,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage"
                + "/storageAccounts/{accountName}/ListAccountSas")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<SimpleResponse<ListAccountSasResponseInner>> listAccountSas(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @BodyParam("application/json") AccountSasParameters parameters,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage"
                + "/storageAccounts/{accountName}/ListServiceSas")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<SimpleResponse<ListServiceSasResponseInner>> listServiceSas(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @BodyParam("application/json") ServiceSasParameters parameters,
            Context context);

        @Headers({"Accept: application/json;q=0.9", "Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage"
                + "/storageAccounts/{accountName}/failover")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> failover(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage"
                + "/storageAccounts/{accountName}/restoreBlobRanges")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> restoreBlobRanges(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @BodyParam("application/json") BlobRestoreParameters parameters,
            Context context);

        @Headers({"Accept: application/json;q=0.9", "Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage"
                + "/storageAccounts/{accountName}/revokeUserDelegationKeys")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Void>> revokeUserDelegationKeys(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Put(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage"
                + "/storageAccounts/{accountName}")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<SimpleResponse<StorageAccountInner>> beginCreate(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @BodyParam("application/json") StorageAccountCreateParameters parameters,
            Context context);

        @Headers({"Accept: application/json;q=0.9", "Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage"
                + "/storageAccounts/{accountName}/failover")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Void>> beginFailover(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage"
                + "/storageAccounts/{accountName}/restoreBlobRanges")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<SimpleResponse<BlobRestoreStatusInner>> beginRestoreBlobRanges(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @BodyParam("application/json") BlobRestoreParameters parameters,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<SimpleResponse<StorageAccountListResultInner>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, Context context);
    }

    /**
     * Checks that the storage account name is valid and is not already in use.
     *
     * @param name The storage account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the CheckNameAvailability operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<CheckNameAvailabilityResultInner>> checkNameAvailabilityWithResponseAsync(String name) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (name == null) {
            return Mono.error(new IllegalArgumentException("Parameter name is required and cannot be null."));
        }
        StorageAccountCheckNameAvailabilityParameters accountName = new StorageAccountCheckNameAvailabilityParameters();
        accountName.withName(name);
        return FluxUtil
            .withContext(
                context ->
                    service
                        .checkNameAvailability(
                            this.client.getHost(),
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            accountName,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Checks that the storage account name is valid and is not already in use.
     *
     * @param name The storage account name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the CheckNameAvailability operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<CheckNameAvailabilityResultInner>> checkNameAvailabilityWithResponseAsync(
        String name, Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (name == null) {
            return Mono.error(new IllegalArgumentException("Parameter name is required and cannot be null."));
        }
        StorageAccountCheckNameAvailabilityParameters accountName = new StorageAccountCheckNameAvailabilityParameters();
        accountName.withName(name);
        return service
            .checkNameAvailability(
                this.client.getHost(),
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                accountName,
                context);
    }

    /**
     * Checks that the storage account name is valid and is not already in use.
     *
     * @param name The storage account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the CheckNameAvailability operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CheckNameAvailabilityResultInner> checkNameAvailabilityAsync(String name) {
        return checkNameAvailabilityWithResponseAsync(name)
            .flatMap(
                (SimpleResponse<CheckNameAvailabilityResultInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Checks that the storage account name is valid and is not already in use.
     *
     * @param name The storage account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the CheckNameAvailability operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CheckNameAvailabilityResultInner checkNameAvailability(String name) {
        return checkNameAvailabilityAsync(name).block();
    }

    /**
     * Asynchronously creates a new storage account with the specified parameters. If an account is already created and
     * a subsequent create request is issued with different properties, the account properties will be updated. If an
     * account is already created and a subsequent create or update request is issued with the exact same set of
     * properties, the request will succeed.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param parameters The parameters used when creating a storage account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the storage account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> createWithResponseAsync(
        String resourceGroupName, String accountName, StorageAccountCreateParameters parameters) {
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
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
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
                            parameters,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Asynchronously creates a new storage account with the specified parameters. If an account is already created and
     * a subsequent create request is issued with different properties, the account properties will be updated. If an
     * account is already created and a subsequent create or update request is issued with the exact same set of
     * properties, the request will succeed.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param parameters The parameters used when creating a storage account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the storage account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<StorageAccountInner> createAsync(
        String resourceGroupName, String accountName, StorageAccountCreateParameters parameters) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> mono =
            createWithResponseAsync(resourceGroupName, accountName, parameters);
        return this
            .client
            .<StorageAccountInner, StorageAccountInner>getLroResultAsync(
                mono, this.client.getHttpPipeline(), StorageAccountInner.class, StorageAccountInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Asynchronously creates a new storage account with the specified parameters. If an account is already created and
     * a subsequent create request is issued with different properties, the account properties will be updated. If an
     * account is already created and a subsequent create or update request is issued with the exact same set of
     * properties, the request will succeed.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param parameters The parameters used when creating a storage account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the storage account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public StorageAccountInner create(
        String resourceGroupName, String accountName, StorageAccountCreateParameters parameters) {
        return createAsync(resourceGroupName, accountName, parameters).block();
    }

    /**
     * Deletes a storage account in Microsoft Azure.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(String resourceGroupName, String accountName) {
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
                        .delete(
                            this.client.getHost(),
                            resourceGroupName,
                            accountName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Deletes a storage account in Microsoft Azure.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(String resourceGroupName, String accountName, Context context) {
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
            .delete(
                this.client.getHost(),
                resourceGroupName,
                accountName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                context);
    }

    /**
     * Deletes a storage account in Microsoft Azure.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String accountName) {
        return deleteWithResponseAsync(resourceGroupName, accountName).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes a storage account in Microsoft Azure.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String accountName) {
        deleteAsync(resourceGroupName, accountName).block();
    }

    /**
     * Returns the properties for the specified storage account including but not limited to name, SKU name, location,
     * and account status. The ListKeys operation should be used to retrieve storage keys.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param expand May be used to expand the properties within account's properties. By default, data is not included
     *     when fetching properties. Currently we only support geoReplicationStats and blobRestoreStatus.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the storage account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<StorageAccountInner>> getByResourceGroupWithResponseAsync(
        String resourceGroupName, String accountName, StorageAccountExpand expand) {
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
                        .getByResourceGroup(
                            this.client.getHost(),
                            resourceGroupName,
                            accountName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            expand,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Returns the properties for the specified storage account including but not limited to name, SKU name, location,
     * and account status. The ListKeys operation should be used to retrieve storage keys.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param expand May be used to expand the properties within account's properties. By default, data is not included
     *     when fetching properties. Currently we only support geoReplicationStats and blobRestoreStatus.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the storage account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<StorageAccountInner>> getByResourceGroupWithResponseAsync(
        String resourceGroupName, String accountName, StorageAccountExpand expand, Context context) {
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
            .getByResourceGroup(
                this.client.getHost(),
                resourceGroupName,
                accountName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                expand,
                context);
    }

    /**
     * Returns the properties for the specified storage account including but not limited to name, SKU name, location,
     * and account status. The ListKeys operation should be used to retrieve storage keys.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param expand May be used to expand the properties within account's properties. By default, data is not included
     *     when fetching properties. Currently we only support geoReplicationStats and blobRestoreStatus.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the storage account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<StorageAccountInner> getByResourceGroupAsync(
        String resourceGroupName, String accountName, StorageAccountExpand expand) {
        return getByResourceGroupWithResponseAsync(resourceGroupName, accountName, expand)
            .flatMap(
                (SimpleResponse<StorageAccountInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Returns the properties for the specified storage account including but not limited to name, SKU name, location,
     * and account status. The ListKeys operation should be used to retrieve storage keys.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the storage account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<StorageAccountInner> getByResourceGroupAsync(String resourceGroupName, String accountName) {
        final StorageAccountExpand expand = null;
        final Context context = null;
        return getByResourceGroupWithResponseAsync(resourceGroupName, accountName, expand)
            .flatMap(
                (SimpleResponse<StorageAccountInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Returns the properties for the specified storage account including but not limited to name, SKU name, location,
     * and account status. The ListKeys operation should be used to retrieve storage keys.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param expand May be used to expand the properties within account's properties. By default, data is not included
     *     when fetching properties. Currently we only support geoReplicationStats and blobRestoreStatus.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the storage account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public StorageAccountInner getByResourceGroup(
        String resourceGroupName, String accountName, StorageAccountExpand expand) {
        return getByResourceGroupAsync(resourceGroupName, accountName, expand).block();
    }

    /**
     * Returns the properties for the specified storage account including but not limited to name, SKU name, location,
     * and account status. The ListKeys operation should be used to retrieve storage keys.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the storage account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public StorageAccountInner getByResourceGroup(String resourceGroupName, String accountName) {
        final StorageAccountExpand expand = null;
        final Context context = null;
        return getByResourceGroupAsync(resourceGroupName, accountName, expand).block();
    }

    /**
     * The update operation can be used to update the SKU, encryption, access tier, or tags for a storage account. It
     * can also be used to map the account to a custom domain. Only one custom domain is supported per storage account;
     * the replacement/change of custom domain is not supported. In order to replace an old custom domain, the old value
     * must be cleared/unregistered before a new value can be set. The update of multiple properties is supported. This
     * call does not change the storage keys for the account. If you want to change the storage account keys, use the
     * regenerate keys operation. The location and name of the storage account cannot be changed after creation.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param parameters The parameters that can be provided when updating the storage account properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the storage account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<StorageAccountInner>> updateWithResponseAsync(
        String resourceGroupName, String accountName, StorageAccountUpdateParameters parameters) {
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
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
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
                            parameters,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * The update operation can be used to update the SKU, encryption, access tier, or tags for a storage account. It
     * can also be used to map the account to a custom domain. Only one custom domain is supported per storage account;
     * the replacement/change of custom domain is not supported. In order to replace an old custom domain, the old value
     * must be cleared/unregistered before a new value can be set. The update of multiple properties is supported. This
     * call does not change the storage keys for the account. If you want to change the storage account keys, use the
     * regenerate keys operation. The location and name of the storage account cannot be changed after creation.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param parameters The parameters that can be provided when updating the storage account properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the storage account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<StorageAccountInner>> updateWithResponseAsync(
        String resourceGroupName, String accountName, StorageAccountUpdateParameters parameters, Context context) {
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
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        return service
            .update(
                this.client.getHost(),
                resourceGroupName,
                accountName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                parameters,
                context);
    }

    /**
     * The update operation can be used to update the SKU, encryption, access tier, or tags for a storage account. It
     * can also be used to map the account to a custom domain. Only one custom domain is supported per storage account;
     * the replacement/change of custom domain is not supported. In order to replace an old custom domain, the old value
     * must be cleared/unregistered before a new value can be set. The update of multiple properties is supported. This
     * call does not change the storage keys for the account. If you want to change the storage account keys, use the
     * regenerate keys operation. The location and name of the storage account cannot be changed after creation.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param parameters The parameters that can be provided when updating the storage account properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the storage account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<StorageAccountInner> updateAsync(
        String resourceGroupName, String accountName, StorageAccountUpdateParameters parameters) {
        return updateWithResponseAsync(resourceGroupName, accountName, parameters)
            .flatMap(
                (SimpleResponse<StorageAccountInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * The update operation can be used to update the SKU, encryption, access tier, or tags for a storage account. It
     * can also be used to map the account to a custom domain. Only one custom domain is supported per storage account;
     * the replacement/change of custom domain is not supported. In order to replace an old custom domain, the old value
     * must be cleared/unregistered before a new value can be set. The update of multiple properties is supported. This
     * call does not change the storage keys for the account. If you want to change the storage account keys, use the
     * regenerate keys operation. The location and name of the storage account cannot be changed after creation.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param parameters The parameters that can be provided when updating the storage account properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the storage account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public StorageAccountInner update(
        String resourceGroupName, String accountName, StorageAccountUpdateParameters parameters) {
        return updateAsync(resourceGroupName, accountName, parameters).block();
    }

    /**
     * Lists all the storage accounts available under the subscription. Note that storage keys are not returned; use the
     * ListKeys operation for this.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the List Storage Accounts operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<StorageAccountInner>> listSinglePageAsync() {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
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
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            context))
            .<PagedResponse<StorageAccountInner>>map(
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
     * Lists all the storage accounts available under the subscription. Note that storage keys are not returned; use the
     * ListKeys operation for this.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the List Storage Accounts operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<StorageAccountInner>> listSinglePageAsync(Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        return service
            .list(this.client.getHost(), this.client.getApiVersion(), this.client.getSubscriptionId(), context)
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
     * Lists all the storage accounts available under the subscription. Note that storage keys are not returned; use the
     * ListKeys operation for this.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the List Storage Accounts operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<StorageAccountInner> listAsync() {
        return new PagedFlux<>(() -> listSinglePageAsync(), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Lists all the storage accounts available under the subscription. Note that storage keys are not returned; use the
     * ListKeys operation for this.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the List Storage Accounts operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<StorageAccountInner> listAsync(Context context) {
        return new PagedFlux<>(() -> listSinglePageAsync(context), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Lists all the storage accounts available under the subscription. Note that storage keys are not returned; use the
     * ListKeys operation for this.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the List Storage Accounts operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<StorageAccountInner> list() {
        return new PagedIterable<>(listAsync());
    }

    /**
     * Lists all the storage accounts available under the given resource group. Note that storage keys are not returned;
     * use the ListKeys operation for this.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the List Storage Accounts operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<StorageAccountInner>> listByResourceGroupSinglePageAsync(String resourceGroupName) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
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
                        .listByResourceGroup(
                            this.client.getHost(),
                            resourceGroupName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            context))
            .<PagedResponse<StorageAccountInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Lists all the storage accounts available under the given resource group. Note that storage keys are not returned;
     * use the ListKeys operation for this.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the List Storage Accounts operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<StorageAccountInner>> listByResourceGroupSinglePageAsync(
        String resourceGroupName, Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        return service
            .listByResourceGroup(
                this.client.getHost(),
                resourceGroupName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null));
    }

    /**
     * Lists all the storage accounts available under the given resource group. Note that storage keys are not returned;
     * use the ListKeys operation for this.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the List Storage Accounts operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<StorageAccountInner> listByResourceGroupAsync(String resourceGroupName) {
        return new PagedFlux<>(() -> listByResourceGroupSinglePageAsync(resourceGroupName));
    }

    /**
     * Lists all the storage accounts available under the given resource group. Note that storage keys are not returned;
     * use the ListKeys operation for this.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the List Storage Accounts operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<StorageAccountInner> listByResourceGroupAsync(String resourceGroupName, Context context) {
        return new PagedFlux<>(() -> listByResourceGroupSinglePageAsync(resourceGroupName, context));
    }

    /**
     * Lists all the storage accounts available under the given resource group. Note that storage keys are not returned;
     * use the ListKeys operation for this.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the List Storage Accounts operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<StorageAccountInner> listByResourceGroup(String resourceGroupName) {
        return new PagedIterable<>(listByResourceGroupAsync(resourceGroupName));
    }

    /**
     * Lists the access keys or Kerberos keys (if active directory enabled) for the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param expand Specifies type of the key to be listed. Possible value is kerb.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the ListKeys operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<StorageAccountListKeysResultInner>> listKeysWithResponseAsync(
        String resourceGroupName, String accountName, ListKeyExpand expand) {
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
                        .listKeys(
                            this.client.getHost(),
                            resourceGroupName,
                            accountName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            expand,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Lists the access keys or Kerberos keys (if active directory enabled) for the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param expand Specifies type of the key to be listed. Possible value is kerb.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the ListKeys operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<StorageAccountListKeysResultInner>> listKeysWithResponseAsync(
        String resourceGroupName, String accountName, ListKeyExpand expand, Context context) {
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
            .listKeys(
                this.client.getHost(),
                resourceGroupName,
                accountName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                expand,
                context);
    }

    /**
     * Lists the access keys or Kerberos keys (if active directory enabled) for the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param expand Specifies type of the key to be listed. Possible value is kerb.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the ListKeys operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<StorageAccountListKeysResultInner> listKeysAsync(
        String resourceGroupName, String accountName, ListKeyExpand expand) {
        return listKeysWithResponseAsync(resourceGroupName, accountName, expand)
            .flatMap(
                (SimpleResponse<StorageAccountListKeysResultInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Lists the access keys or Kerberos keys (if active directory enabled) for the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the ListKeys operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<StorageAccountListKeysResultInner> listKeysAsync(String resourceGroupName, String accountName) {
        final ListKeyExpand expand = null;
        final Context context = null;
        return listKeysWithResponseAsync(resourceGroupName, accountName, expand)
            .flatMap(
                (SimpleResponse<StorageAccountListKeysResultInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Lists the access keys or Kerberos keys (if active directory enabled) for the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param expand Specifies type of the key to be listed. Possible value is kerb.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the ListKeys operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public StorageAccountListKeysResultInner listKeys(
        String resourceGroupName, String accountName, ListKeyExpand expand) {
        return listKeysAsync(resourceGroupName, accountName, expand).block();
    }

    /**
     * Lists the access keys or Kerberos keys (if active directory enabled) for the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the ListKeys operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public StorageAccountListKeysResultInner listKeys(String resourceGroupName, String accountName) {
        final ListKeyExpand expand = null;
        final Context context = null;
        return listKeysAsync(resourceGroupName, accountName, expand).block();
    }

    /**
     * Regenerates one of the access keys or Kerberos keys for the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param keyName The name of storage keys that want to be regenerated, possible values are key1, key2, kerb1,
     *     kerb2.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the ListKeys operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<StorageAccountListKeysResultInner>> regenerateKeyWithResponseAsync(
        String resourceGroupName, String accountName, String keyName) {
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
        if (keyName == null) {
            return Mono.error(new IllegalArgumentException("Parameter keyName is required and cannot be null."));
        }
        StorageAccountRegenerateKeyParameters regenerateKey = new StorageAccountRegenerateKeyParameters();
        regenerateKey.withKeyName(keyName);
        return FluxUtil
            .withContext(
                context ->
                    service
                        .regenerateKey(
                            this.client.getHost(),
                            resourceGroupName,
                            accountName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            regenerateKey,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Regenerates one of the access keys or Kerberos keys for the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param keyName The name of storage keys that want to be regenerated, possible values are key1, key2, kerb1,
     *     kerb2.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the ListKeys operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<StorageAccountListKeysResultInner>> regenerateKeyWithResponseAsync(
        String resourceGroupName, String accountName, String keyName, Context context) {
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
        if (keyName == null) {
            return Mono.error(new IllegalArgumentException("Parameter keyName is required and cannot be null."));
        }
        StorageAccountRegenerateKeyParameters regenerateKey = new StorageAccountRegenerateKeyParameters();
        regenerateKey.withKeyName(keyName);
        return service
            .regenerateKey(
                this.client.getHost(),
                resourceGroupName,
                accountName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                regenerateKey,
                context);
    }

    /**
     * Regenerates one of the access keys or Kerberos keys for the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param keyName The name of storage keys that want to be regenerated, possible values are key1, key2, kerb1,
     *     kerb2.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the ListKeys operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<StorageAccountListKeysResultInner> regenerateKeyAsync(
        String resourceGroupName, String accountName, String keyName) {
        return regenerateKeyWithResponseAsync(resourceGroupName, accountName, keyName)
            .flatMap(
                (SimpleResponse<StorageAccountListKeysResultInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Regenerates one of the access keys or Kerberos keys for the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param keyName The name of storage keys that want to be regenerated, possible values are key1, key2, kerb1,
     *     kerb2.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the ListKeys operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public StorageAccountListKeysResultInner regenerateKey(
        String resourceGroupName, String accountName, String keyName) {
        return regenerateKeyAsync(resourceGroupName, accountName, keyName).block();
    }

    /**
     * List SAS credentials of a storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param parameters The parameters to list SAS credentials of a storage account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List SAS credentials operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ListAccountSasResponseInner>> listAccountSasWithResponseAsync(
        String resourceGroupName, String accountName, AccountSasParameters parameters) {
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
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listAccountSas(
                            this.client.getHost(),
                            resourceGroupName,
                            accountName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            parameters,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * List SAS credentials of a storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param parameters The parameters to list SAS credentials of a storage account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List SAS credentials operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ListAccountSasResponseInner>> listAccountSasWithResponseAsync(
        String resourceGroupName, String accountName, AccountSasParameters parameters, Context context) {
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
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        return service
            .listAccountSas(
                this.client.getHost(),
                resourceGroupName,
                accountName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                parameters,
                context);
    }

    /**
     * List SAS credentials of a storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param parameters The parameters to list SAS credentials of a storage account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List SAS credentials operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ListAccountSasResponseInner> listAccountSasAsync(
        String resourceGroupName, String accountName, AccountSasParameters parameters) {
        return listAccountSasWithResponseAsync(resourceGroupName, accountName, parameters)
            .flatMap(
                (SimpleResponse<ListAccountSasResponseInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * List SAS credentials of a storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param parameters The parameters to list SAS credentials of a storage account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List SAS credentials operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ListAccountSasResponseInner listAccountSas(
        String resourceGroupName, String accountName, AccountSasParameters parameters) {
        return listAccountSasAsync(resourceGroupName, accountName, parameters).block();
    }

    /**
     * List service SAS credentials of a specific resource.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param parameters The parameters to list service SAS credentials of a specific resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List service SAS credentials operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ListServiceSasResponseInner>> listServiceSasWithResponseAsync(
        String resourceGroupName, String accountName, ServiceSasParameters parameters) {
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
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listServiceSas(
                            this.client.getHost(),
                            resourceGroupName,
                            accountName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            parameters,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * List service SAS credentials of a specific resource.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param parameters The parameters to list service SAS credentials of a specific resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List service SAS credentials operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ListServiceSasResponseInner>> listServiceSasWithResponseAsync(
        String resourceGroupName, String accountName, ServiceSasParameters parameters, Context context) {
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
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        return service
            .listServiceSas(
                this.client.getHost(),
                resourceGroupName,
                accountName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                parameters,
                context);
    }

    /**
     * List service SAS credentials of a specific resource.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param parameters The parameters to list service SAS credentials of a specific resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List service SAS credentials operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ListServiceSasResponseInner> listServiceSasAsync(
        String resourceGroupName, String accountName, ServiceSasParameters parameters) {
        return listServiceSasWithResponseAsync(resourceGroupName, accountName, parameters)
            .flatMap(
                (SimpleResponse<ListServiceSasResponseInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * List service SAS credentials of a specific resource.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param parameters The parameters to list service SAS credentials of a specific resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List service SAS credentials operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ListServiceSasResponseInner listServiceSas(
        String resourceGroupName, String accountName, ServiceSasParameters parameters) {
        return listServiceSasAsync(resourceGroupName, accountName, parameters).block();
    }

    /**
     * Failover request can be triggered for a storage account in case of availability issues. The failover occurs from
     * the storage account's primary cluster to secondary cluster for RA-GRS accounts. The secondary cluster will become
     * primary after failover.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> failoverWithResponseAsync(
        String resourceGroupName, String accountName) {
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
                        .failover(
                            this.client.getHost(),
                            resourceGroupName,
                            accountName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Failover request can be triggered for a storage account in case of availability issues. The failover occurs from
     * the storage account's primary cluster to secondary cluster for RA-GRS accounts. The secondary cluster will become
     * primary after failover.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> failoverAsync(String resourceGroupName, String accountName) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> mono = failoverWithResponseAsync(resourceGroupName, accountName);
        return this
            .client
            .<Void, Void>getLroResultAsync(mono, this.client.getHttpPipeline(), Void.class, Void.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Failover request can be triggered for a storage account in case of availability issues. The failover occurs from
     * the storage account's primary cluster to secondary cluster for RA-GRS accounts. The secondary cluster will become
     * primary after failover.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void failover(String resourceGroupName, String accountName) {
        failoverAsync(resourceGroupName, accountName).block();
    }

    /**
     * Restore blobs in the specified blob ranges.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param timeToRestore Restore blob to the specified time.
     * @param blobRanges Blob ranges to restore.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return blob restore status.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> restoreBlobRangesWithResponseAsync(
        String resourceGroupName, String accountName, OffsetDateTime timeToRestore, List<BlobRestoreRange> blobRanges) {
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
        if (timeToRestore == null) {
            return Mono.error(new IllegalArgumentException("Parameter timeToRestore is required and cannot be null."));
        }
        if (blobRanges == null) {
            return Mono.error(new IllegalArgumentException("Parameter blobRanges is required and cannot be null."));
        } else {
            blobRanges.forEach(e -> e.validate());
        }
        BlobRestoreParameters parameters = new BlobRestoreParameters();
        parameters.withTimeToRestore(timeToRestore);
        parameters.withBlobRanges(blobRanges);
        return FluxUtil
            .withContext(
                context ->
                    service
                        .restoreBlobRanges(
                            this.client.getHost(),
                            resourceGroupName,
                            accountName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            parameters,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Restore blobs in the specified blob ranges.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param timeToRestore Restore blob to the specified time.
     * @param blobRanges Blob ranges to restore.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return blob restore status.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<BlobRestoreStatusInner> restoreBlobRangesAsync(
        String resourceGroupName, String accountName, OffsetDateTime timeToRestore, List<BlobRestoreRange> blobRanges) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> mono =
            restoreBlobRangesWithResponseAsync(resourceGroupName, accountName, timeToRestore, blobRanges);
        return this
            .client
            .<BlobRestoreStatusInner, BlobRestoreStatusInner>getLroResultAsync(
                mono, this.client.getHttpPipeline(), BlobRestoreStatusInner.class, BlobRestoreStatusInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Restore blobs in the specified blob ranges.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param timeToRestore Restore blob to the specified time.
     * @param blobRanges Blob ranges to restore.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return blob restore status.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public BlobRestoreStatusInner restoreBlobRanges(
        String resourceGroupName, String accountName, OffsetDateTime timeToRestore, List<BlobRestoreRange> blobRanges) {
        return restoreBlobRangesAsync(resourceGroupName, accountName, timeToRestore, blobRanges).block();
    }

    /**
     * Revoke user delegation keys.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> revokeUserDelegationKeysWithResponseAsync(
        String resourceGroupName, String accountName) {
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
                        .revokeUserDelegationKeys(
                            this.client.getHost(),
                            resourceGroupName,
                            accountName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Revoke user delegation keys.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> revokeUserDelegationKeysWithResponseAsync(
        String resourceGroupName, String accountName, Context context) {
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
            .revokeUserDelegationKeys(
                this.client.getHost(),
                resourceGroupName,
                accountName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                context);
    }

    /**
     * Revoke user delegation keys.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> revokeUserDelegationKeysAsync(String resourceGroupName, String accountName) {
        return revokeUserDelegationKeysWithResponseAsync(resourceGroupName, accountName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Revoke user delegation keys.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void revokeUserDelegationKeys(String resourceGroupName, String accountName) {
        revokeUserDelegationKeysAsync(resourceGroupName, accountName).block();
    }

    /**
     * Asynchronously creates a new storage account with the specified parameters. If an account is already created and
     * a subsequent create request is issued with different properties, the account properties will be updated. If an
     * account is already created and a subsequent create or update request is issued with the exact same set of
     * properties, the request will succeed.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param parameters The parameters used when creating a storage account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the storage account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<StorageAccountInner>> beginCreateWithResponseAsync(
        String resourceGroupName, String accountName, StorageAccountCreateParameters parameters) {
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
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        return FluxUtil
            .withContext(
                context ->
                    service
                        .beginCreate(
                            this.client.getHost(),
                            resourceGroupName,
                            accountName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            parameters,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Asynchronously creates a new storage account with the specified parameters. If an account is already created and
     * a subsequent create request is issued with different properties, the account properties will be updated. If an
     * account is already created and a subsequent create or update request is issued with the exact same set of
     * properties, the request will succeed.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param parameters The parameters used when creating a storage account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the storage account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<StorageAccountInner>> beginCreateWithResponseAsync(
        String resourceGroupName, String accountName, StorageAccountCreateParameters parameters, Context context) {
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
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        return service
            .beginCreate(
                this.client.getHost(),
                resourceGroupName,
                accountName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                parameters,
                context);
    }

    /**
     * Asynchronously creates a new storage account with the specified parameters. If an account is already created and
     * a subsequent create request is issued with different properties, the account properties will be updated. If an
     * account is already created and a subsequent create or update request is issued with the exact same set of
     * properties, the request will succeed.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param parameters The parameters used when creating a storage account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the storage account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<StorageAccountInner> beginCreateAsync(
        String resourceGroupName, String accountName, StorageAccountCreateParameters parameters) {
        return beginCreateWithResponseAsync(resourceGroupName, accountName, parameters)
            .flatMap(
                (SimpleResponse<StorageAccountInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Asynchronously creates a new storage account with the specified parameters. If an account is already created and
     * a subsequent create request is issued with different properties, the account properties will be updated. If an
     * account is already created and a subsequent create or update request is issued with the exact same set of
     * properties, the request will succeed.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param parameters The parameters used when creating a storage account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the storage account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public StorageAccountInner beginCreate(
        String resourceGroupName, String accountName, StorageAccountCreateParameters parameters) {
        return beginCreateAsync(resourceGroupName, accountName, parameters).block();
    }

    /**
     * Failover request can be triggered for a storage account in case of availability issues. The failover occurs from
     * the storage account's primary cluster to secondary cluster for RA-GRS accounts. The secondary cluster will become
     * primary after failover.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginFailoverWithResponseAsync(String resourceGroupName, String accountName) {
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
                        .beginFailover(
                            this.client.getHost(),
                            resourceGroupName,
                            accountName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Failover request can be triggered for a storage account in case of availability issues. The failover occurs from
     * the storage account's primary cluster to secondary cluster for RA-GRS accounts. The secondary cluster will become
     * primary after failover.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginFailoverWithResponseAsync(
        String resourceGroupName, String accountName, Context context) {
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
            .beginFailover(
                this.client.getHost(),
                resourceGroupName,
                accountName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                context);
    }

    /**
     * Failover request can be triggered for a storage account in case of availability issues. The failover occurs from
     * the storage account's primary cluster to secondary cluster for RA-GRS accounts. The secondary cluster will become
     * primary after failover.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginFailoverAsync(String resourceGroupName, String accountName) {
        return beginFailoverWithResponseAsync(resourceGroupName, accountName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Failover request can be triggered for a storage account in case of availability issues. The failover occurs from
     * the storage account's primary cluster to secondary cluster for RA-GRS accounts. The secondary cluster will become
     * primary after failover.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginFailover(String resourceGroupName, String accountName) {
        beginFailoverAsync(resourceGroupName, accountName).block();
    }

    /**
     * Restore blobs in the specified blob ranges.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param timeToRestore Restore blob to the specified time.
     * @param blobRanges Blob ranges to restore.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return blob restore status.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<BlobRestoreStatusInner>> beginRestoreBlobRangesWithResponseAsync(
        String resourceGroupName, String accountName, OffsetDateTime timeToRestore, List<BlobRestoreRange> blobRanges) {
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
        if (timeToRestore == null) {
            return Mono.error(new IllegalArgumentException("Parameter timeToRestore is required and cannot be null."));
        }
        if (blobRanges == null) {
            return Mono.error(new IllegalArgumentException("Parameter blobRanges is required and cannot be null."));
        } else {
            blobRanges.forEach(e -> e.validate());
        }
        BlobRestoreParameters parameters = new BlobRestoreParameters();
        parameters.withTimeToRestore(timeToRestore);
        parameters.withBlobRanges(blobRanges);
        return FluxUtil
            .withContext(
                context ->
                    service
                        .beginRestoreBlobRanges(
                            this.client.getHost(),
                            resourceGroupName,
                            accountName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            parameters,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Restore blobs in the specified blob ranges.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param timeToRestore Restore blob to the specified time.
     * @param blobRanges Blob ranges to restore.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return blob restore status.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<BlobRestoreStatusInner>> beginRestoreBlobRangesWithResponseAsync(
        String resourceGroupName,
        String accountName,
        OffsetDateTime timeToRestore,
        List<BlobRestoreRange> blobRanges,
        Context context) {
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
        if (timeToRestore == null) {
            return Mono.error(new IllegalArgumentException("Parameter timeToRestore is required and cannot be null."));
        }
        if (blobRanges == null) {
            return Mono.error(new IllegalArgumentException("Parameter blobRanges is required and cannot be null."));
        } else {
            blobRanges.forEach(e -> e.validate());
        }
        BlobRestoreParameters parameters = new BlobRestoreParameters();
        parameters.withTimeToRestore(timeToRestore);
        parameters.withBlobRanges(blobRanges);
        return service
            .beginRestoreBlobRanges(
                this.client.getHost(),
                resourceGroupName,
                accountName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                parameters,
                context);
    }

    /**
     * Restore blobs in the specified blob ranges.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param timeToRestore Restore blob to the specified time.
     * @param blobRanges Blob ranges to restore.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return blob restore status.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<BlobRestoreStatusInner> beginRestoreBlobRangesAsync(
        String resourceGroupName, String accountName, OffsetDateTime timeToRestore, List<BlobRestoreRange> blobRanges) {
        return beginRestoreBlobRangesWithResponseAsync(resourceGroupName, accountName, timeToRestore, blobRanges)
            .flatMap(
                (SimpleResponse<BlobRestoreStatusInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Restore blobs in the specified blob ranges.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param timeToRestore Restore blob to the specified time.
     * @param blobRanges Blob ranges to restore.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return blob restore status.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public BlobRestoreStatusInner beginRestoreBlobRanges(
        String resourceGroupName, String accountName, OffsetDateTime timeToRestore, List<BlobRestoreRange> blobRanges) {
        return beginRestoreBlobRangesAsync(resourceGroupName, accountName, timeToRestore, blobRanges).block();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the List Storage Accounts operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<StorageAccountInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        return FluxUtil
            .withContext(context -> service.listNext(nextLink, context))
            .<PagedResponse<StorageAccountInner>>map(
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
     * @return the response from the List Storage Accounts operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<StorageAccountInner>> listNextSinglePageAsync(String nextLink, Context context) {
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
