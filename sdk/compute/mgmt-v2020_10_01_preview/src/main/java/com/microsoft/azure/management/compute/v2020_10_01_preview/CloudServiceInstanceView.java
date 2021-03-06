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
import com.microsoft.azure.management.compute.v2020_10_01_preview.implementation.CloudServiceInstanceViewInner;
import java.util.List;

/**
 * Type representing CloudServiceInstanceView.
 */
public interface CloudServiceInstanceView extends HasInner<CloudServiceInstanceViewInner>, HasManager<ComputeManager> {
    /**
     * @return the roleInstance value.
     */
    InstanceViewStatusesSummary roleInstance();

    /**
     * @return the sdkVersion value.
     */
    String sdkVersion();

    /**
     * @return the statuses value.
     */
    List<ResourceInstanceViewStatus> statuses();

}
