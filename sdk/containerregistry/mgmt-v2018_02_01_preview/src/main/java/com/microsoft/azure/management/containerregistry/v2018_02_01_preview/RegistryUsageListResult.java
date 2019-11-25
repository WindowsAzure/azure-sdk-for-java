/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2018_02_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.containerregistry.v2018_02_01_preview.implementation.ContainerRegistryManager;
import com.microsoft.azure.management.containerregistry.v2018_02_01_preview.implementation.RegistryUsageListResultInner;
import java.util.List;

/**
 * Type representing RegistryUsageListResult.
 */
public interface RegistryUsageListResult extends HasInner<RegistryUsageListResultInner>, HasManager<ContainerRegistryManager> {
    /**
     * @return the value value.
     */
    List<RegistryUsage> value();

}
