/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.appplatform.v2020_07_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.appplatform.v2020_07_01.Deployments;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.appplatform.v2020_07_01.DeploymentResource;
import com.microsoft.azure.management.appplatform.v2020_07_01.LogFileUrlResponse;

class DeploymentsImpl extends WrapperImpl<DeploymentsInner> implements Deployments {
    private final AppPlatformManager manager;

    DeploymentsImpl(AppPlatformManager manager) {
        super(manager.inner().deployments());
        this.manager = manager;
    }

    public AppPlatformManager manager() {
        return this.manager;
    }

    @Override
    public DeploymentResourceImpl define(String name) {
        return wrapModel(name);
    }

    private DeploymentResourceImpl wrapModel(DeploymentResourceInner inner) {
        return  new DeploymentResourceImpl(inner, manager());
    }

    private DeploymentResourceImpl wrapModel(String name) {
        return new DeploymentResourceImpl(name, this.manager());
    }

    @Override
    public Observable<DeploymentResource> listForClusterAsync(final String resourceGroupName, final String serviceName) {
        DeploymentsInner client = this.inner();
        return client.listForClusterAsync(resourceGroupName, serviceName)
        .flatMapIterable(new Func1<Page<DeploymentResourceInner>, Iterable<DeploymentResourceInner>>() {
            @Override
            public Iterable<DeploymentResourceInner> call(Page<DeploymentResourceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<DeploymentResourceInner, DeploymentResource>() {
            @Override
            public DeploymentResource call(DeploymentResourceInner inner) {
                return new DeploymentResourceImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable startAsync(String resourceGroupName, String serviceName, String appName, String deploymentName) {
        DeploymentsInner client = this.inner();
        return client.startAsync(resourceGroupName, serviceName, appName, deploymentName).toCompletable();
    }

    @Override
    public Completable stopAsync(String resourceGroupName, String serviceName, String appName, String deploymentName) {
        DeploymentsInner client = this.inner();
        return client.stopAsync(resourceGroupName, serviceName, appName, deploymentName).toCompletable();
    }

    @Override
    public Completable restartAsync(String resourceGroupName, String serviceName, String appName, String deploymentName) {
        DeploymentsInner client = this.inner();
        return client.restartAsync(resourceGroupName, serviceName, appName, deploymentName).toCompletable();
    }

    @Override
    public Observable<LogFileUrlResponse> getLogFileUrlAsync(String resourceGroupName, String serviceName, String appName, String deploymentName) {
        DeploymentsInner client = this.inner();
        return client.getLogFileUrlAsync(resourceGroupName, serviceName, appName, deploymentName)
        .map(new Func1<LogFileUrlResponseInner, LogFileUrlResponse>() {
            @Override
            public LogFileUrlResponse call(LogFileUrlResponseInner inner) {
                return new LogFileUrlResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DeploymentResource> listAsync(final String resourceGroupName, final String serviceName, final String appName) {
        DeploymentsInner client = this.inner();
        return client.listAsync(resourceGroupName, serviceName, appName)
        .flatMapIterable(new Func1<Page<DeploymentResourceInner>, Iterable<DeploymentResourceInner>>() {
            @Override
            public Iterable<DeploymentResourceInner> call(Page<DeploymentResourceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<DeploymentResourceInner, DeploymentResource>() {
            @Override
            public DeploymentResource call(DeploymentResourceInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<DeploymentResource> getAsync(String resourceGroupName, String serviceName, String appName, String deploymentName) {
        DeploymentsInner client = this.inner();
        return client.getAsync(resourceGroupName, serviceName, appName, deploymentName)
        .flatMap(new Func1<DeploymentResourceInner, Observable<DeploymentResource>>() {
            @Override
            public Observable<DeploymentResource> call(DeploymentResourceInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((DeploymentResource)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String serviceName, String appName, String deploymentName) {
        DeploymentsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, serviceName, appName, deploymentName).toCompletable();
    }

}
