/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.streamanalytics.v2016_03_01.implementation;

import com.microsoft.azure.management.streamanalytics.v2016_03_01.InputProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.SubResource;

/**
 * An input object, containing all information associated with the named input.
 * All inputs are contained under a streaming job.
 */
public class InputInner extends SubResource {
    /**
     * The properties that are associated with an input. Required on PUT
     * (CreateOrReplace) requests.
     */
    @JsonProperty(value = "properties")
    private InputProperties properties;

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
     * Get the properties that are associated with an input. Required on PUT (CreateOrReplace) requests.
     *
     * @return the properties value
     */
    public InputProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties that are associated with an input. Required on PUT (CreateOrReplace) requests.
     *
     * @param properties the properties value to set
     * @return the InputInner object itself.
     */
    public InputInner withProperties(InputProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get resource name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set resource name.
     *
     * @param name the name value to set
     * @return the InputInner object itself.
     */
    public InputInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get resource type.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

}
