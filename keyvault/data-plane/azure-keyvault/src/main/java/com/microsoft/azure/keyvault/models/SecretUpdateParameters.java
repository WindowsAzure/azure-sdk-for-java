// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.keyvault.models;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The secret update parameters.
 */
public class SecretUpdateParameters {
    /**
     * Type of the secret value such as a password.
     */
    @JsonProperty(value = "contentType")
    private String contentType;

    /**
     * The secret management attributes.
     */
    @JsonProperty(value = "attributes")
    private SecretAttributes secretAttributes;

    /**
     * Application specific metadata in the form of key-value pairs.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get the contentType value.
     *
     * @return the contentType value
     */
    public String contentType() {
        return this.contentType;
    }

    /**
     * Set the contentType value.
     *
     * @param contentType the contentType value to set
     * @return the SecretUpdateParameters object itself.
     */
    public SecretUpdateParameters withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get the secretAttributes value.
     *
     * @return the secretAttributes value
     */
    public SecretAttributes secretAttributes() {
        return this.secretAttributes;
    }

    /**
     * Set the secretAttributes value.
     *
     * @param secretAttributes the secretAttributes value to set
     * @return the SecretUpdateParameters object itself.
     */
    public SecretUpdateParameters withSecretAttributes(SecretAttributes secretAttributes) {
        this.secretAttributes = secretAttributes;
        return this;
    }

    /**
     * Get the tags value.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags value.
     *
     * @param tags the tags value to set
     * @return the SecretUpdateParameters object itself.
     */
    public SecretUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

}
