/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_03_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The protection policy of a virtual machine scale set VM.
 */
public class VirtualMachineScaleSetVMProtectionPolicy {
    /**
     * Indicates that the virtual machine scale set VM shouldn't be considered
     * for deletion during a scale-in operation.
     */
    @JsonProperty(value = "protectFromScaleIn")
    private Boolean protectFromScaleIn;

    /**
     * Indicates that model updates or actions (including scale-in) initiated
     * on the virtual machine scale set should not be applied to the virtual
     * machine scale set VM.
     */
    @JsonProperty(value = "protectFromScaleSetActions")
    private Boolean protectFromScaleSetActions;

    /**
     * Get indicates that the virtual machine scale set VM shouldn't be considered for deletion during a scale-in operation.
     *
     * @return the protectFromScaleIn value
     */
    public Boolean protectFromScaleIn() {
        return this.protectFromScaleIn;
    }

    /**
     * Set indicates that the virtual machine scale set VM shouldn't be considered for deletion during a scale-in operation.
     *
     * @param protectFromScaleIn the protectFromScaleIn value to set
     * @return the VirtualMachineScaleSetVMProtectionPolicy object itself.
     */
    public VirtualMachineScaleSetVMProtectionPolicy withProtectFromScaleIn(Boolean protectFromScaleIn) {
        this.protectFromScaleIn = protectFromScaleIn;
        return this;
    }

    /**
     * Get indicates that model updates or actions (including scale-in) initiated on the virtual machine scale set should not be applied to the virtual machine scale set VM.
     *
     * @return the protectFromScaleSetActions value
     */
    public Boolean protectFromScaleSetActions() {
        return this.protectFromScaleSetActions;
    }

    /**
     * Set indicates that model updates or actions (including scale-in) initiated on the virtual machine scale set should not be applied to the virtual machine scale set VM.
     *
     * @param protectFromScaleSetActions the protectFromScaleSetActions value to set
     * @return the VirtualMachineScaleSetVMProtectionPolicy object itself.
     */
    public VirtualMachineScaleSetVMProtectionPolicy withProtectFromScaleSetActions(Boolean protectFromScaleSetActions) {
        this.protectFromScaleSetActions = protectFromScaleSetActions;
        return this;
    }

}
