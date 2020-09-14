/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_08_01_preview.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A list of private link resources.
 */
public class PrivateLinkResourceListResultInner {
    /**
     * Array of private link resources.
     */
    @JsonProperty(value = "value")
    private List<PrivateLinkResourceInner> value;

    /**
     * Get array of private link resources.
     *
     * @return the value value
     */
    public List<PrivateLinkResourceInner> value() {
        return this.value;
    }

    /**
     * Set array of private link resources.
     *
     * @param value the value value to set
     * @return the PrivateLinkResourceListResultInner object itself.
     */
    public PrivateLinkResourceListResultInner withValue(List<PrivateLinkResourceInner> value) {
        this.value = value;
        return this;
    }

}
