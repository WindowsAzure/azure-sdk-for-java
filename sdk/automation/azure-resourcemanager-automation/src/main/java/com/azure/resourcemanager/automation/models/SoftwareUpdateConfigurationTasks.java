// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Task properties of the software update configuration. */
@Fluent
public final class SoftwareUpdateConfigurationTasks {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SoftwareUpdateConfigurationTasks.class);

    /*
     * Pre task properties.
     */
    @JsonProperty(value = "preTask")
    private TaskProperties preTask;

    /*
     * Post task properties.
     */
    @JsonProperty(value = "postTask")
    private TaskProperties postTask;

    /**
     * Get the preTask property: Pre task properties.
     *
     * @return the preTask value.
     */
    public TaskProperties preTask() {
        return this.preTask;
    }

    /**
     * Set the preTask property: Pre task properties.
     *
     * @param preTask the preTask value to set.
     * @return the SoftwareUpdateConfigurationTasks object itself.
     */
    public SoftwareUpdateConfigurationTasks withPreTask(TaskProperties preTask) {
        this.preTask = preTask;
        return this;
    }

    /**
     * Get the postTask property: Post task properties.
     *
     * @return the postTask value.
     */
    public TaskProperties postTask() {
        return this.postTask;
    }

    /**
     * Set the postTask property: Post task properties.
     *
     * @param postTask the postTask value to set.
     * @return the SoftwareUpdateConfigurationTasks object itself.
     */
    public SoftwareUpdateConfigurationTasks withPostTask(TaskProperties postTask) {
        this.postTask = postTask;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (preTask() != null) {
            preTask().validate();
        }
        if (postTask() != null) {
            postTask().validate();
        }
    }
}
