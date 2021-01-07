// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.saas.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.saas.fluent.models.SaasResourceInner;
import com.azure.resourcemanager.saas.models.DeleteOptions;
import com.azure.resourcemanager.saas.models.SaasResourceCreation;

/** An instance of this class provides access to all the operations defined in SaaSClient. */
public interface SaaSClient {
    /**
     * Deletes the specified SaaS.
     *
     * @param resourceId The Saas resource ID. This is a GUID-formatted string (e.g.
     *     00000000-0000-0000-0000-000000000000).
     * @param parameters Parameters supplied to delete saas operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceId, DeleteOptions parameters);

    /**
     * Deletes the specified SaaS.
     *
     * @param resourceId The Saas resource ID. This is a GUID-formatted string (e.g.
     *     00000000-0000-0000-0000-000000000000).
     * @param parameters Parameters supplied to delete saas operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceId, DeleteOptions parameters, Context context);

    /**
     * Deletes the specified SaaS.
     *
     * @param resourceId The Saas resource ID. This is a GUID-formatted string (e.g.
     *     00000000-0000-0000-0000-000000000000).
     * @param parameters Parameters supplied to delete saas operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceId, DeleteOptions parameters);

    /**
     * Deletes the specified SaaS.
     *
     * @param resourceId The Saas resource ID. This is a GUID-formatted string (e.g.
     *     00000000-0000-0000-0000-000000000000).
     * @param parameters Parameters supplied to delete saas operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceId, DeleteOptions parameters, Context context);

    /**
     * Gets information about the specified SaaS.
     *
     * @param resourceId The Saas resource ID. This is a GUID-formatted string (e.g.
     *     00000000-0000-0000-0000-000000000000).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified SaaS.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SaasResourceInner getResource(String resourceId);

    /**
     * Gets information about the specified SaaS.
     *
     * @param resourceId The Saas resource ID. This is a GUID-formatted string (e.g.
     *     00000000-0000-0000-0000-000000000000).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified SaaS.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SaasResourceInner> getResourceWithResponse(String resourceId, Context context);

    /**
     * Updates a SaaS resource.
     *
     * @param resourceId The Saas resource ID. This is a GUID-formatted string (e.g.
     *     00000000-0000-0000-0000-000000000000).
     * @param parameters Parameters supplied to the update saas operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return saaS REST API resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<SaasResourceInner>, SaasResourceInner> beginUpdateResource(
        String resourceId, SaasResourceCreation parameters);

    /**
     * Updates a SaaS resource.
     *
     * @param resourceId The Saas resource ID. This is a GUID-formatted string (e.g.
     *     00000000-0000-0000-0000-000000000000).
     * @param parameters Parameters supplied to the update saas operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return saaS REST API resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<SaasResourceInner>, SaasResourceInner> beginUpdateResource(
        String resourceId, SaasResourceCreation parameters, Context context);

    /**
     * Updates a SaaS resource.
     *
     * @param resourceId The Saas resource ID. This is a GUID-formatted string (e.g.
     *     00000000-0000-0000-0000-000000000000).
     * @param parameters Parameters supplied to the update saas operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return saaS REST API resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SaasResourceInner updateResource(String resourceId, SaasResourceCreation parameters);

    /**
     * Updates a SaaS resource.
     *
     * @param resourceId The Saas resource ID. This is a GUID-formatted string (e.g.
     *     00000000-0000-0000-0000-000000000000).
     * @param parameters Parameters supplied to the update saas operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return saaS REST API resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SaasResourceInner updateResource(String resourceId, SaasResourceCreation parameters, Context context);

    /**
     * Creates a SaaS resource.
     *
     * @param parameters Parameters supplied to the create saas operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return saaS REST API resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<SaasResourceInner>, SaasResourceInner> beginCreateResource(SaasResourceCreation parameters);

    /**
     * Creates a SaaS resource.
     *
     * @param parameters Parameters supplied to the create saas operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return saaS REST API resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<SaasResourceInner>, SaasResourceInner> beginCreateResource(
        SaasResourceCreation parameters, Context context);

    /**
     * Creates a SaaS resource.
     *
     * @param parameters Parameters supplied to the create saas operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return saaS REST API resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SaasResourceInner createResource(SaasResourceCreation parameters);

    /**
     * Creates a SaaS resource.
     *
     * @param parameters Parameters supplied to the create saas operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return saaS REST API resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SaasResourceInner createResource(SaasResourceCreation parameters, Context context);
}
