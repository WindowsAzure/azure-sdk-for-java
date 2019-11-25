/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * jkl
 */

package com.microsoft.azure.management.resources.v2018_02_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.resources.v2018_02_01.Deployments;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.azure.arm.resources.ResourceUtilsCore;
import com.microsoft.azure.arm.utils.RXMapper;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.azure.management.resources.v2018_02_01.DeploymentValidateResult;
import com.microsoft.azure.management.resources.v2018_02_01.DeploymentExportResult;
import com.microsoft.azure.management.resources.v2018_02_01.DeploymentProperties;
import com.microsoft.azure.arm.utils.PagedListConverter;
import com.microsoft.azure.management.resources.v2018_02_01.DeploymentExtended;

class DeploymentsImpl extends WrapperImpl<DeploymentsInner> implements Deployments {
    private PagedListConverter<DeploymentExtendedInner, DeploymentExtended> converter;
    private final ResourcesManager manager;

    DeploymentsImpl(ResourcesManager manager) {
        super(manager.inner().deployments());
        this.manager = manager;
        this.converter = new PagedListConverter<DeploymentExtendedInner, DeploymentExtended>() {
            @Override
            public Observable<DeploymentExtended> typeConvertAsync(DeploymentExtendedInner inner) {
                return Observable.just((DeploymentExtended) wrapModel(inner));
            }
        };
    }

    public ResourcesManager manager() {
        return this.manager;
    }

    @Override
    public DeploymentExtendedImpl define(String name) {
        return wrapModel(name);
    }

    private DeploymentExtendedImpl wrapModel(DeploymentExtendedInner inner) {
        return  new DeploymentExtendedImpl(inner, manager());
    }

    private DeploymentExtendedImpl wrapModel(String name) {
        return new DeploymentExtendedImpl(name, this.manager());
    }

    @Override
    public Completable checkExistenceAsync(String resourceGroupName, String deploymentName) {
        DeploymentsInner client = this.inner();
        return client.checkExistenceAsync(resourceGroupName, deploymentName).toCompletable();
    }

    @Override
    public Completable cancelAsync(String resourceGroupName, String deploymentName) {
        DeploymentsInner client = this.inner();
        return client.cancelAsync(resourceGroupName, deploymentName).toCompletable();
    }

    @Override
    public Observable<DeploymentValidateResult> validateAsync(String resourceGroupName, String deploymentName, DeploymentProperties properties) {
        DeploymentsInner client = this.inner();
        return client.validateAsync(resourceGroupName, deploymentName, properties)
        .map(new Func1<DeploymentValidateResultInner, DeploymentValidateResult>() {
            @Override
            public DeploymentValidateResult call(DeploymentValidateResultInner inner) {
                return new DeploymentValidateResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DeploymentExportResult> exportTemplateAsync(String resourceGroupName, String deploymentName) {
        DeploymentsInner client = this.inner();
        return client.exportTemplateAsync(resourceGroupName, deploymentName)
        .map(new Func1<DeploymentExportResultInner, DeploymentExportResult>() {
            @Override
            public DeploymentExportResult call(DeploymentExportResultInner inner) {
                return new DeploymentExportResultImpl(inner, manager());
            }
        });
    }

    @Override
    public PagedList<DeploymentExtended> listByResourceGroup(String resourceGroupName) {
        DeploymentsInner client = this.inner();
        return converter.convert(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<DeploymentExtended> listByResourceGroupAsync(String resourceGroupName) {
        DeploymentsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<DeploymentExtendedInner>, Iterable<DeploymentExtendedInner>>() {
            @Override
            public Iterable<DeploymentExtendedInner> call(Page<DeploymentExtendedInner> page) {
                return page.items();
            }
        })
        .map(new Func1<DeploymentExtendedInner, DeploymentExtended>() {
            @Override
            public DeploymentExtended call(DeploymentExtendedInner inner) {
                return wrapModel(inner);
            }
        });
    }

    private Observable<DeploymentExtendedInner> getInnerAsync(String resourceGroupName, String name) {
        DeploymentsInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    public DeploymentExtended getByResourceGroup(String resourceGroupName, String name) {
        return getByResourceGroupAsync(resourceGroupName, name).toBlocking().last();
    }

    @Override
    public Observable<DeploymentExtended> getByResourceGroupAsync(String resourceGroupName, String name) {
        return this.getInnerAsync(resourceGroupName, name).map(new Func1<DeploymentExtendedInner, DeploymentExtended> () {
            @Override
            public DeploymentExtended call(DeploymentExtendedInner innerT) {
                return wrapModel(innerT);
            }
        });
    }

    @Override
    public ServiceFuture<DeploymentExtended> getByResourceGroupAsync(String resourceGroupName, String name, ServiceCallback<DeploymentExtended> callback) {
        return ServiceFuture.fromBody(getByResourceGroupAsync(resourceGroupName, name), callback);
    }

    @Override
    public Observable<String> deleteByIdsAsync(Collection<String> ids) {
        if (ids == null || ids.isEmpty()) {
            return Observable.empty();
        }
        Collection<Observable<String>> observables = new ArrayList<>();
        for (String id : ids) {
            final String resourceGroupName = ResourceUtilsCore.groupFromResourceId(id);
            final String name = ResourceUtilsCore.nameFromResourceId(id);
            Observable<String> o = RXMapper.map(this.inner().deleteAsync(resourceGroupName, name), id);
            observables.add(o);
        }
        return Observable.mergeDelayError(observables);
    }

    @Override
    public Observable<String> deleteByIdsAsync(String...ids) {
        return this.deleteByIdsAsync(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public void deleteByIds(Collection<String> ids) {
        if (ids != null && !ids.isEmpty()) {
            this.deleteByIdsAsync(ids).toBlocking().last();
        }
    }

    @Override
    public void deleteByIds(String...ids) {
        this.deleteByIds(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public void deleteByResourceGroup(String resourceGroupName, String name) {
        this.deleteByResourceGroupAsync(resourceGroupName, name).await();
    }

    @Override
    public Completable deleteByResourceGroupAsync(String resourceGroupName, String name) {
        return this.inner().deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public ServiceFuture<Void> deleteByResourceGroupAsync(String resourceGroupName, String name, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(deleteByResourceGroupAsync(resourceGroupName, name), serviceCallback);
    }

}
