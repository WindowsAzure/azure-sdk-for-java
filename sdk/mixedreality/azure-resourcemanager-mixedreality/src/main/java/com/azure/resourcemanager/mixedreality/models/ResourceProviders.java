// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mixedreality.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ResourceProviders. */
public interface ResourceProviders {
    /**
     * Check Name Availability for local uniqueness.
     *
     * @param location The location in which uniqueness will be verified.
     * @param checkNameAvailability Check Name Availability Request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return check Name Availability Response.
     */
    CheckNameAvailabilityResponse checkNameAvailabilityLocal(
        String location, CheckNameAvailabilityRequest checkNameAvailability);

    /**
     * Check Name Availability for local uniqueness.
     *
     * @param location The location in which uniqueness will be verified.
     * @param checkNameAvailability Check Name Availability Request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return check Name Availability Response.
     */
    Response<CheckNameAvailabilityResponse> checkNameAvailabilityLocalWithResponse(
        String location, CheckNameAvailabilityRequest checkNameAvailability, Context context);
}
