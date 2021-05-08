// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The parameters used to add a new Data Lake Store account. */
@JsonFlatten
@Fluent
public class AddDataLakeStoreParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AddDataLakeStoreParameters.class);

    /*
     * The optional suffix for the Data Lake Store account.
     */
    @JsonProperty(value = "properties.suffix")
    private String suffix;

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
     * @return the AddDataLakeStoreParameters object itself.
     */
    public AddDataLakeStoreParameters withSuffix(String suffix) {
        this.suffix = suffix;
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
