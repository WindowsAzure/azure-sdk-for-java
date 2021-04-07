// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Update integration runtime request. */
@Fluent
public final class UpdateIntegrationRuntimeRequest {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UpdateIntegrationRuntimeRequest.class);

    /*
     * Enables or disables the auto-update feature of the self-hosted
     * integration runtime. See https://go.microsoft.com/fwlink/?linkid=854189.
     */
    @JsonProperty(value = "autoUpdate")
    private IntegrationRuntimeAutoUpdate autoUpdate;

    /*
     * The time offset (in hours) in the day, e.g., PT03H is 3 hours. The
     * integration runtime auto update will happen on that time.
     */
    @JsonProperty(value = "updateDelayOffset")
    private String updateDelayOffset;

    /**
     * Get the autoUpdate property: Enables or disables the auto-update feature of the self-hosted integration runtime.
     * See https://go.microsoft.com/fwlink/?linkid=854189.
     *
     * @return the autoUpdate value.
     */
    public IntegrationRuntimeAutoUpdate autoUpdate() {
        return this.autoUpdate;
    }

    /**
     * Set the autoUpdate property: Enables or disables the auto-update feature of the self-hosted integration runtime.
     * See https://go.microsoft.com/fwlink/?linkid=854189.
     *
     * @param autoUpdate the autoUpdate value to set.
     * @return the UpdateIntegrationRuntimeRequest object itself.
     */
    public UpdateIntegrationRuntimeRequest withAutoUpdate(IntegrationRuntimeAutoUpdate autoUpdate) {
        this.autoUpdate = autoUpdate;
        return this;
    }

    /**
     * Get the updateDelayOffset property: The time offset (in hours) in the day, e.g., PT03H is 3 hours. The
     * integration runtime auto update will happen on that time.
     *
     * @return the updateDelayOffset value.
     */
    public String updateDelayOffset() {
        return this.updateDelayOffset;
    }

    /**
     * Set the updateDelayOffset property: The time offset (in hours) in the day, e.g., PT03H is 3 hours. The
     * integration runtime auto update will happen on that time.
     *
     * @param updateDelayOffset the updateDelayOffset value to set.
     * @return the UpdateIntegrationRuntimeRequest object itself.
     */
    public UpdateIntegrationRuntimeRequest withUpdateDelayOffset(String updateDelayOffset) {
        this.updateDelayOffset = updateDelayOffset;
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
