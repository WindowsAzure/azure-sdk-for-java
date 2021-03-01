// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.implementation;

import com.azure.resourcemanager.iothub.IotHubManager;
import com.azure.resourcemanager.iothub.fluent.models.GroupIdInformationInner;
import com.azure.resourcemanager.iothub.models.GroupIdInformation;
import com.azure.resourcemanager.iothub.models.GroupIdInformationProperties;

public final class GroupIdInformationImpl implements GroupIdInformation {
    private GroupIdInformationInner innerObject;

    private final IotHubManager serviceManager;

    GroupIdInformationImpl(GroupIdInformationInner innerObject, IotHubManager serviceManager) {
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

    private IotHubManager manager() {
        return this.serviceManager;
    }
}
