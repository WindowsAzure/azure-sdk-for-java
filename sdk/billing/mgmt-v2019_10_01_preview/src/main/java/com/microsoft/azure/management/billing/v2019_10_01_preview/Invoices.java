/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview;

import rx.Observable;
import com.microsoft.azure.management.billing.v2019_10_01_preview.implementation.InvoicesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Invoices.
 */
public interface Invoices extends HasInner<InvoicesInner> {
    /**
     * List of invoices for a billing account.
     *
     * @param billingAccountName billing Account Id.
     * @param periodStartDate Invoice period start date.
     * @param periodEndDate Invoice period end date.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<InvoiceListResult> listByBillingAccountAsync(String billingAccountName, String periodStartDate, String periodEndDate);

    /**
     * List of invoices for a billing profile.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @param periodStartDate Invoice period start date.
     * @param periodEndDate Invoice period end date.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<InvoiceListResult> listByBillingProfileAsync(String billingAccountName, String billingProfileName, String periodStartDate, String periodEndDate);

    /**
     * Get the invoice by name.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @param invoiceName Invoice Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Invoice> getAsync(String billingAccountName, String billingProfileName, String invoiceName);

    /**
     * Lists invoices by billing subscriptions name.
     *
     * @param billingAccountName billing Account Id.
     * @param billingSubscriptionName Billing Subscription Id.
     * @param periodStartDate Invoice period start date.
     * @param periodEndDate Invoice period end date.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Invoice> listByBillingSubscriptionAsync(final String billingAccountName, final String billingSubscriptionName, final String periodStartDate, final String periodEndDate);

    /**
     * Gets the invoice by name.
     *
     * @param billingAccountName billing Account Id.
     * @param billingSubscriptionName Billing Subscription Id.
     * @param invoiceName Invoice Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Invoice> getByIdAsync(String billingAccountName, String billingSubscriptionName, String invoiceName);

}
