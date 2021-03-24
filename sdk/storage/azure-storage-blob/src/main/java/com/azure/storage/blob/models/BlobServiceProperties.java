// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.util.ArrayList;
import java.util.List;

/** Storage Service Properties. */
@JacksonXmlRootElement(localName = "StorageServiceProperties")
@Fluent
public final class BlobServiceProperties {
    /*
     * Azure Analytics Logging settings.
     */
    @JsonProperty(value = "Logging")
    private BlobAnalyticsLogging logging;

    /*
     * a summary of request statistics grouped by API in hour or minute
     * aggregates for blobs
     */
    @JsonProperty(value = "HourMetrics")
    private BlobMetrics hourMetrics;

    /*
     * a summary of request statistics grouped by API in hour or minute
     * aggregates for blobs
     */
    @JsonProperty(value = "MinuteMetrics")
    private BlobMetrics minuteMetrics;

    private static final class CorsWrapper {
        @JacksonXmlProperty(localName = "CorsRule")
        private final List<BlobCorsRule> items;

        @JsonCreator
        private CorsWrapper(@JacksonXmlProperty(localName = "CorsRule") List<BlobCorsRule> items) {
            this.items = items;
        }
    }

    /*
     * The set of CORS rules.
     */
    @JsonProperty(value = "Cors")
    private CorsWrapper cors;

    /*
     * The default version to use for requests to the Blob service if an
     * incoming request's version is not specified. Possible values include
     * version 2008-10-27 and all more recent versions
     */
    @JsonProperty(value = "DefaultServiceVersion")
    private String defaultServiceVersion;

    /*
     * the retention policy which determines how long the associated data
     * should persist
     */
    @JsonProperty(value = "DeleteRetentionPolicy")
    private BlobRetentionPolicy deleteRetentionPolicy;

    /*
     * The properties that enable an account to host a static website
     */
    @JsonProperty(value = "StaticWebsite")
    private StaticWebsite staticWebsite;

    /**
     * Get the logging property: Azure Analytics Logging settings.
     *
     * @return the logging value.
     */
    public BlobAnalyticsLogging getLogging() {
        return this.logging;
    }

    /**
     * Set the logging property: Azure Analytics Logging settings.
     *
     * @param logging the logging value to set.
     * @return the BlobServiceProperties object itself.
     */
    public BlobServiceProperties setLogging(BlobAnalyticsLogging logging) {
        this.logging = logging;
        return this;
    }

    /**
     * Get the hourMetrics property: a summary of request statistics grouped by API in hour or minute aggregates for
     * blobs.
     *
     * @return the hourMetrics value.
     */
    public BlobMetrics getHourMetrics() {
        return this.hourMetrics;
    }

    /**
     * Set the hourMetrics property: a summary of request statistics grouped by API in hour or minute aggregates for
     * blobs.
     *
     * @param hourMetrics the hourMetrics value to set.
     * @return the BlobServiceProperties object itself.
     */
    public BlobServiceProperties setHourMetrics(BlobMetrics hourMetrics) {
        this.hourMetrics = hourMetrics;
        return this;
    }

    /**
     * Get the minuteMetrics property: a summary of request statistics grouped by API in hour or minute aggregates for
     * blobs.
     *
     * @return the minuteMetrics value.
     */
    public BlobMetrics getMinuteMetrics() {
        return this.minuteMetrics;
    }

    /**
     * Set the minuteMetrics property: a summary of request statistics grouped by API in hour or minute aggregates for
     * blobs.
     *
     * @param minuteMetrics the minuteMetrics value to set.
     * @return the BlobServiceProperties object itself.
     */
    public BlobServiceProperties setMinuteMetrics(BlobMetrics minuteMetrics) {
        this.minuteMetrics = minuteMetrics;
        return this;
    }

    /**
     * Get the cors property: The set of CORS rules.
     *
     * @return the cors value.
     */
    public List<BlobCorsRule> getCors() {
        if (this.cors == null) {
            this.cors = new CorsWrapper(new ArrayList<BlobCorsRule>());
        }
        return this.cors.items;
    }

    /**
     * Set the cors property: The set of CORS rules.
     *
     * @param cors the cors value to set.
     * @return the BlobServiceProperties object itself.
     */
    public BlobServiceProperties setCors(List<BlobCorsRule> cors) {
        this.cors = new CorsWrapper(cors);
        return this;
    }

    /**
     * Get the defaultServiceVersion property: The default version to use for requests to the Blob service if an
     * incoming request's version is not specified. Possible values include version 2008-10-27 and all more recent
     * versions.
     *
     * @return the defaultServiceVersion value.
     */
    public String getDefaultServiceVersion() {
        return this.defaultServiceVersion;
    }

    /**
     * Set the defaultServiceVersion property: The default version to use for requests to the Blob service if an
     * incoming request's version is not specified. Possible values include version 2008-10-27 and all more recent
     * versions.
     *
     * @param defaultServiceVersion the defaultServiceVersion value to set.
     * @return the BlobServiceProperties object itself.
     */
    public BlobServiceProperties setDefaultServiceVersion(String defaultServiceVersion) {
        this.defaultServiceVersion = defaultServiceVersion;
        return this;
    }

    /**
     * Get the deleteRetentionPolicy property: the retention policy which determines how long the associated data should
     * persist.
     *
     * @return the deleteRetentionPolicy value.
     */
    public BlobRetentionPolicy getDeleteRetentionPolicy() {
        return this.deleteRetentionPolicy;
    }

    /**
     * Set the deleteRetentionPolicy property: the retention policy which determines how long the associated data should
     * persist.
     *
     * @param deleteRetentionPolicy the deleteRetentionPolicy value to set.
     * @return the BlobServiceProperties object itself.
     */
    public BlobServiceProperties setDeleteRetentionPolicy(BlobRetentionPolicy deleteRetentionPolicy) {
        this.deleteRetentionPolicy = deleteRetentionPolicy;
        return this;
    }

    /**
     * Get the staticWebsite property: The properties that enable an account to host a static website.
     *
     * @return the staticWebsite value.
     */
    public StaticWebsite getStaticWebsite() {
        return this.staticWebsite;
    }

    /**
     * Set the staticWebsite property: The properties that enable an account to host a static website.
     *
     * @param staticWebsite the staticWebsite value to set.
     * @return the BlobServiceProperties object itself.
     */
    public BlobServiceProperties setStaticWebsite(StaticWebsite staticWebsite) {
        this.staticWebsite = staticWebsite;
        return this;
    }
}
