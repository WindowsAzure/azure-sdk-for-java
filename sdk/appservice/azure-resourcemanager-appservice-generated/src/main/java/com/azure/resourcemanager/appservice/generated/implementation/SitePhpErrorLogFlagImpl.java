// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.WebSiteManager;
import com.azure.resourcemanager.appservice.generated.fluent.models.SitePhpErrorLogFlagInner;
import com.azure.resourcemanager.appservice.generated.models.SitePhpErrorLogFlag;
import com.azure.resourcemanager.appservice.generated.models.SystemData;

public final class SitePhpErrorLogFlagImpl implements SitePhpErrorLogFlag {
    private SitePhpErrorLogFlagInner innerObject;

    private final WebSiteManager serviceManager;

    SitePhpErrorLogFlagImpl(SitePhpErrorLogFlagInner innerObject, WebSiteManager serviceManager) {
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

    public String localLogErrors() {
        return this.innerModel().localLogErrors();
    }

    public String masterLogErrors() {
        return this.innerModel().masterLogErrors();
    }

    public String localLogErrorsMaxLength() {
        return this.innerModel().localLogErrorsMaxLength();
    }

    public String masterLogErrorsMaxLength() {
        return this.innerModel().masterLogErrorsMaxLength();
    }

    public SitePhpErrorLogFlagInner innerModel() {
        return this.innerObject;
    }

    private WebSiteManager manager() {
        return this.serviceManager;
    }
}
