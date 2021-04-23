// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.batch.fluent.models.ApplicationPackageInner;
import com.azure.resourcemanager.batch.models.ActivateApplicationPackageParameters;
import com.azure.resourcemanager.batch.models.ApplicationPackage;
import com.azure.resourcemanager.batch.models.PackageState;
import java.time.OffsetDateTime;

public final class ApplicationPackageImpl implements ApplicationPackage, ApplicationPackage.Definition {
    private ApplicationPackageInner innerObject;

    private final com.azure.resourcemanager.batch.BatchManager serviceManager;

    ApplicationPackageImpl(
        ApplicationPackageInner innerObject, com.azure.resourcemanager.batch.BatchManager serviceManager) {
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

    public PackageState state() {
        return this.innerModel().state();
    }

    public String format() {
        return this.innerModel().format();
    }

    public String storageUrl() {
        return this.innerModel().storageUrl();
    }

    public OffsetDateTime storageUrlExpiry() {
        return this.innerModel().storageUrlExpiry();
    }

    public OffsetDateTime lastActivationTime() {
        return this.innerModel().lastActivationTime();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public ApplicationPackageInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.batch.BatchManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private String applicationName;

    private String versionName;

    public ApplicationPackageImpl withExistingApplication(
        String resourceGroupName, String accountName, String applicationName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        this.applicationName = applicationName;
        return this;
    }

    public ApplicationPackage create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApplicationPackages()
                .createWithResponse(
                    resourceGroupName, accountName, applicationName, versionName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public ApplicationPackage create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApplicationPackages()
                .createWithResponse(
                    resourceGroupName, accountName, applicationName, versionName, this.innerModel(), context)
                .getValue();
        return this;
    }

    ApplicationPackageImpl(String name, com.azure.resourcemanager.batch.BatchManager serviceManager) {
        this.innerObject = new ApplicationPackageInner();
        this.serviceManager = serviceManager;
        this.versionName = name;
    }

    public ApplicationPackage refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApplicationPackages()
                .getWithResponse(resourceGroupName, accountName, applicationName, versionName, Context.NONE)
                .getValue();
        return this;
    }

    public ApplicationPackage refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApplicationPackages()
                .getWithResponse(resourceGroupName, accountName, applicationName, versionName, context)
                .getValue();
        return this;
    }

    public ApplicationPackage activate(ActivateApplicationPackageParameters parameters) {
        return serviceManager
            .applicationPackages()
            .activate(resourceGroupName, accountName, applicationName, versionName, parameters);
    }

    public Response<ApplicationPackage> activateWithResponse(
        ActivateApplicationPackageParameters parameters, Context context) {
        return serviceManager
            .applicationPackages()
            .activateWithResponse(resourceGroupName, accountName, applicationName, versionName, parameters, context);
    }
}
