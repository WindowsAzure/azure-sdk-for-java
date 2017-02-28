/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure.management.resources.fluentcore.arm.collection.implementation;

import com.microsoft.azure.Resource;
import com.microsoft.azure.management.resources.fluentcore.arm.ResourceId;
import com.microsoft.azure.management.resources.fluentcore.arm.ResourceUtils;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsDeletingByGroup;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsGettingByGroup;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsGettingById;
import com.microsoft.azure.management.resources.fluentcore.arm.implementation.ManagerBase;
import com.microsoft.azure.management.resources.fluentcore.arm.models.GroupableResource;
import com.microsoft.azure.management.resources.fluentcore.arm.models.HasManager;
import com.microsoft.azure.management.resources.fluentcore.model.HasInner;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceCallback;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;

/**
 * Base class for resource collection classes.
 * (Internal use only)
 * @param <T> the individual resource type returned
 * @param <ImplT> the individual resource implementation
 * @param <InnerT> the wrapper inner type
 * @param <InnerCollectionT> the inner type of the collection object
 * @param <ManagerT> the manager type for this resource provider type
 */
public abstract class GroupableResourcesImpl<
        T extends GroupableResource<ManagerT, InnerT>,
        ImplT extends T,
        InnerT extends Resource,
        InnerCollectionT,
        ManagerT extends ManagerBase>
    extends CreatableResourcesImpl<T, ImplT, InnerT>
    implements
        SupportsGettingById<T>,
        SupportsGettingByGroup<T>,
        SupportsDeletingByGroup,
        HasManager<ManagerT>,
        HasInner<InnerCollectionT> {

    private final InnerCollectionT innerCollection;
    private final ManagerT myManager;
    protected GroupableResourcesImpl(
            InnerCollectionT innerCollection,
            ManagerT manager) {
        this.innerCollection = innerCollection;
        this.myManager = manager;
    }

    @Override
    public InnerCollectionT inner() {
        return this.innerCollection;
    }

    @Override
    public ManagerT manager() {
        return this.myManager;
    }

    @Override
    public T getById(String id) {
        return getByIdAsync(id).toBlocking().last();
    }

    @Override
    public Observable<T> getByIdAsync(String id) {
        ResourceId resourceId = ResourceId.fromString(id);

        if (resourceId == null) {
            return null;
        }

        return getByGroupAsync(resourceId.resourceGroupName(), resourceId.name());
    }

    @Override
    public ServiceFuture<T> getByIdAsync(String id, ServiceCallback<T> callback) {
        return ServiceFuture.fromBody(getByIdAsync(id), callback);
    }

    @Override
    public void deleteByGroup(String groupName, String name) {
        deleteByGroupAsync(groupName, name).await();
    }

    @Override
    public ServiceFuture<Void> deleteByGroupAsync(String groupName, String name, ServiceCallback<Void> callback) {
        return ServiceFuture.fromBody(deleteByGroupAsync(groupName, name).<Void>toObservable(), callback);
    }

    @Override
    public Completable deleteByIdAsync(String id) {
        return deleteByGroupAsync(ResourceUtils.groupFromResourceId(id), ResourceUtils.nameFromResourceId(id));
    }

    @Override
    public T getByGroup(String resourceGroupName, String name) {
        return getByGroupAsync(resourceGroupName, name).toBlocking().last();
    }

    @Override
    public Observable<T> getByGroupAsync(String resourceGroupName, String name) {
        return this.getAsync(resourceGroupName, name).map(new Func1<InnerT, T>() {
            @Override
            public T call(InnerT innerT) {
                return wrapModel(innerT);
            }
        });
    }

    @Override
    public ServiceFuture<T> getByGroupAsync(String resourceGroupName, String name, ServiceCallback<T> callback) {
        return ServiceFuture.fromBody(getByGroupAsync(resourceGroupName, name), callback);
    }

    protected abstract Observable<InnerT> getAsync(String resourceGroupName, String name);
}
