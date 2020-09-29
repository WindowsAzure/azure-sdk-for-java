// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Description of a Virtual Network that is useable for private site access. */
@Fluent
public final class PrivateAccessVirtualNetwork {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateAccessVirtualNetwork.class);

    /*
     * The name of the Virtual Network.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The key (ID) of the Virtual Network.
     */
    @JsonProperty(value = "key")
    private Integer key;

    /*
     * The ARM uri of the Virtual Network
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /*
     * A List of subnets that access is allowed to on this Virtual Network. An
     * empty array (but not null) is interpreted to mean that all subnets are
     * allowed within this Virtual Network.
     */
    @JsonProperty(value = "subnets")
    private List<PrivateAccessSubnet> subnets;

    /**
     * Get the name property: The name of the Virtual Network.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the Virtual Network.
     *
     * @param name the name value to set.
     * @return the PrivateAccessVirtualNetwork object itself.
     */
    public PrivateAccessVirtualNetwork withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the key property: The key (ID) of the Virtual Network.
     *
     * @return the key value.
     */
    public Integer key() {
        return this.key;
    }

    /**
     * Set the key property: The key (ID) of the Virtual Network.
     *
     * @param key the key value to set.
     * @return the PrivateAccessVirtualNetwork object itself.
     */
    public PrivateAccessVirtualNetwork withKey(Integer key) {
        this.key = key;
        return this;
    }

    /**
     * Get the resourceId property: The ARM uri of the Virtual Network.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: The ARM uri of the Virtual Network.
     *
     * @param resourceId the resourceId value to set.
     * @return the PrivateAccessVirtualNetwork object itself.
     */
    public PrivateAccessVirtualNetwork withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the subnets property: A List of subnets that access is allowed to on this Virtual Network. An empty array
     * (but not null) is interpreted to mean that all subnets are allowed within this Virtual Network.
     *
     * @return the subnets value.
     */
    public List<PrivateAccessSubnet> subnets() {
        return this.subnets;
    }

    /**
     * Set the subnets property: A List of subnets that access is allowed to on this Virtual Network. An empty array
     * (but not null) is interpreted to mean that all subnets are allowed within this Virtual Network.
     *
     * @param subnets the subnets value to set.
     * @return the PrivateAccessVirtualNetwork object itself.
     */
    public PrivateAccessVirtualNetwork withSubnets(List<PrivateAccessSubnet> subnets) {
        this.subnets = subnets;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (subnets() != null) {
            subnets().forEach(e -> e.validate());
        }
    }
}
