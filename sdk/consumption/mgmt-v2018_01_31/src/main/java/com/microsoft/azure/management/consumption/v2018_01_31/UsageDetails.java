/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.consumption.v2018_01_31;

import rx.Observable;

/**
 * Type representing UsageDetails.
 */
public interface UsageDetails {
    /**
     * Lists the usage details for a scope by billing period. Usage details are available via this API only for May 1, 2014 or later.
     *
     * @param billingPeriodName Billing Period Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<UsageDetail> listByBillingPeriodAsync(final String billingPeriodName);

    /**
     * Lists the usage details for a scope by billing period. Usage details are available via this API only for May 1, 2014 or later.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<UsageDetail> listAsync();

}
