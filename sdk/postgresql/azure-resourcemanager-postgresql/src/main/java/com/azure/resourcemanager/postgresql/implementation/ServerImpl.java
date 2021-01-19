// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.postgresql.PostgreSqlManager;
import com.azure.resourcemanager.postgresql.fluent.models.ServerInner;
import com.azure.resourcemanager.postgresql.models.InfrastructureEncryption;
import com.azure.resourcemanager.postgresql.models.MinimalTlsVersionEnum;
import com.azure.resourcemanager.postgresql.models.PublicNetworkAccessEnum;
import com.azure.resourcemanager.postgresql.models.ResourceIdentity;
import com.azure.resourcemanager.postgresql.models.Server;
import com.azure.resourcemanager.postgresql.models.ServerForCreate;
import com.azure.resourcemanager.postgresql.models.ServerPrivateEndpointConnection;
import com.azure.resourcemanager.postgresql.models.ServerPropertiesForCreate;
import com.azure.resourcemanager.postgresql.models.ServerState;
import com.azure.resourcemanager.postgresql.models.ServerUpdateParameters;
import com.azure.resourcemanager.postgresql.models.ServerVersion;
import com.azure.resourcemanager.postgresql.models.Sku;
import com.azure.resourcemanager.postgresql.models.SslEnforcementEnum;
import com.azure.resourcemanager.postgresql.models.StorageProfile;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class ServerImpl implements Server, Server.Definition, Server.Update {
    private ServerInner innerObject;

    private final PostgreSqlManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public ResourceIdentity identity() {
        return this.innerModel().identity();
    }

    public Sku sku() {
        return this.innerModel().sku();
    }

    public String administratorLogin() {
        return this.innerModel().administratorLogin();
    }

    public ServerVersion version() {
        return this.innerModel().version();
    }

    public SslEnforcementEnum sslEnforcement() {
        return this.innerModel().sslEnforcement();
    }

    public MinimalTlsVersionEnum minimalTlsVersion() {
        return this.innerModel().minimalTlsVersion();
    }

    public String byokEnforcement() {
        return this.innerModel().byokEnforcement();
    }

    public InfrastructureEncryption infrastructureEncryption() {
        return this.innerModel().infrastructureEncryption();
    }

    public ServerState userVisibleState() {
        return this.innerModel().userVisibleState();
    }

    public String fullyQualifiedDomainName() {
        return this.innerModel().fullyQualifiedDomainName();
    }

    public OffsetDateTime earliestRestoreDate() {
        return this.innerModel().earliestRestoreDate();
    }

    public StorageProfile storageProfile() {
        return this.innerModel().storageProfile();
    }

    public String replicationRole() {
        return this.innerModel().replicationRole();
    }

    public String masterServerId() {
        return this.innerModel().masterServerId();
    }

    public Integer replicaCapacity() {
        return this.innerModel().replicaCapacity();
    }

    public PublicNetworkAccessEnum publicNetworkAccess() {
        return this.innerModel().publicNetworkAccess();
    }

    public List<ServerPrivateEndpointConnection> privateEndpointConnections() {
        List<ServerPrivateEndpointConnection> inner = this.innerModel().privateEndpointConnections();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public ServerInner innerModel() {
        return this.innerObject;
    }

    private PostgreSqlManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serverName;

    private ServerForCreate createParameters;

    private ServerUpdateParameters updateParameters;

    public ServerImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public Server create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServers()
                .create(resourceGroupName, serverName, createParameters, Context.NONE);
        return this;
    }

    public Server create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServers()
                .create(resourceGroupName, serverName, createParameters, context);
        return this;
    }

    ServerImpl(String name, PostgreSqlManager serviceManager) {
        this.innerObject = new ServerInner();
        this.serviceManager = serviceManager;
        this.serverName = name;
        this.createParameters = new ServerForCreate();
    }

    public ServerImpl update() {
        this.updateParameters = new ServerUpdateParameters();
        return this;
    }

    public Server apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServers()
                .update(resourceGroupName, serverName, updateParameters, Context.NONE);
        return this;
    }

    public Server apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServers()
                .update(resourceGroupName, serverName, updateParameters, context);
        return this;
    }

    ServerImpl(ServerInner innerObject, PostgreSqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serverName = Utils.getValueFromIdByName(innerObject.id(), "servers");
    }

    public Server refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServers()
                .getByResourceGroupWithResponse(resourceGroupName, serverName, Context.NONE)
                .getValue();
        return this;
    }

    public Server refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServers()
                .getByResourceGroupWithResponse(resourceGroupName, serverName, context)
                .getValue();
        return this;
    }

    public ServerImpl withRegion(Region location) {
        this.createParameters.withLocation(location.toString());
        return this;
    }

    public ServerImpl withRegion(String location) {
        this.createParameters.withLocation(location);
        return this;
    }

    public ServerImpl withProperties(ServerPropertiesForCreate properties) {
        this.createParameters.withProperties(properties);
        return this;
    }

    public ServerImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.createParameters.withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public ServerImpl withIdentity(ResourceIdentity identity) {
        if (isInCreateMode()) {
            this.createParameters.withIdentity(identity);
            return this;
        } else {
            this.updateParameters.withIdentity(identity);
            return this;
        }
    }

    public ServerImpl withSku(Sku sku) {
        if (isInCreateMode()) {
            this.createParameters.withSku(sku);
            return this;
        } else {
            this.updateParameters.withSku(sku);
            return this;
        }
    }

    public ServerImpl withStorageProfile(StorageProfile storageProfile) {
        this.updateParameters.withStorageProfile(storageProfile);
        return this;
    }

    public ServerImpl withAdministratorLoginPassword(String administratorLoginPassword) {
        this.updateParameters.withAdministratorLoginPassword(administratorLoginPassword);
        return this;
    }

    public ServerImpl withVersion(ServerVersion version) {
        this.updateParameters.withVersion(version);
        return this;
    }

    public ServerImpl withSslEnforcement(SslEnforcementEnum sslEnforcement) {
        this.updateParameters.withSslEnforcement(sslEnforcement);
        return this;
    }

    public ServerImpl withMinimalTlsVersion(MinimalTlsVersionEnum minimalTlsVersion) {
        this.updateParameters.withMinimalTlsVersion(minimalTlsVersion);
        return this;
    }

    public ServerImpl withPublicNetworkAccess(PublicNetworkAccessEnum publicNetworkAccess) {
        this.updateParameters.withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    public ServerImpl withReplicationRole(String replicationRole) {
        this.updateParameters.withReplicationRole(replicationRole);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
