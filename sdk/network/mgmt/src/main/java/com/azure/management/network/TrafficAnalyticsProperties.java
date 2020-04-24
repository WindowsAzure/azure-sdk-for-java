// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The TrafficAnalyticsProperties model. */
@Fluent
public final class TrafficAnalyticsProperties {
    /*
     * Parameters that define the configuration of traffic analytics.
     */
    @JsonProperty(value = "networkWatcherFlowAnalyticsConfiguration", required = true)
    private TrafficAnalyticsConfigurationProperties networkWatcherFlowAnalyticsConfiguration;

    /**
     * Get the networkWatcherFlowAnalyticsConfiguration property: Parameters that define the configuration of traffic
     * analytics.
     *
     * @return the networkWatcherFlowAnalyticsConfiguration value.
     */
    public TrafficAnalyticsConfigurationProperties networkWatcherFlowAnalyticsConfiguration() {
        return this.networkWatcherFlowAnalyticsConfiguration;
    }

    /**
     * Set the networkWatcherFlowAnalyticsConfiguration property: Parameters that define the configuration of traffic
     * analytics.
     *
     * @param networkWatcherFlowAnalyticsConfiguration the networkWatcherFlowAnalyticsConfiguration value to set.
     * @return the TrafficAnalyticsProperties object itself.
     */
    public TrafficAnalyticsProperties withNetworkWatcherFlowAnalyticsConfiguration(
        TrafficAnalyticsConfigurationProperties networkWatcherFlowAnalyticsConfiguration) {
        this.networkWatcherFlowAnalyticsConfiguration = networkWatcherFlowAnalyticsConfiguration;
        return this;
    }
}
