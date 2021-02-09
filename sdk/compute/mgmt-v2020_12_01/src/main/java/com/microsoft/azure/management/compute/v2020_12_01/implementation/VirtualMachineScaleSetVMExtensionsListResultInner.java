/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_12_01.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The List VMSS VM Extension operation response.
 */
public class VirtualMachineScaleSetVMExtensionsListResultInner {
    /**
     * The list of VMSS VM extensions.
     */
    @JsonProperty(value = "value")
    private List<VirtualMachineScaleSetVMExtensionInner> value;

    /**
     * Get the list of VMSS VM extensions.
     *
     * @return the value value
     */
    public List<VirtualMachineScaleSetVMExtensionInner> value() {
        return this.value;
    }

    /**
     * Set the list of VMSS VM extensions.
     *
     * @param value the value value to set
     * @return the VirtualMachineScaleSetVMExtensionsListResultInner object itself.
     */
    public VirtualMachineScaleSetVMExtensionsListResultInner withValue(List<VirtualMachineScaleSetVMExtensionInner> value) {
        this.value = value;
        return this;
    }

}
