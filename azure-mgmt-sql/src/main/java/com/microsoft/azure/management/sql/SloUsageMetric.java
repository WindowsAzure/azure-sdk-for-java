/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a Slo Usage Metric.
 */
public class SloUsageMetric {
    /**
     * The serviceLevelObjective for SLO usage metric. Possible values include:
     * 'Basic', 'S0', 'S1', 'S2', 'S3', 'P1', 'P2', 'P3', 'P4', 'P6', 'P11',
     * 'P15', 'System', 'System2', 'ElasticPool'.
     */
    @JsonProperty(value = "serviceLevelObjective")
    private ServiceObjectiveName serviceLevelObjective;

    /**
     * The serviceLevelObjectiveId for SLO usage metric.
     */
    @JsonProperty(value = "serviceLevelObjectiveId")
    private UUID serviceLevelObjectiveId;

    /**
     * Gets or sets inRangeTimeRatio for SLO usage metric.
     */
    @JsonProperty(value = "inRangeTimeRatio")
    private Double inRangeTimeRatio;

    /**
     * Get the serviceLevelObjective value.
     *
     * @return the serviceLevelObjective value
     */
    public ServiceObjectiveName serviceLevelObjective() {
        return this.serviceLevelObjective;
    }

    /**
     * Set the serviceLevelObjective value.
     *
     * @param serviceLevelObjective the serviceLevelObjective value to set
     * @return the SloUsageMetric object itself.
     */
    public SloUsageMetric withServiceLevelObjective(ServiceObjectiveName serviceLevelObjective) {
        this.serviceLevelObjective = serviceLevelObjective;
        return this;
    }

    /**
     * Get the serviceLevelObjectiveId value.
     *
     * @return the serviceLevelObjectiveId value
     */
    public UUID serviceLevelObjectiveId() {
        return this.serviceLevelObjectiveId;
    }

    /**
     * Set the serviceLevelObjectiveId value.
     *
     * @param serviceLevelObjectiveId the serviceLevelObjectiveId value to set
     * @return the SloUsageMetric object itself.
     */
    public SloUsageMetric withServiceLevelObjectiveId(UUID serviceLevelObjectiveId) {
        this.serviceLevelObjectiveId = serviceLevelObjectiveId;
        return this;
    }

    /**
     * Get the inRangeTimeRatio value.
     *
     * @return the inRangeTimeRatio value
     */
    public Double inRangeTimeRatio() {
        return this.inRangeTimeRatio;
    }

    /**
     * Set the inRangeTimeRatio value.
     *
     * @param inRangeTimeRatio the inRangeTimeRatio value to set
     * @return the SloUsageMetric object itself.
     */
    public SloUsageMetric withInRangeTimeRatio(Double inRangeTimeRatio) {
        this.inRangeTimeRatio = inRangeTimeRatio;
        return this;
    }

}
