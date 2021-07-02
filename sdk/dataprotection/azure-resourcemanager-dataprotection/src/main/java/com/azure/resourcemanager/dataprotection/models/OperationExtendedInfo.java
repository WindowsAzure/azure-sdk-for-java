// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Operation Extended Info. */
@Fluent
public class OperationExtendedInfo {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationExtendedInfo.class);

    /*
     * This property will be used as the discriminator for deciding the
     * specific types in the polymorphic chain of types.
     */
    @JsonProperty(value = "objectType")
    private String objectType;

    /**
     * Get the objectType property: This property will be used as the discriminator for deciding the specific types in
     * the polymorphic chain of types.
     *
     * @return the objectType value.
     */
    public String objectType() {
        return this.objectType;
    }

    /**
     * Set the objectType property: This property will be used as the discriminator for deciding the specific types in
     * the polymorphic chain of types.
     *
     * @param objectType the objectType value to set.
     * @return the OperationExtendedInfo object itself.
     */
    public OperationExtendedInfo withObjectType(String objectType) {
        this.objectType = objectType;
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
