// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.fluidrelay.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.fluidrelay.models.FluidRelayEndpoints;
import com.azure.resourcemanager.fluidrelay.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** A FluidRelay Server. */
@JsonFlatten
@Fluent
public class FluidRelayServerInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FluidRelayServerInner.class);

    /*
     * System meta data for this resource, including creation and modification
     * information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * The Fluid tenantId for this server
     */
    @JsonProperty(value = "properties.frsTenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String frsTenantId;

    /*
     * The Fluid Relay Service endpoints for this server.
     */
    @JsonProperty(value = "properties.fluidRelayEndpoints", access = JsonProperty.Access.WRITE_ONLY)
    private FluidRelayEndpoints fluidRelayEndpoints;

    /*
     * Provision states for FluidRelay RP
     */
    @JsonProperty(value = "properties.provisioningState")
    private ProvisioningState provisioningState;

    /**
     * Get the systemData property: System meta data for this resource, including creation and modification information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the frsTenantId property: The Fluid tenantId for this server.
     *
     * @return the frsTenantId value.
     */
    public String frsTenantId() {
        return this.frsTenantId;
    }

    /**
     * Get the fluidRelayEndpoints property: The Fluid Relay Service endpoints for this server.
     *
     * @return the fluidRelayEndpoints value.
     */
    public FluidRelayEndpoints fluidRelayEndpoints() {
        return this.fluidRelayEndpoints;
    }

    /**
     * Get the provisioningState property: Provision states for FluidRelay RP.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: Provision states for FluidRelay RP.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the FluidRelayServerInner object itself.
     */
    public FluidRelayServerInner withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FluidRelayServerInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FluidRelayServerInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (fluidRelayEndpoints() != null) {
            fluidRelayEndpoints().validate();
        }
    }
}
