// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.storage.fluent;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
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
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.management.resources.fluentcore.collection.InnerSupportsDelete;
import com.azure.management.storage.StorageManagementClient;
import com.azure.management.storage.fluent.inner.ManagementPolicyInner;
import com.azure.management.storage.models.ManagementPolicySchema;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ManagementPolicies. */
public final class ManagementPoliciesClient implements InnerSupportsDelete<Void> {
    private final ClientLogger logger = new ClientLogger(ManagementPoliciesClient.class);

    /** The proxy service used to perform REST calls. */
    private final ManagementPoliciesService service;

    /** The service client containing this operation class. */
    private final StorageManagementClient client;

    /**
     * Initializes an instance of ManagementPoliciesClient.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public ManagementPoliciesClient(StorageManagementClient client) {
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
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage"
                + "/storageAccounts/{accountName}/managementPolicies/{managementPolicyName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<SimpleResponse<ManagementPolicyInner>> get(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("managementPolicyName") String managementPolicyName,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Put(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage"
                + "/storageAccounts/{accountName}/managementPolicies/{managementPolicyName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<SimpleResponse<ManagementPolicyInner>> createOrUpdate(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("managementPolicyName") String managementPolicyName,
            @BodyParam("application/json") ManagementPolicyInner properties,
            Context context);

        @Headers({"Accept: application/json;q=0.9", "Content-Type: application/json"})
        @Delete(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage"
                + "/storageAccounts/{accountName}/managementPolicies/{managementPolicyName}")
        @ExpectedResponses({200, 204})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Void>> delete(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("managementPolicyName") String managementPolicyName,
            Context context);
    }

    /**
     * Gets the managementpolicy associated with the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the managementpolicy associated with the specified storage account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ManagementPolicyInner>> getWithResponseAsync(
        String resourceGroupName, String accountName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
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
        final String managementPolicyName = "default";
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
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the managementpolicy associated with the specified storage account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ManagementPolicyInner>> getWithResponseAsync(
        String resourceGroupName, String accountName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
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
        final String managementPolicyName = "default";
        return service
            .get(
                this.client.getEndpoint(),
                resourceGroupName,
                accountName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                managementPolicyName,
                context);
    }

    /**
     * Gets the managementpolicy associated with the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the managementpolicy associated with the specified storage account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ManagementPolicyInner> getAsync(String resourceGroupName, String accountName) {
        return getWithResponseAsync(resourceGroupName, accountName)
            .flatMap(
                (SimpleResponse<ManagementPolicyInner> res) -> {
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
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the managementpolicy associated with the specified storage account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ManagementPolicyInner> getAsync(String resourceGroupName, String accountName, Context context) {
        return getWithResponseAsync(resourceGroupName, accountName, context)
            .flatMap(
                (SimpleResponse<ManagementPolicyInner> res) -> {
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
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the managementpolicy associated with the specified storage account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ManagementPolicyInner get(String resourceGroupName, String accountName) {
        return getAsync(resourceGroupName, accountName).block();
    }

    /**
     * Gets the managementpolicy associated with the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the managementpolicy associated with the specified storage account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ManagementPolicyInner get(String resourceGroupName, String accountName, Context context) {
        return getAsync(resourceGroupName, accountName, context).block();
    }

    /**
     * Sets the managementpolicy to the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param policy The Storage Account ManagementPolicies Rules. See more details in:
     *     https://docs.microsoft.com/en-us/azure/storage/common/storage-lifecycle-managment-concepts.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Get Storage Account ManagementPolicies operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ManagementPolicyInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName, String accountName, ManagementPolicySchema policy) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
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
        if (policy != null) {
            policy.validate();
        }
        final String managementPolicyName = "default";
        ManagementPolicyInner properties = new ManagementPolicyInner();
        properties.withPolicy(policy);
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
     * @param policy The Storage Account ManagementPolicies Rules. See more details in:
     *     https://docs.microsoft.com/en-us/azure/storage/common/storage-lifecycle-managment-concepts.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Get Storage Account ManagementPolicies operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ManagementPolicyInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName, String accountName, ManagementPolicySchema policy, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
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
        if (policy != null) {
            policy.validate();
        }
        final String managementPolicyName = "default";
        ManagementPolicyInner properties = new ManagementPolicyInner();
        properties.withPolicy(policy);
        return service
            .createOrUpdate(
                this.client.getEndpoint(),
                resourceGroupName,
                accountName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                managementPolicyName,
                properties,
                context);
    }

    /**
     * Sets the managementpolicy to the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param policy The Storage Account ManagementPolicies Rules. See more details in:
     *     https://docs.microsoft.com/en-us/azure/storage/common/storage-lifecycle-managment-concepts.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Get Storage Account ManagementPolicies operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ManagementPolicyInner> createOrUpdateAsync(
        String resourceGroupName, String accountName, ManagementPolicySchema policy) {
        return createOrUpdateWithResponseAsync(resourceGroupName, accountName, policy)
            .flatMap(
                (SimpleResponse<ManagementPolicyInner> res) -> {
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
     * @param policy The Storage Account ManagementPolicies Rules. See more details in:
     *     https://docs.microsoft.com/en-us/azure/storage/common/storage-lifecycle-managment-concepts.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Get Storage Account ManagementPolicies operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ManagementPolicyInner> createOrUpdateAsync(
        String resourceGroupName, String accountName, ManagementPolicySchema policy, Context context) {
        return createOrUpdateWithResponseAsync(resourceGroupName, accountName, policy, context)
            .flatMap(
                (SimpleResponse<ManagementPolicyInner> res) -> {
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
     * @param policy The Storage Account ManagementPolicies Rules. See more details in:
     *     https://docs.microsoft.com/en-us/azure/storage/common/storage-lifecycle-managment-concepts.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Get Storage Account ManagementPolicies operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ManagementPolicyInner createOrUpdate(
        String resourceGroupName, String accountName, ManagementPolicySchema policy) {
        return createOrUpdateAsync(resourceGroupName, accountName, policy).block();
    }

    /**
     * Sets the managementpolicy to the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param policy The Storage Account ManagementPolicies Rules. See more details in:
     *     https://docs.microsoft.com/en-us/azure/storage/common/storage-lifecycle-managment-concepts.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Get Storage Account ManagementPolicies operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ManagementPolicyInner createOrUpdate(
        String resourceGroupName, String accountName, ManagementPolicySchema policy, Context context) {
        return createOrUpdateAsync(resourceGroupName, accountName, policy, context).block();
    }

    /**
     * Deletes the managementpolicy associated with the specified storage account.
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
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
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
        final String managementPolicyName = "default";
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
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(String resourceGroupName, String accountName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
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
        final String managementPolicyName = "default";
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
     * Deletes the managementpolicy associated with the specified storage account.
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
    public Mono<Void> deleteAsync(String resourceGroupName, String accountName, Context context) {
        return deleteWithResponseAsync(resourceGroupName, accountName, context)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes the managementpolicy associated with the specified storage account.
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
     * Deletes the managementpolicy associated with the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String accountName, Context context) {
        deleteAsync(resourceGroupName, accountName, context).block();
    }
}
