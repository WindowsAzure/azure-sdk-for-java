// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.vmwarecloudsimple.fluent.models.CustomizationPolicyInner;

/** An instance of this class provides access to all the operations defined in CustomizationPoliciesClient. */
public interface CustomizationPoliciesClient {
    /**
     * Returns list of customization policies in region for private cloud.
     *
     * @param regionId The region Id (westus, eastus).
     * @param pcName The private cloud name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of customization polices response model.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CustomizationPolicyInner> list(String regionId, String pcName);

    /**
     * Returns list of customization policies in region for private cloud.
     *
     * @param regionId The region Id (westus, eastus).
     * @param pcName The private cloud name.
     * @param filter The filter to apply on the list operation. only type is allowed here as a filter e.g. $filter=type
     *     eq 'xxxx'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of customization polices response model.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CustomizationPolicyInner> list(String regionId, String pcName, String filter, Context context);

    /**
     * Returns customization policy by its name.
     *
     * @param regionId The region Id (westus, eastus).
     * @param pcName The private cloud name.
     * @param customizationPolicyName customization policy name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the virtual machine customization policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CustomizationPolicyInner get(String regionId, String pcName, String customizationPolicyName);

    /**
     * Returns customization policy by its name.
     *
     * @param regionId The region Id (westus, eastus).
     * @param pcName The private cloud name.
     * @param customizationPolicyName customization policy name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the virtual machine customization policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CustomizationPolicyInner> getWithResponse(
        String regionId, String pcName, String customizationPolicyName, Context context);
}
