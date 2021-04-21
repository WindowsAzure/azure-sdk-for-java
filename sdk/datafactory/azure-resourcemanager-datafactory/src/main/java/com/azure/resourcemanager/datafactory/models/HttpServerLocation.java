// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The location of http server. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("HttpServerLocation")
@Fluent
public final class HttpServerLocation extends DatasetLocation {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(HttpServerLocation.class);

    /*
     * Specify the relativeUrl of http server. Type: string (or Expression with
     * resultType string)
     */
    @JsonProperty(value = "relativeUrl")
    private Object relativeUrl;

    /**
     * Get the relativeUrl property: Specify the relativeUrl of http server. Type: string (or Expression with resultType
     * string).
     *
     * @return the relativeUrl value.
     */
    public Object relativeUrl() {
        return this.relativeUrl;
    }

    /**
     * Set the relativeUrl property: Specify the relativeUrl of http server. Type: string (or Expression with resultType
     * string).
     *
     * @param relativeUrl the relativeUrl value to set.
     * @return the HttpServerLocation object itself.
     */
    public HttpServerLocation withRelativeUrl(Object relativeUrl) {
        this.relativeUrl = relativeUrl;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HttpServerLocation withFolderPath(Object folderPath) {
        super.withFolderPath(folderPath);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HttpServerLocation withFileName(Object fileName) {
        super.withFileName(fileName);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
