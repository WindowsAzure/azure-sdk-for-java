/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.monitor.v2019_11_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.monitor.v2019_11_01.DiagnosticSettingsCategorys;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.monitor.v2019_11_01.DiagnosticSettingsCategoryResource;
import com.microsoft.azure.management.monitor.v2019_11_01.DiagnosticSettingsCategoryResourceCollection;

class DiagnosticSettingsCategorysImpl extends WrapperImpl<DiagnosticSettingsCategorysInner> implements DiagnosticSettingsCategorys {
    private final MonitorManager manager;

    DiagnosticSettingsCategorysImpl(MonitorManager manager) {
        super(manager.inner().diagnosticSettingsCategorys());
        this.manager = manager;
    }

    public MonitorManager manager() {
        return this.manager;
    }

    @Override
    public Observable<DiagnosticSettingsCategoryResource> getAsync(String resourceUri, String name) {
        DiagnosticSettingsCategorysInner client = this.inner();
        return client.getAsync(resourceUri, name)
        .map(new Func1<DiagnosticSettingsCategoryResourceInner, DiagnosticSettingsCategoryResource>() {
            @Override
            public DiagnosticSettingsCategoryResource call(DiagnosticSettingsCategoryResourceInner inner) {
                return new DiagnosticSettingsCategoryResourceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DiagnosticSettingsCategoryResourceCollection> listAsync(String resourceUri) {
        DiagnosticSettingsCategorysInner client = this.inner();
        return client.listAsync(resourceUri)
        .map(new Func1<DiagnosticSettingsCategoryResourceCollectionInner, DiagnosticSettingsCategoryResourceCollection>() {
            @Override
            public DiagnosticSettingsCategoryResourceCollection call(DiagnosticSettingsCategoryResourceCollectionInner inner) {
                return new DiagnosticSettingsCategoryResourceCollectionImpl(inner, manager());
            }
        });
    }

}
