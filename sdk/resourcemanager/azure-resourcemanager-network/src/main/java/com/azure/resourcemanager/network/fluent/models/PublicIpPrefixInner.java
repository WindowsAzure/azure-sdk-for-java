// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.ExtendedLocation;
import com.azure.resourcemanager.network.models.IpTag;
import com.azure.resourcemanager.network.models.IpVersion;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.azure.resourcemanager.network.models.PublicIpPrefixSku;
import com.azure.resourcemanager.network.models.ReferencedPublicIpAddress;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Public IP prefix resource. */
@JsonFlatten
@Fluent
public class PublicIpPrefixInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PublicIpPrefixInner.class);

    /*
     * The extended location of the public ip address.
     */
    @JsonProperty(value = "extendedLocation")
    private ExtendedLocation extendedLocation;

    /*
     * The public IP prefix SKU.
     */
    @JsonProperty(value = "sku")
    private PublicIpPrefixSku sku;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
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
    @JsonProperty(value = "properties.ipPrefix", access = JsonProperty.Access.WRITE_ONLY)
    private String ipPrefix;

    /*
     * The list of all referenced PublicIPAddresses.
     */
    @JsonProperty(value = "properties.publicIPAddresses", access = JsonProperty.Access.WRITE_ONLY)
    private List<ReferencedPublicIpAddress> publicIpAddresses;

    /*
     * The reference to load balancer frontend IP configuration associated with
     * the public IP prefix.
     */
    @JsonProperty(value = "properties.loadBalancerFrontendIpConfiguration", access = JsonProperty.Access.WRITE_ONLY)
    private SubResource loadBalancerFrontendIpConfiguration;

    /*
     * The customIpPrefix that this prefix is associated with.
     */
    @JsonProperty(value = "properties.customIPPrefix")
    private SubResource customIpPrefix;

    /*
     * The resource GUID property of the public IP prefix resource.
     */
    @JsonProperty(value = "properties.resourceGuid", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGuid;

    /*
     * The provisioning state of the public IP prefix resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the extendedLocation property: The extended location of the public ip address.
     *
     * @return the extendedLocation value.
     */
    public ExtendedLocation extendedLocation() {
        return this.extendedLocation;
    }

    /**
     * Set the extendedLocation property: The extended location of the public ip address.
     *
     * @param extendedLocation the extendedLocation value to set.
     * @return the PublicIpPrefixInner object itself.
     */
    public PublicIpPrefixInner withExtendedLocation(ExtendedLocation extendedLocation) {
        this.extendedLocation = extendedLocation;
        return this;
    }

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
     * Get the publicIpAddresses property: The list of all referenced PublicIPAddresses.
     *
     * @return the publicIpAddresses value.
     */
    public List<ReferencedPublicIpAddress> publicIpAddresses() {
        return this.publicIpAddresses;
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
     * Get the customIpPrefix property: The customIpPrefix that this prefix is associated with.
     *
     * @return the customIpPrefix value.
     */
    public SubResource customIpPrefix() {
        return this.customIpPrefix;
    }

    /**
     * Set the customIpPrefix property: The customIpPrefix that this prefix is associated with.
     *
     * @param customIpPrefix the customIpPrefix value to set.
     * @return the PublicIpPrefixInner object itself.
     */
    public PublicIpPrefixInner withCustomIpPrefix(SubResource customIpPrefix) {
        this.customIpPrefix = customIpPrefix;
        return this;
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
     * Get the provisioningState property: The provisioning state of the public IP prefix resource.
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
     * @return the PublicIpPrefixInner object itself.
     */
    public PublicIpPrefixInner withId(String id) {
        this.id = id;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PublicIpPrefixInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PublicIpPrefixInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (extendedLocation() != null) {
            extendedLocation().validate();
        }
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
