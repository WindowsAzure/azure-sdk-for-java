/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.consumption.v2019_01_01;

import rx.Observable;
import com.microsoft.azure.management.consumption.v2019_01_01.implementation.PriceSheetsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing PriceSheets.
 */
public interface PriceSheets extends HasInner<PriceSheetsInner> {
    /**
     * Gets the price sheet for a scope by subscriptionId. Price sheet is available via this API only for May 1, 2014 or later.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PriceSheetResult> getAsync();

    /**
     * Get the price sheet for a scope by subscriptionId and billing period. Price sheet is available via this API only for May 1, 2014 or later.
     *
     * @param billingPeriodName Billing Period Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PriceSheetResult> getByBillingPeriodAsync(String billingPeriodName);

}
