// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Guest OS Customization properties. */
@Fluent
public final class GuestOSCustomization {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GuestOSCustomization.class);

    /*
     * List of dns servers to use
     */
    @JsonProperty(value = "dnsServers")
    private List<String> dnsServers;

    /*
     * Virtual Machine hostname
     */
    @JsonProperty(value = "hostName")
    private String hostname;

    /*
     * Password for login
     */
    @JsonProperty(value = "password")
    private String password;

    /*
     * id of customization policy
     */
    @JsonProperty(value = "policyId")
    private String policyId;

    /*
     * Username for login
     */
    @JsonProperty(value = "username")
    private String username;

    /**
     * Get the dnsServers property: List of dns servers to use.
     *
     * @return the dnsServers value.
     */
    public List<String> dnsServers() {
        return this.dnsServers;
    }

    /**
     * Set the dnsServers property: List of dns servers to use.
     *
     * @param dnsServers the dnsServers value to set.
     * @return the GuestOSCustomization object itself.
     */
    public GuestOSCustomization withDnsServers(List<String> dnsServers) {
        this.dnsServers = dnsServers;
        return this;
    }

    /**
     * Get the hostname property: Virtual Machine hostname.
     *
     * @return the hostname value.
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Set the hostname property: Virtual Machine hostname.
     *
     * @param hostname the hostname value to set.
     * @return the GuestOSCustomization object itself.
     */
    public GuestOSCustomization withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * Get the password property: Password for login.
     *
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password property: Password for login.
     *
     * @param password the password value to set.
     * @return the GuestOSCustomization object itself.
     */
    public GuestOSCustomization withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get the policyId property: id of customization policy.
     *
     * @return the policyId value.
     */
    public String policyId() {
        return this.policyId;
    }

    /**
     * Set the policyId property: id of customization policy.
     *
     * @param policyId the policyId value to set.
     * @return the GuestOSCustomization object itself.
     */
    public GuestOSCustomization withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * Get the username property: Username for login.
     *
     * @return the username value.
     */
    public String username() {
        return this.username;
    }

    /**
     * Set the username property: Username for login.
     *
     * @param username the username value to set.
     * @return the GuestOSCustomization object itself.
     */
    public GuestOSCustomization withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
