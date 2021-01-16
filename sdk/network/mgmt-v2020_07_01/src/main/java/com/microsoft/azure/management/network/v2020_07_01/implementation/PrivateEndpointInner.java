/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01.implementation;

import java.util.List;
import com.microsoft.azure.management.network.v2020_07_01.ProvisioningState;
import com.microsoft.azure.management.network.v2020_07_01.PrivateLinkServiceConnection;
import com.microsoft.azure.management.network.v2020_07_01.CustomDnsConfigPropertiesFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * Private endpoint resource.
 */
@JsonFlatten
@SkipParentValidation
public class PrivateEndpointInner extends Resource {
    /**
     * The ID of the subnet from which the private IP will be allocated.
     */
    @JsonProperty(value = "properties.subnet")
    private SubnetInner subnet;

    /**
     * An array of references to the network interfaces created for this
     * private endpoint.
     */
    @JsonProperty(value = "properties.networkInterfaces", access = JsonProperty.Access.WRITE_ONLY)
    private List<NetworkInterfaceInner> networkInterfaces;

    /**
     * The provisioning state of the private endpoint resource. Possible values
     * include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * A grouping of information about the connection to the remote resource.
     */
    @JsonProperty(value = "properties.privateLinkServiceConnections")
    private List<PrivateLinkServiceConnection> privateLinkServiceConnections;

    /**
     * A grouping of information about the connection to the remote resource.
     * Used when the network admin does not have access to approve connections
     * to the remote resource.
     */
    @JsonProperty(value = "properties.manualPrivateLinkServiceConnections")
    private List<PrivateLinkServiceConnection> manualPrivateLinkServiceConnections;

    /**
     * An array of custom dns configurations.
     */
    @JsonProperty(value = "properties.customDnsConfigs")
    private List<CustomDnsConfigPropertiesFormat> customDnsConfigs;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the ID of the subnet from which the private IP will be allocated.
     *
     * @return the subnet value
     */
    public SubnetInner subnet() {
        return this.subnet;
    }

    /**
     * Set the ID of the subnet from which the private IP will be allocated.
     *
     * @param subnet the subnet value to set
     * @return the PrivateEndpointInner object itself.
     */
    public PrivateEndpointInner withSubnet(SubnetInner subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get an array of references to the network interfaces created for this private endpoint.
     *
     * @return the networkInterfaces value
     */
    public List<NetworkInterfaceInner> networkInterfaces() {
        return this.networkInterfaces;
    }

    /**
     * Get the provisioning state of the private endpoint resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get a grouping of information about the connection to the remote resource.
     *
     * @return the privateLinkServiceConnections value
     */
    public List<PrivateLinkServiceConnection> privateLinkServiceConnections() {
        return this.privateLinkServiceConnections;
    }

    /**
     * Set a grouping of information about the connection to the remote resource.
     *
     * @param privateLinkServiceConnections the privateLinkServiceConnections value to set
     * @return the PrivateEndpointInner object itself.
     */
    public PrivateEndpointInner withPrivateLinkServiceConnections(List<PrivateLinkServiceConnection> privateLinkServiceConnections) {
        this.privateLinkServiceConnections = privateLinkServiceConnections;
        return this;
    }

    /**
     * Get a grouping of information about the connection to the remote resource. Used when the network admin does not have access to approve connections to the remote resource.
     *
     * @return the manualPrivateLinkServiceConnections value
     */
    public List<PrivateLinkServiceConnection> manualPrivateLinkServiceConnections() {
        return this.manualPrivateLinkServiceConnections;
    }

    /**
     * Set a grouping of information about the connection to the remote resource. Used when the network admin does not have access to approve connections to the remote resource.
     *
     * @param manualPrivateLinkServiceConnections the manualPrivateLinkServiceConnections value to set
     * @return the PrivateEndpointInner object itself.
     */
    public PrivateEndpointInner withManualPrivateLinkServiceConnections(List<PrivateLinkServiceConnection> manualPrivateLinkServiceConnections) {
        this.manualPrivateLinkServiceConnections = manualPrivateLinkServiceConnections;
        return this;
    }

    /**
     * Get an array of custom dns configurations.
     *
     * @return the customDnsConfigs value
     */
    public List<CustomDnsConfigPropertiesFormat> customDnsConfigs() {
        return this.customDnsConfigs;
    }

    /**
     * Set an array of custom dns configurations.
     *
     * @param customDnsConfigs the customDnsConfigs value to set
     * @return the PrivateEndpointInner object itself.
     */
    public PrivateEndpointInner withCustomDnsConfigs(List<CustomDnsConfigPropertiesFormat> customDnsConfigs) {
        this.customDnsConfigs = customDnsConfigs;
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
     * Get resource ID.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set resource ID.
     *
     * @param id the id value to set
     * @return the PrivateEndpointInner object itself.
     */
    public PrivateEndpointInner withId(String id) {
        this.id = id;
        return this;
    }

}
