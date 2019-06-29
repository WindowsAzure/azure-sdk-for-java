// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.file.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Storage service properties.
 */
@JacksonXmlRootElement(localName = "StorageServiceProperties")
public final class StorageServiceProperties {
    /*
     * A summary of request statistics grouped by API in hourly aggregates for
     * files.
     */
    @JsonProperty(value = "HourMetrics")
    private Metrics hourMetrics;

    /*
     * A summary of request statistics grouped by API in minute aggregates for
     * files.
     */
    @JsonProperty(value = "MinuteMetrics")
    private Metrics minuteMetrics;

    private static final class CorsWrapper {
        @JacksonXmlProperty(localName = "CorsRule")
        private final List<CorsRule> items;

        @JsonCreator
        private CorsWrapper(@JacksonXmlProperty(localName = "CorsRule") List<CorsRule> items) {
            this.items = items;
        }
    }

    /*
     * The set of CORS rules.
     */
    @JsonProperty(value = "Cors")
    private CorsWrapper cors;

    /**
     * Get the hourMetrics property: A summary of request statistics grouped by
     * API in hourly aggregates for files.
     *
     * @return the hourMetrics value.
     */
    public Metrics hourMetrics() {
        return this.hourMetrics;
    }

    /**
     * Set the hourMetrics property: A summary of request statistics grouped by
     * API in hourly aggregates for files.
     *
     * @param hourMetrics the hourMetrics value to set.
     * @return the StorageServiceProperties object itself.
     */
    public StorageServiceProperties hourMetrics(Metrics hourMetrics) {
        this.hourMetrics = hourMetrics;
        return this;
    }

    /**
     * Get the minuteMetrics property: A summary of request statistics grouped
     * by API in minute aggregates for files.
     *
     * @return the minuteMetrics value.
     */
    public Metrics minuteMetrics() {
        return this.minuteMetrics;
    }

    /**
     * Set the minuteMetrics property: A summary of request statistics grouped
     * by API in minute aggregates for files.
     *
     * @param minuteMetrics the minuteMetrics value to set.
     * @return the StorageServiceProperties object itself.
     */
    public StorageServiceProperties minuteMetrics(Metrics minuteMetrics) {
        this.minuteMetrics = minuteMetrics;
        return this;
    }

    /**
     * Get the cors property: The set of CORS rules.
     *
     * @return the cors value.
     */
    public List<CorsRule> cors() {
        if (this.cors == null) {
            this.cors = new CorsWrapper(new ArrayList<CorsRule>());
        }
        return this.cors.items;
    }

    /**
     * Set the cors property: The set of CORS rules.
     *
     * @param cors the cors value to set.
     * @return the StorageServiceProperties object itself.
     */
    public StorageServiceProperties cors(List<CorsRule> cors) {
        this.cors = new CorsWrapper(cors);
        return this;
    }
}
