// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.resourcemanager.compute.generated.ComputeManager;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineSizeInner;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineSize;

public final class VirtualMachineSizeImpl implements VirtualMachineSize {
    private VirtualMachineSizeInner innerObject;

    private final ComputeManager serviceManager;

    public VirtualMachineSizeImpl(VirtualMachineSizeInner innerObject, ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public Integer numberOfCores() {
        return this.innerModel().numberOfCores();
    }

    public Integer osDiskSizeInMB() {
        return this.innerModel().osDiskSizeInMB();
    }

    public Integer resourceDiskSizeInMB() {
        return this.innerModel().resourceDiskSizeInMB();
    }

    public Integer memoryInMB() {
        return this.innerModel().memoryInMB();
    }

    public Integer maxDataDiskCount() {
        return this.innerModel().maxDataDiskCount();
    }

    public VirtualMachineSizeInner innerModel() {
        return this.innerObject;
    }

    private ComputeManager manager() {
        return this.serviceManager;
    }
}
