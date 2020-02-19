/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Details about an operation related to metrics.
 */
public class OperationMetricSpecification {
    /**
     * The name of the metric.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Localized display name of the metric.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * The description of the metric.
     */
    @JsonProperty(value = "displayDescription")
    private String displayDescription;

    /**
     * The unit that the metric is measured in.
     */
    @JsonProperty(value = "unit")
    private String unit;

    /**
     * The type of metric aggregation.
     */
    @JsonProperty(value = "aggregationType")
    private String aggregationType;

    /**
     * Whether or not the service is using regional MDM accounts.
     */
    @JsonProperty(value = "enableRegionalMdmAccount")
    private String enableRegionalMdmAccount;

    /**
     * The name of the MDM account.
     */
    @JsonProperty(value = "sourceMdmAccount")
    private String sourceMdmAccount;

    /**
     * The name of the MDM namespace.
     */
    @JsonProperty(value = "sourceMdmNamespace")
    private String sourceMdmNamespace;

    /**
     * Defines how often data for metrics becomes available.
     */
    @JsonProperty(value = "availabilities")
    private List<OperationMetricAvailability> availabilities;

    /**
     * Defines the metric dimension.
     */
    @JsonProperty(value = "dimensions")
    private List<OperationMetricDimension> dimensions;

    /**
     * Get the name of the metric.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the metric.
     *
     * @param name the name value to set
     * @return the OperationMetricSpecification object itself.
     */
    public OperationMetricSpecification withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get localized display name of the metric.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set localized display name of the metric.
     *
     * @param displayName the displayName value to set
     * @return the OperationMetricSpecification object itself.
     */
    public OperationMetricSpecification withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the description of the metric.
     *
     * @return the displayDescription value
     */
    public String displayDescription() {
        return this.displayDescription;
    }

    /**
     * Set the description of the metric.
     *
     * @param displayDescription the displayDescription value to set
     * @return the OperationMetricSpecification object itself.
     */
    public OperationMetricSpecification withDisplayDescription(String displayDescription) {
        this.displayDescription = displayDescription;
        return this;
    }

    /**
     * Get the unit that the metric is measured in.
     *
     * @return the unit value
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Set the unit that the metric is measured in.
     *
     * @param unit the unit value to set
     * @return the OperationMetricSpecification object itself.
     */
    public OperationMetricSpecification withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get the type of metric aggregation.
     *
     * @return the aggregationType value
     */
    public String aggregationType() {
        return this.aggregationType;
    }

    /**
     * Set the type of metric aggregation.
     *
     * @param aggregationType the aggregationType value to set
     * @return the OperationMetricSpecification object itself.
     */
    public OperationMetricSpecification withAggregationType(String aggregationType) {
        this.aggregationType = aggregationType;
        return this;
    }

    /**
     * Get whether or not the service is using regional MDM accounts.
     *
     * @return the enableRegionalMdmAccount value
     */
    public String enableRegionalMdmAccount() {
        return this.enableRegionalMdmAccount;
    }

    /**
     * Set whether or not the service is using regional MDM accounts.
     *
     * @param enableRegionalMdmAccount the enableRegionalMdmAccount value to set
     * @return the OperationMetricSpecification object itself.
     */
    public OperationMetricSpecification withEnableRegionalMdmAccount(String enableRegionalMdmAccount) {
        this.enableRegionalMdmAccount = enableRegionalMdmAccount;
        return this;
    }

    /**
     * Get the name of the MDM account.
     *
     * @return the sourceMdmAccount value
     */
    public String sourceMdmAccount() {
        return this.sourceMdmAccount;
    }

    /**
     * Set the name of the MDM account.
     *
     * @param sourceMdmAccount the sourceMdmAccount value to set
     * @return the OperationMetricSpecification object itself.
     */
    public OperationMetricSpecification withSourceMdmAccount(String sourceMdmAccount) {
        this.sourceMdmAccount = sourceMdmAccount;
        return this;
    }

    /**
     * Get the name of the MDM namespace.
     *
     * @return the sourceMdmNamespace value
     */
    public String sourceMdmNamespace() {
        return this.sourceMdmNamespace;
    }

    /**
     * Set the name of the MDM namespace.
     *
     * @param sourceMdmNamespace the sourceMdmNamespace value to set
     * @return the OperationMetricSpecification object itself.
     */
    public OperationMetricSpecification withSourceMdmNamespace(String sourceMdmNamespace) {
        this.sourceMdmNamespace = sourceMdmNamespace;
        return this;
    }

    /**
     * Get defines how often data for metrics becomes available.
     *
     * @return the availabilities value
     */
    public List<OperationMetricAvailability> availabilities() {
        return this.availabilities;
    }

    /**
     * Set defines how often data for metrics becomes available.
     *
     * @param availabilities the availabilities value to set
     * @return the OperationMetricSpecification object itself.
     */
    public OperationMetricSpecification withAvailabilities(List<OperationMetricAvailability> availabilities) {
        this.availabilities = availabilities;
        return this;
    }

    /**
     * Get defines the metric dimension.
     *
     * @return the dimensions value
     */
    public List<OperationMetricDimension> dimensions() {
        return this.dimensions;
    }

    /**
     * Set defines the metric dimension.
     *
     * @param dimensions the dimensions value to set
     * @return the OperationMetricSpecification object itself.
     */
    public OperationMetricSpecification withDimensions(List<OperationMetricDimension> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

}
