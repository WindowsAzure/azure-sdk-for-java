// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The UserIdentityProperties model. */
@Fluent
public final class UserIdentityProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UserIdentityProperties.class);

    /*
     * The principal id of user assigned identity.
     */
    @JsonProperty(value = "principalId")
    private String principalId;

    /*
     * The client id of user assigned identity.
     */
    @JsonProperty(value = "clientId")
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
     * Set the principalId property: The principal id of user assigned identity.
     *
     * @param principalId the principalId value to set.
     * @return the UserIdentityProperties object itself.
     */
    public UserIdentityProperties withPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
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
     * Set the clientId property: The client id of user assigned identity.
     *
     * @param clientId the clientId value to set.
     * @return the UserIdentityProperties object itself.
     */
    public UserIdentityProperties withClientId(String clientId) {
        this.clientId = clientId;
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
