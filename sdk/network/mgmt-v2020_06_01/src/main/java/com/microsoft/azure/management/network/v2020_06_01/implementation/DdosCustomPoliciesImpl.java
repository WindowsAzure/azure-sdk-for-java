/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.network.v2020_06_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.network.v2020_06_01.DdosCustomPolicies;
import com.microsoft.azure.management.network.v2020_06_01.DdosCustomPolicy;
import rx.Observable;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.azure.arm.resources.ResourceUtilsCore;
import com.microsoft.azure.arm.utils.RXMapper;
import rx.functions.Func1;

class DdosCustomPoliciesImpl extends GroupableResourcesCoreImpl<DdosCustomPolicy, DdosCustomPolicyImpl, DdosCustomPolicyInner, DdosCustomPoliciesInner, NetworkManager>  implements DdosCustomPolicies {
    protected DdosCustomPoliciesImpl(NetworkManager manager) {
        super(manager.inner().ddosCustomPolicies(), manager);
    }

    @Override
    protected Observable<DdosCustomPolicyInner> getInnerAsync(String resourceGroupName, String name) {
        DdosCustomPoliciesInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        DdosCustomPoliciesInner client = this.inner();
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
    public DdosCustomPolicyImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    protected DdosCustomPolicyImpl wrapModel(DdosCustomPolicyInner inner) {
        return  new DdosCustomPolicyImpl(inner.name(), inner, manager());
    }

    @Override
    protected DdosCustomPolicyImpl wrapModel(String name) {
        return new DdosCustomPolicyImpl(name, new DdosCustomPolicyInner(), this.manager());
    }

}
