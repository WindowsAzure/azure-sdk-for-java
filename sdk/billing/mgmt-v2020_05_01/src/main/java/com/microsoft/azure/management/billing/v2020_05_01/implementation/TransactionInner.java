/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2020_05_01.implementation;

import com.microsoft.azure.management.billing.v2020_05_01.TransactionTypeKind;
import org.joda.time.DateTime;
import com.microsoft.azure.management.billing.v2020_05_01.ReservationType;
import com.microsoft.azure.management.billing.v2020_05_01.Amount;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * A transaction.
 */
@JsonFlatten
public class TransactionInner extends ProxyResource {
    /**
     * The kind of transaction. Options are all or reservation. Possible values
     * include: 'all', 'reservation'.
     */
    @JsonProperty(value = "properties.kind")
    private TransactionTypeKind kind;

    /**
     * The date of transaction.
     */
    @JsonProperty(value = "properties.date", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime dateProperty;

    /**
     * Invoice on which the transaction was billed or 'pending' if the
     * transaction is not billed.
     */
    @JsonProperty(value = "properties.invoice", access = JsonProperty.Access.WRITE_ONLY)
    private String invoice;

    /**
     * The ID of the invoice on which the transaction was billed. This field is
     * only applicable for transactions which are billed.
     */
    @JsonProperty(value = "properties.invoiceId", access = JsonProperty.Access.WRITE_ONLY)
    private String invoiceId;

    /**
     * The order ID of the reservation. The field is only applicable for
     * transaction of kind reservation.
     */
    @JsonProperty(value = "properties.orderId", access = JsonProperty.Access.WRITE_ONLY)
    private String orderId;

    /**
     * The name of the reservation order. The field is only applicable for
     * transactions of kind reservation.
     */
    @JsonProperty(value = "properties.orderName", access = JsonProperty.Access.WRITE_ONLY)
    private String orderName;

    /**
     * The family of the product for which the transaction took place.
     */
    @JsonProperty(value = "properties.productFamily", access = JsonProperty.Access.WRITE_ONLY)
    private String productFamily;

    /**
     * The ID of the product type for which the transaction took place.
     */
    @JsonProperty(value = "properties.productTypeId", access = JsonProperty.Access.WRITE_ONLY)
    private String productTypeId;

    /**
     * The type of the product for which the transaction took place.
     */
    @JsonProperty(value = "properties.productType", access = JsonProperty.Access.WRITE_ONLY)
    private String productType;

    /**
     * The description of the product for which the transaction took place.
     */
    @JsonProperty(value = "properties.productDescription", access = JsonProperty.Access.WRITE_ONLY)
    private String productDescription;

    /**
     * The type of transaction. Possible values include: 'Purchase', 'Usage
     * Charge'.
     */
    @JsonProperty(value = "properties.transactionType")
    private ReservationType transactionType;

    /**
     * The charge associated with the transaction.
     */
    @JsonProperty(value = "properties.transactionAmount", access = JsonProperty.Access.WRITE_ONLY)
    private Amount transactionAmount;

    /**
     * The quantity purchased in the transaction.
     */
    @JsonProperty(value = "properties.quantity", access = JsonProperty.Access.WRITE_ONLY)
    private Integer quantity;

    /**
     * The ID of the invoice section which will be billed for the transaction.
     */
    @JsonProperty(value = "properties.invoiceSectionId", access = JsonProperty.Access.WRITE_ONLY)
    private String invoiceSectionId;

    /**
     * The name of the invoice section which will be billed for the
     * transaction.
     */
    @JsonProperty(value = "properties.invoiceSectionDisplayName", access = JsonProperty.Access.WRITE_ONLY)
    private String invoiceSectionDisplayName;

    /**
     * The ID of the billing profile which will be billed for the transaction.
     */
    @JsonProperty(value = "properties.billingProfileId", access = JsonProperty.Access.WRITE_ONLY)
    private String billingProfileId;

    /**
     * The name of the billing profile which will be billed for the
     * transaction.
     */
    @JsonProperty(value = "properties.billingProfileDisplayName", access = JsonProperty.Access.WRITE_ONLY)
    private String billingProfileDisplayName;

    /**
     * The ID of the customer for which the transaction took place. The field
     * is applicable only for Microsoft Partner Agreement billing account.
     */
    @JsonProperty(value = "properties.customerId", access = JsonProperty.Access.WRITE_ONLY)
    private String customerId;

    /**
     * The name of the customer for which the transaction took place. The field
     * is applicable only for Microsoft Partner Agreement billing account.
     */
    @JsonProperty(value = "properties.customerDisplayName", access = JsonProperty.Access.WRITE_ONLY)
    private String customerDisplayName;

    /**
     * The ID of the subscription that was used for the transaction. The field
     * is only applicable for transaction of kind reservation.
     */
    @JsonProperty(value = "properties.subscriptionId", access = JsonProperty.Access.WRITE_ONLY)
    private String subscriptionId;

    /**
     * The name of the subscription that was used for the transaction. The
     * field is only applicable for transaction of kind reservation.
     */
    @JsonProperty(value = "properties.subscriptionName", access = JsonProperty.Access.WRITE_ONLY)
    private String subscriptionName;

    /**
     * The type of azure plan of the subscription that was used for the
     * transaction.
     */
    @JsonProperty(value = "properties.azurePlan", access = JsonProperty.Access.WRITE_ONLY)
    private String azurePlan;

    /**
     * The amount of any Azure credits automatically applied to this
     * transaction.
     */
    @JsonProperty(value = "properties.azureCreditApplied", access = JsonProperty.Access.WRITE_ONLY)
    private Amount azureCreditApplied;

    /**
     * The ISO 4217 code for the currency in which this transaction is billed.
     */
    @JsonProperty(value = "properties.billingCurrency", access = JsonProperty.Access.WRITE_ONLY)
    private String billingCurrency;

    /**
     * The percentage discount, if any, applied to this transaction.
     */
    @JsonProperty(value = "properties.discount", access = JsonProperty.Access.WRITE_ONLY)
    private Double discount;

    /**
     * The price of the product after applying any discounts.
     */
    @JsonProperty(value = "properties.effectivePrice", access = JsonProperty.Access.WRITE_ONLY)
    private Amount effectivePrice;

    /**
     * The exchange rate used to convert charged amount to billing currency, if
     * applicable.
     */
    @JsonProperty(value = "properties.exchangeRate", access = JsonProperty.Access.WRITE_ONLY)
    private Double exchangeRate;

    /**
     * The retail price of the product.
     */
    @JsonProperty(value = "properties.marketPrice", access = JsonProperty.Access.WRITE_ONLY)
    private Amount marketPrice;

    /**
     * The ISO 4217 code for the currency in which the product is priced.
     */
    @JsonProperty(value = "properties.pricingCurrency", access = JsonProperty.Access.WRITE_ONLY)
    private String pricingCurrency;

    /**
     * The date of the purchase of the product, or the start date of the month
     * in which usage started.
     */
    @JsonProperty(value = "properties.servicePeriodStartDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime servicePeriodStartDate;

    /**
     * The end date of the product term, or the end date of the month in which
     * usage ended.
     */
    @JsonProperty(value = "properties.servicePeriodEndDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime servicePeriodEndDate;

    /**
     * The pre-tax charged amount for the transaction.
     */
    @JsonProperty(value = "properties.subTotal", access = JsonProperty.Access.WRITE_ONLY)
    private Amount subTotal;

    /**
     * The tax amount applied to the transaction.
     */
    @JsonProperty(value = "properties.tax", access = JsonProperty.Access.WRITE_ONLY)
    private Amount tax;

    /**
     * The unit of measure used to bill for the product. For example, compute
     * services are billed per hour.
     */
    @JsonProperty(value = "properties.unitOfMeasure", access = JsonProperty.Access.WRITE_ONLY)
    private String unitOfMeasure;

    /**
     * The number of units used for a given product.
     */
    @JsonProperty(value = "properties.units", access = JsonProperty.Access.WRITE_ONLY)
    private Double units;

    /**
     * The description for the unit of measure for a given product.
     */
    @JsonProperty(value = "properties.unitType", access = JsonProperty.Access.WRITE_ONLY)
    private String unitType;

    /**
     * Get the kind of transaction. Options are all or reservation. Possible values include: 'all', 'reservation'.
     *
     * @return the kind value
     */
    public TransactionTypeKind kind() {
        return this.kind;
    }

    /**
     * Set the kind of transaction. Options are all or reservation. Possible values include: 'all', 'reservation'.
     *
     * @param kind the kind value to set
     * @return the TransactionInner object itself.
     */
    public TransactionInner withKind(TransactionTypeKind kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the date of transaction.
     *
     * @return the dateProperty value
     */
    public DateTime dateProperty() {
        return this.dateProperty;
    }

    /**
     * Get invoice on which the transaction was billed or 'pending' if the transaction is not billed.
     *
     * @return the invoice value
     */
    public String invoice() {
        return this.invoice;
    }

    /**
     * Get the ID of the invoice on which the transaction was billed. This field is only applicable for transactions which are billed.
     *
     * @return the invoiceId value
     */
    public String invoiceId() {
        return this.invoiceId;
    }

    /**
     * Get the order ID of the reservation. The field is only applicable for transaction of kind reservation.
     *
     * @return the orderId value
     */
    public String orderId() {
        return this.orderId;
    }

    /**
     * Get the name of the reservation order. The field is only applicable for transactions of kind reservation.
     *
     * @return the orderName value
     */
    public String orderName() {
        return this.orderName;
    }

    /**
     * Get the family of the product for which the transaction took place.
     *
     * @return the productFamily value
     */
    public String productFamily() {
        return this.productFamily;
    }

    /**
     * Get the ID of the product type for which the transaction took place.
     *
     * @return the productTypeId value
     */
    public String productTypeId() {
        return this.productTypeId;
    }

    /**
     * Get the type of the product for which the transaction took place.
     *
     * @return the productType value
     */
    public String productType() {
        return this.productType;
    }

    /**
     * Get the description of the product for which the transaction took place.
     *
     * @return the productDescription value
     */
    public String productDescription() {
        return this.productDescription;
    }

    /**
     * Get the type of transaction. Possible values include: 'Purchase', 'Usage Charge'.
     *
     * @return the transactionType value
     */
    public ReservationType transactionType() {
        return this.transactionType;
    }

    /**
     * Set the type of transaction. Possible values include: 'Purchase', 'Usage Charge'.
     *
     * @param transactionType the transactionType value to set
     * @return the TransactionInner object itself.
     */
    public TransactionInner withTransactionType(ReservationType transactionType) {
        this.transactionType = transactionType;
        return this;
    }

    /**
     * Get the charge associated with the transaction.
     *
     * @return the transactionAmount value
     */
    public Amount transactionAmount() {
        return this.transactionAmount;
    }

    /**
     * Get the quantity purchased in the transaction.
     *
     * @return the quantity value
     */
    public Integer quantity() {
        return this.quantity;
    }

    /**
     * Get the ID of the invoice section which will be billed for the transaction.
     *
     * @return the invoiceSectionId value
     */
    public String invoiceSectionId() {
        return this.invoiceSectionId;
    }

    /**
     * Get the name of the invoice section which will be billed for the transaction.
     *
     * @return the invoiceSectionDisplayName value
     */
    public String invoiceSectionDisplayName() {
        return this.invoiceSectionDisplayName;
    }

    /**
     * Get the ID of the billing profile which will be billed for the transaction.
     *
     * @return the billingProfileId value
     */
    public String billingProfileId() {
        return this.billingProfileId;
    }

    /**
     * Get the name of the billing profile which will be billed for the transaction.
     *
     * @return the billingProfileDisplayName value
     */
    public String billingProfileDisplayName() {
        return this.billingProfileDisplayName;
    }

    /**
     * Get the ID of the customer for which the transaction took place. The field is applicable only for Microsoft Partner Agreement billing account.
     *
     * @return the customerId value
     */
    public String customerId() {
        return this.customerId;
    }

    /**
     * Get the name of the customer for which the transaction took place. The field is applicable only for Microsoft Partner Agreement billing account.
     *
     * @return the customerDisplayName value
     */
    public String customerDisplayName() {
        return this.customerDisplayName;
    }

    /**
     * Get the ID of the subscription that was used for the transaction. The field is only applicable for transaction of kind reservation.
     *
     * @return the subscriptionId value
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Get the name of the subscription that was used for the transaction. The field is only applicable for transaction of kind reservation.
     *
     * @return the subscriptionName value
     */
    public String subscriptionName() {
        return this.subscriptionName;
    }

    /**
     * Get the type of azure plan of the subscription that was used for the transaction.
     *
     * @return the azurePlan value
     */
    public String azurePlan() {
        return this.azurePlan;
    }

    /**
     * Get the amount of any Azure credits automatically applied to this transaction.
     *
     * @return the azureCreditApplied value
     */
    public Amount azureCreditApplied() {
        return this.azureCreditApplied;
    }

    /**
     * Get the ISO 4217 code for the currency in which this transaction is billed.
     *
     * @return the billingCurrency value
     */
    public String billingCurrency() {
        return this.billingCurrency;
    }

    /**
     * Get the percentage discount, if any, applied to this transaction.
     *
     * @return the discount value
     */
    public Double discount() {
        return this.discount;
    }

    /**
     * Get the price of the product after applying any discounts.
     *
     * @return the effectivePrice value
     */
    public Amount effectivePrice() {
        return this.effectivePrice;
    }

    /**
     * Get the exchange rate used to convert charged amount to billing currency, if applicable.
     *
     * @return the exchangeRate value
     */
    public Double exchangeRate() {
        return this.exchangeRate;
    }

    /**
     * Get the retail price of the product.
     *
     * @return the marketPrice value
     */
    public Amount marketPrice() {
        return this.marketPrice;
    }

    /**
     * Get the ISO 4217 code for the currency in which the product is priced.
     *
     * @return the pricingCurrency value
     */
    public String pricingCurrency() {
        return this.pricingCurrency;
    }

    /**
     * Get the date of the purchase of the product, or the start date of the month in which usage started.
     *
     * @return the servicePeriodStartDate value
     */
    public DateTime servicePeriodStartDate() {
        return this.servicePeriodStartDate;
    }

    /**
     * Get the end date of the product term, or the end date of the month in which usage ended.
     *
     * @return the servicePeriodEndDate value
     */
    public DateTime servicePeriodEndDate() {
        return this.servicePeriodEndDate;
    }

    /**
     * Get the pre-tax charged amount for the transaction.
     *
     * @return the subTotal value
     */
    public Amount subTotal() {
        return this.subTotal;
    }

    /**
     * Get the tax amount applied to the transaction.
     *
     * @return the tax value
     */
    public Amount tax() {
        return this.tax;
    }

    /**
     * Get the unit of measure used to bill for the product. For example, compute services are billed per hour.
     *
     * @return the unitOfMeasure value
     */
    public String unitOfMeasure() {
        return this.unitOfMeasure;
    }

    /**
     * Get the number of units used for a given product.
     *
     * @return the units value
     */
    public Double units() {
        return this.units;
    }

    /**
     * Get the description for the unit of measure for a given product.
     *
     * @return the unitType value
     */
    public String unitType() {
        return this.unitType;
    }

}
