// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.monitor.generated.fluent.models.AlertRuleResourceInner;
import com.azure.resourcemanager.monitor.generated.models.AlertRuleResourcePatch;

/** An instance of this class provides access to all the operations defined in AlertRulesClient. */
public interface AlertRulesClient {
    /**
     * Creates or updates a classic metric alert rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @param parameters The parameters of the rule to create or update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the alert rule resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AlertRuleResourceInner createOrUpdate(String resourceGroupName, String ruleName, AlertRuleResourceInner parameters);

    /**
     * Creates or updates a classic metric alert rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @param parameters The parameters of the rule to create or update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the alert rule resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AlertRuleResourceInner> createOrUpdateWithResponse(
        String resourceGroupName, String ruleName, AlertRuleResourceInner parameters, Context context);

    /**
     * Deletes a classic metric alert rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String ruleName);

    /**
     * Deletes a classic metric alert rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String ruleName, Context context);

    /**
     * Gets a classic metric alert rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a classic metric alert rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AlertRuleResourceInner getByResourceGroup(String resourceGroupName, String ruleName);

    /**
     * Gets a classic metric alert rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a classic metric alert rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AlertRuleResourceInner> getByResourceGroupWithResponse(
        String resourceGroupName, String ruleName, Context context);

    /**
     * Updates an existing classic metric AlertRuleResource. To update other fields use the CreateOrUpdate method.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @param alertRulesResource Parameters supplied to the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the alert rule resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AlertRuleResourceInner update(String resourceGroupName, String ruleName, AlertRuleResourcePatch alertRulesResource);

    /**
     * Updates an existing classic metric AlertRuleResource. To update other fields use the CreateOrUpdate method.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @param alertRulesResource Parameters supplied to the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the alert rule resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AlertRuleResourceInner> updateWithResponse(
        String resourceGroupName, String ruleName, AlertRuleResourcePatch alertRulesResource, Context context);

    /**
     * List the classic metric alert rules within a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of alert rule resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AlertRuleResourceInner> listByResourceGroup(String resourceGroupName);

    /**
     * List the classic metric alert rules within a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of alert rule resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AlertRuleResourceInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * List the classic metric alert rules within a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of alert rule resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AlertRuleResourceInner> list();

    /**
     * List the classic metric alert rules within a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of alert rule resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AlertRuleResourceInner> list(Context context);
}
