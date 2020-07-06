// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.inner;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.InboundNatPool;
import com.azure.resourcemanager.network.models.LoadBalancerSku;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The LoadBalancer model. */
@JsonFlatten
@Fluent
public class LoadBalancerInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LoadBalancerInner.class);

    /*
     * The load balancer SKU.
     */
    @JsonProperty(value = "sku")
    private LoadBalancerSku sku;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Object representing the frontend IPs to be used for the load balancer.
     */
    @JsonProperty(value = "properties.frontendIPConfigurations")
    private List<FrontendIpConfigurationInner> frontendIpConfigurations;

    /*
     * Collection of backend address pools used by a load balancer.
     */
    @JsonProperty(value = "properties.backendAddressPools")
    private List<BackendAddressPoolInner> backendAddressPools;

    /*
     * Object collection representing the load balancing rules Gets the
     * provisioning.
     */
    @JsonProperty(value = "properties.loadBalancingRules")
    private List<LoadBalancingRuleInner> loadBalancingRules;

    /*
     * Collection of probe objects used in the load balancer.
     */
    @JsonProperty(value = "properties.probes")
    private List<ProbeInner> probes;

    /*
     * Collection of inbound NAT Rules used by a load balancer. Defining
     * inbound NAT rules on your load balancer is mutually exclusive with
     * defining an inbound NAT pool. Inbound NAT pools are referenced from
     * virtual machine scale sets. NICs that are associated with individual
     * virtual machines cannot reference an Inbound NAT pool. They have to
     * reference individual inbound NAT rules.
     */
    @JsonProperty(value = "properties.inboundNatRules")
    private List<InboundNatRuleInner> inboundNatRules;

    /*
     * Defines an external port range for inbound NAT to a single backend port
     * on NICs associated with a load balancer. Inbound NAT rules are created
     * automatically for each NIC associated with the Load Balancer using an
     * external port from this range. Defining an Inbound NAT pool on your Load
     * Balancer is mutually exclusive with defining inbound Nat rules. Inbound
     * NAT pools are referenced from virtual machine scale sets. NICs that are
     * associated with individual virtual machines cannot reference an inbound
     * NAT pool. They have to reference individual inbound NAT rules.
     */
    @JsonProperty(value = "properties.inboundNatPools")
    private List<InboundNatPool> inboundNatPools;

    /*
     * The outbound rules.
     */
    @JsonProperty(value = "properties.outboundRules")
    private List<OutboundRuleInner> outboundRules;

    /*
     * The resource GUID property of the load balancer resource.
     */
    @JsonProperty(value = "properties.resourceGuid", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGuid;

    /*
     * The provisioning state of the load balancer resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the sku property: The load balancer SKU.
     *
     * @return the sku value.
     */
    public LoadBalancerSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The load balancer SKU.
     *
     * @param sku the sku value to set.
     * @return the LoadBalancerInner object itself.
     */
    public LoadBalancerInner withSku(LoadBalancerSku sku) {
        this.sku = sku;
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
     * Get the frontendIpConfigurations property: Object representing the frontend IPs to be used for the load balancer.
     *
     * @return the frontendIpConfigurations value.
     */
    public List<FrontendIpConfigurationInner> frontendIpConfigurations() {
        return this.frontendIpConfigurations;
    }

    /**
     * Set the frontendIpConfigurations property: Object representing the frontend IPs to be used for the load balancer.
     *
     * @param frontendIpConfigurations the frontendIpConfigurations value to set.
     * @return the LoadBalancerInner object itself.
     */
    public LoadBalancerInner withFrontendIpConfigurations(List<FrontendIpConfigurationInner> frontendIpConfigurations) {
        this.frontendIpConfigurations = frontendIpConfigurations;
        return this;
    }

    /**
     * Get the backendAddressPools property: Collection of backend address pools used by a load balancer.
     *
     * @return the backendAddressPools value.
     */
    public List<BackendAddressPoolInner> backendAddressPools() {
        return this.backendAddressPools;
    }

    /**
     * Set the backendAddressPools property: Collection of backend address pools used by a load balancer.
     *
     * @param backendAddressPools the backendAddressPools value to set.
     * @return the LoadBalancerInner object itself.
     */
    public LoadBalancerInner withBackendAddressPools(List<BackendAddressPoolInner> backendAddressPools) {
        this.backendAddressPools = backendAddressPools;
        return this;
    }

    /**
     * Get the loadBalancingRules property: Object collection representing the load balancing rules Gets the
     * provisioning.
     *
     * @return the loadBalancingRules value.
     */
    public List<LoadBalancingRuleInner> loadBalancingRules() {
        return this.loadBalancingRules;
    }

    /**
     * Set the loadBalancingRules property: Object collection representing the load balancing rules Gets the
     * provisioning.
     *
     * @param loadBalancingRules the loadBalancingRules value to set.
     * @return the LoadBalancerInner object itself.
     */
    public LoadBalancerInner withLoadBalancingRules(List<LoadBalancingRuleInner> loadBalancingRules) {
        this.loadBalancingRules = loadBalancingRules;
        return this;
    }

    /**
     * Get the probes property: Collection of probe objects used in the load balancer.
     *
     * @return the probes value.
     */
    public List<ProbeInner> probes() {
        return this.probes;
    }

    /**
     * Set the probes property: Collection of probe objects used in the load balancer.
     *
     * @param probes the probes value to set.
     * @return the LoadBalancerInner object itself.
     */
    public LoadBalancerInner withProbes(List<ProbeInner> probes) {
        this.probes = probes;
        return this;
    }

    /**
     * Get the inboundNatRules property: Collection of inbound NAT Rules used by a load balancer. Defining inbound NAT
     * rules on your load balancer is mutually exclusive with defining an inbound NAT pool. Inbound NAT pools are
     * referenced from virtual machine scale sets. NICs that are associated with individual virtual machines cannot
     * reference an Inbound NAT pool. They have to reference individual inbound NAT rules.
     *
     * @return the inboundNatRules value.
     */
    public List<InboundNatRuleInner> inboundNatRules() {
        return this.inboundNatRules;
    }

    /**
     * Set the inboundNatRules property: Collection of inbound NAT Rules used by a load balancer. Defining inbound NAT
     * rules on your load balancer is mutually exclusive with defining an inbound NAT pool. Inbound NAT pools are
     * referenced from virtual machine scale sets. NICs that are associated with individual virtual machines cannot
     * reference an Inbound NAT pool. They have to reference individual inbound NAT rules.
     *
     * @param inboundNatRules the inboundNatRules value to set.
     * @return the LoadBalancerInner object itself.
     */
    public LoadBalancerInner withInboundNatRules(List<InboundNatRuleInner> inboundNatRules) {
        this.inboundNatRules = inboundNatRules;
        return this;
    }

    /**
     * Get the inboundNatPools property: Defines an external port range for inbound NAT to a single backend port on NICs
     * associated with a load balancer. Inbound NAT rules are created automatically for each NIC associated with the
     * Load Balancer using an external port from this range. Defining an Inbound NAT pool on your Load Balancer is
     * mutually exclusive with defining inbound Nat rules. Inbound NAT pools are referenced from virtual machine scale
     * sets. NICs that are associated with individual virtual machines cannot reference an inbound NAT pool. They have
     * to reference individual inbound NAT rules.
     *
     * @return the inboundNatPools value.
     */
    public List<InboundNatPool> inboundNatPools() {
        return this.inboundNatPools;
    }

    /**
     * Set the inboundNatPools property: Defines an external port range for inbound NAT to a single backend port on NICs
     * associated with a load balancer. Inbound NAT rules are created automatically for each NIC associated with the
     * Load Balancer using an external port from this range. Defining an Inbound NAT pool on your Load Balancer is
     * mutually exclusive with defining inbound Nat rules. Inbound NAT pools are referenced from virtual machine scale
     * sets. NICs that are associated with individual virtual machines cannot reference an inbound NAT pool. They have
     * to reference individual inbound NAT rules.
     *
     * @param inboundNatPools the inboundNatPools value to set.
     * @return the LoadBalancerInner object itself.
     */
    public LoadBalancerInner withInboundNatPools(List<InboundNatPool> inboundNatPools) {
        this.inboundNatPools = inboundNatPools;
        return this;
    }

    /**
     * Get the outboundRules property: The outbound rules.
     *
     * @return the outboundRules value.
     */
    public List<OutboundRuleInner> outboundRules() {
        return this.outboundRules;
    }

    /**
     * Set the outboundRules property: The outbound rules.
     *
     * @param outboundRules the outboundRules value to set.
     * @return the LoadBalancerInner object itself.
     */
    public LoadBalancerInner withOutboundRules(List<OutboundRuleInner> outboundRules) {
        this.outboundRules = outboundRules;
        return this;
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the load balancer resource.
     *
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Get the provisioningState property: The provisioning state of the load balancer resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
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
     * @return the LoadBalancerInner object itself.
     */
    public LoadBalancerInner withId(String id) {
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
        if (frontendIpConfigurations() != null) {
            frontendIpConfigurations().forEach(e -> e.validate());
        }
        if (backendAddressPools() != null) {
            backendAddressPools().forEach(e -> e.validate());
        }
        if (loadBalancingRules() != null) {
            loadBalancingRules().forEach(e -> e.validate());
        }
        if (probes() != null) {
            probes().forEach(e -> e.validate());
        }
        if (inboundNatRules() != null) {
            inboundNatRules().forEach(e -> e.validate());
        }
        if (inboundNatPools() != null) {
            inboundNatPools().forEach(e -> e.validate());
        }
        if (outboundRules() != null) {
            outboundRules().forEach(e -> e.validate());
        }
    }
}
