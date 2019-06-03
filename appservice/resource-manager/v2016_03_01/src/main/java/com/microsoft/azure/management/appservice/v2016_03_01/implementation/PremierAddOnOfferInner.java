/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_03_01.implementation;

import com.microsoft.azure.management.appservice.v2016_03_01.AppServicePlanRestrictions;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.appservice.v2016_03_01.ProxyOnlyResource;

/**
 * Premier add-on offer.
 */
@JsonFlatten
public class PremierAddOnOfferInner extends ProxyOnlyResource {
    /**
     * Premier add on SKU.
     */
    @JsonProperty(value = "properties.sku")
    private String sku;

    /**
     * Premier add on offer Product.
     */
    @JsonProperty(value = "properties.product")
    private String product;

    /**
     * Premier add on offer Vendor.
     */
    @JsonProperty(value = "properties.vendor")
    private String vendor;

    /**
     * Premier add on offer Name.
     */
    @JsonProperty(value = "properties.name")
    private String premierAddOnOfferName;

    /**
     * &lt;code&gt;true&lt;/code&gt; if promotion code is required; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "properties.promoCodeRequired")
    private Boolean promoCodeRequired;

    /**
     * Premier add on offer Quota.
     */
    @JsonProperty(value = "properties.quota")
    private Integer quota;

    /**
     * App Service plans this offer is restricted to. Possible values include:
     * 'None', 'Free', 'Shared', 'Basic', 'Standard', 'Premium'.
     */
    @JsonProperty(value = "properties.webHostingPlanRestrictions")
    private AppServicePlanRestrictions webHostingPlanRestrictions;

    /**
     * Privacy policy URL.
     */
    @JsonProperty(value = "properties.privacyPolicyUrl")
    private String privacyPolicyUrl;

    /**
     * Legal terms URL.
     */
    @JsonProperty(value = "properties.legalTermsUrl")
    private String legalTermsUrl;

    /**
     * Marketplace publisher.
     */
    @JsonProperty(value = "properties.marketplacePublisher")
    private String marketplacePublisher;

    /**
     * Marketplace offer.
     */
    @JsonProperty(value = "properties.marketplaceOffer")
    private String marketplaceOffer;

    /**
     * Get premier add on SKU.
     *
     * @return the sku value
     */
    public String sku() {
        return this.sku;
    }

    /**
     * Set premier add on SKU.
     *
     * @param sku the sku value to set
     * @return the PremierAddOnOfferInner object itself.
     */
    public PremierAddOnOfferInner withSku(String sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get premier add on offer Product.
     *
     * @return the product value
     */
    public String product() {
        return this.product;
    }

    /**
     * Set premier add on offer Product.
     *
     * @param product the product value to set
     * @return the PremierAddOnOfferInner object itself.
     */
    public PremierAddOnOfferInner withProduct(String product) {
        this.product = product;
        return this;
    }

    /**
     * Get premier add on offer Vendor.
     *
     * @return the vendor value
     */
    public String vendor() {
        return this.vendor;
    }

    /**
     * Set premier add on offer Vendor.
     *
     * @param vendor the vendor value to set
     * @return the PremierAddOnOfferInner object itself.
     */
    public PremierAddOnOfferInner withVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }

    /**
     * Get premier add on offer Name.
     *
     * @return the premierAddOnOfferName value
     */
    public String premierAddOnOfferName() {
        return this.premierAddOnOfferName;
    }

    /**
     * Set premier add on offer Name.
     *
     * @param premierAddOnOfferName the premierAddOnOfferName value to set
     * @return the PremierAddOnOfferInner object itself.
     */
    public PremierAddOnOfferInner withPremierAddOnOfferName(String premierAddOnOfferName) {
        this.premierAddOnOfferName = premierAddOnOfferName;
        return this;
    }

    /**
     * Get &lt;code&gt;true&lt;/code&gt; if promotion code is required; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the promoCodeRequired value
     */
    public Boolean promoCodeRequired() {
        return this.promoCodeRequired;
    }

