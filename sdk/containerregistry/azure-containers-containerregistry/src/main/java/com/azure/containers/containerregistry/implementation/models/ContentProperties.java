// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ContentProperties model. */
@Fluent
public final class ContentProperties {
    /*
     * Delete enabled
     */
    @JsonProperty(value = "deleteEnabled")
    private Boolean canDelete;

    /*
     * Write enabled
     */
    @JsonProperty(value = "writeEnabled")
    private Boolean canWrite;

    /*
     * List enabled
     */
    @JsonProperty(value = "listEnabled")
    private Boolean canList;

    /*
     * Read enabled
     */
    @JsonProperty(value = "readEnabled")
    private Boolean canRead;

    /**
     * Get the canDelete property: Delete enabled.
     *
     * @return the canDelete value.
     */
    public Boolean isCanDelete() {
        return this.canDelete;
    }

    /**
     * Set the canDelete property: Delete enabled.
     *
     * @param canDelete the canDelete value to set.
     * @return the ContentProperties object itself.
     */
    public ContentProperties setCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
        return this;
    }

    /**
     * Get the canWrite property: Write enabled.
     *
     * @return the canWrite value.
     */
    public Boolean isCanWrite() {
        return this.canWrite;
    }

    /**
     * Set the canWrite property: Write enabled.
     *
     * @param canWrite the canWrite value to set.
     * @return the ContentProperties object itself.
     */
    public ContentProperties setCanWrite(Boolean canWrite) {
        this.canWrite = canWrite;
        return this;
    }

    /**
     * Get the canList property: List enabled.
     *
     * @return the canList value.
     */
    public Boolean isCanList() {
        return this.canList;
    }

    /**
     * Set the canList property: List enabled.
     *
     * @param canList the canList value to set.
     * @return the ContentProperties object itself.
     */
    public ContentProperties setCanList(Boolean canList) {
        this.canList = canList;
        return this;
    }

    /**
     * Get the canRead property: Read enabled.
     *
     * @return the canRead value.
     */
    public Boolean isCanRead() {
        return this.canRead;
    }

    /**
     * Set the canRead property: Read enabled.
     *
     * @param canRead the canRead value to set.
     * @return the ContentProperties object itself.
     */
    public ContentProperties setCanRead(Boolean canRead) {
        this.canRead = canRead;
        return this;
    }
}
