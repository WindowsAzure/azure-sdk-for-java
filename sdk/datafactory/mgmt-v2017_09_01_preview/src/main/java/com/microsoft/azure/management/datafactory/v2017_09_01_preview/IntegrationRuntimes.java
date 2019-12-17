/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2017_09_01_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.datafactory.v2017_09_01_preview.implementation.IntegrationRuntimesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing IntegrationRuntimes.
 */
public interface IntegrationRuntimes extends SupportsCreating<IntegrationRuntimeResource.DefinitionStages.Blank>, HasInner<IntegrationRuntimesInner> {
    /**
     * Gets detailed status information for an integration runtime.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<IntegrationRuntimeStatusResponse> getStatusAsync(String resourceGroupName, String factoryName, String integrationRuntimeName);

    /**
     * Gets the on-premises integration runtime connection information for encrypting the on-premises data source credentials.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<IntegrationRuntimeConnectionInfo> getConnectionInfoAsync(String resourceGroupName, String factoryName, String integrationRuntimeName);

    /**
     * Regenerates the authentication key for an integration runtime.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<IntegrationRuntimeAuthKeys> regenerateAuthKeyAsync(String resourceGroupName, String factoryName, String integrationRuntimeName);

    /**
     * Retrieves the authentication keys for an integration runtime.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<IntegrationRuntimeAuthKeys> listAuthKeysAsync(String resourceGroupName, String factoryName, String integrationRuntimeName);

    /**
     * Starts a ManagedReserved type integration runtime.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<IntegrationRuntimeStatusResponse> startAsync(String resourceGroupName, String factoryName, String integrationRuntimeName);

    /**
     * Stops a ManagedReserved type integration runtime.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable stopAsync(String resourceGroupName, String factoryName, String integrationRuntimeName);

    /**
     * Remove a node from integration runtime.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @param removeNodeParameters The name of the node to be removed from an integration runtime.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable removeNodeAsync(String resourceGroupName, String factoryName, String integrationRuntimeName, IntegrationRuntimeRemoveNodeRequest removeNodeParameters);

    /**
     * Force the integration runtime to synchronize credentials across integration runtime nodes, and this will override the credentials across all worker nodes with those available on the dispatcher node. If you already have the latest credential backup file, you should manually import it (preferred) on any self-hosted integration runtime node than using this API directly.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable syncCredentialsAsync(String resourceGroupName, String factoryName, String integrationRuntimeName);

    /**
     * Get the integration runtime monitoring data, which includes the monitor data for all the nodes under this integration runtime.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<IntegrationRuntimeMonitoringData> getMonitoringDataAsync(String resourceGroupName, String factoryName, String integrationRuntimeName);

    /**
     * Upgrade self-hosted integration runtime to latest version if availability.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable upgradeAsync(String resourceGroupName, String factoryName, String integrationRuntimeName);

    /**
     * Gets an integration runtime.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<IntegrationRuntimeResource> getAsync(String resourceGroupName, String factoryName, String integrationRuntimeName);

    /**
     * Lists integration runtimes.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<IntegrationRuntimeResource> listByFactoryAsync(final String resourceGroupName, final String factoryName);

    /**
     * Deletes an integration runtime.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String factoryName, String integrationRuntimeName);

}
