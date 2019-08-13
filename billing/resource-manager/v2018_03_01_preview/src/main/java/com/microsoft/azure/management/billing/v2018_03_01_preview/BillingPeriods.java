/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_03_01_preview;

import com.microsoft.azure.arm.collection.SupportsListing;
import rx.Observable;
import com.microsoft.azure.management.billing.v2018_03_01_preview.implementation.BillingPeriodsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing BillingPeriods.
 */
public interface BillingPeriods extends SupportsListing<BillingPeriod>, HasInner<BillingPeriodsInner> {
    /**
     * Gets a named billing period.  This is only supported for Azure Web-Direct subscriptions. Other subscription types which were not purchased directly through the Azure web portal are not supported through this preview API.
     *
     * @param billingPeriodName The name of a BillingPeriod resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingPeriod> getAsync(String billingPeriodName);

}
