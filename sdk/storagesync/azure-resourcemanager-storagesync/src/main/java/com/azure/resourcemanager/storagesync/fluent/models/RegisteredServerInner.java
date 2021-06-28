// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagesync.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storagesync.models.RegisteredServerAgentVersionStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Registered Server resource. */
@JsonFlatten
@Fluent
public class RegisteredServerInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RegisteredServerInner.class);

    /*
     * Registered Server Certificate
     */
    @JsonProperty(value = "properties.serverCertificate")
    private String serverCertificate;

    /*
     * Registered Server Agent Version
     */
    @JsonProperty(value = "properties.agentVersion")
    private String agentVersion;

    /*
     * Registered Server Agent Version Status
     */
    @JsonProperty(value = "properties.agentVersionStatus", access = JsonProperty.Access.WRITE_ONLY)
    private RegisteredServerAgentVersionStatus agentVersionStatus;

    /*
     * Registered Server Agent Version Expiration Date
     */
    @JsonProperty(value = "properties.agentVersionExpirationDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime agentVersionExpirationDate;

    /*
     * Registered Server OS Version
     */
    @JsonProperty(value = "properties.serverOSVersion")
    private String serverOSVersion;

    /*
     * Registered Server Management Error Code
     */
    @JsonProperty(value = "properties.serverManagementErrorCode")
    private Integer serverManagementErrorCode;

    /*
     * Registered Server last heart beat
     */
    @JsonProperty(value = "properties.lastHeartBeat")
    private String lastHeartBeat;

    /*
     * Registered Server Provisioning State
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /*
     * Registered Server serverRole
     */
    @JsonProperty(value = "properties.serverRole")
    private String serverRole;

    /*
     * Registered Server clusterId
     */
    @JsonProperty(value = "properties.clusterId")
    private String clusterId;

    /*
     * Registered Server clusterName
     */
    @JsonProperty(value = "properties.clusterName")
    private String clusterName;

    /*
     * Registered Server serverId
     */
    @JsonProperty(value = "properties.serverId")
    private String serverId;

    /*
     * Registered Server storageSyncServiceUid
     */
    @JsonProperty(value = "properties.storageSyncServiceUid")
    private String storageSyncServiceUid;

    /*
     * Registered Server lastWorkflowId
     */
    @JsonProperty(value = "properties.lastWorkflowId")
    private String lastWorkflowId;

    /*
     * Resource Last Operation Name
     */
    @JsonProperty(value = "properties.lastOperationName")
    private String lastOperationName;

    /*
     * Resource discoveryEndpointUri
     */
    @JsonProperty(value = "properties.discoveryEndpointUri")
    private String discoveryEndpointUri;

    /*
     * Resource Location
     */
    @JsonProperty(value = "properties.resourceLocation")
    private String resourceLocation;

    /*
     * Service Location
     */
    @JsonProperty(value = "properties.serviceLocation")
    private String serviceLocation;

    /*
     * Friendly Name
     */
    @JsonProperty(value = "properties.friendlyName")
    private String friendlyName;

    /*
     * Management Endpoint Uri
     */
    @JsonProperty(value = "properties.managementEndpointUri")
    private String managementEndpointUri;

    /*
     * Telemetry Endpoint Uri
     */
    @JsonProperty(value = "properties.monitoringEndpointUri")
    private String monitoringEndpointUri;

    /*
     * Monitoring Configuration
     */
    @JsonProperty(value = "properties.monitoringConfiguration")
    private String monitoringConfiguration;

    /*
     * Server name
     */
    @JsonProperty(value = "properties.serverName", access = JsonProperty.Access.WRITE_ONLY)
    private String serverName;

    /**
     * Get the serverCertificate property: Registered Server Certificate.
     *
     * @return the serverCertificate value.
     */
    public String serverCertificate() {
        return this.serverCertificate;
    }

    /**
     * Set the serverCertificate property: Registered Server Certificate.
     *
     * @param serverCertificate the serverCertificate value to set.
     * @return the RegisteredServerInner object itself.
     */
    public RegisteredServerInner withServerCertificate(String serverCertificate) {
        this.serverCertificate = serverCertificate;
        return this;
    }

    /**
     * Get the agentVersion property: Registered Server Agent Version.
     *
     * @return the agentVersion value.
     */
    public String agentVersion() {
        return this.agentVersion;
    }

    /**
     * Set the agentVersion property: Registered Server Agent Version.
     *
     * @param agentVersion the agentVersion value to set.
     * @return the RegisteredServerInner object itself.
     */
    public RegisteredServerInner withAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }

    /**
     * Get the agentVersionStatus property: Registered Server Agent Version Status.
     *
     * @return the agentVersionStatus value.
     */
    public RegisteredServerAgentVersionStatus agentVersionStatus() {
        return this.agentVersionStatus;
    }

    /**
     * Get the agentVersionExpirationDate property: Registered Server Agent Version Expiration Date.
     *
     * @return the agentVersionExpirationDate value.
     */
    public OffsetDateTime agentVersionExpirationDate() {
        return this.agentVersionExpirationDate;
    }

    /**
     * Get the serverOSVersion property: Registered Server OS Version.
     *
     * @return the serverOSVersion value.
     */
    public String serverOSVersion() {
        return this.serverOSVersion;
    }

    /**
     * Set the serverOSVersion property: Registered Server OS Version.
     *
     * @param serverOSVersion the serverOSVersion value to set.
     * @return the RegisteredServerInner object itself.
     */
    public RegisteredServerInner withServerOSVersion(String serverOSVersion) {
        this.serverOSVersion = serverOSVersion;
        return this;
    }

    /**
     * Get the serverManagementErrorCode property: Registered Server Management Error Code.
     *
     * @return the serverManagementErrorCode value.
     */
    public Integer serverManagementErrorCode() {
        return this.serverManagementErrorCode;
    }

    /**
     * Set the serverManagementErrorCode property: Registered Server Management Error Code.
     *
     * @param serverManagementErrorCode the serverManagementErrorCode value to set.
     * @return the RegisteredServerInner object itself.
     */
    public RegisteredServerInner withServerManagementErrorCode(Integer serverManagementErrorCode) {
        this.serverManagementErrorCode = serverManagementErrorCode;
        return this;
    }

    /**
     * Get the lastHeartBeat property: Registered Server last heart beat.
     *
     * @return the lastHeartBeat value.
     */
    public String lastHeartBeat() {
        return this.lastHeartBeat;
    }

    /**
     * Set the lastHeartBeat property: Registered Server last heart beat.
     *
     * @param lastHeartBeat the lastHeartBeat value to set.
     * @return the RegisteredServerInner object itself.
     */
    public RegisteredServerInner withLastHeartBeat(String lastHeartBeat) {
        this.lastHeartBeat = lastHeartBeat;
        return this;
    }

    /**
     * Get the provisioningState property: Registered Server Provisioning State.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: Registered Server Provisioning State.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the RegisteredServerInner object itself.
     */
    public RegisteredServerInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the serverRole property: Registered Server serverRole.
     *
     * @return the serverRole value.
     */
    public String serverRole() {
        return this.serverRole;
    }

    /**
     * Set the serverRole property: Registered Server serverRole.
     *
     * @param serverRole the serverRole value to set.
     * @return the RegisteredServerInner object itself.
     */
    public RegisteredServerInner withServerRole(String serverRole) {
        this.serverRole = serverRole;
        return this;
    }

    /**
     * Get the clusterId property: Registered Server clusterId.
     *
     * @return the clusterId value.
     */
    public String clusterId() {
        return this.clusterId;
    }

    /**
     * Set the clusterId property: Registered Server clusterId.
     *
     * @param clusterId the clusterId value to set.
     * @return the RegisteredServerInner object itself.
     */
    public RegisteredServerInner withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * Get the clusterName property: Registered Server clusterName.
     *
     * @return the clusterName value.
     */
    public String clusterName() {
        return this.clusterName;
    }

    /**
     * Set the clusterName property: Registered Server clusterName.
     *
     * @param clusterName the clusterName value to set.
     * @return the RegisteredServerInner object itself.
     */
    public RegisteredServerInner withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * Get the serverId property: Registered Server serverId.
     *
     * @return the serverId value.
     */
    public String serverId() {
        return this.serverId;
    }

    /**
     * Set the serverId property: Registered Server serverId.
     *
     * @param serverId the serverId value to set.
     * @return the RegisteredServerInner object itself.
     */
    public RegisteredServerInner withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * Get the storageSyncServiceUid property: Registered Server storageSyncServiceUid.
     *
     * @return the storageSyncServiceUid value.
     */
    public String storageSyncServiceUid() {
        return this.storageSyncServiceUid;
    }

    /**
     * Set the storageSyncServiceUid property: Registered Server storageSyncServiceUid.
     *
     * @param storageSyncServiceUid the storageSyncServiceUid value to set.
     * @return the RegisteredServerInner object itself.
     */
    public RegisteredServerInner withStorageSyncServiceUid(String storageSyncServiceUid) {
        this.storageSyncServiceUid = storageSyncServiceUid;
        return this;
    }

    /**
     * Get the lastWorkflowId property: Registered Server lastWorkflowId.
     *
     * @return the lastWorkflowId value.
     */
    public String lastWorkflowId() {
        return this.lastWorkflowId;
    }

    /**
     * Set the lastWorkflowId property: Registered Server lastWorkflowId.
     *
     * @param lastWorkflowId the lastWorkflowId value to set.
     * @return the RegisteredServerInner object itself.
     */
    public RegisteredServerInner withLastWorkflowId(String lastWorkflowId) {
        this.lastWorkflowId = lastWorkflowId;
        return this;
    }

    /**
     * Get the lastOperationName property: Resource Last Operation Name.
     *
     * @return the lastOperationName value.
     */
    public String lastOperationName() {
        return this.lastOperationName;
    }

    /**
     * Set the lastOperationName property: Resource Last Operation Name.
     *
     * @param lastOperationName the lastOperationName value to set.
     * @return the RegisteredServerInner object itself.
     */
    public RegisteredServerInner withLastOperationName(String lastOperationName) {
        this.lastOperationName = lastOperationName;
        return this;
    }

    /**
     * Get the discoveryEndpointUri property: Resource discoveryEndpointUri.
     *
     * @return the discoveryEndpointUri value.
     */
    public String discoveryEndpointUri() {
        return this.discoveryEndpointUri;
    }

    /**
     * Set the discoveryEndpointUri property: Resource discoveryEndpointUri.
     *
     * @param discoveryEndpointUri the discoveryEndpointUri value to set.
     * @return the RegisteredServerInner object itself.
     */
    public RegisteredServerInner withDiscoveryEndpointUri(String discoveryEndpointUri) {
        this.discoveryEndpointUri = discoveryEndpointUri;
        return this;
    }

    /**
     * Get the resourceLocation property: Resource Location.
     *
     * @return the resourceLocation value.
     */
    public String resourceLocation() {
        return this.resourceLocation;
    }

    /**
     * Set the resourceLocation property: Resource Location.
     *
     * @param resourceLocation the resourceLocation value to set.
     * @return the RegisteredServerInner object itself.
     */
    public RegisteredServerInner withResourceLocation(String resourceLocation) {
        this.resourceLocation = resourceLocation;
        return this;
    }

    /**
     * Get the serviceLocation property: Service Location.
     *
     * @return the serviceLocation value.
     */
    public String serviceLocation() {
        return this.serviceLocation;
    }

    /**
     * Set the serviceLocation property: Service Location.
     *
     * @param serviceLocation the serviceLocation value to set.
     * @return the RegisteredServerInner object itself.
     */
    public RegisteredServerInner withServiceLocation(String serviceLocation) {
        this.serviceLocation = serviceLocation;
        return this;
    }

    /**
     * Get the friendlyName property: Friendly Name.
     *
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set the friendlyName property: Friendly Name.
     *
     * @param friendlyName the friendlyName value to set.
     * @return the RegisteredServerInner object itself.
     */
    public RegisteredServerInner withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get the managementEndpointUri property: Management Endpoint Uri.
     *
     * @return the managementEndpointUri value.
     */
    public String managementEndpointUri() {
        return this.managementEndpointUri;
    }

    /**
     * Set the managementEndpointUri property: Management Endpoint Uri.
     *
     * @param managementEndpointUri the managementEndpointUri value to set.
     * @return the RegisteredServerInner object itself.
     */
    public RegisteredServerInner withManagementEndpointUri(String managementEndpointUri) {
        this.managementEndpointUri = managementEndpointUri;
        return this;
    }

    /**
     * Get the monitoringEndpointUri property: Telemetry Endpoint Uri.
     *
     * @return the monitoringEndpointUri value.
     */
    public String monitoringEndpointUri() {
        return this.monitoringEndpointUri;
    }

    /**
     * Set the monitoringEndpointUri property: Telemetry Endpoint Uri.
     *
     * @param monitoringEndpointUri the monitoringEndpointUri value to set.
     * @return the RegisteredServerInner object itself.
     */
    public RegisteredServerInner withMonitoringEndpointUri(String monitoringEndpointUri) {
        this.monitoringEndpointUri = monitoringEndpointUri;
        return this;
    }

    /**
     * Get the monitoringConfiguration property: Monitoring Configuration.
     *
     * @return the monitoringConfiguration value.
     */
    public String monitoringConfiguration() {
        return this.monitoringConfiguration;
    }

    /**
     * Set the monitoringConfiguration property: Monitoring Configuration.
     *
     * @param monitoringConfiguration the monitoringConfiguration value to set.
     * @return the RegisteredServerInner object itself.
     */
    public RegisteredServerInner withMonitoringConfiguration(String monitoringConfiguration) {
        this.monitoringConfiguration = monitoringConfiguration;
        return this;
    }

    /**
     * Get the serverName property: Server name.
     *
     * @return the serverName value.
     */
    public String serverName() {
        return this.serverName;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
