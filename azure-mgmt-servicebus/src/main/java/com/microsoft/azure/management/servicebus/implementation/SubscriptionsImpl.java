/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.servicebus.implementation;

import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.implementation.IndependentChildResourcesImpl;
import com.microsoft.azure.management.servicebus.Subscription;
import com.microsoft.azure.management.servicebus.Subscriptions;
import com.microsoft.azure.management.servicebus.Topic;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Implementation for Subscriptions.
 */
class SubscriptionsImpl
        extends IndependentChildResourcesImpl<
        Subscription,
        SubscriptionImpl,
        SubscriptionResourceInner,
        SubscriptionsInner,
        ServiceBusManager,
        Topic>
        implements Subscriptions {
    private final String resourceGroupName;
    private final String namespaceName;
    private final String topicName;

    protected SubscriptionsImpl(String resourceGroupName,
                                String namespaceName,
                                String topicName,
                                ServiceBusManager manager) {
        super(manager.inner().subscriptions(), manager);
        this.resourceGroupName = resourceGroupName;
        this.namespaceName = namespaceName;
        this.topicName = topicName;
    }

    @Override
    public Topic parent() {
        return null;
    }

    @Override
    public SubscriptionImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public Observable<Subscription> getByNameAsync(String name) {
        return this.inner().getAsync(this.resourceGroupName, this.namespaceName, this.topicName, name)
                .map(new Func1<SubscriptionResourceInner, Subscription>() {
                    @Override
                    public Subscription call(SubscriptionResourceInner inner) {
                        return wrapModel(inner);
                    }
                });
    }

    @Override
    public Subscription getByName(String name) {
        return getByNameAsync(name).toBlocking().last();
    }

    @Override
    public Completable deleteByNameAsync(String name) {
        return this.inner().deleteAsync(this.resourceGroupName,
                this.namespaceName,
                this.topicName,
                name).toCompletable();
    }

    @Override
    public ServiceFuture<Void> deleteByNameAsync(String name, ServiceCallback<Void> callback) {
        return this.inner().deleteAsync(this.resourceGroupName,
                this.namespaceName,
                this.topicName,
                name,
                callback);
    }

    @Override
    public void deleteByName(String name) {
        deleteByNameAsync(name).await();
    }

    @Override
    public Observable<Subscription> listAsync() {
        return this.inner().listByTopicWithServiceResponseAsync(this.resourceGroupName, this.namespaceName, this.topicName)
                .flatMap(new Func1<ServiceResponse<Page<SubscriptionResourceInner>>, Observable<Subscription>>() {
                    @Override
                    public Observable<Subscription> call(ServiceResponse<Page<SubscriptionResourceInner>> r) {
                        return Observable.from(r.body().items()).map(new Func1<SubscriptionResourceInner, Subscription>() {
                            @Override
                            public Subscription call(SubscriptionResourceInner inner) {
                                return wrapModel(inner);
                            }
                        });
                    }
                });
    }

    @Override
    public PagedList<Subscription> list() {
        return this.wrapList(this.inner().listByTopic(this.resourceGroupName,
                this.namespaceName,
                this.topicName));
    }

    @Override
    protected SubscriptionImpl wrapModel(String name) {
        return new SubscriptionImpl(this.resourceGroupName,
                this.namespaceName,
                this.topicName,
                name,
                new SubscriptionResourceInner(),
                this.manager());
    }

    @Override
    protected SubscriptionImpl wrapModel(SubscriptionResourceInner inner) {
        return new SubscriptionImpl(this.resourceGroupName,
                this.namespaceName,
                this.topicName,
                inner.name(),
                inner,
                this.manager());
    }

    @Override
    public PagedList<Subscription> listByParent(String resourceGroupName, String parentName) {
        // 'IndependentChildResourcesImpl' will be refactoring to remove all 'ByParent' methods
        //
        throw new NotImplementedException();
    }

    @Override
    public Completable deleteByParentAsync(String groupName, String parentName, String name) {
        // 'IndependentChildResourcesImpl' will be refactoring to remove all 'ByParent' methods
        //
        throw new NotImplementedException();
    }

    @Override
    public Observable<Subscription> getByParentAsync(String resourceGroup, String parentName, String name) {
        // 'IndependentChildResourcesImpl' will be refactoring to remove all 'ByParent' methods
        //
        throw new NotImplementedException();
    }
}
