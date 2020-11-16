/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * jkl
 */

package com.microsoft.azure.management.monitor.v2019_11_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.monitor.v2019_11_01.LogProfiles;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;
import rx.Completable;
import com.microsoft.azure.management.monitor.v2019_11_01.LogProfileResource;
import com.microsoft.azure.arm.utils.PagedListConverter;

class LogProfilesImpl extends WrapperImpl<LogProfilesInner> implements LogProfiles {
    private PagedListConverter<LogProfileResourceInner, LogProfileResource> converter;
    private final MonitorManager manager;

    LogProfilesImpl(MonitorManager manager) {
        super(manager.inner().logProfiles());
        this.manager = manager;
        this.converter = new PagedListConverter<LogProfileResourceInner, LogProfileResource>() {
            @Override
            public Observable<LogProfileResource> typeConvertAsync(LogProfileResourceInner inner) {
                return Observable.just((LogProfileResource) wrapModel(inner));
            }
        };
    }

    public MonitorManager manager() {
        return this.manager;
    }

    @Override
    public LogProfileResourceImpl define(String name) {
        return wrapModel(name);
    }

    private LogProfileResourceImpl wrapModel(LogProfileResourceInner inner) {
        return  new LogProfileResourceImpl(inner, manager());
    }

    private LogProfileResourceImpl wrapModel(String name) {
        return new LogProfileResourceImpl(name, this.manager());
    }

    @Override
    public Completable deleteAsync(String logProfileName) {
        LogProfilesInner client = this.inner();
        return client.deleteAsync(logProfileName).toCompletable();
    }

    @Override
    public Observable<LogProfileResource> getAsync(String logProfileName) {
        LogProfilesInner client = this.inner();
        return client.getAsync(logProfileName)
        .map(new Func1<LogProfileResourceInner, LogProfileResource>() {
            @Override
            public LogProfileResource call(LogProfileResourceInner inner) {
                return new LogProfileResourceImpl(inner, manager());
            }
        });
    }

    @Override
    public PagedList<LogProfileResource> list() {
        LogProfilesInner client = this.inner();
        return converter.convert(client.list());
    }

    @Override
    public Observable<LogProfileResource> listAsync() {
        LogProfilesInner client = this.inner();
        return client.listAsync()
        .flatMap(new Func1<Page<LogProfileResourceInner>, Observable<LogProfileResourceInner>>() {
            @Override
            public Observable<LogProfileResourceInner> call(Page<LogProfileResourceInner> innerPage) {
                return Observable.from(innerPage.items());
            }
        })
        .map(new Func1<LogProfileResourceInner, LogProfileResource>() {
            @Override
            public LogProfileResource call(LogProfileResourceInner inner) {
                return wrapModel(inner);
            }
        });
    }

}
