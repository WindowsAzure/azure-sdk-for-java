/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventhubs.v2015_08_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.eventhubs.v2015_08_01.implementation.ConsumerGroupsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ConsumerGroups.
 */
public interface ConsumerGroups extends SupportsCreating<ConsumerGroupResource.DefinitionStages.Blank>, HasInner<ConsumerGroupsInner> {
    /**
     * Gets a description for the specified consumer group.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name
     * @param eventHubName The Event Hub name
     * @param consumerGroupName The consumer group name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ConsumerGroupResource> getAsync(String resourceGroupName, String namespaceName, String eventHubName, String consumerGroupName);

    /**
     * Gets all the consumer groups in a Namespace. An empty feed is returned if no consumer group exists in the Namespace.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name
     * @param eventHubName The Event Hub name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ConsumerGroupResource> listAllAsync(final String resourceGroupName, final String namespaceName, final String eventHubName);

    /**
     * Deletes a consumer group from the specified Event Hub and resource group.
     *
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param namespaceName The Namespace name
     * @param eventHubName The Event Hub name
     * @param consumerGroupName The consumer group name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String namespaceName, String eventHubName, String consumerGroupName);

}
