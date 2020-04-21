// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.graphrbac.models;

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
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.management.graphrbac.GraphErrorException;
import com.azure.management.graphrbac.KeyCredentialsUpdateParameters;
import com.azure.management.graphrbac.PasswordCredentialsUpdateParameters;
import com.azure.management.graphrbac.ServicePrincipalCreateParameters;
import com.azure.management.graphrbac.ServicePrincipalUpdateParameters;
import java.util.List;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * ServicePrincipals.
 */
public final class ServicePrincipalsInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private ServicePrincipalsService service;

    /**
     * The service client containing this operation class.
     */
    private GraphRbacManagementClientImpl client;

    /**
     * Initializes an instance of ServicePrincipalsInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    ServicePrincipalsInner(GraphRbacManagementClientImpl client) {
        this.service = RestProxy.create(ServicePrincipalsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * GraphRbacManagementClientServicePrincipals to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "GraphRbacManagementClientServicePrincipals")
    private interface ServicePrincipalsService {
        @Headers({ "Accept: application/json,text/json", "Content-Type: application/json" })
        @Post("/{tenantID}/servicePrincipals")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(GraphErrorException.class)
        Mono<SimpleResponse<ServicePrincipalInner>> create(@HostParam("$host") String host, @QueryParam("api-version") String apiVersion, @PathParam("tenantID") String tenantID, @BodyParam("application/json") ServicePrincipalCreateParameters parameters, Context context);

        @Headers({ "Accept: application/json,text/json", "Content-Type: application/json" })
        @Get("/{tenantID}/servicePrincipals")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(GraphErrorException.class)
        Mono<SimpleResponse<ServicePrincipalListResultInner>> list(@HostParam("$host") String host, @QueryParam("$filter") String filter, @QueryParam("api-version") String apiVersion, @PathParam("tenantID") String tenantID, Context context);

        @Headers({ "Accept: application/json;q=0.9", "Content-Type: application/json" })
        @Patch("/{tenantID}/servicePrincipals/{objectId}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(GraphErrorException.class)
        Mono<Response<Void>> update(@HostParam("$host") String host, @PathParam("objectId") String objectId, @QueryParam("api-version") String apiVersion, @PathParam("tenantID") String tenantID, @BodyParam("application/json") ServicePrincipalUpdateParameters parameters, Context context);

        @Headers({ "Accept: application/json;q=0.9", "Content-Type: application/json" })
        @Delete("/{tenantID}/servicePrincipals/{objectId}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(GraphErrorException.class)
        Mono<Response<Void>> delete(@HostParam("$host") String host, @PathParam("objectId") String objectId, @QueryParam("api-version") String apiVersion, @PathParam("tenantID") String tenantID, Context context);

        @Headers({ "Accept: application/json,text/json", "Content-Type: application/json" })
        @Get("/{tenantID}/servicePrincipals/{objectId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(GraphErrorException.class)
        Mono<SimpleResponse<ServicePrincipalInner>> get(@HostParam("$host") String host, @PathParam("objectId") String objectId, @QueryParam("api-version") String apiVersion, @PathParam("tenantID") String tenantID, Context context);

        @Headers({ "Accept: application/json,text/json", "Content-Type: application/json" })
        @Get("/{tenantID}/servicePrincipals/{objectId}/owners")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(GraphErrorException.class)
        Mono<SimpleResponse<DirectoryObjectListResultInner>> listOwners(@HostParam("$host") String host, @PathParam("objectId") String objectId, @QueryParam("api-version") String apiVersion, @PathParam("tenantID") String tenantID, Context context);

        @Headers({ "Accept: application/json,text/json", "Content-Type: application/json" })
        @Get("/{tenantID}/servicePrincipals/{objectId}/keyCredentials")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(GraphErrorException.class)
        Mono<SimpleResponse<KeyCredentialListResultInner>> listKeyCredentials(@HostParam("$host") String host, @PathParam("objectId") String objectId, @QueryParam("api-version") String apiVersion, @PathParam("tenantID") String tenantID, Context context);

        @Headers({ "Accept: application/json;q=0.9", "Content-Type: application/json" })
        @Patch("/{tenantID}/servicePrincipals/{objectId}/keyCredentials")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(GraphErrorException.class)
        Mono<Response<Void>> updateKeyCredentials(@HostParam("$host") String host, @PathParam("objectId") String objectId, @QueryParam("api-version") String apiVersion, @PathParam("tenantID") String tenantID, @BodyParam("application/json") KeyCredentialsUpdateParameters parameters, Context context);

        @Headers({ "Accept: application/json,text/json", "Content-Type: application/json" })
        @Get("/{tenantID}/servicePrincipals/{objectId}/passwordCredentials")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(GraphErrorException.class)
        Mono<SimpleResponse<PasswordCredentialListResultInner>> listPasswordCredentials(@HostParam("$host") String host, @PathParam("objectId") String objectId, @QueryParam("api-version") String apiVersion, @PathParam("tenantID") String tenantID, Context context);

        @Headers({ "Accept: application/json;q=0.9", "Content-Type: application/json" })
        @Patch("/{tenantID}/servicePrincipals/{objectId}/passwordCredentials")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(GraphErrorException.class)
        Mono<Response<Void>> updatePasswordCredentials(@HostParam("$host") String host, @PathParam("objectId") String objectId, @QueryParam("api-version") String apiVersion, @PathParam("tenantID") String tenantID, @BodyParam("application/json") PasswordCredentialsUpdateParameters parameters, Context context);

        @Headers({ "Accept: application/json,text/json", "Content-Type: application/json" })
        @Get("/{tenantID}/{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(GraphErrorException.class)
        Mono<SimpleResponse<ServicePrincipalListResultInner>> listNext(@HostParam("$host") String host, @PathParam(value = "nextLink", encoded = true) String nextLink, @QueryParam("api-version") String apiVersion, @PathParam("tenantID") String tenantID, Context context);

        @Headers({ "Accept: application/json,text/json", "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(GraphErrorException.class)
        Mono<SimpleResponse<DirectoryObjectListResultInner>> listOwnersNext(@PathParam(value = "nextLink", encoded = true) String nextLink, Context context);
    }

    /**
     * Creates a service principal in the directory.
     * 
     * @param parameters Request parameters for creating a new service principal.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ServicePrincipalInner>> createWithResponseAsync(ServicePrincipalCreateParameters parameters) {
        return FluxUtil.withContext(context -> service.create(this.client.getHost(), this.client.getApiVersion(), this.client.getTenantID(), parameters, context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Creates a service principal in the directory.
     * 
     * @param parameters Request parameters for creating a new service principal.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServicePrincipalInner> createAsync(ServicePrincipalCreateParameters parameters) {
        return createWithResponseAsync(parameters)
            .flatMap((SimpleResponse<ServicePrincipalInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Creates a service principal in the directory.
     * 
     * @param parameters Request parameters for creating a new service principal.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ServicePrincipalInner create(ServicePrincipalCreateParameters parameters) {
        return createAsync(parameters).block();
    }

    /**
     * Gets a list of service principals from the current tenant.
     * 
     * @param filter The filter to apply to the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ServicePrincipalInner>> listSinglePageAsync(String filter) {
        return FluxUtil.withContext(context -> service.list(this.client.getHost(), filter, this.client.getApiVersion(), this.client.getTenantID(), context))
            .<PagedResponse<ServicePrincipalInner>>map(res -> new PagedResponseBase<>(
                res.getRequest(),
                res.getStatusCode(),
                res.getHeaders(),
                res.getValue().value(),
                res.getValue().odataNextLink(),
                null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets a list of service principals from the current tenant.
     * 
     * @param filter The filter to apply to the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ServicePrincipalInner> listAsync(String filter) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(filter),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets a list of service principals from the current tenant.
     * 
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ServicePrincipalInner> listAsync() {
        final String filter = null;
        final Context context = null;
        return new PagedFlux<>(
            () -> listSinglePageAsync(filter),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets a list of service principals from the current tenant.
     * 
     * @param filter The filter to apply to the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ServicePrincipalInner> list(String filter) {
        return new PagedIterable<>(listAsync(filter));
    }

    /**
     * Gets a list of service principals from the current tenant.
     * 
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ServicePrincipalInner> list() {
        final String filter = null;
        final Context context = null;
        return new PagedIterable<>(listAsync(filter));
    }

    /**
     * Updates a service principal in the directory.
     * 
     * @param objectId The object ID of the service principal to delete.
     * @param parameters Request parameters for update an existing service principal.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> updateWithResponseAsync(String objectId, ServicePrincipalUpdateParameters parameters) {
        return FluxUtil.withContext(context -> service.update(this.client.getHost(), objectId, this.client.getApiVersion(), this.client.getTenantID(), parameters, context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Updates a service principal in the directory.
     * 
     * @param objectId The object ID of the service principal to delete.
     * @param parameters Request parameters for update an existing service principal.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> updateAsync(String objectId, ServicePrincipalUpdateParameters parameters) {
        return updateWithResponseAsync(objectId, parameters)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Updates a service principal in the directory.
     * 
     * @param objectId The object ID of the service principal to delete.
     * @param parameters Request parameters for update an existing service principal.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void update(String objectId, ServicePrincipalUpdateParameters parameters) {
        updateAsync(objectId, parameters).block();
    }

    /**
     * Deletes a service principal from the directory.
     * 
     * @param objectId The object ID of the service principal to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(String objectId) {
        return FluxUtil.withContext(context -> service.delete(this.client.getHost(), objectId, this.client.getApiVersion(), this.client.getTenantID(), context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Deletes a service principal from the directory.
     * 
     * @param objectId The object ID of the service principal to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String objectId) {
        return deleteWithResponseAsync(objectId)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes a service principal from the directory.
     * 
     * @param objectId The object ID of the service principal to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String objectId) {
        deleteAsync(objectId).block();
    }

    /**
     * Gets service principal information from the directory. Query by objectId or pass a filter to query by appId.
     * 
     * @param objectId The object ID of the service principal to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ServicePrincipalInner>> getWithResponseAsync(String objectId) {
        return FluxUtil.withContext(context -> service.get(this.client.getHost(), objectId, this.client.getApiVersion(), this.client.getTenantID(), context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets service principal information from the directory. Query by objectId or pass a filter to query by appId.
     * 
     * @param objectId The object ID of the service principal to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServicePrincipalInner> getAsync(String objectId) {
        return getWithResponseAsync(objectId)
            .flatMap((SimpleResponse<ServicePrincipalInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets service principal information from the directory. Query by objectId or pass a filter to query by appId.
     * 
     * @param objectId The object ID of the service principal to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ServicePrincipalInner get(String objectId) {
        return getAsync(objectId).block();
    }

    /**
     * The owners are a set of non-admin users who are allowed to modify this object.
     * 
     * @param objectId The object ID of the service principal for which to get owners.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<DirectoryObjectInner>> listOwnersSinglePageAsync(String objectId) {
        return FluxUtil.withContext(context -> service.listOwners(this.client.getHost(), objectId, this.client.getApiVersion(), this.client.getTenantID(), context))
            .<PagedResponse<DirectoryObjectInner>>map(res -> new PagedResponseBase<>(
                res.getRequest(),
                res.getStatusCode(),
                res.getHeaders(),
                res.getValue().value(),
                res.getValue().odataNextLink(),
                null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * The owners are a set of non-admin users who are allowed to modify this object.
     * 
     * @param objectId The object ID of the service principal for which to get owners.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<DirectoryObjectInner> listOwnersAsync(String objectId) {
        return new PagedFlux<>(
            () -> listOwnersSinglePageAsync(objectId),
            nextLink -> listOwnersNextSinglePageAsync(nextLink));
    }

    /**
     * The owners are a set of non-admin users who are allowed to modify this object.
     * 
     * @param objectId The object ID of the service principal for which to get owners.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DirectoryObjectInner> listOwners(String objectId) {
        return new PagedIterable<>(listOwnersAsync(objectId));
    }

    /**
     * Get the keyCredentials associated with the specified service principal.
     * 
     * @param objectId The object ID of the service principal for which to get keyCredentials.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<KeyCredentialInner>> listKeyCredentialsSinglePageAsync(String objectId) {
        return FluxUtil.withContext(context -> service.listKeyCredentials(this.client.getHost(), objectId, this.client.getApiVersion(), this.client.getTenantID(), context))
            .<PagedResponse<KeyCredentialInner>>map(res -> new PagedResponseBase<>(
                res.getRequest(),
                res.getStatusCode(),
                res.getHeaders(),
                res.getValue().value(),
                null,
                null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Get the keyCredentials associated with the specified service principal.
     * 
     * @param objectId The object ID of the service principal for which to get keyCredentials.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<KeyCredentialInner> listKeyCredentialsAsync(String objectId) {
        return new PagedFlux<>(
            () -> listKeyCredentialsSinglePageAsync(objectId));
    }

    /**
     * Get the keyCredentials associated with the specified service principal.
     * 
     * @param objectId The object ID of the service principal for which to get keyCredentials.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<KeyCredentialInner> listKeyCredentials(String objectId) {
        return new PagedIterable<>(listKeyCredentialsAsync(objectId));
    }

    /**
     * Update the keyCredentials associated with a service principal.
     * 
     * @param objectId The object ID for which to get service principal information.
     * @param value A collection of KeyCredentials.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> updateKeyCredentialsWithResponseAsync(String objectId, List<KeyCredentialInner> value) {
        KeyCredentialsUpdateParameters parameters = new KeyCredentialsUpdateParameters();
        parameters.withValue(value);
        return FluxUtil.withContext(context -> service.updateKeyCredentials(this.client.getHost(), objectId, this.client.getApiVersion(), this.client.getTenantID(), parameters, context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Update the keyCredentials associated with a service principal.
     * 
     * @param objectId The object ID for which to get service principal information.
     * @param value A collection of KeyCredentials.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> updateKeyCredentialsAsync(String objectId, List<KeyCredentialInner> value) {
        return updateKeyCredentialsWithResponseAsync(objectId, value)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Update the keyCredentials associated with a service principal.
     * 
     * @param objectId The object ID for which to get service principal information.
     * @param value A collection of KeyCredentials.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void updateKeyCredentials(String objectId, List<KeyCredentialInner> value) {
        updateKeyCredentialsAsync(objectId, value).block();
    }

    /**
     * Gets the passwordCredentials associated with a service principal.
     * 
     * @param objectId The object ID of the service principal.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<PasswordCredentialInner>> listPasswordCredentialsSinglePageAsync(String objectId) {
        return FluxUtil.withContext(context -> service.listPasswordCredentials(this.client.getHost(), objectId, this.client.getApiVersion(), this.client.getTenantID(), context))
            .<PagedResponse<PasswordCredentialInner>>map(res -> new PagedResponseBase<>(
                res.getRequest(),
                res.getStatusCode(),
                res.getHeaders(),
                res.getValue().value(),
                null,
                null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets the passwordCredentials associated with a service principal.
     * 
     * @param objectId The object ID of the service principal.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<PasswordCredentialInner> listPasswordCredentialsAsync(String objectId) {
        return new PagedFlux<>(
            () -> listPasswordCredentialsSinglePageAsync(objectId));
    }

    /**
     * Gets the passwordCredentials associated with a service principal.
     * 
     * @param objectId The object ID of the service principal.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<PasswordCredentialInner> listPasswordCredentials(String objectId) {
        return new PagedIterable<>(listPasswordCredentialsAsync(objectId));
    }

    /**
     * Updates the passwordCredentials associated with a service principal.
     * 
     * @param objectId The object ID of the service principal.
     * @param value A collection of PasswordCredentials.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> updatePasswordCredentialsWithResponseAsync(String objectId, List<PasswordCredentialInner> value) {
        PasswordCredentialsUpdateParameters parameters = new PasswordCredentialsUpdateParameters();
        parameters.withValue(value);
        return FluxUtil.withContext(context -> service.updatePasswordCredentials(this.client.getHost(), objectId, this.client.getApiVersion(), this.client.getTenantID(), parameters, context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Updates the passwordCredentials associated with a service principal.
     * 
     * @param objectId The object ID of the service principal.
     * @param value A collection of PasswordCredentials.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> updatePasswordCredentialsAsync(String objectId, List<PasswordCredentialInner> value) {
        return updatePasswordCredentialsWithResponseAsync(objectId, value)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Updates the passwordCredentials associated with a service principal.
     * 
     * @param objectId The object ID of the service principal.
     * @param value A collection of PasswordCredentials.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void updatePasswordCredentials(String objectId, List<PasswordCredentialInner> value) {
        updatePasswordCredentialsAsync(objectId, value).block();
    }

    /**
     * Gets a list of service principals from the current tenant.
     * 
     * @param nextLink Next link for the list operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ServicePrincipalInner>> listNextSinglePageAsync(String nextLink) {
        return FluxUtil.withContext(context -> service.listNext(this.client.getHost(), nextLink, this.client.getApiVersion(), this.client.getTenantID(), context))
            .<PagedResponse<ServicePrincipalInner>>map(res -> new PagedResponseBase<>(
                res.getRequest(),
                res.getStatusCode(),
                res.getHeaders(),
                res.getValue().value(),
                res.getValue().odataNextLink(),
                null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<DirectoryObjectInner>> listOwnersNextSinglePageAsync(String nextLink) {
        return FluxUtil.withContext(context -> service.listOwnersNext(nextLink, context))
            .<PagedResponse<DirectoryObjectInner>>map(res -> new PagedResponseBase<>(
                res.getRequest(),
                res.getStatusCode(),
                res.getHeaders(),
                res.getValue().value(),
                res.getValue().odataNextLink(),
                null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }
}
