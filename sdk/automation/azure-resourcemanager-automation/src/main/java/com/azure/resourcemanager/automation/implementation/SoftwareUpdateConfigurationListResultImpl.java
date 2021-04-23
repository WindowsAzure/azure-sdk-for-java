// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.implementation;

import com.azure.resourcemanager.automation.fluent.models.SoftwareUpdateConfigurationListResultInner;
import com.azure.resourcemanager.automation.models.SoftwareUpdateConfigurationCollectionItem;
import com.azure.resourcemanager.automation.models.SoftwareUpdateConfigurationListResult;
import java.util.Collections;
import java.util.List;

public final class SoftwareUpdateConfigurationListResultImpl implements SoftwareUpdateConfigurationListResult {
    private SoftwareUpdateConfigurationListResultInner innerObject;

    private final com.azure.resourcemanager.automation.AutomationManager serviceManager;

    SoftwareUpdateConfigurationListResultImpl(
        SoftwareUpdateConfigurationListResultInner innerObject,
        com.azure.resourcemanager.automation.AutomationManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<SoftwareUpdateConfigurationCollectionItem> value() {
        List<SoftwareUpdateConfigurationCollectionItem> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public SoftwareUpdateConfigurationListResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.automation.AutomationManager manager() {
        return this.serviceManager;
    }
}
