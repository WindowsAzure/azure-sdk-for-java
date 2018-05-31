/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.locks.v2016_09_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import rx.Completable;
import com.microsoft.azure.management.locks.v2016_09_01.implementation.ManagementLockObjectInner;
import com.microsoft.azure.management.locks.v2016_09_01.implementation.ManagementLocksInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ManagementLocks.
 */
public interface ManagementLocks extends SupportsCreating<ManagementLockObject.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<ManagementLockObject>, SupportsListingByResourceGroup<ManagementLockObject>, SupportsListing<ManagementLockObject>, HasInner<ManagementLocksInner> {
    /**
     * Create or update a management lock by scope.
     *
     * @param scope The scope for the lock. When providing a scope for the assignment, use '/subscriptions/{subscriptionId}' for subscriptions, '/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}' for resource groups, and '/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{parentResourcePathIfPresent}/{resourceType}/{resourceName}' for resources.
     * @param lockName The name of lock.
     * @param parameters Create or update management lock parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ManagementLockObject> createOrUpdateByScopeAsync(String scope, String lockName, ManagementLockObjectInner parameters);

    /**
     * Delete a management lock by scope.
     *
     * @param scope The scope for the lock.
     * @param lockName The name of lock.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteByScopeAsync(String scope, String lockName);

    /**
     * Get a management lock by scope.
     *
     * @param scope The scope for the lock.
     * @param lockName The name of lock.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ManagementLockObject> getByScopeAsync(String scope, String lockName);

    /**
     * Creates or updates a management lock at the resource level or any level below the resource.
     * When you apply a lock at a parent scope, all child resources inherit the same lock. To create management locks, you must have access to Microsoft.Authorization/* or Microsoft.Authorization/locks/* actions. Of the built-in roles, only Owner and User Access Administrator are granted those actions.
     *
     * @param resourceGroupName The name of the resource group containing the resource to lock.
     * @param resourceProviderNamespace The resource provider namespace of the resource to lock.
     * @param parentResourcePath The parent resource identity.
     * @param resourceType The resource type of the resource to lock.
     * @param resourceName The name of the resource to lock.
     * @param lockName The name of lock. The lock name can be a maximum of 260 characters. It cannot contain &lt;, &gt; %, &amp;, :, \, ?, /, or any control characters.
     * @param parameters Parameters for creating or updating a  management lock.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ManagementLockObject> createOrUpdateAtResourceLevelAsync(String resourceGroupName, String resourceProviderNamespace, String parentResourcePath, String resourceType, String resourceName, String lockName, ManagementLockObjectInner parameters);

    /**
     * Deletes the management lock of a resource or any level below the resource.
     * To delete management locks, you must have access to Microsoft.Authorization/* or Microsoft.Authorization/locks/* actions. Of the built-in roles, only Owner and User Access Administrator are granted those actions.
     *
     * @param resourceGroupName The name of the resource group containing the resource with the lock to delete.
     * @param resourceProviderNamespace The resource provider namespace of the resource with the lock to delete.
     * @param parentResourcePath The parent resource identity.
     * @param resourceType The resource type of the resource with the lock to delete.
     * @param resourceName The name of the resource with the lock to delete.
     * @param lockName The name of the lock to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAtResourceLevelAsync(String resourceGroupName, String resourceProviderNamespace, String parentResourcePath, String resourceType, String resourceName, String lockName);

    /**
     * Get the management lock of a resource or any level below resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param parentResourcePath An extra path parameter needed in some services, like SQL Databases.
     * @param resourceType The type of the resource.
     * @param resourceName The name of the resource.
     * @param lockName The name of lock.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ManagementLockObject> getAtResourceLevelAsync(String resourceGroupName, String resourceProviderNamespace, String parentResourcePath, String resourceType, String resourceName, String lockName);

    /**
     * Creates or updates a management lock at the subscription level.
     * When you apply a lock at a parent scope, all child resources inherit the same lock. To create management locks, you must have access to Microsoft.Authorization/* or Microsoft.Authorization/locks/* actions. Of the built-in roles, only Owner and User Access Administrator are granted those actions.
     *
     * @param lockName The name of lock. The lock name can be a maximum of 260 characters. It cannot contain &lt;, &gt; %, &amp;, :, \, ?, /, or any control characters.
     * @param parameters The management lock parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ManagementLockObject> createOrUpdateAtSubscriptionLevelAsync(String lockName, ManagementLockObjectInner parameters);

    /**
     * Deletes the management lock at the subscription level.
     * To delete management locks, you must have access to Microsoft.Authorization/* or Microsoft.Authorization/locks/* actions. Of the built-in roles, only Owner and User Access Administrator are granted those actions.
     *
     * @param lockName The name of lock to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAtSubscriptionLevelAsync(String lockName);

    /**
     * Gets a management lock at the subscription level.
     *
     * @param lockName The name of the lock to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ManagementLockObject> getAtSubscriptionLevelAsync(String lockName);

    /**
     * Gets all the management locks for a resource or any level below resource.
     *
     * @param resourceGroupName The name of the resource group containing the locked resource. The name is case insensitive.
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param parentResourcePath The parent resource identity.
     * @param resourceType The resource type of the locked resource.
     * @param resourceName The name of the locked resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ManagementLockObject> listAtResourceLevelAsync(final String resourceGroupName, final String resourceProviderNamespace, final String parentResourcePath, final String resourceType, final String resourceName);

}
