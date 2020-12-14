// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managementgroups.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
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
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.managementgroups.fluent.EntitiesClient;
import com.azure.resourcemanager.managementgroups.fluent.models.EntityInfoInner;
import com.azure.resourcemanager.managementgroups.models.EntitiesSearch;
import com.azure.resourcemanager.managementgroups.models.EntitiesView;
import com.azure.resourcemanager.managementgroups.models.EntityListResult;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in EntitiesClient. */
public final class EntitiesClientImpl implements EntitiesClient {
    private final ClientLogger logger = new ClientLogger(EntitiesClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final EntitiesService service;

    /** The service client containing this operation class. */
    private final ManagementGroupsApiImpl client;

    /**
     * Initializes an instance of EntitiesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    EntitiesClientImpl(ManagementGroupsApiImpl client) {
        this.service = RestProxy.create(EntitiesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ManagementGroupsApiEntities to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ManagementGroupsApiE")
    private interface EntitiesService {
        @Headers({"Content-Type: application/json"})
        @Post("/providers/Microsoft.Management/getEntities")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<EntityListResult>> list(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @QueryParam("$skiptoken") String skiptoken,
            @QueryParam("$skip") Integer skip,
            @QueryParam("$top") Integer top,
            @QueryParam("$select") String select,
            @QueryParam("$search") EntitiesSearch search,
            @QueryParam("$filter") String filter,
            @QueryParam("$view") EntitiesView view,
            @QueryParam("groupName") String groupName,
            @HeaderParam("Cache-Control") String cacheControl,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<EntityListResult>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Cache-Control") String cacheControl,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * List all entities (Management Groups, Subscriptions, etc.) for the authenticated user.
     *
     * @param select This parameter specifies the fields to include in the response. Can include any combination of
     *     Name,DisplayName,Type,ParentDisplayNameChain,ParentChain, e.g.
     *     '$select=Name,DisplayName,Type,ParentDisplayNameChain,ParentNameChain'. When specified the $select parameter
     *     can override select in $skipToken.
     * @param search The $search parameter is used in conjunction with the $filter parameter to return three different
     *     outputs depending on the parameter passed in. With $search=AllowedParents the API will return the entity info
     *     of all groups that the requested entity will be able to reparent to as determined by the user's permissions.
     *     With $search=AllowedChildren the API will return the entity info of all entities that can be added as
     *     children of the requested entity. With $search=ParentAndFirstLevelChildren the API will return the parent and
     *     first level of children that the user has either direct access to or indirect access via one of their
     *     descendants. With $search=ParentOnly the API will return only the group if the user has access to at least
     *     one of the descendants of the group. With $search=ChildrenOnly the API will return only the first level of
     *     children of the group entity info specified in $filter. The user must have direct access to the children
     *     entities or one of it's descendants for it to show up in the results.
     * @param filter The filter parameter allows you to filter on the the name or display name fields. You can check for
     *     equality on the name field (e.g. name eq '{entityName}') and you can check for substrings on either the name
     *     or display name fields(e.g. contains(name, '{substringToSearch}'), contains(displayName,
     *     '{substringToSearch')). Note that the '{entityName}' and '{substringToSearch}' fields are checked case
     *     insensitively.
     * @param view The view parameter allows clients to filter the type of data that is returned by the getEntities
     *     call.
     * @param groupName A filter which allows the get entities call to focus on a particular group (i.e. "$filter=name
     *     eq 'groupName'").
     * @param cacheControl Indicates that the request shouldn't utilize any caches.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the result of the request to view entities.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<EntityInfoInner>> listSinglePageAsync(
        String select, EntitiesSearch search, String filter, EntitiesView view, String groupName, String cacheControl) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            this.client.getSkiptoken(),
                            this.client.getSkip(),
                            this.client.getTop(),
                            select,
                            search,
                            filter,
                            view,
                            groupName,
                            cacheControl,
                            accept,
                            context))
            .<PagedResponse<EntityInfoInner>>map(
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
     * List all entities (Management Groups, Subscriptions, etc.) for the authenticated user.
     *
     * @param select This parameter specifies the fields to include in the response. Can include any combination of
     *     Name,DisplayName,Type,ParentDisplayNameChain,ParentChain, e.g.
     *     '$select=Name,DisplayName,Type,ParentDisplayNameChain,ParentNameChain'. When specified the $select parameter
     *     can override select in $skipToken.
     * @param search The $search parameter is used in conjunction with the $filter parameter to return three different
     *     outputs depending on the parameter passed in. With $search=AllowedParents the API will return the entity info
     *     of all groups that the requested entity will be able to reparent to as determined by the user's permissions.
     *     With $search=AllowedChildren the API will return the entity info of all entities that can be added as
     *     children of the requested entity. With $search=ParentAndFirstLevelChildren the API will return the parent and
     *     first level of children that the user has either direct access to or indirect access via one of their
     *     descendants. With $search=ParentOnly the API will return only the group if the user has access to at least
     *     one of the descendants of the group. With $search=ChildrenOnly the API will return only the first level of
     *     children of the group entity info specified in $filter. The user must have direct access to the children
     *     entities or one of it's descendants for it to show up in the results.
     * @param filter The filter parameter allows you to filter on the the name or display name fields. You can check for
     *     equality on the name field (e.g. name eq '{entityName}') and you can check for substrings on either the name
     *     or display name fields(e.g. contains(name, '{substringToSearch}'), contains(displayName,
     *     '{substringToSearch')). Note that the '{entityName}' and '{substringToSearch}' fields are checked case
     *     insensitively.
     * @param view The view parameter allows clients to filter the type of data that is returned by the getEntities
     *     call.
     * @param groupName A filter which allows the get entities call to focus on a particular group (i.e. "$filter=name
     *     eq 'groupName'").
     * @param cacheControl Indicates that the request shouldn't utilize any caches.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the result of the request to view entities.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<EntityInfoInner>> listSinglePageAsync(
        String select,
        EntitiesSearch search,
        String filter,
        EntitiesView view,
        String groupName,
        String cacheControl,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                this.client.getSkiptoken(),
                this.client.getSkip(),
                this.client.getTop(),
                select,
                search,
                filter,
                view,
                groupName,
                cacheControl,
                accept,
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
     * List all entities (Management Groups, Subscriptions, etc.) for the authenticated user.
     *
     * @param select This parameter specifies the fields to include in the response. Can include any combination of
     *     Name,DisplayName,Type,ParentDisplayNameChain,ParentChain, e.g.
     *     '$select=Name,DisplayName,Type,ParentDisplayNameChain,ParentNameChain'. When specified the $select parameter
     *     can override select in $skipToken.
     * @param search The $search parameter is used in conjunction with the $filter parameter to return three different
     *     outputs depending on the parameter passed in. With $search=AllowedParents the API will return the entity info
     *     of all groups that the requested entity will be able to reparent to as determined by the user's permissions.
     *     With $search=AllowedChildren the API will return the entity info of all entities that can be added as
     *     children of the requested entity. With $search=ParentAndFirstLevelChildren the API will return the parent and
     *     first level of children that the user has either direct access to or indirect access via one of their
     *     descendants. With $search=ParentOnly the API will return only the group if the user has access to at least
     *     one of the descendants of the group. With $search=ChildrenOnly the API will return only the first level of
     *     children of the group entity info specified in $filter. The user must have direct access to the children
     *     entities or one of it's descendants for it to show up in the results.
     * @param filter The filter parameter allows you to filter on the the name or display name fields. You can check for
     *     equality on the name field (e.g. name eq '{entityName}') and you can check for substrings on either the name
     *     or display name fields(e.g. contains(name, '{substringToSearch}'), contains(displayName,
     *     '{substringToSearch')). Note that the '{entityName}' and '{substringToSearch}' fields are checked case
     *     insensitively.
     * @param view The view parameter allows clients to filter the type of data that is returned by the getEntities
     *     call.
     * @param groupName A filter which allows the get entities call to focus on a particular group (i.e. "$filter=name
     *     eq 'groupName'").
     * @param cacheControl Indicates that the request shouldn't utilize any caches.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the result of the request to view entities.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<EntityInfoInner> listAsync(
        String select, EntitiesSearch search, String filter, EntitiesView view, String groupName, String cacheControl) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(select, search, filter, view, groupName, cacheControl),
            nextLink -> listNextSinglePageAsync(nextLink, cacheControl));
    }

    /**
     * List all entities (Management Groups, Subscriptions, etc.) for the authenticated user.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the result of the request to view entities.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<EntityInfoInner> listAsync() {
        final String select = null;
        final EntitiesSearch search = null;
        final String filter = null;
        final EntitiesView view = null;
        final String groupName = null;
        final String cacheControl = null;
        return new PagedFlux<>(
            () -> listSinglePageAsync(select, search, filter, view, groupName, cacheControl),
            nextLink -> listNextSinglePageAsync(nextLink, cacheControl));
    }

    /**
     * List all entities (Management Groups, Subscriptions, etc.) for the authenticated user.
     *
     * @param select This parameter specifies the fields to include in the response. Can include any combination of
     *     Name,DisplayName,Type,ParentDisplayNameChain,ParentChain, e.g.
     *     '$select=Name,DisplayName,Type,ParentDisplayNameChain,ParentNameChain'. When specified the $select parameter
     *     can override select in $skipToken.
     * @param search The $search parameter is used in conjunction with the $filter parameter to return three different
     *     outputs depending on the parameter passed in. With $search=AllowedParents the API will return the entity info
     *     of all groups that the requested entity will be able to reparent to as determined by the user's permissions.
     *     With $search=AllowedChildren the API will return the entity info of all entities that can be added as
     *     children of the requested entity. With $search=ParentAndFirstLevelChildren the API will return the parent and
     *     first level of children that the user has either direct access to or indirect access via one of their
     *     descendants. With $search=ParentOnly the API will return only the group if the user has access to at least
     *     one of the descendants of the group. With $search=ChildrenOnly the API will return only the first level of
     *     children of the group entity info specified in $filter. The user must have direct access to the children
     *     entities or one of it's descendants for it to show up in the results.
     * @param filter The filter parameter allows you to filter on the the name or display name fields. You can check for
     *     equality on the name field (e.g. name eq '{entityName}') and you can check for substrings on either the name
     *     or display name fields(e.g. contains(name, '{substringToSearch}'), contains(displayName,
     *     '{substringToSearch')). Note that the '{entityName}' and '{substringToSearch}' fields are checked case
     *     insensitively.
     * @param view The view parameter allows clients to filter the type of data that is returned by the getEntities
     *     call.
     * @param groupName A filter which allows the get entities call to focus on a particular group (i.e. "$filter=name
     *     eq 'groupName'").
     * @param cacheControl Indicates that the request shouldn't utilize any caches.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the result of the request to view entities.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<EntityInfoInner> listAsync(
        String select,
        EntitiesSearch search,
        String filter,
        EntitiesView view,
        String groupName,
        String cacheControl,
        Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(select, search, filter, view, groupName, cacheControl, context),
            nextLink -> listNextSinglePageAsync(nextLink, cacheControl, context));
    }

    /**
     * List all entities (Management Groups, Subscriptions, etc.) for the authenticated user.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the result of the request to view entities.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<EntityInfoInner> list() {
        final String select = null;
        final EntitiesSearch search = null;
        final String filter = null;
        final EntitiesView view = null;
        final String groupName = null;
        final String cacheControl = null;
        return new PagedIterable<>(listAsync(select, search, filter, view, groupName, cacheControl));
    }

    /**
     * List all entities (Management Groups, Subscriptions, etc.) for the authenticated user.
     *
     * @param select This parameter specifies the fields to include in the response. Can include any combination of
     *     Name,DisplayName,Type,ParentDisplayNameChain,ParentChain, e.g.
     *     '$select=Name,DisplayName,Type,ParentDisplayNameChain,ParentNameChain'. When specified the $select parameter
     *     can override select in $skipToken.
     * @param search The $search parameter is used in conjunction with the $filter parameter to return three different
     *     outputs depending on the parameter passed in. With $search=AllowedParents the API will return the entity info
     *     of all groups that the requested entity will be able to reparent to as determined by the user's permissions.
     *     With $search=AllowedChildren the API will return the entity info of all entities that can be added as
     *     children of the requested entity. With $search=ParentAndFirstLevelChildren the API will return the parent and
     *     first level of children that the user has either direct access to or indirect access via one of their
     *     descendants. With $search=ParentOnly the API will return only the group if the user has access to at least
     *     one of the descendants of the group. With $search=ChildrenOnly the API will return only the first level of
     *     children of the group entity info specified in $filter. The user must have direct access to the children
     *     entities or one of it's descendants for it to show up in the results.
     * @param filter The filter parameter allows you to filter on the the name or display name fields. You can check for
     *     equality on the name field (e.g. name eq '{entityName}') and you can check for substrings on either the name
     *     or display name fields(e.g. contains(name, '{substringToSearch}'), contains(displayName,
     *     '{substringToSearch')). Note that the '{entityName}' and '{substringToSearch}' fields are checked case
     *     insensitively.
     * @param view The view parameter allows clients to filter the type of data that is returned by the getEntities
     *     call.
     * @param groupName A filter which allows the get entities call to focus on a particular group (i.e. "$filter=name
     *     eq 'groupName'").
     * @param cacheControl Indicates that the request shouldn't utilize any caches.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the result of the request to view entities.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<EntityInfoInner> list(
        String select,
        EntitiesSearch search,
        String filter,
        EntitiesView view,
        String groupName,
        String cacheControl,
        Context context) {
        return new PagedIterable<>(listAsync(select, search, filter, view, groupName, cacheControl, context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @param cacheControl Indicates that the request shouldn't utilize any caches.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the result of the request to view entities.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<EntityInfoInner>> listNextSinglePageAsync(String nextLink, String cacheControl) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context -> service.listNext(nextLink, this.client.getEndpoint(), cacheControl, accept, context))
            .<PagedResponse<EntityInfoInner>>map(
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
     * @param cacheControl Indicates that the request shouldn't utilize any caches.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the result of the request to view entities.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<EntityInfoInner>> listNextSinglePageAsync(
        String nextLink, String cacheControl, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listNext(nextLink, this.client.getEndpoint(), cacheControl, accept, context)
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
