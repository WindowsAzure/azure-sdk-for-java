/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.sql.v2014_04_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.sql.v2014_04_01.DataMaskingPolicies;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.sql.v2014_04_01.DataMaskingPolicy;

class DataMaskingPoliciesImpl extends WrapperImpl<DataMaskingPoliciesInner> implements DataMaskingPolicies {
    private final SqlManager manager;

    DataMaskingPoliciesImpl(SqlManager manager) {
        super(manager.inner().dataMaskingPolicies());
        this.manager = manager;
    }

    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public DataMaskingPolicyImpl define(String name) {
        return wrapModel(name);
    }

    private DataMaskingPolicyImpl wrapModel(DataMaskingPolicyInner inner) {
        return  new DataMaskingPolicyImpl(inner, manager());
    }

    private DataMaskingPolicyImpl wrapModel(String name) {
        return new DataMaskingPolicyImpl(name, this.manager());
    }

    @Override
    public Observable<DataMaskingPolicy> getAsync(String resourceGroupName, String serverName, String databaseName) {
        DataMaskingPoliciesInner client = this.inner();
        return client.getAsync(resourceGroupName, serverName, databaseName)
        .flatMap(new Func1<DataMaskingPolicyInner, Observable<DataMaskingPolicy>>() {
            @Override
            public Observable<DataMaskingPolicy> call(DataMaskingPolicyInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((DataMaskingPolicy)wrapModel(inner));
                }
            }
       });
    }

}
