/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.search.v2015_08_19.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.search.v2015_08_19.QueryKeys;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.search.v2015_08_19.QueryKey;
import rx.Completable;

class QueryKeysImpl extends WrapperImpl<QueryKeysInner> implements QueryKeys {
    private final SearchManager manager;

    QueryKeysImpl(SearchManager manager) {
        super(manager.inner().queryKeys());
        this.manager = manager;
    }

    public SearchManager manager() {
        return this.manager;
    }

    private QueryKeyImpl wrapModel(QueryKeyInner inner) {
        return  new QueryKeyImpl(inner, manager());
    }

    @Override
    public Observable<QueryKey> listBySearchServiceAsync(String resourceGroupName, String searchServiceName) {
        QueryKeysInner client = this.inner();
        return client.listBySearchServiceAsync(resourceGroupName, searchServiceName)
        .flatMap(new Func1<List<QueryKeyInner>, Observable<QueryKeyInner>>() {
            @Override
            public Observable<QueryKeyInner> call(List<QueryKeyInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<QueryKeyInner, QueryKey>() {
            @Override
            public QueryKey call(QueryKeyInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<QueryKey> createAsync(String resourceGroupName, String searchServiceName, String name) {
        QueryKeysInner client = this.inner();
        return client.createAsync(resourceGroupName, searchServiceName, name)
        .map(new Func1<QueryKeyInner, QueryKey>() {
            @Override
            public QueryKey call(QueryKeyInner inner) {
                return new QueryKeyImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String searchServiceName, String key) {
        QueryKeysInner client = this.inner();
        return client.deleteAsync(resourceGroupName, searchServiceName, key).toCompletable();
    }

}
