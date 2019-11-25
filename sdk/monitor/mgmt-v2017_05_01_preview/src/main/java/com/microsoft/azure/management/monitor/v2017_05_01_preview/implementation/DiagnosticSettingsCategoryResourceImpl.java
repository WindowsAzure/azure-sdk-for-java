/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2017_05_01_preview.implementation;

import com.microsoft.azure.management.monitor.v2017_05_01_preview.DiagnosticSettingsCategoryResource;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.monitor.v2017_05_01_preview.CategoryType;

class DiagnosticSettingsCategoryResourceImpl extends WrapperImpl<DiagnosticSettingsCategoryResourceInner> implements DiagnosticSettingsCategoryResource {
    private final MonitorManager manager;
    DiagnosticSettingsCategoryResourceImpl(DiagnosticSettingsCategoryResourceInner inner, MonitorManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public MonitorManager manager() {
        return this.manager;
    }

    @Override
    public CategoryType categoryType() {
        return this.inner().categoryType();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
