package com.microsoft.azure.tables.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The TableServiceProperties model. */
@Fluent
public final class TableServiceProperties {
    /*
     * Azure Analytics Logging settings.
     */
    @JsonProperty(value = "Logging")
    private Logging logging;

    /*
     * A summary of request statistics grouped by API in hourly aggregates for
     * tables.
     */
    @JsonProperty(value = "HourMetrics")
    private Metrics hourMetrics;

    /*
     * A summary of request statistics grouped by API in minute aggregates for
     * tables.
     */
    @JsonProperty(value = "MinuteMetrics")
    private Metrics minuteMetrics;

    /*
     * The set of CORS rules.
     */
    @JsonProperty(value = "Cors")
    private List<CorsRule> cors;

    /**
     * Get the logging property: Azure Analytics Logging settings.
     *
     * @return the logging value.
     */
    public Logging getLogging() {
        return this.logging;
    }

    /**
     * Set the logging property: Azure Analytics Logging settings.
     *
     * @param logging the logging value to set.
     * @return the TableServiceProperties object itself.
     */
    public TableServiceProperties setLogging(Logging logging) {
        this.logging = logging;
        return this;
    }

    /**
     * Get the hourMetrics property: A summary of request statistics grouped by API in hourly aggregates for tables.
     *
     * @return the hourMetrics value.
     */
    public Metrics getHourMetrics() {
        return this.hourMetrics;
    }

    /**
     * Set the hourMetrics property: A summary of request statistics grouped by API in hourly aggregates for tables.
     *
     * @param hourMetrics the hourMetrics value to set.
     * @return the TableServiceProperties object itself.
     */
    public TableServiceProperties setHourMetrics(Metrics hourMetrics) {
        this.hourMetrics = hourMetrics;
        return this;
    }

    /**
     * Get the minuteMetrics property: A summary of request statistics grouped by API in minute aggregates for tables.
     *
     * @return the minuteMetrics value.
     */
    public Metrics getMinuteMetrics() {
        return this.minuteMetrics;
    }

    /**
     * Set the minuteMetrics property: A summary of request statistics grouped by API in minute aggregates for tables.
     *
     * @param minuteMetrics the minuteMetrics value to set.
     * @return the TableServiceProperties object itself.
     */
    public TableServiceProperties setMinuteMetrics(Metrics minuteMetrics) {
        this.minuteMetrics = minuteMetrics;
        return this;
    }

    /**
     * Get the cors property: The set of CORS rules.
     *
     * @return the cors value.
     */
    public List<CorsRule> getCors() {
        return this.cors;
    }

    /**
     * Set the cors property: The set of CORS rules.
     *
     * @param cors the cors value to set.
     * @return the TableServiceProperties object itself.
     */
    public TableServiceProperties setCors(List<CorsRule> cors) {
        this.cors = cors;
        return this;
    }
}
