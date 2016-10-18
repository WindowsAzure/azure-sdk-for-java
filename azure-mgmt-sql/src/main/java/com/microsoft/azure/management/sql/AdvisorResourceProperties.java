/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql;

import org.joda.time.DateTime;
import com.microsoft.azure.management.sql.implementation.RecommendedActionResourceListInner;

/**
 * The AdvisorResourceProperties model.
 */
public class AdvisorResourceProperties {
    /**
     * The advisorStatus property.
     */
    private String advisorStatus;

    /**
     * The autoExecuteStatus property.
     */
    private String autoExecuteStatus;

    /**
     * The autoExecuteStatusInheritedFrom property.
     */
    private String autoExecuteStatusInheritedFrom;

    /**
     * The recommendationsStatus property.
     */
    private String recommendationsStatus;

    /**
     * The lastChecked property.
     */
    private DateTime lastChecked;

    /**
     * The recommendedActions property.
     */
    private RecommendedActionResourceListInner recommendedActions;

    /**
     * Get the advisorStatus value.
     *
     * @return the advisorStatus value
     */
    public String advisorStatus() {
        return this.advisorStatus;
    }

    /**
     * Set the advisorStatus value.
     *
     * @param advisorStatus the advisorStatus value to set
     * @return the AdvisorResourceProperties object itself.
     */
    public AdvisorResourceProperties withAdvisorStatus(String advisorStatus) {
        this.advisorStatus = advisorStatus;
        return this;
    }

    /**
     * Get the autoExecuteStatus value.
     *
     * @return the autoExecuteStatus value
     */
    public String autoExecuteStatus() {
        return this.autoExecuteStatus;
    }

    /**
     * Set the autoExecuteStatus value.
     *
     * @param autoExecuteStatus the autoExecuteStatus value to set
     * @return the AdvisorResourceProperties object itself.
     */
    public AdvisorResourceProperties withAutoExecuteStatus(String autoExecuteStatus) {
        this.autoExecuteStatus = autoExecuteStatus;
        return this;
    }

    /**
     * Get the autoExecuteStatusInheritedFrom value.
     *
     * @return the autoExecuteStatusInheritedFrom value
     */
    public String autoExecuteStatusInheritedFrom() {
        return this.autoExecuteStatusInheritedFrom;
    }

    /**
     * Set the autoExecuteStatusInheritedFrom value.
     *
     * @param autoExecuteStatusInheritedFrom the autoExecuteStatusInheritedFrom value to set
     * @return the AdvisorResourceProperties object itself.
     */
    public AdvisorResourceProperties withAutoExecuteStatusInheritedFrom(String autoExecuteStatusInheritedFrom) {
        this.autoExecuteStatusInheritedFrom = autoExecuteStatusInheritedFrom;
        return this;
    }

    /**
     * Get the recommendationsStatus value.
     *
     * @return the recommendationsStatus value
     */
    public String recommendationsStatus() {
        return this.recommendationsStatus;
    }

    /**
     * Set the recommendationsStatus value.
     *
     * @param recommendationsStatus the recommendationsStatus value to set
     * @return the AdvisorResourceProperties object itself.
     */
    public AdvisorResourceProperties withRecommendationsStatus(String recommendationsStatus) {
        this.recommendationsStatus = recommendationsStatus;
        return this;
    }

    /**
     * Get the lastChecked value.
     *
     * @return the lastChecked value
     */
    public DateTime lastChecked() {
        return this.lastChecked;
    }

    /**
     * Set the lastChecked value.
     *
     * @param lastChecked the lastChecked value to set
     * @return the AdvisorResourceProperties object itself.
     */
    public AdvisorResourceProperties withLastChecked(DateTime lastChecked) {
        this.lastChecked = lastChecked;
        return this;
    }

    /**
     * Get the recommendedActions value.
     *
     * @return the recommendedActions value
     */
    public RecommendedActionResourceListInner recommendedActions() {
        return this.recommendedActions;
    }

    /**
     * Set the recommendedActions value.
     *
     * @param recommendedActions the recommendedActions value to set
     * @return the AdvisorResourceProperties object itself.
     */
    public AdvisorResourceProperties withRecommendedActions(RecommendedActionResourceListInner recommendedActions) {
        this.recommendedActions = recommendedActions;
        return this;
    }

}
