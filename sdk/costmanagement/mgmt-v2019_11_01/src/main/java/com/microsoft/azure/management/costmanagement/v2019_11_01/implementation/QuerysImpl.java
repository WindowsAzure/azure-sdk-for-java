/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.costmanagement.v2019_11_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.costmanagement.v2019_11_01.Querys;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.costmanagement.v2019_11_01.QueryResult;
import com.microsoft.azure.management.costmanagement.v2019_11_01.QueryDefinition;

class QuerysImpl extends WrapperImpl<QuerysInner> implements Querys {
    private final CostManagementManager manager;

    QuerysImpl(CostManagementManager manager) {
        super(manager.inner().querys());
        this.manager = manager;
    }

    public CostManagementManager manager() {
        return this.manager;
    }

    @Override
    public Observable<QueryResult> usageAsync(String scope, QueryDefinition parameters) {
        QuerysInner client = this.inner();
        return client.usageAsync(scope, parameters)
        .map(new Func1<QueryResultInner, QueryResult>() {
            @Override
            public QueryResult call(QueryResultInner inner) {
                return new QueryResultImpl(inner, manager());
            }
        });
    }

}
