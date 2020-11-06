/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_08_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Multichannel setting. Applies to Premium FileStorage only.
 */
public class Multichannel {
    /**
     * Indicates whether multichannel is enabled.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /**
     * Get indicates whether multichannel is enabled.
     *
     * @return the enabled value
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set indicates whether multichannel is enabled.
     *
     * @param enabled the enabled value to set
     * @return the Multichannel object itself.
     */
    public Multichannel withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

}
