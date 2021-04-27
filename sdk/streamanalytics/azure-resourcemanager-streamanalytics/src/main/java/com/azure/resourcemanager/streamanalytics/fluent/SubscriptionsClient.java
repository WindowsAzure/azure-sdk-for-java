// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.streamanalytics.fluent.models.SubscriptionQuotasListResultInner;

/** An instance of this class provides access to all the operations defined in SubscriptionsClient. */
public interface SubscriptionsClient {
    /**
     * Retrieves the subscription's current quota information in a particular region.
     *
     * @param location The region in which to retrieve the subscription's quota information. You can find out which
     *     regions Azure Stream Analytics is supported in here: https://azure.microsoft.com/en-us/regions/.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the GetQuotas operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SubscriptionQuotasListResultInner listQuotas(String location);

    /**
     * Retrieves the subscription's current quota information in a particular region.
     *
     * @param location The region in which to retrieve the subscription's quota information. You can find out which
     *     regions Azure Stream Analytics is supported in here: https://azure.microsoft.com/en-us/regions/.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the GetQuotas operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SubscriptionQuotasListResultInner> listQuotasWithResponse(String location, Context context);
}
