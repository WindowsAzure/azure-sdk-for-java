// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A copy activity Azure Data Lake Store sink. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureDataLakeStoreSink")
@Fluent
public final class AzureDataLakeStoreSink extends CopySink {
    /*
     * The type of copy behavior for copy sink.
     */
    @JsonProperty(value = "copyBehavior")
    private Object copyBehavior;

    /*
     * Single File Parallel.
     */
    @JsonProperty(value = "enableAdlsSingleFileParallel")
    private Object enableAdlsSingleFileParallel;

    /**
     * Get the copyBehavior property: The type of copy behavior for copy sink.
     *
     * @return the copyBehavior value.
     */
    public Object getCopyBehavior() {
        return this.copyBehavior;
    }

    /**
     * Set the copyBehavior property: The type of copy behavior for copy sink.
     *
     * @param copyBehavior the copyBehavior value to set.
     * @return the AzureDataLakeStoreSink object itself.
     */
    public AzureDataLakeStoreSink setCopyBehavior(Object copyBehavior) {
        this.copyBehavior = copyBehavior;
        return this;
    }

    /**
     * Get the enableAdlsSingleFileParallel property: Single File Parallel.
     *
     * @return the enableAdlsSingleFileParallel value.
     */
    public Object getEnableAdlsSingleFileParallel() {
        return this.enableAdlsSingleFileParallel;
    }

    /**
     * Set the enableAdlsSingleFileParallel property: Single File Parallel.
     *
     * @param enableAdlsSingleFileParallel the enableAdlsSingleFileParallel value to set.
     * @return the AzureDataLakeStoreSink object itself.
     */
    public AzureDataLakeStoreSink setEnableAdlsSingleFileParallel(Object enableAdlsSingleFileParallel) {
        this.enableAdlsSingleFileParallel = enableAdlsSingleFileParallel;
        return this;
    }
}
