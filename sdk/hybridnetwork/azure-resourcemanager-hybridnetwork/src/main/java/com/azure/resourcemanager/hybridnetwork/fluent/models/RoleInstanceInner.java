// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybridnetwork.models.OperationalState;
import com.azure.resourcemanager.hybridnetwork.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The role instance sub resource. */
@JsonFlatten
@Fluent
public class RoleInstanceInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RoleInstanceInner.class);

    /*
     * The role instance name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The ARM ID of the resource.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The type of the resource.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * The system meta data relating to this resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * The provisioning state of the RoleInstance resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The operational state of the role instance.
     */
    @JsonProperty(value = "properties.operationalState")
    private OperationalState operationalState;

    /**
     * Get the name property: The role instance name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The role instance name.
     *
     * @param name the name value to set.
     * @return the RoleInstanceInner object itself.
     */
    public RoleInstanceInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the id property: The ARM ID of the resource.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The ARM ID of the resource.
     *
     * @param id the id value to set.
     * @return the RoleInstanceInner object itself.
     */
    public RoleInstanceInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the type property: The type of the resource.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The type of the resource.
     *
     * @param type the type value to set.
     * @return the RoleInstanceInner object itself.
     */
    public RoleInstanceInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the systemData property: The system meta data relating to this resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the provisioningState property: The provisioning state of the RoleInstance resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the operationalState property: The operational state of the role instance.
     *
     * @return the operationalState value.
     */
    public OperationalState operationalState() {
        return this.operationalState;
    }

    /**
     * Set the operationalState property: The operational state of the role instance.
     *
     * @param operationalState the operationalState value to set.
     * @return the RoleInstanceInner object itself.
     */
    public RoleInstanceInner withOperationalState(OperationalState operationalState) {
        this.operationalState = operationalState;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
