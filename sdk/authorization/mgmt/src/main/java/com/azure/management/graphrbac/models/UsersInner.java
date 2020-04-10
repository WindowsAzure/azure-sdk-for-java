// Copyright (c) Microsoft Corporation. All rights reserved.// Licensed under the MIT License.
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
import com.azure.management.graphrbac.UserCreateParameters;
import com.azure.management.graphrbac.UserGetMemberGroupsParameters;
import com.azure.management.graphrbac.UserUpdateParameters;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Users. */
public final class UsersInner {
    /** The proxy service used to perform REST calls. */
    private final UsersService service;

    /** The service client containing this operation class. */
    private final GraphRbacManagementClientImpl client;

    /**
     * Initializes an instance of UsersInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    UsersInner(GraphRbacManagementClientImpl client) {
        this.service = RestProxy.create(UsersService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for GraphRbacManagementClientUsers to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "GraphRbacManagementC")
    private interface UsersService {
        @Headers({"Accept: application/json,text/json", "Content-Type: application/json"})
        @Post("/{tenantID}/users")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(GraphErrorException.class)
        Mono<SimpleResponse<UserInner>> create(
            @HostParam("$host") String host,
            @QueryParam("api-version") String apiVersion,
            @PathParam("tenantID") String tenantID,
            @BodyParam("application/json") UserCreateParameters parameters,
            Context context);

        @Headers({"Accept: application/json,text/json", "Content-Type: application/json"})
        @Get("/{tenantID}/users")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(GraphErrorException.class)
        Mono<SimpleResponse<UserListResultInner>> list(
            @HostParam("$host") String host,
            @QueryParam("$filter") String filter,
            @QueryParam("api-version") String apiVersion,
            @PathParam("tenantID") String tenantID,
            Context context);

        @Headers({"Accept: application/json,text/json", "Content-Type: application/json"})
        @Get("/{tenantID}/users/{upnOrObjectId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(GraphErrorException.class)
        Mono<SimpleResponse<UserInner>> get(
            @HostParam("$host") String host,
            @PathParam("upnOrObjectId") String upnOrObjectId,
            @QueryParam("api-version") String apiVersion,
            @PathParam("tenantID") String tenantID,
            Context context);

        @Headers({"Accept: application/json;q=0.9", "Content-Type: application/json"})
        @Patch("/{tenantID}/users/{upnOrObjectId}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(GraphErrorException.class)
        Mono<Response<Void>> update(
            @HostParam("$host") String host,
            @PathParam("upnOrObjectId") String upnOrObjectId,
            @QueryParam("api-version") String apiVersion,
            @PathParam("tenantID") String tenantID,
            @BodyParam("application/json") UserUpdateParameters parameters,
            Context context);

        @Headers({"Accept: application/json;q=0.9", "Content-Type: application/json"})
        @Delete("/{tenantID}/users/{upnOrObjectId}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(GraphErrorException.class)
        Mono<Response<Void>> delete(
            @HostParam("$host") String host,
            @PathParam("upnOrObjectId") String upnOrObjectId,
            @QueryParam("api-version") String apiVersion,
            @PathParam("tenantID") String tenantID,
            Context context);

        @Headers({"Accept: application/json,text/json", "Content-Type: application/json"})
        @Post("/{tenantID}/users/{objectId}/getMemberGroups")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(GraphErrorException.class)
        Mono<SimpleResponse<UserGetMemberGroupsResultInner>> getMemberGroups(
            @HostParam("$host") String host,
            @PathParam("objectId") String objectId,
            @QueryParam("api-version") String apiVersion,
            @PathParam("tenantID") String tenantID,
            @BodyParam("application/json") UserGetMemberGroupsParameters parameters,
            Context context);

        @Headers({"Accept: application/json,text/json", "Content-Type: application/json"})
        @Get("/{tenantID}/{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(GraphErrorException.class)
        Mono<SimpleResponse<UserListResultInner>> listNext(
            @HostParam("$host") String host,
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @QueryParam("api-version") String apiVersion,
            @PathParam("tenantID") String tenantID,
            Context context);
    }

    /**
     * Create a new user.
     *
     * @param parameters Request parameters for creating a new work or school account user.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return active Directory user information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<UserInner>> createWithResponseAsync(UserCreateParameters parameters) {
        return FluxUtil
            .withContext(
                context ->
                    service
                        .create(
                            this.client.getHost(),
                            this.client.getApiVersion(),
                            this.client.getTenantID(),
                            parameters,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Create a new user.
     *
     * @param parameters Request parameters for creating a new work or school account user.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return active Directory user information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<UserInner> createAsync(UserCreateParameters parameters) {
        return createWithResponseAsync(parameters)
            .flatMap(
                (SimpleResponse<UserInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Create a new user.
     *
     * @param parameters Request parameters for creating a new work or school account user.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return active Directory user information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public UserInner create(UserCreateParameters parameters) {
        return createAsync(parameters).block();
    }

    /**
     * Gets list of users for the current tenant.
     *
     * @param filter The filter to apply to the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of users for the current tenant.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<UserInner>> listSinglePageAsync(String filter) {
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getHost(),
                            filter,
                            this.client.getApiVersion(),
                            this.client.getTenantID(),
                            context))
            .<PagedResponse<UserInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().odataNextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets list of users for the current tenant.
     *
     * @param filter The filter to apply to the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of users for the current tenant.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<UserInner> listAsync(String filter) {
        return new PagedFlux<>(() -> listSinglePageAsync(filter), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets list of users for the current tenant.
     *
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of users for the current tenant.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<UserInner> listAsync() {
        final String filter = null;
        final Context context = null;
        return new PagedFlux<>(() -> listSinglePageAsync(filter), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets list of users for the current tenant.
     *
     * @param filter The filter to apply to the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of users for the current tenant.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<UserInner> list(String filter) {
        return new PagedIterable<>(listAsync(filter));
    }

    /**
     * Gets list of users for the current tenant.
     *
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of users for the current tenant.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<UserInner> list() {
        final String filter = null;
        final Context context = null;
        return new PagedIterable<>(listAsync(filter));
    }

    /**
     * Gets user information from the directory.
     *
     * @param upnOrObjectId The object ID or principal name of the user for which to get information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return user information from the directory.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<UserInner>> getWithResponseAsync(String upnOrObjectId) {
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getHost(),
                            upnOrObjectId,
                            this.client.getApiVersion(),
                            this.client.getTenantID(),
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets user information from the directory.
     *
     * @param upnOrObjectId The object ID or principal name of the user for which to get information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return user information from the directory.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<UserInner> getAsync(String upnOrObjectId) {
        return getWithResponseAsync(upnOrObjectId)
            .flatMap(
                (SimpleResponse<UserInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets user information from the directory.
     *
     * @param upnOrObjectId The object ID or principal name of the user for which to get information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return user information from the directory.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public UserInner get(String upnOrObjectId) {
        return getAsync(upnOrObjectId).block();
    }

    /**
     * Updates a user.
     *
     * @param upnOrObjectId The object ID or principal name of the user to update.
     * @param parameters Request parameters for updating an existing work or school account user.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> updateWithResponseAsync(String upnOrObjectId, UserUpdateParameters parameters) {
        return FluxUtil
            .withContext(
                context ->
                    service
                        .update(
                            this.client.getHost(),
                            upnOrObjectId,
                            this.client.getApiVersion(),
                            this.client.getTenantID(),
                            parameters,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Updates a user.
     *
     * @param upnOrObjectId The object ID or principal name of the user to update.
     * @param parameters Request parameters for updating an existing work or school account user.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> updateAsync(String upnOrObjectId, UserUpdateParameters parameters) {
        return updateWithResponseAsync(upnOrObjectId, parameters).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Updates a user.
     *
     * @param upnOrObjectId The object ID or principal name of the user to update.
     * @param parameters Request parameters for updating an existing work or school account user.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void update(String upnOrObjectId, UserUpdateParameters parameters) {
        updateAsync(upnOrObjectId, parameters).block();
    }

    /**
     * Delete a user.
     *
     * @param upnOrObjectId The object ID or principal name of the user to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(String upnOrObjectId) {
        return FluxUtil
            .withContext(
                context ->
                    service
                        .delete(
                            this.client.getHost(),
                            upnOrObjectId,
                            this.client.getApiVersion(),
                            this.client.getTenantID(),
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Delete a user.
     *
     * @param upnOrObjectId The object ID or principal name of the user to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String upnOrObjectId) {
        return deleteWithResponseAsync(upnOrObjectId).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Delete a user.
     *
     * @param upnOrObjectId The object ID or principal name of the user to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String upnOrObjectId) {
        deleteAsync(upnOrObjectId).block();
    }

    /**
     * Gets a collection that contains the object IDs of the groups of which the user is a member.
     *
     * @param objectId The object ID of the user for which to get group membership.
     * @param securityEnabledOnly If true, only membership in security-enabled groups should be checked. Otherwise,
     *     membership in all groups should be checked.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection that contains the object IDs of the groups of which the user is a member.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<String>> getMemberGroupsSinglePageAsync(String objectId, boolean securityEnabledOnly) {
        UserGetMemberGroupsParameters parameters = new UserGetMemberGroupsParameters();
        parameters.withSecurityEnabledOnly(securityEnabledOnly);
        return FluxUtil
            .withContext(
                context ->
                    service
                        .getMemberGroups(
                            this.client.getHost(),
                            objectId,
                            this.client.getApiVersion(),
                            this.client.getTenantID(),
                            parameters,
                            context))
            .<PagedResponse<String>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets a collection that contains the object IDs of the groups of which the user is a member.
     *
     * @param objectId The object ID of the user for which to get group membership.
     * @param securityEnabledOnly If true, only membership in security-enabled groups should be checked. Otherwise,
     *     membership in all groups should be checked.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection that contains the object IDs of the groups of which the user is a member.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<String> getMemberGroupsAsync(String objectId, boolean securityEnabledOnly) {
        return new PagedFlux<>(() -> getMemberGroupsSinglePageAsync(objectId, securityEnabledOnly));
    }

    /**
     * Gets a collection that contains the object IDs of the groups of which the user is a member.
     *
     * @param objectId The object ID of the user for which to get group membership.
     * @param securityEnabledOnly If true, only membership in security-enabled groups should be checked. Otherwise,
     *     membership in all groups should be checked.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection that contains the object IDs of the groups of which the user is a member.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<String> getMemberGroups(String objectId, boolean securityEnabledOnly) {
        return new PagedIterable<>(getMemberGroupsAsync(objectId, securityEnabledOnly));
    }

    /**
     * Gets a list of users for the current tenant.
     *
     * @param nextLink Next link for the list operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of users for the current tenant.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<UserInner>> listNextSinglePageAsync(String nextLink) {
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listNext(
                            this.client.getHost(),
                            nextLink,
                            this.client.getApiVersion(),
                            this.client.getTenantID(),
                            context))
            .<PagedResponse<UserInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().odataNextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }
}
