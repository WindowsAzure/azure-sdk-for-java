// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** VirtualRouter Resource. */
@JsonFlatten
@Fluent
public class VirtualRouterInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualRouterInner.class);

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * VirtualRouter ASN.
     */
    @JsonProperty(value = "properties.virtualRouterAsn")
    private Long virtualRouterAsn;

    /*
     * VirtualRouter IPs.
     */
    @JsonProperty(value = "properties.virtualRouterIps")
    private List<String> virtualRouterIps;

    /*
     * The Subnet on which VirtualRouter is hosted.
     */
    @JsonProperty(value = "properties.hostedSubnet")
    private SubResource hostedSubnet;

    /*
     * The Gateway on which VirtualRouter is hosted.
     */
    @JsonProperty(value = "properties.hostedGateway")
    private SubResource hostedGateway;

    /*
     * List of references to VirtualRouterPeerings.
     */
    @JsonProperty(value = "properties.peerings", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> peerings;

    /*
     * The provisioning state of the resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the virtualRouterAsn property: VirtualRouter ASN.
     *
     * @return the virtualRouterAsn value.
     */
    public Long virtualRouterAsn() {
        return this.virtualRouterAsn;
    }

    /**
     * Set the virtualRouterAsn property: VirtualRouter ASN.
     *
     * @param virtualRouterAsn the virtualRouterAsn value to set.
     * @return the VirtualRouterInner object itself.
     */
    public VirtualRouterInner withVirtualRouterAsn(Long virtualRouterAsn) {
        this.virtualRouterAsn = virtualRouterAsn;
        return this;
    }

    /**
     * Get the virtualRouterIps property: VirtualRouter IPs.
     *
     * @return the virtualRouterIps value.
     */
    public List<String> virtualRouterIps() {
        return this.virtualRouterIps;
    }

    /**
     * Set the virtualRouterIps property: VirtualRouter IPs.
     *
     * @param virtualRouterIps the virtualRouterIps value to set.
     * @return the VirtualRouterInner object itself.
     */
    public VirtualRouterInner withVirtualRouterIps(List<String> virtualRouterIps) {
        this.virtualRouterIps = virtualRouterIps;
        return this;
    }

    /**
     * Get the hostedSubnet property: The Subnet on which VirtualRouter is hosted.
     *
     * @return the hostedSubnet value.
     */
    public SubResource hostedSubnet() {
        return this.hostedSubnet;
    }

    /**
     * Set the hostedSubnet property: The Subnet on which VirtualRouter is hosted.
     *
     * @param hostedSubnet the hostedSubnet value to set.
     * @return the VirtualRouterInner object itself.
     */
    public VirtualRouterInner withHostedSubnet(SubResource hostedSubnet) {
        this.hostedSubnet = hostedSubnet;
        return this;
    }

    /**
     * Get the hostedGateway property: The Gateway on which VirtualRouter is hosted.
     *
     * @return the hostedGateway value.
     */
    public SubResource hostedGateway() {
        return this.hostedGateway;
    }

    /**
     * Set the hostedGateway property: The Gateway on which VirtualRouter is hosted.
     *
     * @param hostedGateway the hostedGateway value to set.
     * @return the VirtualRouterInner object itself.
     */
    public VirtualRouterInner withHostedGateway(SubResource hostedGateway) {
        this.hostedGateway = hostedGateway;
        return this;
    }

    /**
     * Get the peerings property: List of references to VirtualRouterPeerings.
     *
     * @return the peerings value.
     */
    public List<SubResource> peerings() {
        return this.peerings;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
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
     * @return the VirtualRouterInner object itself.
     */
    public VirtualRouterInner withId(String id) {
        this.id = id;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VirtualRouterInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VirtualRouterInner withTags(Map<String, String> tags) {
        super.withTags(tags);
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
