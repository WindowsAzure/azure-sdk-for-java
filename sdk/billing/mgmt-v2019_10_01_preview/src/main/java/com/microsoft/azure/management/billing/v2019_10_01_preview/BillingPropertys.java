/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview;

import rx.Observable;
import com.microsoft.azure.management.billing.v2019_10_01_preview.implementation.BillingPropertysInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing BillingPropertys.
 */
public interface BillingPropertys extends HasInner<BillingPropertysInner> {
    /**
     * Get billing property by subscription Id.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingProperty> getAsync();

}
