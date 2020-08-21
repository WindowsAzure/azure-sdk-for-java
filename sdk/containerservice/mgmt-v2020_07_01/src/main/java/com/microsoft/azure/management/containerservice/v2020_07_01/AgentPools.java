/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2020_07_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.containerservice.v2020_07_01.implementation.AgentPoolsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing AgentPools.
 */
public interface AgentPools extends SupportsCreating<AgentPool.DefinitionStages.Blank>, HasInner<AgentPoolsInner> {
    /**
     * Gets the agent pool.
     * Gets the details of the agent pool by managed cluster and resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the managed cluster resource.
     * @param agentPoolName The name of the agent pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AgentPool> getAsync(String resourceGroupName, String resourceName, String agentPoolName);

    /**
     * Gets a list of agent pools in the specified managed cluster.
     * Gets a list of agent pools in the specified managed cluster. The operation returns properties of each agent pool.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the managed cluster resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AgentPool> listAsync(final String resourceGroupName, final String resourceName);

    /**
     * Deletes an agent pool.
     * Deletes the agent pool in the specified managed cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the managed cluster resource.
     * @param agentPoolName The name of the agent pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String resourceName, String agentPoolName);

    /**
     * Gets upgrade profile for an agent pool.
     * Gets the details of the upgrade profile for an agent pool with a specified resource group and managed cluster name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the managed cluster resource.
     * @param agentPoolName The name of the agent pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AgentPoolUpgradeProfile> getUpgradeProfileAsync(String resourceGroupName, String resourceName, String agentPoolName);

    /**
     * Gets a list of supported versions for the specified agent pool.
     * Gets a list of supported versions for the specified agent pool.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the managed cluster resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AgentPoolAvailableVersions> getAvailableAgentPoolVersionsAsync(String resourceGroupName, String resourceName);

}
