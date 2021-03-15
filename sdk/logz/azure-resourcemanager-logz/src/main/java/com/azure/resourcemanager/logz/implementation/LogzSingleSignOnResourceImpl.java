// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logz.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.logz.fluent.models.LogzSingleSignOnResourceInner;
import com.azure.resourcemanager.logz.models.LogzSingleSignOnProperties;
import com.azure.resourcemanager.logz.models.LogzSingleSignOnResource;

public final class LogzSingleSignOnResourceImpl
    implements LogzSingleSignOnResource, LogzSingleSignOnResource.Definition, LogzSingleSignOnResource.Update {
    private LogzSingleSignOnResourceInner innerObject;

    private final com.azure.resourcemanager.logz.LogzManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public LogzSingleSignOnProperties properties() {
        return this.innerModel().properties();
    }

    public LogzSingleSignOnResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.logz.LogzManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String monitorName;

    private String configurationName;

    public LogzSingleSignOnResourceImpl withExistingMonitor(String resourceGroupName, String monitorName) {
        this.resourceGroupName = resourceGroupName;
        this.monitorName = monitorName;
        return this;
    }

    public LogzSingleSignOnResource create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSingleSignOns()
                .createOrUpdate(resourceGroupName, monitorName, configurationName, this.innerModel(), Context.NONE);
        return this;
    }

    public LogzSingleSignOnResource create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSingleSignOns()
                .createOrUpdate(resourceGroupName, monitorName, configurationName, this.innerModel(), context);
        return this;
    }

    LogzSingleSignOnResourceImpl(String name, com.azure.resourcemanager.logz.LogzManager serviceManager) {
        this.innerObject = new LogzSingleSignOnResourceInner();
        this.serviceManager = serviceManager;
        this.configurationName = name;
    }

    public LogzSingleSignOnResourceImpl update() {
        return this;
    }

    public LogzSingleSignOnResource apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSingleSignOns()
                .createOrUpdate(resourceGroupName, monitorName, configurationName, this.innerModel(), Context.NONE);
        return this;
    }

    public LogzSingleSignOnResource apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSingleSignOns()
                .createOrUpdate(resourceGroupName, monitorName, configurationName, this.innerModel(), context);
        return this;
    }

    LogzSingleSignOnResourceImpl(
        LogzSingleSignOnResourceInner innerObject, com.azure.resourcemanager.logz.LogzManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.monitorName = Utils.getValueFromIdByName(innerObject.id(), "monitors");
        this.configurationName = Utils.getValueFromIdByName(innerObject.id(), "singleSignOnConfigurations");
    }

    public LogzSingleSignOnResource refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSingleSignOns()
                .getWithResponse(resourceGroupName, monitorName, configurationName, Context.NONE)
                .getValue();
        return this;
    }

    public LogzSingleSignOnResource refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSingleSignOns()
                .getWithResponse(resourceGroupName, monitorName, configurationName, context)
                .getValue();
        return this;
    }

    public LogzSingleSignOnResourceImpl withProperties(LogzSingleSignOnProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }
}
