/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview;

import rx.Observable;
import com.microsoft.azure.management.billing.v2018_11_01_preview.implementation.BillingSubscriptionsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing BillingSubscriptions.
 */
public interface BillingSubscriptions extends HasInner<BillingSubscriptionsInner> {
    /**
     * Lists billing subscriptions by billing profile name.
     *
     * @param billingAccountName Billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingSubscriptionSummary> listByBillingProfileNameAsync(final String billingAccountName, final String billingProfileName);

    /**
     * Lists billing subscription by customer name.
     *
     * @param billingAccountName Billing Account Id.
     * @param customerName Customer Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingSubscriptionSummary> listByCustomerNameAsync(final String billingAccountName, final String customerName);

    /**
     * Get a single billing subscription by name.
     *
     * @param billingAccountName Billing Account Id.
     * @param customerName Customer Id.
     * @param billingSubscriptionName Billing Subscription Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingSubscriptionSummary> getByCustomerNameAsync(String billingAccountName, String customerName, String billingSubscriptionName);

    /**
     * Lists billing subscription by invoice section name.
     *
     * @param billingAccountName Billing Account Id.
     * @param invoiceSectionName InvoiceSection Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingSubscriptionSummary> listByInvoiceSectionNameAsync(final String billingAccountName, final String invoiceSectionName);

    /**
     * Get a single billing subscription by name.
     *
     * @param billingAccountName Billing Account Id.
     * @param invoiceSectionName InvoiceSection Id.
     * @param billingSubscriptionName Billing Subscription Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingSubscriptionSummary> getAsync(String billingAccountName, String invoiceSectionName, String billingSubscriptionName);

    /**
     * Transfers the subscription from one invoice section to another within a billing account.
     *
     * @param billingAccountName Billing Account Id.
     * @param invoiceSectionName InvoiceSection Id.
     * @param billingSubscriptionName Billing Subscription Id.
     * @param parameters Parameters supplied to the Transfer Billing Subscription operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<TransferBillingSubscriptionResult> transferAsync(String billingAccountName, String invoiceSectionName, String billingSubscriptionName, TransferBillingSubscriptionRequestProperties parameters);

    /**
     * Validates the transfer of billing subscriptions across invoice sections.
     *
     * @param billingAccountName Billing Account Id.
     * @param invoiceSectionName InvoiceSection Id.
     * @param billingSubscriptionName Billing Subscription Id.
     * @param parameters Parameters supplied to the Transfer Billing Subscription operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ValidateSubscriptionTransferEligibilityResult> validateTransferAsync(String billingAccountName, String invoiceSectionName, String billingSubscriptionName, TransferBillingSubscriptionRequestProperties parameters);

    /**
     * Lists billing subscriptions by billing account name.
     *
     * @param billingAccountName Billing Account Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingSubscriptionSummary> listByBillingAccountNameAsync(final String billingAccountName);

}
