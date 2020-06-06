/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview;

import rx.Observable;
import com.microsoft.azure.management.billing.v2018_11_01_preview.implementation.InvoicesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Invoices.
 */
public interface Invoices extends HasInner<InvoicesInner> {
    /**
     * List of invoices for a billing profile.
     *
     * @param billingAccountName Billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @param periodStartDate Invoice period start date.
     * @param periodEndDate Invoice period end date.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<InvoiceSummary> listByBillingProfileAsync(final String billingAccountName, final String billingProfileName, final String periodStartDate, final String periodEndDate);

    /**
     * Get the invoice by name.
     *
     * @param billingAccountName Billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @param invoiceName Invoice Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<InvoiceSummary> getAsync(String billingAccountName, String billingProfileName, String invoiceName);

    /**
     * List of invoices for a billing account.
     *
     * @param billingAccountName Billing Account Id.
     * @param periodStartDate Invoice period start date.
     * @param periodEndDate Invoice period end date.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<InvoiceSummary> listByBillingAccountNameAsync(final String billingAccountName, final String periodStartDate, final String periodEndDate);

}
