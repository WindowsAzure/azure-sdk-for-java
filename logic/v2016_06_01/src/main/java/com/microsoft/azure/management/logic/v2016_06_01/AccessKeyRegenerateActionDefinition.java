/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The AccessKeyRegenerateActionDefinition model.
 */
public class AccessKeyRegenerateActionDefinition {
    /**
     * Possible values include: 'NotSpecified', 'Primary', 'Secondary'.
     */
    @JsonProperty(value = "keyType", required = true)
    private AccessKeyType keyType;

    /**
     * Get the keyType value.
     *
     * @return the keyType value
     */
    public AccessKeyType keyType() {
        return this.keyType;
    }

    /**
     * Set the keyType value.
     *
     * @param keyType the keyType value to set
     * @return the AccessKeyRegenerateActionDefinition object itself.
     */
    public AccessKeyRegenerateActionDefinition withKeyType(AccessKeyType keyType) {
        this.keyType = keyType;
        return this;
    }

}
