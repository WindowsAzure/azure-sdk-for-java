/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventhubs.v2018_01_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.eventhubs.v2018_01_01_preview.implementation.EventHubsManager;
import com.microsoft.azure.management.eventhubs.v2018_01_01_preview.implementation.ClusterQuotaConfigurationPropertiesInner;
import java.util.Map;

/**
 * Type representing ClusterQuotaConfigurationProperties.
 */
public interface ClusterQuotaConfigurationProperties extends HasInner<ClusterQuotaConfigurationPropertiesInner>, HasManager<EventHubsManager> {
    /**
     * @return the settings value.
     */
    Map<String, String> settings();

}
