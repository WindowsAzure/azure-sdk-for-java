// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ContainerRegistryBlobsGetChunkHeaders model. */
@Fluent
public final class ContainerRegistryBlobsGetChunkHeaders {
    /*
     * The Content-Range property.
     */
    @JsonProperty(value = "Content-Range")
    private String contentRange;

    /*
     * The Content-Length property.
     */
    @JsonProperty(value = "Content-Length")
    private Long contentLength;

    /**
     * Get the contentRange property: The Content-Range property.
     *
     * @return the contentRange value.
     */
    public String getContentRange() {
        return this.contentRange;
    }

    /**
     * Set the contentRange property: The Content-Range property.
     *
     * @param contentRange the contentRange value to set.
     * @return the ContainerRegistryBlobsGetChunkHeaders object itself.
     */
    public ContainerRegistryBlobsGetChunkHeaders setContentRange(String contentRange) {
        this.contentRange = contentRange;
        return this;
    }

    /**
     * Get the contentLength property: The Content-Length property.
     *
     * @return the contentLength value.
     */
    public Long getContentLength() {
        return this.contentLength;
    }

    /**
     * Set the contentLength property: The Content-Length property.
     *
     * @param contentLength the contentLength value to set.
     * @return the ContainerRegistryBlobsGetChunkHeaders object itself.
     */
    public ContainerRegistryBlobsGetChunkHeaders setContentLength(Long contentLength) {
        this.contentLength = contentLength;
        return this;
    }
}
