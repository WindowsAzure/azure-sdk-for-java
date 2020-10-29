// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Defines the configuration of the OpenShift cluster VMs. */
@Fluent
public final class OpenShiftManagedClusterAgentPoolProfile {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OpenShiftManagedClusterAgentPoolProfile.class);

    /*
     * Unique name of the pool profile in the context of the subscription and
     * resource group.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Number of agents (VMs) to host docker containers.
     */
    @JsonProperty(value = "count", required = true)
    private int count;

    /*
     * Size of agent VMs.
     */
    @JsonProperty(value = "vmSize", required = true)
    private OpenShiftContainerServiceVMSize vmSize;

    /*
     * Subnet CIDR for the peering.
     */
    @JsonProperty(value = "subnetCidr")
    private String subnetCidr;

    /*
     * OsType to be used to specify os type. Choose from Linux and Windows.
     * Default to Linux.
     */
    @JsonProperty(value = "osType")
    private OSType osType;

    /*
     * Define the role of the AgentPoolProfile.
     */
    @JsonProperty(value = "role")
    private OpenShiftAgentPoolProfileRole role;

    /**
     * Get the name property: Unique name of the pool profile in the context of the subscription and resource group.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Unique name of the pool profile in the context of the subscription and resource group.
     *
     * @param name the name value to set.
     * @return the OpenShiftManagedClusterAgentPoolProfile object itself.
     */
    public OpenShiftManagedClusterAgentPoolProfile withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the count property: Number of agents (VMs) to host docker containers.
     *
     * @return the count value.
     */
    public int count() {
        return this.count;
    }

    /**
     * Set the count property: Number of agents (VMs) to host docker containers.
     *
     * @param count the count value to set.
     * @return the OpenShiftManagedClusterAgentPoolProfile object itself.
     */
    public OpenShiftManagedClusterAgentPoolProfile withCount(int count) {
        this.count = count;
        return this;
    }

    /**
     * Get the vmSize property: Size of agent VMs.
     *
     * @return the vmSize value.
     */
    public OpenShiftContainerServiceVMSize vmSize() {
        return this.vmSize;
    }

    /**
     * Set the vmSize property: Size of agent VMs.
     *
     * @param vmSize the vmSize value to set.
     * @return the OpenShiftManagedClusterAgentPoolProfile object itself.
     */
    public OpenShiftManagedClusterAgentPoolProfile withVmSize(OpenShiftContainerServiceVMSize vmSize) {
        this.vmSize = vmSize;
        return this;
    }

    /**
     * Get the subnetCidr property: Subnet CIDR for the peering.
     *
     * @return the subnetCidr value.
     */
    public String subnetCidr() {
        return this.subnetCidr;
    }

    /**
     * Set the subnetCidr property: Subnet CIDR for the peering.
     *
     * @param subnetCidr the subnetCidr value to set.
     * @return the OpenShiftManagedClusterAgentPoolProfile object itself.
     */
    public OpenShiftManagedClusterAgentPoolProfile withSubnetCidr(String subnetCidr) {
        this.subnetCidr = subnetCidr;
        return this;
    }

    /**
     * Get the osType property: OsType to be used to specify os type. Choose from Linux and Windows. Default to Linux.
     *
     * @return the osType value.
     */
    public OSType osType() {
        return this.osType;
    }

    /**
     * Set the osType property: OsType to be used to specify os type. Choose from Linux and Windows. Default to Linux.
     *
     * @param osType the osType value to set.
     * @return the OpenShiftManagedClusterAgentPoolProfile object itself.
     */
    public OpenShiftManagedClusterAgentPoolProfile withOsType(OSType osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the role property: Define the role of the AgentPoolProfile.
     *
     * @return the role value.
     */
    public OpenShiftAgentPoolProfileRole role() {
        return this.role;
    }

    /**
     * Set the role property: Define the role of the AgentPoolProfile.
     *
     * @param role the role value to set.
     * @return the OpenShiftManagedClusterAgentPoolProfile object itself.
     */
    public OpenShiftManagedClusterAgentPoolProfile withRole(OpenShiftAgentPoolProfileRole role) {
        this.role = role;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property name in model OpenShiftManagedClusterAgentPoolProfile"));
        }
        if (vmSize() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property vmSize in model OpenShiftManagedClusterAgentPoolProfile"));
        }
    }
}
