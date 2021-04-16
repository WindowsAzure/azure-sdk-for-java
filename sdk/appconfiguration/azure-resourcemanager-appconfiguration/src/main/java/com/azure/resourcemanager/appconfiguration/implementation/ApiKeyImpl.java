// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.implementation;

import com.azure.resourcemanager.appconfiguration.fluent.models.ApiKeyInner;
import com.azure.resourcemanager.appconfiguration.models.ApiKey;
import java.time.OffsetDateTime;

public final class ApiKeyImpl implements ApiKey {
    private ApiKeyInner innerObject;

    private final com.azure.resourcemanager.appconfiguration.AppConfigurationManager serviceManager;

    ApiKeyImpl(
        ApiKeyInner innerObject, com.azure.resourcemanager.appconfiguration.AppConfigurationManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String value() {
        return this.innerModel().value();
    }

    public String connectionString() {
        return this.innerModel().connectionString();
    }

    public OffsetDateTime lastModified() {
        return this.innerModel().lastModified();
    }

    public Boolean readOnly() {
        return this.innerModel().readOnly();
    }

    public ApiKeyInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appconfiguration.AppConfigurationManager manager() {
        return this.serviceManager;
    }
}
