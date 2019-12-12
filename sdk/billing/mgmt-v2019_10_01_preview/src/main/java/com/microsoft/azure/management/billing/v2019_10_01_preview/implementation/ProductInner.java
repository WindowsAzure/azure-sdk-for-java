/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview.implementation;

import org.joda.time.DateTime;
import com.microsoft.azure.management.billing.v2019_10_01_preview.ProductStatusType;
import com.microsoft.azure.management.billing.v2019_10_01_preview.BillingFrequency;
import com.microsoft.azure.management.billing.v2019_10_01_preview.Amount;
import com.microsoft.azure.management.billing.v2019_10_01_preview.Reseller;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * A product resource.
 */
@JsonFlatten
public class ProductInner extends ProxyResource {
    /**
     * The display name of the product.
     */
    @JsonProperty(value = "properties.displayName", access = JsonProperty.Access.WRITE_ONLY)
    private String displayName;

    /**
     * The date of purchase.
     */
    @JsonProperty(value = "properties.purchaseDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime purchaseDate;

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
     * Product status. Possible values include: 'Active', 'Inactive',
     * 'PastDue', 'Expiring', 'Expired', 'Disabled', 'Cancelled', 'AutoRenew'.
     */
    @JsonProperty(value = "properties.status")
    private ProductStatusType status;

    /**
     * end date.
     */
    @JsonProperty(value = "properties.endDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime endDate;

    /**
     * Billing frequency. Possible values include: 'OneTime', 'Monthly',
     * 'UsageBased'.
     */
    @JsonProperty(value = "properties.billingFrequency")
    private BillingFrequency billingFrequency;

    /**
     * Last month charges.
     */
    @JsonProperty(value = "properties.lastCharge", access = JsonProperty.Access.WRITE_ONLY)
    private Amount lastCharge;

    /**
     * The date of the last charge.
     */
    @JsonProperty(value = "properties.lastChargeDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastChargeDate;

    /**
     * The purchased product quantity.
     */
    @JsonProperty(value = "properties.quantity", access = JsonProperty.Access.WRITE_ONLY)
    private Double quantity;

    /**
     * Sku Id.
     */
    @JsonProperty(value = "properties.skuId", access = JsonProperty.Access.WRITE_ONLY)
    private String skuId;

    /**
     * Sku description.
     */
    @JsonProperty(value = "properties.skuDescription", access = JsonProperty.Access.WRITE_ONLY)
    private String skuDescription;

    /**
     * Availability Id.
     */
    @JsonProperty(value = "properties.availabilityId", access = JsonProperty.Access.WRITE_ONLY)
    private String availabilityId;

    /**
     * Parent Product Id.
     */
    @JsonProperty(value = "properties.parentProductId", access = JsonProperty.Access.WRITE_ONLY)
    private String parentProductId;

    /**
     * Invoice section id to which this product belongs.
     */
    @JsonProperty(value = "properties.invoiceSectionId", access = JsonProperty.Access.WRITE_ONLY)
    private String invoiceSectionId;

    /**
     * Invoice section display name to which this product belongs.
     */
    @JsonProperty(value = "properties.invoiceSectionDisplayName", access = JsonProperty.Access.WRITE_ONLY)
    private String invoiceSectionDisplayName;

    /**
     * Billing Profile id to which this product belongs.
     */
    @JsonProperty(value = "properties.billingProfileId", access = JsonProperty.Access.WRITE_ONLY)
    private String billingProfileId;

    /**
     * Billing Profile display name to which this product belongs.
     */
    @JsonProperty(value = "properties.billingProfileDisplayName", access = JsonProperty.Access.WRITE_ONLY)
    private String billingProfileDisplayName;

    /**
     * Customer id to which this product belongs.
     */
    @JsonProperty(value = "properties.customerId", access = JsonProperty.Access.WRITE_ONLY)
    private String customerId;

    /**
     * Display name of customer to which this product belongs.
     */
    @JsonProperty(value = "properties.customerDisplayName", access = JsonProperty.Access.WRITE_ONLY)
    private String customerDisplayName;

    /**
     * Reseller for this product.
     */
    @JsonProperty(value = "properties.reseller", access = JsonProperty.Access.WRITE_ONLY)
    private Reseller reseller;

    /**
     * Get the display name of the product.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Get the date of purchase.
     *
     * @return the purchaseDate value
     */
    public DateTime purchaseDate() {
        return this.purchaseDate;
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
     * Get product status. Possible values include: 'Active', 'Inactive', 'PastDue', 'Expiring', 'Expired', 'Disabled', 'Cancelled', 'AutoRenew'.
     *
     * @return the status value
     */
    public ProductStatusType status() {
        return this.status;
    }

    /**
     * Set product status. Possible values include: 'Active', 'Inactive', 'PastDue', 'Expiring', 'Expired', 'Disabled', 'Cancelled', 'AutoRenew'.
     *
     * @param status the status value to set
     * @return the ProductInner object itself.
     */
    public ProductInner withStatus(ProductStatusType status) {
        this.status = status;
        return this;
    }

    /**
     * Get end date.
     *
     * @return the endDate value
     */
    public DateTime endDate() {
        return this.endDate;
    }

    /**
     * Get billing frequency. Possible values include: 'OneTime', 'Monthly', 'UsageBased'.
     *
     * @return the billingFrequency value
     */
    public BillingFrequency billingFrequency() {
        return this.billingFrequency;
    }

    /**
     * Set billing frequency. Possible values include: 'OneTime', 'Monthly', 'UsageBased'.
     *
     * @param billingFrequency the billingFrequency value to set
     * @return the ProductInner object itself.
     */
    public ProductInner withBillingFrequency(BillingFrequency billingFrequency) {
        this.billingFrequency = billingFrequency;
        return this;
    }

    /**
     * Get last month charges.
     *
     * @return the lastCharge value
     */
    public Amount lastCharge() {
        return this.lastCharge;
    }

    /**
     * Get the date of the last charge.
     *
     * @return the lastChargeDate value
     */
    public DateTime lastChargeDate() {
        return this.lastChargeDate;
    }

    /**
     * Get the purchased product quantity.
     *
     * @return the quantity value
     */
    public Double quantity() {
        return this.quantity;
    }

    /**
     * Get sku Id.
     *
     * @return the skuId value
     */
    public String skuId() {
        return this.skuId;
    }

    /**
     * Get sku description.
     *
     * @return the skuDescription value
     */
    public String skuDescription() {
        return this.skuDescription;
    }

    /**
     * Get availability Id.
     *
     * @return the availabilityId value
     */
    public String availabilityId() {
        return this.availabilityId;
    }

    /**
     * Get parent Product Id.
     *
     * @return the parentProductId value
     */
    public String parentProductId() {
        return this.parentProductId;
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
     * Get invoice section display name to which this product belongs.
     *
     * @return the invoiceSectionDisplayName value
     */
    public String invoiceSectionDisplayName() {
        return this.invoiceSectionDisplayName;
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
     * Get billing Profile display name to which this product belongs.
     *
     * @return the billingProfileDisplayName value
     */
    public String billingProfileDisplayName() {
        return this.billingProfileDisplayName;
    }

    /**
     * Get customer id to which this product belongs.
     *
     * @return the customerId value
     */
    public String customerId() {
        return this.customerId;
    }

    /**
     * Get display name of customer to which this product belongs.
     *
     * @return the customerDisplayName value
     */
    public String customerDisplayName() {
        return this.customerDisplayName;
    }

    /**
     * Get reseller for this product.
     *
     * @return the reseller value
     */
    public Reseller reseller() {
        return this.reseller;
    }

}
