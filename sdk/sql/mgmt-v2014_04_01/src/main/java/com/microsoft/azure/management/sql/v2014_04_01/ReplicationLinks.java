/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2014_04_01;

import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.sql.v2014_04_01.implementation.ReplicationLinksInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ReplicationLinks.
 */
public interface ReplicationLinks extends HasInner<ReplicationLinksInner> {
    /**
     * Sets which replica database is primary by failing over from the current primary replica database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database that has the replication link to be failed over.
     * @param linkId The ID of the replication link to be failed over.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable failoverAsync(String resourceGroupName, String serverName, String databaseName, String linkId);

    /**
     * Sets which replica database is primary by failing over from the current primary replica database. This operation might result in data loss.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database that has the replication link to be failed over.
     * @param linkId The ID of the replication link to be failed over.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable failoverAllowDataLossAsync(String resourceGroupName, String serverName, String databaseName, String linkId);

    /**
     * Deletes a database replication link in forced or friendly way.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database that has the replication link to be failed over.
     * @param linkId The ID of the replication link to be failed over.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable unlinkAsync(String resourceGroupName, String serverName, String databaseName, String linkId);

    /**
     * Gets a database replication link.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database to get the link for.
     * @param linkId The replication link ID to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ReplicationLink> getAsync(String resourceGroupName, String serverName, String databaseName, String linkId);

    /**
     * Lists a database's replication links.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database to retrieve links for.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ReplicationLink> listByDatabaseAsync(String resourceGroupName, String serverName, String databaseName);

    /**
     * Deletes a database replication link. Cannot be done during failover.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database that has the replication link to be dropped.
     * @param linkId The ID of the replication link to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String serverName, String databaseName, String linkId);

}
