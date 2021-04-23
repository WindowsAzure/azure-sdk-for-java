// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents a .rdp file. */
@Fluent
public final class RdpConnectionInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RdpConnectionInner.class);

    /*
     * The contents of the .rdp file
     */
    @JsonProperty(value = "contents")
    private String contents;

    /**
     * Get the contents property: The contents of the .rdp file.
     *
     * @return the contents value.
     */
    public String contents() {
        return this.contents;
    }

    /**
     * Set the contents property: The contents of the .rdp file.
     *
     * @param contents the contents value to set.
     * @return the RdpConnectionInner object itself.
     */
    public RdpConnectionInner withContents(String contents) {
        this.contents = contents;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
