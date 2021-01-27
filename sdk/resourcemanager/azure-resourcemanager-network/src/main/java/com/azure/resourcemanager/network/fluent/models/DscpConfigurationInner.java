// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.ProtocolType;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.azure.resourcemanager.network.models.QosIpRange;
import com.azure.resourcemanager.network.models.QosPortRange;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** DSCP Configuration in a resource group. */
@JsonFlatten
@Fluent
public class DscpConfigurationInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DscpConfigurationInner.class);

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * List of markings to be used in the configuration.
     */
    @JsonProperty(value = "properties.markings")
    private List<Integer> markings;

    /*
     * Source IP ranges.
     */
    @JsonProperty(value = "properties.sourceIpRanges")
    private List<QosIpRange> sourceIpRanges;

    /*
     * Destination IP ranges.
     */
    @JsonProperty(value = "properties.destinationIpRanges")
    private List<QosIpRange> destinationIpRanges;

    /*
     * Sources port ranges.
     */
    @JsonProperty(value = "properties.sourcePortRanges")
    private List<QosPortRange> sourcePortRanges;

    /*
     * Destination port ranges.
     */
    @JsonProperty(value = "properties.destinationPortRanges")
    private List<QosPortRange> destinationPortRanges;

    /*
     * RNM supported protocol types.
     */
    @JsonProperty(value = "properties.protocol")
    private ProtocolType protocol;

    /*
     * Qos Collection ID generated by RNM.
     */
    @JsonProperty(value = "properties.qosCollectionId", access = JsonProperty.Access.WRITE_ONLY)
    private String qosCollectionId;

    /*
     * Associated Network Interfaces to the DSCP Configuration.
     */
    @JsonProperty(value = "properties.associatedNetworkInterfaces", access = JsonProperty.Access.WRITE_ONLY)
    private List<NetworkInterfaceInner> associatedNetworkInterfaces;

    /*
     * The resource GUID property of the DSCP Configuration resource.
     */
    @JsonProperty(value = "properties.resourceGuid", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGuid;

    /*
     * The provisioning state of the DSCP Configuration resource.
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
     * Get the markings property: List of markings to be used in the configuration.
     *
     * @return the markings value.
     */
    public List<Integer> markings() {
        return this.markings;
    }

    /**
     * Set the markings property: List of markings to be used in the configuration.
     *
     * @param markings the markings value to set.
     * @return the DscpConfigurationInner object itself.
     */
    public DscpConfigurationInner withMarkings(List<Integer> markings) {
        this.markings = markings;
        return this;
    }

    /**
     * Get the sourceIpRanges property: Source IP ranges.
     *
     * @return the sourceIpRanges value.
     */
    public List<QosIpRange> sourceIpRanges() {
        return this.sourceIpRanges;
    }

    /**
     * Set the sourceIpRanges property: Source IP ranges.
     *
     * @param sourceIpRanges the sourceIpRanges value to set.
     * @return the DscpConfigurationInner object itself.
     */
    public DscpConfigurationInner withSourceIpRanges(List<QosIpRange> sourceIpRanges) {
        this.sourceIpRanges = sourceIpRanges;
        return this;
    }

    /**
     * Get the destinationIpRanges property: Destination IP ranges.
     *
     * @return the destinationIpRanges value.
     */
    public List<QosIpRange> destinationIpRanges() {
        return this.destinationIpRanges;
    }

    /**
     * Set the destinationIpRanges property: Destination IP ranges.
     *
     * @param destinationIpRanges the destinationIpRanges value to set.
     * @return the DscpConfigurationInner object itself.
     */
    public DscpConfigurationInner withDestinationIpRanges(List<QosIpRange> destinationIpRanges) {
        this.destinationIpRanges = destinationIpRanges;
        return this;
    }

    /**
     * Get the sourcePortRanges property: Sources port ranges.
     *
     * @return the sourcePortRanges value.
     */
    public List<QosPortRange> sourcePortRanges() {
        return this.sourcePortRanges;
    }

    /**
     * Set the sourcePortRanges property: Sources port ranges.
     *
     * @param sourcePortRanges the sourcePortRanges value to set.
     * @return the DscpConfigurationInner object itself.
     */
    public DscpConfigurationInner withSourcePortRanges(List<QosPortRange> sourcePortRanges) {
        this.sourcePortRanges = sourcePortRanges;
        return this;
    }

    /**
     * Get the destinationPortRanges property: Destination port ranges.
     *
     * @return the destinationPortRanges value.
     */
    public List<QosPortRange> destinationPortRanges() {
        return this.destinationPortRanges;
    }

    /**
     * Set the destinationPortRanges property: Destination port ranges.
     *
     * @param destinationPortRanges the destinationPortRanges value to set.
     * @return the DscpConfigurationInner object itself.
     */
    public DscpConfigurationInner withDestinationPortRanges(List<QosPortRange> destinationPortRanges) {
        this.destinationPortRanges = destinationPortRanges;
        return this;
    }

    /**
     * Get the protocol property: RNM supported protocol types.
     *
     * @return the protocol value.
     */
    public ProtocolType protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: RNM supported protocol types.
     *
     * @param protocol the protocol value to set.
     * @return the DscpConfigurationInner object itself.
     */
    public DscpConfigurationInner withProtocol(ProtocolType protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the qosCollectionId property: Qos Collection ID generated by RNM.
     *
     * @return the qosCollectionId value.
     */
    public String qosCollectionId() {
        return this.qosCollectionId;
    }

    /**
     * Get the associatedNetworkInterfaces property: Associated Network Interfaces to the DSCP Configuration.
     *
     * @return the associatedNetworkInterfaces value.
     */
    public List<NetworkInterfaceInner> associatedNetworkInterfaces() {
        return this.associatedNetworkInterfaces;
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the DSCP Configuration resource.
     *
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Get the provisioningState property: The provisioning state of the DSCP Configuration resource.
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
     * @return the DscpConfigurationInner object itself.
     */
    public DscpConfigurationInner withId(String id) {
        this.id = id;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DscpConfigurationInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DscpConfigurationInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sourceIpRanges() != null) {
            sourceIpRanges().forEach(e -> e.validate());
        }
        if (destinationIpRanges() != null) {
            destinationIpRanges().forEach(e -> e.validate());
        }
        if (sourcePortRanges() != null) {
            sourcePortRanges().forEach(e -> e.validate());
        }
        if (destinationPortRanges() != null) {
            destinationPortRanges().forEach(e -> e.validate());
        }
        if (associatedNetworkInterfaces() != null) {
            associatedNetworkInterfaces().forEach(e -> e.validate());
        }
    }
}
