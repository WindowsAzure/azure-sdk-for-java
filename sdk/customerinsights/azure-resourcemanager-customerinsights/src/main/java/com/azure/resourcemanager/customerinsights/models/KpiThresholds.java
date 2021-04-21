// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** Defines the KPI Threshold limits. */
@Fluent
public final class KpiThresholds {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(KpiThresholds.class);

    /*
     * The lower threshold limit.
     */
    @JsonProperty(value = "lowerLimit", required = true)
    private BigDecimal lowerLimit;

    /*
     * The upper threshold limit.
     */
    @JsonProperty(value = "upperLimit", required = true)
    private BigDecimal upperLimit;

    /*
     * Whether or not the KPI is an increasing KPI.
     */
    @JsonProperty(value = "increasingKpi", required = true)
    private boolean increasingKpi;

    /**
     * Get the lowerLimit property: The lower threshold limit.
     *
     * @return the lowerLimit value.
     */
    public BigDecimal lowerLimit() {
        return this.lowerLimit;
    }

    /**
     * Set the lowerLimit property: The lower threshold limit.
     *
     * @param lowerLimit the lowerLimit value to set.
     * @return the KpiThresholds object itself.
     */
    public KpiThresholds withLowerLimit(BigDecimal lowerLimit) {
        this.lowerLimit = lowerLimit;
        return this;
    }

    /**
     * Get the upperLimit property: The upper threshold limit.
     *
     * @return the upperLimit value.
     */
    public BigDecimal upperLimit() {
        return this.upperLimit;
    }

    /**
     * Set the upperLimit property: The upper threshold limit.
     *
     * @param upperLimit the upperLimit value to set.
     * @return the KpiThresholds object itself.
     */
    public KpiThresholds withUpperLimit(BigDecimal upperLimit) {
        this.upperLimit = upperLimit;
        return this;
    }

    /**
     * Get the increasingKpi property: Whether or not the KPI is an increasing KPI.
     *
     * @return the increasingKpi value.
     */
    public boolean increasingKpi() {
        return this.increasingKpi;
    }

    /**
     * Set the increasingKpi property: Whether or not the KPI is an increasing KPI.
     *
     * @param increasingKpi the increasingKpi value to set.
     * @return the KpiThresholds object itself.
     */
    public KpiThresholds withIncreasingKpi(boolean increasingKpi) {
        this.increasingKpi = increasingKpi;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (lowerLimit() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property lowerLimit in model KpiThresholds"));
        }
        if (upperLimit() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property upperLimit in model KpiThresholds"));
        }
    }
}
