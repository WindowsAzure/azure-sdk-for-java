// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.servicebus.fluent.models.PremiumMessagingRegionInner;

/** An instance of this class provides access to all the operations defined in PremiumMessagingRegionsClient. */
public interface PremiumMessagingRegionsClient {
    /**
     * Gets the available premium messaging regions for servicebus.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the available premium messaging regions for servicebus.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<PremiumMessagingRegionInner> listAsync();

    /**
     * Gets the available premium messaging regions for servicebus.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the available premium messaging regions for servicebus.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PremiumMessagingRegionInner> list();

    /**
     * Gets the available premium messaging regions for servicebus.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the available premium messaging regions for servicebus.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PremiumMessagingRegionInner> list(Context context);
}
