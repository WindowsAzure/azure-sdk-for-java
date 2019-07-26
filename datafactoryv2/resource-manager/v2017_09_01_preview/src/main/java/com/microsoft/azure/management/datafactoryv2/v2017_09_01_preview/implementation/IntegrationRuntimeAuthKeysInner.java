/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The integration runtime authentication keys.
 */
public class IntegrationRuntimeAuthKeysInner {
    /**
     * The primary integration runtime authentication key.
     */
    @JsonProperty(value = "authKey1")
    private String authKey1;

    /**
     * The secondary integration runtime authentication key.
     */
    @JsonProperty(value = "authKey2")
    private String authKey2;

    /**
     * Get the primary integration runtime authentication key.
     *
     * @return the authKey1 value
     */
    public String authKey1() {
        return this.authKey1;
    }

    /**
     * Set the primary integration runtime authentication key.
     *
     * @param authKey1 the authKey1 value to set
     * @return the IntegrationRuntimeAuthKeysInner object itself.
     */
    public IntegrationRuntimeAuthKeysInner withAuthKey1(String authKey1) {
        this.authKey1 = authKey1;
        return this;
    }

    /**
     * Get the secondary integration runtime authentication key.
     *
     * @return the authKey2 value
     */
    public String authKey2() {
        return this.authKey2;
    }

    /**
     * Set the secondary integration runtime authentication key.
     *
     * @param authKey2 the authKey2 value to set
     * @return the IntegrationRuntimeAuthKeysInner object itself.
     */
    public IntegrationRuntimeAuthKeysInner withAuthKey2(String authKey2) {
        this.authKey2 = authKey2;
        return this;
    }

}
