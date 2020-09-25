/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_06_01.implementation;

import com.microsoft.azure.management.compute.v2020_06_01.VirtualMachineScaleSetInstanceView;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.compute.v2020_06_01.VirtualMachineScaleSetVMExtensionsSummary;
import com.microsoft.azure.management.compute.v2020_06_01.OrchestrationServiceSummary;
import com.microsoft.azure.management.compute.v2020_06_01.InstanceViewStatus;
import com.microsoft.azure.management.compute.v2020_06_01.VirtualMachineScaleSetInstanceViewStatusesSummary;

class VirtualMachineScaleSetInstanceViewImpl extends WrapperImpl<VirtualMachineScaleSetInstanceViewInner> implements VirtualMachineScaleSetInstanceView {
    private final ComputeManager manager;
    VirtualMachineScaleSetInstanceViewImpl(VirtualMachineScaleSetInstanceViewInner inner, ComputeManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ComputeManager manager() {
        return this.manager;
    }

    @Override
    public List<VirtualMachineScaleSetVMExtensionsSummary> extensions() {
        return this.inner().extensions();
    }

    @Override
    public List<OrchestrationServiceSummary> orchestrationServices() {
        return this.inner().orchestrationServices();
    }

    @Override
    public List<InstanceViewStatus> statuses() {
        return this.inner().statuses();
    }

    @Override
    public VirtualMachineScaleSetInstanceViewStatusesSummary virtualMachine() {
        return this.inner().virtualMachine();
    }

}
