// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.powerplatform.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Subnets. */
public interface Subnets {
    /**
     * Description of Subnets that are authorized for outbound calls from PowerPlatform.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param enterprisePolicyName EnterprisePolicy for the Microsoft Azure subscription.
     * @param subnetName The name of the subnet.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a subnet.
     */
    Subnet get(String resourceGroupName, String enterprisePolicyName, String subnetName);

    /**
     * Description of Subnets that are authorized for outbound calls from PowerPlatform.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param enterprisePolicyName EnterprisePolicy for the Microsoft Azure subscription.
     * @param subnetName The name of the subnet.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a subnet.
     */
    Response<Subnet> getWithResponse(
        String resourceGroupName, String enterprisePolicyName, String subnetName, Context context);

    /**
     * Description of the Subnet that PowerPlatform resources can access.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param enterprisePolicyName EnterprisePolicy for the Microsoft Azure subscription.
     * @param subnetName The name of the subnet.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a subnet.
     */
    Subnet createOrUpdate(String resourceGroupName, String enterprisePolicyName, String subnetName);

    /**
     * Description of the Subnet that PowerPlatform resources can access.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param enterprisePolicyName EnterprisePolicy for the Microsoft Azure subscription.
     * @param subnetName The name of the subnet.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a subnet.
     */
    Response<Subnet> createOrUpdateWithResponse(
        String resourceGroupName, String enterprisePolicyName, String subnetName, Context context);

    /**
     * Retrieve a list of subnets within a given enterprisePolicy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param enterprisePolicyName EnterprisePolicy for the Microsoft Azure subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of subnets.
     */
    PagedIterable<Subnet> listByEnterprisePolicy(String resourceGroupName, String enterprisePolicyName);

    /**
     * Retrieve a list of subnets within a given enterprisePolicy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param enterprisePolicyName EnterprisePolicy for the Microsoft Azure subscription.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of subnets.
     */
    PagedIterable<Subnet> listByEnterprisePolicy(
        String resourceGroupName, String enterprisePolicyName, Context context);
}
