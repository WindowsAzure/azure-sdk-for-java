// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybridnetwork.models.NetworkFunctionVendorConfiguration;
import com.azure.resourcemanager.hybridnetwork.models.ProvisioningState;
import com.azure.resourcemanager.hybridnetwork.models.SkuType;
import com.azure.resourcemanager.hybridnetwork.models.VendorProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Vendor network function sub resource. */
@JsonFlatten
@Fluent
public class VendorNetworkFunctionInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VendorNetworkFunctionInner.class);

    /*
     * The system meta data relating to this resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * The provisioning state of the vendor network function sub resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The vendor controlled provisioning state of the vendor network function.
     */
    @JsonProperty(value = "properties.vendorProvisioningState")
    private VendorProvisioningState vendorProvisioningState;

    /*
     * The name of the sku. Once set, it cannot be updated.
     */
    @JsonProperty(value = "properties.skuName", access = JsonProperty.Access.WRITE_ONLY)
    private String skuName;

    /*
     * The sku type.
     */
    @JsonProperty(value = "properties.skuType", access = JsonProperty.Access.WRITE_ONLY)
    private SkuType skuType;

    /*
     * An array of network function vendor configurations.
     */
    @JsonProperty(value = "properties.networkFunctionVendorConfigurations")
    private List<NetworkFunctionVendorConfiguration> networkFunctionVendorConfigurations;

    /**
     * Get the systemData property: The system meta data relating to this resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the provisioningState property: The provisioning state of the vendor network function sub resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the vendorProvisioningState property: The vendor controlled provisioning state of the vendor network
     * function.
     *
     * @return the vendorProvisioningState value.
     */
    public VendorProvisioningState vendorProvisioningState() {
        return this.vendorProvisioningState;
    }

    /**
     * Set the vendorProvisioningState property: The vendor controlled provisioning state of the vendor network
     * function.
     *
     * @param vendorProvisioningState the vendorProvisioningState value to set.
     * @return the VendorNetworkFunctionInner object itself.
     */
    public VendorNetworkFunctionInner withVendorProvisioningState(VendorProvisioningState vendorProvisioningState) {
        this.vendorProvisioningState = vendorProvisioningState;
        return this;
    }

    /**
     * Get the skuName property: The name of the sku. Once set, it cannot be updated.
     *
     * @return the skuName value.
     */
    public String skuName() {
        return this.skuName;
    }

    /**
     * Get the skuType property: The sku type.
     *
     * @return the skuType value.
     */
    public SkuType skuType() {
        return this.skuType;
    }

    /**
     * Get the networkFunctionVendorConfigurations property: An array of network function vendor configurations.
     *
     * @return the networkFunctionVendorConfigurations value.
     */
    public List<NetworkFunctionVendorConfiguration> networkFunctionVendorConfigurations() {
        return this.networkFunctionVendorConfigurations;
    }

    /**
     * Set the networkFunctionVendorConfigurations property: An array of network function vendor configurations.
     *
     * @param networkFunctionVendorConfigurations the networkFunctionVendorConfigurations value to set.
     * @return the VendorNetworkFunctionInner object itself.
     */
    public VendorNetworkFunctionInner withNetworkFunctionVendorConfigurations(
        List<NetworkFunctionVendorConfiguration> networkFunctionVendorConfigurations) {
        this.networkFunctionVendorConfigurations = networkFunctionVendorConfigurations;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (networkFunctionVendorConfigurations() != null) {
            networkFunctionVendorConfigurations().forEach(e -> e.validate());
        }
    }
}
