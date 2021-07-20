// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.fluidrelay.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.fluidrelay.fluent.models.OperationResultInner;

/** An instance of this class provides access to all the operations defined in FluidRelayOperationsClient. */
public interface FluidRelayOperationsClient {
    /**
     * List all operations provided by Microsoft.FluidRelay.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of GET request to list FluidRelay operations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<OperationResultInner> list();

    /**
     * List all operations provided by Microsoft.FluidRelay.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of GET request to list FluidRelay operations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<OperationResultInner> list(Context context);
}
