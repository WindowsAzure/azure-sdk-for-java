// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/** Resource collection API of DataMaskingRules. */
public interface DataMaskingRules {
    /**
     * Gets a list of database data masking rules.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of database data masking rules.
     */
    PagedIterable<DataMaskingRule> listByDatabase(String resourceGroupName, String serverName, String databaseName);

    /**
     * Gets a list of database data masking rules.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of database data masking rules.
     */
    PagedIterable<DataMaskingRule> listByDatabase(
        String resourceGroupName, String serverName, String databaseName, Context context);

    /**
     * Begins definition for a new DataMaskingRule resource.
     *
     * @param name resource name.
     * @return the first stage of the new DataMaskingRule definition.
     */
    DataMaskingRule.DefinitionStages.Blank define(String name);
}
