// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.security.fluent.models.PricingInner;
import com.azure.resourcemanager.security.fluent.models.PricingListInner;

/** An instance of this class provides access to all the operations defined in PricingsClient. */
public interface PricingsClient {
    /**
     * Lists Security Center pricing configurations in the subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of pricing configurations response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PricingListInner list();

    /**
     * Lists Security Center pricing configurations in the subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of pricing configurations response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PricingListInner> listWithResponse(Context context);

    /**
     * Gets a provided Security Center pricing configuration in the subscription.
     *
     * @param pricingName name of the pricing configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a provided Security Center pricing configuration in the subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PricingInner get(String pricingName);

    /**
     * Gets a provided Security Center pricing configuration in the subscription.
     *
     * @param pricingName name of the pricing configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a provided Security Center pricing configuration in the subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PricingInner> getWithResponse(String pricingName, Context context);

    /**
     * Updates a provided Security Center pricing configuration in the subscription.
     *
     * @param pricingName name of the pricing configuration.
     * @param pricing Pricing object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return azure Security Center is provided in two pricing tiers: free and standard, with the standard tier
     *     available with a trial period.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PricingInner update(String pricingName, PricingInner pricing);

    /**
     * Updates a provided Security Center pricing configuration in the subscription.
     *
     * @param pricingName name of the pricing configuration.
     * @param pricing Pricing object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return azure Security Center is provided in two pricing tiers: free and standard, with the standard tier
     *     available with a trial period.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PricingInner> updateWithResponse(String pricingName, PricingInner pricing, Context context);
}
