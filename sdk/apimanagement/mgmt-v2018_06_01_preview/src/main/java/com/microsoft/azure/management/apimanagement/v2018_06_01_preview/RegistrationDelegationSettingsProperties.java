/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * User registration delegation settings properties.
 */
public class RegistrationDelegationSettingsProperties {
    /**
     * Enable or disable delegation for user registration.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /**
     * Get enable or disable delegation for user registration.
     *
     * @return the enabled value
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set enable or disable delegation for user registration.
     *
     * @param enabled the enabled value to set
     * @return the RegistrationDelegationSettingsProperties object itself.
     */
    public RegistrationDelegationSettingsProperties withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

}
