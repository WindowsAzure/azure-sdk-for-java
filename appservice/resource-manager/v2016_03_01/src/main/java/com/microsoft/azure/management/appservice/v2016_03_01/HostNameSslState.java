/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_03_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SSL-enabled hostname.
 */
public class HostNameSslState {
    /**
     * Hostname.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * SSL type. Possible values include: 'Disabled', 'SniEnabled',
     * 'IpBasedEnabled'.
     */
    @JsonProperty(value = "sslState")
    private SslState sslState;

    /**
     * Virtual IP address assigned to the hostname if IP based SSL is enabled.
     */
    @JsonProperty(value = "virtualIP")
    private String virtualIP;

    /**
     * SSL certificate thumbprint.
     */
    @JsonProperty(value = "thumbprint")
    private String thumbprint;

    /**
     * Set to &lt;code&gt;true&lt;/code&gt; to update existing hostname.
     */
    @JsonProperty(value = "toUpdate")
    private Boolean toUpdate;

    /**
     * Indicates whether the hostname is a standard or repository hostname.
     * Possible values include: 'Standard', 'Repository'.
     */
    @JsonProperty(value = "hostType")
    private HostType hostType;

    /**
     * Get hostname.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set hostname.
     *
     * @param name the name value to set
     * @return the HostNameSslState object itself.
     */
    public HostNameSslState withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get sSL type. Possible values include: 'Disabled', 'SniEnabled', 'IpBasedEnabled'.
     *
     * @return the sslState value
     */
    public SslState sslState() {
        return this.sslState;
    }

    /**
     * Set sSL type. Possible values include: 'Disabled', 'SniEnabled', 'IpBasedEnabled'.
     *
     * @param sslState the sslState value to set
     * @return the HostNameSslState object itself.
     */
    public HostNameSslState withSslState(SslState sslState) {
        this.sslState = sslState;
        return this;
    }

    /**
     * Get virtual IP address assigned to the hostname if IP based SSL is enabled.
     *
     * @return the virtualIP value
     */
    public String virtualIP() {
        return this.virtualIP;
    }

    /**
     * Set virtual IP address assigned to the hostname if IP based SSL is enabled.
     *
     * @param virtualIP the virtualIP value to set
     * @return the HostNameSslState object itself.
     */
    public HostNameSslState withVirtualIP(String virtualIP) {
        this.virtualIP = virtualIP;
        return this;
    }

    /**
     * Get sSL certificate thumbprint.
     *
     * @return the thumbprint value
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Set sSL certificate thumbprint.
     *
     * @param thumbprint the thumbprint value to set
     * @return the HostNameSslState object itself.
     */
    public HostNameSslState withThumbprint(String thumbprint) {
        this.thumbprint = thumbprint;
        return this;
    }

    /**
     * Get set to &lt;code&gt;true&lt;/code&gt; to update existing hostname.
     *
     * @return the toUpdate value
     */
    public Boolean toUpdate() {
        return this.toUpdate;
    }

    /**
     * Set set to &lt;code&gt;true&lt;/code&gt; to update existing hostname.
     *
     * @param toUpdate the toUpdate value to set
     * @return the HostNameSslState object itself.
     */
    public HostNameSslState withToUpdate(Boolean toUpdate) {
        this.toUpdate = toUpdate;
        return this;
    }

    /**
     * Get indicates whether the hostname is a standard or repository hostname. Possible values include: 'Standard', 'Repository'.
     *
     * @return the hostType value
     */
    public HostType hostType() {
        return this.hostType;
    }

    /**
     * Set indicates whether the hostname is a standard or repository hostname. Possible values include: 'Standard', 'Repository'.
     *
     * @param hostType the hostType value to set
     * @return the HostNameSslState object itself.
     */
    public HostNameSslState withHostType(HostType hostType) {
        this.hostType = hostType;
        return this;
    }

}
