/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_09_01;

import java.util.List;
import com.microsoft.azure.management.network.v2019_09_01.implementation.NetworkInterfaceIPConfigurationInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.SubResource;

/**
 * Backend Address Pool of an application gateway.
 */
@JsonFlatten
public class ApplicationGatewayBackendAddressPool extends SubResource {
    /**
     * Collection of references to IPs defined in network interfaces.
     */
    @JsonProperty(value = "properties.backendIPConfigurations", access = JsonProperty.Access.WRITE_ONLY)
    private List<NetworkInterfaceIPConfigurationInner> backendIPConfigurations;

    /**
     * Backend addresses.
     */
    @JsonProperty(value = "properties.backendAddresses")
    private List<ApplicationGatewayBackendAddress> backendAddresses;

    /**
     * The provisioning state of the backend address pool resource. Possible
     * values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Name of the backend address pool that is unique within an Application
     * Gateway.
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
     * Get collection of references to IPs defined in network interfaces.
     *
     * @return the backendIPConfigurations value
     */
    public List<NetworkInterfaceIPConfigurationInner> backendIPConfigurations() {
        return this.backendIPConfigurations;
    }

    /**
     * Get backend addresses.
     *
     * @return the backendAddresses value
     */
    public List<ApplicationGatewayBackendAddress> backendAddresses() {
        return this.backendAddresses;
    }

    /**
     * Set backend addresses.
     *
     * @param backendAddresses the backendAddresses value to set
     * @return the ApplicationGatewayBackendAddressPool object itself.
     */
    public ApplicationGatewayBackendAddressPool withBackendAddresses(List<ApplicationGatewayBackendAddress> backendAddresses) {
        this.backendAddresses = backendAddresses;
        return this;
    }

    /**
     * Get the provisioning state of the backend address pool resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get name of the backend address pool that is unique within an Application Gateway.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the backend address pool that is unique within an Application Gateway.
     *
     * @param name the name value to set
     * @return the ApplicationGatewayBackendAddressPool object itself.
     */
    public ApplicationGatewayBackendAddressPool withName(String name) {
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
