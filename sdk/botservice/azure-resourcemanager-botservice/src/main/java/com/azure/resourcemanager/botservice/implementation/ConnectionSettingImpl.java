// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.botservice.fluent.models.ConnectionSettingInner;
import com.azure.resourcemanager.botservice.models.ConnectionSetting;
import com.azure.resourcemanager.botservice.models.ConnectionSettingProperties;
import com.azure.resourcemanager.botservice.models.Kind;
import com.azure.resourcemanager.botservice.models.Sku;
import java.util.Collections;
import java.util.Map;

public final class ConnectionSettingImpl
    implements ConnectionSetting, ConnectionSetting.Definition, ConnectionSetting.Update {
    private ConnectionSettingInner innerObject;

    private final com.azure.resourcemanager.botservice.BotServiceManager serviceManager;

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

    public ConnectionSettingProperties properties() {
        return this.innerModel().properties();
    }

    public Sku sku() {
        return this.innerModel().sku();
    }

    public Kind kind() {
        return this.innerModel().kind();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public ConnectionSettingInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.botservice.BotServiceManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String resourceName;

    private String connectionName;

    public ConnectionSettingImpl withExistingBotService(String resourceGroupName, String resourceName) {
        this.resourceGroupName = resourceGroupName;
        this.resourceName = resourceName;
        return this;
    }

    public ConnectionSetting create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBotConnections()
                .createWithResponse(resourceGroupName, resourceName, connectionName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public ConnectionSetting create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBotConnections()
                .createWithResponse(resourceGroupName, resourceName, connectionName, this.innerModel(), context)
                .getValue();
        return this;
    }

    ConnectionSettingImpl(String name, com.azure.resourcemanager.botservice.BotServiceManager serviceManager) {
        this.innerObject = new ConnectionSettingInner();
        this.serviceManager = serviceManager;
        this.connectionName = name;
    }

    public ConnectionSettingImpl update() {
        return this;
    }

    public ConnectionSetting apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBotConnections()
                .updateWithResponse(resourceGroupName, resourceName, connectionName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public ConnectionSetting apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBotConnections()
                .updateWithResponse(resourceGroupName, resourceName, connectionName, this.innerModel(), context)
                .getValue();
        return this;
    }

    ConnectionSettingImpl(
        ConnectionSettingInner innerObject, com.azure.resourcemanager.botservice.BotServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.resourceName = Utils.getValueFromIdByName(innerObject.id(), "botServices");
        this.connectionName = Utils.getValueFromIdByName(innerObject.id(), "connections");
    }

    public ConnectionSetting refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBotConnections()
                .getWithResponse(resourceGroupName, resourceName, connectionName, Context.NONE)
                .getValue();
        return this;
    }

    public ConnectionSetting refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBotConnections()
                .getWithResponse(resourceGroupName, resourceName, connectionName, context)
                .getValue();
        return this;
    }

    public ConnectionSetting listWithSecrets() {
        return serviceManager.botConnections().listWithSecrets(resourceGroupName, resourceName, connectionName);
    }

    public Response<ConnectionSetting> listWithSecretsWithResponse(Context context) {
        return serviceManager
            .botConnections()
            .listWithSecretsWithResponse(resourceGroupName, resourceName, connectionName, context);
    }

    public ConnectionSettingImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ConnectionSettingImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ConnectionSettingImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public ConnectionSettingImpl withProperties(ConnectionSettingProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }

    public ConnectionSettingImpl withSku(Sku sku) {
        this.innerModel().withSku(sku);
        return this;
    }

    public ConnectionSettingImpl withKind(Kind kind) {
        this.innerModel().withKind(kind);
        return this;
    }

    public ConnectionSettingImpl withEtag(String etag) {
        this.innerModel().withEtag(etag);
        return this;
    }
}
