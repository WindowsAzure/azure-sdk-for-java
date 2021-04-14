// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.customerinsights.fluent.models.RelationshipResourceFormatInner;

/** An instance of this class provides access to all the operations defined in RelationshipsClient. */
public interface RelationshipsClient {
    /**
     * Creates a relationship or updates an existing relationship within a hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param relationshipName The name of the Relationship.
     * @param parameters Parameters supplied to the CreateOrUpdate Relationship operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the relationship resource format.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<RelationshipResourceFormatInner>, RelationshipResourceFormatInner> beginCreateOrUpdate(
        String resourceGroupName, String hubName, String relationshipName, RelationshipResourceFormatInner parameters);

    /**
     * Creates a relationship or updates an existing relationship within a hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param relationshipName The name of the Relationship.
     * @param parameters Parameters supplied to the CreateOrUpdate Relationship operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the relationship resource format.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<RelationshipResourceFormatInner>, RelationshipResourceFormatInner> beginCreateOrUpdate(
        String resourceGroupName,
        String hubName,
        String relationshipName,
        RelationshipResourceFormatInner parameters,
        Context context);

    /**
     * Creates a relationship or updates an existing relationship within a hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param relationshipName The name of the Relationship.
     * @param parameters Parameters supplied to the CreateOrUpdate Relationship operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the relationship resource format.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RelationshipResourceFormatInner createOrUpdate(
        String resourceGroupName, String hubName, String relationshipName, RelationshipResourceFormatInner parameters);

    /**
     * Creates a relationship or updates an existing relationship within a hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param relationshipName The name of the Relationship.
     * @param parameters Parameters supplied to the CreateOrUpdate Relationship operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the relationship resource format.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RelationshipResourceFormatInner createOrUpdate(
        String resourceGroupName,
        String hubName,
        String relationshipName,
        RelationshipResourceFormatInner parameters,
        Context context);

    /**
     * Gets information about the specified relationship.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param relationshipName The name of the relationship.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified relationship.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RelationshipResourceFormatInner get(String resourceGroupName, String hubName, String relationshipName);

    /**
     * Gets information about the specified relationship.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param relationshipName The name of the relationship.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified relationship.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RelationshipResourceFormatInner> getWithResponse(
        String resourceGroupName, String hubName, String relationshipName, Context context);

    /**
     * Deletes a relationship within a hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param relationshipName The name of the relationship.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String hubName, String relationshipName);

    /**
     * Deletes a relationship within a hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param relationshipName The name of the relationship.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String hubName, String relationshipName, Context context);

    /**
     * Deletes a relationship within a hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param relationshipName The name of the relationship.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String hubName, String relationshipName);

    /**
     * Deletes a relationship within a hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param relationshipName The name of the relationship.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String hubName, String relationshipName, Context context);

    /**
     * Gets all relationships in the hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all relationships in the hub.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RelationshipResourceFormatInner> listByHub(String resourceGroupName, String hubName);

    /**
     * Gets all relationships in the hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all relationships in the hub.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RelationshipResourceFormatInner> listByHub(String resourceGroupName, String hubName, Context context);
}
