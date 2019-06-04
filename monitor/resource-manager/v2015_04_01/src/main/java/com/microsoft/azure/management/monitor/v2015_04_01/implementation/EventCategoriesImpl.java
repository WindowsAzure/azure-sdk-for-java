/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.monitor.v2015_04_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.monitor.v2015_04_01.EventCategories;
import rx.functions.Func1;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.monitor.v2015_04_01.LocalizableString;

class EventCategoriesImpl extends WrapperImpl<EventCategoriesInner> implements EventCategories {
    private final MonitorManager manager;

    EventCategoriesImpl(MonitorManager manager) {
        super(manager.inner().eventCategories());
        this.manager = manager;
    }

    public MonitorManager manager() {
        return this.manager;
    }

    @Override
    public Observable<LocalizableString> listAsync() {
        EventCategoriesInner client = this.inner();
        return client.listAsync()
        .flatMap(new Func1<List<LocalizableStringInner>, Observable<LocalizableStringInner>>() {
            @Override
            public Observable<LocalizableStringInner> call(List<LocalizableStringInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<LocalizableStringInner, LocalizableString>() {
            @Override
            public LocalizableString call(LocalizableStringInner inner) {
                return new LocalizableStringImpl(inner, manager());
            }
        });
    }

}
