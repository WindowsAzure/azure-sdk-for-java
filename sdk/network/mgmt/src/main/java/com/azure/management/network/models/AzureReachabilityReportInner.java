// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.management.network.AzureReachabilityReportItem;
import com.azure.management.network.AzureReachabilityReportLocation;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The AzureReachabilityReport model.
 */
@Fluent
public final class AzureReachabilityReportInner {
    /*
     * The aggregation level of Azure reachability report. Can be Country,
     * State or City.
     */
    @JsonProperty(value = "aggregationLevel", required = true)
    private String aggregationLevel;

    /*
     * Parameters that define a geographic location.
     */
    @JsonProperty(value = "providerLocation", required = true)
    private AzureReachabilityReportLocation providerLocation;

    /*
     * List of Azure reachability report items.
     */
    @JsonProperty(value = "reachabilityReport", required = true)
    private List<AzureReachabilityReportItem> reachabilityReport;

    /**
     * Get the aggregationLevel property: The aggregation level of Azure
     * reachability report. Can be Country, State or City.
     * 
     * @return the aggregationLevel value.
     */
    public String aggregationLevel() {
        return this.aggregationLevel;
    }

    /**
     * Set the aggregationLevel property: The aggregation level of Azure
     * reachability report. Can be Country, State or City.
     * 
     * @param aggregationLevel the aggregationLevel value to set.
     * @return the AzureReachabilityReportInner object itself.
     */
    public AzureReachabilityReportInner withAggregationLevel(String aggregationLevel) {
        this.aggregationLevel = aggregationLevel;
        return this;
    }

    /**
     * Get the providerLocation property: Parameters that define a geographic
     * location.
     * 
     * @return the providerLocation value.
     */
    public AzureReachabilityReportLocation providerLocation() {
        return this.providerLocation;
    }

    /**
     * Set the providerLocation property: Parameters that define a geographic
     * location.
     * 
     * @param providerLocation the providerLocation value to set.
     * @return the AzureReachabilityReportInner object itself.
     */
    public AzureReachabilityReportInner withProviderLocation(AzureReachabilityReportLocation providerLocation) {
        this.providerLocation = providerLocation;
        return this;
    }

    /**
     * Get the reachabilityReport property: List of Azure reachability report
     * items.
     * 
     * @return the reachabilityReport value.
     */
    public List<AzureReachabilityReportItem> reachabilityReport() {
        return this.reachabilityReport;
    }

    /**
     * Set the reachabilityReport property: List of Azure reachability report
     * items.
     * 
     * @param reachabilityReport the reachabilityReport value to set.
     * @return the AzureReachabilityReportInner object itself.
     */
    public AzureReachabilityReportInner withReachabilityReport(List<AzureReachabilityReportItem> reachabilityReport) {
        this.reachabilityReport = reachabilityReport;
        return this;
    }
}
