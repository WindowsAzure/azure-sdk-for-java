// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.billing.fluent.models.ProductInner;

/** Resource collection API of Products. */
public interface Products {
    /**
     * Lists the products for a customer. These don't include products billed based on usage.The operation is supported
     * only for billing accounts with agreement type Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param customerName The ID that uniquely identifies a customer.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of products.
     */
    PagedIterable<Product> listByCustomer(String billingAccountName, String customerName);

    /**
     * Lists the products for a customer. These don't include products billed based on usage.The operation is supported
     * only for billing accounts with agreement type Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param customerName The ID that uniquely identifies a customer.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of products.
     */
    PagedIterable<Product> listByCustomer(String billingAccountName, String customerName, Context context);

    /**
     * Lists the products for a billing account. These don't include products billed based on usage. The operation is
     * supported for billing accounts with agreement type Microsoft Customer Agreement or Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of products.
     */
    PagedIterable<Product> listByBillingAccount(String billingAccountName);

    /**
     * Lists the products for a billing account. These don't include products billed based on usage. The operation is
     * supported for billing accounts with agreement type Microsoft Customer Agreement or Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param filter May be used to filter by product type. The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'.
     *     It does not currently support 'ne', 'or', or 'not'. Tag filter is a key value pair string where key and value
     *     are separated by a colon (:).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of products.
     */
    PagedIterable<Product> listByBillingAccount(String billingAccountName, String filter, Context context);

    /**
     * Lists the products for a billing profile. These don't include products billed based on usage. The operation is
     * supported for billing accounts with agreement type Microsoft Customer Agreement or Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of products.
     */
    PagedIterable<Product> listByBillingProfile(String billingAccountName, String billingProfileName);

    /**
     * Lists the products for a billing profile. These don't include products billed based on usage. The operation is
     * supported for billing accounts with agreement type Microsoft Customer Agreement or Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param filter May be used to filter by product type. The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'.
     *     It does not currently support 'ne', 'or', or 'not'. Tag filter is a key value pair string where key and value
     *     are separated by a colon (:).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of products.
     */
    PagedIterable<Product> listByBillingProfile(
        String billingAccountName, String billingProfileName, String filter, Context context);

    /**
     * Lists the products for an invoice section. These don't include products billed based on usage. The operation is
     * supported only for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of products.
     */
    PagedIterable<Product> listByInvoiceSection(
        String billingAccountName, String billingProfileName, String invoiceSectionName);

    /**
     * Lists the products for an invoice section. These don't include products billed based on usage. The operation is
     * supported only for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @param filter May be used to filter by product type. The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'.
     *     It does not currently support 'ne', 'or', or 'not'. Tag filter is a key value pair string where key and value
     *     are separated by a colon (:).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of products.
     */
    PagedIterable<Product> listByInvoiceSection(
        String billingAccountName,
        String billingProfileName,
        String invoiceSectionName,
        String filter,
        Context context);

    /**
     * Gets a product by ID. The operation is supported only for billing accounts with agreement type Microsoft Customer
     * Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param productName The ID that uniquely identifies a product.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a product by ID.
     */
    Product get(String billingAccountName, String productName);

    /**
     * Gets a product by ID. The operation is supported only for billing accounts with agreement type Microsoft Customer
     * Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param productName The ID that uniquely identifies a product.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a product by ID.
     */
    Response<Product> getWithResponse(String billingAccountName, String productName, Context context);

    /**
     * Updates the properties of a Product. Currently, auto renew can be updated. The operation is supported only for
     * billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param productName The ID that uniquely identifies a product.
     * @param parameters Request parameters that are provided to the update product operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a product.
     */
    Product update(String billingAccountName, String productName, ProductInner parameters);

    /**
     * Updates the properties of a Product. Currently, auto renew can be updated. The operation is supported only for
     * billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param productName The ID that uniquely identifies a product.
     * @param parameters Request parameters that are provided to the update product operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a product.
     */
    Response<Product> updateWithResponse(
        String billingAccountName, String productName, ProductInner parameters, Context context);

    /**
     * Moves a product's charges to a new invoice section. The new invoice section must belong to the same billing
     * profile as the existing invoice section. This operation is supported only for products that are purchased with a
     * recurring charge and for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param productName The ID that uniquely identifies a product.
     * @param parameters Request parameters that are provided to the move product operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a product.
     */
    Product move(String billingAccountName, String productName, TransferProductRequestProperties parameters);

    /**
     * Moves a product's charges to a new invoice section. The new invoice section must belong to the same billing
     * profile as the existing invoice section. This operation is supported only for products that are purchased with a
     * recurring charge and for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param productName The ID that uniquely identifies a product.
     * @param parameters Request parameters that are provided to the move product operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a product.
     */
    Response<Product> moveWithResponse(
        String billingAccountName, String productName, TransferProductRequestProperties parameters, Context context);

    /**
     * Validates if a product's charges can be moved to a new invoice section. This operation is supported only for
     * products that are purchased with a recurring charge and for billing accounts with agreement type Microsoft
     * Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param productName The ID that uniquely identifies a product.
     * @param parameters Request parameters that are provided to the validate move eligibility operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the product transfer eligibility validation.
     */
    ValidateProductTransferEligibilityResult validateMove(
        String billingAccountName, String productName, TransferProductRequestProperties parameters);

    /**
     * Validates if a product's charges can be moved to a new invoice section. This operation is supported only for
     * products that are purchased with a recurring charge and for billing accounts with agreement type Microsoft
     * Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param productName The ID that uniquely identifies a product.
     * @param parameters Request parameters that are provided to the validate move eligibility operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the product transfer eligibility validation.
     */
    Response<ValidateProductTransferEligibilityResult> validateMoveWithResponse(
        String billingAccountName, String productName, TransferProductRequestProperties parameters, Context context);
}
