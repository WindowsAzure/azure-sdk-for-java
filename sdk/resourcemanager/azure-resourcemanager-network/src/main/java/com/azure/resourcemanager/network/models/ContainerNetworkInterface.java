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
import java.util.List;

/** Container network interface child resource. */
@JsonFlatten
@Fluent
public class ContainerNetworkInterface extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ContainerNetworkInterface.class);

    /*
     * The name of the resource. This name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Sub Resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Container network interface configuration from which this container
     * network interface is created.
     */
    @JsonProperty(value = "properties.containerNetworkInterfaceConfiguration", access = JsonProperty.Access.WRITE_ONLY)
    private ContainerNetworkInterfaceConfiguration containerNetworkInterfaceConfiguration;

    /*
     * Reference to the container to which this container network interface is
     * attached.
     */
    @JsonProperty(value = "properties.container")
    private Container container;

    /*
     * Reference to the ip configuration on this container nic.
     */
    @JsonProperty(value = "properties.ipConfigurations", access = JsonProperty.Access.WRITE_ONLY)
    private List<ContainerNetworkInterfaceIpConfiguration> ipConfigurations;

    /*
     * The provisioning state of the container network interface resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the name property: The name of the resource. This name can be used to access the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource. This name can be used to access the resource.
     *
     * @param name the name value to set.
     * @return the ContainerNetworkInterface object itself.
     */
    public ContainerNetworkInterface withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Sub Resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
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
     * Get the containerNetworkInterfaceConfiguration property: Container network interface configuration from which
     * this container network interface is created.
     *
     * @return the containerNetworkInterfaceConfiguration value.
     */
    public ContainerNetworkInterfaceConfiguration containerNetworkInterfaceConfiguration() {
        return this.containerNetworkInterfaceConfiguration;
    }

    /**
     * Get the container property: Reference to the container to which this container network interface is attached.
     *
     * @return the container value.
     */
    public Container container() {
        return this.container;
    }

    /**
     * Set the container property: Reference to the container to which this container network interface is attached.
     *
     * @param container the container value to set.
     * @return the ContainerNetworkInterface object itself.
     */
    public ContainerNetworkInterface withContainer(Container container) {
        this.container = container;
        return this;
    }

    /**
     * Get the ipConfigurations property: Reference to the ip configuration on this container nic.
     *
     * @return the ipConfigurations value.
     */
    public List<ContainerNetworkInterfaceIpConfiguration> ipConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * Get the provisioningState property: The provisioning state of the container network interface resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /** {@inheritDoc} */
    @Override
    public ContainerNetworkInterface withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (containerNetworkInterfaceConfiguration() != null) {
            containerNetworkInterfaceConfiguration().validate();
        }
        if (container() != null) {
            container().validate();
        }
        if (ipConfigurations() != null) {
            ipConfigurations().forEach(e -> e.validate());
        }
    }
}
