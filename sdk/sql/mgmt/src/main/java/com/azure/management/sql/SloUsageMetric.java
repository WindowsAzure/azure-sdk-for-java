// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

/** The SloUsageMetric model. */
@Immutable
public final class SloUsageMetric {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SloUsageMetric.class);

    /*
     * The serviceLevelObjective for SLO usage metric.
     */
    @JsonProperty(value = "serviceLevelObjective", access = JsonProperty.Access.WRITE_ONLY)
    private ServiceObjectiveName serviceLevelObjective;

    /*
     * The serviceLevelObjectiveId for SLO usage metric.
     */
    @JsonProperty(value = "serviceLevelObjectiveId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID serviceLevelObjectiveId;

    /*
     * Gets or sets inRangeTimeRatio for SLO usage metric.
     */
    @JsonProperty(value = "inRangeTimeRatio", access = JsonProperty.Access.WRITE_ONLY)
    private Double inRangeTimeRatio;

    /**
     * Get the serviceLevelObjective property: The serviceLevelObjective for SLO usage metric.
     *
     * @return the serviceLevelObjective value.
     */
    public ServiceObjectiveName serviceLevelObjective() {
        return this.serviceLevelObjective;
    }

    /**
     * Get the serviceLevelObjectiveId property: The serviceLevelObjectiveId for SLO usage metric.
     *
     * @return the serviceLevelObjectiveId value.
     */
    public UUID serviceLevelObjectiveId() {
        return this.serviceLevelObjectiveId;
    }

    /**
     * Get the inRangeTimeRatio property: Gets or sets inRangeTimeRatio for SLO usage metric.
     *
     * @return the inRangeTimeRatio value.
     */
    public Double inRangeTimeRatio() {
        return this.inRangeTimeRatio;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
