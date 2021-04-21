// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.consumption.models.Amount;
import com.azure.resourcemanager.consumption.models.AmountWithExchangeRate;
import com.azure.resourcemanager.consumption.models.LotSource;
import com.azure.resourcemanager.consumption.models.Reseller;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** A lot summary resource. */
@JsonFlatten
@Immutable
public class LotSummaryInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LotSummaryInner.class);

    /*
     * Credit Currency
     */
    @JsonProperty(value = "properties.creditCurrency", access = JsonProperty.Access.WRITE_ONLY)
    private String creditCurrency;

    /*
     * Billing Currency.
     */
    @JsonProperty(value = "properties.billingCurrency", access = JsonProperty.Access.WRITE_ONLY)
    private String billingCurrency;

    /*
     * Original amount.
     */
    @JsonProperty(value = "properties.originalAmount", access = JsonProperty.Access.WRITE_ONLY)
    private Amount originalAmount;

    /*
     * Current balance.
     */
    @JsonProperty(value = "properties.originalAmountInBillingCurrency", access = JsonProperty.Access.WRITE_ONLY)
    private AmountWithExchangeRate originalAmountInBillingCurrency;

    /*
     * Closed balance.
     */
    @JsonProperty(value = "properties.closedBalance", access = JsonProperty.Access.WRITE_ONLY)
    private Amount closedBalance;

    /*
     * Current balance.
     */
    @JsonProperty(value = "properties.closedBalanceInBillingCurrency", access = JsonProperty.Access.WRITE_ONLY)
    private AmountWithExchangeRate closedBalanceInBillingCurrency;

    /*
     * Lot source.
     */
    @JsonProperty(value = "properties.source", access = JsonProperty.Access.WRITE_ONLY)
    private LotSource source;

    /*
     * Start date.
     */
    @JsonProperty(value = "properties.startDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime startDate;

    /*
     * Expiration date.
     */
    @JsonProperty(value = "properties.expirationDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime expirationDate;

    /*
     * PO number.
     */
    @JsonProperty(value = "properties.poNumber", access = JsonProperty.Access.WRITE_ONLY)
    private String poNumber;

    /*
     * Reseller details.
     */
    @JsonProperty(value = "properties.reseller", access = JsonProperty.Access.WRITE_ONLY)
    private Reseller reseller;

    /*
     * Resource etag.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Resource tags.
     */
    @JsonProperty(value = "tags", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, String> tags;

    /**
     * Get the creditCurrency property: Credit Currency.
     *
     * @return the creditCurrency value.
     */
    public String creditCurrency() {
        return this.creditCurrency;
    }

    /**
     * Get the billingCurrency property: Billing Currency.
     *
     * @return the billingCurrency value.
     */
    public String billingCurrency() {
        return this.billingCurrency;
    }

    /**
     * Get the originalAmount property: Original amount.
     *
     * @return the originalAmount value.
     */
    public Amount originalAmount() {
        return this.originalAmount;
    }

    /**
     * Get the originalAmountInBillingCurrency property: Current balance.
     *
     * @return the originalAmountInBillingCurrency value.
     */
    public AmountWithExchangeRate originalAmountInBillingCurrency() {
        return this.originalAmountInBillingCurrency;
    }

    /**
     * Get the closedBalance property: Closed balance.
     *
     * @return the closedBalance value.
     */
    public Amount closedBalance() {
        return this.closedBalance;
    }

    /**
     * Get the closedBalanceInBillingCurrency property: Current balance.
     *
     * @return the closedBalanceInBillingCurrency value.
     */
    public AmountWithExchangeRate closedBalanceInBillingCurrency() {
        return this.closedBalanceInBillingCurrency;
    }

    /**
     * Get the source property: Lot source.
     *
     * @return the source value.
     */
    public LotSource source() {
        return this.source;
    }

    /**
     * Get the startDate property: Start date.
     *
     * @return the startDate value.
     */
    public OffsetDateTime startDate() {
        return this.startDate;
    }

    /**
     * Get the expirationDate property: Expiration date.
     *
     * @return the expirationDate value.
     */
    public OffsetDateTime expirationDate() {
        return this.expirationDate;
    }

    /**
     * Get the poNumber property: PO number.
     *
     * @return the poNumber value.
     */
    public String poNumber() {
        return this.poNumber;
    }

    /**
     * Get the reseller property: Reseller details.
     *
     * @return the reseller value.
     */
    public Reseller reseller() {
        return this.reseller;
    }

    /**
     * Get the etag property: Resource etag.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (originalAmount() != null) {
            originalAmount().validate();
        }
        if (originalAmountInBillingCurrency() != null) {
            originalAmountInBillingCurrency().validate();
        }
        if (closedBalance() != null) {
            closedBalance().validate();
        }
        if (closedBalanceInBillingCurrency() != null) {
            closedBalanceInBillingCurrency().validate();
        }
        if (reseller() != null) {
            reseller().validate();
        }
    }
}
