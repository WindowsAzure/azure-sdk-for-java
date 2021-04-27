// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** The properties of the meter detail. */
@Immutable
public final class MeterDetails {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MeterDetails.class);

    /*
     * The name of the meter, within the given meter category
     */
    @JsonProperty(value = "meterName", access = JsonProperty.Access.WRITE_ONLY)
    private String meterName;

    /*
     * The category of the meter, for example, 'Cloud services', 'Networking',
     * etc..
     */
    @JsonProperty(value = "meterCategory", access = JsonProperty.Access.WRITE_ONLY)
    private String meterCategory;

    /*
     * The subcategory of the meter, for example, 'A6 Cloud services',
     * 'ExpressRoute (IXP)', etc..
     */
    @JsonProperty(value = "meterSubCategory", access = JsonProperty.Access.WRITE_ONLY)
    private String meterSubCategory;

    /*
     * The unit in which the meter consumption is charged, for example,
     * 'Hours', 'GB', etc.
     */
    @JsonProperty(value = "unit", access = JsonProperty.Access.WRITE_ONLY)
    private String unit;

    /*
     * The location in which the Azure service is available.
     */
    @JsonProperty(value = "meterLocation", access = JsonProperty.Access.WRITE_ONLY)
    private String meterLocation;

    /*
     * The total included quantity associated with the offer.
     */
    @JsonProperty(value = "totalIncludedQuantity", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal totalIncludedQuantity;

    /*
     * The pretax listing price.
     */
    @JsonProperty(value = "pretaxStandardRate", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal pretaxStandardRate;

    /*
     * The name of the service.
     */
    @JsonProperty(value = "serviceName", access = JsonProperty.Access.WRITE_ONLY)
    private String serviceName;

    /*
     * The service tier.
     */
    @JsonProperty(value = "serviceTier", access = JsonProperty.Access.WRITE_ONLY)
    private String serviceTier;

    /**
     * Get the meterName property: The name of the meter, within the given meter category.
     *
     * @return the meterName value.
     */
    public String meterName() {
        return this.meterName;
    }

    /**
     * Get the meterCategory property: The category of the meter, for example, 'Cloud services', 'Networking', etc..
     *
     * @return the meterCategory value.
     */
    public String meterCategory() {
        return this.meterCategory;
    }

    /**
     * Get the meterSubCategory property: The subcategory of the meter, for example, 'A6 Cloud services', 'ExpressRoute
     * (IXP)', etc..
     *
     * @return the meterSubCategory value.
     */
    public String meterSubCategory() {
        return this.meterSubCategory;
    }

    /**
     * Get the unit property: The unit in which the meter consumption is charged, for example, 'Hours', 'GB', etc.
     *
     * @return the unit value.
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Get the meterLocation property: The location in which the Azure service is available.
     *
     * @return the meterLocation value.
     */
    public String meterLocation() {
        return this.meterLocation;
    }

    /**
     * Get the totalIncludedQuantity property: The total included quantity associated with the offer.
     *
     * @return the totalIncludedQuantity value.
     */
    public BigDecimal totalIncludedQuantity() {
        return this.totalIncludedQuantity;
    }

    /**
     * Get the pretaxStandardRate property: The pretax listing price.
     *
     * @return the pretaxStandardRate value.
     */
    public BigDecimal pretaxStandardRate() {
        return this.pretaxStandardRate;
    }

    /**
     * Get the serviceName property: The name of the service.
     *
     * @return the serviceName value.
     */
    public String serviceName() {
        return this.serviceName;
    }

    /**
     * Get the serviceTier property: The service tier.
     *
     * @return the serviceTier value.
     */
    public String serviceTier() {
        return this.serviceTier;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
