// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Managed Identity used for CMK. */
@Fluent
public final class CmkIdentityDefinition {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CmkIdentityDefinition.class);

    /*
     * The resource id of the user assigned identity to authenticate to
     * customer's key vault.
     */
    @JsonProperty(value = "userAssignedIdentity")
    private String userAssignedIdentity;

    /**
     * Get the userAssignedIdentity property: The resource id of the user assigned identity to authenticate to
     * customer's key vault.
     *
     * @return the userAssignedIdentity value.
     */
    public String userAssignedIdentity() {
        return this.userAssignedIdentity;
    }

    /**
     * Set the userAssignedIdentity property: The resource id of the user assigned identity to authenticate to
     * customer's key vault.
     *
     * @param userAssignedIdentity the userAssignedIdentity value to set.
     * @return the CmkIdentityDefinition object itself.
     */
    public CmkIdentityDefinition withUserAssignedIdentity(String userAssignedIdentity) {
        this.userAssignedIdentity = userAssignedIdentity;
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
