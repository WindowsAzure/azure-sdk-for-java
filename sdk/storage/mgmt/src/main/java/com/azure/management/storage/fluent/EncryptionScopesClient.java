// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.management.storage.fluent;

import com.azure.core.annotation.BodyParam;
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
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.management.storage.StorageManagementClient;
import com.azure.management.storage.fluent.inner.EncryptionScopeInner;
import com.azure.management.storage.fluent.inner.EncryptionScopeListResultInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in EncryptionScopes. */
public final class EncryptionScopesClient {
    private final ClientLogger logger = new ClientLogger(EncryptionScopesClient.class);

    /** The proxy service used to perform REST calls. */
    private final EncryptionScopesService service;

    /** The service client containing this operation class. */
    private final StorageManagementClient client;

    /**
     * Initializes an instance of EncryptionScopesClient.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public EncryptionScopesClient(StorageManagementClient client) {
        this.service =
            RestProxy.create(EncryptionScopesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for StorageManagementClientEncryptionScopes to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "StorageManagementCli")
    private interface EncryptionScopesService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Put(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage"
                + "/storageAccounts/{accountName}/encryptionScopes/{encryptionScopeName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<SimpleResponse<EncryptionScopeInner>> put(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("encryptionScopeName") String encryptionScopeName,
            @BodyParam("application/json") EncryptionScopeInner encryptionScope,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Patch(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage"
                + "/storageAccounts/{accountName}/encryptionScopes/{encryptionScopeName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<SimpleResponse<EncryptionScopeInner>> patch(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("encryptionScopeName") String encryptionScopeName,
            @BodyParam("application/json") EncryptionScopeInner encryptionScope,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage"
                + "/storageAccounts/{accountName}/encryptionScopes/{encryptionScopeName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<SimpleResponse<EncryptionScopeInner>> get(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("encryptionScopeName") String encryptionScopeName,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage"
                + "/storageAccounts/{accountName}/encryptionScopes")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<SimpleResponse<EncryptionScopeListResultInner>> list(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<SimpleResponse<EncryptionScopeListResultInner>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, Context context);
    }

    /**
     * Synchronously creates or updates an encryption scope under the specified storage account. If an encryption scope
     * is already created and a subsequent request is issued with different properties, the encryption scope properties
     * will be updated per the specified request.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param encryptionScopeName The name of the encryption scope within the specified storage account. Encryption
     *     scope names must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-)
     *     only. Every dash (-) character must be immediately preceded and followed by a letter or number.
     * @param encryptionScope The Encryption Scope resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Encryption Scope resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<EncryptionScopeInner>> putWithResponseAsync(
        String resourceGroupName,
        String accountName,
        String encryptionScopeName,
        EncryptionScopeInner encryptionScope) {
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
        if (encryptionScopeName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter encryptionScopeName is required and cannot be null."));
        }
        if (encryptionScope == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter encryptionScope is required and cannot be null."));
        } else {
            encryptionScope.validate();
        }
        return FluxUtil
            .withContext(
                context ->
                    service
                        .put(
                            this.client.getHost(),
                            resourceGroupName,
                            accountName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            encryptionScopeName,
                            encryptionScope,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Synchronously creates or updates an encryption scope under the specified storage account. If an encryption scope
     * is already created and a subsequent request is issued with different properties, the encryption scope properties
     * will be updated per the specified request.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param encryptionScopeName The name of the encryption scope within the specified storage account. Encryption
     *     scope names must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-)
     *     only. Every dash (-) character must be immediately preceded and followed by a letter or number.
     * @param encryptionScope The Encryption Scope resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Encryption Scope resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<EncryptionScopeInner>> putWithResponseAsync(
        String resourceGroupName,
        String accountName,
        String encryptionScopeName,
        EncryptionScopeInner encryptionScope,
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
        if (encryptionScopeName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter encryptionScopeName is required and cannot be null."));
        }
        if (encryptionScope == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter encryptionScope is required and cannot be null."));
        } else {
            encryptionScope.validate();
        }
        return service
            .put(
                this.client.getHost(),
                resourceGroupName,
                accountName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                encryptionScopeName,
                encryptionScope,
                context);
    }

    /**
     * Synchronously creates or updates an encryption scope under the specified storage account. If an encryption scope
     * is already created and a subsequent request is issued with different properties, the encryption scope properties
     * will be updated per the specified request.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param encryptionScopeName The name of the encryption scope within the specified storage account. Encryption
     *     scope names must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-)
     *     only. Every dash (-) character must be immediately preceded and followed by a letter or number.
     * @param encryptionScope The Encryption Scope resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Encryption Scope resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<EncryptionScopeInner> putAsync(
        String resourceGroupName,
        String accountName,
        String encryptionScopeName,
        EncryptionScopeInner encryptionScope) {
        return putWithResponseAsync(resourceGroupName, accountName, encryptionScopeName, encryptionScope)
            .flatMap(
                (SimpleResponse<EncryptionScopeInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Synchronously creates or updates an encryption scope under the specified storage account. If an encryption scope
     * is already created and a subsequent request is issued with different properties, the encryption scope properties
     * will be updated per the specified request.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param encryptionScopeName The name of the encryption scope within the specified storage account. Encryption
     *     scope names must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-)
     *     only. Every dash (-) character must be immediately preceded and followed by a letter or number.
     * @param encryptionScope The Encryption Scope resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Encryption Scope resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public EncryptionScopeInner put(
        String resourceGroupName,
        String accountName,
        String encryptionScopeName,
        EncryptionScopeInner encryptionScope) {
        return putAsync(resourceGroupName, accountName, encryptionScopeName, encryptionScope).block();
    }

    /**
     * Update encryption scope properties as specified in the request body. Update fails if the specified encryption
     * scope does not already exist.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param encryptionScopeName The name of the encryption scope within the specified storage account. Encryption
     *     scope names must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-)
     *     only. Every dash (-) character must be immediately preceded and followed by a letter or number.
     * @param encryptionScope The Encryption Scope resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Encryption Scope resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<EncryptionScopeInner>> patchWithResponseAsync(
        String resourceGroupName,
        String accountName,
        String encryptionScopeName,
        EncryptionScopeInner encryptionScope) {
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
        if (encryptionScopeName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter encryptionScopeName is required and cannot be null."));
        }
        if (encryptionScope == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter encryptionScope is required and cannot be null."));
        } else {
            encryptionScope.validate();
        }
        return FluxUtil
            .withContext(
                context ->
                    service
                        .patch(
                            this.client.getHost(),
                            resourceGroupName,
                            accountName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            encryptionScopeName,
                            encryptionScope,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Update encryption scope properties as specified in the request body. Update fails if the specified encryption
     * scope does not already exist.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param encryptionScopeName The name of the encryption scope within the specified storage account. Encryption
     *     scope names must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-)
     *     only. Every dash (-) character must be immediately preceded and followed by a letter or number.
     * @param encryptionScope The Encryption Scope resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Encryption Scope resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<EncryptionScopeInner>> patchWithResponseAsync(
        String resourceGroupName,
        String accountName,
        String encryptionScopeName,
        EncryptionScopeInner encryptionScope,
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
        if (encryptionScopeName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter encryptionScopeName is required and cannot be null."));
        }
        if (encryptionScope == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter encryptionScope is required and cannot be null."));
        } else {
            encryptionScope.validate();
        }
        return service
            .patch(
                this.client.getHost(),
                resourceGroupName,
                accountName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                encryptionScopeName,
                encryptionScope,
                context);
    }

    /**
     * Update encryption scope properties as specified in the request body. Update fails if the specified encryption
     * scope does not already exist.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param encryptionScopeName The name of the encryption scope within the specified storage account. Encryption
     *     scope names must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-)
     *     only. Every dash (-) character must be immediately preceded and followed by a letter or number.
     * @param encryptionScope The Encryption Scope resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Encryption Scope resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<EncryptionScopeInner> patchAsync(
        String resourceGroupName,
        String accountName,
        String encryptionScopeName,
        EncryptionScopeInner encryptionScope) {
        return patchWithResponseAsync(resourceGroupName, accountName, encryptionScopeName, encryptionScope)
            .flatMap(
                (SimpleResponse<EncryptionScopeInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Update encryption scope properties as specified in the request body. Update fails if the specified encryption
     * scope does not already exist.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param encryptionScopeName The name of the encryption scope within the specified storage account. Encryption
     *     scope names must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-)
     *     only. Every dash (-) character must be immediately preceded and followed by a letter or number.
     * @param encryptionScope The Encryption Scope resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Encryption Scope resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public EncryptionScopeInner patch(
        String resourceGroupName,
        String accountName,
        String encryptionScopeName,
        EncryptionScopeInner encryptionScope) {
        return patchAsync(resourceGroupName, accountName, encryptionScopeName, encryptionScope).block();
    }

    /**
     * Returns the properties for the specified encryption scope.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param encryptionScopeName The name of the encryption scope within the specified storage account. Encryption
     *     scope names must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-)
     *     only. Every dash (-) character must be immediately preceded and followed by a letter or number.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Encryption Scope resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<EncryptionScopeInner>> getWithResponseAsync(
        String resourceGroupName, String accountName, String encryptionScopeName) {
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
        if (encryptionScopeName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter encryptionScopeName is required and cannot be null."));
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
                            encryptionScopeName,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Returns the properties for the specified encryption scope.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param encryptionScopeName The name of the encryption scope within the specified storage account. Encryption
     *     scope names must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-)
     *     only. Every dash (-) character must be immediately preceded and followed by a letter or number.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Encryption Scope resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<EncryptionScopeInner>> getWithResponseAsync(
        String resourceGroupName, String accountName, String encryptionScopeName, Context context) {
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
        if (encryptionScopeName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter encryptionScopeName is required and cannot be null."));
        }
        return service
            .get(
                this.client.getHost(),
                resourceGroupName,
                accountName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                encryptionScopeName,
                context);
    }

    /**
     * Returns the properties for the specified encryption scope.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param encryptionScopeName The name of the encryption scope within the specified storage account. Encryption
     *     scope names must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-)
     *     only. Every dash (-) character must be immediately preceded and followed by a letter or number.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Encryption Scope resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<EncryptionScopeInner> getAsync(
        String resourceGroupName, String accountName, String encryptionScopeName) {
        return getWithResponseAsync(resourceGroupName, accountName, encryptionScopeName)
            .flatMap(
                (SimpleResponse<EncryptionScopeInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Returns the properties for the specified encryption scope.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param encryptionScopeName The name of the encryption scope within the specified storage account. Encryption
     *     scope names must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-)
     *     only. Every dash (-) character must be immediately preceded and followed by a letter or number.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Encryption Scope resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public EncryptionScopeInner get(String resourceGroupName, String accountName, String encryptionScopeName) {
        return getAsync(resourceGroupName, accountName, encryptionScopeName).block();
    }

    /**
     * Lists all the encryption scopes available under the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of encryption scopes requested, and if paging is required, a URL to the next page of encryption
     *     scopes.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<EncryptionScopeInner>> listSinglePageAsync(String resourceGroupName, String accountName) {
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
                            context))
            .<PagedResponse<EncryptionScopeInner>>map(
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
     * Lists all the encryption scopes available under the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of encryption scopes requested, and if paging is required, a URL to the next page of encryption
     *     scopes.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<EncryptionScopeInner>> listSinglePageAsync(
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
            .list(
                this.client.getHost(),
                resourceGroupName,
                accountName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
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
     * Lists all the encryption scopes available under the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of encryption scopes requested, and if paging is required, a URL to the next page of encryption
     *     scopes.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<EncryptionScopeInner> listAsync(String resourceGroupName, String accountName) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, accountName), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Lists all the encryption scopes available under the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of encryption scopes requested, and if paging is required, a URL to the next page of encryption
     *     scopes.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<EncryptionScopeInner> listAsync(String resourceGroupName, String accountName, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, accountName, context),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Lists all the encryption scopes available under the specified storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of encryption scopes requested, and if paging is required, a URL to the next page of encryption
     *     scopes.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<EncryptionScopeInner> list(String resourceGroupName, String accountName) {
        return new PagedIterable<>(listAsync(resourceGroupName, accountName));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of encryption scopes requested, and if paging is required, a URL to the next page of encryption
     *     scopes.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<EncryptionScopeInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        return FluxUtil
            .withContext(context -> service.listNext(nextLink, context))
            .<PagedResponse<EncryptionScopeInner>>map(
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
     * @return list of encryption scopes requested, and if paging is required, a URL to the next page of encryption
     *     scopes.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<EncryptionScopeInner>> listNextSinglePageAsync(String nextLink, Context context) {
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
