// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.digitaltwins.implementation;

import com.azure.resourcemanager.digitaltwins.AzureDigitalTwinsManager;
import com.azure.resourcemanager.digitaltwins.fluent.models.GroupIdInformationInner;
import com.azure.resourcemanager.digitaltwins.fluent.models.GroupIdInformationResponseInner;
import com.azure.resourcemanager.digitaltwins.models.GroupIdInformation;
import com.azure.resourcemanager.digitaltwins.models.GroupIdInformationResponse;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class GroupIdInformationResponseImpl implements GroupIdInformationResponse {
    private GroupIdInformationResponseInner innerObject;

    private final AzureDigitalTwinsManager serviceManager;

    GroupIdInformationResponseImpl(
        GroupIdInformationResponseInner innerObject, AzureDigitalTwinsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<GroupIdInformation> value() {
        List<GroupIdInformationInner> inner = this.innerModel().value();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new GroupIdInformationImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public GroupIdInformationResponseInner innerModel() {
        return this.innerObject;
    }

    private AzureDigitalTwinsManager manager() {
        return this.serviceManager;
    }
}
