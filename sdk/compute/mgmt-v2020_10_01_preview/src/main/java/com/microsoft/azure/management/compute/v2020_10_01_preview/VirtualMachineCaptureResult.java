/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.compute.v2020_10_01_preview.implementation.ComputeManager;
import com.microsoft.azure.management.compute.v2020_10_01_preview.implementation.VirtualMachineCaptureResultInner;
import java.util.List;

/**
 * Type representing VirtualMachineCaptureResult.
 */
public interface VirtualMachineCaptureResult extends HasInner<VirtualMachineCaptureResultInner>, HasManager<ComputeManager> {
    /**
     * @return the contentVersion value.
     */
    String contentVersion();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the parameters value.
     */
    Object parameters();

    /**
     * @return the resources value.
     */
    List<Object> resources();

    /**
     * @return the schema value.
     */
    String schema();

}
