/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.frontdoor.v2020_05_01.implementation;

import org.joda.time.DateTime;
import java.util.List;
import com.microsoft.azure.management.frontdoor.v2020_05_01.LatencyMetric;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * Defines the LatencyScorecard.
 */
@JsonFlatten
@SkipParentValidation
public class LatencyScorecardInner extends Resource {
    /**
     * The unique identifier of the Latency Scorecard.
     */
    @JsonProperty(value = "properties.id", access = JsonProperty.Access.WRITE_ONLY)
    private String latencyScorecardId;

    /**
     * The name of the Latency Scorecard.
     */
    @JsonProperty(value = "properties.name", access = JsonProperty.Access.WRITE_ONLY)
    private String latencyScorecardName;

    /**
     * The description of the Latency Scorecard.
     */
    @JsonProperty(value = "properties.description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /**
     * The A endpoint in the scorecard.
     */
    @JsonProperty(value = "properties.endpointA", access = JsonProperty.Access.WRITE_ONLY)
    private String endpointA;

    /**
     * The B endpoint in the scorecard.
     */
    @JsonProperty(value = "properties.endpointB", access = JsonProperty.Access.WRITE_ONLY)
    private String endpointB;

    /**
     * The start time of the Latency Scorecard in UTC.
     */
    @JsonProperty(value = "properties.startDateTimeUTC", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime startDateTimeUTC;

    /**
     * The end time of the Latency Scorecard in UTC.
     */
    @JsonProperty(value = "properties.endDateTimeUTC", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime endDateTimeUTC;

    /**
     * The country associated with the Latency Scorecard. Values are country
     * ISO codes as specified here-
     * https://www.iso.org/iso-3166-country-codes.html.
     */
    @JsonProperty(value = "properties.country", access = JsonProperty.Access.WRITE_ONLY)
    private String country;

    /**
     * The latency metrics of the Latency Scorecard.
     */
    @JsonProperty(value = "properties.latencyMetrics")
    private List<LatencyMetric> latencyMetrics;

    /**
     * Get the unique identifier of the Latency Scorecard.
     *
     * @return the latencyScorecardId value
     */
    public String latencyScorecardId() {
        return this.latencyScorecardId;
    }

    /**
     * Get the name of the Latency Scorecard.
     *
     * @return the latencyScorecardName value
     */
    public String latencyScorecardName() {
        return this.latencyScorecardName;
    }

    /**
     * Get the description of the Latency Scorecard.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the A endpoint in the scorecard.
     *
     * @return the endpointA value
     */
    public String endpointA() {
        return this.endpointA;
    }

    /**
     * Get the B endpoint in the scorecard.
     *
     * @return the endpointB value
     */
    public String endpointB() {
        return this.endpointB;
    }

    /**
     * Get the start time of the Latency Scorecard in UTC.
     *
     * @return the startDateTimeUTC value
     */
    public DateTime startDateTimeUTC() {
        return this.startDateTimeUTC;
    }

    /**
     * Get the end time of the Latency Scorecard in UTC.
     *
     * @return the endDateTimeUTC value
     */
    public DateTime endDateTimeUTC() {
        return this.endDateTimeUTC;
    }

    /**
     * Get the country associated with the Latency Scorecard. Values are country ISO codes as specified here- https://www.iso.org/iso-3166-country-codes.html.
     *
     * @return the country value
     */
    public String country() {
        return this.country;
    }

    /**
     * Get the latency metrics of the Latency Scorecard.
     *
     * @return the latencyMetrics value
     */
    public List<LatencyMetric> latencyMetrics() {
        return this.latencyMetrics;
    }

    /**
     * Set the latency metrics of the Latency Scorecard.
     *
     * @param latencyMetrics the latencyMetrics value to set
     * @return the LatencyScorecardInner object itself.
     */
    public LatencyScorecardInner withLatencyMetrics(List<LatencyMetric> latencyMetrics) {
        this.latencyMetrics = latencyMetrics;
        return this;
    }

}
