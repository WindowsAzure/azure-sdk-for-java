/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters to regenerate the authentication key.
 */
public class IntegrationRuntimeRegenerateKeyParameters {
    /**
     * The name of the authentication key to regenerate. Possible values
     * include: 'authKey1', 'authKey2'.
     */
    @JsonProperty(value = "keyName")
    private IntegrationRuntimeAuthKeyName keyName;

    /**
     * Get the name of the authentication key to regenerate. Possible values include: 'authKey1', 'authKey2'.
     *
     * @return the keyName value
     */
    public IntegrationRuntimeAuthKeyName keyName() {
        return this.keyName;
    }

    /**
     * Set the name of the authentication key to regenerate. Possible values include: 'authKey1', 'authKey2'.
     *
     * @param keyName the keyName value to set
     * @return the IntegrationRuntimeRegenerateKeyParameters object itself.
     */
    public IntegrationRuntimeRegenerateKeyParameters withKeyName(IntegrationRuntimeAuthKeyName keyName) {
        this.keyName = keyName;
        return this;
    }

}
