/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.streamanalytics.v2016_03_01.implementation;

import com.microsoft.azure.management.streamanalytics.v2016_03_01.FunctionProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.SubResource;

/**
 * A function object, containing all information associated with the named
 * function. All functions are contained under a streaming job.
 */
public class FunctionInner extends SubResource {
    /**
     * The properties that are associated with a function.
     */
    @JsonProperty(value = "properties")
    private FunctionProperties properties;

    /**
     * Resource name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public FunctionProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     * @return the FunctionInner object itself.
     */
    public FunctionInner withProperties(FunctionProperties properties) {
        this.properties = properties;
        return this;
    }

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
     * @return the FunctionInner object itself.
     */
    public FunctionInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

}
