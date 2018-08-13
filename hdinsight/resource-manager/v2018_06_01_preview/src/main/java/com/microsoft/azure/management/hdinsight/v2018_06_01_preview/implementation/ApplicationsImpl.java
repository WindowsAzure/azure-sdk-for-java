/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.hdinsight.v2018_06_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.hdinsight.v2018_06_01_preview.Applications;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.hdinsight.v2018_06_01_preview.Application;

class ApplicationsImpl extends WrapperImpl<ApplicationsInner> implements Applications {
    private final HDInsightManager manager;

    ApplicationsImpl(HDInsightManager manager) {
        super(manager.inner().applications());
        this.manager = manager;
    }

    public HDInsightManager manager() {
        return this.manager;
    }

    @Override
    public ApplicationImpl define(String name) {
        return wrapModel(name);
    }

    private ApplicationImpl wrapModel(ApplicationInner inner) {
        return  new ApplicationImpl(inner, manager());
    }

    private ApplicationImpl wrapModel(String name) {
        return new ApplicationImpl(name, this.manager());
    }

    @Override
    public Observable<Application> listByClusterAsync(final String resourceGroupName, final String clusterName) {
        ApplicationsInner client = this.inner();
        return client.listByClusterAsync(resourceGroupName, clusterName)
        .flatMapIterable(new Func1<Page<ApplicationInner>, Iterable<ApplicationInner>>() {
            @Override
            public Iterable<ApplicationInner> call(Page<ApplicationInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ApplicationInner, Application>() {
            @Override
            public Application call(ApplicationInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<Application> getAsync(String resourceGroupName, String clusterName, String applicationName) {
        ApplicationsInner client = this.inner();
        return client.getAsync(resourceGroupName, clusterName, applicationName)
        .map(new Func1<ApplicationInner, Application>() {
            @Override
            public Application call(ApplicationInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String clusterName, String applicationName) {
        ApplicationsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, clusterName, applicationName).toCompletable();
    }

}
