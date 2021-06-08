// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.keyvault.administration.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
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
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.security.keyvault.administration.implementation.models.KeyVaultErrorException;
import com.azure.security.keyvault.administration.implementation.models.RoleDefinition;
import com.azure.security.keyvault.administration.implementation.models.RoleDefinitionCreateParameters;
import com.azure.security.keyvault.administration.implementation.models.RoleDefinitionListResult;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in RoleDefinitions. */
public final class RoleDefinitionsImpl {
    /** The proxy service used to perform REST calls. */
    private final RoleDefinitionsService service;

    /** The service client containing this operation class. */
    private final KeyVaultAccessControlClientImpl client;

    /**
     * Initializes an instance of RoleDefinitionsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    RoleDefinitionsImpl(KeyVaultAccessControlClientImpl client) {
        this.service =
                RestProxy.create(RoleDefinitionsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for KeyVaultAccessControlClientRoleDefinitions to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{vaultBaseUrl}")
    @ServiceInterface(name = "KeyVaultAccessContro")
    public interface RoleDefinitionsService {
        @Delete("/{scope}/providers/Microsoft.Authorization/roleDefinitions/{roleDefinitionName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(KeyVaultErrorException.class)
        Mono<Response<RoleDefinition>> delete(
                @HostParam("vaultBaseUrl") String vaultBaseUrl,
                @PathParam(value = "scope", encoded = true) String scope,
                @PathParam("roleDefinitionName") String roleDefinitionName,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                Context context);

        @Put("/{scope}/providers/Microsoft.Authorization/roleDefinitions/{roleDefinitionName}")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(KeyVaultErrorException.class)
        Mono<Response<RoleDefinition>> createOrUpdate(
                @HostParam("vaultBaseUrl") String vaultBaseUrl,
                @PathParam(value = "scope", encoded = true) String scope,
                @PathParam("roleDefinitionName") String roleDefinitionName,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") RoleDefinitionCreateParameters parameters,
                @HeaderParam("Accept") String accept,
                Context context);

        @Get("/{scope}/providers/Microsoft.Authorization/roleDefinitions/{roleDefinitionName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(KeyVaultErrorException.class)
        Mono<Response<RoleDefinition>> get(
                @HostParam("vaultBaseUrl") String vaultBaseUrl,
                @PathParam(value = "scope", encoded = true) String scope,
                @PathParam("roleDefinitionName") String roleDefinitionName,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                Context context);

        @Get("/{scope}/providers/Microsoft.Authorization/roleDefinitions")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(KeyVaultErrorException.class)
        Mono<Response<RoleDefinitionListResult>> list(
                @HostParam("vaultBaseUrl") String vaultBaseUrl,
                @PathParam(value = "scope", encoded = true) String scope,
                @QueryParam("$filter") String filter,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                Context context);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(KeyVaultErrorException.class)
        Mono<Response<RoleDefinitionListResult>> listNext(
                @PathParam(value = "nextLink", encoded = true) String nextLink,
                @HostParam("vaultBaseUrl") String vaultBaseUrl,
                @HeaderParam("Accept") String accept,
                Context context);
    }

    /**
     * Deletes a custom role definition.
     *
     * @param vaultBaseUrl The vault name, for example https://myvault.vault.azure.net.
     * @param scope The scope of the role definition to delete. Managed HSM only supports '/'.
     * @param roleDefinitionName The name (GUID) of the role definition to delete.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws KeyVaultErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RoleDefinition>> deleteWithResponseAsync(
            String vaultBaseUrl, String scope, String roleDefinitionName, Context context) {
        final String accept = "application/json";
        return service.delete(vaultBaseUrl, scope, roleDefinitionName, this.client.getApiVersion(), accept, context);
    }

    /**
     * Creates or updates a custom role definition.
     *
     * @param vaultBaseUrl The vault name, for example https://myvault.vault.azure.net.
     * @param scope The scope of the role definition to create or update. Managed HSM only supports '/'.
     * @param roleDefinitionName The name of the role definition to create or update. It can be any valid GUID.
     * @param parameters Parameters for the role definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws KeyVaultErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RoleDefinition>> createOrUpdateWithResponseAsync(
            String vaultBaseUrl,
            String scope,
            String roleDefinitionName,
            RoleDefinitionCreateParameters parameters,
            Context context) {
        final String accept = "application/json";
        return service.createOrUpdate(
                vaultBaseUrl, scope, roleDefinitionName, this.client.getApiVersion(), parameters, accept, context);
    }

    /**
     * Get the specified role definition.
     *
     * @param vaultBaseUrl The vault name, for example https://myvault.vault.azure.net.
     * @param scope The scope of the role definition to get. Managed HSM only supports '/'.
     * @param roleDefinitionName The name of the role definition to get.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws KeyVaultErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified role definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RoleDefinition>> getWithResponseAsync(
            String vaultBaseUrl, String scope, String roleDefinitionName, Context context) {
        final String accept = "application/json";
        return service.get(vaultBaseUrl, scope, roleDefinitionName, this.client.getApiVersion(), accept, context);
    }

    /**
     * Get all role definitions that are applicable at scope and above.
     *
     * @param vaultBaseUrl The vault name, for example https://myvault.vault.azure.net.
     * @param scope The scope of the role definition.
     * @param filter The filter to apply on the operation. Use atScopeAndBelow filter to search below the given scope as
     *     well.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws KeyVaultErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all role definitions that are applicable at scope and above.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<RoleDefinition>> listSinglePageAsync(
            String vaultBaseUrl, String scope, String filter, Context context) {
        final String accept = "application/json";
        return service.list(vaultBaseUrl, scope, filter, this.client.getApiVersion(), accept, context)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        res.getValue().getValue(),
                                        res.getValue().getNextLink(),
                                        null));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @param vaultBaseUrl The vault name, for example https://myvault.vault.azure.net.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws KeyVaultErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role definition list operation result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<RoleDefinition>> listNextSinglePageAsync(
            String nextLink, String vaultBaseUrl, Context context) {
        final String accept = "application/json";
        return service.listNext(nextLink, vaultBaseUrl, accept, context)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        res.getValue().getValue(),
                                        res.getValue().getNextLink(),
                                        null));
    }
}
