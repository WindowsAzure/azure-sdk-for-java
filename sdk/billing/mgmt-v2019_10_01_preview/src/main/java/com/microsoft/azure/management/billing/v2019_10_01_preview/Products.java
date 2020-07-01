/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview;

import rx.Observable;
import com.microsoft.azure.management.billing.v2019_10_01_preview.implementation.ProductsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Products.
 */
public interface Products extends HasInner<ProductsInner> {
    /**
     * Lists the products for a customer. These don't include products billed based on usage.The operation is supported only for billing accounts with agreement type Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param customerName The ID that uniquely identifies a customer.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ProductsListResult> listByCustomerAsync(String billingAccountName, String customerName);

    /**
     * Lists the products for a billing account. These don't include products billed based on usage. The operation is supported for billing accounts with agreement type Microsoft Customer Agreement or Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Product> listByBillingAccountAsync(final String billingAccountName);

    /**
     * Lists the products for an invoice section. These don't include products billed based on usage. The operation is supported only for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ProductsListResult> listByInvoiceSectionAsync(String billingAccountName, String billingProfileName, String invoiceSectionName);

    /**
     * Gets a product by ID. The operation is supported only for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @param productName The ID that uniquely identifies a product.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Product> getAsync(String billingAccountName, String billingProfileName, String invoiceSectionName, String productName);

    /**
     * Moves a product's charges to a new invoice section. The new invoice section must belong to the same billing profile as the existing invoice section. This operation is supported only for products that are purchased with a recurring charge and for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @param productName The ID that uniquely identifies a product.
     * @param parameters Request parameters that are provided to the transfer product operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Product> transferAsync(String billingAccountName, String billingProfileName, String invoiceSectionName, String productName, TransferProductRequestProperties parameters);

    /**
     * Validates if a product's charges can be moved to a new invoice section. This operation is supported only for products that are purchased with a recurring charge and for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @param productName The ID that uniquely identifies a product.
     * @param parameters Request parameters that are provided to the validate transfer eligibility operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ValidateProductTransferEligibilityResult> validateTransferAsync(String billingAccountName, String billingProfileName, String invoiceSectionName, String productName, TransferProductRequestProperties parameters);

    /**
     * Cancel auto renew for product by product id and invoice section name.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @param productName The ID that uniquely identifies a product.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<UpdateAutoRenewOperation> updateAutoRenewByInvoiceSectionAsync(String billingAccountName, String billingProfileName, String invoiceSectionName, String productName);

    /**
     * Gets a product by ID. The operation is supported only for billing accounts with agreement type Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param customerName The ID that uniquely identifies a customer.
     * @param productName The ID that uniquely identifies a product.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Product> getByCustomerAsync(String billingAccountName, String customerName, String productName);

}
