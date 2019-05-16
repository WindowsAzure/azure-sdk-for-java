/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventhub.v2017_04_01;

import rx.Observable;
import com.microsoft.azure.management.eventhub.v2017_04_01.implementation.RegionsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Regions.
 */
public interface Regions extends HasInner<RegionsInner> {
    /**
     * Gets the available Regions for a given sku.
     *
     * @param sku The sku type.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<MessagingRegions> listBySkuAsync(final String sku);

}
