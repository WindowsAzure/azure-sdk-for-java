// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.digitaltwins.implementation;

import com.azure.resourcemanager.digitaltwins.AzureDigitalTwinsManager;
import com.azure.resourcemanager.digitaltwins.fluent.models.GroupIdInformationInner;
import com.azure.resourcemanager.digitaltwins.models.GroupIdInformation;
import com.azure.resourcemanager.digitaltwins.models.GroupIdInformationProperties;

public final class GroupIdInformationImpl implements GroupIdInformation {
    private GroupIdInformationInner innerObject;

    private final AzureDigitalTwinsManager serviceManager;

    GroupIdInformationImpl(GroupIdInformationInner innerObject, AzureDigitalTwinsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public GroupIdInformationProperties properties() {
        return this.innerModel().properties();
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

    public GroupIdInformationInner innerModel() {
        return this.innerObject;
    }

    private AzureDigitalTwinsManager manager() {
        return this.serviceManager;
    }
}
