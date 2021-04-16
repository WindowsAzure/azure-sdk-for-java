// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcegraph.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.resourcegraph.fluent.models.OperationInner;

/** An instance of this class provides access to all the operations defined in OperationsClient. */
public interface OperationsClient {
    /**
     * Lists all of the available REST API operations.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list Resource Graph operations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<OperationInner> list();

    /**
     * Lists all of the available REST API operations.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list Resource Graph operations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<OperationInner> list(Context context);
}
