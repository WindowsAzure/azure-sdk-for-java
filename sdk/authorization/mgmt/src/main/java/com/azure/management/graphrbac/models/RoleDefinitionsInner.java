// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.graphrbac.models;

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
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.CloudException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.management.resources.fluentcore.collection.InnerSupportsDelete;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * RoleDefinitions.
 */
public final class RoleDefinitionsInner implements InnerSupportsDelete<RoleDefinitionInner> {
    /**
     * The proxy service used to perform REST calls.
     */
    private RoleDefinitionsService service;

    /**
     * The service client containing this operation class.
     */
    private AuthorizationManagementClientImpl client;

    /**
     * Initializes an instance of RoleDefinitionsInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    RoleDefinitionsInner(AuthorizationManagementClientImpl client) {
        this.service = RestProxy.create(RoleDefinitionsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * AuthorizationManagementClientRoleDefinitions to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AuthorizationManagementClientRoleDefinitions")
    private interface RoleDefinitionsService {
        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Delete("/{scope}/providers/Microsoft.Authorization/roleDefinitions/{roleDefinitionId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<RoleDefinitionInner>> delete(@HostParam("$host") String host, @PathParam(value = "scope", encoded = true) String scope, @PathParam("roleDefinitionId") String roleDefinitionId, @QueryParam("api-version") String apiVersion, Context context);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/{scope}/providers/Microsoft.Authorization/roleDefinitions/{roleDefinitionId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<RoleDefinitionInner>> get(@HostParam("$host") String host, @PathParam(value = "scope", encoded = true) String scope, @PathParam("roleDefinitionId") String roleDefinitionId, @QueryParam("api-version") String apiVersion, Context context);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Put("/{scope}/providers/Microsoft.Authorization/roleDefinitions/{roleDefinitionId}")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<RoleDefinitionInner>> createOrUpdate(@HostParam("$host") String host, @PathParam(value = "scope", encoded = true) String scope, @PathParam("roleDefinitionId") String roleDefinitionId, @QueryParam("api-version") String apiVersion, @BodyParam("application/json") RoleDefinitionInner roleDefinition, Context context);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/{scope}/providers/Microsoft.Authorization/roleDefinitions")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<RoleDefinitionListResultInner>> list(@HostParam("$host") String host, @PathParam(value = "scope", encoded = true) String scope, @QueryParam("$filter") String filter, @QueryParam("api-version") String apiVersion, Context context);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/{roleId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<RoleDefinitionInner>> getById(@HostParam("$host") String host, @PathParam(value = "roleId", encoded = true) String roleId, @QueryParam("api-version") String apiVersion, Context context);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<RoleDefinitionListResultInner>> listNext(@PathParam(value = "nextLink", encoded = true) String nextLink, Context context);
    }

    /**
     * Deletes a role definition.
     * 
     * @param scope The scope of the role definition.
     * @param roleDefinitionId The ID of the role definition to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<RoleDefinitionInner>> deleteWithResponseAsync(String scope, String roleDefinitionId) {
        final String apiVersion = "2018-01-01-preview";
        return FluxUtil.withContext(context -> service.delete(this.client.getHost(), scope, roleDefinitionId, apiVersion, context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Deletes a role definition.
     * 
     * @param scope The scope of the role definition.
     * @param roleDefinitionId The ID of the role definition to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RoleDefinitionInner> deleteAsync(String scope, String roleDefinitionId) {
        return deleteWithResponseAsync(scope, roleDefinitionId)
            .flatMap((SimpleResponse<RoleDefinitionInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Deletes a role definition.
     * 
     * @param scope The scope of the role definition.
     * @param roleDefinitionId The ID of the role definition to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RoleDefinitionInner delete(String scope, String roleDefinitionId) {
        return deleteAsync(scope, roleDefinitionId).block();
    }

    /**
     * Get role definition by name (GUID).
     * 
     * @param scope The scope of the role definition.
     * @param roleDefinitionId The ID of the role definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<RoleDefinitionInner>> getWithResponseAsync(String scope, String roleDefinitionId) {
        final String apiVersion = "2018-01-01-preview";
        return FluxUtil.withContext(context -> service.get(this.client.getHost(), scope, roleDefinitionId, apiVersion, context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Get role definition by name (GUID).
     * 
     * @param scope The scope of the role definition.
     * @param roleDefinitionId The ID of the role definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RoleDefinitionInner> getAsync(String scope, String roleDefinitionId) {
        return getWithResponseAsync(scope, roleDefinitionId)
            .flatMap((SimpleResponse<RoleDefinitionInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Get role definition by name (GUID).
     * 
     * @param scope The scope of the role definition.
     * @param roleDefinitionId The ID of the role definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RoleDefinitionInner get(String scope, String roleDefinitionId) {
        return getAsync(scope, roleDefinitionId).block();
    }

    /**
     * Creates or updates a role definition.
     * 
     * @param scope The scope of the role definition.
     * @param roleDefinitionId The ID of the role definition.
     * @param roleDefinition Role definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<RoleDefinitionInner>> createOrUpdateWithResponseAsync(String scope, String roleDefinitionId, RoleDefinitionInner roleDefinition) {
        final String apiVersion = "2018-01-01-preview";
        return FluxUtil.withContext(context -> service.createOrUpdate(this.client.getHost(), scope, roleDefinitionId, apiVersion, roleDefinition, context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Creates or updates a role definition.
     * 
     * @param scope The scope of the role definition.
     * @param roleDefinitionId The ID of the role definition.
     * @param roleDefinition Role definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RoleDefinitionInner> createOrUpdateAsync(String scope, String roleDefinitionId, RoleDefinitionInner roleDefinition) {
        return createOrUpdateWithResponseAsync(scope, roleDefinitionId, roleDefinition)
            .flatMap((SimpleResponse<RoleDefinitionInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Creates or updates a role definition.
     * 
     * @param scope The scope of the role definition.
     * @param roleDefinitionId The ID of the role definition.
     * @param roleDefinition Role definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RoleDefinitionInner createOrUpdate(String scope, String roleDefinitionId, RoleDefinitionInner roleDefinition) {
        return createOrUpdateAsync(scope, roleDefinitionId, roleDefinition).block();
    }

    /**
     * Get all role definitions that are applicable at scope and above.
     * 
     * @param scope The scope of the role definition.
     * @param filter The filter to apply on the operation. Use atScopeAndBelow filter to search below the given scope as well.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<RoleDefinitionInner>> listSinglePageAsync(String scope, String filter) {
        final String apiVersion = "2018-01-01-preview";
        return FluxUtil.withContext(context -> service.list(this.client.getHost(), scope, filter, apiVersion, context))
            .<PagedResponse<RoleDefinitionInner>>map(res -> new PagedResponseBase<>(
                res.getRequest(),
                res.getStatusCode(),
                res.getHeaders(),
                res.getValue().value(),
                res.getValue().nextLink(),
                null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Get all role definitions that are applicable at scope and above.
     * 
     * @param scope The scope of the role definition.
     * @param filter The filter to apply on the operation. Use atScopeAndBelow filter to search below the given scope as well.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<RoleDefinitionInner> listAsync(String scope, String filter) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(scope, filter),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Get all role definitions that are applicable at scope and above.
     * 
     * @param scope The scope of the role definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<RoleDefinitionInner> listAsync(String scope) {
        final String filter = null;
        final Context context = null;
        return new PagedFlux<>(
            () -> listSinglePageAsync(scope, filter),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Get all role definitions that are applicable at scope and above.
     * 
     * @param scope The scope of the role definition.
     * @param filter The filter to apply on the operation. Use atScopeAndBelow filter to search below the given scope as well.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<RoleDefinitionInner> list(String scope, String filter) {
        return new PagedIterable<>(listAsync(scope, filter));
    }

    /**
     * Get all role definitions that are applicable at scope and above.
     * 
     * @param scope The scope of the role definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<RoleDefinitionInner> list(String scope) {
        final String filter = null;
        final Context context = null;
        return new PagedIterable<>(listAsync(scope, filter));
    }

    /**
     * Gets a role definition by ID.
     * 
     * @param roleId The fully qualified role definition ID. Use the format, /subscriptions/{guid}/providers/Microsoft.Authorization/roleDefinitions/{roleDefinitionId} for subscription level role definitions, or /providers/Microsoft.Authorization/roleDefinitions/{roleDefinitionId} for tenant level role definitions.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<RoleDefinitionInner>> getByIdWithResponseAsync(String roleId) {
        final String apiVersion = "2018-01-01-preview";
        return FluxUtil.withContext(context -> service.getById(this.client.getHost(), roleId, apiVersion, context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets a role definition by ID.
     * 
     * @param roleId The fully qualified role definition ID. Use the format, /subscriptions/{guid}/providers/Microsoft.Authorization/roleDefinitions/{roleDefinitionId} for subscription level role definitions, or /providers/Microsoft.Authorization/roleDefinitions/{roleDefinitionId} for tenant level role definitions.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RoleDefinitionInner> getByIdAsync(String roleId) {
        return getByIdWithResponseAsync(roleId)
            .flatMap((SimpleResponse<RoleDefinitionInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets a role definition by ID.
     * 
     * @param roleId The fully qualified role definition ID. Use the format, /subscriptions/{guid}/providers/Microsoft.Authorization/roleDefinitions/{roleDefinitionId} for subscription level role definitions, or /providers/Microsoft.Authorization/roleDefinitions/{roleDefinitionId} for tenant level role definitions.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RoleDefinitionInner getById(String roleId) {
        return getByIdAsync(roleId).block();
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<RoleDefinitionInner>> listNextSinglePageAsync(String nextLink) {
        return FluxUtil.withContext(context -> service.listNext(nextLink, context))
            .<PagedResponse<RoleDefinitionInner>>map(res -> new PagedResponseBase<>(
                res.getRequest(),
                res.getStatusCode(),
                res.getHeaders(),
                res.getValue().value(),
                res.getValue().nextLink(),
                null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }
}
