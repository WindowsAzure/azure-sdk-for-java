// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managementgroups.implementation;

import com.azure.resourcemanager.managementgroups.ManagementGroupsManager;
import com.azure.resourcemanager.managementgroups.fluent.models.CheckNameAvailabilityResultInner;
import com.azure.resourcemanager.managementgroups.models.CheckNameAvailabilityResult;
import com.azure.resourcemanager.managementgroups.models.Reason;

public final class CheckNameAvailabilityResultImpl implements CheckNameAvailabilityResult {
    private CheckNameAvailabilityResultInner innerObject;

    private final ManagementGroupsManager serviceManager;

    public CheckNameAvailabilityResultImpl(
        CheckNameAvailabilityResultInner innerObject, ManagementGroupsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Boolean nameAvailable() {
        return this.innerModel().nameAvailable();
    }

    public Reason reason() {
        return this.innerModel().reason();
    }

    public String message() {
        return this.innerModel().message();
    }

    public CheckNameAvailabilityResultInner innerModel() {
        return this.innerObject;
    }

    private ManagementGroupsManager manager() {
        return this.serviceManager;
    }
}
