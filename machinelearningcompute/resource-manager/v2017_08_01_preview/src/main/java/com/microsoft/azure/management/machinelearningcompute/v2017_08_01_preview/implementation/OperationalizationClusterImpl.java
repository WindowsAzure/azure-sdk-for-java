/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.machinelearningcompute.v2017_08_01_preview.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.machinelearningcompute.v2017_08_01_preview.OperationalizationCluster;
import rx.Observable;
import org.joda.time.DateTime;
import com.microsoft.azure.management.machinelearningcompute.v2017_08_01_preview.OperationStatus;
import java.util.List;
import com.microsoft.azure.management.machinelearningcompute.v2017_08_01_preview.ErrorResponseWrapper;
import com.microsoft.azure.management.machinelearningcompute.v2017_08_01_preview.ClusterType;
import com.microsoft.azure.management.machinelearningcompute.v2017_08_01_preview.StorageAccountProperties;
import com.microsoft.azure.management.machinelearningcompute.v2017_08_01_preview.ContainerRegistryProperties;
import com.microsoft.azure.management.machinelearningcompute.v2017_08_01_preview.AcsClusterProperties;
import com.microsoft.azure.management.machinelearningcompute.v2017_08_01_preview.AppInsightsProperties;
import com.microsoft.azure.management.machinelearningcompute.v2017_08_01_preview.GlobalServiceConfiguration;

class OperationalizationClusterImpl extends GroupableResourceCoreImpl<OperationalizationCluster, OperationalizationClusterInner, OperationalizationClusterImpl, MachineLearningComputeManager> implements OperationalizationCluster, OperationalizationCluster.Definition, OperationalizationCluster.Update {
    OperationalizationClusterImpl(String name, OperationalizationClusterInner inner, MachineLearningComputeManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<OperationalizationCluster> createResourceAsync() {
        OperationalizationClustersInner client = this.manager().inner().operationalizationClusters();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<OperationalizationCluster> updateResourceAsync() {
        OperationalizationClustersInner client = this.manager().inner().operationalizationClusters();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<OperationalizationClusterInner> getInnerAsync() {
        OperationalizationClustersInner client = this.manager().inner().operationalizationClusters();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public AppInsightsProperties appInsights() {
        return this.inner().appInsights();
    }

    @Override
    public ClusterType clusterType() {
        return this.inner().clusterType();
    }

    @Override
    public ContainerRegistryProperties containerRegistry() {
        return this.inner().containerRegistry();
    }

    @Override
    public AcsClusterProperties containerService() {
        return this.inner().containerService();
    }

    @Override
    public DateTime createdOn() {
        return this.inner().createdOn();
    }

    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public GlobalServiceConfiguration globalServiceConfiguration() {
        return this.inner().globalServiceConfiguration();
    }

    @Override
    public DateTime modifiedOn() {
        return this.inner().modifiedOn();
    }

    @Override
    public List<ErrorResponseWrapper> provisioningErrors() {
        return this.inner().provisioningErrors();
    }

    @Override
    public OperationStatus provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public StorageAccountProperties storageAccount() {
        return this.inner().storageAccount();
    }

    @Override
    public OperationalizationClusterImpl withClusterType(ClusterType clusterType) {
        this.inner().withClusterType(clusterType);
        return this;
    }

    @Override
    public OperationalizationClusterImpl withAppInsights(AppInsightsProperties appInsights) {
        this.inner().withAppInsights(appInsights);
        return this;
    }

    @Override
    public OperationalizationClusterImpl withContainerRegistry(ContainerRegistryProperties containerRegistry) {
        this.inner().withContainerRegistry(containerRegistry);
        return this;
    }

    @Override
    public OperationalizationClusterImpl withContainerService(AcsClusterProperties containerService) {
        this.inner().withContainerService(containerService);
        return this;
    }

    @Override
    public OperationalizationClusterImpl withDescription(String description) {
        this.inner().withDescription(description);
        return this;
    }

    @Override
    public OperationalizationClusterImpl withGlobalServiceConfiguration(GlobalServiceConfiguration globalServiceConfiguration) {
        this.inner().withGlobalServiceConfiguration(globalServiceConfiguration);
        return this;
    }

    @Override
    public OperationalizationClusterImpl withStorageAccount(StorageAccountProperties storageAccount) {
        this.inner().withStorageAccount(storageAccount);
        return this;
    }

}
