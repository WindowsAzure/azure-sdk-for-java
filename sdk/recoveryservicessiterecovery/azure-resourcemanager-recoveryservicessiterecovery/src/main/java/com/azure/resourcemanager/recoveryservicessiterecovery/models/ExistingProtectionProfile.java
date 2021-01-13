// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Existing storage account input. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resourceType")
@JsonTypeName("Existing")
@Fluent
public final class ExistingProtectionProfile extends ProtectionProfileCustomDetails {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExistingProtectionProfile.class);

    /*
     * The protection profile Arm Id. Throw error, if resource does not exists.
     */
    @JsonProperty(value = "protectionProfileId", required = true)
    private String protectionProfileId;

    /**
     * Get the protectionProfileId property: The protection profile Arm Id. Throw error, if resource does not exists.
     *
     * @return the protectionProfileId value.
     */
    public String protectionProfileId() {
        return this.protectionProfileId;
    }

    /**
     * Set the protectionProfileId property: The protection profile Arm Id. Throw error, if resource does not exists.
     *
     * @param protectionProfileId the protectionProfileId value to set.
     * @return the ExistingProtectionProfile object itself.
     */
    public ExistingProtectionProfile withProtectionProfileId(String protectionProfileId) {
        this.protectionProfileId = protectionProfileId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (protectionProfileId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property protectionProfileId in model ExistingProtectionProfile"));
        }
    }
}
