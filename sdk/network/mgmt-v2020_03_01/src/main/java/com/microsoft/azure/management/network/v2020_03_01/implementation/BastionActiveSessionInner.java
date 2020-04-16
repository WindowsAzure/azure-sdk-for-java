/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_03_01.implementation;

import com.microsoft.azure.management.network.v2020_03_01.BastionConnectProtocol;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The session detail for a target.
 */
public class BastionActiveSessionInner {
    /**
     * A unique id for the session.
     */
    @JsonProperty(value = "sessionId", access = JsonProperty.Access.WRITE_ONLY)
    private String sessionId;

    /**
     * The time when the session started.
     */
    @JsonProperty(value = "startTime", access = JsonProperty.Access.WRITE_ONLY)
    private Object startTime;

    /**
     * The subscription id for the target virtual machine.
     */
    @JsonProperty(value = "targetSubscriptionId", access = JsonProperty.Access.WRITE_ONLY)
    private String targetSubscriptionId;

    /**
     * The type of the resource.
     */
    @JsonProperty(value = "resourceType", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceType;

    /**
     * The host name of the target.
     */
    @JsonProperty(value = "targetHostName", access = JsonProperty.Access.WRITE_ONLY)
    private String targetHostName;

    /**
     * The resource group of the target.
     */
    @JsonProperty(value = "targetResourceGroup", access = JsonProperty.Access.WRITE_ONLY)
    private String targetResourceGroup;

    /**
     * The user name who is active on this session.
     */
    @JsonProperty(value = "userName", access = JsonProperty.Access.WRITE_ONLY)
    private String userName;

    /**
     * The IP Address of the target.
     */
    @JsonProperty(value = "targetIpAddress", access = JsonProperty.Access.WRITE_ONLY)
    private String targetIpAddress;

    /**
     * The protocol used to connect to the target. Possible values include:
     * 'SSH', 'RDP'.
     */
    @JsonProperty(value = "protocol", access = JsonProperty.Access.WRITE_ONLY)
    private BastionConnectProtocol protocol;

    /**
     * The resource id of the target.
     */
    @JsonProperty(value = "targetResourceId", access = JsonProperty.Access.WRITE_ONLY)
    private String targetResourceId;

    /**
     * Duration in mins the session has been active.
     */
    @JsonProperty(value = "sessionDurationInMins", access = JsonProperty.Access.WRITE_ONLY)
    private Double sessionDurationInMins;

    /**
     * Get a unique id for the session.
     *
     * @return the sessionId value
     */
    public String sessionId() {
        return this.sessionId;
    }

    /**
     * Get the time when the session started.
     *
     * @return the startTime value
     */
    public Object startTime() {
        return this.startTime;
    }

    /**
     * Get the subscription id for the target virtual machine.
     *
     * @return the targetSubscriptionId value
     */
    public String targetSubscriptionId() {
        return this.targetSubscriptionId;
    }

    /**
     * Get the type of the resource.
     *
     * @return the resourceType value
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Get the host name of the target.
     *
     * @return the targetHostName value
     */
    public String targetHostName() {
        return this.targetHostName;
    }

    /**
     * Get the resource group of the target.
     *
     * @return the targetResourceGroup value
     */
    public String targetResourceGroup() {
        return this.targetResourceGroup;
    }

    /**
     * Get the user name who is active on this session.
     *
     * @return the userName value
     */
    public String userName() {
        return this.userName;
    }

    /**
     * Get the IP Address of the target.
     *
     * @return the targetIpAddress value
     */
    public String targetIpAddress() {
        return this.targetIpAddress;
    }

    /**
     * Get the protocol used to connect to the target. Possible values include: 'SSH', 'RDP'.
     *
     * @return the protocol value
     */
    public BastionConnectProtocol protocol() {
        return this.protocol;
    }

    /**
     * Get the resource id of the target.
     *
     * @return the targetResourceId value
     */
    public String targetResourceId() {
        return this.targetResourceId;
    }

    /**
     * Get duration in mins the session has been active.
     *
     * @return the sessionDurationInMins value
     */
    public Double sessionDurationInMins() {
        return this.sessionDurationInMins;
    }

}
