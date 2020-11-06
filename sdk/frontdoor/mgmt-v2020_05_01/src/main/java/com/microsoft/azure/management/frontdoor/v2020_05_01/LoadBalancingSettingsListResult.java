/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.frontdoor.v2020_05_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Result of the request to list load balancing settings. It contains a list of
 * load balancing settings objects and a URL link to get the next set of
 * results.
 */
public class LoadBalancingSettingsListResult {
    /**
     * List of Backend Pools within a Front Door.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<LoadBalancingSettingsModel> value;

    /**
     * URL to get the next set of LoadBalancingSettings objects if there are
     * any.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get list of Backend Pools within a Front Door.
     *
     * @return the value value
     */
    public List<LoadBalancingSettingsModel> value() {
        return this.value;
    }

    /**
     * Get uRL to get the next set of LoadBalancingSettings objects if there are any.
     *
     * @return the nextLink value
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set uRL to get the next set of LoadBalancingSettings objects if there are any.
     *
     * @param nextLink the nextLink value to set
     * @return the LoadBalancingSettingsListResult object itself.
     */
    public LoadBalancingSettingsListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

}
