// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub;

import com.azure.core.util.Context;
import com.azure.resourcemanager.iothub.models.IotHubDescription;
import java.util.HashMap;
import java.util.Map;

/** Samples for IotHubResource Update. */
public final class IotHubResourceUpdateSamples {
    /**
     * Sample code: IotHubResource_Update.
     *
     * @param iotHubManager Entry point to IotHubManager. Use this API to manage the IoT hubs in your Azure
     *     subscription.
     */
    public static void iotHubResourceUpdate(com.azure.resourcemanager.iothub.IotHubManager iotHubManager) {
        IotHubDescription resource =
            iotHubManager
                .iotHubResources()
                .getByResourceGroupWithResponse("myResourceGroup", "myHub", Context.NONE)
                .getValue();
        resource.update().withTags(mapOf("foo", "bar")).apply();
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
