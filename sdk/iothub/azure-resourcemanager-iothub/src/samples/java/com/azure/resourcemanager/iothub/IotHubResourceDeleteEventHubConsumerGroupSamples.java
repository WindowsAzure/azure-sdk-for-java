// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub;

import com.azure.core.util.Context;

/** Samples for IotHubResource DeleteEventHubConsumerGroup. */
public final class IotHubResourceDeleteEventHubConsumerGroupSamples {
    /**
     * Sample code: IotHubResource_DeleteEventHubConsumerGroup.
     *
     * @param iotHubManager Entry point to IotHubManager. Use this API to manage the IoT hubs in your Azure
     *     subscription.
     */
    public static void iotHubResourceDeleteEventHubConsumerGroup(
        com.azure.resourcemanager.iothub.IotHubManager iotHubManager) {
        iotHubManager
            .iotHubResources()
            .deleteEventHubConsumerGroupWithResponse("myResourceGroup", "testHub", "events", "test", Context.NONE);
    }
}
