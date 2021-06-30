// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.resources.generated.fluent.models.GenericResourceInner;

/** Resource collection API of Resources. */
public interface Resources {
    /**
     * Get all the resources for a resource group.
     *
     * @param resourceGroupName The resource group with the resources to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the resources for a resource group.
     */
    PagedIterable<GenericResourceExpanded> listByResourceGroup(String resourceGroupName);

    /**
     * Get all the resources for a resource group.
     *
     * @param resourceGroupName The resource group with the resources to get.
     * @param filter The filter to apply on the operation.&lt;br&gt;&lt;br&gt;The properties you can use for eq (equals)
     *     or ne (not equals) are: location, resourceType, name, resourceGroup, identity, identity/principalId, plan,
     *     plan/publisher, plan/product, plan/name, plan/version, and plan/promotionCode.&lt;br&gt;&lt;br&gt;For
     *     example, to filter by a resource type, use: $filter=resourceType eq
     *     'Microsoft.Network/virtualNetworks'&lt;br&gt;&lt;br&gt;You can use substringof(value, property) in the
     *     filter. The properties you can use for substring are: name and resourceGroup.&lt;br&gt;&lt;br&gt;For example,
     *     to get all resources with 'demo' anywhere in the name, use: $filter=substringof('demo',
     *     name)&lt;br&gt;&lt;br&gt;You can link more than one substringof together by adding and/or
     *     operators.&lt;br&gt;&lt;br&gt;You can filter by tag names and values. For example, to filter for a tag name
     *     and value, use $filter=tagName eq 'tag1' and tagValue eq 'Value1'. When you filter by a tag name and value,
     *     the tags for each resource are not returned in the results.&lt;br&gt;&lt;br&gt;You can use some properties
     *     together when filtering. The combinations you can use are: substringof and/or resourceType, plan and
     *     plan/publisher and plan/name, identity and identity/principalId.
     * @param expand Comma-separated list of additional properties to be included in the response. Valid values include
     *     `createdTime`, `changedTime` and `provisioningState`. For example, `$expand=createdTime,changedTime`.
     * @param top The number of results to return. If null is passed, returns all resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the resources for a resource group.
     */
    PagedIterable<GenericResourceExpanded> listByResourceGroup(
        String resourceGroupName, String filter, String expand, Integer top, Context context);

    /**
     * The resources to be moved must be in the same source resource group in the source subscription being used. The
     * target resource group may be in a different subscription. When moving resources, both the source group and the
     * target group are locked for the duration of the operation. Write and delete operations are blocked on the groups
     * until the move completes.
     *
     * @param sourceResourceGroupName The name of the resource group from the source subscription containing the
     *     resources to be moved.
     * @param parameters Parameters for moving resources.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void moveResources(String sourceResourceGroupName, ResourcesMoveInfo parameters);

    /**
     * The resources to be moved must be in the same source resource group in the source subscription being used. The
     * target resource group may be in a different subscription. When moving resources, both the source group and the
     * target group are locked for the duration of the operation. Write and delete operations are blocked on the groups
     * until the move completes.
     *
     * @param sourceResourceGroupName The name of the resource group from the source subscription containing the
     *     resources to be moved.
     * @param parameters Parameters for moving resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void moveResources(String sourceResourceGroupName, ResourcesMoveInfo parameters, Context context);

    /**
     * This operation checks whether the specified resources can be moved to the target. The resources to be moved must
     * be in the same source resource group in the source subscription being used. The target resource group may be in a
     * different subscription. If validation succeeds, it returns HTTP response code 204 (no content). If validation
     * fails, it returns HTTP response code 409 (Conflict) with an error message. Retrieve the URL in the Location
     * header value to check the result of the long-running operation.
     *
     * @param sourceResourceGroupName The name of the resource group from the source subscription containing the
     *     resources to be validated for move.
     * @param parameters Parameters for moving resources.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void validateMoveResources(String sourceResourceGroupName, ResourcesMoveInfo parameters);

    /**
     * This operation checks whether the specified resources can be moved to the target. The resources to be moved must
     * be in the same source resource group in the source subscription being used. The target resource group may be in a
     * different subscription. If validation succeeds, it returns HTTP response code 204 (no content). If validation
     * fails, it returns HTTP response code 409 (Conflict) with an error message. Retrieve the URL in the Location
     * header value to check the result of the long-running operation.
     *
     * @param sourceResourceGroupName The name of the resource group from the source subscription containing the
     *     resources to be validated for move.
     * @param parameters Parameters for moving resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void validateMoveResources(String sourceResourceGroupName, ResourcesMoveInfo parameters, Context context);

    /**
     * Get all the resources in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the resources in a subscription.
     */
    PagedIterable<GenericResourceExpanded> list();

