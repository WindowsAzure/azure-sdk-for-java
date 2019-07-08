/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import org.joda.time.DateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Details of a Master Target Server.
 */
public class MasterTargetServer {
    /**
     * The server Id.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The IP address of the server.
     */
    @JsonProperty(value = "ipAddress")
    private String ipAddress;

    /**
     * The server name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The OS type of the server.
     */
    @JsonProperty(value = "osType")
    private String osType;

    /**
     * The version of the scout component on the server.
     */
    @JsonProperty(value = "agentVersion")
    private String agentVersion;

    /**
     * The last heartbeat received from the server.
     */
    @JsonProperty(value = "lastHeartbeat")
    private DateTime lastHeartbeat;

    /**
     * Version status.
     */
    @JsonProperty(value = "versionStatus")
    private String versionStatus;

    /**
     * The retention volumes of Master target Server.
     */
    @JsonProperty(value = "retentionVolumes")
    private List<RetentionVolume> retentionVolumes;

    /**
     * The list of data stores in the fabric.
     */
    @JsonProperty(value = "dataStores")
    private List<DataStore> dataStores;

    /**
     * Validation errors.
     */
    @JsonProperty(value = "validationErrors")
    private List<HealthError> validationErrors;

    /**
     * Health errors.
     */
    @JsonProperty(value = "healthErrors")
    private List<HealthError> healthErrors;

    /**
     * Disk count of the master target.
     */
    @JsonProperty(value = "diskCount")
    private Integer diskCount;

    /**
     * OS Version of the master target.
     */
    @JsonProperty(value = "osVersion")
    private String osVersion;

    /**
     * Agent expiry date.
     */
    @JsonProperty(value = "agentExpiryDate")
    private DateTime agentExpiryDate;

    /**
     * MARS agent version.
     */
    @JsonProperty(value = "marsAgentVersion")
    private String marsAgentVersion;

    /**
     * MARS agent expiry date.
     */
    @JsonProperty(value = "marsAgentExpiryDate")
    private DateTime marsAgentExpiryDate;

    /**
     * Agent version details.
     */
    @JsonProperty(value = "agentVersionDetails")
    private VersionDetails agentVersionDetails;

    /**
     * Mars agent version details.
     */
    @JsonProperty(value = "marsAgentVersionDetails")
    private VersionDetails marsAgentVersionDetails;

    /**
     * Get the server Id.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the server Id.
     *
     * @param id the id value to set
     * @return the MasterTargetServer object itself.
     */
    public MasterTargetServer withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the IP address of the server.
     *
     * @return the ipAddress value
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Set the IP address of the server.
     *
     * @param ipAddress the ipAddress value to set
     * @return the MasterTargetServer object itself.
     */
    public MasterTargetServer withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Get the server name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the server name.
     *
     * @param name the name value to set
     * @return the MasterTargetServer object itself.
     */
    public MasterTargetServer withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the OS type of the server.
     *
     * @return the osType value
     */
    public String osType() {
        return this.osType;
    }

    /**
     * Set the OS type of the server.
     *
     * @param osType the osType value to set
     * @return the MasterTargetServer object itself.
     */
    public MasterTargetServer withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the version of the scout component on the server.
     *
     * @return the agentVersion value
     */
    public String agentVersion() {
        return this.agentVersion;
    }

