// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.implementation;

import com.azure.resourcemanager.monitor.generated.MonitorManager;
import com.azure.resourcemanager.monitor.generated.fluent.models.LocalizableStringInner;
import com.azure.resourcemanager.monitor.generated.models.LocalizableString;

public final class LocalizableStringImpl implements LocalizableString {
    private LocalizableStringInner innerObject;

    private final MonitorManager serviceManager;

    LocalizableStringImpl(LocalizableStringInner innerObject, MonitorManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String value() {
        return this.innerModel().value();
    }

    public String localizedValue() {
        return this.innerModel().localizedValue();
    }

    public LocalizableStringInner innerModel() {
        return this.innerObject;
    }

    private MonitorManager manager() {
        return this.serviceManager;
    }
}
