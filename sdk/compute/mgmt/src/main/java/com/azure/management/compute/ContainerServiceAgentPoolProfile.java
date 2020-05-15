// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ContainerServiceAgentPoolProfile model. */
@Fluent
public final class ContainerServiceAgentPoolProfile {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ContainerServiceAgentPoolProfile.class);

    /*
     * Unique name of the agent pool profile in the context of the subscription
     * and resource group.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Number of agents (VMs) to host docker containers. Allowed values must be
     * in the range of 1 to 100 (inclusive). The default value is 1.
     */
    @JsonProperty(value = "count", required = true)
    private int count;

    /*
     * Size of agent VMs.
     */
    @JsonProperty(value = "vmSize", required = true)
    private ContainerServiceVMSizeTypes vmSize;

    /*
     * DNS prefix to be used to create the FQDN for the agent pool.
     */
    @JsonProperty(value = "dnsPrefix", required = true)
    private String dnsPrefix;

    /*
     * FQDN for the agent pool.
     */
    @JsonProperty(value = "fqdn", access = JsonProperty.Access.WRITE_ONLY)
    private String fqdn;

    /**
     * Get the name property: Unique name of the agent pool profile in the context of the subscription and resource
     * group.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Unique name of the agent pool profile in the context of the subscription and resource
     * group.
     *
     * @param name the name value to set.
     * @return the ContainerServiceAgentPoolProfile object itself.
     */
    public ContainerServiceAgentPoolProfile withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the count property: Number of agents (VMs) to host docker containers. Allowed values must be in the range of
     * 1 to 100 (inclusive). The default value is 1.
     *
     * @return the count value.
     */
    public int count() {
        return this.count;
    }

    /**
     * Set the count property: Number of agents (VMs) to host docker containers. Allowed values must be in the range of
     * 1 to 100 (inclusive). The default value is 1.
     *
     * @param count the count value to set.
     * @return the ContainerServiceAgentPoolProfile object itself.
     */
    public ContainerServiceAgentPoolProfile withCount(int count) {
        this.count = count;
        return this;
    }

    /**
     * Get the vmSize property: Size of agent VMs.
     *
     * @return the vmSize value.
     */
    public ContainerServiceVMSizeTypes vmSize() {
        return this.vmSize;
    }

    /**
     * Set the vmSize property: Size of agent VMs.
     *
     * @param vmSize the vmSize value to set.
     * @return the ContainerServiceAgentPoolProfile object itself.
     */
    public ContainerServiceAgentPoolProfile withVmSize(ContainerServiceVMSizeTypes vmSize) {
        this.vmSize = vmSize;
        return this;
    }

    /**
     * Get the dnsPrefix property: DNS prefix to be used to create the FQDN for the agent pool.
     *
     * @return the dnsPrefix value.
     */
    public String dnsPrefix() {
        return this.dnsPrefix;
    }

    /**
     * Set the dnsPrefix property: DNS prefix to be used to create the FQDN for the agent pool.
     *
     * @param dnsPrefix the dnsPrefix value to set.
     * @return the ContainerServiceAgentPoolProfile object itself.
     */
    public ContainerServiceAgentPoolProfile withDnsPrefix(String dnsPrefix) {
        this.dnsPrefix = dnsPrefix;
        return this;
    }

    /**
     * Get the fqdn property: FQDN for the agent pool.
     *
     * @return the fqdn value.
     */
    public String fqdn() {
        return this.fqdn;
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
                        "Missing required property name in model ContainerServiceAgentPoolProfile"));
        }
        if (vmSize() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property vmSize in model ContainerServiceAgentPoolProfile"));
        }
        if (dnsPrefix() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property dnsPrefix in model ContainerServiceAgentPoolProfile"));
        }
    }
}
