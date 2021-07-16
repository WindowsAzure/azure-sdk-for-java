// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.hybridnetwork.fluent.models.NetworkFunctionVendorInner;

/** An instance of this class provides access to all the operations defined in NetworkFunctionVendorsClient. */
public interface NetworkFunctionVendorsClient {
    /**
     * Lists all the available vendor and sku information.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the network function vendor list result.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NetworkFunctionVendorInner> list();

    /**
     * Lists all the available vendor and sku information.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the network function vendor list result.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NetworkFunctionVendorInner> list(Context context);
}
