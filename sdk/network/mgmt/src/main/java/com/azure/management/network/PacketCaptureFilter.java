// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The PacketCaptureFilter model.
 */
@Fluent
public final class PacketCaptureFilter {
    /*
     * Protocol to be filtered on.
     */
    @JsonProperty(value = "protocol")
    private PcProtocol protocol;

    /*
     * Local IP Address to be filtered on. Notation: "127.0.0.1" for single
     * address entry. "127.0.0.1-127.0.0.255" for range. "127.0.0.1;127.0.0.5"?
     * for multiple entries. Multiple ranges not currently supported. Mixing
     * ranges with multiple entries not currently supported. Default = null.
     */
    @JsonProperty(value = "localIPAddress")
    private String localIPAddress;

    /*
     * Local IP Address to be filtered on. Notation: "127.0.0.1" for single
     * address entry. "127.0.0.1-127.0.0.255" for range. "127.0.0.1;127.0.0.5;"
     * for multiple entries. Multiple ranges not currently supported. Mixing
     * ranges with multiple entries not currently supported. Default = null.
     */
    @JsonProperty(value = "remoteIPAddress")
    private String remoteIPAddress;

    /*
     * Local port to be filtered on. Notation: "80" for single port
     * entry."80-85" for range. "80;443;" for multiple entries. Multiple ranges
     * not currently supported. Mixing ranges with multiple entries not
     * currently supported. Default = null.
     */
    @JsonProperty(value = "localPort")
    private String localPort;

    /*
     * Remote port to be filtered on. Notation: "80" for single port
     * entry."80-85" for range. "80;443;" for multiple entries. Multiple ranges
     * not currently supported. Mixing ranges with multiple entries not
     * currently supported. Default = null.
     */
    @JsonProperty(value = "remotePort")
    private String remotePort;

    /**
     * Get the protocol property: Protocol to be filtered on.
     * 
     * @return the protocol value.
     */
    public PcProtocol protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: Protocol to be filtered on.
     * 
     * @param protocol the protocol value to set.
     * @return the PacketCaptureFilter object itself.
     */
    public PacketCaptureFilter withProtocol(PcProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the localIPAddress property: Local IP Address to be filtered on.
     * Notation: "127.0.0.1" for single address entry. "127.0.0.1-127.0.0.255"
     * for range. "127.0.0.1;127.0.0.5"? for multiple entries. Multiple ranges
     * not currently supported. Mixing ranges with multiple entries not
     * currently supported. Default = null.
     * 
     * @return the localIPAddress value.
     */
    public String localIPAddress() {
        return this.localIPAddress;
    }

    /**
     * Set the localIPAddress property: Local IP Address to be filtered on.
     * Notation: "127.0.0.1" for single address entry. "127.0.0.1-127.0.0.255"
     * for range. "127.0.0.1;127.0.0.5"? for multiple entries. Multiple ranges
     * not currently supported. Mixing ranges with multiple entries not
     * currently supported. Default = null.
     * 
     * @param localIPAddress the localIPAddress value to set.
     * @return the PacketCaptureFilter object itself.
     */
    public PacketCaptureFilter withLocalIPAddress(String localIPAddress) {
        this.localIPAddress = localIPAddress;
        return this;
    }

    /**
     * Get the remoteIPAddress property: Local IP Address to be filtered on.
     * Notation: "127.0.0.1" for single address entry. "127.0.0.1-127.0.0.255"
     * for range. "127.0.0.1;127.0.0.5;" for multiple entries. Multiple ranges
     * not currently supported. Mixing ranges with multiple entries not
     * currently supported. Default = null.
     * 
     * @return the remoteIPAddress value.
     */
    public String remoteIPAddress() {
        return this.remoteIPAddress;
    }

    /**
     * Set the remoteIPAddress property: Local IP Address to be filtered on.
     * Notation: "127.0.0.1" for single address entry. "127.0.0.1-127.0.0.255"
     * for range. "127.0.0.1;127.0.0.5;" for multiple entries. Multiple ranges
     * not currently supported. Mixing ranges with multiple entries not
     * currently supported. Default = null.
     * 
     * @param remoteIPAddress the remoteIPAddress value to set.
     * @return the PacketCaptureFilter object itself.
     */
    public PacketCaptureFilter withRemoteIPAddress(String remoteIPAddress) {
        this.remoteIPAddress = remoteIPAddress;
        return this;
    }

    /**
     * Get the localPort property: Local port to be filtered on. Notation: "80"
     * for single port entry."80-85" for range. "80;443;" for multiple entries.
     * Multiple ranges not currently supported. Mixing ranges with multiple
     * entries not currently supported. Default = null.
     * 
     * @return the localPort value.
     */
    public String localPort() {
        return this.localPort;
    }

    /**
     * Set the localPort property: Local port to be filtered on. Notation: "80"
     * for single port entry."80-85" for range. "80;443;" for multiple entries.
     * Multiple ranges not currently supported. Mixing ranges with multiple
     * entries not currently supported. Default = null.
     * 
     * @param localPort the localPort value to set.
     * @return the PacketCaptureFilter object itself.
     */
    public PacketCaptureFilter withLocalPort(String localPort) {
        this.localPort = localPort;
        return this;
    }

    /**
     * Get the remotePort property: Remote port to be filtered on. Notation:
     * "80" for single port entry."80-85" for range. "80;443;" for multiple
     * entries. Multiple ranges not currently supported. Mixing ranges with
     * multiple entries not currently supported. Default = null.
     * 
     * @return the remotePort value.
     */
    public String remotePort() {
        return this.remotePort;
    }

    /**
     * Set the remotePort property: Remote port to be filtered on. Notation:
     * "80" for single port entry."80-85" for range. "80;443;" for multiple
     * entries. Multiple ranges not currently supported. Mixing ranges with
     * multiple entries not currently supported. Default = null.
     * 
     * @param remotePort the remotePort value to set.
     * @return the PacketCaptureFilter object itself.
     */
    public PacketCaptureFilter withRemotePort(String remotePort) {
        this.remotePort = remotePort;
        return this;
    }
}
