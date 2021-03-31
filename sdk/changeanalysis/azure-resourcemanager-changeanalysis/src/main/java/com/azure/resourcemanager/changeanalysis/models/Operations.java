// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.changeanalysis.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/** Resource collection API of Operations. */
public interface Operations {
    /**
     * Lists all the supported operations by the Microsoft.ChangeAnalysis resource provider along with their
     * descriptions.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the resource provider operation list.
     */
    PagedIterable<ResourceProviderOperationDefinition> list();

    /**
     * Lists all the supported operations by the Microsoft.ChangeAnalysis resource provider along with their
     * descriptions.
     *
     * @param skipToken A skip token is used to continue retrieving items after an operation returns a partial result.
     *     If a previous response contains a nextLink element, the value of the nextLink element will include a
     *     skipToken parameter that specifies a starting point to use for subsequent calls.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the resource provider operation list.
     */
    PagedIterable<ResourceProviderOperationDefinition> list(String skipToken, Context context);
}
