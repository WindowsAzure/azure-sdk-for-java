/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2018_12_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.iothub.v2018_12_01_preview.implementation.EventHubConsumerGroupInfoInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.iothub.v2018_12_01_preview.implementation.IoTHubManager;
import java.util.Map;

/**
 * Type representing EventHubConsumerGroupInfo.
 */
public interface EventHubConsumerGroupInfo extends HasInner<EventHubConsumerGroupInfoInner>, Indexable, Refreshable<EventHubConsumerGroupInfo>, Updatable<EventHubConsumerGroupInfo.Update>, HasManager<IoTHubManager> {
    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the properties value.
     */
    Map<String, String> properties();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the EventHubConsumerGroupInfo definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithEventHubEndpoint, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of EventHubConsumerGroupInfo definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a EventHubConsumerGroupInfo definition.
         */
        interface Blank extends WithEventHubEndpoint {
        }

        /**
         * The stage of the eventhubconsumergroupinfo definition allowing to specify EventHubEndpoint.
         */
        interface WithEventHubEndpoint {
           /**
            * Specifies resourceGroupName, resourceName, eventHubEndpointName.
            * @param resourceGroupName The name of the resource group that contains the IoT hub
            * @param resourceName The name of the IoT hub
            * @param eventHubEndpointName The name of the Event Hub-compatible endpoint in the IoT hub
            * @return the next definition stage
            */
            WithCreate withExistingEventHubEndpoint(String resourceGroupName, String resourceName, String eventHubEndpointName);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<EventHubConsumerGroupInfo> {
        }
    }
    /**
     * The template for a EventHubConsumerGroupInfo update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<EventHubConsumerGroupInfo> {
    }

    /**
     * Grouping of EventHubConsumerGroupInfo update stages.
     */
    interface UpdateStages {
    }
}
