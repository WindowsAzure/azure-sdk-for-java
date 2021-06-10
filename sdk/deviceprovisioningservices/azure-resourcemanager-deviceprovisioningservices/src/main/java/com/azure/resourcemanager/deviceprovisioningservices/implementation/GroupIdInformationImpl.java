// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceprovisioningservices.implementation;

import com.azure.resourcemanager.deviceprovisioningservices.fluent.models.GroupIdInformationInner;
import com.azure.resourcemanager.deviceprovisioningservices.models.GroupIdInformation;
import com.azure.resourcemanager.deviceprovisioningservices.models.GroupIdInformationProperties;

public final class GroupIdInformationImpl implements GroupIdInformation {
    private GroupIdInformationInner innerObject;

    private final com.azure.resourcemanager.deviceprovisioningservices.IotDpsManager serviceManager;

    GroupIdInformationImpl(
        GroupIdInformationInner innerObject,
        com.azure.resourcemanager.deviceprovisioningservices.IotDpsManager serviceManager) {
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

    public GroupIdInformationProperties properties() {
        return this.innerModel().properties();
    }

    public GroupIdInformationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.deviceprovisioningservices.IotDpsManager manager() {
        return this.serviceManager;
    }
}
