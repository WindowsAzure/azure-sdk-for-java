// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** VNet properties for managed integration runtime. */
@Fluent
public final class IntegrationRuntimeVNetProperties {
    /*
     * The ID of the VNet that this integration runtime will join.
     */
    @JsonProperty(value = "vNetId")
    private String vNetId;

    /*
     * The name of the subnet this integration runtime will join.
     */
    @JsonProperty(value = "subnet")
    private String subnet;

    /*
     * Resource IDs of the public IP addresses that this integration runtime
     * will use.
     */
    @JsonProperty(value = "publicIPs")
    private List<String> publicIPs;

    /*
     * VNet properties for managed integration runtime.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the vNetId property: The ID of the VNet that this integration runtime will join.
     *
     * @return the vNetId value.
     */
    public String getVNetId() {
        return this.vNetId;
    }

    /**
     * Set the vNetId property: The ID of the VNet that this integration runtime will join.
     *
     * @param vNetId the vNetId value to set.
     * @return the IntegrationRuntimeVNetProperties object itself.
     */
    public IntegrationRuntimeVNetProperties setVNetId(String vNetId) {
        this.vNetId = vNetId;
        return this;
    }

    /**
     * Get the subnet property: The name of the subnet this integration runtime will join.
     *
     * @return the subnet value.
     */
    public String getSubnet() {
        return this.subnet;
    }

    /**
     * Set the subnet property: The name of the subnet this integration runtime will join.
     *
     * @param subnet the subnet value to set.
     * @return the IntegrationRuntimeVNetProperties object itself.
     */
    public IntegrationRuntimeVNetProperties setSubnet(String subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get the publicIPs property: Resource IDs of the public IP addresses that this integration runtime will use.
     *
     * @return the publicIPs value.
     */
    public List<String> getPublicIPs() {
        return this.publicIPs;
    }

    /**
     * Set the publicIPs property: Resource IDs of the public IP addresses that this integration runtime will use.
     *
     * @param publicIPs the publicIPs value to set.
     * @return the IntegrationRuntimeVNetProperties object itself.
     */
    public IntegrationRuntimeVNetProperties setPublicIPs(List<String> publicIPs) {
        this.publicIPs = publicIPs;
        return this;
    }

    /**
     * Get the additionalProperties property: VNet properties for managed integration runtime.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: VNet properties for managed integration runtime.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the IntegrationRuntimeVNetProperties object itself.
     */
    public IntegrationRuntimeVNetProperties setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void setAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }
}
