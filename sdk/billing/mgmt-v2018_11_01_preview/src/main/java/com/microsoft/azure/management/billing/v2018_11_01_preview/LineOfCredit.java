/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.billing.v2018_11_01_preview.implementation.BillingManager;
import com.microsoft.azure.management.billing.v2018_11_01_preview.implementation.LineOfCreditInner;

/**
 * Type representing LineOfCredit.
 */
public interface LineOfCredit extends HasInner<LineOfCreditInner>, HasManager<BillingManager> {
    /**
     * @return the creditLimit value.
     */
    Amount creditLimit();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the reason value.
     */
    String reason();

    /**
     * @return the remainingBalance value.
     */
    Amount remainingBalance();

    /**
     * @return the status value.
     */
    Status status();

    /**
     * @return the type value.
     */
    String type();

}
