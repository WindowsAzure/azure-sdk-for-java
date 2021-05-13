// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The dataset reference object. */
@Fluent
public final class DatasetReference {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DatasetReference.class);

    /*
     * The name of the dataset reference.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The id of the dataset reference.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the name property: The name of the dataset reference.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the dataset reference.
     *
     * @param name the name value to set.
     * @return the DatasetReference object itself.
     */
    public DatasetReference withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the id property: The id of the dataset reference.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The id of the dataset reference.
     *
     * @param id the id value to set.
     * @return the DatasetReference object itself.
     */
    public DatasetReference withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
