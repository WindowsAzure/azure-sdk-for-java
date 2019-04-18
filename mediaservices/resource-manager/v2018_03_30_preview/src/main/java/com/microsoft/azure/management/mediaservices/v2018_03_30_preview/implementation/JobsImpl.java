/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.mediaservices.v2018_03_30_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.mediaservices.v2018_03_30_preview.Jobs;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.mediaservices.v2018_03_30_preview.Job;

class JobsImpl extends WrapperImpl<JobsInner> implements Jobs {
    private final MediaManager manager;

    JobsImpl(MediaManager manager) {
        super(manager.inner().jobs());
        this.manager = manager;
    }

    public MediaManager manager() {
        return this.manager;
    }

    @Override
    public JobImpl define(String name) {
        return wrapModel(name);
    }

    private JobImpl wrapModel(JobInner inner) {
        return  new JobImpl(inner, manager());
    }

    private JobImpl wrapModel(String name) {
        return new JobImpl(name, this.manager());
    }

    @Override
    public Completable cancelJobAsync(String resourceGroupName, String accountName, String transformName, String jobName) {
        JobsInner client = this.inner();
        return client.cancelJobAsync(resourceGroupName, accountName, transformName, jobName).toCompletable();
    }

    @Override
    public Observable<Job> listAsync(final String resourceGroupName, final String accountName, final String transformName) {
        JobsInner client = this.inner();
        return client.listAsync(resourceGroupName, accountName, transformName)
        .flatMapIterable(new Func1<Page<JobInner>, Iterable<JobInner>>() {
            @Override
            public Iterable<JobInner> call(Page<JobInner> page) {
                return page.items();
            }
        })
        .map(new Func1<JobInner, Job>() {
            @Override
            public Job call(JobInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<Job> getAsync(String resourceGroupName, String accountName, String transformName, String jobName) {
        JobsInner client = this.inner();
        return client.getAsync(resourceGroupName, accountName, transformName, jobName)
        .flatMap(new Func1<JobInner, Observable<Job>>() {
            @Override
            public Observable<Job> call(JobInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((Job)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String accountName, String transformName, String jobName) {
        JobsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, accountName, transformName, jobName).toCompletable();
    }

}
