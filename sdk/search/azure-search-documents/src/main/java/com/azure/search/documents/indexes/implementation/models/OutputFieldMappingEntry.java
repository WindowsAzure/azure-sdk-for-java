// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The OutputFieldMappingEntry model. */
@Fluent
public final class OutputFieldMappingEntry {
    /*
     * The name of the output defined by the skill.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The target name of the output. It is optional and default to name.
     */
    @JsonProperty(value = "targetName")
    private String targetName;

    /** Creates an instance of OutputFieldMappingEntry class. */
    @JsonCreator
    public OutputFieldMappingEntry(@JsonProperty(value = "name", required = true) String name) {
        this.name = name;
    }

    /**
     * Get the name property: The name of the output defined by the skill.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the output defined by the skill.
     *
     * @param name the name value to set.
     * @return the OutputFieldMappingEntry object itself.
     */
    /**
     * Get the targetName property: The target name of the output. It is optional and default to name.
     *
     * @return the targetName value.
     */
    public String getTargetName() {
        return this.targetName;
    }

    /**
     * Set the targetName property: The target name of the output. It is optional and default to name.
     *
     * @param targetName the targetName value to set.
     * @return the OutputFieldMappingEntry object itself.
     */
    public OutputFieldMappingEntry setTargetName(String targetName) {
        this.targetName = targetName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getName() == null) {
            throw new IllegalArgumentException("Missing required property name in model OutputFieldMappingEntry");
        }
    }
}
