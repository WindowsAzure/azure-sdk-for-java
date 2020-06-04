/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.subscription.v2019_10_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.subscription.v2019_10_01_preview.implementation.BillingManager;
import com.microsoft.azure.management.subscription.v2019_10_01_preview.implementation.SubscriptionCreationResultInner;

/**
 * Type representing SubscriptionCreationResult.
 */
public interface SubscriptionCreationResult extends HasInner<SubscriptionCreationResultInner>, HasManager<BillingManager> {
    /**
     * @return the subscriptionLink value.
     */
    String subscriptionLink();

}
