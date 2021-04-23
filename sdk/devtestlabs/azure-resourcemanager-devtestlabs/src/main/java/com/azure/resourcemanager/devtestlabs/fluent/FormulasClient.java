// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.devtestlabs.fluent.models.FormulaInner;
import com.azure.resourcemanager.devtestlabs.models.FormulaFragment;

/** An instance of this class provides access to all the operations defined in FormulasClient. */
public interface FormulasClient {
    /**
     * List formulas in a given lab.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a list operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<FormulaInner> list(String resourceGroupName, String labName);

    /**
     * List formulas in a given lab.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param expand Specify the $expand query. Example: 'properties($select=description)'.
     * @param filter The filter to apply to the operation. Example: '$filter=contains(name,'myName').
     * @param top The maximum number of resources to return from the operation. Example: '$top=10'.
     * @param orderby The ordering expression for the results, using OData notation. Example: '$orderby=name desc'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a list operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<FormulaInner> list(
        String resourceGroupName,
        String labName,
        String expand,
        String filter,
        Integer top,
        String orderby,
        Context context);

    /**
     * Get formula.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the formula.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return formula.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FormulaInner get(String resourceGroupName, String labName, String name);

    /**
     * Get formula.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the formula.
     * @param expand Specify the $expand query. Example: 'properties($select=description)'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return formula.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<FormulaInner> getWithResponse(
        String resourceGroupName, String labName, String name, String expand, Context context);

    /**
     * Create or replace an existing formula. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the formula.
     * @param formula A formula for creating a VM, specifying an image base and other parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a formula for creating a VM, specifying an image base and other parameters.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<FormulaInner>, FormulaInner> beginCreateOrUpdate(
        String resourceGroupName, String labName, String name, FormulaInner formula);

    /**
     * Create or replace an existing formula. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the formula.
     * @param formula A formula for creating a VM, specifying an image base and other parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a formula for creating a VM, specifying an image base and other parameters.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<FormulaInner>, FormulaInner> beginCreateOrUpdate(
        String resourceGroupName, String labName, String name, FormulaInner formula, Context context);

    /**
     * Create or replace an existing formula. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the formula.
     * @param formula A formula for creating a VM, specifying an image base and other parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a formula for creating a VM, specifying an image base and other parameters.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FormulaInner createOrUpdate(String resourceGroupName, String labName, String name, FormulaInner formula);

    /**
     * Create or replace an existing formula. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the formula.
     * @param formula A formula for creating a VM, specifying an image base and other parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a formula for creating a VM, specifying an image base and other parameters.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FormulaInner createOrUpdate(
        String resourceGroupName, String labName, String name, FormulaInner formula, Context context);

    /**
     * Delete formula.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the formula.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String labName, String name);

    /**
     * Delete formula.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the formula.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String labName, String name, Context context);

    /**
     * Allows modifying tags of formulas. All other properties will be ignored.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the formula.
     * @param formula A formula for creating a VM, specifying an image base and other parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a formula for creating a VM, specifying an image base and other parameters.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FormulaInner update(String resourceGroupName, String labName, String name, FormulaFragment formula);

    /**
     * Allows modifying tags of formulas. All other properties will be ignored.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the formula.
     * @param formula A formula for creating a VM, specifying an image base and other parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a formula for creating a VM, specifying an image base and other parameters.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<FormulaInner> updateWithResponse(
        String resourceGroupName, String labName, String name, FormulaFragment formula, Context context);
}
