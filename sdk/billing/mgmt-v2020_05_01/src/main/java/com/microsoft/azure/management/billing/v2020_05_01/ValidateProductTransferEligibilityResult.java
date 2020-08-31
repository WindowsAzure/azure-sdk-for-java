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
import com.microsoft.azure.management.billing.v2020_05_01.implementation.ValidateProductTransferEligibilityResultInner;

/**
 * Type representing ValidateProductTransferEligibilityResult.
 */
public interface ValidateProductTransferEligibilityResult extends HasInner<ValidateProductTransferEligibilityResultInner>, HasManager<BillingManager> {
    /**
     * @return the errorDetails value.
     */
    ValidateProductTransferEligibilityError errorDetails();

    /**
     * @return the isMoveEligible value.
     */
    Boolean isMoveEligible();

}
