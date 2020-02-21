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
import com.microsoft.azure.management.datafactory.v2018_06_01.implementation.DataFlowsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing DataFlows.
 */
public interface DataFlows extends SupportsCreating<DataFlowResource.DefinitionStages.Blank>, HasInner<DataFlowsInner> {
    /**
     * Gets a data flow.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param dataFlowName The data flow name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DataFlowResource> getAsync(String resourceGroupName, String factoryName, String dataFlowName);

    /**
     * Lists data flows.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DataFlowResource> listByFactoryAsync(final String resourceGroupName, final String factoryName);

    /**
     * Deletes a data flow.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param dataFlowName The data flow name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String factoryName, String dataFlowName);

}
