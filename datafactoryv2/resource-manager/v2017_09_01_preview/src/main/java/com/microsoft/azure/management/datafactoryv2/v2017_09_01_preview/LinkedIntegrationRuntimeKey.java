/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The base definition of a secret type.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "authorizationType")
@JsonTypeName("Key")
public class LinkedIntegrationRuntimeKey extends LinkedIntegrationRuntimeProperties {
    /**
     * Type of the secret.
     */
    @JsonProperty(value = "key", required = true)
    private SecureString key;

    /**
     * Get type of the secret.
     *
     * @return the key value
     */
    public SecureString key() {
        return this.key;
    }

    /**
     * Set type of the secret.
     *
     * @param key the key value to set
     * @return the LinkedIntegrationRuntimeKey object itself.
     */
    public LinkedIntegrationRuntimeKey withKey(SecureString key) {
        this.key = key;
        return this;
    }

}
