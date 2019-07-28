/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.batch.v2017_05_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.batch.v2017_05_01.Applications;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.batch.v2017_05_01.Application;
import com.microsoft.azure.management.batch.v2017_05_01.ApplicationUpdateParameters;

class ApplicationsImpl extends WrapperImpl<ApplicationsInner> implements Applications {
    private final BatchManager manager;

    ApplicationsImpl(BatchManager manager) {
        super(manager.inner().applications());
        this.manager = manager;
    }

    public BatchManager manager() {
        return this.manager;
    }

    private ApplicationImpl wrapModel(ApplicationInner inner) {
        return  new ApplicationImpl(inner, manager());
    }

    @Override
    public Observable<Application> createAsync(String resourceGroupName, String accountName, String applicationId) {
        ApplicationsInner client = this.inner();
        return client.createAsync(resourceGroupName, accountName, applicationId)
        .map(new Func1<ApplicationInner, Application>() {
            @Override
            public Application call(ApplicationInner inner) {
                return new ApplicationImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable updateAsync(String resourceGroupName, String accountName, String applicationId, ApplicationUpdateParameters parameters) {
        ApplicationsInner client = this.inner();
        return client.updateAsync(resourceGroupName, accountName, applicationId, parameters).toCompletable();
    }

    @Override
    public Observable<Application> listAsync(final String resourceGroupName, final String accountName) {
        ApplicationsInner client = this.inner();
        return client.listAsync(resourceGroupName, accountName)
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
    public Observable<Application> getAsync(String resourceGroupName, String accountName, String applicationId) {
        ApplicationsInner client = this.inner();
        return client.getAsync(resourceGroupName, accountName, applicationId)
        .map(new Func1<ApplicationInner, Application>() {
            @Override
            public Application call(ApplicationInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String accountName, String applicationId) {
        ApplicationsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, accountName, applicationId).toCompletable();
    }

}
