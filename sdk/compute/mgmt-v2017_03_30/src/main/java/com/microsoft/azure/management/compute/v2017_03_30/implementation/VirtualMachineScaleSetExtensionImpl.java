/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_03_30.implementation;

import com.microsoft.azure.management.compute.v2017_03_30.VirtualMachineScaleSetExtension;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;

class VirtualMachineScaleSetExtensionImpl extends CreatableUpdatableImpl<VirtualMachineScaleSetExtension, VirtualMachineScaleSetExtensionInner, VirtualMachineScaleSetExtensionImpl> implements VirtualMachineScaleSetExtension, VirtualMachineScaleSetExtension.Definition, VirtualMachineScaleSetExtension.Update {
    private final ComputeManager manager;
    private String resourceGroupName;
    private String vmScaleSetName;
    private String vmssExtensionName;

    VirtualMachineScaleSetExtensionImpl(String name, ComputeManager manager) {
        super(name, new VirtualMachineScaleSetExtensionInner());
        this.manager = manager;
        // Set resource name
        this.vmssExtensionName = name;
        //
    }

    VirtualMachineScaleSetExtensionImpl(VirtualMachineScaleSetExtensionInner inner, ComputeManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.vmssExtensionName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.vmScaleSetName = IdParsingUtils.getValueFromIdByName(inner.id(), "virtualMachineScaleSets");
        this.vmssExtensionName = IdParsingUtils.getValueFromIdByName(inner.id(), "extensions");
        //
    }

    @Override
    public ComputeManager manager() {
        return this.manager;
    }

    @Override
    public Observable<VirtualMachineScaleSetExtension> createResourceAsync() {
        VirtualMachineScaleSetExtensionsInner client = this.manager().inner().virtualMachineScaleSetExtensions();
        return client.createOrUpdateAsync(this.resourceGroupName, this.vmScaleSetName, this.vmssExtensionName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<VirtualMachineScaleSetExtension> updateResourceAsync() {
        VirtualMachineScaleSetExtensionsInner client = this.manager().inner().virtualMachineScaleSetExtensions();
        return client.createOrUpdateAsync(this.resourceGroupName, this.vmScaleSetName, this.vmssExtensionName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<VirtualMachineScaleSetExtensionInner> getInnerAsync() {
        VirtualMachineScaleSetExtensionsInner client = this.manager().inner().virtualMachineScaleSetExtensions();
        return client.getAsync(this.resourceGroupName, this.vmScaleSetName, this.vmssExtensionName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public Boolean autoUpgradeMinorVersion() {
        return this.inner().autoUpgradeMinorVersion();
    }

    @Override
    public String forceUpdateTag() {
        return this.inner().forceUpdateTag();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Object protectedSettings() {
        return this.inner().protectedSettings();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String publisher() {
        return this.inner().publisher();
    }

    @Override
    public Object settings() {
        return this.inner().settings();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public String typeHandlerVersion() {
        return this.inner().typeHandlerVersion();
    }

    @Override
    public VirtualMachineScaleSetExtensionImpl withExistingVirtualMachineScaleSet(String resourceGroupName, String vmScaleSetName) {
        this.resourceGroupName = resourceGroupName;
        this.vmScaleSetName = vmScaleSetName;
        return this;
    }

    @Override
    public VirtualMachineScaleSetExtensionImpl withAutoUpgradeMinorVersion(Boolean autoUpgradeMinorVersion) {
        this.inner().withAutoUpgradeMinorVersion(autoUpgradeMinorVersion);
        return this;
    }

    @Override
    public VirtualMachineScaleSetExtensionImpl withForceUpdateTag(String forceUpdateTag) {
        this.inner().withForceUpdateTag(forceUpdateTag);
        return this;
    }

    @Override
    public VirtualMachineScaleSetExtensionImpl withName(String name) {
        this.inner().withName(name);
        return this;
    }

    @Override
    public VirtualMachineScaleSetExtensionImpl withProtectedSettings(Object protectedSettings) {
        this.inner().withProtectedSettings(protectedSettings);
        return this;
    }

    @Override
    public VirtualMachineScaleSetExtensionImpl withPublisher(String publisher) {
        this.inner().withPublisher(publisher);
        return this;
    }

    @Override
    public VirtualMachineScaleSetExtensionImpl withSettings(Object settings) {
        this.inner().withSettings(settings);
        return this;
    }

    @Override
    public VirtualMachineScaleSetExtensionImpl withType(String type) {
        this.inner().withType(type);
        return this;
    }

    @Override
    public VirtualMachineScaleSetExtensionImpl withTypeHandlerVersion(String typeHandlerVersion) {
        this.inner().withTypeHandlerVersion(typeHandlerVersion);
        return this;
    }

}
