// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The VirtualMachineScaleSetVMInstanceRequiredIDs model.
 */
@Fluent
public final class VirtualMachineScaleSetVMInstanceRequiredIDs {
    /*
     * The virtual machine scale set instance ids.
     */
    @JsonProperty(value = "instanceIds", required = true)
    private List<String> instanceIds;

    /**
     * Get the instanceIds property: The virtual machine scale set instance
     * ids.
     * 
     * @return the instanceIds value.
     */
    public List<String> instanceIds() {
        return this.instanceIds;
    }

    /**
     * Set the instanceIds property: The virtual machine scale set instance
     * ids.
     * 
     * @param instanceIds the instanceIds value to set.
     * @return the VirtualMachineScaleSetVMInstanceRequiredIDs object itself.
     */
    public VirtualMachineScaleSetVMInstanceRequiredIDs withInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
}
