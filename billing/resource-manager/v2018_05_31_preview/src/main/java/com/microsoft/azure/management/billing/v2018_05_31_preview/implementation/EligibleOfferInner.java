/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_05_31_preview.implementation;

import org.joda.time.DateTime;
import com.microsoft.azure.management.billing.v2018_05_31_preview.ProductDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * An Eligible Offer resource.
 */
@JsonFlatten
public class EligibleOfferInner extends ProxyResource {
    /**
     * Offer name.
     */
    @JsonProperty(value = "properties.displayName", access = JsonProperty.Access.WRITE_ONLY)
    private String displayName;

    /**
     * The id of the parent asset.
     */
    @JsonProperty(value = "properties.parentAssetId", access = JsonProperty.Access.WRITE_ONLY)
    private String parentAssetId;

    /**
     * The id of the project.
     */
    @JsonProperty(value = "properties.owningProjectId", access = JsonProperty.Access.WRITE_ONLY)
    private String owningProjectId;

    /**
     * The start date.
     */
    @JsonProperty(value = "properties.startDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime startDate;

    /**
     * The end date.
     */
    @JsonProperty(value = "properties.endDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime endDate;

    /**
     * The billing profiles associated to the eligible offer.
     */
    @JsonProperty(value = "properties.billingProfiles")
    private BillingProfileInner billingProfiles;

    /**
     * Information about the product.
     */
    @JsonProperty(value = "properties.productDetails")
    private ProductDetails productDetails;

    /**
     * Get offer name.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Get the id of the parent asset.
     *
     * @return the parentAssetId value
     */
    public String parentAssetId() {
        return this.parentAssetId;
    }

    /**
     * Get the id of the project.
     *
     * @return the owningProjectId value
     */
    public String owningProjectId() {
        return this.owningProjectId;
    }

    /**
     * Get the start date.
     *
     * @return the startDate value
     */
    public DateTime startDate() {
        return this.startDate;
    }

    /**
     * Get the end date.
     *
     * @return the endDate value
     */
    public DateTime endDate() {
        return this.endDate;
    }

    /**
     * Get the billing profiles associated to the eligible offer.
     *
     * @return the billingProfiles value
     */
    public BillingProfileInner billingProfiles() {
        return this.billingProfiles;
    }

    /**
     * Set the billing profiles associated to the eligible offer.
     *
     * @param billingProfiles the billingProfiles value to set
     * @return the EligibleOfferInner object itself.
     */
    public EligibleOfferInner withBillingProfiles(BillingProfileInner billingProfiles) {
        this.billingProfiles = billingProfiles;
        return this;
    }

    /**
     * Get information about the product.
     *
     * @return the productDetails value
     */
    public ProductDetails productDetails() {
        return this.productDetails;
    }

    /**
     * Set information about the product.
     *
     * @param productDetails the productDetails value to set
     * @return the EligibleOfferInner object itself.
     */
    public EligibleOfferInner withProductDetails(ProductDetails productDetails) {
        this.productDetails = productDetails;
        return this;
    }

}
