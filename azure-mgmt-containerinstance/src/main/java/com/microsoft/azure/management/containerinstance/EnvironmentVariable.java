/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Environment variable to set within the container.
 */
public class EnvironmentVariable {
    /**
     * The name of the environment variable.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The value of the environment variable.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the EnvironmentVariable object itself.
     */
    public EnvironmentVariable withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     * @return the EnvironmentVariable object itself.
     */
    public EnvironmentVariable withValue(String value) {
        this.value = value;
        return this;
    }

}
