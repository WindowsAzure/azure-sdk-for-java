/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.cdn.v2020_04_15.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.cdn.v2020_04_15.Profiles;
import com.microsoft.azure.management.cdn.v2020_04_15.Profile;
import rx.Observable;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.azure.arm.resources.ResourceUtilsCore;
import com.microsoft.azure.arm.utils.RXMapper;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.cdn.v2020_04_15.SsoUri;
import com.microsoft.azure.management.cdn.v2020_04_15.SupportedOptimizationTypesListResult;
import com.microsoft.azure.management.cdn.v2020_04_15.ResourceUsage;

class ProfilesImpl extends GroupableResourcesCoreImpl<Profile, ProfileImpl, ProfileInner, ProfilesInner, CdnManager>  implements Profiles {
    protected ProfilesImpl(CdnManager manager) {
        super(manager.inner().profiles(), manager);
    }

    @Override
    protected Observable<ProfileInner> getInnerAsync(String resourceGroupName, String name) {
        ProfilesInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        ProfilesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, name).toCompletable();
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
    public PagedList<Profile> listByResourceGroup(String resourceGroupName) {
        ProfilesInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<Profile> listByResourceGroupAsync(String resourceGroupName) {
        ProfilesInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<ProfileInner>, Iterable<ProfileInner>>() {
            @Override
            public Iterable<ProfileInner> call(Page<ProfileInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ProfileInner, Profile>() {
            @Override
            public Profile call(ProfileInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<Profile> list() {
        ProfilesInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<Profile> listAsync() {
        ProfilesInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<ProfileInner>, Iterable<ProfileInner>>() {
            @Override
            public Iterable<ProfileInner> call(Page<ProfileInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ProfileInner, Profile>() {
            @Override
            public Profile call(ProfileInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public ProfileImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public Observable<SsoUri> generateSsoUriAsync(String resourceGroupName, String profileName) {
        ProfilesInner client = this.inner();
        return client.generateSsoUriAsync(resourceGroupName, profileName)
        .map(new Func1<SsoUriInner, SsoUri>() {
            @Override
            public SsoUri call(SsoUriInner inner) {
                return new SsoUriImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<SupportedOptimizationTypesListResult> listSupportedOptimizationTypesAsync(String resourceGroupName, String profileName) {
        ProfilesInner client = this.inner();
        return client.listSupportedOptimizationTypesAsync(resourceGroupName, profileName)
        .map(new Func1<SupportedOptimizationTypesListResultInner, SupportedOptimizationTypesListResult>() {
            @Override
            public SupportedOptimizationTypesListResult call(SupportedOptimizationTypesListResultInner inner) {
                return new SupportedOptimizationTypesListResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ResourceUsage> listResourceUsageAsync(final String resourceGroupName, final String profileName) {
        ProfilesInner client = this.inner();
        return client.listResourceUsageAsync(resourceGroupName, profileName)
        .flatMapIterable(new Func1<Page<ResourceUsageInner>, Iterable<ResourceUsageInner>>() {
            @Override
            public Iterable<ResourceUsageInner> call(Page<ResourceUsageInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ResourceUsageInner, ResourceUsage>() {
            @Override
            public ResourceUsage call(ResourceUsageInner inner) {
                return new ResourceUsageImpl(inner, manager());
            }
        });
    }

    @Override
    protected ProfileImpl wrapModel(ProfileInner inner) {
        return  new ProfileImpl(inner.name(), inner, manager());
    }

    @Override
    protected ProfileImpl wrapModel(String name) {
        return new ProfileImpl(name, new ProfileInner(), this.manager());
    }

}
