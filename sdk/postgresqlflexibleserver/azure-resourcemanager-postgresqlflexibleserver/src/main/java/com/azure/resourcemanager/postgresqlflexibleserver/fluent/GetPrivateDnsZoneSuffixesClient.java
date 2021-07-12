// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** An instance of this class provides access to all the operations defined in GetPrivateDnsZoneSuffixesClient. */
public interface GetPrivateDnsZoneSuffixesClient {
    /**
     * Get private DNS zone suffix in the cloud.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private DNS zone suffix in the cloud.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    String execute();

    /**
     * Get private DNS zone suffix in the cloud.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private DNS zone suffix in the cloud.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<String> executeWithResponse(Context context);
}
