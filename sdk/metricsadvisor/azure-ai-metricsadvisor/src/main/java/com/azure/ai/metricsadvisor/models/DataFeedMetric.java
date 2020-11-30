// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DataFeedMetric model. */
@Fluent
public final class DataFeedMetric {
    /*
     * metric id
     */
    @JsonProperty(value = "metricId", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * metric name
     */
    @JsonProperty(value = "metricName", required = true)
    private String name;

    /*
     * metric display name
     */
    @JsonProperty(value = "metricDisplayName")
    private String displayName;

    /*
     * metric description
     */
    @JsonProperty(value = "metricDescription")
    private String description;

    /**
     * Get the id property: metric id.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the name property: metric name.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: metric name.
     *
     * @param name the name value to set.
     * @return the DataFeedMetric object itself.
     */
    public DataFeedMetric setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the displayName property: metric display name.
     *
     * @return the displayName value.
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: metric display name.
     *
     * @param displayName the displayName value to set.
     * @return the DataFeedMetric object itself.
     */
    public DataFeedMetric setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the description property: metric description.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: metric description.
     *
     * @param description the description value to set.
     * @return the DataFeedMetric object itself.
     */
    public DataFeedMetric setDescription(String description) {
        this.description = description;
        return this;
    }
}
