/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation.ApiManagementManager;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation.ResourceSkuResultInner;

/**
 * Type representing ResourceSkuResult.
 */
public interface ResourceSkuResult extends HasInner<ResourceSkuResultInner>, HasManager<ApiManagementManager> {
    /**
     * @return the capacity value.
     */
    ResourceSkuCapacity capacity();

    /**
     * @return the resourceType value.
     */
    String resourceType();

    /**
     * @return the sku value.
     */
    ResourceSku sku();

}
