/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters that define the IP flow to be verified.
 */
public class VerificationIPFlowParameters {
    /**
     * The ID of the target resource to perform next-hop on.
     */
    @JsonProperty(value = "targetResourceId", required = true)
    private String targetResourceId;

    /**
     * The direction of the packet represented as a 5-tuple. Possible values
     * include: 'Inbound', 'Outbound'.
     */
    @JsonProperty(value = "direction", required = true)
    private Direction direction;

    /**
     * Protocol to be verified on. Possible values include: 'TCP', 'UDP'.
     */
    @JsonProperty(value = "protocol", required = true)
    private IpFlowProtocol protocol;

    /**
     * The local port. Acceptable values are a single integer in the range
     * (0-65535). Support for * for the source port, which depends on the
     * direction.
     */
    @JsonProperty(value = "localPort", required = true)
    private String localPort;

    /**
     * The remote port. Acceptable values are a single integer in the range
     * (0-65535). Support for * for the source port, which depends on the
     * direction.
     */
    @JsonProperty(value = "remotePort", required = true)
    private String remotePort;

    /**
     * The local IP address. Acceptable values are valid IPv4 addresses.
     */
    @JsonProperty(value = "localIPAddress", required = true)
    private String localIPAddress;

    /**
     * The remote IP address. Acceptable values are valid IPv4 addresses.
     */
    @JsonProperty(value = "remoteIPAddress", required = true)
    private String remoteIPAddress;

    /**
     * The NIC ID. (If VM has multiple NICs and IP forwarding is enabled on any
     * of them, then this parameter must be specified. Otherwise optional).
     */
    @JsonProperty(value = "targetNicResourceId")
    private String targetNicResourceId;

    /**
     * Get the ID of the target resource to perform next-hop on.
     *
     * @return the targetResourceId value
     */
    public String targetResourceId() {
        return this.targetResourceId;
    }

    /**
     * Set the ID of the target resource to perform next-hop on.
     *
     * @param targetResourceId the targetResourceId value to set
     * @return the VerificationIPFlowParameters object itself.
     */
    public VerificationIPFlowParameters withTargetResourceId(String targetResourceId) {
        this.targetResourceId = targetResourceId;
        return this;
    }

    /**
     * Get the direction of the packet represented as a 5-tuple. Possible values include: 'Inbound', 'Outbound'.
     *
     * @return the direction value
     */
    public Direction direction() {
        return this.direction;
    }

    /**
     * Set the direction of the packet represented as a 5-tuple. Possible values include: 'Inbound', 'Outbound'.
     *
     * @param direction the direction value to set
     * @return the VerificationIPFlowParameters object itself.
     */
    public VerificationIPFlowParameters withDirection(Direction direction) {
        this.direction = direction;
        return this;
    }

    /**
     * Get protocol to be verified on. Possible values include: 'TCP', 'UDP'.
     *
     * @return the protocol value
     */
    public IpFlowProtocol protocol() {
        return this.protocol;
    }

    /**
     * Set protocol to be verified on. Possible values include: 'TCP', 'UDP'.
     *
     * @param protocol the protocol value to set
     * @return the VerificationIPFlowParameters object itself.
     */
    public VerificationIPFlowParameters withProtocol(IpFlowProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the local port. Acceptable values are a single integer in the range (0-65535). Support for * for the source port, which depends on the direction.
     *
     * @return the localPort value
     */
    public String localPort() {
        return this.localPort;
    }

    /**
     * Set the local port. Acceptable values are a single integer in the range (0-65535). Support for * for the source port, which depends on the direction.
     *
     * @param localPort the localPort value to set
     * @return the VerificationIPFlowParameters object itself.
     */
    public VerificationIPFlowParameters withLocalPort(String localPort) {
        this.localPort = localPort;
        return this;
    }

    /**
     * Get the remote port. Acceptable values are a single integer in the range (0-65535). Support for * for the source port, which depends on the direction.
     *
     * @return the remotePort value
     */
    public String remotePort() {
        return this.remotePort;
    }

    /**
     * Set the remote port. Acceptable values are a single integer in the range (0-65535). Support for * for the source port, which depends on the direction.
     *
     * @param remotePort the remotePort value to set
     * @return the VerificationIPFlowParameters object itself.
     */
    public VerificationIPFlowParameters withRemotePort(String remotePort) {
        this.remotePort = remotePort;
        return this;
    }

    /**
     * Get the local IP address. Acceptable values are valid IPv4 addresses.
     *
     * @return the localIPAddress value
     */
    public String localIPAddress() {
        return this.localIPAddress;
    }

    /**
     * Set the local IP address. Acceptable values are valid IPv4 addresses.
     *
     * @param localIPAddress the localIPAddress value to set
     * @return the VerificationIPFlowParameters object itself.
     */
    public VerificationIPFlowParameters withLocalIPAddress(String localIPAddress) {
        this.localIPAddress = localIPAddress;
        return this;
    }

    /**
     * Get the remote IP address. Acceptable values are valid IPv4 addresses.
     *
     * @return the remoteIPAddress value
     */
    public String remoteIPAddress() {
        return this.remoteIPAddress;
    }

    /**
     * Set the remote IP address. Acceptable values are valid IPv4 addresses.
     *
     * @param remoteIPAddress the remoteIPAddress value to set
     * @return the VerificationIPFlowParameters object itself.
     */
    public VerificationIPFlowParameters withRemoteIPAddress(String remoteIPAddress) {
        this.remoteIPAddress = remoteIPAddress;
        return this;
    }

    /**
     * Get the NIC ID. (If VM has multiple NICs and IP forwarding is enabled on any of them, then this parameter must be specified. Otherwise optional).
     *
     * @return the targetNicResourceId value
     */
    public String targetNicResourceId() {
        return this.targetNicResourceId;
    }

    /**
     * Set the NIC ID. (If VM has multiple NICs and IP forwarding is enabled on any of them, then this parameter must be specified. Otherwise optional).
     *
     * @param targetNicResourceId the targetNicResourceId value to set
     * @return the VerificationIPFlowParameters object itself.
     */
    public VerificationIPFlowParameters withTargetNicResourceId(String targetNicResourceId) {
        this.targetNicResourceId = targetNicResourceId;
        return this;
    }

}
