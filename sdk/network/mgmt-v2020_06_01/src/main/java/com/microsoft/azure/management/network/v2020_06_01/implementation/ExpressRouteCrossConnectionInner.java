/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_06_01.implementation;

import com.microsoft.azure.management.network.v2020_06_01.ExpressRouteCircuitReference;
import com.microsoft.azure.management.network.v2020_06_01.ServiceProviderProvisioningState;
import com.microsoft.azure.management.network.v2020_06_01.ProvisioningState;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * ExpressRouteCrossConnection resource.
 */
@JsonFlatten
@SkipParentValidation
public class ExpressRouteCrossConnectionInner extends Resource {
    /**
     * The name of the primary port.
     */
    @JsonProperty(value = "properties.primaryAzurePort", access = JsonProperty.Access.WRITE_ONLY)
    private String primaryAzurePort;

    /**
     * The name of the secondary port.
     */
    @JsonProperty(value = "properties.secondaryAzurePort", access = JsonProperty.Access.WRITE_ONLY)
    private String secondaryAzurePort;

    /**
     * The identifier of the circuit traffic.
     */
    @JsonProperty(value = "properties.sTag", access = JsonProperty.Access.WRITE_ONLY)
    private Integer sTag;

    /**
     * The peering location of the ExpressRoute circuit.
     */
    @JsonProperty(value = "properties.peeringLocation", access = JsonProperty.Access.WRITE_ONLY)
    private String peeringLocation;

    /**
     * The circuit bandwidth In Mbps.
     */
    @JsonProperty(value = "properties.bandwidthInMbps", access = JsonProperty.Access.WRITE_ONLY)
    private Integer bandwidthInMbps;

    /**
     * The ExpressRouteCircuit.
     */
    @JsonProperty(value = "properties.expressRouteCircuit")
    private ExpressRouteCircuitReference expressRouteCircuit;

    /**
     * The provisioning state of the circuit in the connectivity provider
     * system. Possible values include: 'NotProvisioned', 'Provisioning',
     * 'Provisioned', 'Deprovisioning'.
     */
    @JsonProperty(value = "properties.serviceProviderProvisioningState")
    private ServiceProviderProvisioningState serviceProviderProvisioningState;

    /**
     * Additional read only notes set by the connectivity provider.
     */
    @JsonProperty(value = "properties.serviceProviderNotes")
    private String serviceProviderNotes;

    /**
     * The provisioning state of the express route cross connection resource.
     * Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * The list of peerings.
     */
    @JsonProperty(value = "properties.peerings")
    private List<ExpressRouteCrossConnectionPeeringInner> peerings;

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
     * Get the name of the primary port.
     *
     * @return the primaryAzurePort value
     */
    public String primaryAzurePort() {
        return this.primaryAzurePort;
    }

    /**
     * Get the name of the secondary port.
     *
     * @return the secondaryAzurePort value
     */
    public String secondaryAzurePort() {
        return this.secondaryAzurePort;
    }

    /**
     * Get the identifier of the circuit traffic.
     *
     * @return the sTag value
     */
    public Integer sTag() {
        return this.sTag;
    }

    /**
     * Get the peering location of the ExpressRoute circuit.
     *
     * @return the peeringLocation value
     */
    public String peeringLocation() {
        return this.peeringLocation;
    }

    /**
     * Get the circuit bandwidth In Mbps.
     *
     * @return the bandwidthInMbps value
     */
    public Integer bandwidthInMbps() {
        return this.bandwidthInMbps;
    }

    /**
     * Get the ExpressRouteCircuit.
     *
     * @return the expressRouteCircuit value
     */
    public ExpressRouteCircuitReference expressRouteCircuit() {
        return this.expressRouteCircuit;
    }

    /**
     * Set the ExpressRouteCircuit.
     *
     * @param expressRouteCircuit the expressRouteCircuit value to set
     * @return the ExpressRouteCrossConnectionInner object itself.
     */
    public ExpressRouteCrossConnectionInner withExpressRouteCircuit(ExpressRouteCircuitReference expressRouteCircuit) {
        this.expressRouteCircuit = expressRouteCircuit;
        return this;
    }

    /**
     * Get the provisioning state of the circuit in the connectivity provider system. Possible values include: 'NotProvisioned', 'Provisioning', 'Provisioned', 'Deprovisioning'.
     *
     * @return the serviceProviderProvisioningState value
     */
    public ServiceProviderProvisioningState serviceProviderProvisioningState() {
        return this.serviceProviderProvisioningState;
    }

    /**
     * Set the provisioning state of the circuit in the connectivity provider system. Possible values include: 'NotProvisioned', 'Provisioning', 'Provisioned', 'Deprovisioning'.
     *
     * @param serviceProviderProvisioningState the serviceProviderProvisioningState value to set
     * @return the ExpressRouteCrossConnectionInner object itself.
     */
    public ExpressRouteCrossConnectionInner withServiceProviderProvisioningState(ServiceProviderProvisioningState serviceProviderProvisioningState) {
        this.serviceProviderProvisioningState = serviceProviderProvisioningState;
        return this;
    }

    /**
     * Get additional read only notes set by the connectivity provider.
     *
     * @return the serviceProviderNotes value
     */
    public String serviceProviderNotes() {
        return this.serviceProviderNotes;
    }

    /**
     * Set additional read only notes set by the connectivity provider.
     *
     * @param serviceProviderNotes the serviceProviderNotes value to set
     * @return the ExpressRouteCrossConnectionInner object itself.
     */
    public ExpressRouteCrossConnectionInner withServiceProviderNotes(String serviceProviderNotes) {
        this.serviceProviderNotes = serviceProviderNotes;
        return this;
    }

    /**
     * Get the provisioning state of the express route cross connection resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the list of peerings.
     *
     * @return the peerings value
     */
    public List<ExpressRouteCrossConnectionPeeringInner> peerings() {
        return this.peerings;
    }

    /**
     * Set the list of peerings.
     *
     * @param peerings the peerings value to set
     * @return the ExpressRouteCrossConnectionInner object itself.
     */
    public ExpressRouteCrossConnectionInner withPeerings(List<ExpressRouteCrossConnectionPeeringInner> peerings) {
        this.peerings = peerings;
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
     * @return the ExpressRouteCrossConnectionInner object itself.
     */
    public ExpressRouteCrossConnectionInner withId(String id) {
        this.id = id;
        return this;
    }

}
