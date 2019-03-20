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
import com.microsoft.azure.management.billing.v2018_11_01_preview.implementation.InvoiceListResultInner;
import com.microsoft.azure.management.billing.v2018_11_01_preview.implementation.InvoiceSummaryInner;
import java.util.List;

/**
 * Type representing InvoiceListResult.
 */
public interface InvoiceListResult extends HasInner<InvoiceListResultInner>, HasManager<BillingManager> {
    /**
     * @return the nextLink value.
     */
    String nextLink();

    /**
     * @return the value value.
     */
    List<InvoiceSummaryInner> value();

}
