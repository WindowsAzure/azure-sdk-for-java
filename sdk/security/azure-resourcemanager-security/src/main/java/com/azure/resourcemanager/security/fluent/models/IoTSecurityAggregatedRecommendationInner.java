// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.models.ReportedSeverity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** IoT Security solution recommendation information. */
@JsonFlatten
@Fluent
public class IoTSecurityAggregatedRecommendationInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IoTSecurityAggregatedRecommendationInner.class);

    /*
     * Name of the recommendation.
     */
    @JsonProperty(value = "properties.recommendationName")
    private String recommendationName;

    /*
     * Display name of the recommendation type.
     */
    @JsonProperty(value = "properties.recommendationDisplayName", access = JsonProperty.Access.WRITE_ONLY)
    private String recommendationDisplayName;

    /*
     * Description of the suspected vulnerability and meaning.
     */
    @JsonProperty(value = "properties.description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /*
     * Recommendation-type GUID.
     */
    @JsonProperty(value = "properties.recommendationTypeId", access = JsonProperty.Access.WRITE_ONLY)
    private String recommendationTypeId;

    /*
     * Name of the organization that made the recommendation.
     */
    @JsonProperty(value = "properties.detectedBy", access = JsonProperty.Access.WRITE_ONLY)
    private String detectedBy;

    /*
     * Recommended steps for remediation
     */
    @JsonProperty(value = "properties.remediationSteps", access = JsonProperty.Access.WRITE_ONLY)
    private String remediationSteps;

    /*
     * Assessed recommendation severity.
     */
    @JsonProperty(value = "properties.reportedSeverity", access = JsonProperty.Access.WRITE_ONLY)
    private ReportedSeverity reportedSeverity;

    /*
     * Number of healthy devices within the IoT Security solution.
     */
    @JsonProperty(value = "properties.healthyDevices", access = JsonProperty.Access.WRITE_ONLY)
    private Long healthyDevices;

    /*
     * Number of unhealthy devices within the IoT Security solution.
     */
    @JsonProperty(value = "properties.unhealthyDeviceCount", access = JsonProperty.Access.WRITE_ONLY)
    private Long unhealthyDeviceCount;

    /*
     * Log analytics query for getting the list of affected devices/alerts.
     */
    @JsonProperty(value = "properties.logAnalyticsQuery", access = JsonProperty.Access.WRITE_ONLY)
    private String logAnalyticsQuery;

    /*
     * Resource tags
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get the recommendationName property: Name of the recommendation.
     *
     * @return the recommendationName value.
     */
    public String recommendationName() {
        return this.recommendationName;
    }

    /**
     * Set the recommendationName property: Name of the recommendation.
     *
     * @param recommendationName the recommendationName value to set.
     * @return the IoTSecurityAggregatedRecommendationInner object itself.
     */
    public IoTSecurityAggregatedRecommendationInner withRecommendationName(String recommendationName) {
        this.recommendationName = recommendationName;
        return this;
    }

    /**
     * Get the recommendationDisplayName property: Display name of the recommendation type.
     *
     * @return the recommendationDisplayName value.
     */
    public String recommendationDisplayName() {
        return this.recommendationDisplayName;
    }

    /**
     * Get the description property: Description of the suspected vulnerability and meaning.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the recommendationTypeId property: Recommendation-type GUID.
     *
     * @return the recommendationTypeId value.
     */
    public String recommendationTypeId() {
        return this.recommendationTypeId;
    }

    /**
     * Get the detectedBy property: Name of the organization that made the recommendation.
     *
     * @return the detectedBy value.
     */
    public String detectedBy() {
        return this.detectedBy;
    }

    /**
     * Get the remediationSteps property: Recommended steps for remediation.
     *
     * @return the remediationSteps value.
     */
    public String remediationSteps() {
        return this.remediationSteps;
    }

    /**
     * Get the reportedSeverity property: Assessed recommendation severity.
     *
     * @return the reportedSeverity value.
     */
    public ReportedSeverity reportedSeverity() {
        return this.reportedSeverity;
    }

    /**
     * Get the healthyDevices property: Number of healthy devices within the IoT Security solution.
     *
     * @return the healthyDevices value.
     */
    public Long healthyDevices() {
        return this.healthyDevices;
    }

    /**
     * Get the unhealthyDeviceCount property: Number of unhealthy devices within the IoT Security solution.
     *
     * @return the unhealthyDeviceCount value.
     */
    public Long unhealthyDeviceCount() {
        return this.unhealthyDeviceCount;
    }

    /**
     * Get the logAnalyticsQuery property: Log analytics query for getting the list of affected devices/alerts.
     *
     * @return the logAnalyticsQuery value.
     */
    public String logAnalyticsQuery() {
        return this.logAnalyticsQuery;
    }

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     *
     * @param tags the tags value to set.
     * @return the IoTSecurityAggregatedRecommendationInner object itself.
     */
    public IoTSecurityAggregatedRecommendationInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
