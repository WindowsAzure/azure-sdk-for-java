// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The NetworkProfile model. */
@Fluent
public final class NetworkProfile {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NetworkProfile.class);

    /*
     * Fully qualified resource Id of the subnet to host Azure Spring Cloud
     * Service Runtime
     */
    @JsonProperty(value = "serviceRuntimeSubnetId")
    private String serviceRuntimeSubnetId;

    /*
     * Fully qualified resource Id of the subnet to host Azure Spring Cloud
     * Apps
     */
    @JsonProperty(value = "appSubnetId")
    private String appSubnetId;

    /*
     * Azure Spring Cloud service reserved CIDR
     */
    @JsonProperty(value = "serviceCidr")
    private String serviceCidr;

    /*
     * Name of the resource group containing network resources of Azure Spring
     * Cloud Service Runtime
     */
    @JsonProperty(value = "serviceRuntimeNetworkResourceGroup")
    private String serviceRuntimeNetworkResourceGroup;

    /*
     * Name of the resource group containing network resources of Azure Spring
     * Cloud Apps
     */
    @JsonProperty(value = "appNetworkResourceGroup")
    private String appNetworkResourceGroup;

    /*
     * Desired outbound IP resources for Azure Spring Cloud instance.
     */
    @JsonProperty(value = "outboundIPs", access = JsonProperty.Access.WRITE_ONLY)
    private NetworkProfileOutboundIPs outboundIPs;

    /**
     * Get the serviceRuntimeSubnetId property: Fully qualified resource Id of the subnet to host Azure Spring Cloud
     * Service Runtime.
     *
     * @return the serviceRuntimeSubnetId value.
     */
    public String serviceRuntimeSubnetId() {
        return this.serviceRuntimeSubnetId;
    }

    /**
     * Set the serviceRuntimeSubnetId property: Fully qualified resource Id of the subnet to host Azure Spring Cloud
     * Service Runtime.
     *
     * @param serviceRuntimeSubnetId the serviceRuntimeSubnetId value to set.
     * @return the NetworkProfile object itself.
     */
    public NetworkProfile withServiceRuntimeSubnetId(String serviceRuntimeSubnetId) {
        this.serviceRuntimeSubnetId = serviceRuntimeSubnetId;
        return this;
    }

    /**
     * Get the appSubnetId property: Fully qualified resource Id of the subnet to host Azure Spring Cloud Apps.
     *
     * @return the appSubnetId value.
     */
    public String appSubnetId() {
        return this.appSubnetId;
    }

    /**
     * Set the appSubnetId property: Fully qualified resource Id of the subnet to host Azure Spring Cloud Apps.
     *
     * @param appSubnetId the appSubnetId value to set.
     * @return the NetworkProfile object itself.
     */
    public NetworkProfile withAppSubnetId(String appSubnetId) {
        this.appSubnetId = appSubnetId;
        return this;
    }

    /**
     * Get the serviceCidr property: Azure Spring Cloud service reserved CIDR.
     *
     * @return the serviceCidr value.
     */
    public String serviceCidr() {
        return this.serviceCidr;
    }

    /**
     * Set the serviceCidr property: Azure Spring Cloud service reserved CIDR.
     *
     * @param serviceCidr the serviceCidr value to set.
     * @return the NetworkProfile object itself.
     */
    public NetworkProfile withServiceCidr(String serviceCidr) {
        this.serviceCidr = serviceCidr;
        return this;
    }

    /**
     * Get the serviceRuntimeNetworkResourceGroup property: Name of the resource group containing network resources of
     * Azure Spring Cloud Service Runtime.
     *
     * @return the serviceRuntimeNetworkResourceGroup value.
     */
    public String serviceRuntimeNetworkResourceGroup() {
        return this.serviceRuntimeNetworkResourceGroup;
    }

    /**
     * Set the serviceRuntimeNetworkResourceGroup property: Name of the resource group containing network resources of
     * Azure Spring Cloud Service Runtime.
     *
     * @param serviceRuntimeNetworkResourceGroup the serviceRuntimeNetworkResourceGroup value to set.
     * @return the NetworkProfile object itself.
     */
    public NetworkProfile withServiceRuntimeNetworkResourceGroup(String serviceRuntimeNetworkResourceGroup) {
        this.serviceRuntimeNetworkResourceGroup = serviceRuntimeNetworkResourceGroup;
        return this;
    }

    /**
     * Get the appNetworkResourceGroup property: Name of the resource group containing network resources of Azure Spring
     * Cloud Apps.
     *
     * @return the appNetworkResourceGroup value.
     */
    public String appNetworkResourceGroup() {
        return this.appNetworkResourceGroup;
    }

    /**
     * Set the appNetworkResourceGroup property: Name of the resource group containing network resources of Azure Spring
     * Cloud Apps.
     *
     * @param appNetworkResourceGroup the appNetworkResourceGroup value to set.
     * @return the NetworkProfile object itself.
     */
    public NetworkProfile withAppNetworkResourceGroup(String appNetworkResourceGroup) {
        this.appNetworkResourceGroup = appNetworkResourceGroup;
        return this;
    }

    /**
     * Get the outboundIPs property: Desired outbound IP resources for Azure Spring Cloud instance.
     *
     * @return the outboundIPs value.
     */
    public NetworkProfileOutboundIPs outboundIPs() {
        return this.outboundIPs;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (outboundIPs() != null) {
            outboundIPs().validate();
        }
    }
}
