// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridkubernetes.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Identity for the connected cluster. */
@Fluent
public class ConnectedClusterIdentity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ConnectedClusterIdentity.class);

    /*
     * The principal id of connected cluster identity. This property will only
     * be provided for a system assigned identity.
     */
    @JsonProperty(value = "principalId", access = JsonProperty.Access.WRITE_ONLY)
    private String principalId;

    /*
     * The tenant id associated with the connected cluster. This property will
     * only be provided for a system assigned identity.
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String tenantId;

    /*
     * The type of identity used for the connected cluster. The type
     * 'SystemAssigned, includes a system created identity. The type 'None'
     * means no identity is assigned to the connected cluster.
     */
    @JsonProperty(value = "type", required = true)
    private ResourceIdentityType type;

    /**
     * Get the principalId property: The principal id of connected cluster identity. This property will only be provided
     * for a system assigned identity.
     *
     * @return the principalId value.
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Get the tenantId property: The tenant id associated with the connected cluster. This property will only be
     * provided for a system assigned identity.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Get the type property: The type of identity used for the connected cluster. The type 'SystemAssigned, includes a
     * system created identity. The type 'None' means no identity is assigned to the connected cluster.
     *
     * @return the type value.
     */
    public ResourceIdentityType type() {
        return this.type;
    }

    /**
     * Set the type property: The type of identity used for the connected cluster. The type 'SystemAssigned, includes a
     * system created identity. The type 'None' means no identity is assigned to the connected cluster.
     *
     * @param type the type value to set.
     * @return the ConnectedClusterIdentity object itself.
     */
    public ConnectedClusterIdentity withType(ResourceIdentityType type) {
        this.type = type;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (type() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property type in model ConnectedClusterIdentity"));
        }
    }
}
