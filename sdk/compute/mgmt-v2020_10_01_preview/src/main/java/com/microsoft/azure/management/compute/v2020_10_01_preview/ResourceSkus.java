/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview;

import rx.Observable;
import com.microsoft.azure.management.compute.v2020_10_01_preview.implementation.ResourceSkusInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ResourceSkus.
 */
public interface ResourceSkus extends HasInner<ResourceSkusInner> {
    /**
     * Gets the list of Microsoft.Compute SKUs available for your Subscription.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ResourceSku> listAsync();

}
