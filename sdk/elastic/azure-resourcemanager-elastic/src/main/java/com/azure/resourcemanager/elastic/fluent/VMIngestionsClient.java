// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.elastic.fluent.models.VMIngestionDetailsResponseInner;

/** An instance of this class provides access to all the operations defined in VMIngestionsClient. */
public interface VMIngestionsClient {
    /**
     * List the vm ingestion details that will be monitored by the Elastic monitor resource.
     *
     * @param resourceGroupName The name of the resource group to which the Elastic resource belongs.
     * @param monitorName Monitor resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the vm ingestion details to install an agent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VMIngestionDetailsResponseInner details(String resourceGroupName, String monitorName);

    /**
     * List the vm ingestion details that will be monitored by the Elastic monitor resource.
     *
     * @param resourceGroupName The name of the resource group to which the Elastic resource belongs.
     * @param monitorName Monitor resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the vm ingestion details to install an agent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<VMIngestionDetailsResponseInner> detailsWithResponse(
        String resourceGroupName, String monitorName, Context context);
}
