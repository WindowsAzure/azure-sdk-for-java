// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The WatcherUpdateParameters model. */
@JsonFlatten
@Fluent
public class WatcherUpdateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WatcherUpdateParameters.class);

    /*
     * Gets or sets the name of the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Gets or sets the frequency at which the watcher is invoked.
     */
    @JsonProperty(value = "properties.executionFrequencyInSeconds")
    private Long executionFrequencyInSeconds;

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
     * @return the WatcherUpdateParameters object itself.
     */
    public WatcherUpdateParameters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the executionFrequencyInSeconds property: Gets or sets the frequency at which the watcher is invoked.
     *
     * @return the executionFrequencyInSeconds value.
     */
    public Long executionFrequencyInSeconds() {
        return this.executionFrequencyInSeconds;
    }

    /**
     * Set the executionFrequencyInSeconds property: Gets or sets the frequency at which the watcher is invoked.
     *
     * @param executionFrequencyInSeconds the executionFrequencyInSeconds value to set.
     * @return the WatcherUpdateParameters object itself.
     */
    public WatcherUpdateParameters withExecutionFrequencyInSeconds(Long executionFrequencyInSeconds) {
        this.executionFrequencyInSeconds = executionFrequencyInSeconds;
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