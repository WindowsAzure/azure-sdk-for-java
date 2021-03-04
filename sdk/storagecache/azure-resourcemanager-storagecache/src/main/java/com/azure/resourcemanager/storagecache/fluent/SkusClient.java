// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.storagecache.fluent.models.ResourceSkuInner;

/** An instance of this class provides access to all the operations defined in SkusClient. */
public interface SkusClient {
    /**
     * Get the list of StorageCache.Cache SKUs available to this subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of StorageCache.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ResourceSkuInner> list();

    /**
     * Get the list of StorageCache.Cache SKUs available to this subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of StorageCache.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ResourceSkuInner> list(Context context);
}