    /**
     * Set the version of the scout component on the server.
     *
     * @param agentVersion the agentVersion value to set
     * @return the MasterTargetServer object itself.
     */
    public MasterTargetServer withAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }

    /**
     * Get the last heartbeat received from the server.
     *
     * @return the lastHeartbeat value
     */
    public DateTime lastHeartbeat() {
        return this.lastHeartbeat;
    }

    /**
     * Set the last heartbeat received from the server.
     *
     * @param lastHeartbeat the lastHeartbeat value to set
     * @return the MasterTargetServer object itself.
     */
    public MasterTargetServer withLastHeartbeat(DateTime lastHeartbeat) {
        this.lastHeartbeat = lastHeartbeat;
        return this;
    }

    /**
     * Get version status.
     *
     * @return the versionStatus value
     */
    public String versionStatus() {
        return this.versionStatus;
    }

    /**
     * Set version status.
     *
     * @param versionStatus the versionStatus value to set
     * @return the MasterTargetServer object itself.
     */
    public MasterTargetServer withVersionStatus(String versionStatus) {
        this.versionStatus = versionStatus;
        return this;
    }

    /**
     * Get the retention volumes of Master target Server.
     *
     * @return the retentionVolumes value
     */
    public List<RetentionVolume> retentionVolumes() {
        return this.retentionVolumes;
    }

    /**
     * Set the retention volumes of Master target Server.
     *
     * @param retentionVolumes the retentionVolumes value to set
     * @return the MasterTargetServer object itself.
     */
    public MasterTargetServer withRetentionVolumes(List<RetentionVolume> retentionVolumes) {
        this.retentionVolumes = retentionVolumes;
        return this;
    }

    /**
     * Get the list of data stores in the fabric.
     *
     * @return the dataStores value
     */
    public List<DataStore> dataStores() {
        return this.dataStores;
    }

    /**
     * Set the list of data stores in the fabric.
     *
     * @param dataStores the dataStores value to set
     * @return the MasterTargetServer object itself.
     */
    public MasterTargetServer withDataStores(List<DataStore> dataStores) {
        this.dataStores = dataStores;
        return this;
    }

    /**
     * Get validation errors.
     *
     * @return the validationErrors value
     */
    public List<HealthError> validationErrors() {
        return this.validationErrors;
    }

    /**
     * Set validation errors.
     *
     * @param validationErrors the validationErrors value to set
     * @return the MasterTargetServer object itself.
     */
    public MasterTargetServer withValidationErrors(List<HealthError> validationErrors) {
        this.validationErrors = validationErrors;
        return this;
    }

    /**
     * Get health errors.
     *
     * @return the healthErrors value
     */
    public List<HealthError> healthErrors() {
        return this.healthErrors;
    }

    /**
     * Set health errors.
     *
     * @param healthErrors the healthErrors value to set
     * @return the MasterTargetServer object itself.
     */
    public MasterTargetServer withHealthErrors(List<HealthError> healthErrors) {
        this.healthErrors = healthErrors;
        return this;
    }

    /**
     * Get disk count of the master target.
     *
     * @return the diskCount value
     */
    public Integer diskCount() {
        return this.diskCount;
    }

    /**
     * Set disk count of the master target.
     *
     * @param diskCount the diskCount value to set
     * @return the MasterTargetServer object itself.
     */
    public MasterTargetServer withDiskCount(Integer diskCount) {
        this.diskCount = diskCount;
        return this;
    }

    /**
     * Get oS Version of the master target.
     *
     * @return the osVersion value
     */
    public String osVersion() {
        return this.osVersion;
    }

    /**
     * Set oS Version of the master target.
     *
     * @param osVersion the osVersion value to set
     * @return the MasterTargetServer object itself.
     */
    public MasterTargetServer withOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    /**
     * Get agent expiry date.
     *
     * @return the agentExpiryDate value
     */
    public DateTime agentExpiryDate() {
        return this.agentExpiryDate;
    }

    /**
     * Set agent expiry date.
     *
     * @param agentExpiryDate the agentExpiryDate value to set
     * @return the MasterTargetServer object itself.
     */
    public MasterTargetServer withAgentExpiryDate(DateTime agentExpiryDate) {
        this.agentExpiryDate = agentExpiryDate;
        return this;
    }

    /**
     * Get mARS agent version.
     *
     * @return the marsAgentVersion value
     */
    public String marsAgentVersion() {
        return this.marsAgentVersion;
    }

    /**
     * Set mARS agent version.
     *
     * @param marsAgentVersion the marsAgentVersion value to set
     * @return the MasterTargetServer object itself.
     */
    public MasterTargetServer withMarsAgentVersion(String marsAgentVersion) {
        this.marsAgentVersion = marsAgentVersion;
        return this;
    }

    /**
     * Get mARS agent expiry date.
     *
     * @return the marsAgentExpiryDate value
     */
    public DateTime marsAgentExpiryDate() {
        return this.marsAgentExpiryDate;
    }

    /**
     * Set mARS agent expiry date.
     *
     * @param marsAgentExpiryDate the marsAgentExpiryDate value to set
     * @return the MasterTargetServer object itself.
     */
    public MasterTargetServer withMarsAgentExpiryDate(DateTime marsAgentExpiryDate) {
        this.marsAgentExpiryDate = marsAgentExpiryDate;
        return this;
    }

    /**
     * Get agent version details.
     *
     * @return the agentVersionDetails value
     */
    public VersionDetails agentVersionDetails() {
        return this.agentVersionDetails;
    }

    /**
     * Set agent version details.
     *
     * @param agentVersionDetails the agentVersionDetails value to set
     * @return the MasterTargetServer object itself.
     */
    public MasterTargetServer withAgentVersionDetails(VersionDetails agentVersionDetails) {
        this.agentVersionDetails = agentVersionDetails;
        return this;
    }

    /**
     * Get mars agent version details.
     *
     * @return the marsAgentVersionDetails value
     */
    public VersionDetails marsAgentVersionDetails() {
        return this.marsAgentVersionDetails;
    }

    /**
     * Set mars agent version details.
     *
     * @param marsAgentVersionDetails the marsAgentVersionDetails value to set
     * @return the MasterTargetServer object itself.
     */
    public MasterTargetServer withMarsAgentVersionDetails(VersionDetails marsAgentVersionDetails) {
        this.marsAgentVersionDetails = marsAgentVersionDetails;
        return this;
    }

}
