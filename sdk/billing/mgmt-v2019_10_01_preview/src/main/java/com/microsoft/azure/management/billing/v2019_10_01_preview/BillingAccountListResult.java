/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.billing.v2019_10_01_preview.implementation.BillingManager;
import com.microsoft.azure.management.billing.v2019_10_01_preview.implementation.BillingAccountListResultInner;
import com.microsoft.azure.management.billing.v2019_10_01_preview.implementation.BillingAccountInner;
import java.util.List;

/**
 * Type representing BillingAccountListResult.
 */
public interface BillingAccountListResult extends HasInner<BillingAccountListResultInner>, HasManager<BillingManager> {
    /**
     * @return the nextLink value.
     */
    String nextLink();

    /**
     * @return the value value.
     */
    List<BillingAccountInner> value();

}
