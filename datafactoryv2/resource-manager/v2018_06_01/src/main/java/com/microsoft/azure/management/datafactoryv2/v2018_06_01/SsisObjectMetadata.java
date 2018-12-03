/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Ssis object metadata.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SsisObjectMetadata")
public class SsisObjectMetadata {
    /**
     * Metadata id.
     */
    @JsonProperty(value = "id")
    private Long id;

    /**
     * Metadata name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Metadata description.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get metadata id.
     *
     * @return the id value
     */
    public Long id() {
        return this.id;
    }

    /**
     * Set metadata id.
     *
     * @param id the id value to set
     * @return the SsisObjectMetadata object itself.
     */
    public SsisObjectMetadata withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get metadata name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set metadata name.
     *
     * @param name the name value to set
     * @return the SsisObjectMetadata object itself.
     */
    public SsisObjectMetadata withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get metadata description.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set metadata description.
     *
     * @param description the description value to set
     * @return the SsisObjectMetadata object itself.
     */
    public SsisObjectMetadata withDescription(String description) {
        this.description = description;
        return this;
    }

}
