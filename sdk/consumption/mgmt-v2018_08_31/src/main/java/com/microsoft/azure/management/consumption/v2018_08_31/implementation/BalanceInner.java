/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.consumption.v2018_08_31.implementation;

import java.math.BigDecimal;
import com.microsoft.azure.management.consumption.v2018_08_31.BillingFrequency;
import java.util.List;
import com.microsoft.azure.management.consumption.v2018_08_31.BalancePropertiesNewPurchasesDetailsItem;
import com.microsoft.azure.management.consumption.v2018_08_31.BalancePropertiesAdjustmentDetailsItem;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * A balance resource.
 */
@JsonFlatten
public class BalanceInner extends ProxyResource {
    /**
     * The ISO currency in which the meter is charged, for example, USD.
     */
    @JsonProperty(value = "properties.currency", access = JsonProperty.Access.WRITE_ONLY)
    private String currency;

    /**
     * The beginning balance for the billing period.
     */
    @JsonProperty(value = "properties.beginningBalance", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal beginningBalance;

    /**
     * The ending balance for the billing period (for open periods this will be
     * updated daily).
     */
    @JsonProperty(value = "properties.endingBalance", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal endingBalance;

    /**
     * Total new purchase amount.
     */
    @JsonProperty(value = "properties.newPurchases", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal newPurchases;

    /**
     * Total adjustment amount.
     */
    @JsonProperty(value = "properties.adjustments", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal adjustments;

    /**
     * Total Commitment usage.
     */
    @JsonProperty(value = "properties.utilized", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal utilized;

    /**
     * Overage for Azure services.
     */
    @JsonProperty(value = "properties.serviceOverage", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal serviceOverage;

    /**
     * Charges Billed separately.
     */
    @JsonProperty(value = "properties.chargesBilledSeparately", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal chargesBilledSeparately;

    /**
     * serviceOverage + chargesBilledSeparately.
     */
    @JsonProperty(value = "properties.totalOverage", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal totalOverage;

    /**
     * Azure service commitment + total Overage.
     */
    @JsonProperty(value = "properties.totalUsage", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal totalUsage;

    /**
     * Total charges for Azure Marketplace.
     */
    @JsonProperty(value = "properties.azureMarketplaceServiceCharges", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal azureMarketplaceServiceCharges;

    /**
     * The billing frequency. Possible values include: 'Month', 'Quarter',
     * 'Year'.
     */
    @JsonProperty(value = "properties.billingFrequency")
    private BillingFrequency billingFrequency;

    /**
     * Price is hidden or not.
     */
    @JsonProperty(value = "properties.priceHidden", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean priceHidden;

    /**
     * List of new purchases.
     */
    @JsonProperty(value = "properties.newPurchasesDetails", access = JsonProperty.Access.WRITE_ONLY)
    private List<BalancePropertiesNewPurchasesDetailsItem> newPurchasesDetails;

    /**
     * List of Adjustments (Promo credit, SIE credit etc.).
     */
    @JsonProperty(value = "properties.adjustmentDetails", access = JsonProperty.Access.WRITE_ONLY)
    private List<BalancePropertiesAdjustmentDetailsItem> adjustmentDetails;

    /**
     * Resource tags.
     */
    @JsonProperty(value = "tags", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, String> tags;

    /**
     * Get the ISO currency in which the meter is charged, for example, USD.
     *
     * @return the currency value
     */
    public String currency() {
        return this.currency;
    }

    /**
     * Get the beginning balance for the billing period.
     *
     * @return the beginningBalance value
     */
    public BigDecimal beginningBalance() {
        return this.beginningBalance;
    }

    /**
     * Get the ending balance for the billing period (for open periods this will be updated daily).
     *
     * @return the endingBalance value
     */
    public BigDecimal endingBalance() {
        return this.endingBalance;
    }

    /**
     * Get total new purchase amount.
     *
     * @return the newPurchases value
     */
    public BigDecimal newPurchases() {
        return this.newPurchases;
    }

    /**
     * Get total adjustment amount.
     *
     * @return the adjustments value
     */
    public BigDecimal adjustments() {
        return this.adjustments;
    }

    /**
     * Get total Commitment usage.
     *
     * @return the utilized value
     */
    public BigDecimal utilized() {
        return this.utilized;
    }

    /**
     * Get overage for Azure services.
     *
     * @return the serviceOverage value
     */
    public BigDecimal serviceOverage() {
        return this.serviceOverage;
    }

    /**
     * Get charges Billed separately.
     *
     * @return the chargesBilledSeparately value
     */
    public BigDecimal chargesBilledSeparately() {
        return this.chargesBilledSeparately;
    }

    /**
     * Get serviceOverage + chargesBilledSeparately.
     *
     * @return the totalOverage value
     */
    public BigDecimal totalOverage() {
        return this.totalOverage;
    }

    /**
     * Get azure service commitment + total Overage.
     *
     * @return the totalUsage value
     */
    public BigDecimal totalUsage() {
        return this.totalUsage;
    }

    /**
     * Get total charges for Azure Marketplace.
     *
     * @return the azureMarketplaceServiceCharges value
     */
    public BigDecimal azureMarketplaceServiceCharges() {
        return this.azureMarketplaceServiceCharges;
    }

    /**
     * Get the billing frequency. Possible values include: 'Month', 'Quarter', 'Year'.
     *
     * @return the billingFrequency value
     */
    public BillingFrequency billingFrequency() {
        return this.billingFrequency;
    }

    /**
     * Set the billing frequency. Possible values include: 'Month', 'Quarter', 'Year'.
     *
     * @param billingFrequency the billingFrequency value to set
     * @return the BalanceInner object itself.
     */
    public BalanceInner withBillingFrequency(BillingFrequency billingFrequency) {
        this.billingFrequency = billingFrequency;
        return this;
    }

    /**
     * Get price is hidden or not.
     *
     * @return the priceHidden value
     */
    public Boolean priceHidden() {
        return this.priceHidden;
    }

    /**
     * Get list of new purchases.
     *
     * @return the newPurchasesDetails value
     */
    public List<BalancePropertiesNewPurchasesDetailsItem> newPurchasesDetails() {
        return this.newPurchasesDetails;
    }

    /**
     * Get list of Adjustments (Promo credit, SIE credit etc.).
     *
     * @return the adjustmentDetails value
     */
    public List<BalancePropertiesAdjustmentDetailsItem> adjustmentDetails() {
        return this.adjustmentDetails;
    }

    /**
     * Get resource tags.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

}
