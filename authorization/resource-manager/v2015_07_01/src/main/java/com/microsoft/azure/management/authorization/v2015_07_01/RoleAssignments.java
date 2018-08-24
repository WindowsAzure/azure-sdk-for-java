/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.authorization.v2015_07_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.authorization.v2015_07_01.implementation.RoleAssignmentsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing RoleAssignments.
 */
public interface RoleAssignments extends SupportsCreating<RoleAssignment.DefinitionStages.Blank>, HasInner<RoleAssignmentsInner> {
    /**
     * Gets role assignments for a resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param parentResourcePath The parent resource identity.
     * @param resourceType The resource type of the resource.
     * @param resourceName The name of the resource to get role assignments for.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RoleAssignment> listForResourceAsync(final String resourceGroupName, final String resourceProviderNamespace, final String parentResourcePath, final String resourceType, final String resourceName);

    /**
     * Deletes a role assignment.
     *
     * @param scope The scope of the role assignment to delete.
     * @param roleAssignmentName The name of the role assignment to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RoleAssignment> deleteAsync(String scope, String roleAssignmentName);

    /**
     * Get the specified role assignment.
     *
     * @param scope The scope of the role assignment.
     * @param roleAssignmentName The name of the role assignment to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RoleAssignment> getAsync(String scope, String roleAssignmentName);

    /**
     * Deletes a role assignment.
     *
     * @param roleAssignmentId The fully qualified ID of the role assignment, including the scope, resource name and resource type. Use the format, /{scope}/providers/Microsoft.Authorization/roleAssignments/{roleAssignmentName}. Example: /subscriptions/{subId}/resourcegroups/{rgname}//providers/Microsoft.Authorization/roleAssignments/{roleAssignmentName}.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RoleAssignment> deleteByIdAsync(String roleAssignmentId);

    /**
     * Creates a role assignment by ID.
     *
     * @param roleAssignmentId The fully qualified ID of the role assignment, including the scope, resource name and resource type. Use the format, /{scope}/providers/Microsoft.Authorization/roleAssignments/{roleAssignmentName}. Example: /subscriptions/{subId}/resourcegroups/{rgname}//providers/Microsoft.Authorization/roleAssignments/{roleAssignmentName}.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RoleAssignment> createByIdAsync(String roleAssignmentId);

    /**
     * Gets a role assignment by ID.
     *
     * @param roleAssignmentId The fully qualified ID of the role assignment, including the scope, resource name and resource type. Use the format, /{scope}/providers/Microsoft.Authorization/roleAssignments/{roleAssignmentName}. Example: /subscriptions/{subId}/resourcegroups/{rgname}//providers/Microsoft.Authorization/roleAssignments/{roleAssignmentName}.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RoleAssignment> getByIdAsync(String roleAssignmentId);

    /**
     * Gets role assignments for a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RoleAssignment> listByResourceGroupAsync(final String resourceGroupName);

    /**
     * Gets all role assignments for the subscription.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RoleAssignment> listAsync();

    /**
     * Gets role assignments for a scope.
     *
     * @param scope The scope of the role assignments.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RoleAssignment> listForScopeAsync(final String scope);

}
