/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.keyvault.v2019_09_01.models;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters for patching a secret.
 */
public class SecretPatchParameters {
    /**
     * The tags that will be assigned to the secret.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Properties of the secret.
     */
    @JsonProperty(value = "properties")
    private SecretPatchProperties properties;

    /**
     * Get the tags that will be assigned to the secret.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags that will be assigned to the secret.
     *
     * @param tags the tags value to set
     * @return the SecretPatchParameters object itself.
     */
    public SecretPatchParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get properties of the secret.
     *
     * @return the properties value
     */
    public SecretPatchProperties properties() {
        return this.properties;
    }

    /**
     * Set properties of the secret.
     *
     * @param properties the properties value to set
     * @return the SecretPatchParameters object itself.
     */
    public SecretPatchParameters withProperties(SecretPatchProperties properties) {
        this.properties = properties;
        return this;
    }

}
