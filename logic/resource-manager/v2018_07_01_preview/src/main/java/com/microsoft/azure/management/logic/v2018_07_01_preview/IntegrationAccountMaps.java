/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2018_07_01_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.logic.v2018_07_01_preview.implementation.IntegrationAccountMapsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing IntegrationAccountMaps.
 */
public interface IntegrationAccountMaps extends SupportsCreating<IntegrationAccountMap.DefinitionStages.Blank>, HasInner<IntegrationAccountMapsInner> {
    /**
     * Get the content callback url.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param mapName The integration account map name.
     * @param listContentCallbackUrl the GetCallbackUrlParameters value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<WorkflowTriggerCallbackUrl> listContentCallbackUrlAsync(String resourceGroupName, String integrationAccountName, String mapName, GetCallbackUrlParameters listContentCallbackUrl);

    /**
     * Gets an integration account map.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param mapName The integration account map name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<IntegrationAccountMap> getAsync(String resourceGroupName, String integrationAccountName, String mapName);

    /**
     * Gets a list of integration account maps.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<IntegrationAccountMap> listAsync(final String resourceGroupName, final String integrationAccountName);

    /**
     * Deletes an integration account map.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param mapName The integration account map name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String integrationAccountName, String mapName);

}
