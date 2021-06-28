// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagesync.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.storagesync.fluent.models.RegisteredServerInner;
import com.azure.resourcemanager.storagesync.models.RegisteredServer;
import com.azure.resourcemanager.storagesync.models.RegisteredServerAgentVersionStatus;
import com.azure.resourcemanager.storagesync.models.RegisteredServerCreateParameters;
import com.azure.resourcemanager.storagesync.models.TriggerRolloverRequest;
import java.time.OffsetDateTime;

public final class RegisteredServerImpl implements RegisteredServer, RegisteredServer.Definition {
    private RegisteredServerInner innerObject;

    private final com.azure.resourcemanager.storagesync.StoragesyncManager serviceManager;

    RegisteredServerImpl(
        RegisteredServerInner innerObject, com.azure.resourcemanager.storagesync.StoragesyncManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String serverCertificate() {
        return this.innerModel().serverCertificate();
    }

    public String agentVersion() {
        return this.innerModel().agentVersion();
    }

    public RegisteredServerAgentVersionStatus agentVersionStatus() {
        return this.innerModel().agentVersionStatus();
    }

    public OffsetDateTime agentVersionExpirationDate() {
        return this.innerModel().agentVersionExpirationDate();
    }

    public String serverOSVersion() {
        return this.innerModel().serverOSVersion();
    }

    public Integer serverManagementErrorCode() {
        return this.innerModel().serverManagementErrorCode();
    }

    public String lastHeartBeat() {
        return this.innerModel().lastHeartBeat();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String serverRole() {
        return this.innerModel().serverRole();
    }

    public String clusterId() {
        return this.innerModel().clusterId();
    }

    public String clusterName() {
        return this.innerModel().clusterName();
    }

    public String serverId() {
        return this.innerModel().serverId();
    }

    public String storageSyncServiceUid() {
        return this.innerModel().storageSyncServiceUid();
    }

    public String lastWorkflowId() {
        return this.innerModel().lastWorkflowId();
    }

    public String lastOperationName() {
        return this.innerModel().lastOperationName();
    }

    public String discoveryEndpointUri() {
        return this.innerModel().discoveryEndpointUri();
    }

    public String resourceLocation() {
        return this.innerModel().resourceLocation();
    }

    public String serviceLocation() {
        return this.innerModel().serviceLocation();
    }

    public String friendlyName() {
        return this.innerModel().friendlyName();
    }

    public String managementEndpointUri() {
        return this.innerModel().managementEndpointUri();
    }

    public String monitoringEndpointUri() {
        return this.innerModel().monitoringEndpointUri();
    }

    public String monitoringConfiguration() {
        return this.innerModel().monitoringConfiguration();
    }

    public String serverName() {
        return this.innerModel().serverName();
    }

    public RegisteredServerInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.storagesync.StoragesyncManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String storageSyncServiceName;

    private String serverId;

    private RegisteredServerCreateParameters createParameters;

    public RegisteredServerImpl withExistingStorageSyncService(
        String resourceGroupName, String storageSyncServiceName) {
        this.resourceGroupName = resourceGroupName;
        this.storageSyncServiceName = storageSyncServiceName;
        return this;
    }

    public RegisteredServer create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRegisteredServers()
                .create(resourceGroupName, storageSyncServiceName, serverId, createParameters, Context.NONE);
        return this;
    }

    public RegisteredServer create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRegisteredServers()
                .create(resourceGroupName, storageSyncServiceName, serverId, createParameters, context);
        return this;
    }

    RegisteredServerImpl(String name, com.azure.resourcemanager.storagesync.StoragesyncManager serviceManager) {
        this.innerObject = new RegisteredServerInner();
        this.serviceManager = serviceManager;
        this.serverId = name;
        this.createParameters = new RegisteredServerCreateParameters();
    }

    public RegisteredServer refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRegisteredServers()
                .getWithResponse(resourceGroupName, storageSyncServiceName, serverId, Context.NONE)
                .getValue();
        return this;
    }

    public RegisteredServer refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRegisteredServers()
                .getWithResponse(resourceGroupName, storageSyncServiceName, serverId, context)
                .getValue();
        return this;
    }

    public void triggerRollover(TriggerRolloverRequest parameters) {
        serviceManager
            .registeredServers()
            .triggerRollover(resourceGroupName, storageSyncServiceName, serverId, parameters);
    }

    public void triggerRollover(TriggerRolloverRequest parameters, Context context) {
        serviceManager
            .registeredServers()
            .triggerRollover(resourceGroupName, storageSyncServiceName, serverId, parameters, context);
    }

    public RegisteredServerImpl withServerCertificate(String serverCertificate) {
        this.createParameters.withServerCertificate(serverCertificate);
        return this;
    }

    public RegisteredServerImpl withAgentVersion(String agentVersion) {
        this.createParameters.withAgentVersion(agentVersion);
        return this;
    }

    public RegisteredServerImpl withServerOSVersion(String serverOSVersion) {
        this.createParameters.withServerOSVersion(serverOSVersion);
        return this;
    }

    public RegisteredServerImpl withLastHeartBeat(String lastHeartBeat) {
        this.createParameters.withLastHeartBeat(lastHeartBeat);
        return this;
    }

    public RegisteredServerImpl withServerRole(String serverRole) {
        this.createParameters.withServerRole(serverRole);
        return this;
    }

    public RegisteredServerImpl withClusterId(String clusterId) {
        this.createParameters.withClusterId(clusterId);
        return this;
    }

    public RegisteredServerImpl withClusterName(String clusterName) {
        this.createParameters.withClusterName(clusterName);
        return this;
    }

    public RegisteredServerImpl withServerId(String serverId) {
        this.createParameters.withServerId(serverId);
        return this;
    }

    public RegisteredServerImpl withFriendlyName(String friendlyName) {
        this.createParameters.withFriendlyName(friendlyName);
        return this;
    }
}
