/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_05_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information gained from troubleshooting of specified resource.
 */
public class TroubleshootingDetails {
    /**
     * The id of the get troubleshoot operation.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Reason type of failure.
     */
    @JsonProperty(value = "reasonType")
    private String reasonType;

    /**
     * A summary of troubleshooting.
     */
    @JsonProperty(value = "summary")
    private String summary;

    /**
     * Details on troubleshooting results.
     */
    @JsonProperty(value = "detail")
    private String detail;

    /**
     * List of recommended actions.
     */
    @JsonProperty(value = "recommendedActions")
    private List<TroubleshootingRecommendedActions> recommendedActions;

    /**
     * Get the id of the get troubleshoot operation.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id of the get troubleshoot operation.
     *
     * @param id the id value to set
     * @return the TroubleshootingDetails object itself.
     */
    public TroubleshootingDetails withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get reason type of failure.
     *
     * @return the reasonType value
     */
    public String reasonType() {
        return this.reasonType;
    }

    /**
     * Set reason type of failure.
     *
     * @param reasonType the reasonType value to set
     * @return the TroubleshootingDetails object itself.
     */
    public TroubleshootingDetails withReasonType(String reasonType) {
        this.reasonType = reasonType;
        return this;
    }

    /**
     * Get a summary of troubleshooting.
     *
     * @return the summary value
     */
    public String summary() {
        return this.summary;
    }

    /**
     * Set a summary of troubleshooting.
     *
     * @param summary the summary value to set
     * @return the TroubleshootingDetails object itself.
     */
    public TroubleshootingDetails withSummary(String summary) {
        this.summary = summary;
        return this;
    }

    /**
     * Get details on troubleshooting results.
     *
     * @return the detail value
     */
    public String detail() {
        return this.detail;
    }

    /**
     * Set details on troubleshooting results.
     *
     * @param detail the detail value to set
     * @return the TroubleshootingDetails object itself.
     */
    public TroubleshootingDetails withDetail(String detail) {
        this.detail = detail;
        return this;
    }

    /**
     * Get list of recommended actions.
     *
     * @return the recommendedActions value
     */
    public List<TroubleshootingRecommendedActions> recommendedActions() {
        return this.recommendedActions;
    }

    /**
     * Set list of recommended actions.
     *
     * @param recommendedActions the recommendedActions value to set
     * @return the TroubleshootingDetails object itself.
     */
    public TroubleshootingDetails withRecommendedActions(List<TroubleshootingRecommendedActions> recommendedActions) {
        this.recommendedActions = recommendedActions;
        return this;
    }

}
