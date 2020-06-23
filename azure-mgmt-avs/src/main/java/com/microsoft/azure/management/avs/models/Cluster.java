/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.avs.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.ProxyResource;

/**
 * A cluster resource.
 */
public class Cluster extends ProxyResource {
    /**
     * The properties of a cluster resource.
     */
    @JsonProperty(value = "properties")
    private ClusterProperties properties;

    /**
     * Get the properties of a cluster resource.
     *
     * @return the properties value
     */
    public ClusterProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties of a cluster resource.
     *
     * @param properties the properties value to set
     * @return the Cluster object itself.
     */
    public Cluster withProperties(ClusterProperties properties) {
        this.properties = properties;
        return this;
    }

}
