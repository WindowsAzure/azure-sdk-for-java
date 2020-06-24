// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The BootDiagnostics model. */
@Fluent
public final class BootDiagnostics {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BootDiagnostics.class);

    /*
     * Whether boot diagnostics should be enabled on the Virtual Machine.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /*
     * Uri of the storage account to use for placing the console output and
     * screenshot.
     */
    @JsonProperty(value = "storageUri")
    private String storageUri;

    /**
     * Get the enabled property: Whether boot diagnostics should be enabled on the Virtual Machine.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Whether boot diagnostics should be enabled on the Virtual Machine.
     *
     * @param enabled the enabled value to set.
     * @return the BootDiagnostics object itself.
     */
    public BootDiagnostics withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the storageUri property: Uri of the storage account to use for placing the console output and screenshot.
     *
     * @return the storageUri value.
     */
    public String storageUri() {
        return this.storageUri;
    }

    /**
     * Set the storageUri property: Uri of the storage account to use for placing the console output and screenshot.
     *
     * @param storageUri the storageUri value to set.
     * @return the BootDiagnostics object itself.
     */
    public BootDiagnostics withStorageUri(String storageUri) {
        this.storageUri = storageUri;
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
