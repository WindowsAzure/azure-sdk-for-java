/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2020_07_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import com.microsoft.azure.management.containerservice.v2020_07_01.implementation.ContainerServicesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ContainerServices.
 */
public interface ContainerServices extends SupportsCreating<ContainerService.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<ContainerService>, SupportsListingByResourceGroup<ContainerService>, SupportsListing<ContainerService>, HasInner<ContainerServicesInner> {
    /**
     * Gets a list of supported orchestrators in the specified subscription.
     * Gets a list of supported orchestrators in the specified subscription. The operation returns properties of each orchestrator including version, available upgrades and whether that version or upgrades are in preview.
     *
     * @param location The name of a supported Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<OrchestratorVersionProfileListResult> listOrchestratorsAsync(String location);

}
