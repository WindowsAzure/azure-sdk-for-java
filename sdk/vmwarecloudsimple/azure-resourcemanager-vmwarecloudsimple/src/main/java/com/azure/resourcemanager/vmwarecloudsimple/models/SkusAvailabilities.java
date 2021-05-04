// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/** Resource collection API of SkusAvailabilities. */
public interface SkusAvailabilities {
    /**
     * Returns list of available resources in region.
     *
     * @param regionId The region Id (westus, eastus).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of SKU availabilities.
     */
    PagedIterable<SkuAvailability> list(String regionId);

    /**
     * Returns list of available resources in region.
     *
     * @param regionId The region Id (westus, eastus).
     * @param skuId sku id, if no sku is passed availability for all skus will be returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of SKU availabilities.
     */
    PagedIterable<SkuAvailability> list(String regionId, String skuId, Context context);
}
