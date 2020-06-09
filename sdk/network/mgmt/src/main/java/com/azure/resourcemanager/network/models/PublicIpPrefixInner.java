// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.IpTag;
import com.azure.resourcemanager.network.IpVersion;
import com.azure.resourcemanager.network.PublicIpPrefixSku;
import com.azure.resourcemanager.network.ReferencedPublicIpAddress;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The PublicIpPrefix model. */
@JsonFlatten
@Fluent
public class PublicIpPrefixInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PublicIpPrefixInner.class);

    /*
     * The public IP prefix SKU.
     */
    @JsonProperty(value = "sku")
    private PublicIpPrefixSku sku;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * A list of availability zones denoting the IP allocated for the resource
     * needs to come from.
     */
    @JsonProperty(value = "zones")
    private List<String> zones;

    /*
     * The public IP address version.
     */
    @JsonProperty(value = "properties.publicIPAddressVersion")
    private IpVersion publicIpAddressVersion;

    /*
     * The list of tags associated with the public IP prefix.
     */
    @JsonProperty(value = "properties.ipTags")
    private List<IpTag> ipTags;

    /*
     * The Length of the Public IP Prefix.
     */
    @JsonProperty(value = "properties.prefixLength")
    private Integer prefixLength;

    /*
     * The allocated Prefix.
     */
    @JsonProperty(value = "properties.ipPrefix")
    private String ipPrefix;

    /*
     * The list of all referenced PublicIPAddresses.
     */
    @JsonProperty(value = "properties.publicIPAddresses")
    private List<ReferencedPublicIpAddress> publicIpAddresses;

    /*
     * The reference to load balancer frontend IP configuration associated with
     * the public IP prefix.
     */
    @JsonProperty(value = "properties.loadBalancerFrontendIpConfiguration", access = JsonProperty.Access.WRITE_ONLY)
    private SubResource loadBalancerFrontendIpConfiguration;

    /*
     * The resource GUID property of the public IP prefix resource.
     */
    @JsonProperty(value = "properties.resourceGuid")
    private String resourceGuid;

    /*
     * The provisioning state of the Public IP prefix resource. Possible values
     * are: 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the sku property: The public IP prefix SKU.
     *
     * @return the sku value.
     */
    public PublicIpPrefixSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The public IP prefix SKU.
     *
     * @param sku the sku value to set.
     * @return the PublicIpPrefixInner object itself.
     */
    public PublicIpPrefixInner withSku(PublicIpPrefixSku sku) {
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
     * Set the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @param etag the etag value to set.
     * @return the PublicIpPrefixInner object itself.
     */
    public PublicIpPrefixInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the zones property: A list of availability zones denoting the IP allocated for the resource needs to come
     * from.
     *
     * @return the zones value.
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set the zones property: A list of availability zones denoting the IP allocated for the resource needs to come
     * from.
     *
     * @param zones the zones value to set.
     * @return the PublicIpPrefixInner object itself.
     */
    public PublicIpPrefixInner withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

    /**
     * Get the publicIpAddressVersion property: The public IP address version.
     *
     * @return the publicIpAddressVersion value.
     */
    public IpVersion publicIpAddressVersion() {
        return this.publicIpAddressVersion;
    }

    /**
     * Set the publicIpAddressVersion property: The public IP address version.
     *
     * @param publicIpAddressVersion the publicIpAddressVersion value to set.
     * @return the PublicIpPrefixInner object itself.
     */
    public PublicIpPrefixInner withPublicIpAddressVersion(IpVersion publicIpAddressVersion) {
        this.publicIpAddressVersion = publicIpAddressVersion;
        return this;
    }

    /**
     * Get the ipTags property: The list of tags associated with the public IP prefix.
     *
     * @return the ipTags value.
     */
    public List<IpTag> ipTags() {
        return this.ipTags;
    }

    /**
     * Set the ipTags property: The list of tags associated with the public IP prefix.
     *
     * @param ipTags the ipTags value to set.
     * @return the PublicIpPrefixInner object itself.
     */
    public PublicIpPrefixInner withIpTags(List<IpTag> ipTags) {
        this.ipTags = ipTags;
        return this;
    }

    /**
     * Get the prefixLength property: The Length of the Public IP Prefix.
     *
     * @return the prefixLength value.
     */
    public Integer prefixLength() {
        return this.prefixLength;
    }

    /**
     * Set the prefixLength property: The Length of the Public IP Prefix.
     *
     * @param prefixLength the prefixLength value to set.
     * @return the PublicIpPrefixInner object itself.
     */
    public PublicIpPrefixInner withPrefixLength(Integer prefixLength) {
        this.prefixLength = prefixLength;
        return this;
    }

    /**
     * Get the ipPrefix property: The allocated Prefix.
     *
     * @return the ipPrefix value.
     */
    public String ipPrefix() {
        return this.ipPrefix;
    }

    /**
     * Set the ipPrefix property: The allocated Prefix.
     *
     * @param ipPrefix the ipPrefix value to set.
     * @return the PublicIpPrefixInner object itself.
     */
    public PublicIpPrefixInner withIpPrefix(String ipPrefix) {
        this.ipPrefix = ipPrefix;
        return this;
    }

    /**
     * Get the publicIpAddresses property: The list of all referenced PublicIPAddresses.
     *
     * @return the publicIpAddresses value.
     */
    public List<ReferencedPublicIpAddress> publicIpAddresses() {
        return this.publicIpAddresses;
    }

    /**
     * Set the publicIpAddresses property: The list of all referenced PublicIPAddresses.
     *
     * @param publicIpAddresses the publicIpAddresses value to set.
     * @return the PublicIpPrefixInner object itself.
     */
    public PublicIpPrefixInner withPublicIpAddresses(List<ReferencedPublicIpAddress> publicIpAddresses) {
        this.publicIpAddresses = publicIpAddresses;
        return this;
    }

    /**
     * Get the loadBalancerFrontendIpConfiguration property: The reference to load balancer frontend IP configuration
     * associated with the public IP prefix.
     *
     * @return the loadBalancerFrontendIpConfiguration value.
     */
    public SubResource loadBalancerFrontendIpConfiguration() {
        return this.loadBalancerFrontendIpConfiguration;
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the public IP prefix resource.
     *
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Set the resourceGuid property: The resource GUID property of the public IP prefix resource.
     *
     * @param resourceGuid the resourceGuid value to set.
     * @return the PublicIpPrefixInner object itself.
     */
    public PublicIpPrefixInner withResourceGuid(String resourceGuid) {
        this.resourceGuid = resourceGuid;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the Public IP prefix resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The provisioning state of the Public IP prefix resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the PublicIpPrefixInner object itself.
     */
    public PublicIpPrefixInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
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
     * @return the PublicIpPrefixInner object itself.
     */
    public PublicIpPrefixInner withId(String id) {
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
        if (ipTags() != null) {
            ipTags().forEach(e -> e.validate());
        }
        if (publicIpAddresses() != null) {
            publicIpAddresses().forEach(e -> e.validate());
        }
    }
}
