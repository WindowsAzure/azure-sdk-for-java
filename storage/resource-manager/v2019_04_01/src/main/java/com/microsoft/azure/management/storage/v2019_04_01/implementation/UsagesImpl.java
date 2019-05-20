/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.storage.v2019_04_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.storage.v2019_04_01.Usages;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.storage.v2019_04_01.Usage;

class UsagesImpl extends WrapperImpl<UsagesInner> implements Usages {
    private final StorageManager manager;

    UsagesImpl(StorageManager manager) {
        super(manager.inner().usages());
        this.manager = manager;
    }

    public StorageManager manager() {
        return this.manager;
    }

    private UsageImpl wrapModel(UsageInner inner) {
        return  new UsageImpl(inner, manager());
    }

    @Override
    public Observable<Usage> listByLocationAsync(String location) {
        UsagesInner client = this.inner();
        return client.listByLocationAsync(location)
        .flatMap(new Func1<List<UsageInner>, Observable<UsageInner>>() {
            @Override
            public Observable<UsageInner> call(List<UsageInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<UsageInner, Usage>() {
            @Override
            public Usage call(UsageInner inner) {
                return wrapModel(inner);
            }
        });
    }

}
