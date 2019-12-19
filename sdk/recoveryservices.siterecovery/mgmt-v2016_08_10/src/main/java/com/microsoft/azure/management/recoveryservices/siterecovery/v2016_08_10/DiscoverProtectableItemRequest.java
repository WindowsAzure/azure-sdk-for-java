/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Request to add a physical machine as a protectable item in a container.
 */
public class DiscoverProtectableItemRequest {
    /**
     * The properties of a discover protectable item request.
     */
    @JsonProperty(value = "properties")
    private DiscoverProtectableItemRequestProperties properties;

    /**
     * Get the properties of a discover protectable item request.
     *
     * @return the properties value
     */
    public DiscoverProtectableItemRequestProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties of a discover protectable item request.
     *
     * @param properties the properties value to set
     * @return the DiscoverProtectableItemRequest object itself.
     */
    public DiscoverProtectableItemRequest withProperties(DiscoverProtectableItemRequestProperties properties) {
        this.properties = properties;
        return this;
    }

}
