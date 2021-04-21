// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.policyinsights.fluent.models.CheckRestrictionsResultInner;
import com.azure.resourcemanager.policyinsights.models.CheckRestrictionsRequest;

/** An instance of this class provides access to all the operations defined in PolicyRestrictionsClient. */
public interface PolicyRestrictionsClient {
    /**
     * Checks what restrictions Azure Policy will place on a resource within a subscription.
     *
     * @param parameters The check policy restrictions parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a check policy restrictions evaluation on a resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CheckRestrictionsResultInner checkAtSubscriptionScope(CheckRestrictionsRequest parameters);

    /**
     * Checks what restrictions Azure Policy will place on a resource within a subscription.
     *
     * @param parameters The check policy restrictions parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a check policy restrictions evaluation on a resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CheckRestrictionsResultInner> checkAtSubscriptionScopeWithResponse(
        CheckRestrictionsRequest parameters, Context context);

    /**
     * Checks what restrictions Azure Policy will place on a resource within a resource group. Use this when the
     * resource group the resource will be created in is already known.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param parameters The check policy restrictions parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a check policy restrictions evaluation on a resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CheckRestrictionsResultInner checkAtResourceGroupScope(
        String resourceGroupName, CheckRestrictionsRequest parameters);

    /**
     * Checks what restrictions Azure Policy will place on a resource within a resource group. Use this when the
     * resource group the resource will be created in is already known.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param parameters The check policy restrictions parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a check policy restrictions evaluation on a resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CheckRestrictionsResultInner> checkAtResourceGroupScopeWithResponse(
        String resourceGroupName, CheckRestrictionsRequest parameters, Context context);
}
