/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information about a Service Fabric config version.
 */
public class FabricConfigVersionInfoInner {
    /**
     * The config version of Service Fabric.
     */
    @JsonProperty(value = "ConfigVersion")
    private String configVersion;

    /**
     * Get the config version of Service Fabric.
     *
     * @return the configVersion value
     */
    public String configVersion() {
        return this.configVersion;
    }

    /**
     * Set the config version of Service Fabric.
     *
     * @param configVersion the configVersion value to set
     * @return the FabricConfigVersionInfoInner object itself.
     */
    public FabricConfigVersionInfoInner withConfigVersion(String configVersion) {
        this.configVersion = configVersion;
        return this;
    }

}
