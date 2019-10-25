/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.peering.v2019_08_01_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.peering.v2019_08_01_preview.implementation.PeeringServicePrefixesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing PeeringServicePrefixes.
 */
public interface PeeringServicePrefixes extends SupportsCreating<PeeringServicePeeringServicePrefix.DefinitionStages.Blank>, HasInner<PeeringServicePrefixesInner> {
    /**
     * Gets the peering service prefix.
     *
     * @param resourceGroupName The resource group name.
     * @param peeringServiceName The peering service name.
     * @param prefixName The prefix name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PeeringServicePeeringServicePrefix> getAsync(String resourceGroupName, String peeringServiceName, String prefixName);

    /**
     * removes the peering prefix.
     *
     * @param resourceGroupName The resource group name.
     * @param peeringServiceName The peering service name.
     * @param prefixName The prefix name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String peeringServiceName, String prefixName);

}
