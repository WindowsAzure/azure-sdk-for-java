// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.models;

import com.azure.resourcemanager.consumption.fluent.models.BalanceInner;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of Balance. */
public interface Balance {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the currency property: The ISO currency in which the meter is charged, for example, USD.
     *
     * @return the currency value.
     */
    String currency();

    /**
     * Gets the beginningBalance property: The beginning balance for the billing period.
     *
     * @return the beginningBalance value.
     */
    BigDecimal beginningBalance();

    /**
     * Gets the endingBalance property: The ending balance for the billing period (for open periods this will be updated
     * daily).
     *
     * @return the endingBalance value.
     */
    BigDecimal endingBalance();

    /**
     * Gets the newPurchases property: Total new purchase amount.
     *
     * @return the newPurchases value.
     */
    BigDecimal newPurchases();

    /**
     * Gets the adjustments property: Total adjustment amount.
     *
     * @return the adjustments value.
     */
    BigDecimal adjustments();

    /**
     * Gets the utilized property: Total Commitment usage.
     *
     * @return the utilized value.
     */
    BigDecimal utilized();

    /**
     * Gets the serviceOverage property: Overage for Azure services.
     *
     * @return the serviceOverage value.
     */
    BigDecimal serviceOverage();

    /**
     * Gets the chargesBilledSeparately property: Charges Billed separately.
     *
     * @return the chargesBilledSeparately value.
     */
    BigDecimal chargesBilledSeparately();

    /**
     * Gets the totalOverage property: serviceOverage + chargesBilledSeparately.
     *
     * @return the totalOverage value.
     */
    BigDecimal totalOverage();

    /**
     * Gets the totalUsage property: Azure service commitment + total Overage.
     *
     * @return the totalUsage value.
     */
    BigDecimal totalUsage();

    /**
     * Gets the azureMarketplaceServiceCharges property: Total charges for Azure Marketplace.
     *
     * @return the azureMarketplaceServiceCharges value.
     */
    BigDecimal azureMarketplaceServiceCharges();

    /**
     * Gets the billingFrequency property: The billing frequency.
     *
     * @return the billingFrequency value.
     */
    BillingFrequency billingFrequency();

    /**
     * Gets the priceHidden property: Price is hidden or not.
     *
     * @return the priceHidden value.
     */
    Boolean priceHidden();

    /**
     * Gets the newPurchasesDetails property: List of new purchases.
     *
     * @return the newPurchasesDetails value.
     */
    List<BalancePropertiesNewPurchasesDetailsItem> newPurchasesDetails();

    /**
     * Gets the adjustmentDetails property: List of Adjustments (Promo credit, SIE credit etc.).
     *
     * @return the adjustmentDetails value.
     */
    List<BalancePropertiesAdjustmentDetailsItem> adjustmentDetails();

    /**
     * Gets the etag property: Resource etag.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the inner com.azure.resourcemanager.consumption.fluent.models.BalanceInner object.
     *
     * @return the inner object.
     */
    BalanceInner innerModel();
}
