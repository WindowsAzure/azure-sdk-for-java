// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.cdn.generated.fluent.models.CdnWebApplicationFirewallPolicyInner;
import com.azure.resourcemanager.cdn.generated.models.CdnWebApplicationFirewallPolicyPatchParameters;

/** An instance of this class provides access to all the operations defined in PoliciesClient. */
public interface PoliciesClient {
    /**
     * Lists all of the protection policies within a resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines a list of WebApplicationFirewallPolicies for Azure CDN.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CdnWebApplicationFirewallPolicyInner> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all of the protection policies within a resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines a list of WebApplicationFirewallPolicies for Azure CDN.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CdnWebApplicationFirewallPolicyInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Retrieve protection policy with specified name within a resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the CdnWebApplicationFirewallPolicy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines web application firewall policy for Azure CDN.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CdnWebApplicationFirewallPolicyInner getByResourceGroup(String resourceGroupName, String policyName);

    /**
     * Retrieve protection policy with specified name within a resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the CdnWebApplicationFirewallPolicy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines web application firewall policy for Azure CDN.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CdnWebApplicationFirewallPolicyInner> getByResourceGroupWithResponse(
        String resourceGroupName, String policyName, Context context);

    /**
     * Create or update policy with specified rule set name within a resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the CdnWebApplicationFirewallPolicy.
     * @param cdnWebApplicationFirewallPolicy Defines web application firewall policy for Azure CDN.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines web application firewall policy for Azure CDN.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<CdnWebApplicationFirewallPolicyInner>, CdnWebApplicationFirewallPolicyInner>
        beginCreateOrUpdate(
            String resourceGroupName,
            String policyName,
            CdnWebApplicationFirewallPolicyInner cdnWebApplicationFirewallPolicy);

    /**
     * Create or update policy with specified rule set name within a resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the CdnWebApplicationFirewallPolicy.
     * @param cdnWebApplicationFirewallPolicy Defines web application firewall policy for Azure CDN.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines web application firewall policy for Azure CDN.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<CdnWebApplicationFirewallPolicyInner>, CdnWebApplicationFirewallPolicyInner>
        beginCreateOrUpdate(
            String resourceGroupName,
            String policyName,
            CdnWebApplicationFirewallPolicyInner cdnWebApplicationFirewallPolicy,
            Context context);

    /**
     * Create or update policy with specified rule set name within a resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the CdnWebApplicationFirewallPolicy.
     * @param cdnWebApplicationFirewallPolicy Defines web application firewall policy for Azure CDN.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines web application firewall policy for Azure CDN.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CdnWebApplicationFirewallPolicyInner createOrUpdate(
        String resourceGroupName,
        String policyName,
        CdnWebApplicationFirewallPolicyInner cdnWebApplicationFirewallPolicy);

    /**
     * Create or update policy with specified rule set name within a resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the CdnWebApplicationFirewallPolicy.
     * @param cdnWebApplicationFirewallPolicy Defines web application firewall policy for Azure CDN.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines web application firewall policy for Azure CDN.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CdnWebApplicationFirewallPolicyInner createOrUpdate(
        String resourceGroupName,
        String policyName,
        CdnWebApplicationFirewallPolicyInner cdnWebApplicationFirewallPolicy,
        Context context);

    /**
     * Update an existing CdnWebApplicationFirewallPolicy with the specified policy name under the specified
     * subscription and resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the CdnWebApplicationFirewallPolicy.
     * @param cdnWebApplicationFirewallPolicyPatchParameters Properties required to update a
     *     CdnWebApplicationFirewallPolicy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines web application firewall policy for Azure CDN.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<CdnWebApplicationFirewallPolicyInner>, CdnWebApplicationFirewallPolicyInner> beginUpdate(
        String resourceGroupName,
        String policyName,
        CdnWebApplicationFirewallPolicyPatchParameters cdnWebApplicationFirewallPolicyPatchParameters);

    /**
     * Update an existing CdnWebApplicationFirewallPolicy with the specified policy name under the specified
     * subscription and resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the CdnWebApplicationFirewallPolicy.
     * @param cdnWebApplicationFirewallPolicyPatchParameters Properties required to update a
     *     CdnWebApplicationFirewallPolicy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines web application firewall policy for Azure CDN.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<CdnWebApplicationFirewallPolicyInner>, CdnWebApplicationFirewallPolicyInner> beginUpdate(
        String resourceGroupName,
        String policyName,
        CdnWebApplicationFirewallPolicyPatchParameters cdnWebApplicationFirewallPolicyPatchParameters,
        Context context);

    /**
     * Update an existing CdnWebApplicationFirewallPolicy with the specified policy name under the specified
     * subscription and resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the CdnWebApplicationFirewallPolicy.
     * @param cdnWebApplicationFirewallPolicyPatchParameters Properties required to update a
     *     CdnWebApplicationFirewallPolicy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines web application firewall policy for Azure CDN.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CdnWebApplicationFirewallPolicyInner update(
        String resourceGroupName,
        String policyName,
        CdnWebApplicationFirewallPolicyPatchParameters cdnWebApplicationFirewallPolicyPatchParameters);

    /**
     * Update an existing CdnWebApplicationFirewallPolicy with the specified policy name under the specified
     * subscription and resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the CdnWebApplicationFirewallPolicy.
     * @param cdnWebApplicationFirewallPolicyPatchParameters Properties required to update a
     *     CdnWebApplicationFirewallPolicy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines web application firewall policy for Azure CDN.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CdnWebApplicationFirewallPolicyInner update(
        String resourceGroupName,
        String policyName,
        CdnWebApplicationFirewallPolicyPatchParameters cdnWebApplicationFirewallPolicyPatchParameters,
        Context context);

    /**
     * Deletes Policy.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the CdnWebApplicationFirewallPolicy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String policyName);

    /**
     * Deletes Policy.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the CdnWebApplicationFirewallPolicy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String policyName, Context context);
}
