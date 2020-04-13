/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_03_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import rx.Completable;
import java.util.List;
import com.microsoft.azure.management.cosmosdb.v2020_03_01.implementation.DatabaseAccountsInner;
import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.cosmosdb.v2020_03_01.DatabaseAccountMetric;
import com.microsoft.azure.management.cosmosdb.v2020_03_01.DatabaseAccountUsage;
import com.microsoft.azure.management.cosmosdb.v2020_03_01.DatabaseAccountMetricDefinition;

/**
 * Type representing DatabaseAccounts.
 */
public interface DatabaseAccounts extends SupportsCreating<DatabaseAccountGetResults.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<DatabaseAccountGetResults>, SupportsListingByResourceGroup<DatabaseAccountGetResults>, SupportsListing<DatabaseAccountGetResults>, HasInner<DatabaseAccountsInner> {
    /**
     * Changes the failover priority for the Azure Cosmos DB database account. A failover priority of 0 indicates a write region. The maximum value for a failover priority = (total number of regions - 1). Failover priority values must be unique for each of the regions in which the database account exists.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param failoverPolicies List of failover policies.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable failoverPriorityChangeAsync(String resourceGroupName, String accountName, List<FailoverPolicy> failoverPolicies);

    /**
     * Lists the access keys for the specified Azure Cosmos DB database account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DatabaseAccountListKeysResult> listKeysAsync(String resourceGroupName, String accountName);

    /**
     * Lists the connection strings for the specified Azure Cosmos DB database account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DatabaseAccountListConnectionStringsResult> listConnectionStringsAsync(String resourceGroupName, String accountName);

    /**
     * Offline the specified region for the specified Azure Cosmos DB database account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param region Cosmos DB region, with spaces between words and each word capitalized.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable offlineRegionAsync(String resourceGroupName, String accountName, String region);

    /**
     * Online the specified region for the specified Azure Cosmos DB database account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param region Cosmos DB region, with spaces between words and each word capitalized.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable onlineRegionAsync(String resourceGroupName, String accountName, String region);

    /**
     * Lists the read-only access keys for the specified Azure Cosmos DB database account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DatabaseAccountListReadOnlyKeysResult> listReadOnlyKeysAsync(String resourceGroupName, String accountName);

    /**
     * Regenerates an access key for the specified Azure Cosmos DB database account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param keyKind The access key to regenerate. Possible values include: 'primary', 'secondary', 'primaryReadonly', 'secondaryReadonly'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable regenerateKeyAsync(String resourceGroupName, String accountName, KeyKind keyKind);

    /**
     * Lists the read-only access keys for the specified Azure Cosmos DB database account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DatabaseAccountListReadOnlyKeysResult> getReadOnlyKeysAsync(String resourceGroupName, String accountName);

    /**
     * Checks that the Azure Cosmos DB account name already exists. A valid account name may contain only lowercase letters, numbers, and the '-' character, and must be between 3 and 50 characters.
     *
     * @param accountName Cosmos DB database account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Boolean> checkNameExistsAsync(String accountName);

    /**
     * Retrieves the metrics determined by the given filter for the given database account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param filter An OData filter expression that describes a subset of metrics to return. The parameters that can be filtered are name.value (name of the metric, can have an or of multiple names), startTime, endTime, and timeGrain. The supported operator is eq.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DatabaseAccountMetric> listMetricsAsync(String resourceGroupName, String accountName, String filter);

    /**
     * Retrieves the usages (most recent data) for the given database account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DatabaseAccountUsage> listUsagesAsync(String resourceGroupName, String accountName);

    /**
     * Retrieves metric definitions for the given database account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DatabaseAccountMetricDefinition> listMetricDefinitionsAsync(String resourceGroupName, String accountName);

}
