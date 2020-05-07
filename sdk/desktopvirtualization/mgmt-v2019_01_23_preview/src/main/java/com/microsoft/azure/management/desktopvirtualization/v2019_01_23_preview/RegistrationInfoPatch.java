/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.desktopvirtualization.v2019_01_23_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a RegistrationInfo definition.
 */
public class RegistrationInfoPatch {
    /**
     * Update registration token.
     */
    @JsonProperty(value = "resetToken")
    private Boolean resetToken;

    /**
     * Get update registration token.
     *
     * @return the resetToken value
     */
    public Boolean resetToken() {
        return this.resetToken;
    }

    /**
     * Set update registration token.
     *
     * @param resetToken the resetToken value to set
     * @return the RegistrationInfoPatch object itself.
     */
    public RegistrationInfoPatch withResetToken(Boolean resetToken) {
        this.resetToken = resetToken;
        return this;
    }

}
