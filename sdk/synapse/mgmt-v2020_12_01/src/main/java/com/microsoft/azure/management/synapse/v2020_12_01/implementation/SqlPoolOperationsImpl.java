/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.synapse.v2020_12_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.synapse.v2020_12_01.SqlPoolOperations;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.synapse.v2020_12_01.SqlPoolOperation;

class SqlPoolOperationsImpl extends WrapperImpl<SqlPoolOperationsInner> implements SqlPoolOperations {
    private final SynapseManager manager;

    SqlPoolOperationsImpl(SynapseManager manager) {
        super(manager.inner().sqlPoolOperations());
        this.manager = manager;
    }

    public SynapseManager manager() {
        return this.manager;
    }

    private SqlPoolOperationImpl wrapModel(SqlPoolOperationInner inner) {
        return  new SqlPoolOperationImpl(inner, manager());
    }

    @Override
    public Observable<SqlPoolOperation> listAsync(final String resourceGroupName, final String workspaceName, final String sqlPoolName) {
        SqlPoolOperationsInner client = this.inner();
        return client.listAsync(resourceGroupName, workspaceName, sqlPoolName)
        .flatMapIterable(new Func1<Page<SqlPoolOperationInner>, Iterable<SqlPoolOperationInner>>() {
            @Override
            public Iterable<SqlPoolOperationInner> call(Page<SqlPoolOperationInner> page) {
                return page.items();
            }
        })
        .map(new Func1<SqlPoolOperationInner, SqlPoolOperation>() {
            @Override
            public SqlPoolOperation call(SqlPoolOperationInner inner) {
                return wrapModel(inner);
            }
        });
    }

}
