/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview.implementation;

import com.microsoft.azure.management.billing.v2018_11_01_preview.TransactionTypeKind;
import org.joda.time.DateTime;
import com.microsoft.azure.management.billing.v2018_11_01_preview.ReservationType;
import com.microsoft.azure.management.billing.v2018_11_01_preview.Amount;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * A reservation transaction summary resource.
 */
@JsonFlatten
public class TransactionsSummaryInner extends ProxyResource {
    /**
     * The kind of transaction. Choices are all and reservation. Possible
     * values include: 'all', 'reservation'.
     */
    @JsonProperty(value = "properties.kind")
    private TransactionTypeKind kind;

    /**
     * The date of reservation transaction.
     */
    @JsonProperty(value = "properties.date", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime dateProperty;

    /**
     * Invoice number or 'pending' if not invoiced.
     */
    @JsonProperty(value = "properties.invoice", access = JsonProperty.Access.WRITE_ONLY)
    private String invoice;

    /**
     * The reservation order id.
     */
    @JsonProperty(value = "properties.orderId", access = JsonProperty.Access.WRITE_ONLY)
    private String orderId;

    /**
     * The reservation order name.
     */
    @JsonProperty(value = "properties.orderName", access = JsonProperty.Access.WRITE_ONLY)
    private String orderName;

    /**
     * The product type id.
     */
    @JsonProperty(value = "properties.productTypeId", access = JsonProperty.Access.WRITE_ONLY)
    private String productTypeId;

    /**
     * The type of product.
     */
    @JsonProperty(value = "properties.productType", access = JsonProperty.Access.WRITE_ONLY)
    private String productType;

    /**
     * Product description.
     */
    @JsonProperty(value = "properties.productDescription", access = JsonProperty.Access.WRITE_ONLY)
    private String productDescription;

    /**
     * Transaction types. Possible values include: 'Purchase', 'Usage Charge'.
     */
    @JsonProperty(value = "properties.transactionType")
    private ReservationType transactionType;

    /**
     * Last charge associated with the purchase.
     */
    @JsonProperty(value = "properties.transactionAmount", access = JsonProperty.Access.WRITE_ONLY)
    private Amount transactionAmount;

    /**
     * Purchase quantity.
     */
    @JsonProperty(value = "properties.quantity", access = JsonProperty.Access.WRITE_ONLY)
    private Integer quantity;

    /**
     * Invoice section id to which this product belongs.
     */
    @JsonProperty(value = "properties.invoiceSectionId", access = JsonProperty.Access.WRITE_ONLY)
    private String invoiceSectionId;

    /**
     * Invoice section name to which this product belongs.
     */
    @JsonProperty(value = "properties.invoiceSectionName", access = JsonProperty.Access.WRITE_ONLY)
    private String invoiceSectionName;

    /**
     * Billing Profile id to which this product belongs.
     */
    @JsonProperty(value = "properties.billingProfileId", access = JsonProperty.Access.WRITE_ONLY)
    private String billingProfileId;

    /**
     * Billing Profile name to which this product belongs.
     */
    @JsonProperty(value = "properties.billingProfileName", access = JsonProperty.Access.WRITE_ONLY)
    private String billingProfileName;

    /**
     * The subscription id.
     */
    @JsonProperty(value = "properties.subscriptionId", access = JsonProperty.Access.WRITE_ONLY)
    private String subscriptionId;

    /**
     * The subscription name.
     */
    @JsonProperty(value = "properties.subscriptionName", access = JsonProperty.Access.WRITE_ONLY)
    private String subscriptionName;

    /**
     * Get the kind of transaction. Choices are all and reservation. Possible values include: 'all', 'reservation'.
     *
     * @return the kind value
     */
    public TransactionTypeKind kind() {
        return this.kind;
    }

    /**
     * Set the kind of transaction. Choices are all and reservation. Possible values include: 'all', 'reservation'.
     *
     * @param kind the kind value to set
     * @return the TransactionsSummaryInner object itself.
     */
    public TransactionsSummaryInner withKind(TransactionTypeKind kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the date of reservation transaction.
     *
     * @return the dateProperty value
     */
    public DateTime dateProperty() {
        return this.dateProperty;
    }

    /**
     * Get invoice number or 'pending' if not invoiced.
     *
     * @return the invoice value
     */
    public String invoice() {
        return this.invoice;
    }

    /**
     * Get the reservation order id.
     *
     * @return the orderId value
     */
    public String orderId() {
        return this.orderId;
    }

    /**
     * Get the reservation order name.
     *
     * @return the orderName value
     */
    public String orderName() {
        return this.orderName;
    }

    /**
     * Get the product type id.
     *
     * @return the productTypeId value
     */
    public String productTypeId() {
        return this.productTypeId;
    }

    /**
     * Get the type of product.
     *
     * @return the productType value
     */
    public String productType() {
        return this.productType;
    }

    /**
     * Get product description.
     *
     * @return the productDescription value
     */
    public String productDescription() {
        return this.productDescription;
    }

    /**
     * Get transaction types. Possible values include: 'Purchase', 'Usage Charge'.
     *
     * @return the transactionType value
     */
    public ReservationType transactionType() {
        return this.transactionType;
    }

    /**
     * Set transaction types. Possible values include: 'Purchase', 'Usage Charge'.
     *
     * @param transactionType the transactionType value to set
     * @return the TransactionsSummaryInner object itself.
     */
    public TransactionsSummaryInner withTransactionType(ReservationType transactionType) {
        this.transactionType = transactionType;
        return this;
    }

    /**
     * Get last charge associated with the purchase.
     *
     * @return the transactionAmount value
     */
    public Amount transactionAmount() {
        return this.transactionAmount;
    }

    /**
     * Get purchase quantity.
     *
     * @return the quantity value
     */
    public Integer quantity() {
        return this.quantity;
    }

    /**
     * Get invoice section id to which this product belongs.
     *
     * @return the invoiceSectionId value
     */
    public String invoiceSectionId() {
        return this.invoiceSectionId;
    }

    /**
     * Get invoice section name to which this product belongs.
     *
     * @return the invoiceSectionName value
     */
    public String invoiceSectionName() {
        return this.invoiceSectionName;
    }

    /**
     * Get billing Profile id to which this product belongs.
     *
     * @return the billingProfileId value
     */
    public String billingProfileId() {
        return this.billingProfileId;
    }

    /**
     * Get billing Profile name to which this product belongs.
     *
     * @return the billingProfileName value
     */
    public String billingProfileName() {
        return this.billingProfileName;
    }

    /**
     * Get the subscription id.
     *
     * @return the subscriptionId value
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Get the subscription name.
     *
     * @return the subscriptionName value
     */
    public String subscriptionName() {
        return this.subscriptionName;
    }

}
