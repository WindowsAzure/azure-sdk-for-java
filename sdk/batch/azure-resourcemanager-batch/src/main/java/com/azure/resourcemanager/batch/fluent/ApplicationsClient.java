// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.batch.fluent.models.ApplicationInner;

/** An instance of this class provides access to all the operations defined in ApplicationsClient. */
public interface ApplicationsClient {
    /**
     * Adds an application to the specified Batch account.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param applicationName The name of the application. This must be unique within the account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains information about an application in a Batch account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApplicationInner create(String resourceGroupName, String accountName, String applicationName);

    /**
     * Adds an application to the specified Batch account.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param applicationName The name of the application. This must be unique within the account.
     * @param parameters The parameters for the request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains information about an application in a Batch account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ApplicationInner> createWithResponse(
        String resourceGroupName,
        String accountName,
        String applicationName,
        ApplicationInner parameters,
        Context context);

    /**
     * Deletes an application.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param applicationName The name of the application. This must be unique within the account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String accountName, String applicationName);

    /**
     * Deletes an application.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param applicationName The name of the application. This must be unique within the account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String accountName, String applicationName, Context context);

    /**
     * Gets information about the specified application.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param applicationName The name of the application. This must be unique within the account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified application.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApplicationInner get(String resourceGroupName, String accountName, String applicationName);

    /**
     * Gets information about the specified application.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param applicationName The name of the application. This must be unique within the account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified application.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ApplicationInner> getWithResponse(
        String resourceGroupName, String accountName, String applicationName, Context context);

    /**
     * Updates settings for the specified application.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param applicationName The name of the application. This must be unique within the account.
     * @param parameters The parameters for the request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains information about an application in a Batch account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApplicationInner update(
        String resourceGroupName, String accountName, String applicationName, ApplicationInner parameters);

    /**
     * Updates settings for the specified application.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param applicationName The name of the application. This must be unique within the account.
     * @param parameters The parameters for the request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains information about an application in a Batch account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ApplicationInner> updateWithResponse(
        String resourceGroupName,
        String accountName,
        String applicationName,
        ApplicationInner parameters,
        Context context);

    /**
     * Lists all of the applications in the specified account.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of performing list applications.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ApplicationInner> list(String resourceGroupName, String accountName);

    /**
     * Lists all of the applications in the specified account.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param maxresults The maximum number of items to return in the response.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of performing list applications.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ApplicationInner> list(
        String resourceGroupName, String accountName, Integer maxresults, Context context);
}
