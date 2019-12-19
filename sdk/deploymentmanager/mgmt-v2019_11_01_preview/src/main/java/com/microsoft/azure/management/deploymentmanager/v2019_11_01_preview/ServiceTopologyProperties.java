/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.deploymentmanager.v2019_11_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties of a service topology.
 */
public class ServiceTopologyProperties {
    /**
     * The resource Id of the artifact source that contains the artifacts that
     * can be referenced in the service units.
     */
    @JsonProperty(value = "artifactSourceId")
    private String artifactSourceId;

    /**
     * Get the resource Id of the artifact source that contains the artifacts that can be referenced in the service units.
     *
     * @return the artifactSourceId value
     */
    public String artifactSourceId() {
        return this.artifactSourceId;
    }

    /**
     * Set the resource Id of the artifact source that contains the artifacts that can be referenced in the service units.
     *
     * @param artifactSourceId the artifactSourceId value to set
     * @return the ServiceTopologyProperties object itself.
     */
    public ServiceTopologyProperties withArtifactSourceId(String artifactSourceId) {
        this.artifactSourceId = artifactSourceId;
        return this;
    }

}
