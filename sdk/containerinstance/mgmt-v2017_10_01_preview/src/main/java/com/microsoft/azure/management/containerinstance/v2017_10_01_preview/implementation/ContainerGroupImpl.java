/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance.v2017_10_01_preview.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.containerinstance.v2017_10_01_preview.ContainerGroup;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.containerinstance.v2017_10_01_preview.Container;
import com.microsoft.azure.management.containerinstance.v2017_10_01_preview.ImageRegistryCredential;
import com.microsoft.azure.management.containerinstance.v2017_10_01_preview.ContainerGroupRestartPolicy;
import com.microsoft.azure.management.containerinstance.v2017_10_01_preview.IpAddress;
import com.microsoft.azure.management.containerinstance.v2017_10_01_preview.OperatingSystemTypes;
import com.microsoft.azure.management.containerinstance.v2017_10_01_preview.Volume;
import com.microsoft.azure.management.containerinstance.v2017_10_01_preview.ContainerGroupPropertiesInstanceView;

class ContainerGroupImpl extends GroupableResourceCoreImpl<ContainerGroup, ContainerGroupInner, ContainerGroupImpl, ContainerInstanceManager> implements ContainerGroup, ContainerGroup.Definition, ContainerGroup.Update {
    ContainerGroupImpl(String name, ContainerGroupInner inner, ContainerInstanceManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<ContainerGroup> createResourceAsync() {
        ContainerGroupsInner client = this.manager().inner().containerGroups();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ContainerGroup> updateResourceAsync() {
        ContainerGroupsInner client = this.manager().inner().containerGroups();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ContainerGroupInner> getInnerAsync() {
        ContainerGroupsInner client = this.manager().inner().containerGroups();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public List<Container> containers() {
        return this.inner().containers();
    }

    @Override
    public List<ImageRegistryCredential> imageRegistryCredentials() {
        return this.inner().imageRegistryCredentials();
    }

    @Override
    public ContainerGroupPropertiesInstanceView instanceView() {
        return this.inner().instanceView();
    }

    @Override
    public IpAddress ipAddress() {
        return this.inner().ipAddress();
    }

    @Override
    public OperatingSystemTypes osType() {
        return this.inner().osType();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public ContainerGroupRestartPolicy restartPolicy() {
        return this.inner().restartPolicy();
    }

    @Override
    public List<Volume> volumes() {
        return this.inner().volumes();
    }

    @Override
    public ContainerGroupImpl withContainers(List<Container> containers) {
        this.inner().withContainers(containers);
        return this;
    }

    @Override
    public ContainerGroupImpl withOsType(OperatingSystemTypes osType) {
        this.inner().withOsType(osType);
        return this;
    }

    @Override
    public ContainerGroupImpl withImageRegistryCredentials(List<ImageRegistryCredential> imageRegistryCredentials) {
        this.inner().withImageRegistryCredentials(imageRegistryCredentials);
        return this;
    }

    @Override
    public ContainerGroupImpl withIpAddress(IpAddress ipAddress) {
        this.inner().withIpAddress(ipAddress);
        return this;
    }

    @Override
    public ContainerGroupImpl withRestartPolicy(ContainerGroupRestartPolicy restartPolicy) {
        this.inner().withRestartPolicy(restartPolicy);
        return this;
    }

    @Override
    public ContainerGroupImpl withVolumes(List<Volume> volumes) {
        this.inner().withVolumes(volumes);
        return this;
    }

}
