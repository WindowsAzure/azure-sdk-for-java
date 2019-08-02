/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.implementation;

import com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.TargetComputeSizeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents applicable recovery vm sizes.
 */
public class TargetComputeSizeInner {
    /**
     * The Id.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The Type of the object.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * The custom data.
     */
    @JsonProperty(value = "properties")
    private TargetComputeSizeProperties properties;

    /**
     * Get the Id.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the Id.
     *
     * @param id the id value to set
     * @return the TargetComputeSizeInner object itself.
     */
    public TargetComputeSizeInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name.
     *
     * @param name the name value to set
     * @return the TargetComputeSizeInner object itself.
     */
    public TargetComputeSizeInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the Type of the object.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the Type of the object.
     *
     * @param type the type value to set
     * @return the TargetComputeSizeInner object itself.
     */
    public TargetComputeSizeInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the custom data.
     *
     * @return the properties value
     */
    public TargetComputeSizeProperties properties() {
        return this.properties;
    }

    /**
     * Set the custom data.
     *
     * @param properties the properties value to set
     * @return the TargetComputeSizeInner object itself.
     */
    public TargetComputeSizeInner withProperties(TargetComputeSizeProperties properties) {
        this.properties = properties;
        return this;
    }

}
