// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.keyvault;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The PrivateEndpointConnectionItem model. */
@JsonFlatten
@Fluent
public class PrivateEndpointConnectionItem {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateEndpointConnectionItem.class);

    /*
     * Properties of the private endpoint object.
     */
    @JsonProperty(value = "properties.privateEndpoint")
    private PrivateEndpoint privateEndpoint;

    /*
     * Approval state of the private link connection.
     */
    @JsonProperty(value = "properties.privateLinkServiceConnectionState")
    private PrivateLinkServiceConnectionState privateLinkServiceConnectionState;

    /*
     * Provisioning state of the private endpoint connection.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private PrivateEndpointConnectionProvisioningState provisioningState;

    /**
     * Get the privateEndpoint property: Properties of the private endpoint object.
     *
     * @return the privateEndpoint value.
     */
    public PrivateEndpoint privateEndpoint() {
        return this.privateEndpoint;
    }

    /**
     * Set the privateEndpoint property: Properties of the private endpoint object.
     *
     * @param privateEndpoint the privateEndpoint value to set.
     * @return the PrivateEndpointConnectionItem object itself.
     */
    public PrivateEndpointConnectionItem withPrivateEndpoint(PrivateEndpoint privateEndpoint) {
        this.privateEndpoint = privateEndpoint;
        return this;
    }

    /**
     * Get the privateLinkServiceConnectionState property: Approval state of the private link connection.
     *
     * @return the privateLinkServiceConnectionState value.
     */
    public PrivateLinkServiceConnectionState privateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }

    /**
     * Set the privateLinkServiceConnectionState property: Approval state of the private link connection.
     *
     * @param privateLinkServiceConnectionState the privateLinkServiceConnectionState value to set.
     * @return the PrivateEndpointConnectionItem object itself.
     */
    public PrivateEndpointConnectionItem withPrivateLinkServiceConnectionState(
        PrivateLinkServiceConnectionState privateLinkServiceConnectionState) {
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the private endpoint connection.
     *
     * @return the provisioningState value.
     */
    public PrivateEndpointConnectionProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (privateEndpoint() != null) {
            privateEndpoint().validate();
        }
        if (privateLinkServiceConnectionState() != null) {
            privateLinkServiceConnectionState().validate();
        }
    }
}
