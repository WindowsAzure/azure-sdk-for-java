// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.commerce.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.commerce.models.MeterInfo;
import com.azure.resourcemanager.commerce.models.OfferTermInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Price and Metadata information for resources. */
@Fluent
public final class ResourceRateCardInfoInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceRateCardInfoInner.class);

    /*
     * The currency in which the rates are provided.
     */
    @JsonProperty(value = "Currency")
    private String currency;

    /*
     * The culture in which the resource information is localized.
     */
    @JsonProperty(value = "Locale")
    private String locale;

    /*
     * All rates are pretax, so this will always be returned as 'false'.
     */
    @JsonProperty(value = "IsTaxIncluded")
    private Boolean isTaxIncluded;

    /*
     * A list of offer terms.
     */
    @JsonProperty(value = "OfferTerms")
    private List<OfferTermInfo> offerTerms;

    /*
     * A list of meters.
     */
    @JsonProperty(value = "Meters")
    private List<MeterInfo> meters;

    /**
     * Get the currency property: The currency in which the rates are provided.
     *
     * @return the currency value.
     */
    public String currency() {
        return this.currency;
    }

    /**
     * Set the currency property: The currency in which the rates are provided.
     *
     * @param currency the currency value to set.
     * @return the ResourceRateCardInfoInner object itself.
     */
    public ResourceRateCardInfoInner withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Get the locale property: The culture in which the resource information is localized.
     *
     * @return the locale value.
     */
    public String locale() {
        return this.locale;
    }

    /**
     * Set the locale property: The culture in which the resource information is localized.
     *
     * @param locale the locale value to set.
     * @return the ResourceRateCardInfoInner object itself.
     */
    public ResourceRateCardInfoInner withLocale(String locale) {
        this.locale = locale;
        return this;
    }

    /**
     * Get the isTaxIncluded property: All rates are pretax, so this will always be returned as 'false'.
     *
     * @return the isTaxIncluded value.
     */
    public Boolean isTaxIncluded() {
        return this.isTaxIncluded;
    }

    /**
     * Set the isTaxIncluded property: All rates are pretax, so this will always be returned as 'false'.
     *
     * @param isTaxIncluded the isTaxIncluded value to set.
     * @return the ResourceRateCardInfoInner object itself.
     */
    public ResourceRateCardInfoInner withIsTaxIncluded(Boolean isTaxIncluded) {
        this.isTaxIncluded = isTaxIncluded;
        return this;
    }

    /**
     * Get the offerTerms property: A list of offer terms.
     *
     * @return the offerTerms value.
     */
    public List<OfferTermInfo> offerTerms() {
        return this.offerTerms;
    }

    /**
     * Set the offerTerms property: A list of offer terms.
     *
     * @param offerTerms the offerTerms value to set.
     * @return the ResourceRateCardInfoInner object itself.
     */
    public ResourceRateCardInfoInner withOfferTerms(List<OfferTermInfo> offerTerms) {
        this.offerTerms = offerTerms;
        return this;
    }

    /**
     * Get the meters property: A list of meters.
     *
     * @return the meters value.
     */
    public List<MeterInfo> meters() {
        return this.meters;
    }

    /**
     * Set the meters property: A list of meters.
     *
     * @param meters the meters value to set.
     * @return the ResourceRateCardInfoInner object itself.
     */
    public ResourceRateCardInfoInner withMeters(List<MeterInfo> meters) {
        this.meters = meters;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (offerTerms() != null) {
            offerTerms().forEach(e -> e.validate());
        }
        if (meters() != null) {
            meters().forEach(e -> e.validate());
        }
    }
}
