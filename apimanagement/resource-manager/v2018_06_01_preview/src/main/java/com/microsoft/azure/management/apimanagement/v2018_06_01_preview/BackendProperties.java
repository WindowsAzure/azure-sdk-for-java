/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties specific to the Backend Type.
 */
public class BackendProperties {
    /**
     * Backend Service Fabric Cluster Properties.
     */
    @JsonProperty(value = "serviceFabricCluster")
    private BackendServiceFabricClusterProperties serviceFabricCluster;

    /**
     * Get backend Service Fabric Cluster Properties.
     *
     * @return the serviceFabricCluster value
     */
    public BackendServiceFabricClusterProperties serviceFabricCluster() {
        return this.serviceFabricCluster;
    }

    /**
     * Set backend Service Fabric Cluster Properties.
     *
     * @param serviceFabricCluster the serviceFabricCluster value to set
     * @return the BackendProperties object itself.
     */
    public BackendProperties withServiceFabricCluster(BackendServiceFabricClusterProperties serviceFabricCluster) {
        this.serviceFabricCluster = serviceFabricCluster;
        return this;
    }

}
