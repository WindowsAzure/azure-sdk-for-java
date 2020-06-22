// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.inner;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The VirtualMachineScaleSetVMListResult model. */
@Fluent
public final class VirtualMachineScaleSetVMListResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualMachineScaleSetVMListResultInner.class);

    /*
     * The list of virtual machine scale sets VMs.
     */
    @JsonProperty(value = "value", required = true)
    private List<VirtualMachineScaleSetVMInner> value;

    /*
     * The uri to fetch the next page of Virtual Machine Scale Set VMs. Call
     * ListNext() with this to fetch the next page of VMSS VMs
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The list of virtual machine scale sets VMs.
     *
     * @return the value value.
     */
    public List<VirtualMachineScaleSetVMInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of virtual machine scale sets VMs.
     *
     * @param value the value value to set.
     * @return the VirtualMachineScaleSetVMListResultInner object itself.
     */
    public VirtualMachineScaleSetVMListResultInner withValue(List<VirtualMachineScaleSetVMInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The uri to fetch the next page of Virtual Machine Scale Set VMs. Call ListNext() with
     * this to fetch the next page of VMSS VMs.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The uri to fetch the next page of Virtual Machine Scale Set VMs. Call ListNext() with
     * this to fetch the next page of VMSS VMs.
     *
     * @param nextLink the nextLink value to set.
     * @return the VirtualMachineScaleSetVMListResultInner object itself.
     */
    public VirtualMachineScaleSetVMListResultInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property value in model VirtualMachineScaleSetVMListResultInner"));
        } else {
            value().forEach(e -> e.validate());
        }
    }
}
