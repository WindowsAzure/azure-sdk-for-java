// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** VPN client connection health detail. */
@Immutable
public final class VpnClientConnectionHealthDetail {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VpnClientConnectionHealthDetail.class);

    /*
     * The vpn client Id.
     */
    @JsonProperty(value = "vpnConnectionId", access = JsonProperty.Access.WRITE_ONLY)
    private String vpnConnectionId;

    /*
     * The duration time of a connected vpn client.
     */
    @JsonProperty(value = "vpnConnectionDuration", access = JsonProperty.Access.WRITE_ONLY)
    private Long vpnConnectionDuration;

    /*
     * The start time of a connected vpn client.
     */
    @JsonProperty(value = "vpnConnectionTime", access = JsonProperty.Access.WRITE_ONLY)
    private String vpnConnectionTime;

    /*
     * The public Ip of a connected vpn client.
     */
    @JsonProperty(value = "publicIpAddress", access = JsonProperty.Access.WRITE_ONLY)
    private String publicIpAddress;

    /*
     * The assigned private Ip of a connected vpn client.
     */
    @JsonProperty(value = "privateIpAddress", access = JsonProperty.Access.WRITE_ONLY)
    private String privateIpAddress;

    /*
     * The user name of a connected vpn client.
     */
    @JsonProperty(value = "vpnUserName", access = JsonProperty.Access.WRITE_ONLY)
    private String vpnUsername;

    /*
     * The max band width.
     */
    @JsonProperty(value = "maxBandwidth", access = JsonProperty.Access.WRITE_ONLY)
    private Long maxBandwidth;

    /*
     * The egress packets per second.
     */
    @JsonProperty(value = "egressPacketsTransferred", access = JsonProperty.Access.WRITE_ONLY)
    private Long egressPacketsTransferred;

    /*
     * The egress bytes per second.
     */
    @JsonProperty(value = "egressBytesTransferred", access = JsonProperty.Access.WRITE_ONLY)
    private Long egressBytesTransferred;

    /*
     * The ingress packets per second.
     */
    @JsonProperty(value = "ingressPacketsTransferred", access = JsonProperty.Access.WRITE_ONLY)
    private Long ingressPacketsTransferred;

    /*
     * The ingress bytes per second.
     */
    @JsonProperty(value = "ingressBytesTransferred", access = JsonProperty.Access.WRITE_ONLY)
    private Long ingressBytesTransferred;

    /*
     * The max packets transferred per second.
     */
    @JsonProperty(value = "maxPacketsPerSecond", access = JsonProperty.Access.WRITE_ONLY)
    private Long maxPacketsPerSecond;

    /**
     * Get the vpnConnectionId property: The vpn client Id.
     *
     * @return the vpnConnectionId value.
     */
    public String vpnConnectionId() {
        return this.vpnConnectionId;
    }

    /**
     * Get the vpnConnectionDuration property: The duration time of a connected vpn client.
     *
     * @return the vpnConnectionDuration value.
     */
    public Long vpnConnectionDuration() {
        return this.vpnConnectionDuration;
    }

    /**
     * Get the vpnConnectionTime property: The start time of a connected vpn client.
     *
     * @return the vpnConnectionTime value.
     */
    public String vpnConnectionTime() {
        return this.vpnConnectionTime;
    }

    /**
     * Get the publicIpAddress property: The public Ip of a connected vpn client.
     *
     * @return the publicIpAddress value.
     */
    public String publicIpAddress() {
        return this.publicIpAddress;
    }

    /**
     * Get the privateIpAddress property: The assigned private Ip of a connected vpn client.
     *
     * @return the privateIpAddress value.
     */
    public String privateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * Get the vpnUsername property: The user name of a connected vpn client.
     *
     * @return the vpnUsername value.
     */
    public String vpnUsername() {
        return this.vpnUsername;
    }

    /**
     * Get the maxBandwidth property: The max band width.
     *
     * @return the maxBandwidth value.
     */
    public Long maxBandwidth() {
        return this.maxBandwidth;
    }

    /**
     * Get the egressPacketsTransferred property: The egress packets per second.
     *
     * @return the egressPacketsTransferred value.
     */
    public Long egressPacketsTransferred() {
        return this.egressPacketsTransferred;
    }

    /**
     * Get the egressBytesTransferred property: The egress bytes per second.
     *
     * @return the egressBytesTransferred value.
     */
    public Long egressBytesTransferred() {
        return this.egressBytesTransferred;
    }

    /**
     * Get the ingressPacketsTransferred property: The ingress packets per second.
     *
     * @return the ingressPacketsTransferred value.
     */
    public Long ingressPacketsTransferred() {
        return this.ingressPacketsTransferred;
    }

    /**
     * Get the ingressBytesTransferred property: The ingress bytes per second.
     *
     * @return the ingressBytesTransferred value.
     */
    public Long ingressBytesTransferred() {
        return this.ingressBytesTransferred;
    }

    /**
     * Get the maxPacketsPerSecond property: The max packets transferred per second.
     *
     * @return the maxPacketsPerSecond value.
     */
    public Long maxPacketsPerSecond() {
        return this.maxPacketsPerSecond;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
