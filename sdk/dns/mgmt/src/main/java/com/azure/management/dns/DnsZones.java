/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.azure.management.dns;

import com.azure.core.annotation.Fluent;
import com.azure.management.dns.models.ZonesInner;
import com.azure.management.resources.fluentcore.arm.collection.SupportsBatchDeletion;
import com.azure.management.resources.fluentcore.arm.collection.SupportsDeletingByResourceGroup;
import com.azure.management.resources.fluentcore.arm.collection.SupportsGettingById;
import com.azure.management.resources.fluentcore.arm.collection.SupportsGettingByResourceGroup;
import com.azure.management.resources.fluentcore.arm.collection.SupportsListingByResourceGroup;
import com.azure.management.resources.fluentcore.arm.models.HasManager;
import com.azure.management.resources.fluentcore.collection.SupportsBatchCreation;
import com.azure.management.resources.fluentcore.collection.SupportsCreating;
import com.azure.management.resources.fluentcore.collection.SupportsDeletingById;
import com.azure.management.resources.fluentcore.collection.SupportsListing;
import com.azure.management.resources.fluentcore.model.HasInner;
import com.azure.management.dns.implementation.DnsZoneManager;
import reactor.core.publisher.Mono;

/**
 * Entry point to DNS zone management API in Azure.
 */
@Fluent
public interface DnsZones extends
        SupportsCreating<DnsZone.DefinitionStages.Blank>,
        SupportsListing<DnsZone>,
        SupportsListingByResourceGroup<DnsZone>,
        SupportsGettingByResourceGroup<DnsZone>,
        SupportsGettingById<DnsZone>,
        SupportsDeletingById,
        SupportsDeletingByResourceGroup,
        SupportsBatchCreation<DnsZone>,
        SupportsBatchDeletion,
        HasManager<DnsZoneManager>,
        HasInner<ZonesInner> {
    /**
     * Asynchronously deletes the zone from Azure, identifying it by its name and its resource group.
     *
     * @param resourceGroupName the resource group the resource is part of
     * @param zoneName the name of the zone
     * @param eTagValue the ETag value to set on IfMatch header for concurrency protection
     * @return a representation of the deferred computation this delete call
     */
    Mono<Void> deleteByResourceGroupNameAsync(String resourceGroupName, String zoneName, String eTagValue);
    /**
     * Asynchronously delete the zone from Azure, identifying it by its resource ID.
     *
     * @param id the resource ID of the resource to delete
     * @param eTagValue the ETag value to set on IfMatch header for concurrency protection
     * @return a representation of the deferred computation this delete call
     */
    Mono<Void> deleteByIdAsync(String id, String eTagValue);
    /**
     * Deletes the zone from Azure, identifying it by its name and its resource group.
     *
     * @param resourceGroupName the resource group the resource is part of
     * @param zoneName the name of the zone
     * @param eTagValue the ETag value to set on IfMatch header for concurrency protection
     */
    void deleteByResourceGroupName(String resourceGroupName, String zoneName, String eTagValue);
    /**
     * Deletes a resource from Azure, identifying it by its resource ID.
     *
     * @param id the resource ID of the resource to delete
     * @param eTagValue the ETag value to set on IfMatch header for concurrency protection
     */
    void deleteById(String id, String eTagValue);
}
