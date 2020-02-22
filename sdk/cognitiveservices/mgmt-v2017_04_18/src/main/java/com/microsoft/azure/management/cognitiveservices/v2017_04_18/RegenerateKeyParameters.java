/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cognitiveservices.v2017_04_18;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Regenerate key parameters.
 */
public class RegenerateKeyParameters {
    /**
     * key name to generate (Key1|Key2). Possible values include: 'Key1',
     * 'Key2'.
     */
    @JsonProperty(value = "keyName", required = true)
    private KeyName keyName;

    /**
     * Get key name to generate (Key1|Key2). Possible values include: 'Key1', 'Key2'.
     *
     * @return the keyName value
     */
    public KeyName keyName() {
        return this.keyName;
    }

    /**
     * Set key name to generate (Key1|Key2). Possible values include: 'Key1', 'Key2'.
     *
     * @param keyName the keyName value to set
     * @return the RegenerateKeyParameters object itself.
     */
    public RegenerateKeyParameters withKeyName(KeyName keyName) {
        this.keyName = keyName;
        return this;
    }

}
