/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_03_30.implementation;

import com.microsoft.azure.management.compute.v2017_03_30.VirtualMachineScaleSetVM;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.compute.v2017_03_30.DiagnosticsProfile;
import com.microsoft.azure.management.compute.v2017_03_30.HardwareProfile;
import com.microsoft.azure.management.compute.v2017_03_30.VirtualMachineScaleSetVMInstanceView;
import com.microsoft.azure.management.compute.v2017_03_30.NetworkProfile;
import com.microsoft.azure.management.compute.v2017_03_30.OSProfile;
import com.microsoft.azure.management.compute.v2017_03_30.Plan;
import java.util.ArrayList;
import com.microsoft.azure.management.compute.v2017_03_30.VirtualMachineExtension;
import java.util.List;
import com.microsoft.azure.management.compute.v2017_03_30.Sku;
import com.microsoft.azure.management.compute.v2017_03_30.StorageProfile;
import java.util.Map;

class VirtualMachineScaleSetVMImpl extends IndexableRefreshableWrapperImpl<VirtualMachineScaleSetVM, VirtualMachineScaleSetVMInner> implements VirtualMachineScaleSetVM {
    private final ComputeManager manager;
    private String resourceGroupName;
    private String vmScaleSetName;
    private String instanceId;

    VirtualMachineScaleSetVMImpl(VirtualMachineScaleSetVMInner inner,  ComputeManager manager) {
        super(null, inner);
        this.manager = manager;
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.vmScaleSetName = IdParsingUtils.getValueFromIdByName(inner.id(), "virtualMachineScaleSets");
        this.instanceId = IdParsingUtils.getValueFromIdByName(inner.id(), "virtualmachines");
    }

    @Override
    public ComputeManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<VirtualMachineScaleSetVMInner> getInnerAsync() {
        VirtualMachineScaleSetVMsInner client = this.manager().inner().virtualMachineScaleSetVMs();
        return client.getAsync(this.resourceGroupName, this.vmScaleSetName, this.instanceId);
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
    public VirtualMachineScaleSetVMInstanceView instanceView() {
        VirtualMachineScaleSetVMInstanceViewInner inner = this.inner().instanceView();
        if (inner != null) {
            return  new VirtualMachineScaleSetVMInstanceViewImpl(inner, manager());
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

}
