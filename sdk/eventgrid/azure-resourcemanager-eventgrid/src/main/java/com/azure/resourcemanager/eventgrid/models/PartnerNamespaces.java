// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of PartnerNamespaces. */
public interface PartnerNamespaces {
    /**
     * Get properties of a partner namespace.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerNamespaceName Name of the partner namespace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a partner namespace.
     */
    PartnerNamespace getByResourceGroup(String resourceGroupName, String partnerNamespaceName);

    /**
     * Get properties of a partner namespace.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerNamespaceName Name of the partner namespace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a partner namespace.
     */
    Response<PartnerNamespace> getByResourceGroupWithResponse(
        String resourceGroupName, String partnerNamespaceName, Context context);

    /**
     * Delete existing partner namespace.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerNamespaceName Name of the partner namespace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String partnerNamespaceName);

    /**
     * Delete existing partner namespace.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerNamespaceName Name of the partner namespace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String partnerNamespaceName, Context context);

    /**
     * List all the partner namespaces under an Azure subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List Partner Namespaces operation.
     */
    PagedIterable<PartnerNamespace> list();

    /**
     * List all the partner namespaces under an Azure subscription.
     *
     * @param filter The query used to filter the search results using OData syntax. Filtering is permitted on the
     *     'name' property only and with limited number of OData operations. These operations are: the 'contains'
     *     function as well as the following logical operations: not, and, or, eq (for equal), and ne (for not equal).
     *     No arithmetic operations are supported. The following is a valid filter example: $filter=contains(namE,
     *     'PATTERN') and name ne 'PATTERN-1'. The following is not a valid filter example: $filter=location eq
     *     'westus'.
     * @param top The number of results to return per page for the list operation. Valid range for top parameter is 1 to
     *     100. If not specified, the default number of results to be returned is 20 items per page.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List Partner Namespaces operation.
     */
    PagedIterable<PartnerNamespace> list(String filter, Integer top, Context context);

    /**
     * List all the partner namespaces under a resource group.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List Partner Namespaces operation.
     */
    PagedIterable<PartnerNamespace> listByResourceGroup(String resourceGroupName);

    /**
     * List all the partner namespaces under a resource group.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param filter The query used to filter the search results using OData syntax. Filtering is permitted on the
     *     'name' property only and with limited number of OData operations. These operations are: the 'contains'
     *     function as well as the following logical operations: not, and, or, eq (for equal), and ne (for not equal).
     *     No arithmetic operations are supported. The following is a valid filter example: $filter=contains(namE,
     *     'PATTERN') and name ne 'PATTERN-1'. The following is not a valid filter example: $filter=location eq
     *     'westus'.
     * @param top The number of results to return per page for the list operation. Valid range for top parameter is 1 to
     *     100. If not specified, the default number of results to be returned is 20 items per page.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List Partner Namespaces operation.
     */
    PagedIterable<PartnerNamespace> listByResourceGroup(
        String resourceGroupName, String filter, Integer top, Context context);

    /**
     * List the two keys used to publish to a partner namespace.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerNamespaceName Name of the partner namespace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return shared access keys of the partner namespace.
     */
    PartnerNamespaceSharedAccessKeys listSharedAccessKeys(String resourceGroupName, String partnerNamespaceName);

    /**
     * List the two keys used to publish to a partner namespace.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerNamespaceName Name of the partner namespace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return shared access keys of the partner namespace.
     */
    Response<PartnerNamespaceSharedAccessKeys> listSharedAccessKeysWithResponse(
        String resourceGroupName, String partnerNamespaceName, Context context);

    /**
     * Regenerate a shared access key for a partner namespace.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerNamespaceName Name of the partner namespace.
     * @param regenerateKeyRequest Request body to regenerate key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return shared access keys of the partner namespace.
     */
    PartnerNamespaceSharedAccessKeys regenerateKey(
        String resourceGroupName,
        String partnerNamespaceName,
        PartnerNamespaceRegenerateKeyRequest regenerateKeyRequest);

    /**
     * Regenerate a shared access key for a partner namespace.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerNamespaceName Name of the partner namespace.
     * @param regenerateKeyRequest Request body to regenerate key.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return shared access keys of the partner namespace.
     */
    Response<PartnerNamespaceSharedAccessKeys> regenerateKeyWithResponse(
        String resourceGroupName,
        String partnerNamespaceName,
        PartnerNamespaceRegenerateKeyRequest regenerateKeyRequest,
        Context context);

    /**
     * Get properties of a partner namespace.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a partner namespace.
     */
    PartnerNamespace getById(String id);

    /**
     * Get properties of a partner namespace.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a partner namespace.
     */
    Response<PartnerNamespace> getByIdWithResponse(String id, Context context);

    /**
     * Delete existing partner namespace.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete existing partner namespace.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new PartnerNamespace resource.
     *
     * @param name resource name.
     * @return the first stage of the new PartnerNamespace definition.
     */
    PartnerNamespace.DefinitionStages.Blank define(String name);
}
