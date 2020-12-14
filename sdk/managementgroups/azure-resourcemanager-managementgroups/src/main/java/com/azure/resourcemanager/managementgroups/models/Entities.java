// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managementgroups.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/** Resource collection API of Entities. */
public interface Entities {
    /**
     * List all entities (Management Groups, Subscriptions, etc.) for the authenticated user.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the result of the request to view entities.
     */
    PagedIterable<EntityInfo> list();

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
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the result of the request to view entities.
     */
    PagedIterable<EntityInfo> list(
        String select,
        EntitiesSearch search,
        String filter,
        EntitiesView view,
        String groupName,
        String cacheControl,
        Context context);
}
