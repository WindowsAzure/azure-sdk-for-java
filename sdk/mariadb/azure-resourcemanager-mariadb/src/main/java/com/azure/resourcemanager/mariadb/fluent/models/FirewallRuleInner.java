// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mariadb.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents a server firewall rule. */
@JsonFlatten
@Fluent
public class FirewallRuleInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FirewallRuleInner.class);

    /*
     * The start IP address of the server firewall rule. Must be IPv4 format.
     */
    @JsonProperty(value = "properties.startIpAddress", required = true)
    private String startIpAddress;

    /*
     * The end IP address of the server firewall rule. Must be IPv4 format.
     */
    @JsonProperty(value = "properties.endIpAddress", required = true)
    private String endIpAddress;

    /**
     * Get the startIpAddress property: The start IP address of the server firewall rule. Must be IPv4 format.
     *
     * @return the startIpAddress value.
     */
    public String startIpAddress() {
        return this.startIpAddress;
    }

    /**
     * Set the startIpAddress property: The start IP address of the server firewall rule. Must be IPv4 format.
     *
     * @param startIpAddress the startIpAddress value to set.
     * @return the FirewallRuleInner object itself.
     */
    public FirewallRuleInner withStartIpAddress(String startIpAddress) {
        this.startIpAddress = startIpAddress;
        return this;
    }

    /**
     * Get the endIpAddress property: The end IP address of the server firewall rule. Must be IPv4 format.
     *
     * @return the endIpAddress value.
     */
    public String endIpAddress() {
        return this.endIpAddress;
    }

    /**
     * Set the endIpAddress property: The end IP address of the server firewall rule. Must be IPv4 format.
     *
     * @param endIpAddress the endIpAddress value to set.
     * @return the FirewallRuleInner object itself.
     */
    public FirewallRuleInner withEndIpAddress(String endIpAddress) {
        this.endIpAddress = endIpAddress;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (startIpAddress() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property startIpAddress in model FirewallRuleInner"));
        }
        if (endIpAddress() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property endIpAddress in model FirewallRuleInner"));
        }
    }
}
