/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_08_01.implementation;

import java.util.List;
import com.microsoft.azure.management.network.v2020_08_01.PeerRoute;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * List of virtual router peer routes.
 */
public class PeerRouteListInner {
    /**
     * List of peer routes.
     */
    @JsonProperty(value = "value")
    private List<PeerRoute> value;

    /**
     * Get list of peer routes.
     *
     * @return the value value
     */
    public List<PeerRoute> value() {
        return this.value;
    }

    /**
     * Set list of peer routes.
     *
     * @param value the value value to set
     * @return the PeerRouteListInner object itself.
     */
    public PeerRouteListInner withValue(List<PeerRoute> value) {
        this.value = value;
        return this;
    }

}