    /**
     * Set &lt;code&gt;true&lt;/code&gt; if promotion code is required; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @param promoCodeRequired the promoCodeRequired value to set
     * @return the PremierAddOnOfferInner object itself.
     */
    public PremierAddOnOfferInner withPromoCodeRequired(Boolean promoCodeRequired) {
        this.promoCodeRequired = promoCodeRequired;
        return this;
    }

    /**
     * Get premier add on offer Quota.
     *
     * @return the quota value
     */
    public Integer quota() {
        return this.quota;
    }

    /**
     * Set premier add on offer Quota.
     *
     * @param quota the quota value to set
     * @return the PremierAddOnOfferInner object itself.
     */
    public PremierAddOnOfferInner withQuota(Integer quota) {
        this.quota = quota;
        return this;
    }

    /**
     * Get app Service plans this offer is restricted to. Possible values include: 'None', 'Free', 'Shared', 'Basic', 'Standard', 'Premium'.
     *
     * @return the webHostingPlanRestrictions value
     */
    public AppServicePlanRestrictions webHostingPlanRestrictions() {
        return this.webHostingPlanRestrictions;
    }

    /**
     * Set app Service plans this offer is restricted to. Possible values include: 'None', 'Free', 'Shared', 'Basic', 'Standard', 'Premium'.
     *
     * @param webHostingPlanRestrictions the webHostingPlanRestrictions value to set
     * @return the PremierAddOnOfferInner object itself.
     */
    public PremierAddOnOfferInner withWebHostingPlanRestrictions(AppServicePlanRestrictions webHostingPlanRestrictions) {
        this.webHostingPlanRestrictions = webHostingPlanRestrictions;
        return this;
    }

    /**
     * Get privacy policy URL.
     *
     * @return the privacyPolicyUrl value
     */
    public String privacyPolicyUrl() {
        return this.privacyPolicyUrl;
    }

    /**
     * Set privacy policy URL.
     *
     * @param privacyPolicyUrl the privacyPolicyUrl value to set
     * @return the PremierAddOnOfferInner object itself.
     */
    public PremierAddOnOfferInner withPrivacyPolicyUrl(String privacyPolicyUrl) {
        this.privacyPolicyUrl = privacyPolicyUrl;
        return this;
    }

    /**
     * Get legal terms URL.
     *
     * @return the legalTermsUrl value
     */
    public String legalTermsUrl() {
        return this.legalTermsUrl;
    }

    /**
     * Set legal terms URL.
     *
     * @param legalTermsUrl the legalTermsUrl value to set
     * @return the PremierAddOnOfferInner object itself.
     */
    public PremierAddOnOfferInner withLegalTermsUrl(String legalTermsUrl) {
        this.legalTermsUrl = legalTermsUrl;
        return this;
    }

    /**
     * Get marketplace publisher.
     *
     * @return the marketplacePublisher value
     */
    public String marketplacePublisher() {
        return this.marketplacePublisher;
    }

    /**
     * Set marketplace publisher.
     *
     * @param marketplacePublisher the marketplacePublisher value to set
     * @return the PremierAddOnOfferInner object itself.
     */
    public PremierAddOnOfferInner withMarketplacePublisher(String marketplacePublisher) {
        this.marketplacePublisher = marketplacePublisher;
        return this;
    }

    /**
     * Get marketplace offer.
     *
     * @return the marketplaceOffer value
     */
    public String marketplaceOffer() {
        return this.marketplaceOffer;
    }

    /**
     * Set marketplace offer.
     *
     * @param marketplaceOffer the marketplaceOffer value to set
     * @return the PremierAddOnOfferInner object itself.
     */
    public PremierAddOnOfferInner withMarketplaceOffer(String marketplaceOffer) {
        this.marketplaceOffer = marketplaceOffer;
        return this;
    }

}
