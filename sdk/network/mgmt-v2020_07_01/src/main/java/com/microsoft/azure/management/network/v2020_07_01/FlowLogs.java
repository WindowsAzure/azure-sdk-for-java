/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.network.v2020_07_01.implementation.FlowLogsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing FlowLogs.
 */
public interface FlowLogs extends SupportsCreating<FlowLog.DefinitionStages.Blank>, HasInner<FlowLogsInner> {
    /**
     * Gets a flow log resource by name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param flowLogName The name of the flow log resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<FlowLog> getAsync(String resourceGroupName, String networkWatcherName, String flowLogName);

    /**
     * Lists all flow log resources for the specified Network Watcher.
     *
     * @param resourceGroupName The name of the resource group containing Network Watcher.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<FlowLog> listAsync(final String resourceGroupName, final String networkWatcherName);

    /**
     * Deletes the specified flow log resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param flowLogName The name of the flow log resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String networkWatcherName, String flowLogName);

}
