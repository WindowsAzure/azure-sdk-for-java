// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ContainerGroupIdentityUserAssignedIdentities model. */
@Immutable
public final class ContainerGroupIdentityUserAssignedIdentities {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(ContainerGroupIdentityUserAssignedIdentities.class);

    /*
     * The principal id of user assigned identity.
     */
    @JsonProperty(value = "principalId", access = JsonProperty.Access.WRITE_ONLY)
    private String principalId;

    /*
     * The client id of user assigned identity.
     */
    @JsonProperty(value = "clientId", access = JsonProperty.Access.WRITE_ONLY)
    private String clientId;

    /**
     * Get the principalId property: The principal id of user assigned identity.
     *
     * @return the principalId value.
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Get the clientId property: The client id of user assigned identity.
     *
     * @return the clientId value.
     */
    public String clientId() {
        return this.clientId;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
