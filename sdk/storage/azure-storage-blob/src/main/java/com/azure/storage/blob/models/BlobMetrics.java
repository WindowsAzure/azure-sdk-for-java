// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/** a summary of request statistics grouped by API in hour or minute aggregates for blobs. */
@JacksonXmlRootElement(localName = "Metrics")
@Fluent
public final class BlobMetrics {
    /*
     * The version of Storage Analytics to configure.
     */
    @JsonProperty(value = "Version")
    private String version;

    /*
     * Indicates whether metrics are enabled for the Blob service.
     */
    @JsonProperty(value = "Enabled", required = true)
    private boolean enabled;

    /*
     * the retention policy which determines how long the associated data
     * should persist
     */
    @JsonProperty(value = "RetentionPolicy")
    private BlobRetentionPolicy retentionPolicy;

    /*
     * Indicates whether metrics should generate summary statistics for called
     * API operations.
     */
    @JsonProperty(value = "IncludeAPIs")
    private Boolean includeApis;

    /**
     * Get the version property: The version of Storage Analytics to configure.
     *
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Set the version property: The version of Storage Analytics to configure.
     *
     * @param version the version value to set.
     * @return the BlobMetrics object itself.
     */
    public BlobMetrics setVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the enabled property: Indicates whether metrics are enabled for the Blob service.
     *
     * @return the enabled value.
     */
    public boolean isEnabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Indicates whether metrics are enabled for the Blob service.
     *
     * @param enabled the enabled value to set.
     * @return the BlobMetrics object itself.
     */
    public BlobMetrics setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the retentionPolicy property: the retention policy which determines how long the associated data should
     * persist.
     *
     * @return the retentionPolicy value.
     */
    public BlobRetentionPolicy getRetentionPolicy() {
        return this.retentionPolicy;
    }

    /**
     * Set the retentionPolicy property: the retention policy which determines how long the associated data should
     * persist.
     *
     * @param retentionPolicy the retentionPolicy value to set.
     * @return the BlobMetrics object itself.
     */
    public BlobMetrics setRetentionPolicy(BlobRetentionPolicy retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
        return this;
    }

    /**
     * Get the includeApis property: Indicates whether metrics should generate summary statistics for called API
     * operations.
     *
     * @return the includeApis value.
     */
    public Boolean isIncludeApis() {
        return this.includeApis;
    }

    /**
     * Set the includeApis property: Indicates whether metrics should generate summary statistics for called API
     * operations.
     *
     * @param includeApis the includeApis value to set.
     * @return the BlobMetrics object itself.
     */
    public BlobMetrics setIncludeApis(Boolean includeApis) {
        this.includeApis = includeApis;
        return this;
    }
}
