// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/** Resource collection API of Forecasts. */
public interface Forecasts {
    /**
     * Lists the forecast charges for scope defined. Please note that this API is no longer actively under development.
     * We recommend using our new Forecast API moving forward:
     * https://docs.microsoft.com/en-us/rest/api/cost-management/forecast/usage.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing forecasts.
     */
    PagedIterable<Forecast> list();

    /**
     * Lists the forecast charges for scope defined. Please note that this API is no longer actively under development.
     * We recommend using our new Forecast API moving forward:
     * https://docs.microsoft.com/en-us/rest/api/cost-management/forecast/usage.
     *
     * @param filter May be used to filter forecasts by properties/usageDate (Utc time), properties/chargeType or
     *     properties/grain. The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support
     *     'ne', 'or', or 'not'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing forecasts.
     */
    PagedIterable<Forecast> list(String filter, Context context);
}
