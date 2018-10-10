/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the parameters for unprovisioning a cluster.
 */
public class UnprovisionFabricDescription {
    /**
     * The cluster code package version.
     */
    @JsonProperty(value = "CodeVersion")
    private String codeVersion;

    /**
     * The cluster manifest version.
     */
    @JsonProperty(value = "ConfigVersion")
    private String configVersion;

    /**
     * Get the cluster code package version.
     *
     * @return the codeVersion value
     */
    public String codeVersion() {
        return this.codeVersion;
    }

    /**
     * Set the cluster code package version.
     *
     * @param codeVersion the codeVersion value to set
     * @return the UnprovisionFabricDescription object itself.
     */
    public UnprovisionFabricDescription withCodeVersion(String codeVersion) {
        this.codeVersion = codeVersion;
        return this;
    }

    /**
     * Get the cluster manifest version.
     *
     * @return the configVersion value
     */
    public String configVersion() {
        return this.configVersion;
    }

    /**
     * Set the cluster manifest version.
     *
     * @param configVersion the configVersion value to set
     * @return the UnprovisionFabricDescription object itself.
     */
    public UnprovisionFabricDescription withConfigVersion(String configVersion) {
        this.configVersion = configVersion;
        return this;
    }

}
