// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.management.network.DdosSettings;
import com.azure.management.network.IPAllocationMethod;
import com.azure.management.network.IpTag;
import com.azure.management.network.IPVersion;
import com.azure.management.network.PublicIPAddressDnsSettings;
import com.azure.management.network.PublicIPAddressSku;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The PublicIPAddress model.
 */
@JsonFlatten
@Fluent
public class PublicIPAddressInner extends Resource {
    /*
     * SKU of a public IP address.
     */
    @JsonProperty(value = "sku")
    private PublicIPAddressSku sku;

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
     * IP address allocation method.
     */
    @JsonProperty(value = "properties.publicIPAllocationMethod")
    private IPAllocationMethod publicIPAllocationMethod;

    /*
     * IP address version.
     */
    @JsonProperty(value = "properties.publicIPAddressVersion")
    private IPVersion publicIPAddressVersion;

    /*
     * IP configuration.
     */
    @JsonProperty(value = "properties.ipConfiguration", access = JsonProperty.Access.WRITE_ONLY)
    private IPConfigurationInner ipConfiguration;

    /*
     * Contains FQDN of the DNS record associated with the public IP address.
     */
    @JsonProperty(value = "properties.dnsSettings")
    private PublicIPAddressDnsSettings dnsSettings;

    /*
     * Contains the DDoS protection settings of the public IP.
     */
    @JsonProperty(value = "properties.ddosSettings")
    private DdosSettings ddosSettings;

    /*
     * The list of tags associated with the public IP address.
     */
    @JsonProperty(value = "properties.ipTags")
    private List<IpTag> ipTags;

    /*
     * The IP address associated with the public IP address resource.
     */
    @JsonProperty(value = "properties.ipAddress")
    private String ipAddress;

    /*
     * Reference to another subresource.
     */
    @JsonProperty(value = "properties.publicIPPrefix")
    private SubResource publicIPPrefix;

    /*
     * The idle timeout of the public IP address.
     */
    @JsonProperty(value = "properties.idleTimeoutInMinutes")
    private Integer idleTimeoutInMinutes;

    /*
     * The resource GUID property of the public IP resource.
     */
    @JsonProperty(value = "properties.resourceGuid")
    private String resourceGuid;

