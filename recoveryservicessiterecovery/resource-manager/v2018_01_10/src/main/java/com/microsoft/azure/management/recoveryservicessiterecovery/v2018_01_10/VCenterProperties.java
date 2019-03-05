/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery.v2018_01_10;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * vCenter properties.
 */
public class VCenterProperties {
    /**
     * Friendly name of the vCenter.
     */
    @JsonProperty(value = "friendlyName")
    private String friendlyName;

    /**
     * VCenter internal ID.
     */
    @JsonProperty(value = "internalId")
    private String internalId;

    /**
     * The time when the last heartbeat was received by vCenter.
     */
    @JsonProperty(value = "lastHeartbeat")
    private DateTime lastHeartbeat;

    /**
     * The VCenter discovery status.
     */
    @JsonProperty(value = "discoveryStatus")
    private String discoveryStatus;

    /**
     * The process server Id.
     */
    @JsonProperty(value = "processServerId")
    private String processServerId;

    /**
     * The IP address of the vCenter.
     */
    @JsonProperty(value = "ipAddress")
    private String ipAddress;

    /**
     * The infrastructure Id of vCenter.
     */
    @JsonProperty(value = "infrastructureId")
    private String infrastructureId;

    /**
     * The port number for discovery.
     */
    @JsonProperty(value = "port")
    private String port;

    /**
     * The account Id which has privileges to discover the vCenter.
     */
    @JsonProperty(value = "runAsAccountId")
    private String runAsAccountId;

    /**
     * The ARM resource name of the fabric containing this VCenter.
     */
    @JsonProperty(value = "fabricArmResourceName")
    private String fabricArmResourceName;

    /**
     * Get friendly name of the vCenter.
     *
     * @return the friendlyName value
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set friendly name of the vCenter.
     *
     * @param friendlyName the friendlyName value to set
     * @return the VCenterProperties object itself.
     */
    public VCenterProperties withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get vCenter internal ID.
     *
     * @return the internalId value
     */
    public String internalId() {
        return this.internalId;
    }

    /**
     * Set vCenter internal ID.
     *
     * @param internalId the internalId value to set
     * @return the VCenterProperties object itself.
     */
    public VCenterProperties withInternalId(String internalId) {
        this.internalId = internalId;
        return this;
    }

    /**
     * Get the time when the last heartbeat was received by vCenter.
     *
     * @return the lastHeartbeat value
     */
    public DateTime lastHeartbeat() {
        return this.lastHeartbeat;
    }

    /**
     * Set the time when the last heartbeat was received by vCenter.
     *
     * @param lastHeartbeat the lastHeartbeat value to set
     * @return the VCenterProperties object itself.
     */
    public VCenterProperties withLastHeartbeat(DateTime lastHeartbeat) {
        this.lastHeartbeat = lastHeartbeat;
        return this;
    }

    /**
     * Get the VCenter discovery status.
     *
     * @return the discoveryStatus value
     */
    public String discoveryStatus() {
        return this.discoveryStatus;
    }

    /**
     * Set the VCenter discovery status.
     *
     * @param discoveryStatus the discoveryStatus value to set
     * @return the VCenterProperties object itself.
     */
    public VCenterProperties withDiscoveryStatus(String discoveryStatus) {
        this.discoveryStatus = discoveryStatus;
        return this;
    }

    /**
     * Get the process server Id.
     *
     * @return the processServerId value
     */
    public String processServerId() {
        return this.processServerId;
    }

    /**
     * Set the process server Id.
     *
     * @param processServerId the processServerId value to set
     * @return the VCenterProperties object itself.
     */
    public VCenterProperties withProcessServerId(String processServerId) {
        this.processServerId = processServerId;
        return this;
    }

    /**
     * Get the IP address of the vCenter.
     *
     * @return the ipAddress value
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Set the IP address of the vCenter.
     *
     * @param ipAddress the ipAddress value to set
     * @return the VCenterProperties object itself.
     */
    public VCenterProperties withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Get the infrastructure Id of vCenter.
     *
     * @return the infrastructureId value
     */
    public String infrastructureId() {
        return this.infrastructureId;
    }

    /**
     * Set the infrastructure Id of vCenter.
     *
     * @param infrastructureId the infrastructureId value to set
     * @return the VCenterProperties object itself.
     */
    public VCenterProperties withInfrastructureId(String infrastructureId) {
        this.infrastructureId = infrastructureId;
        return this;
    }

    /**
     * Get the port number for discovery.
     *
     * @return the port value
     */
    public String port() {
        return this.port;
    }

    /**
     * Set the port number for discovery.
     *
     * @param port the port value to set
     * @return the VCenterProperties object itself.
     */
    public VCenterProperties withPort(String port) {
        this.port = port;
        return this;
    }

    /**
     * Get the account Id which has privileges to discover the vCenter.
     *
     * @return the runAsAccountId value
     */
    public String runAsAccountId() {
        return this.runAsAccountId;
    }

    /**
     * Set the account Id which has privileges to discover the vCenter.
     *
     * @param runAsAccountId the runAsAccountId value to set
     * @return the VCenterProperties object itself.
     */
    public VCenterProperties withRunAsAccountId(String runAsAccountId) {
        this.runAsAccountId = runAsAccountId;
        return this;
    }

    /**
     * Get the ARM resource name of the fabric containing this VCenter.
     *
     * @return the fabricArmResourceName value
     */
    public String fabricArmResourceName() {
        return this.fabricArmResourceName;
    }

    /**
     * Set the ARM resource name of the fabric containing this VCenter.
     *
     * @param fabricArmResourceName the fabricArmResourceName value to set
     * @return the VCenterProperties object itself.
     */
    public VCenterProperties withFabricArmResourceName(String fabricArmResourceName) {
        this.fabricArmResourceName = fabricArmResourceName;
        return this;
    }

}
