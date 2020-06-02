/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2020_05_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.billing.v2020_05_01.implementation.CustomerInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.billing.v2020_05_01.implementation.BillingManager;
import java.util.List;

/**
 * Type representing Customer.
 */
public interface Customer extends HasInner<CustomerInner>, HasManager<BillingManager> {
    /**
     * @return the billingProfileDisplayName value.
     */
    String billingProfileDisplayName();

    /**
     * @return the billingProfileId value.
     */
    String billingProfileId();

    /**
     * @return the displayName value.
     */
    String displayName();

    /**
     * @return the enabledAzurePlans value.
     */
    List<AzurePlan> enabledAzurePlans();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the resellers value.
     */
    List<Reseller> resellers();

    /**
     * @return the type value.
     */
    String type();

}
