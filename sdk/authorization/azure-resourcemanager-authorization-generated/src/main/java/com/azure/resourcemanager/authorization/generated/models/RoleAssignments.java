// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of RoleAssignments. */
public interface RoleAssignments {
    /**
     * Gets role assignments for a resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param parentResourcePath The parent resource identity.
     * @param resourceType The resource type of the resource.
     * @param resourceName The name of the resource to get role assignments for.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role assignments for a resource.
     */
    PagedIterable<RoleAssignment> listForResource(
        String resourceGroupName,
        String resourceProviderNamespace,
        String parentResourcePath,
        String resourceType,
        String resourceName);

    /**
     * Gets role assignments for a resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param parentResourcePath The parent resource identity.
     * @param resourceType The resource type of the resource.
     * @param resourceName The name of the resource to get role assignments for.
     * @param filter The filter to apply on the operation. Use $filter=atScope() to return all role assignments at or
     *     above the scope. Use $filter=principalId eq {id} to return all role assignments at, above or below the scope
     *     for the specified principal.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role assignments for a resource.
     */
    PagedIterable<RoleAssignment> listForResource(
        String resourceGroupName,
        String resourceProviderNamespace,
        String parentResourcePath,
        String resourceType,
        String resourceName,
        String filter,
        Context context);

    /**
     * Gets role assignments for a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role assignments for a resource group.
     */
    PagedIterable<RoleAssignment> listByResourceGroup(String resourceGroupName);

    /**
     * Gets role assignments for a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param filter The filter to apply on the operation. Use $filter=atScope() to return all role assignments at or
     *     above the scope. Use $filter=principalId eq {id} to return all role assignments at, above or below the scope
     *     for the specified principal.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role assignments for a resource group.
     */
    PagedIterable<RoleAssignment> listByResourceGroup(String resourceGroupName, String filter, Context context);

    /**
     * Deletes a role assignment.
     *
     * @param scope The scope of the role assignment to delete.
     * @param roleAssignmentName The name of the role assignment to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role Assignments.
     */
    RoleAssignment deleteByResourceGroup(String scope, String roleAssignmentName);

    /**
     * Deletes a role assignment.
     *
     * @param scope The scope of the role assignment to delete.
     * @param roleAssignmentName The name of the role assignment to delete.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role Assignments.
     */
    Response<RoleAssignment> deleteWithResponse(String scope, String roleAssignmentName, Context context);

    /**
     * Get the specified role assignment.
     *
     * @param scope The scope of the role assignment.
     * @param roleAssignmentName The name of the role assignment to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified role assignment.
     */
    RoleAssignment get(String scope, String roleAssignmentName);

    /**
     * Get the specified role assignment.
     *
     * @param scope The scope of the role assignment.
     * @param roleAssignmentName The name of the role assignment to get.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified role assignment.
     */
    Response<RoleAssignment> getWithResponse(String scope, String roleAssignmentName, Context context);

    /**
     * Deletes a role assignment.
     *
     * @param roleId The ID of the role assignment to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role Assignments.
     */
    RoleAssignment deleteById(String roleId);

    /**
     * Deletes a role assignment.
     *
     * @param roleId The ID of the role assignment to delete.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role Assignments.
     */
    Response<RoleAssignment> deleteByIdWithResponse(String roleId, Context context);

    /**
     * Creates a role assignment by ID.
     *
     * @param roleId The ID of the role assignment to create.
     * @param parameters Parameters for the role assignment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role Assignments.
     */
    RoleAssignment createById(String roleId, RoleAssignmentCreateParameters parameters);

    /**
     * Creates a role assignment by ID.
     *
     * @param roleId The ID of the role assignment to create.
     * @param parameters Parameters for the role assignment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role Assignments.
     */
    Response<RoleAssignment> createByIdWithResponse(
        String roleId, RoleAssignmentCreateParameters parameters, Context context);

    /**
     * Gets a role assignment by ID.
     *
     * @param roleId The ID of the role assignment to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a role assignment by ID.
     */
    RoleAssignment getById(String roleId);

    /**
     * Gets a role assignment by ID.
     *
     * @param roleId The ID of the role assignment to get.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a role assignment by ID.
     */
    Response<RoleAssignment> getByIdWithResponse(String roleId, Context context);

    /**
     * Gets all role assignments for the subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all role assignments for the subscription.
     */
    PagedIterable<RoleAssignment> list();

    /**
     * Gets all role assignments for the subscription.
     *
     * @param filter The filter to apply on the operation. Use $filter=atScope() to return all role assignments at or
     *     above the scope. Use $filter=principalId eq {id} to return all role assignments at, above or below the scope
     *     for the specified principal.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all role assignments for the subscription.
     */
    PagedIterable<RoleAssignment> list(String filter, Context context);

    /**
     * Gets role assignments for a scope.
     *
     * @param scope The scope of the role assignments.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role assignments for a scope.
     */
    PagedIterable<RoleAssignment> listForScope(String scope);

    /**
     * Gets role assignments for a scope.
     *
     * @param scope The scope of the role assignments.
     * @param filter The filter to apply on the operation. Use $filter=atScope() to return all role assignments at or
     *     above the scope. Use $filter=principalId eq {id} to return all role assignments at, above or below the scope
     *     for the specified principal.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role assignments for a scope.
     */
    PagedIterable<RoleAssignment> listForScope(String scope, String filter, Context context);

    /**
     * Begins definition for a new RoleAssignment resource.
     *
     * @param name resource name.
     * @return the first stage of the new RoleAssignment definition.
     */
    RoleAssignment.DefinitionStages.Blank define(String name);
}
