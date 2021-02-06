// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A copy activity file system sink. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("FileSystemSink")
@Fluent
public final class FileSystemSink extends CopySink {
    /*
     * The type of copy behavior for copy sink.
     */
    @JsonProperty(value = "copyBehavior")
    private Object copyBehavior;

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
     * @return the FileSystemSink object itself.
     */
    public FileSystemSink setCopyBehavior(Object copyBehavior) {
        this.copyBehavior = copyBehavior;
        return this;
    }
}