    /**
     * Get all the resources in a subscription.
     *
     * @param filter The filter to apply on the operation.&lt;br&gt;&lt;br&gt;The properties you can use for eq (equals)
     *     or ne (not equals) are: location, resourceType, name, resourceGroup, identity, identity/principalId, plan,
     *     plan/publisher, plan/product, plan/name, plan/version, and plan/promotionCode.&lt;br&gt;&lt;br&gt;For
     *     example, to filter by a resource type, use: $filter=resourceType eq
     *     'Microsoft.Network/virtualNetworks'&lt;br&gt;&lt;br&gt;You can use substringof(value, property) in the
     *     filter. The properties you can use for substring are: name and resourceGroup.&lt;br&gt;&lt;br&gt;For example,
     *     to get all resources with 'demo' anywhere in the name, use: $filter=substringof('demo',
     *     name)&lt;br&gt;&lt;br&gt;You can link more than one substringof together by adding and/or
     *     operators.&lt;br&gt;&lt;br&gt;You can filter by tag names and values. For example, to filter for a tag name
     *     and value, use $filter=tagName eq 'tag1' and tagValue eq 'Value1'. When you filter by a tag name and value,
     *     the tags for each resource are not returned in the results.&lt;br&gt;&lt;br&gt;You can use some properties
     *     together when filtering. The combinations you can use are: substringof and/or resourceType, plan and
     *     plan/publisher and plan/name, identity and identity/principalId.
     * @param expand Comma-separated list of additional properties to be included in the response. Valid values include
     *     `createdTime`, `changedTime` and `provisioningState`. For example, `$expand=createdTime,changedTime`.
     * @param top The number of results to return. If null is passed, returns all resource groups.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the resources in a subscription.
     */
    PagedIterable<GenericResourceExpanded> list(String filter, String expand, Integer top, Context context);

    /**
     * Checks whether a resource exists.
     *
     * @param resourceGroupName The name of the resource group containing the resource to check. The name is case
     *     insensitive.
     * @param resourceProviderNamespace The resource provider of the resource to check.
     * @param parentResourcePath The parent resource identity.
     * @param resourceType The resource type.
     * @param resourceName The name of the resource to check whether it exists.
     * @param apiVersion The API version to use for the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return whether resource exists.
     */
    boolean checkExistence(
        String resourceGroupName,
        String resourceProviderNamespace,
        String parentResourcePath,
        String resourceType,
        String resourceName,
        String apiVersion);

    /**
     * Checks whether a resource exists.
     *
     * @param resourceGroupName The name of the resource group containing the resource to check. The name is case
     *     insensitive.
     * @param resourceProviderNamespace The resource provider of the resource to check.
     * @param parentResourcePath The parent resource identity.
     * @param resourceType The resource type.
     * @param resourceName The name of the resource to check whether it exists.
     * @param apiVersion The API version to use for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Boolean> checkExistenceWithResponse(
        String resourceGroupName,
        String resourceProviderNamespace,
        String parentResourcePath,
        String resourceType,
        String resourceName,
        String apiVersion,
        Context context);

    /**
     * Deletes a resource.
     *
     * @param resourceGroupName The name of the resource group that contains the resource to delete. The name is case
     *     insensitive.
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param parentResourcePath The parent resource identity.
     * @param resourceType The resource type.
     * @param resourceName The name of the resource to delete.
     * @param apiVersion The API version to use for the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(
        String resourceGroupName,
        String resourceProviderNamespace,
        String parentResourcePath,
        String resourceType,
        String resourceName,
        String apiVersion);

    /**
     * Deletes a resource.
     *
     * @param resourceGroupName The name of the resource group that contains the resource to delete. The name is case
     *     insensitive.
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param parentResourcePath The parent resource identity.
     * @param resourceType The resource type.
     * @param resourceName The name of the resource to delete.
     * @param apiVersion The API version to use for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(
        String resourceGroupName,
        String resourceProviderNamespace,
        String parentResourcePath,
        String resourceType,
        String resourceName,
        String apiVersion,
        Context context);

    /**
     * Creates a resource.
     *
     * @param resourceGroupName The name of the resource group for the resource. The name is case insensitive.
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param parentResourcePath The parent resource identity.
     * @param resourceType The resource type of the resource to create.
     * @param resourceName The name of the resource to create.
     * @param apiVersion The API version to use for the operation.
     * @param parameters Parameters for creating or updating the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource information.
     */
    GenericResource createOrUpdate(
        String resourceGroupName,
        String resourceProviderNamespace,
        String parentResourcePath,
        String resourceType,
        String resourceName,
        String apiVersion,
        GenericResourceInner parameters);

