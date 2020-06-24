// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AutomaticOSUpgradeProperties model. */
@Fluent
public final class AutomaticOSUpgradeProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AutomaticOSUpgradeProperties.class);

    /*
     * Specifies whether automatic OS upgrade is supported on the image.
     */
    @JsonProperty(value = "automaticOSUpgradeSupported", required = true)
    private boolean automaticOSUpgradeSupported;

    /**
     * Get the automaticOSUpgradeSupported property: Specifies whether automatic OS upgrade is supported on the image.
     *
     * @return the automaticOSUpgradeSupported value.
     */
    public boolean automaticOSUpgradeSupported() {
        return this.automaticOSUpgradeSupported;
    }

    /**
     * Set the automaticOSUpgradeSupported property: Specifies whether automatic OS upgrade is supported on the image.
     *
     * @param automaticOSUpgradeSupported the automaticOSUpgradeSupported value to set.
     * @return the AutomaticOSUpgradeProperties object itself.
     */
    public AutomaticOSUpgradeProperties withAutomaticOSUpgradeSupported(boolean automaticOSUpgradeSupported) {
        this.automaticOSUpgradeSupported = automaticOSUpgradeSupported;
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