    /*
     * The provisioning state of the PublicIP resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the sku property: SKU of a public IP address.
     * 
     * @return the sku value.
     */
    public PublicIPAddressSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: SKU of a public IP address.
     * 
     * @param sku the sku value to set.
     * @return the PublicIPAddressInner object itself.
     */
    public PublicIPAddressInner withSku(PublicIPAddressSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever
     * the resource is updated.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: A unique read-only string that changes whenever
     * the resource is updated.
     * 
     * @param etag the etag value to set.
     * @return the PublicIPAddressInner object itself.
     */
    public PublicIPAddressInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the zones property: A list of availability zones denoting the IP
     * allocated for the resource needs to come from.
     * 
     * @return the zones value.
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set the zones property: A list of availability zones denoting the IP
     * allocated for the resource needs to come from.
     * 
     * @param zones the zones value to set.
     * @return the PublicIPAddressInner object itself.
     */
    public PublicIPAddressInner withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

    /**
     * Get the publicIPAllocationMethod property: IP address allocation method.
     * 
     * @return the publicIPAllocationMethod value.
     */
    public IPAllocationMethod publicIPAllocationMethod() {
        return this.publicIPAllocationMethod;
    }

    /**
     * Set the publicIPAllocationMethod property: IP address allocation method.
     * 
     * @param publicIPAllocationMethod the publicIPAllocationMethod value to
     * set.
     * @return the PublicIPAddressInner object itself.
     */
    public PublicIPAddressInner withPublicIPAllocationMethod(IPAllocationMethod publicIPAllocationMethod) {
        this.publicIPAllocationMethod = publicIPAllocationMethod;
        return this;
    }

    /**
     * Get the publicIPAddressVersion property: IP address version.
     * 
     * @return the publicIPAddressVersion value.
     */
    public IPVersion publicIPAddressVersion() {
        return this.publicIPAddressVersion;
    }

    /**
     * Set the publicIPAddressVersion property: IP address version.
     * 
     * @param publicIPAddressVersion the publicIPAddressVersion value to set.
     * @return the PublicIPAddressInner object itself.
     */
    public PublicIPAddressInner withPublicIPAddressVersion(IPVersion publicIPAddressVersion) {
        this.publicIPAddressVersion = publicIPAddressVersion;
        return this;
    }

    /**
     * Get the ipConfiguration property: IP configuration.
     * 
     * @return the ipConfiguration value.
     */
    public IPConfigurationInner ipConfiguration() {
        return this.ipConfiguration;
    }

    /**
     * Get the dnsSettings property: Contains FQDN of the DNS record associated
     * with the public IP address.
     * 
     * @return the dnsSettings value.
     */
    public PublicIPAddressDnsSettings dnsSettings() {
        return this.dnsSettings;
    }

    /**
     * Set the dnsSettings property: Contains FQDN of the DNS record associated
     * with the public IP address.
     * 
     * @param dnsSettings the dnsSettings value to set.
     * @return the PublicIPAddressInner object itself.
     */
    public PublicIPAddressInner withDnsSettings(PublicIPAddressDnsSettings dnsSettings) {
        this.dnsSettings = dnsSettings;
        return this;
    }

    /**
     * Get the ddosSettings property: Contains the DDoS protection settings of
     * the public IP.
     * 
     * @return the ddosSettings value.
     */
    public DdosSettings ddosSettings() {
        return this.ddosSettings;
    }

    /**
     * Set the ddosSettings property: Contains the DDoS protection settings of
     * the public IP.
     * 
     * @param ddosSettings the ddosSettings value to set.
     * @return the PublicIPAddressInner object itself.
     */
    public PublicIPAddressInner withDdosSettings(DdosSettings ddosSettings) {
        this.ddosSettings = ddosSettings;
        return this;
    }

    /**
     * Get the ipTags property: The list of tags associated with the public IP
     * address.
     * 
     * @return the ipTags value.
     */
    public List<IpTag> ipTags() {
        return this.ipTags;
    }

    /**
     * Set the ipTags property: The list of tags associated with the public IP
     * address.
     * 
     * @param ipTags the ipTags value to set.
     * @return the PublicIPAddressInner object itself.
     */
    public PublicIPAddressInner withIpTags(List<IpTag> ipTags) {
        this.ipTags = ipTags;
        return this;
    }

    /**
     * Get the ipAddress property: The IP address associated with the public IP
     * address resource.
     * 
     * @return the ipAddress value.
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Set the ipAddress property: The IP address associated with the public IP
     * address resource.
     * 
     * @param ipAddress the ipAddress value to set.
     * @return the PublicIPAddressInner object itself.
     */
    public PublicIPAddressInner withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Get the publicIPPrefix property: Reference to another subresource.
     * 
     * @return the publicIPPrefix value.
     */
    public SubResource publicIPPrefix() {
        return this.publicIPPrefix;
    }

    /**
     * Set the publicIPPrefix property: Reference to another subresource.
     * 
     * @param publicIPPrefix the publicIPPrefix value to set.
     * @return the PublicIPAddressInner object itself.
     */
    public PublicIPAddressInner withPublicIPPrefix(SubResource publicIPPrefix) {
        this.publicIPPrefix = publicIPPrefix;
        return this;
    }

    /**
     * Get the idleTimeoutInMinutes property: The idle timeout of the public IP
     * address.
     * 
     * @return the idleTimeoutInMinutes value.
     */
    public Integer idleTimeoutInMinutes() {
        return this.idleTimeoutInMinutes;
    }

    /**
     * Set the idleTimeoutInMinutes property: The idle timeout of the public IP
     * address.
     * 
     * @param idleTimeoutInMinutes the idleTimeoutInMinutes value to set.
     * @return the PublicIPAddressInner object itself.
     */
    public PublicIPAddressInner withIdleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
        return this;
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the public
     * IP resource.
     * 
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Set the resourceGuid property: The resource GUID property of the public
     * IP resource.
     * 
     * @param resourceGuid the resourceGuid value to set.
     * @return the PublicIPAddressInner object itself.
     */
    public PublicIPAddressInner withResourceGuid(String resourceGuid) {
        this.resourceGuid = resourceGuid;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the
     * PublicIP resource. Possible values are: 'Updating', 'Deleting', and
     * 'Failed'.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The provisioning state of the
     * PublicIP resource. Possible values are: 'Updating', 'Deleting', and
     * 'Failed'.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the PublicIPAddressInner object itself.
     */
    public PublicIPAddressInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the id property: Resource ID.
     * 
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     * 
     * @param id the id value to set.
     * @return the PublicIPAddressInner object itself.
     */
    public PublicIPAddressInner withId(String id) {
        this.id = id;
        return this;
    }
}
