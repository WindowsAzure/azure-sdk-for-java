// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.network.fluent.models.NetworkVirtualApplianceInner;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsDelete;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsGet;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsListing;
import java.nio.ByteBuffer;
import java.util.Map;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in NetworkVirtualAppliancesClient. */
public interface NetworkVirtualAppliancesClient
    extends InnerSupportsGet<NetworkVirtualApplianceInner>,
        InnerSupportsListing<NetworkVirtualApplianceInner>,
        InnerSupportsDelete<Void> {
    /**
     * Deletes the specified Network Virtual Appliance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of Network Virtual Appliance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(
        String resourceGroupName, String networkVirtualApplianceName);

    /**
     * Deletes the specified Network Virtual Appliance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of Network Virtual Appliance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(String resourceGroupName, String networkVirtualApplianceName);

    /**
     * Deletes the specified Network Virtual Appliance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of Network Virtual Appliance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String networkVirtualApplianceName);

    /**
     * Deletes the specified Network Virtual Appliance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of Network Virtual Appliance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String networkVirtualApplianceName, Context context);

    /**
     * Deletes the specified Network Virtual Appliance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of Network Virtual Appliance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String networkVirtualApplianceName);

    /**
     * Deletes the specified Network Virtual Appliance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of Network Virtual Appliance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String networkVirtualApplianceName);

    /**
     * Deletes the specified Network Virtual Appliance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of Network Virtual Appliance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String networkVirtualApplianceName, Context context);

    /**
     * Gets the specified Network Virtual Appliance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of Network Virtual Appliance.
     * @param expand Expands referenced resources.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Network Virtual Appliance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<NetworkVirtualApplianceInner>> getByResourceGroupWithResponseAsync(
        String resourceGroupName, String networkVirtualApplianceName, String expand);

    /**
     * Gets the specified Network Virtual Appliance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of Network Virtual Appliance.
     * @param expand Expands referenced resources.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Network Virtual Appliance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<NetworkVirtualApplianceInner> getByResourceGroupAsync(
        String resourceGroupName, String networkVirtualApplianceName, String expand);

    /**
     * Gets the specified Network Virtual Appliance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of Network Virtual Appliance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Network Virtual Appliance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<NetworkVirtualApplianceInner> getByResourceGroupAsync(
        String resourceGroupName, String networkVirtualApplianceName);

    /**
     * Gets the specified Network Virtual Appliance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of Network Virtual Appliance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Network Virtual Appliance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkVirtualApplianceInner getByResourceGroup(String resourceGroupName, String networkVirtualApplianceName);

    /**
     * Gets the specified Network Virtual Appliance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of Network Virtual Appliance.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Network Virtual Appliance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<NetworkVirtualApplianceInner> getByResourceGroupWithResponse(
        String resourceGroupName, String networkVirtualApplianceName, String expand, Context context);

    /**
     * Updates a Network Virtual Appliance.
     *
     * @param resourceGroupName The resource group name of Network Virtual Appliance.
     * @param networkVirtualApplianceName The name of Network Virtual Appliance being updated.
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkVirtualAppliance Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<NetworkVirtualApplianceInner>> updateTagsWithResponseAsync(
        String resourceGroupName, String networkVirtualApplianceName, Map<String, String> tags);

    /**
     * Updates a Network Virtual Appliance.
     *
     * @param resourceGroupName The resource group name of Network Virtual Appliance.
     * @param networkVirtualApplianceName The name of Network Virtual Appliance being updated.
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkVirtualAppliance Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<NetworkVirtualApplianceInner> updateTagsAsync(
        String resourceGroupName, String networkVirtualApplianceName, Map<String, String> tags);

    /**
     * Updates a Network Virtual Appliance.
     *
     * @param resourceGroupName The resource group name of Network Virtual Appliance.
     * @param networkVirtualApplianceName The name of Network Virtual Appliance being updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkVirtualAppliance Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<NetworkVirtualApplianceInner> updateTagsAsync(String resourceGroupName, String networkVirtualApplianceName);

    /**
     * Updates a Network Virtual Appliance.
     *
     * @param resourceGroupName The resource group name of Network Virtual Appliance.
     * @param networkVirtualApplianceName The name of Network Virtual Appliance being updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkVirtualAppliance Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkVirtualApplianceInner updateTags(String resourceGroupName, String networkVirtualApplianceName);

    /**
     * Updates a Network Virtual Appliance.
     *
     * @param resourceGroupName The resource group name of Network Virtual Appliance.
     * @param networkVirtualApplianceName The name of Network Virtual Appliance being updated.
     * @param tags Resource tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkVirtualAppliance Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<NetworkVirtualApplianceInner> updateTagsWithResponse(
        String resourceGroupName, String networkVirtualApplianceName, Map<String, String> tags, Context context);

    /**
     * Creates or updates the specified Network Virtual Appliance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of Network Virtual Appliance.
     * @param parameters NetworkVirtualAppliance Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkVirtualAppliance Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(
        String resourceGroupName, String networkVirtualApplianceName, NetworkVirtualApplianceInner parameters);

    /**
     * Creates or updates the specified Network Virtual Appliance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of Network Virtual Appliance.
     * @param parameters NetworkVirtualAppliance Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkVirtualAppliance Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<NetworkVirtualApplianceInner>, NetworkVirtualApplianceInner> beginCreateOrUpdateAsync(
        String resourceGroupName, String networkVirtualApplianceName, NetworkVirtualApplianceInner parameters);

    /**
     * Creates or updates the specified Network Virtual Appliance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of Network Virtual Appliance.
     * @param parameters NetworkVirtualAppliance Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkVirtualAppliance Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<NetworkVirtualApplianceInner>, NetworkVirtualApplianceInner> beginCreateOrUpdate(
        String resourceGroupName, String networkVirtualApplianceName, NetworkVirtualApplianceInner parameters);

    /**
     * Creates or updates the specified Network Virtual Appliance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of Network Virtual Appliance.
     * @param parameters NetworkVirtualAppliance Resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkVirtualAppliance Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<NetworkVirtualApplianceInner>, NetworkVirtualApplianceInner> beginCreateOrUpdate(
        String resourceGroupName,
        String networkVirtualApplianceName,
        NetworkVirtualApplianceInner parameters,
        Context context);

    /**
     * Creates or updates the specified Network Virtual Appliance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of Network Virtual Appliance.
     * @param parameters NetworkVirtualAppliance Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkVirtualAppliance Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<NetworkVirtualApplianceInner> createOrUpdateAsync(
        String resourceGroupName, String networkVirtualApplianceName, NetworkVirtualApplianceInner parameters);

    /**
     * Creates or updates the specified Network Virtual Appliance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of Network Virtual Appliance.
     * @param parameters NetworkVirtualAppliance Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkVirtualAppliance Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkVirtualApplianceInner createOrUpdate(
        String resourceGroupName, String networkVirtualApplianceName, NetworkVirtualApplianceInner parameters);

    /**
     * Creates or updates the specified Network Virtual Appliance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of Network Virtual Appliance.
     * @param parameters NetworkVirtualAppliance Resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return networkVirtualAppliance Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkVirtualApplianceInner createOrUpdate(
        String resourceGroupName,
        String networkVirtualApplianceName,
        NetworkVirtualApplianceInner parameters,
        Context context);

    /**
     * Lists all Network Virtual Appliances in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListNetworkVirtualAppliances API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<NetworkVirtualApplianceInner> listByResourceGroupAsync(String resourceGroupName);

    /**
     * Lists all Network Virtual Appliances in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListNetworkVirtualAppliances API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NetworkVirtualApplianceInner> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all Network Virtual Appliances in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListNetworkVirtualAppliances API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NetworkVirtualApplianceInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets all Network Virtual Appliances in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Network Virtual Appliances in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<NetworkVirtualApplianceInner> listAsync();

    /**
     * Gets all Network Virtual Appliances in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Network Virtual Appliances in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NetworkVirtualApplianceInner> list();

    /**
     * Gets all Network Virtual Appliances in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Network Virtual Appliances in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NetworkVirtualApplianceInner> list(Context context);
}
