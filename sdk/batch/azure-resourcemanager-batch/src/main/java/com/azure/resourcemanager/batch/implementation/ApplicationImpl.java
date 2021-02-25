// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.batch.BatchManager;
import com.azure.resourcemanager.batch.fluent.models.ApplicationInner;
import com.azure.resourcemanager.batch.models.Application;

public final class ApplicationImpl implements Application, Application.Definition, Application.Update {
    private ApplicationInner innerObject;

    private final BatchManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String displayName() {
        return this.innerModel().displayName();
    }

    public Boolean allowUpdates() {
        return this.innerModel().allowUpdates();
    }

    public String defaultVersion() {
        return this.innerModel().defaultVersion();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public ApplicationInner innerModel() {
        return this.innerObject;
    }

    private BatchManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private String applicationName;

    public ApplicationImpl withExistingBatchAccount(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    public Application create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApplications()
                .createWithResponse(resourceGroupName, accountName, applicationName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public Application create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApplications()
                .createWithResponse(resourceGroupName, accountName, applicationName, this.innerModel(), context)
                .getValue();
        return this;
    }

    ApplicationImpl(String name, BatchManager serviceManager) {
        this.innerObject = new ApplicationInner();
        this.serviceManager = serviceManager;
        this.applicationName = name;
    }

    public ApplicationImpl update() {
        return this;
    }

    public Application apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApplications()
                .updateWithResponse(resourceGroupName, accountName, applicationName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public Application apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApplications()
                .updateWithResponse(resourceGroupName, accountName, applicationName, this.innerModel(), context)
                .getValue();
        return this;
    }

    ApplicationImpl(ApplicationInner innerObject, BatchManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = Utils.getValueFromIdByName(innerObject.id(), "batchAccounts");
        this.applicationName = Utils.getValueFromIdByName(innerObject.id(), "applications");
    }

    public Application refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApplications()
                .getWithResponse(resourceGroupName, accountName, applicationName, Context.NONE)
                .getValue();
        return this;
    }

    public Application refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApplications()
                .getWithResponse(resourceGroupName, accountName, applicationName, context)
                .getValue();
        return this;
    }

    public ApplicationImpl withDisplayName(String displayName) {
        this.innerModel().withDisplayName(displayName);
        return this;
    }

    public ApplicationImpl withAllowUpdates(Boolean allowUpdates) {
        this.innerModel().withAllowUpdates(allowUpdates);
        return this;
    }

    public ApplicationImpl withDefaultVersion(String defaultVersion) {
        this.innerModel().withDefaultVersion(defaultVersion);
        return this;
    }
}
