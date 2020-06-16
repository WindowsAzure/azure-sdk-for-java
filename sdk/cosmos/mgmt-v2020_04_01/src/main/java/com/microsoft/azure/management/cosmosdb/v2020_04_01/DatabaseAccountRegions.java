/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_04_01;

import rx.Observable;
import com.microsoft.azure.management.cosmosdb.v2020_04_01.implementation.DatabaseAccountRegionsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing DatabaseAccountRegions.
 */
public interface DatabaseAccountRegions extends HasInner<DatabaseAccountRegionsInner> {
    /**
     * Retrieves the metrics determined by the given filter for the given database account and region.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param region Cosmos DB region, with spaces between words and each word capitalized.
     * @param filter An OData filter expression that describes a subset of metrics to return. The parameters that can be filtered are name.value (name of the metric, can have an or of multiple names), startTime, endTime, and timeGrain. The supported operator is eq.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DatabaseAccountMetric> listMetricsAsync(String resourceGroupName, String accountName, String region, String filter);

}
