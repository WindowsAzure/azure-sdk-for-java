/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_07_01.implementation;

import com.microsoft.azure.management.compute.v2019_07_01.VirtualMachineScaleSetVirtualMachineExtension;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.compute.v2019_07_01.VirtualMachineExtensionUpdate;
import java.util.Map;
import com.microsoft.azure.management.compute.v2019_07_01.VirtualMachineExtensionInstanceView;
import rx.functions.Func1;

class VirtualMachineScaleSetVirtualMachineExtensionImpl extends CreatableUpdatableImpl<VirtualMachineScaleSetVirtualMachineExtension, VirtualMachineExtensionInner, VirtualMachineScaleSetVirtualMachineExtensionImpl> implements VirtualMachineScaleSetVirtualMachineExtension, VirtualMachineScaleSetVirtualMachineExtension.Definition, VirtualMachineScaleSetVirtualMachineExtension.Update {
    private final ComputeManager manager;
    private String resourceGroupName;
    private String vmScaleSetName;
    private String instanceId;
    private String vmExtensionName;
    private VirtualMachineExtensionUpdate updateParameter;

    VirtualMachineScaleSetVirtualMachineExtensionImpl(String name, ComputeManager manager) {
        super(name, new VirtualMachineExtensionInner());
        this.manager = manager;
        // Set resource name
        this.vmExtensionName = name;
        //
        this.updateParameter = new VirtualMachineExtensionUpdate();
    }

    VirtualMachineScaleSetVirtualMachineExtensionImpl(VirtualMachineExtensionInner inner, ComputeManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.vmExtensionName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.vmScaleSetName = IdParsingUtils.getValueFromIdByName(inner.id(), "virtualMachineScaleSets");
        this.instanceId = IdParsingUtils.getValueFromIdByName(inner.id(), "virtualMachines");
        this.vmExtensionName = IdParsingUtils.getValueFromIdByName(inner.id(), "extensions");
        //
        this.updateParameter = new VirtualMachineExtensionUpdate();
    }

    @Override
    public ComputeManager manager() {
        return this.manager;
    }

    @Override
    public Observable<VirtualMachineScaleSetVirtualMachineExtension> createResourceAsync() {
        VirtualMachineScaleSetVMExtensionsInner client = this.manager().inner().virtualMachineScaleSetVMExtensions();
        return client.createOrUpdateAsync(this.resourceGroupName, this.vmScaleSetName, this.instanceId, this.vmExtensionName, this.inner())
            .map(new Func1<VirtualMachineExtensionInner, VirtualMachineExtensionInner>() {
               @Override
               public VirtualMachineExtensionInner call(VirtualMachineExtensionInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<VirtualMachineScaleSetVirtualMachineExtension> updateResourceAsync() {
        VirtualMachineScaleSetVMExtensionsInner client = this.manager().inner().virtualMachineScaleSetVMExtensions();
        return client.updateAsync(this.resourceGroupName, this.vmScaleSetName, this.instanceId, this.vmExtensionName, this.updateParameter)
            .map(new Func1<VirtualMachineExtensionInner, VirtualMachineExtensionInner>() {
               @Override
               public VirtualMachineExtensionInner call(VirtualMachineExtensionInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<VirtualMachineExtensionInner> getInnerAsync() {
        VirtualMachineScaleSetVMExtensionsInner client = this.manager().inner().virtualMachineScaleSetVMExtensions();
        return client.getAsync(this.resourceGroupName, this.vmScaleSetName, this.instanceId, this.vmExtensionName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new VirtualMachineExtensionUpdate();
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
    public VirtualMachineExtensionInstanceView instanceView() {
        return this.inner().instanceView();
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
    public Map<String, String> tags() {
        return this.inner().getTags();
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
    public String virtualMachineExtensionType() {
        return this.inner().virtualMachineExtensionType();
    }

    @Override
    public VirtualMachineScaleSetVirtualMachineExtensionImpl withExistingVirtualmachine(String resourceGroupName, String vmScaleSetName, String instanceId) {
        this.resourceGroupName = resourceGroupName;
        this.vmScaleSetName = vmScaleSetName;
        this.instanceId = instanceId;
        return this;
    }

    @Override
    public VirtualMachineScaleSetVirtualMachineExtensionImpl withLocation(String location) {
        this.inner().withLocation(location);
        return this;
    }

    @Override
    public VirtualMachineScaleSetVirtualMachineExtensionImpl withInstanceView(VirtualMachineExtensionInstanceView instanceView) {
        this.inner().withInstanceView(instanceView);
        return this;
    }

    @Override
    public VirtualMachineScaleSetVirtualMachineExtensionImpl withVirtualMachineExtensionType(String virtualMachineExtensionType) {
        this.inner().withVirtualMachineExtensionType(virtualMachineExtensionType);
        return this;
    }

    @Override
    public VirtualMachineScaleSetVirtualMachineExtensionImpl withType(String type) {
        this.updateParameter.withType(type);
        return this;
    }

    @Override
    public VirtualMachineScaleSetVirtualMachineExtensionImpl withAutoUpgradeMinorVersion(Boolean autoUpgradeMinorVersion) {
        if (isInCreateMode()) {
            this.inner().withAutoUpgradeMinorVersion(autoUpgradeMinorVersion);
        } else {
            this.updateParameter.withAutoUpgradeMinorVersion(autoUpgradeMinorVersion);
        }
        return this;
    }

    @Override
    public VirtualMachineScaleSetVirtualMachineExtensionImpl withForceUpdateTag(String forceUpdateTag) {
        if (isInCreateMode()) {
            this.inner().withForceUpdateTag(forceUpdateTag);
        } else {
            this.updateParameter.withForceUpdateTag(forceUpdateTag);
        }
        return this;
    }

    @Override
    public VirtualMachineScaleSetVirtualMachineExtensionImpl withProtectedSettings(Object protectedSettings) {
        if (isInCreateMode()) {
            this.inner().withProtectedSettings(protectedSettings);
        } else {
            this.updateParameter.withProtectedSettings(protectedSettings);
        }
        return this;
    }

    @Override
    public VirtualMachineScaleSetVirtualMachineExtensionImpl withPublisher(String publisher) {
        if (isInCreateMode()) {
            this.inner().withPublisher(publisher);
        } else {
            this.updateParameter.withPublisher(publisher);
        }
        return this;
    }

    @Override
    public VirtualMachineScaleSetVirtualMachineExtensionImpl withSettings(Object settings) {
        if (isInCreateMode()) {
            this.inner().withSettings(settings);
        } else {
            this.updateParameter.withSettings(settings);
        }
        return this;
    }

    @Override
    public VirtualMachineScaleSetVirtualMachineExtensionImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.inner().withTags(tags);
        } else {
            this.updateParameter.withTags(tags);
        }
        return this;
    }

    @Override
    public VirtualMachineScaleSetVirtualMachineExtensionImpl withTypeHandlerVersion(String typeHandlerVersion) {
        if (isInCreateMode()) {
            this.inner().withTypeHandlerVersion(typeHandlerVersion);
        } else {
            this.updateParameter.withTypeHandlerVersion(typeHandlerVersion);
        }
        return this;
    }

}
