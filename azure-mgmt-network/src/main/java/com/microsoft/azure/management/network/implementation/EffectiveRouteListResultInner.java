/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.implementation;

import java.util.List;
import com.microsoft.azure.management.network.EffectiveRoute;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response for list effective route API service call.
 */
public class EffectiveRouteListResultInner {
    /**
     * A list of effective routes.
     */
    @JsonProperty(value = "value")
    private List<EffectiveRoute> value;

    /**
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public List<EffectiveRoute> value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     * @return the EffectiveRouteListResultInner object itself.
     */
    public EffectiveRouteListResultInner withValue(List<EffectiveRoute> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink value.
     *
     * @return the nextLink value
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink value.
     *
     * @param nextLink the nextLink value to set
     * @return the EffectiveRouteListResultInner object itself.
     */
    public EffectiveRouteListResultInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

}
