/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_06_01_preview;

import rx.Observable;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.implementation.RestorableMongodbResourcesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing RestorableMongodbResources.
 */
public interface RestorableMongodbResources extends HasInner<RestorableMongodbResourcesInner> {
    /**
     * Lists all the restorable Azure Cosmos DB MongoDB resources available for a specific database account at a given time and location.
     *
     * @param location Cosmos DB region, with spaces between words and each word capitalized.
     * @param instanceId The instanceId GUID of a restorable database account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RestorableDatabaseAccountLocationDatabaseRestoreResourceModel> listAsync(String location, String instanceId);

}
