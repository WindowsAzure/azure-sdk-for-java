// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Accounts. */
public interface Accounts {
    /**
     * Deletes a Cognitive Services account from the resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String accountName);

    /**
     * Deletes a Cognitive Services account from the resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String accountName, Context context);

    /**
     * Returns a Cognitive Services account specified by the parameters.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cognitive Services account is an Azure resource representing the provisioned account, it's type, location
     *     and SKU.
     */
    Account getByResourceGroup(String resourceGroupName, String accountName);

    /**
     * Returns a Cognitive Services account specified by the parameters.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cognitive Services account is an Azure resource representing the provisioned account, it's type, location
     *     and SKU.
     */
    Response<Account> getByResourceGroupWithResponse(String resourceGroupName, String accountName, Context context);

    /**
     * Returns all the resources of a particular type belonging to a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of cognitive services accounts operation response.
     */
    PagedIterable<Account> listByResourceGroup(String resourceGroupName);

    /**
     * Returns all the resources of a particular type belonging to a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of cognitive services accounts operation response.
     */
    PagedIterable<Account> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Returns all the resources of a particular type belonging to a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of cognitive services accounts operation response.
     */
    PagedIterable<Account> list();

    /**
     * Returns all the resources of a particular type belonging to a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of cognitive services accounts operation response.
     */
    PagedIterable<Account> list(Context context);

    /**
     * Lists the account keys for the specified Cognitive Services account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the access keys for the cognitive services account.
     */
    ApiKeys listKeys(String resourceGroupName, String accountName);

    /**
     * Lists the account keys for the specified Cognitive Services account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the access keys for the cognitive services account.
     */
    Response<ApiKeys> listKeysWithResponse(String resourceGroupName, String accountName, Context context);

    /**
     * Regenerates the specified account key for the specified Cognitive Services account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @param parameters regenerate key parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the access keys for the cognitive services account.
     */
    ApiKeys regenerateKey(String resourceGroupName, String accountName, RegenerateKeyParameters parameters);

    /**
     * Regenerates the specified account key for the specified Cognitive Services account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @param parameters regenerate key parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the access keys for the cognitive services account.
     */
    Response<ApiKeys> regenerateKeyWithResponse(
        String resourceGroupName, String accountName, RegenerateKeyParameters parameters, Context context);

    /**
     * List available SKUs for the requested Cognitive Services account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of cognitive services accounts operation response.
     */
    AccountSkuListResult listSkus(String resourceGroupName, String accountName);

    /**
     * List available SKUs for the requested Cognitive Services account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of cognitive services accounts operation response.
     */
    Response<AccountSkuListResult> listSkusWithResponse(String resourceGroupName, String accountName, Context context);

    /**
     * Get usages for the requested Cognitive Services account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return usages for the requested Cognitive Services account.
     */
    UsageListResult listUsages(String resourceGroupName, String accountName);

    /**
     * Get usages for the requested Cognitive Services account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of Cognitive Services account.
     * @param filter An OData filter expression that describes a subset of usages to return. The supported parameter is
     *     name.value (name of the metric, can have an or of multiple names).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return usages for the requested Cognitive Services account.
     */
    Response<UsageListResult> listUsagesWithResponse(
        String resourceGroupName, String accountName, String filter, Context context);

    /**
     * Returns a Cognitive Services account specified by the parameters.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cognitive Services account is an Azure resource representing the provisioned account, it's type, location
     *     and SKU.
     */
    Account getById(String id);

    /**
     * Returns a Cognitive Services account specified by the parameters.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return cognitive Services account is an Azure resource representing the provisioned account, it's type, location
     *     and SKU.
     */
    Response<Account> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a Cognitive Services account from the resource group.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a Cognitive Services account from the resource group.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new Account resource.
     *
     * @param name resource name.
     * @return the first stage of the new Account definition.
     */
    Account.DefinitionStages.Blank define(String name);
}
