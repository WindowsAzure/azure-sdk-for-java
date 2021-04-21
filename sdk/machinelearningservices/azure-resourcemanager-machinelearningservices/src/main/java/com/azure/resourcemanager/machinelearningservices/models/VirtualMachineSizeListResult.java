// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.resourcemanager.machinelearningservices.fluent.models.VirtualMachineSizeListResultInner;
import java.util.List;

/** An immutable client-side representation of VirtualMachineSizeListResult. */
public interface VirtualMachineSizeListResult {
    /**
     * Gets the amlCompute property: The list of virtual machine sizes supported by AmlCompute.
     *
     * @return the amlCompute value.
     */
    List<VirtualMachineSize> amlCompute();

    /**
     * Gets the inner com.azure.resourcemanager.machinelearningservices.fluent.models.VirtualMachineSizeListResultInner
     * object.
     *
     * @return the inner object.
     */
    VirtualMachineSizeListResultInner innerModel();
}
