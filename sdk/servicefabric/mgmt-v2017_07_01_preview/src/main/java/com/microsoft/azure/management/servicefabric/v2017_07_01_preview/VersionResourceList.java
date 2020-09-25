/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabric.v2017_07_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The list of version resources for the specified application type name.
 */
public class VersionResourceList {
    /**
     * The value property.
     */
    @JsonProperty(value = "value")
    private List<VersionResource> value;

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public List<VersionResource> value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     * @return the VersionResourceList object itself.
     */
    public VersionResourceList withValue(List<VersionResource> value) {
        this.value = value;
        return this;
    }

}
