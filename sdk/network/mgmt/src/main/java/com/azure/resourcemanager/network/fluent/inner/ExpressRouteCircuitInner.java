// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.inner;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.ExpressRouteCircuitServiceProviderProperties;
import com.azure.resourcemanager.network.models.ExpressRouteCircuitSku;
import com.azure.resourcemanager.network.models.ServiceProviderProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ExpressRouteCircuit model. */
@JsonFlatten
@Fluent
public class ExpressRouteCircuitInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExpressRouteCircuitInner.class);

    /*
     * The SKU.
     */
    @JsonProperty(value = "sku")
    private ExpressRouteCircuitSku sku;

    /*
     * Gets a unique read-only string that changes whenever the resource is
     * updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Allow classic operations.
     */
    @JsonProperty(value = "properties.allowClassicOperations")
    private Boolean allowClassicOperations;

    /*
     * The CircuitProvisioningState state of the resource.
     */
    @JsonProperty(value = "properties.circuitProvisioningState")
    private String circuitProvisioningState;

    /*
     * The ServiceProviderProvisioningState state of the resource.
     */
    @JsonProperty(value = "properties.serviceProviderProvisioningState")
    private ServiceProviderProvisioningState serviceProviderProvisioningState;

    /*
     * The list of authorizations.
     */
    @JsonProperty(value = "properties.authorizations")
    private List<ExpressRouteCircuitAuthorizationInner> authorizations;

    /*
     * The list of peerings.
     */
    @JsonProperty(value = "properties.peerings")
    private List<ExpressRouteCircuitPeeringInner> peerings;

    /*
     * The ServiceKey.
     */
    @JsonProperty(value = "properties.serviceKey")
    private String serviceKey;

    /*
     * The ServiceProviderNotes.
     */
    @JsonProperty(value = "properties.serviceProviderNotes")
    private String serviceProviderNotes;

    /*
     * The ServiceProviderProperties.
     */
    @JsonProperty(value = "properties.serviceProviderProperties")
    private ExpressRouteCircuitServiceProviderProperties serviceProviderProperties;

    /*
     * The reference to the ExpressRoutePort resource when the circuit is
     * provisioned on an ExpressRoutePort resource.
     */
    @JsonProperty(value = "properties.expressRoutePort")
    private SubResource expressRoutePort;

    /*
     * The bandwidth of the circuit when the circuit is provisioned on an
     * ExpressRoutePort resource.
     */
    @JsonProperty(value = "properties.bandwidthInGbps")
    private Float bandwidthInGbps;

    /*
     * The identifier of the circuit traffic. Outer tag for QinQ encapsulation.
     */
    @JsonProperty(value = "properties.stag", access = JsonProperty.Access.WRITE_ONLY)
    private Integer stag;

    /*
     * Gets the provisioning state of the public IP resource. Possible values
     * are: 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /*
     * The GatewayManager Etag.
     */
    @JsonProperty(value = "properties.gatewayManagerEtag")
    private String gatewayManagerEtag;

    /*
     * Flag denoting Global reach status.
     */
    @JsonProperty(value = "properties.globalReachEnabled")
    private Boolean globalReachEnabled;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the sku property: The SKU.
     *
     * @return the sku value.
     */
    public ExpressRouteCircuitSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The SKU.
     *
     * @param sku the sku value to set.
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withSku(ExpressRouteCircuitSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the etag property: Gets a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the allowClassicOperations property: Allow classic operations.
     *
     * @return the allowClassicOperations value.
     */
    public Boolean allowClassicOperations() {
        return this.allowClassicOperations;
    }

    /**
     * Set the allowClassicOperations property: Allow classic operations.
     *
     * @param allowClassicOperations the allowClassicOperations value to set.
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withAllowClassicOperations(Boolean allowClassicOperations) {
        this.allowClassicOperations = allowClassicOperations;
        return this;
    }

    /**
     * Get the circuitProvisioningState property: The CircuitProvisioningState state of the resource.
     *
     * @return the circuitProvisioningState value.
     */
    public String circuitProvisioningState() {
        return this.circuitProvisioningState;
    }

    /**
     * Set the circuitProvisioningState property: The CircuitProvisioningState state of the resource.
     *
     * @param circuitProvisioningState the circuitProvisioningState value to set.
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withCircuitProvisioningState(String circuitProvisioningState) {
        this.circuitProvisioningState = circuitProvisioningState;
        return this;
    }

    /**
     * Get the serviceProviderProvisioningState property: The ServiceProviderProvisioningState state of the resource.
     *
     * @return the serviceProviderProvisioningState value.
     */
    public ServiceProviderProvisioningState serviceProviderProvisioningState() {
        return this.serviceProviderProvisioningState;
    }

    /**
     * Set the serviceProviderProvisioningState property: The ServiceProviderProvisioningState state of the resource.
     *
     * @param serviceProviderProvisioningState the serviceProviderProvisioningState value to set.
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withServiceProviderProvisioningState(
        ServiceProviderProvisioningState serviceProviderProvisioningState) {
        this.serviceProviderProvisioningState = serviceProviderProvisioningState;
        return this;
    }

    /**
     * Get the authorizations property: The list of authorizations.
     *
     * @return the authorizations value.
     */
    public List<ExpressRouteCircuitAuthorizationInner> authorizations() {
        return this.authorizations;
    }

    /**
     * Set the authorizations property: The list of authorizations.
     *
     * @param authorizations the authorizations value to set.
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withAuthorizations(List<ExpressRouteCircuitAuthorizationInner> authorizations) {
        this.authorizations = authorizations;
        return this;
    }

    /**
     * Get the peerings property: The list of peerings.
     *
     * @return the peerings value.
     */
    public List<ExpressRouteCircuitPeeringInner> peerings() {
        return this.peerings;
    }

    /**
     * Set the peerings property: The list of peerings.
     *
     * @param peerings the peerings value to set.
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withPeerings(List<ExpressRouteCircuitPeeringInner> peerings) {
        this.peerings = peerings;
        return this;
    }

    /**
     * Get the serviceKey property: The ServiceKey.
     *
     * @return the serviceKey value.
     */
    public String serviceKey() {
        return this.serviceKey;
    }

    /**
     * Set the serviceKey property: The ServiceKey.
     *
     * @param serviceKey the serviceKey value to set.
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withServiceKey(String serviceKey) {
        this.serviceKey = serviceKey;
        return this;
    }

    /**
     * Get the serviceProviderNotes property: The ServiceProviderNotes.
     *
     * @return the serviceProviderNotes value.
     */
    public String serviceProviderNotes() {
        return this.serviceProviderNotes;
    }

    /**
     * Set the serviceProviderNotes property: The ServiceProviderNotes.
     *
     * @param serviceProviderNotes the serviceProviderNotes value to set.
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withServiceProviderNotes(String serviceProviderNotes) {
        this.serviceProviderNotes = serviceProviderNotes;
        return this;
    }

    /**
     * Get the serviceProviderProperties property: The ServiceProviderProperties.
     *
     * @return the serviceProviderProperties value.
     */
    public ExpressRouteCircuitServiceProviderProperties serviceProviderProperties() {
        return this.serviceProviderProperties;
    }

    /**
     * Set the serviceProviderProperties property: The ServiceProviderProperties.
     *
     * @param serviceProviderProperties the serviceProviderProperties value to set.
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withServiceProviderProperties(
        ExpressRouteCircuitServiceProviderProperties serviceProviderProperties) {
        this.serviceProviderProperties = serviceProviderProperties;
        return this;
    }

    /**
     * Get the expressRoutePort property: The reference to the ExpressRoutePort resource when the circuit is provisioned
     * on an ExpressRoutePort resource.
     *
     * @return the expressRoutePort value.
     */
    public SubResource expressRoutePort() {
        return this.expressRoutePort;
    }

    /**
     * Set the expressRoutePort property: The reference to the ExpressRoutePort resource when the circuit is provisioned
     * on an ExpressRoutePort resource.
     *
     * @param expressRoutePort the expressRoutePort value to set.
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withExpressRoutePort(SubResource expressRoutePort) {
        this.expressRoutePort = expressRoutePort;
        return this;
    }

    /**
     * Get the bandwidthInGbps property: The bandwidth of the circuit when the circuit is provisioned on an
     * ExpressRoutePort resource.
     *
     * @return the bandwidthInGbps value.
     */
    public Float bandwidthInGbps() {
        return this.bandwidthInGbps;
    }

    /**
     * Set the bandwidthInGbps property: The bandwidth of the circuit when the circuit is provisioned on an
     * ExpressRoutePort resource.
     *
     * @param bandwidthInGbps the bandwidthInGbps value to set.
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withBandwidthInGbps(Float bandwidthInGbps) {
        this.bandwidthInGbps = bandwidthInGbps;
        return this;
    }

    /**
     * Get the stag property: The identifier of the circuit traffic. Outer tag for QinQ encapsulation.
     *
     * @return the stag value.
     */
    public Integer stag() {
        return this.stag;
    }

    /**
     * Get the provisioningState property: Gets the provisioning state of the public IP resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: Gets the provisioning state of the public IP resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the gatewayManagerEtag property: The GatewayManager Etag.
     *
     * @return the gatewayManagerEtag value.
     */
    public String gatewayManagerEtag() {
        return this.gatewayManagerEtag;
    }

    /**
     * Set the gatewayManagerEtag property: The GatewayManager Etag.
     *
     * @param gatewayManagerEtag the gatewayManagerEtag value to set.
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withGatewayManagerEtag(String gatewayManagerEtag) {
        this.gatewayManagerEtag = gatewayManagerEtag;
        return this;
    }

    /**
     * Get the globalReachEnabled property: Flag denoting Global reach status.
     *
     * @return the globalReachEnabled value.
     */
    public Boolean globalReachEnabled() {
        return this.globalReachEnabled;
    }

    /**
     * Set the globalReachEnabled property: Flag denoting Global reach status.
     *
     * @param globalReachEnabled the globalReachEnabled value to set.
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withGlobalReachEnabled(Boolean globalReachEnabled) {
        this.globalReachEnabled = globalReachEnabled;
        return this;
    }

    /**
     * Get the id property: Resource ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     *
     * @param id the id value to set.
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
        if (authorizations() != null) {
            authorizations().forEach(e -> e.validate());
        }
        if (peerings() != null) {
            peerings().forEach(e -> e.validate());
        }
        if (serviceProviderProperties() != null) {
            serviceProviderProperties().validate();
        }
    }
}
