/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.consumption.v2018_10_01;

import rx.Observable;

/**
 * Type representing Tenants.
 */
public interface Tenants {
    /**
     * Gets a Tenant Properties.
     *
     * @param billingAccountId Billing Account Id.
     * @param billingProfileId Billing Profile Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<TenantListResult> getAsync(String billingAccountId, String billingProfileId);

}
