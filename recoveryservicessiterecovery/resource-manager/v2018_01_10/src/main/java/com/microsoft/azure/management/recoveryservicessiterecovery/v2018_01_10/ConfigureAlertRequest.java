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
 * Request to configure alerts for the system.
 */
public class ConfigureAlertRequest {
    /**
     * The properties of a configure alert request.
     */
    @JsonProperty(value = "properties")
    private ConfigureAlertRequestProperties properties;

    /**
     * Get the properties of a configure alert request.
     *
     * @return the properties value
     */
    public ConfigureAlertRequestProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties of a configure alert request.
     *
     * @param properties the properties value to set
     * @return the ConfigureAlertRequest object itself.
     */
    public ConfigureAlertRequest withProperties(ConfigureAlertRequestProperties properties) {
        this.properties = properties;
        return this;
    }

}
