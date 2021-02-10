// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.WebSiteManager;
import com.azure.resourcemanager.appservice.generated.fluent.models.MSDeployLogInner;
import com.azure.resourcemanager.appservice.generated.models.MSDeployLog;
import com.azure.resourcemanager.appservice.generated.models.MSDeployLogEntry;
import com.azure.resourcemanager.appservice.generated.models.SystemData;
import java.util.Collections;
import java.util.List;

public final class MSDeployLogImpl implements MSDeployLog {
    private MSDeployLogInner innerObject;

    private final WebSiteManager serviceManager;

    MSDeployLogImpl(MSDeployLogInner innerObject, WebSiteManager serviceManager) {
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

    public String kind() {
        return this.innerModel().kind();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public List<MSDeployLogEntry> entries() {
        List<MSDeployLogEntry> inner = this.innerModel().entries();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public MSDeployLogInner innerModel() {
        return this.innerObject;
    }

    private WebSiteManager manager() {
        return this.serviceManager;
    }
}
