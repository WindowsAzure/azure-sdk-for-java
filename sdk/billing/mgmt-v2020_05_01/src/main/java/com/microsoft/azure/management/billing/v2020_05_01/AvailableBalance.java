/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2020_05_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.billing.v2020_05_01.implementation.BillingManager;
import com.microsoft.azure.management.billing.v2020_05_01.implementation.AvailableBalanceInner;

/**
 * Type representing AvailableBalance.
 */
public interface AvailableBalance extends HasInner<AvailableBalanceInner>, HasManager<BillingManager> {
    /**
     * @return the amount value.
     */
    Amount amount();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the type value.
     */
    String type();

}
