// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datadog.implementation;

import com.azure.resourcemanager.datadog.MicrosoftDatadogManager;
import com.azure.resourcemanager.datadog.fluent.models.DatadogApiKeyInner;
import com.azure.resourcemanager.datadog.models.DatadogApiKey;

public final class DatadogApiKeyImpl implements DatadogApiKey {
    private DatadogApiKeyInner innerObject;

    private final MicrosoftDatadogManager serviceManager;

    public DatadogApiKeyImpl(DatadogApiKeyInner innerObject, MicrosoftDatadogManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String createdBy() {
        return this.innerModel().createdBy();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String key() {
        return this.innerModel().key();
    }

    public String created() {
        return this.innerModel().created();
    }

    public DatadogApiKeyInner innerModel() {
        return this.innerObject;
    }

    private MicrosoftDatadogManager manager() {
        return this.serviceManager;
    }
}