    /**
     * Creates a resource.
     *
     * @param resourceGroupName The name of the resource group for the resource. The name is case insensitive.
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param parentResourcePath The parent resource identity.
     * @param resourceType The resource type of the resource to create.
     * @param resourceName The name of the resource to create.
     * @param apiVersion The API version to use for the operation.
     * @param parameters Parameters for creating or updating the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource information.
     */
    GenericResource createOrUpdate(
        String resourceGroupName,
        String resourceProviderNamespace,
        String parentResourcePath,
        String resourceType,
        String resourceName,
        String apiVersion,
        GenericResourceInner parameters,
        Context context);

    /**
     * Updates a resource.
     *
     * @param resourceGroupName The name of the resource group for the resource. The name is case insensitive.
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param parentResourcePath The parent resource identity.
     * @param resourceType The resource type of the resource to update.
     * @param resourceName The name of the resource to update.
     * @param apiVersion The API version to use for the operation.
     * @param parameters Parameters for updating the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource information.
     */
    GenericResource update(
        String resourceGroupName,
        String resourceProviderNamespace,
        String parentResourcePath,
        String resourceType,
        String resourceName,
        String apiVersion,
        GenericResourceInner parameters);

    /**
     * Updates a resource.
     *
     * @param resourceGroupName The name of the resource group for the resource. The name is case insensitive.
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param parentResourcePath The parent resource identity.
     * @param resourceType The resource type of the resource to update.
     * @param resourceName The name of the resource to update.
     * @param apiVersion The API version to use for the operation.
     * @param parameters Parameters for updating the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource information.
     */
    GenericResource update(
        String resourceGroupName,
        String resourceProviderNamespace,
        String parentResourcePath,
        String resourceType,
        String resourceName,
        String apiVersion,
        GenericResourceInner parameters,
        Context context);

    /**
     * Gets a resource.
     *
     * @param resourceGroupName The name of the resource group containing the resource to get. The name is case
     *     insensitive.
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param parentResourcePath The parent resource identity.
     * @param resourceType The resource type of the resource.
     * @param resourceName The name of the resource to get.
     * @param apiVersion The API version to use for the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a resource.
     */
    GenericResource get(
        String resourceGroupName,
        String resourceProviderNamespace,
        String parentResourcePath,
        String resourceType,
        String resourceName,
        String apiVersion);

    /**
     * Gets a resource.
     *
     * @param resourceGroupName The name of the resource group containing the resource to get. The name is case
     *     insensitive.
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param parentResourcePath The parent resource identity.
     * @param resourceType The resource type of the resource.
     * @param resourceName The name of the resource to get.
     * @param apiVersion The API version to use for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a resource.
     */
    Response<GenericResource> getWithResponse(
        String resourceGroupName,
        String resourceProviderNamespace,
        String parentResourcePath,
        String resourceType,
        String resourceName,
        String apiVersion,
        Context context);

    /**
     * Checks by ID whether a resource exists.
     *
     * @param resourceId The fully qualified ID of the resource, including the resource name and resource type. Use the
     *     format,
     *     /subscriptions/{guid}/resourceGroups/{resource-group-name}/{resource-provider-namespace}/{resource-type}/{resource-name}.
     * @param apiVersion The API version to use for the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return whether resource exists.
     */
    boolean checkExistenceById(String resourceId, String apiVersion);

