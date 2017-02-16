/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A node agent SKU supported by the Batch service.
 * The Batch node agent is a program that runs on each node in the pool, and
 * provides the command-and-control interface between the node and the Batch
 * service. There are different implementations of the node agent, known as
 * SKUs, for different operating systems.
 */
public class NodeAgentSku {
    /**
     * The ID of the node agent SKU.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The list of images verified to be compatible with this node agent SKU.
     * This collection is not exhaustive (the node agent may be compatible with
     * other images).
     */
    @JsonProperty(value = "verifiedImageReferences")
    private List<ImageReference> verifiedImageReferences;

    /**
     * The type of operating system (e.g. Windows or Linux) compatible with the
     * node agent SKU.
     * Possible values include: 'linux', 'windows', 'unmapped'.
     */
    @JsonProperty(value = "osType")
    private OSType osType;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the NodeAgentSku object itself.
     */
    public NodeAgentSku withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the verifiedImageReferences value.
     *
     * @return the verifiedImageReferences value
     */
    public List<ImageReference> verifiedImageReferences() {
        return this.verifiedImageReferences;
    }

    /**
     * Set the verifiedImageReferences value.
     *
     * @param verifiedImageReferences the verifiedImageReferences value to set
     * @return the NodeAgentSku object itself.
     */
    public NodeAgentSku withVerifiedImageReferences(List<ImageReference> verifiedImageReferences) {
        this.verifiedImageReferences = verifiedImageReferences;
        return this;
    }

    /**
     * Get the osType value.
     *
     * @return the osType value
     */
    public OSType osType() {
        return this.osType;
    }

    /**
     * Set the osType value.
     *
     * @param osType the osType value to set
     * @return the NodeAgentSku object itself.
     */
    public NodeAgentSku withOsType(OSType osType) {
        this.osType = osType;
        return this;
    }

}
