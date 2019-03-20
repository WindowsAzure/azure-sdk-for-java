/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview;

import rx.Observable;
import com.microsoft.azure.management.billing.v2018_11_01_preview.implementation.InvoiceSectionsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing InvoiceSections.
 */
public interface InvoiceSections extends HasInner<InvoiceSectionsInner> {
    /**
     * Get the InvoiceSection by id.
     *
     * @param billingAccountId billing Account Id.
     * @param invoiceSectionId InvoiceSection Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<InvoiceSection> getAsync(String billingAccountId, String invoiceSectionId);

    /**
     * The operation to create a InvoiceSection.
     *
     * @param billingAccountId billing Account Id.
     * @param parameters Parameters supplied to the Create InvoiceSection operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<InvoiceSection> createAsync(String billingAccountId, InvoiceSectionProperties parameters);

}
