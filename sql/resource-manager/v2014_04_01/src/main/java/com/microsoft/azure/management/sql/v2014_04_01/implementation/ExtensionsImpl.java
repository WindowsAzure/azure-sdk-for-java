/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.sql.v2014_04_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.sql.v2014_04_01.Extensions;
import rx.functions.Func1;
import rx.Observable;
import java.util.List;

class ExtensionsImpl extends WrapperImpl<ExtensionsInner> implements Extensions {
    private final SqlManager manager;

    ExtensionsImpl(SqlManager manager) {
        super(manager.inner().extensions());
        this.manager = manager;
    }

    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Object> listByDatabaseAsync(String resourceGroupName, String serverName, String databaseName) {
        ExtensionsInner client = this.inner();
        return client.listByDatabaseAsync(resourceGroupName, serverName, databaseName)
        .flatMap(new Func1<List<Object>, Observable<Object>>() {
            @Override
            public Observable<Object> call(List<Object> innerList) {
                return Observable.from(innerList);
            }
        });}

}
