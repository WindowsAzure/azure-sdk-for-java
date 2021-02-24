// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redisenterprise.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Parameters for a Redis Enterprise import operation. */
@Fluent
public final class ImportClusterParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ImportClusterParameters.class);

    /*
     * SAS URI for the target blob to import from
     */
    @JsonProperty(value = "sasUri", required = true)
    private String sasUri;

    /**
     * Get the sasUri property: SAS URI for the target blob to import from.
     *
     * @return the sasUri value.
     */
    public String sasUri() {
        return this.sasUri;
    }

    /**
     * Set the sasUri property: SAS URI for the target blob to import from.
     *
     * @param sasUri the sasUri value to set.
     * @return the ImportClusterParameters object itself.
     */
    public ImportClusterParameters withSasUri(String sasUri) {
        this.sasUri = sasUri;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sasUri() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property sasUri in model ImportClusterParameters"));
        }
    }
}
