/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.batchai.v2018_05_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.batchai.v2018_05_01.Jobs;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.batchai.v2018_05_01.File;
import com.microsoft.azure.management.batchai.v2018_05_01.RemoteLoginInformation;
import com.microsoft.azure.management.batchai.v2018_05_01.JobsListOutputFilesOptions;
import com.microsoft.azure.management.batchai.v2018_05_01.Job;

class JobsImpl extends WrapperImpl<JobsInner> implements Jobs {
    private final BatchAIManager manager;

    JobsImpl(BatchAIManager manager) {
        super(manager.inner().jobs());
        this.manager = manager;
    }

    public BatchAIManager manager() {
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

    private Observable<Page<FileInner>> listOutputFilesNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        JobsInner client = this.inner();
        return client.listOutputFilesNextAsync(nextLink)
        .flatMap(new Func1<Page<FileInner>, Observable<Page<FileInner>>>() {
            @Override
            public Observable<Page<FileInner>> call(Page<FileInner> page) {
                return Observable.just(page).concatWith(listOutputFilesNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<File> listOutputFilesAsync(final String resourceGroupName, final String workspaceName, final String experimentName, final String jobName, final JobsListOutputFilesOptions jobsListOutputFilesOptions) {
        JobsInner client = this.inner();
        return client.listOutputFilesAsync(resourceGroupName, workspaceName, experimentName, jobName, jobsListOutputFilesOptions)
        .flatMap(new Func1<Page<FileInner>, Observable<Page<FileInner>>>() {
            @Override
            public Observable<Page<FileInner>> call(Page<FileInner> page) {
                return listOutputFilesNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<FileInner>, Iterable<FileInner>>() {
            @Override
            public Iterable<FileInner> call(Page<FileInner> page) {
                return page.items();
            }
       })
        .map(new Func1<FileInner, File>() {
            @Override
            public File call(FileInner inner) {
                return new FileImpl(inner, manager());
            }
       });
    }

    private Observable<Page<RemoteLoginInformationInner>> listRemoteLoginInformationNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        JobsInner client = this.inner();
        return client.listRemoteLoginInformationNextAsync(nextLink)
        .flatMap(new Func1<Page<RemoteLoginInformationInner>, Observable<Page<RemoteLoginInformationInner>>>() {
            @Override
            public Observable<Page<RemoteLoginInformationInner>> call(Page<RemoteLoginInformationInner> page) {
                return Observable.just(page).concatWith(listRemoteLoginInformationNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<RemoteLoginInformation> listRemoteLoginInformationAsync(final String resourceGroupName, final String workspaceName, final String experimentName, final String jobName) {
        JobsInner client = this.inner();
        return client.listRemoteLoginInformationAsync(resourceGroupName, workspaceName, experimentName, jobName)
        .flatMap(new Func1<Page<RemoteLoginInformationInner>, Observable<Page<RemoteLoginInformationInner>>>() {
            @Override
            public Observable<Page<RemoteLoginInformationInner>> call(Page<RemoteLoginInformationInner> page) {
                return listRemoteLoginInformationNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<RemoteLoginInformationInner>, Iterable<RemoteLoginInformationInner>>() {
            @Override
            public Iterable<RemoteLoginInformationInner> call(Page<RemoteLoginInformationInner> page) {
                return page.items();
            }
       })
        .map(new Func1<RemoteLoginInformationInner, RemoteLoginInformation>() {
            @Override
            public RemoteLoginInformation call(RemoteLoginInformationInner inner) {
                return new RemoteLoginInformationImpl(inner, manager());
            }
       });
    }

    @Override
    public Completable terminateAsync(String resourceGroupName, String workspaceName, String experimentName, String jobName) {
        JobsInner client = this.inner();
        return client.terminateAsync(resourceGroupName, workspaceName, experimentName, jobName).toCompletable();
    }

    private Observable<Page<JobInner>> listByExperimentNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        JobsInner client = this.inner();
        return client.listByExperimentNextAsync(nextLink)
        .flatMap(new Func1<Page<JobInner>, Observable<Page<JobInner>>>() {
            @Override
            public Observable<Page<JobInner>> call(Page<JobInner> page) {
                return Observable.just(page).concatWith(listByExperimentNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<Job> listByExperimentAsync(final String resourceGroupName, final String workspaceName, final String experimentName) {
        JobsInner client = this.inner();
        return client.listByExperimentAsync(resourceGroupName, workspaceName, experimentName)
        .flatMap(new Func1<Page<JobInner>, Observable<Page<JobInner>>>() {
            @Override
            public Observable<Page<JobInner>> call(Page<JobInner> page) {
                return listByExperimentNextInnerPageAsync(page.nextPageLink());
            }
        })
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
    public Observable<Job> getAsync(String resourceGroupName, String workspaceName, String experimentName, String jobName) {
        JobsInner client = this.inner();
        return client.getAsync(resourceGroupName, workspaceName, experimentName, jobName)
        .map(new Func1<JobInner, Job>() {
            @Override
            public Job call(JobInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String workspaceName, String experimentName, String jobName) {
        JobsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, workspaceName, experimentName, jobName).toCompletable();
    }

}
