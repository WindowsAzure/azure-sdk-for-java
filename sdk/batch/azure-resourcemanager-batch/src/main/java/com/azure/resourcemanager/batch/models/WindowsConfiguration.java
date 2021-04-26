// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Windows operating system settings to apply to the virtual machine. */
@Fluent
public final class WindowsConfiguration {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WindowsConfiguration.class);

    /*
     * If omitted, the default value is true.
     */
    @JsonProperty(value = "enableAutomaticUpdates")
    private Boolean enableAutomaticUpdates;

    /**
     * Get the enableAutomaticUpdates property: If omitted, the default value is true.
     *
     * @return the enableAutomaticUpdates value.
     */
    public Boolean enableAutomaticUpdates() {
        return this.enableAutomaticUpdates;
    }

    /**
     * Set the enableAutomaticUpdates property: If omitted, the default value is true.
     *
     * @param enableAutomaticUpdates the enableAutomaticUpdates value to set.
     * @return the WindowsConfiguration object itself.
     */
    public WindowsConfiguration withEnableAutomaticUpdates(Boolean enableAutomaticUpdates) {
        this.enableAutomaticUpdates = enableAutomaticUpdates;
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
