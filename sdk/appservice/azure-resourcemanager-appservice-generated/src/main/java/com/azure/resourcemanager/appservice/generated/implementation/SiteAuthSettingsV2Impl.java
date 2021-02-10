// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.WebSiteManager;
import com.azure.resourcemanager.appservice.generated.fluent.models.SiteAuthSettingsV2Inner;
import com.azure.resourcemanager.appservice.generated.models.AuthPlatform;
import com.azure.resourcemanager.appservice.generated.models.GlobalValidation;
import com.azure.resourcemanager.appservice.generated.models.HttpSettings;
import com.azure.resourcemanager.appservice.generated.models.IdentityProviders;
import com.azure.resourcemanager.appservice.generated.models.Login;
import com.azure.resourcemanager.appservice.generated.models.SiteAuthSettingsV2;
import com.azure.resourcemanager.appservice.generated.models.SystemData;

public final class SiteAuthSettingsV2Impl implements SiteAuthSettingsV2 {
    private SiteAuthSettingsV2Inner innerObject;

    private final WebSiteManager serviceManager;

    SiteAuthSettingsV2Impl(SiteAuthSettingsV2Inner innerObject, WebSiteManager serviceManager) {
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

    public AuthPlatform platform() {
        return this.innerModel().platform();
    }

    public GlobalValidation globalValidation() {
        return this.innerModel().globalValidation();
    }

    public IdentityProviders identityProviders() {
        return this.innerModel().identityProviders();
    }

    public Login login() {
        return this.innerModel().login();
    }

    public HttpSettings httpSettings() {
        return this.innerModel().httpSettings();
    }

    public SiteAuthSettingsV2Inner innerModel() {
        return this.innerObject;
    }

    private WebSiteManager manager() {
        return this.serviceManager;
    }
}
