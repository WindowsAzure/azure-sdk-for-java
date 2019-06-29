// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob.blob.models;

import com.azure.storage.blob.models.RetentionPolicy;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * Azure Analytics Logging settings.
 */
@JacksonXmlRootElement(localName = "Logging")
public final class Logging {
    /*
     * The version of Storage Analytics to configure.
     */
    @JsonProperty(value = "Version", required = true)
    private String version;

    /*
     * Indicates whether all delete requests should be logged.
     */
    @JsonProperty(value = "Delete", required = true)
    private boolean delete;

    /*
     * Indicates whether all read requests should be logged.
     */
    @JsonProperty(value = "Read", required = true)
    private boolean read;

    /*
     * Indicates whether all write requests should be logged.
     */
    @JsonProperty(value = "Write", required = true)
    private boolean write;

    /*
     * The retentionPolicy property.
     */
    @JsonProperty(value = "RetentionPolicy", required = true)
    private RetentionPolicy retentionPolicy;

    /**
     * Get the version property: The version of Storage Analytics to configure.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: The version of Storage Analytics to configure.
     *
     * @param version the version value to set.
     * @return the Logging object itself.
     */
    public Logging version(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the delete property: Indicates whether all delete requests should be
     * logged.
     *
     * @return the delete value.
     */
    public boolean delete() {
        return this.delete;
    }

    /**
     * Set the delete property: Indicates whether all delete requests should be
     * logged.
     *
     * @param delete the delete value to set.
     * @return the Logging object itself.
     */
    public Logging delete(boolean delete) {
        this.delete = delete;
        return this;
    }

    /**
     * Get the read property: Indicates whether all read requests should be
     * logged.
     *
     * @return the read value.
     */
    public boolean read() {
        return this.read;
    }

    /**
     * Set the read property: Indicates whether all read requests should be
     * logged.
     *
     * @param read the read value to set.
     * @return the Logging object itself.
     */
    public Logging read(boolean read) {
        this.read = read;
        return this;
    }

    /**
     * Get the write property: Indicates whether all write requests should be
     * logged.
     *
     * @return the write value.
     */
    public boolean write() {
        return this.write;
    }

    /**
     * Set the write property: Indicates whether all write requests should be
     * logged.
     *
     * @param write the write value to set.
     * @return the Logging object itself.
     */
    public Logging write(boolean write) {
        this.write = write;
        return this;
    }

    /**
     * Get the retentionPolicy property: The retentionPolicy property.
     *
     * @return the retentionPolicy value.
     */
    public RetentionPolicy retentionPolicy() {
        return this.retentionPolicy;
    }

    /**
     * Set the retentionPolicy property: The retentionPolicy property.
     *
     * @param retentionPolicy the retentionPolicy value to set.
     * @return the Logging object itself.
     */
    public Logging retentionPolicy(RetentionPolicy retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
        return this;
    }
}
