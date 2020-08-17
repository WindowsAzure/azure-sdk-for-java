// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ExportRdbParameters model. */
@Fluent
public final class ExportRdbParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExportRdbParameters.class);

    /*
     * File format.
     */
    @JsonProperty(value = "format")
    private String format;

    /*
     * Prefix to use for exported files.
     */
    @JsonProperty(value = "prefix", required = true)
    private String prefix;

    /*
     * Container name to export to.
     */
    @JsonProperty(value = "container", required = true)
    private String container;

    /**
     * Get the format property: File format.
     *
     * @return the format value.
     */
    public String format() {
        return this.format;
    }

    /**
     * Set the format property: File format.
     *
     * @param format the format value to set.
     * @return the ExportRdbParameters object itself.
     */
    public ExportRdbParameters withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * Get the prefix property: Prefix to use for exported files.
     *
     * @return the prefix value.
     */
    public String prefix() {
        return this.prefix;
    }

    /**
     * Set the prefix property: Prefix to use for exported files.
     *
     * @param prefix the prefix value to set.
     * @return the ExportRdbParameters object itself.
     */
    public ExportRdbParameters withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * Get the container property: Container name to export to.
     *
     * @return the container value.
     */
    public String container() {
        return this.container;
    }

    /**
     * Set the container property: Container name to export to.
     *
     * @param container the container value to set.
     * @return the ExportRdbParameters object itself.
     */
    public ExportRdbParameters withContainer(String container) {
        this.container = container;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (prefix() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property prefix in model ExportRdbParameters"));
        }
        if (container() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property container in model ExportRdbParameters"));
        }
    }
}
