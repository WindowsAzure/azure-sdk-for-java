// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appplatform.models.ResourceSku;

/** An instance of this class provides access to all the operations defined in SkusClient. */
public interface SkusClient {
    /**
     * Lists all of the available skus of the Microsoft.AppPlatform provider.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that includes an array of Azure Spring Cloud SKU and a possible link for next set.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ResourceSku> listAsync();

    /**
     * Lists all of the available skus of the Microsoft.AppPlatform provider.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that includes an array of Azure Spring Cloud SKU and a possible link for next set.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ResourceSku> list();

    /**
     * Lists all of the available skus of the Microsoft.AppPlatform provider.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that includes an array of Azure Spring Cloud SKU and a possible link for next set.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ResourceSku> list(Context context);
}
