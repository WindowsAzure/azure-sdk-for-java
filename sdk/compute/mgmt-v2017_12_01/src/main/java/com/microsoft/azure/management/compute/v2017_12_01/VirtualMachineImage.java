/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_12_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.compute.v2017_12_01.implementation.VirtualMachineImageInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.compute.v2017_12_01.implementation.ComputeManager;
import java.util.List;
import java.util.Map;

/**
 * Type representing VirtualMachineImage.
 */
public interface VirtualMachineImage extends HasInner<VirtualMachineImageInner>, Indexable, Refreshable<VirtualMachineImage>, HasManager<ComputeManager> {
    /**
     * @return the dataDiskImages value.
     */
    List<DataDiskImage> dataDiskImages();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the osDiskImage value.
     */
    OSDiskImage osDiskImage();

    /**
     * @return the plan value.
     */
    PurchasePlan plan();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

}
