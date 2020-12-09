// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storage.generated.fluent.ManagementPoliciesClient;
import com.azure.resourcemanager.storage.generated.fluent.models.ManagementPolicyInner;
import com.azure.resourcemanager.storage.generated.models.ManagementPolicyName;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ManagementPoliciesClient. */
public final class ManagementPoliciesClientImpl implements ManagementPoliciesClient {
    private final ClientLogger logger = new ClientLogger(ManagementPoliciesClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final ManagementPoliciesService service;

    /** The service client containing this operation class. */
    private final StorageManagementClientImpl client;

    /**
     * Initializes an instance of ManagementPoliciesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ManagementPoliciesClientImpl(StorageManagementClientImpl client) {
        this.service =
            RestProxy.create(ManagementPoliciesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for StorageManagementClientManagementPolicies to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "StorageManagementCli")
    private interface ManagementPoliciesService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage"
                + "/storageAccounts/{accountName}/managementPolicies/{managementPolicyName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ManagementPolicyInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("managementPolicyName") ManagementPolicyName managementPolicyName,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Put(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage"
                + "/storageAccounts/{accountName}/managementPolicies/{managementPolicyName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ManagementPolicyInner>> createOrUpdate(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("managementPolicyName") ManagementPolicyName managementPolicyName,
            @BodyParam("application/json") ManagementPolicyInner properties,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Accept: application/json;q=0.9", "Content-Type: application/json"})
        @Delete(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage"
                + "/storageAccounts/{accountName}/managementPolicies/{managementPolicyName}")
        @ExpectedResponses({200, 204})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Void>> delete(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("managementPolicyName") ManagementPolicyName managementPolicyName,
            Context context);
    }

    /**
     * Gets the managementpolicy associated with the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param managementPolicyName The name of the Storage Account Management Policy. It should always be 'default'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the managementpolicy associated with the specified storage account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ManagementPolicyInner>> getWithResponseAsync(
        String resourceGroupName, String accountName, ManagementPolicyName managementPolicyName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
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
        if (managementPolicyName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter managementPolicyName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            accountName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            managementPolicyName,
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets the managementpolicy associated with the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param managementPolicyName The name of the Storage Account Management Policy. It should always be 'default'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the managementpolicy associated with the specified storage account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ManagementPolicyInner>> getWithResponseAsync(
        String resourceGroupName, String accountName, ManagementPolicyName managementPolicyName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
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
        if (managementPolicyName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter managementPolicyName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                resourceGroupName,
                accountName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                managementPolicyName,
                accept,
                context);
    }

    /**
     * Gets the managementpolicy associated with the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param managementPolicyName The name of the Storage Account Management Policy. It should always be 'default'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the managementpolicy associated with the specified storage account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ManagementPolicyInner> getAsync(
        String resourceGroupName, String accountName, ManagementPolicyName managementPolicyName) {
        return getWithResponseAsync(resourceGroupName, accountName, managementPolicyName)
            .flatMap(
                (Response<ManagementPolicyInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets the managementpolicy associated with the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param managementPolicyName The name of the Storage Account Management Policy. It should always be 'default'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the managementpolicy associated with the specified storage account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ManagementPolicyInner get(
        String resourceGroupName, String accountName, ManagementPolicyName managementPolicyName) {
        return getAsync(resourceGroupName, accountName, managementPolicyName).block();
    }

    /**
     * Gets the managementpolicy associated with the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param managementPolicyName The name of the Storage Account Management Policy. It should always be 'default'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the managementpolicy associated with the specified storage account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ManagementPolicyInner> getWithResponse(
        String resourceGroupName, String accountName, ManagementPolicyName managementPolicyName, Context context) {
        return getWithResponseAsync(resourceGroupName, accountName, managementPolicyName, context).block();
    }

    /**
     * Sets the managementpolicy to the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param managementPolicyName The name of the Storage Account Management Policy. It should always be 'default'.
     * @param properties The Get Storage Account ManagementPolicies operation response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Get Storage Account ManagementPolicies operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ManagementPolicyInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName,
        String accountName,
        ManagementPolicyName managementPolicyName,
        ManagementPolicyInner properties) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
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
        if (managementPolicyName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter managementPolicyName is required and cannot be null."));
        }
        if (properties == null) {
            return Mono.error(new IllegalArgumentException("Parameter properties is required and cannot be null."));
        } else {
            properties.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .createOrUpdate(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            accountName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            managementPolicyName,
                            properties,
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Sets the managementpolicy to the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param managementPolicyName The name of the Storage Account Management Policy. It should always be 'default'.
     * @param properties The Get Storage Account ManagementPolicies operation response.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Get Storage Account ManagementPolicies operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ManagementPolicyInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName,
        String accountName,
        ManagementPolicyName managementPolicyName,
        ManagementPolicyInner properties,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
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
        if (managementPolicyName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter managementPolicyName is required and cannot be null."));
        }
        if (properties == null) {
            return Mono.error(new IllegalArgumentException("Parameter properties is required and cannot be null."));
        } else {
            properties.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .createOrUpdate(
                this.client.getEndpoint(),
                resourceGroupName,
                accountName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                managementPolicyName,
                properties,
                accept,
                context);
    }

    /**
     * Sets the managementpolicy to the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param managementPolicyName The name of the Storage Account Management Policy. It should always be 'default'.
     * @param properties The Get Storage Account ManagementPolicies operation response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Get Storage Account ManagementPolicies operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ManagementPolicyInner> createOrUpdateAsync(
        String resourceGroupName,
        String accountName,
        ManagementPolicyName managementPolicyName,
        ManagementPolicyInner properties) {
        return createOrUpdateWithResponseAsync(resourceGroupName, accountName, managementPolicyName, properties)
            .flatMap(
                (Response<ManagementPolicyInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Sets the managementpolicy to the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param managementPolicyName The name of the Storage Account Management Policy. It should always be 'default'.
     * @param properties The Get Storage Account ManagementPolicies operation response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Get Storage Account ManagementPolicies operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ManagementPolicyInner createOrUpdate(
        String resourceGroupName,
        String accountName,
        ManagementPolicyName managementPolicyName,
        ManagementPolicyInner properties) {
        return createOrUpdateAsync(resourceGroupName, accountName, managementPolicyName, properties).block();
    }

    /**
     * Sets the managementpolicy to the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param managementPolicyName The name of the Storage Account Management Policy. It should always be 'default'.
     * @param properties The Get Storage Account ManagementPolicies operation response.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Get Storage Account ManagementPolicies operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ManagementPolicyInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String accountName,
        ManagementPolicyName managementPolicyName,
        ManagementPolicyInner properties,
        Context context) {
        return createOrUpdateWithResponseAsync(
                resourceGroupName, accountName, managementPolicyName, properties, context)
            .block();
    }

    /**
     * Deletes the managementpolicy associated with the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param managementPolicyName The name of the Storage Account Management Policy. It should always be 'default'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> deleteWithResponseAsync(
        String resourceGroupName, String accountName, ManagementPolicyName managementPolicyName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
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
        if (managementPolicyName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter managementPolicyName is required and cannot be null."));
        }
        return FluxUtil
            .withContext(
                context ->
                    service
                        .delete(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            accountName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            managementPolicyName,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Deletes the managementpolicy associated with the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param managementPolicyName The name of the Storage Account Management Policy. It should always be 'default'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> deleteWithResponseAsync(
        String resourceGroupName, String accountName, ManagementPolicyName managementPolicyName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
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
        if (managementPolicyName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter managementPolicyName is required and cannot be null."));
        }
        context = this.client.mergeContext(context);
        return service
            .delete(
                this.client.getEndpoint(),
                resourceGroupName,
                accountName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                managementPolicyName,
                context);
    }

    /**
     * Deletes the managementpolicy associated with the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param managementPolicyName The name of the Storage Account Management Policy. It should always be 'default'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> deleteAsync(
        String resourceGroupName, String accountName, ManagementPolicyName managementPolicyName) {
        return deleteWithResponseAsync(resourceGroupName, accountName, managementPolicyName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes the managementpolicy associated with the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param managementPolicyName The name of the Storage Account Management Policy. It should always be 'default'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String accountName, ManagementPolicyName managementPolicyName) {
        deleteAsync(resourceGroupName, accountName, managementPolicyName).block();
    }

    /**
     * Deletes the managementpolicy associated with the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param managementPolicyName The name of the Storage Account Management Policy. It should always be 'default'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteWithResponse(
        String resourceGroupName, String accountName, ManagementPolicyName managementPolicyName, Context context) {
        return deleteWithResponseAsync(resourceGroupName, accountName, managementPolicyName, context).block();
    }
}
