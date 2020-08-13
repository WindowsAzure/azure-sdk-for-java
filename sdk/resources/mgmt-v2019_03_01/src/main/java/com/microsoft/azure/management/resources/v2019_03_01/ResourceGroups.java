/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2019_03_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.resources.v2019_03_01.implementation.ResourceGroupsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ResourceGroups.
 */
public interface ResourceGroups extends SupportsCreating<ResourceGroup.DefinitionStages.Blank>, HasInner<ResourceGroupsInner> {
    /**
     * Checks whether a resource group exists.
     *
     * @param resourceGroupName The name of the resource group to check. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Boolean> checkExistenceAsync(String resourceGroupName);

    /**
     * Captures the specified resource group as a template.
     *
     * @param resourceGroupName The name of the resource group to export as a template.
     * @param parameters Parameters for exporting the template.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ResourceGroupExportResult> exportTemplateAsync(String resourceGroupName, ExportTemplateRequest parameters);

    /**
     * Gets a resource group.
     *
     * @param resourceGroupName The name of the resource group to get. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ResourceGroup> getAsync(String resourceGroupName);

    /**
     * Gets all the resource groups for a subscription.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ResourceGroup> listAsync();

    /**
     * Deletes a resource group.
     * When you delete a resource group, all of its resources are also deleted. Deleting a resource group deletes all of its template deployments and currently stored operations.
     *
     * @param resourceGroupName The name of the resource group to delete. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName);

}
