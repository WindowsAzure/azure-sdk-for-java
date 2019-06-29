// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.queue.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * The Metrics model.
 */
@JacksonXmlRootElement(localName = "Metrics")
public final class Metrics {
    /*
     * The version of Storage Analytics to configure.
     */
    @JsonProperty(value = "Version")
    private String version;

    /*
     * Indicates whether metrics are enabled for the Queue service.
     */
    @JsonProperty(value = "Enabled", required = true)
    private boolean enabled;

    /*
     * Indicates whether metrics should generate summary statistics for called
     * API operations.
     */
    @JsonProperty(value = "IncludeAPIs")
    private Boolean includeAPIs;

    /*
     * The retentionPolicy property.
     */
    @JsonProperty(value = "RetentionPolicy")
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
     * @return the Metrics object itself.
     */
    public Metrics version(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the enabled property: Indicates whether metrics are enabled for the
     * Queue service.
     *
     * @return the enabled value.
     */
    public boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Indicates whether metrics are enabled for the
     * Queue service.
     *
     * @param enabled the enabled value to set.
     * @return the Metrics object itself.
     */
    public Metrics enabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the includeAPIs property: Indicates whether metrics should generate
     * summary statistics for called API operations.
     *
     * @return the includeAPIs value.
     */
    public Boolean includeAPIs() {
        return this.includeAPIs;
    }

    /**
     * Set the includeAPIs property: Indicates whether metrics should generate
     * summary statistics for called API operations.
     *
     * @param includeAPIs the includeAPIs value to set.
     * @return the Metrics object itself.
     */
    public Metrics includeAPIs(Boolean includeAPIs) {
        this.includeAPIs = includeAPIs;
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
     * @return the Metrics object itself.
     */
    public Metrics retentionPolicy(RetentionPolicy retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
        return this;
    }
}
