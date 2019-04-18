/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.hdinsight.v2018_06_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.hdinsight.v2018_06_01_preview.Configurations;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.hdinsight.v2018_06_01_preview.ClusterConfigurations;
import rx.Completable;
import java.util.Map;

class ConfigurationsImpl extends WrapperImpl<ConfigurationsInner> implements Configurations {
    private final HDInsightManager manager;

    ConfigurationsImpl(HDInsightManager manager) {
        super(manager.inner().configurations());
        this.manager = manager;
    }

    public HDInsightManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ClusterConfigurations> listAsync(String resourceGroupName, String clusterName) {
        ConfigurationsInner client = this.inner();
        return client.listAsync(resourceGroupName, clusterName)
        .map(new Func1<ClusterConfigurationsInner, ClusterConfigurations>() {
            @Override
            public ClusterConfigurations call(ClusterConfigurationsInner inner) {
                return new ClusterConfigurationsImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable updateAsync(String resourceGroupName, String clusterName, String configurationName, Map<String, String> parameters) {
        ConfigurationsInner client = this.inner();
        return client.updateAsync(resourceGroupName, clusterName, configurationName, parameters).toCompletable();
    }

    @Override
    public Observable<Map<String, String>> getAsync(String resourceGroupName, String clusterName, String configurationName) {
        ConfigurationsInner client = this.inner();
        return client.getAsync(resourceGroupName, clusterName, configurationName)
    ;}

}
