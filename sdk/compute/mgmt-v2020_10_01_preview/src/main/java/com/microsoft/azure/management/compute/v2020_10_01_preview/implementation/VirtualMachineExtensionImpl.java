/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview.implementation;

import com.microsoft.azure.management.compute.v2020_10_01_preview.VirtualMachineExtension;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.compute.v2020_10_01_preview.VirtualMachineExtensionUpdate;
import java.util.Map;
import com.microsoft.azure.management.compute.v2020_10_01_preview.VirtualMachineExtensionInstanceView;
import rx.functions.Func1;

class VirtualMachineExtensionImpl extends CreatableUpdatableImpl<VirtualMachineExtension, VirtualMachineExtensionInner, VirtualMachineExtensionImpl> implements VirtualMachineExtension, VirtualMachineExtension.Definition, VirtualMachineExtension.Update {
    private final ComputeManager manager;
    private String resourceGroupName;
    private String vmName;
    private String vmExtensionName;
    private VirtualMachineExtensionUpdate updateParameter;

    VirtualMachineExtensionImpl(String name, ComputeManager manager) {
        super(name, new VirtualMachineExtensionInner());
        this.manager = manager;
        // Set resource name
        this.vmExtensionName = name;
        //
        this.updateParameter = new VirtualMachineExtensionUpdate();
    }

    VirtualMachineExtensionImpl(VirtualMachineExtensionInner inner, ComputeManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.vmExtensionName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.vmName = IdParsingUtils.getValueFromIdByName(inner.id(), "virtualMachines");
        this.vmExtensionName = IdParsingUtils.getValueFromIdByName(inner.id(), "extensions");
        //
        this.updateParameter = new VirtualMachineExtensionUpdate();
    }

    @Override
    public ComputeManager manager() {
        return this.manager;
    }

    @Override
    public Observable<VirtualMachineExtension> createResourceAsync() {
        VirtualMachineExtensionsInner client = this.manager().inner().virtualMachineExtensions();
        return client.createOrUpdateAsync(this.resourceGroupName, this.vmName, this.vmExtensionName, this.inner())
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
    public Observable<VirtualMachineExtension> updateResourceAsync() {
        VirtualMachineExtensionsInner client = this.manager().inner().virtualMachineExtensions();
        return client.updateAsync(this.resourceGroupName, this.vmName, this.vmExtensionName, this.updateParameter)
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
        VirtualMachineExtensionsInner client = this.manager().inner().virtualMachineExtensions();
        return client.getAsync(this.resourceGroupName, this.vmName, this.vmExtensionName);
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
    public Boolean enableAutomaticUpgrade() {
        return this.inner().enableAutomaticUpgrade();
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
    public VirtualMachineExtensionImpl withExistingVirtualMachine(String resourceGroupName, String vmName) {
        this.resourceGroupName = resourceGroupName;
        this.vmName = vmName;
        return this;
    }

    @Override
    public VirtualMachineExtensionImpl withLocation(String location) {
        this.inner().withLocation(location);
        return this;
    }

    @Override
    public VirtualMachineExtensionImpl withInstanceView(VirtualMachineExtensionInstanceView instanceView) {
        this.inner().withInstanceView(instanceView);
        return this;
    }

    @Override
    public VirtualMachineExtensionImpl withVirtualMachineExtensionType(String virtualMachineExtensionType) {
        this.inner().withVirtualMachineExtensionType(virtualMachineExtensionType);
        return this;
    }

    @Override
    public VirtualMachineExtensionImpl withType(String type) {
        this.updateParameter.withType(type);
        return this;
    }

    @Override
    public VirtualMachineExtensionImpl withAutoUpgradeMinorVersion(Boolean autoUpgradeMinorVersion) {
        if (isInCreateMode()) {
            this.inner().withAutoUpgradeMinorVersion(autoUpgradeMinorVersion);
        } else {
            this.updateParameter.withAutoUpgradeMinorVersion(autoUpgradeMinorVersion);
        }
        return this;
    }

    @Override
    public VirtualMachineExtensionImpl withEnableAutomaticUpgrade(Boolean enableAutomaticUpgrade) {
        if (isInCreateMode()) {
            this.inner().withEnableAutomaticUpgrade(enableAutomaticUpgrade);
        } else {
            this.updateParameter.withEnableAutomaticUpgrade(enableAutomaticUpgrade);
        }
        return this;
    }

    @Override
    public VirtualMachineExtensionImpl withForceUpdateTag(String forceUpdateTag) {
        if (isInCreateMode()) {
            this.inner().withForceUpdateTag(forceUpdateTag);
        } else {
            this.updateParameter.withForceUpdateTag(forceUpdateTag);
        }
        return this;
    }

    @Override
    public VirtualMachineExtensionImpl withProtectedSettings(Object protectedSettings) {
        if (isInCreateMode()) {
            this.inner().withProtectedSettings(protectedSettings);
        } else {
            this.updateParameter.withProtectedSettings(protectedSettings);
        }
        return this;
    }

    @Override
    public VirtualMachineExtensionImpl withPublisher(String publisher) {
        if (isInCreateMode()) {
            this.inner().withPublisher(publisher);
        } else {
            this.updateParameter.withPublisher(publisher);
        }
        return this;
    }

    @Override
    public VirtualMachineExtensionImpl withSettings(Object settings) {
        if (isInCreateMode()) {
            this.inner().withSettings(settings);
        } else {
            this.updateParameter.withSettings(settings);
        }
        return this;
    }

    @Override
    public VirtualMachineExtensionImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.inner().withTags(tags);
        } else {
            this.updateParameter.withTags(tags);
        }
        return this;
    }

    @Override
    public VirtualMachineExtensionImpl withTypeHandlerVersion(String typeHandlerVersion) {
        if (isInCreateMode()) {
            this.inner().withTypeHandlerVersion(typeHandlerVersion);
        } else {
            this.updateParameter.withTypeHandlerVersion(typeHandlerVersion);
        }
        return this;
    }

}
