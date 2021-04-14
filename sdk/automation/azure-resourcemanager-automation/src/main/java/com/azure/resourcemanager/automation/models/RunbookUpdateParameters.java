// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The parameters supplied to the update runbook operation. */
@JsonFlatten
@Fluent
public class RunbookUpdateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RunbookUpdateParameters.class);

    /*
     * Gets or sets the name of the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Gets or sets the location of the resource.
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * Gets or sets the tags attached to the resource.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * Gets or sets the description of the runbook.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /*
     * Gets or sets verbose log option.
     */
    @JsonProperty(value = "properties.logVerbose")
    private Boolean logVerbose;

    /*
     * Gets or sets progress log option.
     */
    @JsonProperty(value = "properties.logProgress")
    private Boolean logProgress;

    /*
     * Gets or sets the activity-level tracing options of the runbook.
     */
    @JsonProperty(value = "properties.logActivityTrace")
    private Integer logActivityTrace;

    /**
     * Get the name property: Gets or sets the name of the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Gets or sets the name of the resource.
     *
     * @param name the name value to set.
     * @return the RunbookUpdateParameters object itself.
     */
    public RunbookUpdateParameters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the location property: Gets or sets the location of the resource.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Gets or sets the location of the resource.
     *
     * @param location the location value to set.
     * @return the RunbookUpdateParameters object itself.
     */
    public RunbookUpdateParameters withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the tags property: Gets or sets the tags attached to the resource.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Gets or sets the tags attached to the resource.
     *
     * @param tags the tags value to set.
     * @return the RunbookUpdateParameters object itself.
     */
    public RunbookUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the description property: Gets or sets the description of the runbook.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Gets or sets the description of the runbook.
     *
     * @param description the description value to set.
     * @return the RunbookUpdateParameters object itself.
     */
    public RunbookUpdateParameters withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the logVerbose property: Gets or sets verbose log option.
     *
     * @return the logVerbose value.
     */
    public Boolean logVerbose() {
        return this.logVerbose;
    }

    /**
     * Set the logVerbose property: Gets or sets verbose log option.
     *
     * @param logVerbose the logVerbose value to set.
     * @return the RunbookUpdateParameters object itself.
     */
    public RunbookUpdateParameters withLogVerbose(Boolean logVerbose) {
        this.logVerbose = logVerbose;
        return this;
    }

    /**
     * Get the logProgress property: Gets or sets progress log option.
     *
     * @return the logProgress value.
     */
    public Boolean logProgress() {
        return this.logProgress;
    }

    /**
     * Set the logProgress property: Gets or sets progress log option.
     *
     * @param logProgress the logProgress value to set.
     * @return the RunbookUpdateParameters object itself.
     */
    public RunbookUpdateParameters withLogProgress(Boolean logProgress) {
        this.logProgress = logProgress;
        return this;
    }

    /**
     * Get the logActivityTrace property: Gets or sets the activity-level tracing options of the runbook.
     *
     * @return the logActivityTrace value.
     */
    public Integer logActivityTrace() {
        return this.logActivityTrace;
    }

    /**
     * Set the logActivityTrace property: Gets or sets the activity-level tracing options of the runbook.
     *
     * @param logActivityTrace the logActivityTrace value to set.
     * @return the RunbookUpdateParameters object itself.
     */
    public RunbookUpdateParameters withLogActivityTrace(Integer logActivityTrace) {
        this.logActivityTrace = logActivityTrace;
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
