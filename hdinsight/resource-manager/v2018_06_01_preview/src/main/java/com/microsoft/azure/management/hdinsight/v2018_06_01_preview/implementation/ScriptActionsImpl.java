/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.hdinsight.v2018_06_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.hdinsight.v2018_06_01_preview.ScriptActions;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.hdinsight.v2018_06_01_preview.RuntimeScriptActionDetail;

class ScriptActionsImpl extends WrapperImpl<ScriptActionsInner> implements ScriptActions {
    private final HDInsightManager manager;

    ScriptActionsImpl(HDInsightManager manager) {
        super(manager.inner().scriptActions());
        this.manager = manager;
    }

    public HDInsightManager manager() {
        return this.manager;
    }

    private RuntimeScriptActionDetailImpl wrapModel(RuntimeScriptActionDetailInner inner) {
        return  new RuntimeScriptActionDetailImpl(inner, manager());
    }

    @Override
    public Observable<RuntimeScriptActionDetail> listByClusterAsync(final String resourceGroupName, final String clusterName) {
        ScriptActionsInner client = this.inner();
        return client.listByClusterAsync(resourceGroupName, clusterName)
        .flatMapIterable(new Func1<Page<RuntimeScriptActionDetailInner>, Iterable<RuntimeScriptActionDetailInner>>() {
            @Override
            public Iterable<RuntimeScriptActionDetailInner> call(Page<RuntimeScriptActionDetailInner> page) {
                return page.items();
            }
        })
        .map(new Func1<RuntimeScriptActionDetailInner, RuntimeScriptActionDetail>() {
            @Override
            public RuntimeScriptActionDetail call(RuntimeScriptActionDetailInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String clusterName, String scriptName) {
        ScriptActionsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, clusterName, scriptName).toCompletable();
    }

    @Override
    public Observable<RuntimeScriptActionDetail> getExecutionDetailAsync(String resourceGroupName, String clusterName, String scriptExecutionId) {
        ScriptActionsInner client = this.inner();
        return client.getExecutionDetailAsync(resourceGroupName, clusterName, scriptExecutionId)
        .map(new Func1<RuntimeScriptActionDetailInner, RuntimeScriptActionDetail>() {
            @Override
            public RuntimeScriptActionDetail call(RuntimeScriptActionDetailInner inner) {
                return new RuntimeScriptActionDetailImpl(inner, manager());
            }
        });
    }

}
