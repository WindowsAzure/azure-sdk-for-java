// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.labservices.fluent.models.OperationMetadataInner;

/** An instance of this class provides access to all the operations defined in ProviderOperationsClient. */
public interface ProviderOperationsClient {
    /**
     * Result of the request to list REST API operations.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list REST API operations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<OperationMetadataInner> list();

    /**
     * Result of the request to list REST API operations.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list REST API operations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<OperationMetadataInner> list(Context context);
}
