/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_06_01_preview;

import rx.Observable;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.implementation.RestorableSqlContainersInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing RestorableSqlContainers.
 */
public interface RestorableSqlContainers extends HasInner<RestorableSqlContainersInner> {
    /**
     * Lists all the restorable Azure Cosmos DB SQL containers available for a specific database.
     *
     * @param location Cosmos DB region, with spaces between words and each word capitalized.
     * @param instanceId The instanceId GUID of a restorable database account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RestorableSqlContainerGetResult> listAsync(String location, String instanceId);

}
