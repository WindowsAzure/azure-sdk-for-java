/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview;

import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.billing.v2019_10_01_preview.implementation.PartnerTransfersInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing PartnerTransfers.
 */
public interface PartnerTransfers extends HasInner<PartnerTransfersInner> {
    /**
     * Gets a transfer request by ID. The operation is supported only for billing accounts with agreement type Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param customerName The ID that uniquely identifies a customer.
     * @param transferName The ID that uniquely identifies a transfer request.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CustomerBillingProfileBillingAccountTransferDetails> getAsync(String billingAccountName, String billingProfileName, String customerName, String transferName);

    /**
     * Lists the transfer requests sent to a customer. The operation is supported only for billing accounts with agreement type Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param customerName The ID that uniquely identifies a customer.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CustomerBillingProfileBillingAccountTransferDetails> listAsync(final String billingAccountName, final String billingProfileName, final String customerName);

    /**
     * Cancels a transfer request. The operation is supported only for billing accounts with agreement type Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param customerName The ID that uniquely identifies a customer.
     * @param transferName The ID that uniquely identifies a transfer request.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable cancelAsync(String billingAccountName, String billingProfileName, String customerName, String transferName);

    /**
     * Sends a request to a user in a customer's billing account to transfer billing ownership of their subscriptions. The operation is supported only for billing accounts with agreement type Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param customerName The ID that uniquely identifies a customer.
     * @param parameters Request parameters that are provided to the initiate transfer operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<InvoiceSectionBillingProfileBillingAccountTransferDetails> initiateAsync(String billingAccountName, String billingProfileName, String customerName, InitiateTransferRequest parameters);

}
