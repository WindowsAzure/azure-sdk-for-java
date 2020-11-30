// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.synapse.managedprivateendpoints.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of a managed private endpoint. */
@Fluent
public final class ManagedPrivateEndpointProperties {
    /*
     * The ARM resource ID of the resource to which the managed private
     * endpoint is created
     */
    @JsonProperty(value = "privateLinkResourceId")
    private String privateLinkResourceId;

    /*
     * The groupId to which the managed private endpoint is created
     */
    @JsonProperty(value = "groupId")
    private String groupId;

    /*
     * The managed private endpoint provisioning state
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The managed private endpoint connection state
     */
    @JsonProperty(value = "connectionState")
    private ManagedPrivateEndpointConnectionState connectionState;

    /*
     * Denotes whether the managed private endpoint is reserved
     */
    @JsonProperty(value = "isReserved", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isReserved;

    /**
     * Get the privateLinkResourceId property: The ARM resource ID of the resource to which the managed private endpoint
     * is created.
     *
     * @return the privateLinkResourceId value.
     */
    public String getPrivateLinkResourceId() {
        return this.privateLinkResourceId;
    }

    /**
     * Set the privateLinkResourceId property: The ARM resource ID of the resource to which the managed private endpoint
     * is created.
     *
     * @param privateLinkResourceId the privateLinkResourceId value to set.
     * @return the ManagedPrivateEndpointProperties object itself.
     */
    public ManagedPrivateEndpointProperties setPrivateLinkResourceId(String privateLinkResourceId) {
        this.privateLinkResourceId = privateLinkResourceId;
        return this;
    }

    /**
     * Get the groupId property: The groupId to which the managed private endpoint is created.
     *
     * @return the groupId value.
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * Set the groupId property: The groupId to which the managed private endpoint is created.
     *
     * @param groupId the groupId value to set.
     * @return the ManagedPrivateEndpointProperties object itself.
     */
    public ManagedPrivateEndpointProperties setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * Get the provisioningState property: The managed private endpoint provisioning state.
     *
     * @return the provisioningState value.
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the connectionState property: The managed private endpoint connection state.
     *
     * @return the connectionState value.
     */
    public ManagedPrivateEndpointConnectionState getConnectionState() {
        return this.connectionState;
    }

    /**
     * Set the connectionState property: The managed private endpoint connection state.
     *
     * @param connectionState the connectionState value to set.
     * @return the ManagedPrivateEndpointProperties object itself.
     */
    public ManagedPrivateEndpointProperties setConnectionState(ManagedPrivateEndpointConnectionState connectionState) {
        this.connectionState = connectionState;
        return this;
    }

    /**
     * Get the isReserved property: Denotes whether the managed private endpoint is reserved.
     *
     * @return the isReserved value.
     */
    public Boolean isReserved() {
        return this.isReserved;
    }
}
