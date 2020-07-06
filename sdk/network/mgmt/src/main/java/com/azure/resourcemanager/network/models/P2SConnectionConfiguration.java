// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The P2SConnectionConfiguration model. */
@JsonFlatten
@Fluent
public class P2SConnectionConfiguration extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(P2SConnectionConfiguration.class);

    /*
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * The reference to the address space resource which represents Address
     * space for P2S VpnClient.
     */
    @JsonProperty(value = "properties.vpnClientAddressPool")
    private AddressSpace vpnClientAddressPool;

    /*
     * The provisioning state of the P2SConnectionConfiguration resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @param name the name value to set.
     * @return the P2SConnectionConfiguration object itself.
     */
    public P2SConnectionConfiguration withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the vpnClientAddressPool property: The reference to the address space resource which represents Address space
     * for P2S VpnClient.
     *
     * @return the vpnClientAddressPool value.
     */
    public AddressSpace vpnClientAddressPool() {
        return this.vpnClientAddressPool;
    }

    /**
     * Set the vpnClientAddressPool property: The reference to the address space resource which represents Address space
     * for P2S VpnClient.
     *
     * @param vpnClientAddressPool the vpnClientAddressPool value to set.
     * @return the P2SConnectionConfiguration object itself.
     */
    public P2SConnectionConfiguration withVpnClientAddressPool(AddressSpace vpnClientAddressPool) {
        this.vpnClientAddressPool = vpnClientAddressPool;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the P2SConnectionConfiguration resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (vpnClientAddressPool() != null) {
            vpnClientAddressPool().validate();
        }
    }
}
