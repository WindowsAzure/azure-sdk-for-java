// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ResourceProviders. */
public interface ResourceProviders {
    /**
     * Checks if the peering service provider is present within 1000 miles of customer's location.
     *
     * @param checkServiceProviderAvailabilityInput The CheckServiceProviderAvailabilityInput indicating customer
     *     location and service provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Enum0 checkServiceProviderAvailability(CheckServiceProviderAvailabilityInput checkServiceProviderAvailabilityInput);

    /**
     * Checks if the peering service provider is present within 1000 miles of customer's location.
     *
     * @param checkServiceProviderAvailabilityInput The CheckServiceProviderAvailabilityInput indicating customer
     *     location and service provider.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Enum0> checkServiceProviderAvailabilityWithResponse(
        CheckServiceProviderAvailabilityInput checkServiceProviderAvailabilityInput, Context context);
}
