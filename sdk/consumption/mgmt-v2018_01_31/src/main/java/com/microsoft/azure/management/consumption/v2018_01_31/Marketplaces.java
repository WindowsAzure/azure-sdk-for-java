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
 * Type representing Marketplaces.
 */
public interface Marketplaces {
    /**
     * Lists the marketplaces for a scope by billing period and subscriptionId. Marketplaces are available via this API only for May 1, 2014 or later.
     *
     * @param billingPeriodName Billing Period Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Marketplace> listByBillingPeriodAsync(final String billingPeriodName);

    /**
     * Lists the marketplaces for a scope by subscriptionId. Marketplaces are available via this API only for May 1, 2014 or later.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Marketplace> listAsync();

}
