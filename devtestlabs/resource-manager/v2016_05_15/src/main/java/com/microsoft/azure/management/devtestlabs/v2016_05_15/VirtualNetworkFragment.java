/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2016_05_15;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * A virtual network.
 */
@JsonFlatten
@SkipParentValidation
public class VirtualNetworkFragment extends Resource {
    /**
     * The allowed subnets of the virtual network.
     */
    @JsonProperty(value = "properties.allowedSubnets")
    private List<SubnetFragment> allowedSubnets;

    /**
     * The description of the virtual network.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * The Microsoft.Network resource identifier of the virtual network.
     */
    @JsonProperty(value = "properties.externalProviderResourceId")
    private String externalProviderResourceId;

    /**
     * The external subnet properties.
     */
    @JsonProperty(value = "properties.externalSubnets")
    private List<ExternalSubnetFragment> externalSubnets;

    /**
     * The subnet overrides of the virtual network.
     */
    @JsonProperty(value = "properties.subnetOverrides")
    private List<SubnetOverrideFragment> subnetOverrides;

    /**
     * The provisioning status of the resource.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * The unique immutable identifier of a resource (Guid).
     */
    @JsonProperty(value = "properties.uniqueIdentifier")
    private String uniqueIdentifier;

    /**
     * Get the allowed subnets of the virtual network.
     *
     * @return the allowedSubnets value
     */
    public List<SubnetFragment> allowedSubnets() {
        return this.allowedSubnets;
    }

    /**
     * Set the allowed subnets of the virtual network.
     *
     * @param allowedSubnets the allowedSubnets value to set
     * @return the VirtualNetworkFragment object itself.
     */
    public VirtualNetworkFragment withAllowedSubnets(List<SubnetFragment> allowedSubnets) {
        this.allowedSubnets = allowedSubnets;
        return this;
    }

    /**
     * Get the description of the virtual network.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description of the virtual network.
     *
     * @param description the description value to set
     * @return the VirtualNetworkFragment object itself.
     */
    public VirtualNetworkFragment withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the Microsoft.Network resource identifier of the virtual network.
     *
     * @return the externalProviderResourceId value
     */
    public String externalProviderResourceId() {
        return this.externalProviderResourceId;
    }

    /**
     * Set the Microsoft.Network resource identifier of the virtual network.
     *
     * @param externalProviderResourceId the externalProviderResourceId value to set
     * @return the VirtualNetworkFragment object itself.
     */
    public VirtualNetworkFragment withExternalProviderResourceId(String externalProviderResourceId) {
        this.externalProviderResourceId = externalProviderResourceId;
        return this;
    }

    /**
     * Get the external subnet properties.
     *
     * @return the externalSubnets value
     */
    public List<ExternalSubnetFragment> externalSubnets() {
        return this.externalSubnets;
    }

    /**
     * Set the external subnet properties.
     *
     * @param externalSubnets the externalSubnets value to set
     * @return the VirtualNetworkFragment object itself.
     */
    public VirtualNetworkFragment withExternalSubnets(List<ExternalSubnetFragment> externalSubnets) {
        this.externalSubnets = externalSubnets;
        return this;
    }

    /**
     * Get the subnet overrides of the virtual network.
     *
     * @return the subnetOverrides value
     */
    public List<SubnetOverrideFragment> subnetOverrides() {
        return this.subnetOverrides;
    }

    /**
     * Set the subnet overrides of the virtual network.
     *
     * @param subnetOverrides the subnetOverrides value to set
     * @return the VirtualNetworkFragment object itself.
     */
    public VirtualNetworkFragment withSubnetOverrides(List<SubnetOverrideFragment> subnetOverrides) {
        this.subnetOverrides = subnetOverrides;
        return this;
    }

    /**
     * Get the provisioning status of the resource.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioning status of the resource.
     *
     * @param provisioningState the provisioningState value to set
     * @return the VirtualNetworkFragment object itself.
     */
    public VirtualNetworkFragment withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the unique immutable identifier of a resource (Guid).
     *
     * @return the uniqueIdentifier value
     */
    public String uniqueIdentifier() {
        return this.uniqueIdentifier;
    }

    /**
     * Set the unique immutable identifier of a resource (Guid).
     *
     * @param uniqueIdentifier the uniqueIdentifier value to set
     * @return the VirtualNetworkFragment object itself.
     */
    public VirtualNetworkFragment withUniqueIdentifier(String uniqueIdentifier) {
        this.uniqueIdentifier = uniqueIdentifier;
        return this;
    }

}
