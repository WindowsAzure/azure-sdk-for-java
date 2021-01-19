/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01;

import com.microsoft.azure.arm.collection.SupportsListing;
import rx.Observable;
import com.microsoft.azure.management.network.v2020_07_01.implementation.VirtualApplianceSkusInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing VirtualApplianceSkus.
 */
public interface VirtualApplianceSkus extends SupportsListing<NetworkVirtualApplianceSku>, HasInner<VirtualApplianceSkusInner> {
    /**
     * Retrieves a single available sku for network virtual appliance.
     *
     * @param skuName Name of the Sku.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<NetworkVirtualApplianceSku> getAsync(String skuName);

}
