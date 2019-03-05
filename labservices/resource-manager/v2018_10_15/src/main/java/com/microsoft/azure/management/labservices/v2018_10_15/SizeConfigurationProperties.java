/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.labservices.v2018_10_15;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents the size configuration under the lab account.
 */
public class SizeConfigurationProperties {
    /**
     * Represents a list of size categories supported by this Lab Account
     * (Small, Medium, Large).
     */
    @JsonProperty(value = "environmentSizes")
    private List<EnvironmentSize> environmentSizes;

    /**
     * Get represents a list of size categories supported by this Lab Account (Small, Medium, Large).
     *
     * @return the environmentSizes value
     */
    public List<EnvironmentSize> environmentSizes() {
        return this.environmentSizes;
    }

    /**
     * Set represents a list of size categories supported by this Lab Account (Small, Medium, Large).
     *
     * @param environmentSizes the environmentSizes value to set
     * @return the SizeConfigurationProperties object itself.
     */
    public SizeConfigurationProperties withEnvironmentSizes(List<EnvironmentSize> environmentSizes) {
        this.environmentSizes = environmentSizes;
        return this;
    }

}
