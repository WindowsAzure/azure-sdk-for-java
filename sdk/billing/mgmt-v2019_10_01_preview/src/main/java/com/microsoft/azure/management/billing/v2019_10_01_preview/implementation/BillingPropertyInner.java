/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * A billing property resource.
 */
@JsonFlatten
public class BillingPropertyInner extends ProxyResource {
    /**
     * Billing tenant Id.
     */
    @JsonProperty(value = "properties.billingTenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String billingTenantId;

    /**
     * Billing account Id.
     */
    @JsonProperty(value = "properties.billingAccountId", access = JsonProperty.Access.WRITE_ONLY)
    private String billingAccountId;

    /**
     * Billing account display name.
     */
    @JsonProperty(value = "properties.billingAccountDisplayName", access = JsonProperty.Access.WRITE_ONLY)
    private String billingAccountDisplayName;

    /**
     * Billing profile Id.
     */
    @JsonProperty(value = "properties.billingProfileId", access = JsonProperty.Access.WRITE_ONLY)
    private String billingProfileId;

    /**
     * Billing profile display name.
     */
    @JsonProperty(value = "properties.billingProfileDisplayName", access = JsonProperty.Access.WRITE_ONLY)
    private String billingProfileDisplayName;

    /**
     * Cost center name.
     */
    @JsonProperty(value = "properties.costCenter", access = JsonProperty.Access.WRITE_ONLY)
    private String costCenter;

    /**
     * Invoice Section Id.
     */
    @JsonProperty(value = "properties.invoiceSectionId", access = JsonProperty.Access.WRITE_ONLY)
    private String invoiceSectionId;

    /**
     * Invoice Section display name.
     */
    @JsonProperty(value = "properties.invoiceSectionDisplayName", access = JsonProperty.Access.WRITE_ONLY)
    private String invoiceSectionDisplayName;

    /**
     * Product Id.
     */
    @JsonProperty(value = "properties.productId", access = JsonProperty.Access.WRITE_ONLY)
    private String productId;

    /**
     * Product name.
     */
    @JsonProperty(value = "properties.productName", access = JsonProperty.Access.WRITE_ONLY)
    private String productName;

    /**
     * SKU Id.
     */
    @JsonProperty(value = "properties.skuId", access = JsonProperty.Access.WRITE_ONLY)
    private String skuId;

    /**
     * SKU description.
     */
    @JsonProperty(value = "properties.skuDescription", access = JsonProperty.Access.WRITE_ONLY)
    private String skuDescription;

    /**
     * Get billing tenant Id.
     *
     * @return the billingTenantId value
     */
    public String billingTenantId() {
        return this.billingTenantId;
    }

    /**
     * Get billing account Id.
     *
     * @return the billingAccountId value
     */
    public String billingAccountId() {
        return this.billingAccountId;
    }

    /**
     * Get billing account display name.
     *
     * @return the billingAccountDisplayName value
     */
    public String billingAccountDisplayName() {
        return this.billingAccountDisplayName;
    }

    /**
     * Get billing profile Id.
     *
     * @return the billingProfileId value
     */
    public String billingProfileId() {
        return this.billingProfileId;
    }

    /**
     * Get billing profile display name.
     *
     * @return the billingProfileDisplayName value
     */
    public String billingProfileDisplayName() {
        return this.billingProfileDisplayName;
    }

    /**
     * Get cost center name.
     *
     * @return the costCenter value
     */
    public String costCenter() {
        return this.costCenter;
    }

    /**
     * Get invoice Section Id.
     *
     * @return the invoiceSectionId value
     */
    public String invoiceSectionId() {
        return this.invoiceSectionId;
    }

    /**
     * Get invoice Section display name.
     *
     * @return the invoiceSectionDisplayName value
     */
    public String invoiceSectionDisplayName() {
        return this.invoiceSectionDisplayName;
    }

    /**
     * Get product Id.
     *
     * @return the productId value
     */
    public String productId() {
        return this.productId;
    }

    /**
     * Get product name.
     *
     * @return the productName value
     */
    public String productName() {
        return this.productName;
    }

    /**
     * Get sKU Id.
     *
     * @return the skuId value
     */
    public String skuId() {
        return this.skuId;
    }

    /**
     * Get sKU description.
     *
     * @return the skuDescription value
     */
    public String skuDescription() {
        return this.skuDescription;
    }

}
