// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A segment of a compliance assessment. */
@Immutable
public final class ComplianceSegment {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ComplianceSegment.class);

    /*
     * The segment type, e.g. compliant, non-compliance, insufficient coverage,
     * N/A, etc.
     */
    @JsonProperty(value = "segmentType", access = JsonProperty.Access.WRITE_ONLY)
    private String segmentType;

    /*
     * The size (%) of the segment.
     */
    @JsonProperty(value = "percentage", access = JsonProperty.Access.WRITE_ONLY)
    private Double percentage;

    /**
     * Get the segmentType property: The segment type, e.g. compliant, non-compliance, insufficient coverage, N/A, etc.
     *
     * @return the segmentType value.
     */
    public String segmentType() {
        return this.segmentType;
    }

    /**
     * Get the percentage property: The size (%) of the segment.
     *
     * @return the percentage value.
     */
    public Double percentage() {
        return this.percentage;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
