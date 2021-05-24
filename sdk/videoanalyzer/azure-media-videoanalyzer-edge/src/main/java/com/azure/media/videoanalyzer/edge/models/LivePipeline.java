// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.media.videoanalyzer.edge.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Live Pipeline represents an unique instance of a pipeline topology which is used for real-time content ingestion and
 * analysis.
 */
@Fluent
public class LivePipeline {
    /*
     * Live pipeline unique identifier.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Read-only system metadata associated with this object.
     */
    @JsonProperty(value = "systemData")
    private SystemData systemData;

    /*
     * Live pipeline properties.
     */
    @JsonProperty(value = "properties")
    private LivePipelineProperties properties;

    /**
     * Creates an instance of LivePipeline class.
     *
     * @param name the name value to set.
     */
    @JsonCreator
    public LivePipeline(@JsonProperty(value = "name", required = true) String name) {
        this.name = name;
    }

    /**
     * Get the name property: Live pipeline unique identifier.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the systemData property: Read-only system metadata associated with this object.
     *
     * @return the systemData value.
     */
    public SystemData getSystemData() {
        return this.systemData;
    }

    /**
     * Set the systemData property: Read-only system metadata associated with this object.
     *
     * @param systemData the systemData value to set.
     * @return the LivePipeline object itself.
     */
    public LivePipeline setSystemData(SystemData systemData) {
        this.systemData = systemData;
        return this;
    }

    /**
     * Get the properties property: Live pipeline properties.
     *
     * @return the properties value.
     */
    public LivePipelineProperties getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: Live pipeline properties.
     *
     * @param properties the properties value to set.
     * @return the LivePipeline object itself.
     */
    public LivePipeline setProperties(LivePipelineProperties properties) {
        this.properties = properties;
        return this;
    }
}