    /**
     * Checks by ID whether a resource exists.
     *
     * @param resourceId The fully qualified ID of the resource, including the resource name and resource type. Use the
     *     format,
     *     /subscriptions/{guid}/resourceGroups/{resource-group-name}/{resource-provider-namespace}/{resource-type}/{resource-name}.
     * @param apiVersion The API version to use for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Boolean> checkExistenceByIdWithResponse(String resourceId, String apiVersion, Context context);

    /**
     * Deletes a resource by ID.
     *
     * @param resourceId The fully qualified ID of the resource, including the resource name and resource type. Use the
     *     format,
     *     /subscriptions/{guid}/resourceGroups/{resource-group-name}/{resource-provider-namespace}/{resource-type}/{resource-name}.
     * @param apiVersion The API version to use for the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String resourceId, String apiVersion);

    /**
     * Deletes a resource by ID.
     *
     * @param resourceId The fully qualified ID of the resource, including the resource name and resource type. Use the
     *     format,
     *     /subscriptions/{guid}/resourceGroups/{resource-group-name}/{resource-provider-namespace}/{resource-type}/{resource-name}.
     * @param apiVersion The API version to use for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String resourceId, String apiVersion, Context context);

    /**
     * Create a resource by ID.
     *
     * @param resourceId The fully qualified ID of the resource, including the resource name and resource type. Use the
     *     format,
     *     /subscriptions/{guid}/resourceGroups/{resource-group-name}/{resource-provider-namespace}/{resource-type}/{resource-name}.
     * @param apiVersion The API version to use for the operation.
     * @param parameters Create or update resource parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource information.
     */
    GenericResource createOrUpdateById(String resourceId, String apiVersion, GenericResourceInner parameters);

    /**
     * Create a resource by ID.
     *
     * @param resourceId The fully qualified ID of the resource, including the resource name and resource type. Use the
     *     format,
     *     /subscriptions/{guid}/resourceGroups/{resource-group-name}/{resource-provider-namespace}/{resource-type}/{resource-name}.
     * @param apiVersion The API version to use for the operation.
     * @param parameters Create or update resource parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource information.
     */
    GenericResource createOrUpdateById(
        String resourceId, String apiVersion, GenericResourceInner parameters, Context context);

    /**
     * Updates a resource by ID.
     *
     * @param resourceId The fully qualified ID of the resource, including the resource name and resource type. Use the
     *     format,
     *     /subscriptions/{guid}/resourceGroups/{resource-group-name}/{resource-provider-namespace}/{resource-type}/{resource-name}.
     * @param apiVersion The API version to use for the operation.
     * @param parameters Update resource parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource information.
     */
    GenericResource updateById(String resourceId, String apiVersion, GenericResourceInner parameters);

    /**
     * Updates a resource by ID.
     *
     * @param resourceId The fully qualified ID of the resource, including the resource name and resource type. Use the
     *     format,
     *     /subscriptions/{guid}/resourceGroups/{resource-group-name}/{resource-provider-namespace}/{resource-type}/{resource-name}.
     * @param apiVersion The API version to use for the operation.
     * @param parameters Update resource parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource information.
     */
    GenericResource updateById(String resourceId, String apiVersion, GenericResourceInner parameters, Context context);

    /**
     * Gets a resource by ID.
     *
     * @param resourceId The fully qualified ID of the resource, including the resource name and resource type. Use the
     *     format,
     *     /subscriptions/{guid}/resourceGroups/{resource-group-name}/{resource-provider-namespace}/{resource-type}/{resource-name}.
     * @param apiVersion The API version to use for the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a resource by ID.
     */
    GenericResource getById(String resourceId, String apiVersion);

    /**
     * Gets a resource by ID.
     *
     * @param resourceId The fully qualified ID of the resource, including the resource name and resource type. Use the
     *     format,
     *     /subscriptions/{guid}/resourceGroups/{resource-group-name}/{resource-provider-namespace}/{resource-type}/{resource-name}.
     * @param apiVersion The API version to use for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a resource by ID.
     */
    Response<GenericResource> getByIdWithResponse(String resourceId, String apiVersion, Context context);
}
