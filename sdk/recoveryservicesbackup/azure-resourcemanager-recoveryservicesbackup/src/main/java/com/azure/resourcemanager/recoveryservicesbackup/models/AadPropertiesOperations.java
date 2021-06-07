// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of AadPropertiesOperations. */
public interface AadPropertiesOperations {
    /**
     * Fetches the AAD properties from target region BCM stamp.
     *
     * @param azureRegion Azure region to hit Api.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    AadPropertiesResource get(String azureRegion);

    /**
     * Fetches the AAD properties from target region BCM stamp.
     *
     * @param azureRegion Azure region to hit Api.
     * @param filter OData filter options.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<AadPropertiesResource> getWithResponse(String azureRegion, String filter, Context context);
}
