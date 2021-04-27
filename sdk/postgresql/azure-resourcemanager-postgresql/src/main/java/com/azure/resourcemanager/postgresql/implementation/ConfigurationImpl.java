// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.postgresql.fluent.models.ConfigurationInner;
import com.azure.resourcemanager.postgresql.models.Configuration;

public final class ConfigurationImpl implements Configuration, Configuration.Definition, Configuration.Update {
    private ConfigurationInner innerObject;

    private final com.azure.resourcemanager.postgresql.PostgreSqlManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String value() {
        return this.innerModel().value();
    }

    public String description() {
        return this.innerModel().description();
    }

    public String defaultValue() {
        return this.innerModel().defaultValue();
    }

    public String dataType() {
        return this.innerModel().dataType();
    }

    public String allowedValues() {
        return this.innerModel().allowedValues();
    }

    public String source() {
        return this.innerModel().source();
    }

    public ConfigurationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.postgresql.PostgreSqlManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serverName;

    private String configurationName;

    public ConfigurationImpl withExistingServer(String resourceGroupName, String serverName) {
        this.resourceGroupName = resourceGroupName;
        this.serverName = serverName;
        return this;
    }

    public Configuration create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getConfigurations()
                .createOrUpdate(resourceGroupName, serverName, configurationName, this.innerModel(), Context.NONE);
        return this;
    }

    public Configuration create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getConfigurations()
                .createOrUpdate(resourceGroupName, serverName, configurationName, this.innerModel(), context);
        return this;
    }

    ConfigurationImpl(String name, com.azure.resourcemanager.postgresql.PostgreSqlManager serviceManager) {
        this.innerObject = new ConfigurationInner();
        this.serviceManager = serviceManager;
        this.configurationName = name;
    }

    public ConfigurationImpl update() {
        return this;
    }

    public Configuration apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getConfigurations()
                .createOrUpdate(resourceGroupName, serverName, configurationName, this.innerModel(), Context.NONE);
        return this;
    }

    public Configuration apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getConfigurations()
                .createOrUpdate(resourceGroupName, serverName, configurationName, this.innerModel(), context);
        return this;
    }

    ConfigurationImpl(
        ConfigurationInner innerObject, com.azure.resourcemanager.postgresql.PostgreSqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serverName = Utils.getValueFromIdByName(innerObject.id(), "servers");
        this.configurationName = Utils.getValueFromIdByName(innerObject.id(), "configurations");
    }

    public Configuration refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getConfigurations()
                .getWithResponse(resourceGroupName, serverName, configurationName, Context.NONE)
                .getValue();
        return this;
    }

    public Configuration refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getConfigurations()
                .getWithResponse(resourceGroupName, serverName, configurationName, context)
                .getValue();
        return this;
    }

    public ConfigurationImpl withValue(String value) {
        this.innerModel().withValue(value);
        return this;
    }

    public ConfigurationImpl withSource(String source) {
        this.innerModel().withSource(source);
        return this;
    }
}
