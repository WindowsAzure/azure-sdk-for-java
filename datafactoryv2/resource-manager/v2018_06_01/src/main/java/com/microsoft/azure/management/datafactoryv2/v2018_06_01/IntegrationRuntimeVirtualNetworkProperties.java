/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * VNet properties for managed integration runtime.
 */
public class IntegrationRuntimeVirtualNetworkProperties {
    /**
     * Unmatched properties from the message are deserialized this collection.
     */
    @JsonProperty(value = "")
    private Map<String, Object> additionalProperties;

    /**
     * The ID of the Subnet that this integration runtime will join.
     */
    @JsonProperty(value = "subnetId")
    private String subnetId;

    /**
     * Get unmatched properties from the message are deserialized this collection.
     *
     * @return the additionalProperties value
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set unmatched properties from the message are deserialized this collection.
     *
     * @param additionalProperties the additionalProperties value to set
     * @return the IntegrationRuntimeVirtualNetworkProperties object itself.
     */
    public IntegrationRuntimeVirtualNetworkProperties withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Get the ID of the Subnet that this integration runtime will join.
     *
     * @return the subnetId value
     */
    public String subnetId() {
        return this.subnetId;
    }

    /**
     * Set the ID of the Subnet that this integration runtime will join.
     *
     * @param subnetId the subnetId value to set
     * @return the IntegrationRuntimeVirtualNetworkProperties object itself.
     */
    public IntegrationRuntimeVirtualNetworkProperties withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

}
