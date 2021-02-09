/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_12_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.compute.v2020_12_01.implementation.ComputeManager;
import com.microsoft.azure.management.compute.v2020_12_01.implementation.VirtualMachineScaleSetVMExtensionsListResultInner;
import com.microsoft.azure.management.compute.v2020_12_01.implementation.VirtualMachineScaleSetVMExtensionInner;
import java.util.List;

/**
 * Type representing VirtualMachineScaleSetVMExtensionsListResult.
 */
public interface VirtualMachineScaleSetVMExtensionsListResult extends HasInner<VirtualMachineScaleSetVMExtensionsListResultInner>, HasManager<ComputeManager> {
    /**
     * @return the value value.
     */
    List<VirtualMachineScaleSetVMExtensionInner> value();

}
