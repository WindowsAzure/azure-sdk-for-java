// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.administration.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The RateInformation model. */
@Fluent
public final class RateInformation {
    /*
     * The monthly rate of a phone plan group
     */
    @JsonProperty(value = "monthlyRate")
    private Double monthlyRate;

    /*
     * The currency of a phone plan group
     */
    @JsonProperty(value = "currencyType")
    private CurrencyType currencyType;

    /*
     * The error code of a phone plan group
     */
    @JsonProperty(value = "rateErrorMessage")
    private String rateErrorMessage;

    /**
     * Get the monthlyRate property: The monthly rate of a phone plan group.
     *
     * @return the monthlyRate value.
     */
    public Double getMonthlyRate() {
        return this.monthlyRate;
    }

    /**
     * Set the monthlyRate property: The monthly rate of a phone plan group.
     *
     * @param monthlyRate the monthlyRate value to set.
     * @return the RateInformation object itself.
     */
    public RateInformation setMonthlyRate(Double monthlyRate) {
        this.monthlyRate = monthlyRate;
        return this;
    }

    /**
     * Get the currencyType property: The currency of a phone plan group.
     *
     * @return the currencyType value.
     */
    public CurrencyType getCurrencyType() {
        return this.currencyType;
    }

    /**
     * Set the currencyType property: The currency of a phone plan group.
     *
     * @param currencyType the currencyType value to set.
     * @return the RateInformation object itself.
     */
    public RateInformation setCurrencyType(CurrencyType currencyType) {
        this.currencyType = currencyType;
        return this;
    }

    /**
     * Get the rateErrorMessage property: The error code of a phone plan group.
     *
     * @return the rateErrorMessage value.
     */
    public String getRateErrorMessage() {
        return this.rateErrorMessage;
    }

    /**
     * Set the rateErrorMessage property: The error code of a phone plan group.
     *
     * @param rateErrorMessage the rateErrorMessage value to set.
     * @return the RateInformation object itself.
     */
    public RateInformation setRateErrorMessage(String rateErrorMessage) {
        this.rateErrorMessage = rateErrorMessage;
        return this;
    }
}
