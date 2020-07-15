/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.hdinsight.v2015_03_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.hdinsight.v2015_03_01_preview.ScriptExecutionHistorys;
import rx.Completable;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.hdinsight.v2015_03_01_preview.RuntimeScriptActionDetail;

class ScriptExecutionHistorysImpl extends WrapperImpl<ScriptExecutionHistorysInner> implements ScriptExecutionHistorys {
    private final HDInsightManager manager;

    ScriptExecutionHistorysImpl(HDInsightManager manager) {
        super(manager.inner().scriptExecutionHistorys());
        this.manager = manager;
    }

    public HDInsightManager manager() {
        return this.manager;
    }

    @Override
    public Observable<RuntimeScriptActionDetail> listAsync(final String resourceGroupName, final String clusterName) {
        ScriptExecutionHistorysInner client = this.inner();
        return client.listAsync(resourceGroupName, clusterName)
        .flatMapIterable(new Func1<Page<RuntimeScriptActionDetailInner>, Iterable<RuntimeScriptActionDetailInner>>() {
            @Override
            public Iterable<RuntimeScriptActionDetailInner> call(Page<RuntimeScriptActionDetailInner> page) {
                return page.items();
            }
        })
        .map(new Func1<RuntimeScriptActionDetailInner, RuntimeScriptActionDetail>() {
            @Override
            public RuntimeScriptActionDetail call(RuntimeScriptActionDetailInner inner) {
                return new RuntimeScriptActionDetailImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable promoteAsync(String resourceGroupName, String clusterName, String scriptExecutionId) {
        ScriptExecutionHistorysInner client = this.inner();
        return client.promoteAsync(resourceGroupName, clusterName, scriptExecutionId).toCompletable();
    }

}
