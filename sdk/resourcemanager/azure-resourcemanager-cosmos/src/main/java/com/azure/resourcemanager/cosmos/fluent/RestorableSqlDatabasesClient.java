// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.cosmos.fluent.models.RestorableSqlDatabaseGetResultInner;

/** An instance of this class provides access to all the operations defined in RestorableSqlDatabasesClient. */
public interface RestorableSqlDatabasesClient {
    /**
     * Show the event feed of all mutations done on all the Azure Cosmos DB SQL databases under the restorable account.
     * This helps in scenario where database was accidentally deleted to get the deletion time. This API requires
     * 'Microsoft.DocumentDB/locations/restorableDatabaseAccounts/.../read' permission.
     *
     * @param location Cosmos DB region, with spaces between words and each word capitalized.
     * @param instanceId The instanceId GUID of a restorable database account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the SQL database events and their properties.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<RestorableSqlDatabaseGetResultInner> listAsync(String location, String instanceId);

    /**
     * Show the event feed of all mutations done on all the Azure Cosmos DB SQL databases under the restorable account.
     * This helps in scenario where database was accidentally deleted to get the deletion time. This API requires
     * 'Microsoft.DocumentDB/locations/restorableDatabaseAccounts/.../read' permission.
     *
     * @param location Cosmos DB region, with spaces between words and each word capitalized.
     * @param instanceId The instanceId GUID of a restorable database account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the SQL database events and their properties.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RestorableSqlDatabaseGetResultInner> list(String location, String instanceId);

    /**
     * Show the event feed of all mutations done on all the Azure Cosmos DB SQL databases under the restorable account.
     * This helps in scenario where database was accidentally deleted to get the deletion time. This API requires
     * 'Microsoft.DocumentDB/locations/restorableDatabaseAccounts/.../read' permission.
     *
     * @param location Cosmos DB region, with spaces between words and each word capitalized.
     * @param instanceId The instanceId GUID of a restorable database account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the SQL database events and their properties.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RestorableSqlDatabaseGetResultInner> list(String location, String instanceId, Context context);
}
