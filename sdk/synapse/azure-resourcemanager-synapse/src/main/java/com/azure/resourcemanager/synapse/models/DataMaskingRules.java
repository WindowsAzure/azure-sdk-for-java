// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of DataMaskingRules. */
public interface DataMaskingRules {
    /**
     * Gets the specific Sql pool data masking rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param dataMaskingRuleName The name of the data masking rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specific Sql pool data masking rule.
     */
    DataMaskingRule get(String resourceGroupName, String workspaceName, String sqlPoolName, String dataMaskingRuleName);

    /**
     * Gets the specific Sql pool data masking rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param dataMaskingRuleName The name of the data masking rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specific Sql pool data masking rule.
     */
    Response<DataMaskingRule> getWithResponse(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        String dataMaskingRuleName,
        Context context);

    /**
     * Gets a list of Sql pool data masking rules.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Sql pool data masking rules.
     */
    PagedIterable<DataMaskingRule> listBySqlPool(String resourceGroupName, String workspaceName, String sqlPoolName);

    /**
     * Gets a list of Sql pool data masking rules.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Sql pool data masking rules.
     */
    PagedIterable<DataMaskingRule> listBySqlPool(
        String resourceGroupName, String workspaceName, String sqlPoolName, Context context);

    /**
     * Gets the specific Sql pool data masking rule.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specific Sql pool data masking rule.
     */
    DataMaskingRule getById(String id);

    /**
     * Gets the specific Sql pool data masking rule.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specific Sql pool data masking rule.
     */
    Response<DataMaskingRule> getByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new DataMaskingRule resource.
     *
     * @param name resource name.
     * @return the first stage of the new DataMaskingRule definition.
     */
    DataMaskingRule.DefinitionStages.Blank define(String name);
}
