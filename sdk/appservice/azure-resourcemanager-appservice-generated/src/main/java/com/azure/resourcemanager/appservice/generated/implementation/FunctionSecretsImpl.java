// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.WebSiteManager;
import com.azure.resourcemanager.appservice.generated.fluent.models.FunctionSecretsInner;
import com.azure.resourcemanager.appservice.generated.models.FunctionSecrets;

public final class FunctionSecretsImpl implements FunctionSecrets {
    private FunctionSecretsInner innerObject;

    private final WebSiteManager serviceManager;

    FunctionSecretsImpl(FunctionSecretsInner innerObject, WebSiteManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String key() {
        return this.innerModel().key();
    }

    public String triggerUrl() {
        return this.innerModel().triggerUrl();
    }

    public FunctionSecretsInner innerModel() {
        return this.innerObject;
    }

    private WebSiteManager manager() {
        return this.serviceManager;
    }
}
