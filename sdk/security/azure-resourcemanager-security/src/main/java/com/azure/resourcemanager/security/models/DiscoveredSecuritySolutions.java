// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of DiscoveredSecuritySolutions. */
public interface DiscoveredSecuritySolutions {
    /**
     * Gets a list of discovered Security Solutions for the subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of discovered Security Solutions for the subscription.
     */
    PagedIterable<DiscoveredSecuritySolution> list();

    /**
     * Gets a list of discovered Security Solutions for the subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of discovered Security Solutions for the subscription.
     */
    PagedIterable<DiscoveredSecuritySolution> list(Context context);

    /**
     * Gets a list of discovered Security Solutions for the subscription and location.
     *
     * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get
     *     locations.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of discovered Security Solutions for the subscription and location.
     */
    PagedIterable<DiscoveredSecuritySolution> listByHomeRegion(String ascLocation);

    /**
     * Gets a list of discovered Security Solutions for the subscription and location.
     *
     * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get
     *     locations.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of discovered Security Solutions for the subscription and location.
     */
    PagedIterable<DiscoveredSecuritySolution> listByHomeRegion(String ascLocation, Context context);

    /**
     * Gets a specific discovered Security Solution.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get
     *     locations.
     * @param discoveredSecuritySolutionName Name of a discovered security solution.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific discovered Security Solution.
     */
    DiscoveredSecuritySolution get(String resourceGroupName, String ascLocation, String discoveredSecuritySolutionName);

    /**
     * Gets a specific discovered Security Solution.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get
     *     locations.
     * @param discoveredSecuritySolutionName Name of a discovered security solution.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific discovered Security Solution.
     */
    Response<DiscoveredSecuritySolution> getWithResponse(
        String resourceGroupName, String ascLocation, String discoveredSecuritySolutionName, Context context);
}
