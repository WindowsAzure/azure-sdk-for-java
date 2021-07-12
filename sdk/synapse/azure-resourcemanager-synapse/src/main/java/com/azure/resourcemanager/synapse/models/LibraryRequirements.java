// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Library requirements for a Big Data pool powered by Apache Spark. */
@Fluent
public final class LibraryRequirements {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LibraryRequirements.class);

    /*
     * The last update time of the library requirements file.
     */
    @JsonProperty(value = "time", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime time;

    /*
     * The library requirements.
     */
    @JsonProperty(value = "content")
    private String content;

    /*
     * The filename of the library requirements file.
     */
    @JsonProperty(value = "filename")
    private String filename;

    /**
     * Get the time property: The last update time of the library requirements file.
     *
     * @return the time value.
     */
    public OffsetDateTime time() {
        return this.time;
    }

    /**
     * Get the content property: The library requirements.
     *
     * @return the content value.
     */
    public String content() {
        return this.content;
    }

    /**
     * Set the content property: The library requirements.
     *
     * @param content the content value to set.
     * @return the LibraryRequirements object itself.
     */
    public LibraryRequirements withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * Get the filename property: The filename of the library requirements file.
     *
     * @return the filename value.
     */
    public String filename() {
        return this.filename;
    }

    /**
     * Set the filename property: The filename of the library requirements file.
     *
     * @param filename the filename value to set.
     * @return the LibraryRequirements object itself.
     */
    public LibraryRequirements withFilename(String filename) {
        this.filename = filename;
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
