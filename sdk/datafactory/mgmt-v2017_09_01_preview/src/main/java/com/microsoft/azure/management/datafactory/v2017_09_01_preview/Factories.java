/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2017_09_01_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import rx.Completable;
import com.microsoft.azure.management.datafactory.v2017_09_01_preview.implementation.FactoriesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Factories.
 */
public interface Factories extends SupportsCreating<Factory.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<Factory>, SupportsListingByResourceGroup<Factory>, SupportsListing<Factory>, HasInner<FactoriesInner> {
    /**
     * Cancel a pipeline run by its run ID.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param runId The pipeline run identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable cancelPipelineRunAsync(String resourceGroupName, String factoryName, String runId);

    /**
     * Updates a factory's repo information.
     *
     * @param locationId The location identifier.
     * @param factoryRepoUpdate Update factory repo request definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Factory> configureFactoryRepoAsync(String locationId, FactoryRepoUpdate factoryRepoUpdate);

}
