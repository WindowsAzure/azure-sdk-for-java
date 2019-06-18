/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.v2018_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An environment variable with secret value definition.
 */
public class EnvironmentVariableWithSecretValue {
    /**
     * Name.
     * The name of the environment variable to store the secret value.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Value.
     * The value of the environment variable. This value will never be reported
     * back by Batch AI.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * KeyVault secret reference.
     * KeyVault store and secret which contains the value for the environment
     * variable. One of value or valueSecretReference must be provided.
     */
    @JsonProperty(value = "valueSecretReference")
    private KeyVaultSecretReference valueSecretReference;

    /**
     * Get the name of the environment variable to store the secret value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the environment variable to store the secret value.
     *
     * @param name the name value to set
     * @return the EnvironmentVariableWithSecretValue object itself.
     */
    public EnvironmentVariableWithSecretValue withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value of the environment variable. This value will never be reported back by Batch AI.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value of the environment variable. This value will never be reported back by Batch AI.
     *
     * @param value the value value to set
     * @return the EnvironmentVariableWithSecretValue object itself.
     */
    public EnvironmentVariableWithSecretValue withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get keyVault store and secret which contains the value for the environment variable. One of value or valueSecretReference must be provided.
     *
     * @return the valueSecretReference value
     */
    public KeyVaultSecretReference valueSecretReference() {
        return this.valueSecretReference;
    }

    /**
     * Set keyVault store and secret which contains the value for the environment variable. One of value or valueSecretReference must be provided.
     *
     * @param valueSecretReference the valueSecretReference value to set
     * @return the EnvironmentVariableWithSecretValue object itself.
     */
    public EnvironmentVariableWithSecretValue withValueSecretReference(KeyVaultSecretReference valueSecretReference) {
        this.valueSecretReference = valueSecretReference;
        return this;
    }

}
