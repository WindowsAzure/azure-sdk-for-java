/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance.v2018_02_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The environment variable to set within the container instance.
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
     * Get the name of the environment variable.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the environment variable.
     *
     * @param name the name value to set
     * @return the EnvironmentVariable object itself.
     */
    public EnvironmentVariable withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value of the environment variable.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value of the environment variable.
     *
     * @param value the value value to set
     * @return the EnvironmentVariable object itself.
     */
    public EnvironmentVariable withValue(String value) {
        this.value = value;
        return this;
    }

}
