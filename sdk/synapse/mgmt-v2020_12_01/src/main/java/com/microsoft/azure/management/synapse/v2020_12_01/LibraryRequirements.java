/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020_12_01;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Spark pool library version requirements.
 * Library requirements for a Big Data pool powered by Apache Spark.
 */
public class LibraryRequirements {
    /**
     * The last update time of the library requirements file.
     */
    @JsonProperty(value = "time", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime time;

    /**
     * The library requirements.
     */
    @JsonProperty(value = "content")
    private String content;

    /**
     * The filename of the library requirements file.
     */
    @JsonProperty(value = "filename")
    private String filename;

    /**
     * Get the last update time of the library requirements file.
     *
     * @return the time value
     */
    public DateTime time() {
        return this.time;
    }

    /**
     * Get the library requirements.
     *
     * @return the content value
     */
    public String content() {
        return this.content;
    }

    /**
     * Set the library requirements.
     *
     * @param content the content value to set
     * @return the LibraryRequirements object itself.
     */
    public LibraryRequirements withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * Get the filename of the library requirements file.
     *
     * @return the filename value
     */
    public String filename() {
        return this.filename;
    }

    /**
     * Set the filename of the library requirements file.
     *
     * @param filename the filename value to set
     * @return the LibraryRequirements object itself.
     */
    public LibraryRequirements withFilename(String filename) {
        this.filename = filename;
        return this;
    }

}
