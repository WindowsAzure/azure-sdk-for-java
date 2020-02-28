/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2020_02_01.implementation;

import com.microsoft.azure.management.containerservice.v2020_02_01.AgentPool;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.containerservice.v2020_02_01.ContainerServiceVMSizeTypes;
import com.microsoft.azure.management.containerservice.v2020_02_01.OSType;
import com.microsoft.azure.management.containerservice.v2020_02_01.AgentPoolType;
import java.util.List;
import com.microsoft.azure.management.containerservice.v2020_02_01.ScaleSetPriority;
import com.microsoft.azure.management.containerservice.v2020_02_01.ScaleSetEvictionPolicy;
import java.util.Map;

class AgentPoolImpl extends CreatableUpdatableImpl<AgentPool, AgentPoolInner, AgentPoolImpl> implements AgentPool, AgentPool.Definition, AgentPool.Update {
    private final ContainerServiceManager manager;
    private String resourceGroupName;
    private String resourceName;
    private String agentPoolName;

    AgentPoolImpl(String name, ContainerServiceManager manager) {
        super(name, new AgentPoolInner());
        this.manager = manager;
        // Set resource name
        this.agentPoolName = name;
        //
    }

    AgentPoolImpl(AgentPoolInner inner, ContainerServiceManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.agentPoolName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.resourceName = IdParsingUtils.getValueFromIdByName(inner.id(), "managedClusters");
        this.agentPoolName = IdParsingUtils.getValueFromIdByName(inner.id(), "agentPools");
        //
    }

    @Override
    public ContainerServiceManager manager() {
        return this.manager;
    }

    @Override
    public Observable<AgentPool> createResourceAsync() {
        AgentPoolsInner client = this.manager().inner().agentPools();
        return client.createOrUpdateAsync(this.resourceGroupName, this.resourceName, this.agentPoolName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<AgentPool> updateResourceAsync() {
        AgentPoolsInner client = this.manager().inner().agentPools();
        return client.createOrUpdateAsync(this.resourceGroupName, this.resourceName, this.agentPoolName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<AgentPoolInner> getInnerAsync() {
        AgentPoolsInner client = this.manager().inner().agentPools();
        return client.getAsync(this.resourceGroupName, this.resourceName, this.agentPoolName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public AgentPoolType agentPoolType() {
        return this.inner().agentPoolType();
    }

    @Override
    public List<String> availabilityZones() {
        return this.inner().availabilityZones();
    }

    @Override
    public int count() {
        return this.inner().count();
    }

    @Override
    public Boolean enableAutoScaling() {
        return this.inner().enableAutoScaling();
    }

    @Override
    public Boolean enableNodePublicIP() {
        return this.inner().enableNodePublicIP();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Integer maxCount() {
        return this.inner().maxCount();
    }

    @Override
    public Integer maxPods() {
        return this.inner().maxPods();
    }

    @Override
    public Integer minCount() {
        return this.inner().minCount();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Map<String, String> nodeLabels() {
        return this.inner().nodeLabels();
    }

    @Override
    public List<String> nodeTaints() {
        return this.inner().nodeTaints();
    }

    @Override
    public String orchestratorVersion() {
        return this.inner().orchestratorVersion();
    }

    @Override
    public Integer osDiskSizeGB() {
        return this.inner().osDiskSizeGB();
    }

    @Override
    public OSType osType() {
        return this.inner().osType();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public ScaleSetEvictionPolicy scaleSetEvictionPolicy() {
        return this.inner().scaleSetEvictionPolicy();
    }

    @Override
    public ScaleSetPriority scaleSetPriority() {
        return this.inner().scaleSetPriority();
    }

    @Override
    public Double spotMaxPrice() {
        return this.inner().spotMaxPrice();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().tags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public ContainerServiceVMSizeTypes vmSize() {
        return this.inner().vmSize();
    }

    @Override
    public String vnetSubnetID() {
        return this.inner().vnetSubnetID();
    }

    @Override
    public AgentPoolImpl withExistingManagedCluster(String resourceGroupName, String resourceName) {
        this.resourceGroupName = resourceGroupName;
        this.resourceName = resourceName;
        return this;
    }

    @Override
    public AgentPoolImpl withCount(int count) {
        this.inner().withCount(count);
        return this;
    }

    @Override
    public AgentPoolImpl withVmSize(ContainerServiceVMSizeTypes vmSize) {
        this.inner().withVmSize(vmSize);
        return this;
    }

    @Override
    public AgentPoolImpl withAgentPoolType(AgentPoolType agentPoolType) {
        this.inner().withAgentPoolType(agentPoolType);
        return this;
    }

    @Override
    public AgentPoolImpl withAvailabilityZones(List<String> availabilityZones) {
        this.inner().withAvailabilityZones(availabilityZones);
        return this;
    }

    @Override
    public AgentPoolImpl withEnableAutoScaling(Boolean enableAutoScaling) {
        this.inner().withEnableAutoScaling(enableAutoScaling);
        return this;
    }

    @Override
    public AgentPoolImpl withEnableNodePublicIP(Boolean enableNodePublicIP) {
        this.inner().withEnableNodePublicIP(enableNodePublicIP);
        return this;
    }

    @Override
    public AgentPoolImpl withMaxCount(Integer maxCount) {
        this.inner().withMaxCount(maxCount);
        return this;
    }

    @Override
    public AgentPoolImpl withMaxPods(Integer maxPods) {
        this.inner().withMaxPods(maxPods);
        return this;
    }

    @Override
    public AgentPoolImpl withMinCount(Integer minCount) {
        this.inner().withMinCount(minCount);
        return this;
    }

    @Override
    public AgentPoolImpl withNodeLabels(Map<String, String> nodeLabels) {
        this.inner().withNodeLabels(nodeLabels);
        return this;
    }

    @Override
    public AgentPoolImpl withNodeTaints(List<String> nodeTaints) {
        this.inner().withNodeTaints(nodeTaints);
        return this;
    }

    @Override
    public AgentPoolImpl withOrchestratorVersion(String orchestratorVersion) {
        this.inner().withOrchestratorVersion(orchestratorVersion);
        return this;
    }

    @Override
    public AgentPoolImpl withOsDiskSizeGB(Integer osDiskSizeGB) {
        this.inner().withOsDiskSizeGB(osDiskSizeGB);
        return this;
    }

    @Override
    public AgentPoolImpl withOsType(OSType osType) {
        this.inner().withOsType(osType);
        return this;
    }

    @Override
    public AgentPoolImpl withScaleSetEvictionPolicy(ScaleSetEvictionPolicy scaleSetEvictionPolicy) {
        this.inner().withScaleSetEvictionPolicy(scaleSetEvictionPolicy);
        return this;
    }

    @Override
    public AgentPoolImpl withScaleSetPriority(ScaleSetPriority scaleSetPriority) {
        this.inner().withScaleSetPriority(scaleSetPriority);
        return this;
    }

    @Override
    public AgentPoolImpl withSpotMaxPrice(Double spotMaxPrice) {
        this.inner().withSpotMaxPrice(spotMaxPrice);
        return this;
    }

    @Override
    public AgentPoolImpl withTags(Map<String, String> tags) {
        this.inner().withTags(tags);
        return this;
    }

    @Override
    public AgentPoolImpl withVnetSubnetID(String vnetSubnetID) {
        this.inner().withVnetSubnetID(vnetSubnetID);
        return this;
    }

}
