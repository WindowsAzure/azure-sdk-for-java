// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.AadPropertiesResourceInner;

/** An instance of this class provides access to all the operations defined in AadPropertiesOperationsClient. */
public interface AadPropertiesOperationsClient {
    /**
     * Fetches the AAD properties from target region BCM stamp.
     *
     * @param azureRegion Azure region to hit Api.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AadPropertiesResourceInner get(String azureRegion);

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
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AadPropertiesResourceInner> getWithResponse(String azureRegion, String filter, Context context);
}
