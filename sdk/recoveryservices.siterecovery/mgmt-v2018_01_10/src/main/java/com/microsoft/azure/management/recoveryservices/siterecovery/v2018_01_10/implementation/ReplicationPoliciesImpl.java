/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.ReplicationPolicies;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.Policy;

class ReplicationPoliciesImpl extends WrapperImpl<ReplicationPoliciesInner> implements ReplicationPolicies {
    private final RecoveryServicesManager manager;

    ReplicationPoliciesImpl(RecoveryServicesManager manager) {
        super(manager.inner().replicationPolicies());
        this.manager = manager;
    }

    public RecoveryServicesManager manager() {
        return this.manager;
    }

    @Override
    public PolicyImpl define(String name) {
        return wrapModel(name);
    }

    private PolicyImpl wrapModel(PolicyInner inner) {
        return  new PolicyImpl(inner, manager());
    }

    private PolicyImpl wrapModel(String name) {
        return new PolicyImpl(name, this.manager());
    }

    @Override
    public Observable<Policy> listAsync() {
        ReplicationPoliciesInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<PolicyInner>, Iterable<PolicyInner>>() {
            @Override
            public Iterable<PolicyInner> call(Page<PolicyInner> page) {
                return page.items();
            }
        })
        .map(new Func1<PolicyInner, Policy>() {
            @Override
            public Policy call(PolicyInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<Policy> getAsync(String policyName) {
        ReplicationPoliciesInner client = this.inner();
        return client.getAsync(policyName)
        .flatMap(new Func1<PolicyInner, Observable<Policy>>() {
            @Override
            public Observable<Policy> call(PolicyInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((Policy)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String policyName) {
        ReplicationPoliciesInner client = this.inner();
        return client.deleteAsync(policyName).toCompletable();
    }

}
