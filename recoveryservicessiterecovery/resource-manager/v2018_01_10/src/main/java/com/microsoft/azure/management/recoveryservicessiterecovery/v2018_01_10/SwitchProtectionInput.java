/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Switch protection input.
 */
public class SwitchProtectionInput {
    /**
     * Switch protection properties.
     */
    @JsonProperty(value = "properties")
    private SwitchProtectionInputProperties properties;

    /**
     * Get switch protection properties.
     *
     * @return the properties value
     */
    public SwitchProtectionInputProperties properties() {
        return this.properties;
    }

    /**
     * Set switch protection properties.
     *
     * @param properties the properties value to set
     * @return the SwitchProtectionInput object itself.
     */
    public SwitchProtectionInput withProperties(SwitchProtectionInputProperties properties) {
        this.properties = properties;
        return this;
    }

}
