// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The parameters used to update an Azure Storage account while updating a Data Lake Analytics account. */
@JsonFlatten
@Fluent
public class UpdateStorageAccountWithAccountParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UpdateStorageAccountWithAccountParameters.class);

    /*
     * The unique name of the Azure Storage account to update.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The updated access key associated with this Azure Storage account that
     * will be used to connect to it.
     */
    @JsonProperty(value = "properties.accessKey")
    private String accessKey;

    /*
     * The optional suffix for the storage account.
     */
    @JsonProperty(value = "properties.suffix")
    private String suffix;

    /**
     * Get the name property: The unique name of the Azure Storage account to update.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The unique name of the Azure Storage account to update.
     *
     * @param name the name value to set.
     * @return the UpdateStorageAccountWithAccountParameters object itself.
     */
    public UpdateStorageAccountWithAccountParameters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the accessKey property: The updated access key associated with this Azure Storage account that will be used
     * to connect to it.
     *
     * @return the accessKey value.
     */
    public String accessKey() {
        return this.accessKey;
    }

    /**
     * Set the accessKey property: The updated access key associated with this Azure Storage account that will be used
     * to connect to it.
     *
     * @param accessKey the accessKey value to set.
     * @return the UpdateStorageAccountWithAccountParameters object itself.
     */
    public UpdateStorageAccountWithAccountParameters withAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    /**
     * Get the suffix property: The optional suffix for the storage account.
     *
     * @return the suffix value.
     */
    public String suffix() {
        return this.suffix;
    }

    /**
     * Set the suffix property: The optional suffix for the storage account.
     *
     * @param suffix the suffix value to set.
     * @return the UpdateStorageAccountWithAccountParameters object itself.
     */
    public UpdateStorageAccountWithAccountParameters withSuffix(String suffix) {
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
                        "Missing required property name in model UpdateStorageAccountWithAccountParameters"));
        }
    }
}
