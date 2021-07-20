// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Baseline details. */
@Fluent
public final class Baseline {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Baseline.class);

    /*
     * Expected results.
     */
    @JsonProperty(value = "expectedResults")
    private List<List<String>> expectedResults;

    /*
     * Baseline update time (UTC).
     */
    @JsonProperty(value = "updatedTime")
    private OffsetDateTime updatedTime;

    /**
     * Get the expectedResults property: Expected results.
     *
     * @return the expectedResults value.
     */
    public List<List<String>> expectedResults() {
        return this.expectedResults;
    }

    /**
     * Set the expectedResults property: Expected results.
     *
     * @param expectedResults the expectedResults value to set.
     * @return the Baseline object itself.
     */
    public Baseline withExpectedResults(List<List<String>> expectedResults) {
        this.expectedResults = expectedResults;
        return this;
    }

    /**
     * Get the updatedTime property: Baseline update time (UTC).
     *
     * @return the updatedTime value.
     */
    public OffsetDateTime updatedTime() {
        return this.updatedTime;
    }

    /**
     * Set the updatedTime property: Baseline update time (UTC).
     *
     * @param updatedTime the updatedTime value to set.
     * @return the Baseline object itself.
     */
    public Baseline withUpdatedTime(OffsetDateTime updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
