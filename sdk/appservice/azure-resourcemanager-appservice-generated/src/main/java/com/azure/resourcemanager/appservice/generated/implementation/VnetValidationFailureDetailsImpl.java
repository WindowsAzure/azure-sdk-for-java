// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.WebSiteManager;
import com.azure.resourcemanager.appservice.generated.fluent.models.VnetValidationFailureDetailsInner;
import com.azure.resourcemanager.appservice.generated.models.SystemData;
import com.azure.resourcemanager.appservice.generated.models.VnetValidationFailureDetails;
import com.azure.resourcemanager.appservice.generated.models.VnetValidationTestFailure;
import java.util.Collections;
import java.util.List;

public final class VnetValidationFailureDetailsImpl implements VnetValidationFailureDetails {
    private VnetValidationFailureDetailsInner innerObject;

    private final WebSiteManager serviceManager;

    VnetValidationFailureDetailsImpl(VnetValidationFailureDetailsInner innerObject, WebSiteManager serviceManager) {
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

    public Boolean failed() {
        return this.innerModel().failed();
    }

    public List<VnetValidationTestFailure> failedTests() {
        List<VnetValidationTestFailure> inner = this.innerModel().failedTests();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public VnetValidationFailureDetailsInner innerModel() {
        return this.innerObject;
    }

    private WebSiteManager manager() {
        return this.serviceManager;
    }
}
