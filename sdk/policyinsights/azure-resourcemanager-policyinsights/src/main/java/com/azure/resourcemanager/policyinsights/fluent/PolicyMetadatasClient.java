// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.policyinsights.fluent.models.PolicyMetadataInner;
import com.azure.resourcemanager.policyinsights.fluent.models.SlimPolicyMetadataInner;

/** An instance of this class provides access to all the operations defined in PolicyMetadatasClient. */
public interface PolicyMetadatasClient {
    /**
     * Get policy metadata resource.
     *
     * @param resourceName The name of the policy metadata resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return policy metadata resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PolicyMetadataInner getResource(String resourceName);

    /**
     * Get policy metadata resource.
     *
     * @param resourceName The name of the policy metadata resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return policy metadata resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PolicyMetadataInner> getResourceWithResponse(String resourceName, Context context);

    /**
     * Get a list of the policy metadata resources.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of the policy metadata resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SlimPolicyMetadataInner> list();

    /**
     * Get a list of the policy metadata resources.
     *
     * @param top Maximum number of records to return.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of the policy metadata resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SlimPolicyMetadataInner> list(Integer top, Context context);
}
