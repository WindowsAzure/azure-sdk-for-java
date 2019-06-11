/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.advisor.v2017_04_19.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.advisor.v2017_04_19.Suppressions;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.advisor.v2017_04_19.SuppressionContract;

class SuppressionsImpl extends WrapperImpl<SuppressionsInner> implements Suppressions {
    private final AdvisorManager manager;

    SuppressionsImpl(AdvisorManager manager) {
        super(manager.inner().suppressions());
        this.manager = manager;
    }

    public AdvisorManager manager() {
        return this.manager;
    }

    @Override
    public SuppressionContractImpl define(String name) {
        return wrapModel(name);
    }

    private SuppressionContractImpl wrapModel(SuppressionContractInner inner) {
        return  new SuppressionContractImpl(inner, manager());
    }

    private SuppressionContractImpl wrapModel(String name) {
        return new SuppressionContractImpl(name, this.manager());
    }

    @Override
    public Observable<SuppressionContract> listAsync() {
        SuppressionsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<SuppressionContractInner>, Iterable<SuppressionContractInner>>() {
            @Override
            public Iterable<SuppressionContractInner> call(Page<SuppressionContractInner> page) {
                return page.items();
            }
        })
        .map(new Func1<SuppressionContractInner, SuppressionContract>() {
            @Override
            public SuppressionContract call(SuppressionContractInner inner) {
                return new SuppressionContractImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<SuppressionContract> getAsync(String resourceUri, String recommendationId, String name) {
        SuppressionsInner client = this.inner();
        return client.getAsync(resourceUri, recommendationId, name)
        .map(new Func1<SuppressionContractInner, SuppressionContract>() {
            @Override
            public SuppressionContract call(SuppressionContractInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceUri, String recommendationId, String name) {
        SuppressionsInner client = this.inner();
        return client.deleteAsync(resourceUri, recommendationId, name).toCompletable();
    }

}
