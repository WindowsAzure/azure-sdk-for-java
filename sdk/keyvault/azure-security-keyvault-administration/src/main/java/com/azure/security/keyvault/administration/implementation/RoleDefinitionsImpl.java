// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.keyvault.administration.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
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
    private interface RoleDefinitionsService {
        @Get("/{scope}/providers/Microsoft.Authorization/roleDefinitions")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(KeyVaultErrorException.class)
        Mono<Response<RoleDefinitionListResult>> list(
                @HostParam("vaultBaseUrl") String vaultBaseUrl,
                @PathParam(value = "scope", encoded = true) String scope,
                @QueryParam("$filter") String filter,
                @QueryParam("api-version") String apiVersion,
                Context context);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(KeyVaultErrorException.class)
        Mono<Response<RoleDefinitionListResult>> listNext(
                @PathParam(value = "nextLink", encoded = true) String nextLink, Context context);
    }

    /**
     * Get all role definitions that are applicable at scope and above.
     *
     * @param vaultBaseUrl simple string.
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
        return service.list(vaultBaseUrl, scope, filter, this.client.getApiVersion(), context)
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
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws KeyVaultErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role definition list operation result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<RoleDefinition>> listNextSinglePageAsync(String nextLink, Context context) {
        return service.listNext(nextLink, context)
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
