// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.containerinstance.models.Operation;

/** An instance of this class provides access to all the operations defined in OperationsClient. */
public interface OperationsClient {
    /**
     * List the operations for Azure Container Instance service.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the operation list response that contains all operations for Azure Container Instance service.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<Operation> listAsync();

    /**
     * List the operations for Azure Container Instance service.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the operation list response that contains all operations for Azure Container Instance service.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<Operation> list();

    /**
     * List the operations for Azure Container Instance service.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the operation list response that contains all operations for Azure Container Instance service.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<Operation> list(Context context);
}
