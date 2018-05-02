/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.v2018_05_01.implementation;

import com.microsoft.azure.management.batchai.v2018_05_01.Cluster;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.batchai.v2018_05_01.ClusterUpdateParameters;
import java.util.Map;
import com.microsoft.azure.management.batchai.v2018_05_01.ClusterCreateParameters;
import com.microsoft.azure.management.batchai.v2018_05_01.AllocationState;
import org.joda.time.DateTime;
import java.util.List;
import com.microsoft.azure.management.batchai.v2018_05_01.BatchAIError;
import com.microsoft.azure.management.batchai.v2018_05_01.NodeSetup;
import com.microsoft.azure.management.batchai.v2018_05_01.NodeStateCounts;
import com.microsoft.azure.management.batchai.v2018_05_01.ProvisioningState;
import com.microsoft.azure.management.batchai.v2018_05_01.ScaleSettings;
import com.microsoft.azure.management.batchai.v2018_05_01.ResourceId;
import com.microsoft.azure.management.batchai.v2018_05_01.UserAccountSettings;
import com.microsoft.azure.management.batchai.v2018_05_01.VirtualMachineConfiguration;
import com.microsoft.azure.management.batchai.v2018_05_01.VmPriority;
import rx.functions.Func1;

class ClusterImpl extends CreatableUpdatableImpl<Cluster, ClusterInner, ClusterImpl> implements Cluster, Cluster.Definition, Cluster.Update {
    private final BatchAIManager manager;
    private String resourceGroupName;
    private String workspaceName;
    private String clusterName;
    private ClusterCreateParameters createParameter;
    private ClusterUpdateParameters updateParameter;

    ClusterImpl(String name, BatchAIManager manager) {
        super(name, new ClusterInner());
        this.manager = manager;
        // Set resource name
        this.clusterName = name;
        //
        this.createParameter = new ClusterCreateParameters();
        this.updateParameter = new ClusterUpdateParameters();
    }

    ClusterImpl(ClusterInner inner, BatchAIManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.clusterName = inner.name();
        // resource ancestor names
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.workspaceName = IdParsingUtils.getValueFromIdByName(inner.id(), "workspaces");
        this.clusterName = IdParsingUtils.getValueFromIdByName(inner.id(), "clusters");
        //
        this.createParameter = new ClusterCreateParameters();
        this.updateParameter = new ClusterUpdateParameters();
    }

    @Override
    public BatchAIManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Cluster> createResourceAsync() {
        ClustersInner client = this.manager().inner().clusters();
        return client.createAsync(this.resourceGroupName, this.workspaceName, this.clusterName, this.createParameter)
            .map(new Func1<ClusterInner, ClusterInner>() {
               @Override
               public ClusterInner call(ClusterInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Cluster> updateResourceAsync() {
        ClustersInner client = this.manager().inner().clusters();
        return client.updateAsync(this.resourceGroupName, this.workspaceName, this.clusterName, this.updateParameter)
            .map(new Func1<ClusterInner, ClusterInner>() {
               @Override
               public ClusterInner call(ClusterInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ClusterInner> getInnerAsync() {
        ClustersInner client = this.manager().inner().clusters();
        return client.getAsync(this.resourceGroupName, this.workspaceName, this.clusterName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.createParameter = new ClusterCreateParameters();
        this.updateParameter = new ClusterUpdateParameters();
    }

    @Override
    public AllocationState allocationState() {
        return this.inner().allocationState();
    }

    @Override
    public DateTime allocationStateTransitionTime() {
        return this.inner().allocationStateTransitionTime();
    }

    @Override
    public DateTime creationTime() {
        return this.inner().creationTime();
    }

    @Override
    public Integer currentNodeCount() {
        return this.inner().currentNodeCount();
    }

    @Override
    public List<BatchAIError> errors() {
        return this.inner().errors();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public NodeSetup nodeSetup() {
        return this.inner().nodeSetup();
    }

    @Override
    public NodeStateCounts nodeStateCounts() {
        return this.inner().nodeStateCounts();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public DateTime provisioningStateTransitionTime() {
        return this.inner().provisioningStateTransitionTime();
    }

    @Override
    public ScaleSettings scaleSettings() {
        return this.inner().scaleSettings();
    }

    @Override
    public ResourceId subnet() {
        return this.inner().subnet();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public UserAccountSettings userAccountSettings() {
        return this.inner().userAccountSettings();
    }

    @Override
    public VirtualMachineConfiguration virtualMachineConfiguration() {
        return this.inner().virtualMachineConfiguration();
    }

    @Override
    public VmPriority vmPriority() {
        return this.inner().vmPriority();
    }

    @Override
    public String vmSize() {
        return this.inner().vmSize();
    }

    @Override
    public ClusterImpl withExistingWorkspace(String resourceGroupName, String workspaceName) {
        this.resourceGroupName = resourceGroupName;
        this.workspaceName = workspaceName;
        return this;
    }

    @Override
    public ClusterImpl withLocation(String location) {
        this.createParameter.withLocation(location);
        return this;
    }

    @Override
    public ClusterImpl withUserAccountSettings(UserAccountSettings userAccountSettings) {
        this.createParameter.withUserAccountSettings(userAccountSettings);
        return this;
    }

    @Override
    public ClusterImpl withVmSize(String vmSize) {
        this.createParameter.withVmSize(vmSize);
        return this;
    }

    @Override
    public ClusterImpl withNodeSetup(NodeSetup nodeSetup) {
        this.createParameter.withNodeSetup(nodeSetup);
        return this;
    }

    @Override
    public ClusterImpl withSubnet(ResourceId subnet) {
        this.createParameter.withSubnet(subnet);
        return this;
    }

    @Override
    public ClusterImpl withVirtualMachineConfiguration(VirtualMachineConfiguration virtualMachineConfiguration) {
        this.createParameter.withVirtualMachineConfiguration(virtualMachineConfiguration);
        return this;
    }

    @Override
    public ClusterImpl withVmPriority(VmPriority vmPriority) {
        this.createParameter.withVmPriority(vmPriority);
        return this;
    }

    @Override
    public ClusterImpl withScaleSettings(ScaleSettings scaleSettings) {
        if (isInCreateMode()) {
            this.createParameter.withScaleSettings(scaleSettings);
        } else {
            this.updateParameter.withScaleSettings(scaleSettings);
        }
        return this;
    }

    @Override
    public ClusterImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.createParameter.withTags(tags);
        } else {
            this.updateParameter.withTags(tags);
        }
        return this;
    }

}
