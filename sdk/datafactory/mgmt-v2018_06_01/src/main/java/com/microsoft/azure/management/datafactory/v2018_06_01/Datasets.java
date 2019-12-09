/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.datafactory.v2018_06_01.implementation.DatasetsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Datasets.
 */
public interface Datasets extends SupportsCreating<DatasetResource.DefinitionStages.Blank>, HasInner<DatasetsInner> {
    /**
     * Gets a dataset.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param datasetName The dataset name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DatasetResource> getAsync(String resourceGroupName, String factoryName, String datasetName);

    /**
     * Lists datasets.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DatasetResource> listByFactoryAsync(final String resourceGroupName, final String factoryName);

    /**
     * Deletes a dataset.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param datasetName The dataset name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String factoryName, String datasetName);

}
