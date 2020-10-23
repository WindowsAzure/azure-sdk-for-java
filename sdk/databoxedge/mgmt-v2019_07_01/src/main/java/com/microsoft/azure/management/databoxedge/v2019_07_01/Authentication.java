/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2019_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Authentication mechanism for IoT devices.
 */
public class Authentication {
    /**
     * Symmetric key for authentication.
     */
    @JsonProperty(value = "symmetricKey")
    private SymmetricKey symmetricKey;

    /**
     * Get symmetric key for authentication.
     *
     * @return the symmetricKey value
     */
    public SymmetricKey symmetricKey() {
        return this.symmetricKey;
    }

    /**
     * Set symmetric key for authentication.
     *
     * @param symmetricKey the symmetricKey value to set
     * @return the Authentication object itself.
     */
    public Authentication withSymmetricKey(SymmetricKey symmetricKey) {
        this.symmetricKey = symmetricKey;
        return this;
    }

}
