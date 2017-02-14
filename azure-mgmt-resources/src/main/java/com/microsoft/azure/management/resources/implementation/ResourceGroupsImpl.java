/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.resources.implementation;

import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.management.resources.ResourceGroup;
import com.microsoft.azure.management.resources.ResourceGroups;
import com.microsoft.azure.management.resources.fluentcore.arm.ResourceUtils;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.implementation.CreatableResourcesImpl;
import com.microsoft.azure.management.resources.fluentcore.utils.Utils;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;

import java.util.List;

/**
 * The implementation for {@link ResourceGroups} and its parent interfaces.
 */
final class ResourceGroupsImpl
        extends CreatableResourcesImpl<ResourceGroup, ResourceGroupImpl, ResourceGroupInner>
        implements ResourceGroups {
    private final ResourceGroupsInner client;
    private final ResourceManagementClientImpl serviceClient;

    /**
     * Creates an instance of the implementation.
     *
     * @param serviceClient the inner resource management client
     */
    ResourceGroupsImpl(final ResourceManagementClientImpl serviceClient) {
        this.serviceClient = serviceClient;
        this.client = serviceClient.resourceGroups();
    }

    @Override
    public PagedList<ResourceGroup> list() {
        return wrapList(client.list());
    }

    @Override
    public Observable<ResourceGroup> listAsync() {
        return client.listAsync().map(pageToList()).flatMap(listToIndividualResource());
    }

    @Override
    public PagedList<ResourceGroup> listByTag(String tagName, String tagValue) {
        return wrapList(client.list(Utils.createOdataFilterForTags(tagName, tagValue), null));
    }

    @Override
    public ResourceGroupImpl getByName(String name) {
        return wrapModel(client.get(name));
    }

    @Override
    public void deleteByName(String name) {
        deleteByNameAsync(name).await();
    }

    @Override
    public ServiceCall<Void> deleteByNameAsync(String name, ServiceCallback<Void> callback) {
        return ServiceCall.fromResponse(client.deleteWithServiceResponseAsync(name), callback);
    }

    @Override
    public Completable deleteByNameAsync(String name) {
        return client.deleteAsync(name).toCompletable();
    }

    @Override
    public ResourceGroupImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public boolean checkExistence(String name) {
        return client.checkExistence(name);
    }

    @Override
    protected ResourceGroupImpl wrapModel(String name) {
        return new ResourceGroupImpl(
                new ResourceGroupInner().withName(name),
                serviceClient);
    }

    @Override
    protected ResourceGroupImpl wrapModel(ResourceGroupInner inner) {
        if (inner == null) {
            return null;
        }
        return new ResourceGroupImpl(inner, serviceClient);
    }

    @Override
    public void beginDeleteByName(String id) {
        beginDeleteByNameAsync(id).toBlocking().subscribe();
    }

    @Override
    public ServiceCall<Void> beginDeleteByNameAsync(String name, ServiceCallback<Void> callback) {
        return ServiceCall.fromBody(beginDeleteByNameAsync(name), callback);
    }

    @Override
    public Observable<Void> beginDeleteByNameAsync(String name) {
        return client.beginDeleteAsync(name);
    }

    @Override
    public Completable deleteByIdAsync(String id) {
        return deleteByNameAsync(ResourceUtils.nameFromResourceId(id));
    }


    private Func1<Page<ResourceGroupInner>, List<ResourceGroupInner>> pageToList() {
        return new Func1<Page<ResourceGroupInner>, List<ResourceGroupInner>>() {
            @Override
            public List<ResourceGroupInner> call(Page<ResourceGroupInner> resourceGroupInnerPage) {
                return resourceGroupInnerPage.items();
            }
        };
    }

    private Func1<List<ResourceGroupInner>, Observable<ResourceGroup>> listToIndividualResource() {
        return new Func1<List<ResourceGroupInner>, Observable<ResourceGroup>>() {
            @Override
            public Observable<ResourceGroup> call(List<ResourceGroupInner> resourceGroupInners) {
                return Observable.from(resourceGroupInners).map(new Func1<ResourceGroupInner, ResourceGroup>() {
                    @Override
                    public ResourceGroup call(ResourceGroupInner inner) {
                        return wrapModel(inner);
                    }
                });
            }
        };
    }
}
