// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/** Resource collection API of ReceivedRoutes. */
public interface ReceivedRoutes {
    /**
     * Lists the prefixes received over the specified peering under the given subscription and resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param peeringName The name of the peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated list of received routes for the peering.
     */
    PagedIterable<PeeringReceivedRoute> listByPeering(String resourceGroupName, String peeringName);

    /**
     * Lists the prefixes received over the specified peering under the given subscription and resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param peeringName The name of the peering.
     * @param prefix The optional prefix that can be used to filter the routes.
     * @param asPath The optional AS path that can be used to filter the routes.
     * @param originAsValidationState The optional origin AS validation state that can be used to filter the routes.
     * @param rpkiValidationState The optional RPKI validation state that can be used to filter the routes.
     * @param skipToken The optional page continuation token that is used in the event of paginated result.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated list of received routes for the peering.
     */
    PagedIterable<PeeringReceivedRoute> listByPeering(
        String resourceGroupName,
        String peeringName,
        String prefix,
        String asPath,
        String originAsValidationState,
        String rpkiValidationState,
        String skipToken,
        Context context);
}
