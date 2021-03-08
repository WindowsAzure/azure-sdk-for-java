/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_08_01.implementation;

import com.microsoft.azure.management.network.v2020_08_01.PrivateLinkServiceConnectionState;
import com.microsoft.azure.management.network.v2020_08_01.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.SubResource;

/**
 * Private Endpoint connection on an application gateway.
 */
@JsonFlatten
public class ApplicationGatewayPrivateEndpointConnectionInner extends SubResource {
    /**
     * The resource of private end point.
     */
    @JsonProperty(value = "properties.privateEndpoint", access = JsonProperty.Access.WRITE_ONLY)
    private PrivateEndpointInner privateEndpoint;

    /**
     * A collection of information about the state of the connection between
     * service consumer and provider.
     */
    @JsonProperty(value = "properties.privateLinkServiceConnectionState")
    private PrivateLinkServiceConnectionState privateLinkServiceConnectionState;

    /**
     * The provisioning state of the application gateway private endpoint
     * connection resource. Possible values include: 'Succeeded', 'Updating',
     * 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * The consumer link id.
     */
    @JsonProperty(value = "properties.linkIdentifier", access = JsonProperty.Access.WRITE_ONLY)
    private String linkIdentifier;

    /**
     * Name of the private endpoint connection on an application gateway.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Type of the resource.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Get the resource of private end point.
     *
     * @return the privateEndpoint value
     */
    public PrivateEndpointInner privateEndpoint() {
        return this.privateEndpoint;
    }

    /**
     * Get a collection of information about the state of the connection between service consumer and provider.
     *
     * @return the privateLinkServiceConnectionState value
     */
    public PrivateLinkServiceConnectionState privateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }

    /**
     * Set a collection of information about the state of the connection between service consumer and provider.
     *
     * @param privateLinkServiceConnectionState the privateLinkServiceConnectionState value to set
     * @return the ApplicationGatewayPrivateEndpointConnectionInner object itself.
     */
    public ApplicationGatewayPrivateEndpointConnectionInner withPrivateLinkServiceConnectionState(PrivateLinkServiceConnectionState privateLinkServiceConnectionState) {
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        return this;
    }

    /**
     * Get the provisioning state of the application gateway private endpoint connection resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the consumer link id.
     *
     * @return the linkIdentifier value
     */
    public String linkIdentifier() {
        return this.linkIdentifier;
    }

    /**
     * Get name of the private endpoint connection on an application gateway.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the private endpoint connection on an application gateway.
     *
     * @param name the name value to set
     * @return the ApplicationGatewayPrivateEndpointConnectionInner object itself.
     */
    public ApplicationGatewayPrivateEndpointConnectionInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get type of the resource.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

}
