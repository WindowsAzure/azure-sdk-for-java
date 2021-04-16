// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of AuthorizationPolicies. */
public interface AuthorizationPolicies {
    /**
     * Gets an authorization policy in the hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param authorizationPolicyName The name of the policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an authorization policy in the hub.
     */
    AuthorizationPolicyResourceFormat get(String resourceGroupName, String hubName, String authorizationPolicyName);

    /**
     * Gets an authorization policy in the hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param authorizationPolicyName The name of the policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an authorization policy in the hub.
     */
    Response<AuthorizationPolicyResourceFormat> getWithResponse(
        String resourceGroupName, String hubName, String authorizationPolicyName, Context context);

    /**
     * Gets all the authorization policies in a specified hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the authorization policies in a specified hub.
     */
    PagedIterable<AuthorizationPolicyResourceFormat> listByHub(String resourceGroupName, String hubName);

    /**
     * Gets all the authorization policies in a specified hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the authorization policies in a specified hub.
     */
    PagedIterable<AuthorizationPolicyResourceFormat> listByHub(
        String resourceGroupName, String hubName, Context context);

    /**
     * Regenerates the primary policy key of the specified authorization policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param authorizationPolicyName The name of the policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the authorization policy.
     */
    AuthorizationPolicy regeneratePrimaryKey(String resourceGroupName, String hubName, String authorizationPolicyName);

    /**
     * Regenerates the primary policy key of the specified authorization policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param authorizationPolicyName The name of the policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the authorization policy.
     */
    Response<AuthorizationPolicy> regeneratePrimaryKeyWithResponse(
        String resourceGroupName, String hubName, String authorizationPolicyName, Context context);

    /**
     * Regenerates the secondary policy key of the specified authorization policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param authorizationPolicyName The name of the policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the authorization policy.
     */
    AuthorizationPolicy regenerateSecondaryKey(
        String resourceGroupName, String hubName, String authorizationPolicyName);

    /**
     * Regenerates the secondary policy key of the specified authorization policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param authorizationPolicyName The name of the policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the authorization policy.
     */
    Response<AuthorizationPolicy> regenerateSecondaryKeyWithResponse(
        String resourceGroupName, String hubName, String authorizationPolicyName, Context context);

    /**
     * Gets an authorization policy in the hub.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an authorization policy in the hub.
     */
    AuthorizationPolicyResourceFormat getById(String id);

    /**
     * Gets an authorization policy in the hub.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an authorization policy in the hub.
     */
    Response<AuthorizationPolicyResourceFormat> getByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new AuthorizationPolicyResourceFormat resource.
     *
     * @param name resource name.
     * @return the first stage of the new AuthorizationPolicyResourceFormat definition.
     */
    AuthorizationPolicyResourceFormat.DefinitionStages.Blank define(String name);
}
