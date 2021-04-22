// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Defines reference to an Azure resource. */
@Fluent
public class AzureResourceReference {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureResourceReference.class);

    /*
     * Gets the ARM resource ID of the tracked resource being referenced.
     */
    @JsonProperty(value = "sourceArmResourceId", required = true)
    private String sourceArmResourceId;

    /**
     * Get the sourceArmResourceId property: Gets the ARM resource ID of the tracked resource being referenced.
     *
     * @return the sourceArmResourceId value.
     */
    public String sourceArmResourceId() {
        return this.sourceArmResourceId;
    }

    /**
     * Set the sourceArmResourceId property: Gets the ARM resource ID of the tracked resource being referenced.
     *
     * @param sourceArmResourceId the sourceArmResourceId value to set.
     * @return the AzureResourceReference object itself.
     */
    public AzureResourceReference withSourceArmResourceId(String sourceArmResourceId) {
        this.sourceArmResourceId = sourceArmResourceId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sourceArmResourceId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property sourceArmResourceId in model AzureResourceReference"));
        }
    }
}