/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview;

import rx.Observable;
import com.microsoft.azure.management.billing.v2018_11_01_preview.implementation.InvoiceSectionsByBillingAccountIdsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing InvoiceSectionsByBillingAccountIds.
 */
public interface InvoiceSectionsByBillingAccountIds extends HasInner<InvoiceSectionsByBillingAccountIdsInner> {
    /**
     * Lists all invoice sections for a user which he has access to.
     *
     * @param billingAccountId billing Account Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<InvoiceSectionListResult> listAsync(String billingAccountId);

}
