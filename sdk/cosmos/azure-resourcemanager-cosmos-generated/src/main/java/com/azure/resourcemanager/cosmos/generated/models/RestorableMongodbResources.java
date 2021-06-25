// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/** Resource collection API of RestorableMongodbResources. */
public interface RestorableMongodbResources {
    /**
     * Return a list of database and collection combo that exist on the account at the given timestamp and location.
     * This helps in scenarios to validate what resources exist at given timestamp and location. This API requires
     * 'Microsoft.DocumentDB/locations/restorableDatabaseAccounts/.../read' permission.
     *
     * @param location Cosmos DB region, with spaces between words and each word capitalized.
     * @param instanceId The instanceId GUID of a restorable database account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the restorable MongoDB resources.
     */
    PagedIterable<DatabaseRestoreResource> list(String location, String instanceId);

    /**
     * Return a list of database and collection combo that exist on the account at the given timestamp and location.
     * This helps in scenarios to validate what resources exist at given timestamp and location. This API requires
     * 'Microsoft.DocumentDB/locations/restorableDatabaseAccounts/.../read' permission.
     *
     * @param location Cosmos DB region, with spaces between words and each word capitalized.
     * @param instanceId The instanceId GUID of a restorable database account.
     * @param restoreLocation The location where the restorable resources are located.
     * @param restoreTimestampInUtc The timestamp when the restorable resources existed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the restorable MongoDB resources.
     */
    PagedIterable<DatabaseRestoreResource> list(
        String location, String instanceId, String restoreLocation, String restoreTimestampInUtc, Context context);
}
