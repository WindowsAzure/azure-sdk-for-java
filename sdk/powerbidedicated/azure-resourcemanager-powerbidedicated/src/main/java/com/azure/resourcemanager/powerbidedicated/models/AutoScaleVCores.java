// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.powerbidedicated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of AutoScaleVCores. */
public interface AutoScaleVCores {
    /**
     * Gets details about the specified auto scale v-core.
     *
     * @param resourceGroupName The name of the Azure Resource group of which a given PowerBIDedicated capacity is part.
     *     This name must be at least 1 character in length, and no more than 90.
     * @param vcoreName The name of the auto scale v-core. It must be a minimum of 3 characters, and a maximum of 63.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details about the specified auto scale v-core.
     */
    AutoScaleVCore getByResourceGroup(String resourceGroupName, String vcoreName);

    /**
     * Gets details about the specified auto scale v-core.
     *
     * @param resourceGroupName The name of the Azure Resource group of which a given PowerBIDedicated capacity is part.
     *     This name must be at least 1 character in length, and no more than 90.
     * @param vcoreName The name of the auto scale v-core. It must be a minimum of 3 characters, and a maximum of 63.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details about the specified auto scale v-core.
     */
    Response<AutoScaleVCore> getByResourceGroupWithResponse(
        String resourceGroupName, String vcoreName, Context context);

    /**
     * Deletes the specified auto scale v-core.
     *
     * @param resourceGroupName The name of the Azure Resource group of which a given PowerBIDedicated capacity is part.
     *     This name must be at least 1 character in length, and no more than 90.
     * @param vcoreName The name of the auto scale v-core. It must be a minimum of 3 characters, and a maximum of 63.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String vcoreName);

    /**
     * Deletes the specified auto scale v-core.
     *
     * @param resourceGroupName The name of the Azure Resource group of which a given PowerBIDedicated capacity is part.
     *     This name must be at least 1 character in length, and no more than 90.
     * @param vcoreName The name of the auto scale v-core. It must be a minimum of 3 characters, and a maximum of 63.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(String resourceGroupName, String vcoreName, Context context);

    /**
     * Gets all the auto scale v-cores for the given resource group.
     *
     * @param resourceGroupName The name of the Azure Resource group of which a given PowerBIDedicated capacity is part.
     *     This name must be at least 1 character in length, and no more than 90.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the auto scale v-cores for the given resource group.
     */
    PagedIterable<AutoScaleVCore> listByResourceGroup(String resourceGroupName);

    /**
     * Gets all the auto scale v-cores for the given resource group.
     *
     * @param resourceGroupName The name of the Azure Resource group of which a given PowerBIDedicated capacity is part.
     *     This name must be at least 1 character in length, and no more than 90.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the auto scale v-cores for the given resource group.
     */
    PagedIterable<AutoScaleVCore> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Lists all the auto scale v-cores for the given subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an array of auto scale v-core resources.
     */
    PagedIterable<AutoScaleVCore> list();

    /**
     * Lists all the auto scale v-cores for the given subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an array of auto scale v-core resources.
     */
    PagedIterable<AutoScaleVCore> list(Context context);

    /**
     * Gets details about the specified auto scale v-core.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details about the specified auto scale v-core.
     */
    AutoScaleVCore getById(String id);

    /**
     * Gets details about the specified auto scale v-core.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details about the specified auto scale v-core.
     */
    Response<AutoScaleVCore> getByIdWithResponse(String id, Context context);

    /**
     * Deletes the specified auto scale v-core.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the specified auto scale v-core.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new AutoScaleVCore resource.
     *
     * @param name resource name.
     * @return the first stage of the new AutoScaleVCore definition.
     */
    AutoScaleVCore.DefinitionStages.Blank define(String name);
}
