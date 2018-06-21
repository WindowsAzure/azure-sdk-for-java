/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2017_06_01_preview.implementation;

import java.util.List;
import com.microsoft.azure.management.containerregistry.v2017_06_01_preview.RegistryUsage;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The result of a request to get container registry quota usages.
 */
public class RegistryUsageListResultInner {
    /**
     * The list of container registry quota usages.
     */
    @JsonProperty(value = "value")
    private List<RegistryUsage> value;

    /**
     * Get the list of container registry quota usages.
     *
     * @return the value value
     */
    public List<RegistryUsage> value() {
        return this.value;
    }

    /**
     * Set the list of container registry quota usages.
     *
     * @param value the value value to set
     * @return the RegistryUsageListResultInner object itself.
     */
    public RegistryUsageListResultInner withValue(List<RegistryUsage> value) {
        this.value = value;
        return this;
    }

}
