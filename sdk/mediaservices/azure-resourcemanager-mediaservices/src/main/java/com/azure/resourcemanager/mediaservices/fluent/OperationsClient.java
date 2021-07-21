// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mediaservices.fluent.models.OperationCollectionInner;

/** An instance of this class provides access to all the operations defined in OperationsClient. */
public interface OperationsClient {
    /**
     * Lists all the Media Services operations.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of Operation items.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OperationCollectionInner list();

    /**
     * Lists all the Media Services operations.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of Operation items.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<OperationCollectionInner> listWithResponse(Context context);
}
