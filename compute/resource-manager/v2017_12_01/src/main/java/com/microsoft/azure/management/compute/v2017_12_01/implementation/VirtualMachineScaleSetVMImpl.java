/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_12_01.implementation;

import com.microsoft.azure.management.compute.v2017_12_01.VirtualMachineScaleSetVM;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import java.util.Map;
import com.microsoft.azure.management.compute.v2017_12_01.Sku;
import com.microsoft.azure.management.compute.v2017_12_01.HardwareProfile;
import com.microsoft.azure.management.compute.v2017_12_01.StorageProfile;
import com.microsoft.azure.management.compute.v2017_12_01.OSProfile;
import com.microsoft.azure.management.compute.v2017_12_01.NetworkProfile;
import com.microsoft.azure.management.compute.v2017_12_01.DiagnosticsProfile;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.compute.v2017_12_01.Plan;
import java.util.List;
import com.microsoft.azure.management.compute.v2017_12_01.VirtualMachineInstanceView;
import java.util.ArrayList;
import com.microsoft.azure.management.compute.v2017_12_01.VirtualMachineExtension;

class VirtualMachineScaleSetVMImpl extends CreatableUpdatableImpl<VirtualMachineScaleSetVM, VirtualMachineScaleSetVMInner, VirtualMachineScaleSetVMImpl> implements VirtualMachineScaleSetVM, VirtualMachineScaleSetVM.Update {
    private final ComputeManager manager;
    private String resourceGroupName;
    private String vmScaleSetName;
    private String instanceId;

    VirtualMachineScaleSetVMImpl(String name, ComputeManager manager) {
        super(name, new VirtualMachineScaleSetVMInner());
        this.manager = manager;
        // Set resource name
        this.instanceId = name;
        //
    }

    VirtualMachineScaleSetVMImpl(VirtualMachineScaleSetVMInner inner, ComputeManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.instanceId = inner.name();
        // resource ancestor names
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.vmScaleSetName = IdParsingUtils.getValueFromIdByName(inner.id(), "virtualMachineScaleSets");
        this.instanceId = IdParsingUtils.getValueFromIdByName(inner.id(), "virtualmachines");
        //
    }

    @Override
    public ComputeManager manager() {
        return this.manager;
    }

    @Override
    public Observable<VirtualMachineScaleSetVM> createResourceAsync() {
        VirtualMachineScaleSetVMsInner client = this.manager().inner().virtualMachineScaleSetVMs();
        return null; // NOP createResourceAsync implementation as create is not supported
    }

    @Override
    public Observable<VirtualMachineScaleSetVM> updateResourceAsync() {
        VirtualMachineScaleSetVMsInner client = this.manager().inner().virtualMachineScaleSetVMs();
        return client.updateAsync(this.resourceGroupName, this.vmScaleSetName, this.instanceId, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<VirtualMachineScaleSetVMInner> getInnerAsync() {
        VirtualMachineScaleSetVMsInner client = this.manager().inner().virtualMachineScaleSetVMs();
        return client.getAsync(this.resourceGroupName, this.vmScaleSetName, this.instanceId);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public SubResource availabilitySet() {
        return this.inner().availabilitySet();
    }

    @Override
    public DiagnosticsProfile diagnosticsProfile() {
        return this.inner().diagnosticsProfile();
    }

    @Override
    public HardwareProfile hardwareProfile() {
        return this.inner().hardwareProfile();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String instanceId() {
        return this.inner().instanceId();
    }

    @Override
    public VirtualMachineInstanceView instanceView() {
        VirtualMachineInstanceViewInner inner = this.inner().instanceView();
        if (inner != null) {
            return  new VirtualMachineInstanceViewImpl(inner, manager());
        } else {
            return null;
        }
    }

    @Override
    public Boolean latestModelApplied() {
        return this.inner().latestModelApplied();
    }

    @Override
    public String licenseType() {
        return this.inner().licenseType();
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
    public NetworkProfile networkProfile() {
        return this.inner().networkProfile();
    }

    @Override
    public OSProfile osProfile() {
        return this.inner().osProfile();
    }

    @Override
    public Plan plan() {
        return this.inner().plan();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public List<VirtualMachineExtension> resources() {
        List<VirtualMachineExtension> lst = new ArrayList<VirtualMachineExtension>();
        if (this.inner().resources() != null) {
            for (VirtualMachineExtensionInner inner : this.inner().resources()) {
                lst.add( new VirtualMachineExtensionImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public Sku sku() {
        return this.inner().sku();
    }

    @Override
    public StorageProfile storageProfile() {
        return this.inner().storageProfile();
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
    public String vmId() {
        return this.inner().vmId();
    }

    @Override
    public VirtualMachineScaleSetVMImpl withAvailabilitySet(SubResource availabilitySet) {
        this.inner().withAvailabilitySet(availabilitySet);
        return this;
    }

    @Override
    public VirtualMachineScaleSetVMImpl withDiagnosticsProfile(DiagnosticsProfile diagnosticsProfile) {
        this.inner().withDiagnosticsProfile(diagnosticsProfile);
        return this;
    }

    @Override
    public VirtualMachineScaleSetVMImpl withHardwareProfile(HardwareProfile hardwareProfile) {
        this.inner().withHardwareProfile(hardwareProfile);
        return this;
    }

    @Override
    public VirtualMachineScaleSetVMImpl withLicenseType(String licenseType) {
        this.inner().withLicenseType(licenseType);
        return this;
    }

    @Override
    public VirtualMachineScaleSetVMImpl withNetworkProfile(NetworkProfile networkProfile) {
        this.inner().withNetworkProfile(networkProfile);
        return this;
    }

    @Override
    public VirtualMachineScaleSetVMImpl withOsProfile(OSProfile osProfile) {
        this.inner().withOsProfile(osProfile);
        return this;
    }

    @Override
    public VirtualMachineScaleSetVMImpl withPlan(Plan plan) {
        this.inner().withPlan(plan);
        return this;
    }

    @Override
    public VirtualMachineScaleSetVMImpl withStorageProfile(StorageProfile storageProfile) {
        this.inner().withStorageProfile(storageProfile);
        return this;
    }

    @Override
    public VirtualMachineScaleSetVMImpl withTags(Map<String, String> tags) {
        this.inner().withTags(tags);
        return this;
    }

}
