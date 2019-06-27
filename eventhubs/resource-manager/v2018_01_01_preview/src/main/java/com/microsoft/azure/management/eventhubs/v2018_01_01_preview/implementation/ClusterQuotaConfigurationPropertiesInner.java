/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventhubs.v2018_01_01_preview.implementation;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains all settings for the cluster.
 */
public class ClusterQuotaConfigurationPropertiesInner {
    /**
     * All possible Cluster settings - a collection of key/value paired
     * settings which apply to quotas and configurations imposed on the
     * cluster.
     */
    @JsonProperty(value = "settings")
    private Map<String, String> settings;

    /**
     * Get all possible Cluster settings - a collection of key/value paired settings which apply to quotas and configurations imposed on the cluster.
     *
     * @return the settings value
     */
    public Map<String, String> settings() {
        return this.settings;
    }

    /**
     * Set all possible Cluster settings - a collection of key/value paired settings which apply to quotas and configurations imposed on the cluster.
     *
     * @param settings the settings value to set
     * @return the ClusterQuotaConfigurationPropertiesInner object itself.
     */
    public ClusterQuotaConfigurationPropertiesInner withSettings(Map<String, String> settings) {
        this.settings = settings;
        return this;
    }

}
