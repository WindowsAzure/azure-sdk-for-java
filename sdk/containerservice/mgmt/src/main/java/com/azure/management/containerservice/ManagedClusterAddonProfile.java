// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerservice;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * The ManagedClusterAddonProfile model.
 */
@Fluent
public final class ManagedClusterAddonProfile {
    /*
     * Whether the add-on is enabled or not.
     */
    @JsonProperty(value = "enabled", required = true)
    private boolean enabled;

    /*
     * Key-value pairs for configuring an add-on.
     */
    @JsonProperty(value = "config")
    private Map<String, String> config;

    /**
     * Get the enabled property: Whether the add-on is enabled or not.
     * 
     * @return the enabled value.
     */
    public boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Whether the add-on is enabled or not.
     * 
     * @param enabled the enabled value to set.
     * @return the ManagedClusterAddonProfile object itself.
     */
    public ManagedClusterAddonProfile withEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the config property: Key-value pairs for configuring an add-on.
     * 
     * @return the config value.
     */
    public Map<String, String> config() {
        return this.config;
    }

    /**
     * Set the config property: Key-value pairs for configuring an add-on.
     * 
     * @param config the config value to set.
     * @return the ManagedClusterAddonProfile object itself.
     */
    public ManagedClusterAddonProfile withConfig(Map<String, String> config) {
        this.config = config;
        return this;
    }
}
