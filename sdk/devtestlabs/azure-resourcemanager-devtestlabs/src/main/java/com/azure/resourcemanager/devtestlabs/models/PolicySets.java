// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of PolicySets. */
public interface PolicySets {
    /**
     * Evaluates lab policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the policy set.
     * @param evaluatePoliciesRequest Request body for evaluating a policy set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response body for evaluating a policy set.
     */
    EvaluatePoliciesResponse evaluatePolicies(
        String resourceGroupName, String labName, String name, EvaluatePoliciesRequest evaluatePoliciesRequest);

    /**
     * Evaluates lab policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the policy set.
     * @param evaluatePoliciesRequest Request body for evaluating a policy set.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response body for evaluating a policy set.
     */
    Response<EvaluatePoliciesResponse> evaluatePoliciesWithResponse(
        String resourceGroupName,
        String labName,
        String name,
        EvaluatePoliciesRequest evaluatePoliciesRequest,
        Context context);
}
