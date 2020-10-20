// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dns.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.dns.fluent.models.ZoneInner;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsDelete;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsGet;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsListing;
import java.nio.ByteBuffer;
import java.util.Map;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ZonesClient. */
public interface ZonesClient
    extends InnerSupportsGet<ZoneInner>, InnerSupportsListing<ZoneInner>, InnerSupportsDelete<Void> {
    /**
     * Creates or updates a DNS zone. Does not modify DNS records within the zone.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @param parameters Describes a DNS zone.
     * @param ifMatch The etag of the DNS zone. Omit this value to always overwrite the current zone. Specify the
     *     last-seen etag value to prevent accidentally overwriting any concurrent changes.
     * @param ifNoneMatch Set to '*' to allow a new DNS zone to be created, but to prevent updating an existing zone.
     *     Other values will be ignored.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a DNS zone.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ZoneInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName, String zoneName, ZoneInner parameters, String ifMatch, String ifNoneMatch);

    /**
     * Creates or updates a DNS zone. Does not modify DNS records within the zone.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @param parameters Describes a DNS zone.
     * @param ifMatch The etag of the DNS zone. Omit this value to always overwrite the current zone. Specify the
     *     last-seen etag value to prevent accidentally overwriting any concurrent changes.
     * @param ifNoneMatch Set to '*' to allow a new DNS zone to be created, but to prevent updating an existing zone.
     *     Other values will be ignored.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a DNS zone.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ZoneInner> createOrUpdateAsync(
        String resourceGroupName, String zoneName, ZoneInner parameters, String ifMatch, String ifNoneMatch);

    /**
     * Creates or updates a DNS zone. Does not modify DNS records within the zone.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @param parameters Describes a DNS zone.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a DNS zone.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ZoneInner> createOrUpdateAsync(String resourceGroupName, String zoneName, ZoneInner parameters);

    /**
     * Creates or updates a DNS zone. Does not modify DNS records within the zone.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @param parameters Describes a DNS zone.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a DNS zone.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ZoneInner createOrUpdate(String resourceGroupName, String zoneName, ZoneInner parameters);

    /**
     * Creates or updates a DNS zone. Does not modify DNS records within the zone.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @param parameters Describes a DNS zone.
     * @param ifMatch The etag of the DNS zone. Omit this value to always overwrite the current zone. Specify the
     *     last-seen etag value to prevent accidentally overwriting any concurrent changes.
     * @param ifNoneMatch Set to '*' to allow a new DNS zone to be created, but to prevent updating an existing zone.
     *     Other values will be ignored.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a DNS zone.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ZoneInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String zoneName,
        ZoneInner parameters,
        String ifMatch,
        String ifNoneMatch,
        Context context);

    /**
     * Deletes a DNS zone. WARNING: All DNS records in the zone will also be deleted. This operation cannot be undone.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @param ifMatch The etag of the DNS zone. Omit this value to always delete the current zone. Specify the last-seen
     *     etag value to prevent accidentally deleting any concurrent changes.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String zoneName, String ifMatch);

    /**
     * Deletes a DNS zone. WARNING: All DNS records in the zone will also be deleted. This operation cannot be undone.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @param ifMatch The etag of the DNS zone. Omit this value to always delete the current zone. Specify the last-seen
     *     etag value to prevent accidentally deleting any concurrent changes.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(String resourceGroupName, String zoneName, String ifMatch);

    /**
     * Deletes a DNS zone. WARNING: All DNS records in the zone will also be deleted. This operation cannot be undone.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @param ifMatch The etag of the DNS zone. Omit this value to always delete the current zone. Specify the last-seen
     *     etag value to prevent accidentally deleting any concurrent changes.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String zoneName, String ifMatch);

    /**
     * Deletes a DNS zone. WARNING: All DNS records in the zone will also be deleted. This operation cannot be undone.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @param ifMatch The etag of the DNS zone. Omit this value to always delete the current zone. Specify the last-seen
     *     etag value to prevent accidentally deleting any concurrent changes.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String zoneName, String ifMatch, Context context);

    /**
     * Deletes a DNS zone. WARNING: All DNS records in the zone will also be deleted. This operation cannot be undone.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @param ifMatch The etag of the DNS zone. Omit this value to always delete the current zone. Specify the last-seen
     *     etag value to prevent accidentally deleting any concurrent changes.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String zoneName, String ifMatch);

    /**
     * Deletes a DNS zone. WARNING: All DNS records in the zone will also be deleted. This operation cannot be undone.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String zoneName);

    /**
     * Deletes a DNS zone. WARNING: All DNS records in the zone will also be deleted. This operation cannot be undone.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @param ifMatch The etag of the DNS zone. Omit this value to always delete the current zone. Specify the last-seen
     *     etag value to prevent accidentally deleting any concurrent changes.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String zoneName, String ifMatch);

    /**
     * Deletes a DNS zone. WARNING: All DNS records in the zone will also be deleted. This operation cannot be undone.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @param ifMatch The etag of the DNS zone. Omit this value to always delete the current zone. Specify the last-seen
     *     etag value to prevent accidentally deleting any concurrent changes.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String zoneName, String ifMatch, Context context);

    /**
     * Deletes a DNS zone. WARNING: All DNS records in the zone will also be deleted. This operation cannot be undone.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String zoneName);

    /**
     * Gets a DNS zone. Retrieves the zone properties, but not the record sets within the zone.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a DNS zone.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ZoneInner>> getByResourceGroupWithResponseAsync(String resourceGroupName, String zoneName);

    /**
     * Gets a DNS zone. Retrieves the zone properties, but not the record sets within the zone.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a DNS zone.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ZoneInner> getByResourceGroupAsync(String resourceGroupName, String zoneName);

    /**
     * Gets a DNS zone. Retrieves the zone properties, but not the record sets within the zone.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a DNS zone.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ZoneInner getByResourceGroup(String resourceGroupName, String zoneName);

    /**
     * Gets a DNS zone. Retrieves the zone properties, but not the record sets within the zone.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a DNS zone.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ZoneInner> getByResourceGroupWithResponse(String resourceGroupName, String zoneName, Context context);

    /**
     * Updates a DNS zone. Does not modify DNS records within the zone.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @param ifMatch The etag of the DNS zone. Omit this value to always overwrite the current zone. Specify the
     *     last-seen etag value to prevent accidentally overwriting any concurrent changes.
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a DNS zone.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ZoneInner>> updateWithResponseAsync(
        String resourceGroupName, String zoneName, String ifMatch, Map<String, String> tags);

    /**
     * Updates a DNS zone. Does not modify DNS records within the zone.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @param ifMatch The etag of the DNS zone. Omit this value to always overwrite the current zone. Specify the
     *     last-seen etag value to prevent accidentally overwriting any concurrent changes.
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a DNS zone.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ZoneInner> updateAsync(String resourceGroupName, String zoneName, String ifMatch, Map<String, String> tags);

    /**
     * Updates a DNS zone. Does not modify DNS records within the zone.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a DNS zone.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ZoneInner> updateAsync(String resourceGroupName, String zoneName);

    /**
     * Updates a DNS zone. Does not modify DNS records within the zone.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a DNS zone.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ZoneInner update(String resourceGroupName, String zoneName);

    /**
     * Updates a DNS zone. Does not modify DNS records within the zone.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param zoneName The name of the DNS zone (without a terminating dot).
     * @param ifMatch The etag of the DNS zone. Omit this value to always overwrite the current zone. Specify the
     *     last-seen etag value to prevent accidentally overwriting any concurrent changes.
     * @param tags Resource tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a DNS zone.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ZoneInner> updateWithResponse(
        String resourceGroupName, String zoneName, String ifMatch, Map<String, String> tags, Context context);

    /**
     * Lists the DNS zones within a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param top The maximum number of record sets to return. If not specified, returns up to 100 record sets.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a Zone List or ListAll operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ZoneInner> listByResourceGroupAsync(String resourceGroupName, Integer top);

    /**
     * Lists the DNS zones within a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a Zone List or ListAll operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ZoneInner> listByResourceGroupAsync(String resourceGroupName);

    /**
     * Lists the DNS zones within a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param top The maximum number of record sets to return. If not specified, returns up to 100 record sets.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a Zone List or ListAll operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ZoneInner> listByResourceGroup(String resourceGroupName, Integer top, Context context);

    /**
     * Lists the DNS zones within a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a Zone List or ListAll operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ZoneInner> listByResourceGroup(String resourceGroupName);

    /**
     * Lists the DNS zones in all resource groups in a subscription.
     *
     * @param top The maximum number of DNS zones to return. If not specified, returns up to 100 zones.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a Zone List or ListAll operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ZoneInner> listAsync(Integer top);

    /**
     * Lists the DNS zones in all resource groups in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a Zone List or ListAll operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ZoneInner> listAsync();

    /**
     * Lists the DNS zones in all resource groups in a subscription.
     *
     * @param top The maximum number of DNS zones to return. If not specified, returns up to 100 zones.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a Zone List or ListAll operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ZoneInner> list(Integer top, Context context);

    /**
     * Lists the DNS zones in all resource groups in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a Zone List or ListAll operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ZoneInner> list();
}
