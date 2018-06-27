/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2016_06_27_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.containerregistry.v2016_06_27_preview.implementation.ContainerRegistryManager;
import com.microsoft.azure.management.containerregistry.v2016_06_27_preview.implementation.RegistryNameStatusInner;

/**
 * Type representing RegistryNameStatus.
 */
public interface RegistryNameStatus extends HasInner<RegistryNameStatusInner>, HasManager<ContainerRegistryManager> {
    /**
     * @return the message value.
     */
    String message();

    /**
     * @return the nameAvailable value.
     */
    Boolean nameAvailable();

    /**
     * @return the reason value.
     */
    String reason();

}
