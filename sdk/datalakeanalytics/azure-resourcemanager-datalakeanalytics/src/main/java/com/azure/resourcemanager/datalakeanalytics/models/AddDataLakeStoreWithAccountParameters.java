// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The parameters used to add a new Data Lake Store account while creating a new Data Lake Analytics account. */
@JsonFlatten
@Fluent
public class AddDataLakeStoreWithAccountParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AddDataLakeStoreWithAccountParameters.class);

    /*
     * The unique name of the Data Lake Store account to add.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The optional suffix for the Data Lake Store account.
     */
    @JsonProperty(value = "properties.suffix")
    private String suffix;

    /**
     * Get the name property: The unique name of the Data Lake Store account to add.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The unique name of the Data Lake Store account to add.
     *
     * @param name the name value to set.
     * @return the AddDataLakeStoreWithAccountParameters object itself.
     */
    public AddDataLakeStoreWithAccountParameters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the suffix property: The optional suffix for the Data Lake Store account.
     *
     * @return the suffix value.
     */
    public String suffix() {
        return this.suffix;
    }

    /**
     * Set the suffix property: The optional suffix for the Data Lake Store account.
     *
     * @param suffix the suffix value to set.
     * @return the AddDataLakeStoreWithAccountParameters object itself.
     */
    public AddDataLakeStoreWithAccountParameters withSuffix(String suffix) {
        this.suffix = suffix;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property name in model AddDataLakeStoreWithAccountParameters"));
        }
    }
}
