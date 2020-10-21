/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_07_01.implementation;

import com.microsoft.azure.management.compute.v2019_07_01.VirtualMachineScaleSetInstanceViewStatusesSummary;
import java.util.List;
import com.microsoft.azure.management.compute.v2019_07_01.VirtualMachineScaleSetVMExtensionsSummary;
import com.microsoft.azure.management.compute.v2019_07_01.InstanceViewStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The instance view of a virtual machine scale set.
 */
public class VirtualMachineScaleSetInstanceViewInner {
    /**
     * The instance view status summary for the virtual machine scale set.
     */
    @JsonProperty(value = "virtualMachine", access = JsonProperty.Access.WRITE_ONLY)
    private VirtualMachineScaleSetInstanceViewStatusesSummary virtualMachine;

    /**
     * The extensions information.
     */
    @JsonProperty(value = "extensions", access = JsonProperty.Access.WRITE_ONLY)
    private List<VirtualMachineScaleSetVMExtensionsSummary> extensions;

    /**
     * The resource status information.
     */
    @JsonProperty(value = "statuses")
    private List<InstanceViewStatus> statuses;

    /**
     * Get the instance view status summary for the virtual machine scale set.
     *
     * @return the virtualMachine value
     */
    public VirtualMachineScaleSetInstanceViewStatusesSummary virtualMachine() {
        return this.virtualMachine;
    }

    /**
     * Get the extensions information.
     *
     * @return the extensions value
     */
    public List<VirtualMachineScaleSetVMExtensionsSummary> extensions() {
        return this.extensions;
    }

    /**
     * Get the resource status information.
     *
     * @return the statuses value
     */
    public List<InstanceViewStatus> statuses() {
        return this.statuses;
    }

    /**
     * Set the resource status information.
     *
     * @param statuses the statuses value to set
     * @return the VirtualMachineScaleSetInstanceViewInner object itself.
     */
    public VirtualMachineScaleSetInstanceViewInner withStatuses(List<InstanceViewStatus> statuses) {
        this.statuses = statuses;
        return this;
    }

}
