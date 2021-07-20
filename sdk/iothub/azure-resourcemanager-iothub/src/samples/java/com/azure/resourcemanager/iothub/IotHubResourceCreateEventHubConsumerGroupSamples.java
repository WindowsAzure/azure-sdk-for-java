// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub;

import com.azure.resourcemanager.iothub.models.EventHubConsumerGroupName;

/** Samples for IotHubResource CreateEventHubConsumerGroup. */
public final class IotHubResourceCreateEventHubConsumerGroupSamples {
    /**
     * Sample code: IotHubResource_CreateEventHubConsumerGroup.
     *
     * @param iotHubManager Entry point to IotHubManager. Use this API to manage the IoT hubs in your Azure
     *     subscription.
     */
    public static void iotHubResourceCreateEventHubConsumerGroup(
        com.azure.resourcemanager.iothub.IotHubManager iotHubManager) {
        iotHubManager
            .iotHubResources()
            .defineEventHubConsumerGroup("test")
            .withExistingEventHubEndpoint("myResourceGroup", "testHub", "events")
            .withProperties(new EventHubConsumerGroupName().withName("test"))
            .create();
    }
}
