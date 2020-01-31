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
import com.microsoft.azure.management.billing.v2019_10_01_preview.implementation.InvoiceSectionWithCreateSubPermissionInner;
import java.util.List;

/**
 * Type representing InvoiceSectionWithCreateSubPermission.
 */
public interface InvoiceSectionWithCreateSubPermission extends HasInner<InvoiceSectionWithCreateSubPermissionInner>, HasManager<BillingManager> {
    /**
     * @return the billingProfileDisplayName value.
     */
    String billingProfileDisplayName();

    /**
     * @return the billingProfileId value.
     */
    String billingProfileId();

    /**
     * @return the billingProfileSpendingLimit value.
     */
    Object billingProfileSpendingLimit();

    /**
     * @return the billingProfileStatus value.
     */
    Object billingProfileStatus();

    /**
     * @return the billingProfileStatusReasonCode value.
     */
    Object billingProfileStatusReasonCode();

    /**
     * @return the enabledAzurePlans value.
     */
    List<AzurePlan> enabledAzurePlans();

    /**
     * @return the invoiceSectionDisplayName value.
     */
    String invoiceSectionDisplayName();

    /**
     * @return the invoiceSectionId value.
     */
    String invoiceSectionId();

}
