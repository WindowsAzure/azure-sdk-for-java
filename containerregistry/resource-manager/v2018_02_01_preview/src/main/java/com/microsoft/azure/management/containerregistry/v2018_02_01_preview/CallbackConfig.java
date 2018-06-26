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
import com.microsoft.azure.management.containerregistry.v2018_02_01_preview.implementation.CallbackConfigInner;
import java.util.Map;

/**
 * Type representing CallbackConfig.
 */
public interface CallbackConfig extends HasInner<CallbackConfigInner>, HasManager<ContainerRegistryManager> {
    /**
     * @return the customHeaders value.
     */
    Map<String, String> customHeaders();

    /**
     * @return the serviceUri value.
     */
    String serviceUri();

}
