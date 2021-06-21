// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.implementation;

import com.azure.resourcemanager.monitor.generated.fluent.models.DiagnosticSettingsCategoryResourceCollectionInner;
import com.azure.resourcemanager.monitor.generated.fluent.models.DiagnosticSettingsCategoryResourceInner;
import com.azure.resourcemanager.monitor.generated.models.DiagnosticSettingsCategoryResource;
import com.azure.resourcemanager.monitor.generated.models.DiagnosticSettingsCategoryResourceCollection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class DiagnosticSettingsCategoryResourceCollectionImpl
    implements DiagnosticSettingsCategoryResourceCollection {
    private DiagnosticSettingsCategoryResourceCollectionInner innerObject;

    private final com.azure.resourcemanager.monitor.generated.MonitorManager serviceManager;

    DiagnosticSettingsCategoryResourceCollectionImpl(
        DiagnosticSettingsCategoryResourceCollectionInner innerObject,
        com.azure.resourcemanager.monitor.generated.MonitorManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<DiagnosticSettingsCategoryResource> value() {
        List<DiagnosticSettingsCategoryResourceInner> inner = this.innerModel().value();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new DiagnosticSettingsCategoryResourceImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public DiagnosticSettingsCategoryResourceCollectionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.monitor.generated.MonitorManager manager() {
        return this.serviceManager;
    }
}
