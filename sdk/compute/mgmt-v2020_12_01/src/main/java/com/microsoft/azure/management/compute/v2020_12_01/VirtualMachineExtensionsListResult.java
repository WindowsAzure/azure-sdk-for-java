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
import com.microsoft.azure.management.compute.v2020_12_01.implementation.VirtualMachineExtensionsListResultInner;
import com.microsoft.azure.management.compute.v2020_12_01.implementation.VirtualMachineExtensionInner;
import java.util.List;

/**
 * Type representing VirtualMachineExtensionsListResult.
 */
public interface VirtualMachineExtensionsListResult extends HasInner<VirtualMachineExtensionsListResultInner>, HasManager<ComputeManager> {
    /**
     * @return the value value.
     */
    List<VirtualMachineExtensionInner> value();

}
