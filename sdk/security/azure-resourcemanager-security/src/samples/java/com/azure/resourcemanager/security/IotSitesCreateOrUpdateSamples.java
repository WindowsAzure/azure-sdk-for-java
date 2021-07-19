// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security;

import com.azure.core.util.Context;
import com.azure.resourcemanager.security.fluent.models.IotSitesModelInner;
import java.util.HashMap;
import java.util.Map;

/** Samples for IotSites CreateOrUpdate. */
public final class IotSitesCreateOrUpdateSamples {
    /**
     * Sample code: Create or update IoT site.
     *
     * @param securityManager Entry point to SecurityManager. API spec for Microsoft.Security (Azure Security Center)
     *     resource provider.
     */
    public static void createOrUpdateIoTSite(com.azure.resourcemanager.security.SecurityManager securityManager) {
        securityManager
            .iotSites()
            .createOrUpdateWithResponse(
                "subscriptions/20ff7fc3-e762-44dd-bd96-b71116dcdc23/resourceGroups/myRg/providers/Microsoft.Devices/IotHubs/myHub",
                new IotSitesModelInner()
                    .withDisplayName("IoT site name")
                    .withTags(mapOf("key1", "value1", "key2", "value2")),
                Context.NONE);
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
