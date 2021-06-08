// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.ai.metricsadvisor.administration.models.ChangeThresholdCondition;
import com.azure.ai.metricsadvisor.administration.models.HardThresholdCondition;
import com.azure.ai.metricsadvisor.administration.models.SmartDetectionCondition;
import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The SeriesConfiguration model. */
@Fluent
public final class SeriesConfiguration {
    /*
     * The series property.
     */
    @JsonProperty(value = "series", required = true)
    private SeriesIdentity series;

    /*
     * condition operator
     *
     * should be specified when combining multiple detection conditions
     */
    @JsonProperty(value = "conditionOperator")
    private AnomalyDetectionConfigurationLogicType conditionOperator;

    /*
     * The smartDetectionCondition property.
     */
    @JsonProperty(value = "smartDetectionCondition")
    private SmartDetectionCondition smartDetectionCondition;

    /*
     * The hardThresholdCondition property.
     */
    @JsonProperty(value = "hardThresholdCondition")
    private HardThresholdCondition hardThresholdCondition;

    /*
     * The changeThresholdCondition property.
     */
    @JsonProperty(value = "changeThresholdCondition")
    private ChangeThresholdCondition changeThresholdCondition;

    /**
     * Get the series property: The series property.
     *
     * @return the series value.
     */
    public SeriesIdentity getSeries() {
        return this.series;
    }

    /**
     * Set the series property: The series property.
     *
     * @param series the series value to set.
     * @return the SeriesConfiguration object itself.
     */
    public SeriesConfiguration setSeries(SeriesIdentity series) {
        this.series = series;
        return this;
    }

    /**
     * Get the conditionOperator property: condition operator
     *
     * <p>should be specified when combining multiple detection conditions.
     *
     * @return the conditionOperator value.
     */
    public AnomalyDetectionConfigurationLogicType getConditionOperator() {
        return this.conditionOperator;
    }

    /**
     * Set the conditionOperator property: condition operator
     *
     * <p>should be specified when combining multiple detection conditions.
     *
     * @param conditionOperator the conditionOperator value to set.
     * @return the SeriesConfiguration object itself.
     */
    public SeriesConfiguration setConditionOperator(AnomalyDetectionConfigurationLogicType conditionOperator) {
        this.conditionOperator = conditionOperator;
        return this;
    }

    /**
     * Get the smartDetectionCondition property: The smartDetectionCondition property.
     *
     * @return the smartDetectionCondition value.
     */
    public SmartDetectionCondition getSmartDetectionCondition() {
        return this.smartDetectionCondition;
    }

    /**
     * Set the smartDetectionCondition property: The smartDetectionCondition property.
     *
     * @param smartDetectionCondition the smartDetectionCondition value to set.
     * @return the SeriesConfiguration object itself.
     */
    public SeriesConfiguration setSmartDetectionCondition(SmartDetectionCondition smartDetectionCondition) {
        this.smartDetectionCondition = smartDetectionCondition;
        return this;
    }

    /**
     * Get the hardThresholdCondition property: The hardThresholdCondition property.
     *
     * @return the hardThresholdCondition value.
     */
    public HardThresholdCondition getHardThresholdCondition() {
        return this.hardThresholdCondition;
    }

    /**
     * Set the hardThresholdCondition property: The hardThresholdCondition property.
     *
     * @param hardThresholdCondition the hardThresholdCondition value to set.
     * @return the SeriesConfiguration object itself.
     */
    public SeriesConfiguration setHardThresholdCondition(HardThresholdCondition hardThresholdCondition) {
        this.hardThresholdCondition = hardThresholdCondition;
        return this;
    }

    /**
     * Get the changeThresholdCondition property: The changeThresholdCondition property.
     *
     * @return the changeThresholdCondition value.
     */
    public ChangeThresholdCondition getChangeThresholdCondition() {
        return this.changeThresholdCondition;
    }

    /**
     * Set the changeThresholdCondition property: The changeThresholdCondition property.
     *
     * @param changeThresholdCondition the changeThresholdCondition value to set.
     * @return the SeriesConfiguration object itself.
     */
    public SeriesConfiguration setChangeThresholdCondition(ChangeThresholdCondition changeThresholdCondition) {
        this.changeThresholdCondition = changeThresholdCondition;
        return this;
    }
}
