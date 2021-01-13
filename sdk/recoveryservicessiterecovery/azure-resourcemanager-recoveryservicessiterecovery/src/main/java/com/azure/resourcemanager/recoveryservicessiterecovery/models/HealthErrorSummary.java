// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** class to define the summary of the health error details. */
@Fluent
public final class HealthErrorSummary {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(HealthErrorSummary.class);

    /*
     * The code of the health error.
     */
    @JsonProperty(value = "summaryCode")
    private String summaryCode;

    /*
     * The category of the health error.
     */
    @JsonProperty(value = "category")
    private HealthErrorCategory category;

    /*
     * Severity of error.
     */
    @JsonProperty(value = "severity")
    private Severity severity;

    /*
     * The summary message of the health error.
     */
    @JsonProperty(value = "summaryMessage")
    private String summaryMessage;

    /*
     * The type of affected ARM resource.
     */
    @JsonProperty(value = "affectedResourceType")
    private String affectedResourceType;

    /*
     * The sub type of any subcomponent within the ARM resource that this might
     * be applicable. Value remains null if not applicable.
     */
    @JsonProperty(value = "affectedResourceSubtype")
    private String affectedResourceSubtype;

    /*
     * The list of affected resource correlation Ids. This can be used to
     * uniquely identify the count of items affected by a specific category and
     * severity as well as count of item affected by an specific issue.
     */
    @JsonProperty(value = "affectedResourceCorrelationIds")
    private List<String> affectedResourceCorrelationIds;

    /**
     * Get the summaryCode property: The code of the health error.
     *
     * @return the summaryCode value.
     */
    public String summaryCode() {
        return this.summaryCode;
    }

    /**
     * Set the summaryCode property: The code of the health error.
     *
     * @param summaryCode the summaryCode value to set.
     * @return the HealthErrorSummary object itself.
     */
    public HealthErrorSummary withSummaryCode(String summaryCode) {
        this.summaryCode = summaryCode;
        return this;
    }

    /**
     * Get the category property: The category of the health error.
     *
     * @return the category value.
     */
    public HealthErrorCategory category() {
        return this.category;
    }

    /**
     * Set the category property: The category of the health error.
     *
     * @param category the category value to set.
     * @return the HealthErrorSummary object itself.
     */
    public HealthErrorSummary withCategory(HealthErrorCategory category) {
        this.category = category;
        return this;
    }

    /**
     * Get the severity property: Severity of error.
     *
     * @return the severity value.
     */
    public Severity severity() {
        return this.severity;
    }

    /**
     * Set the severity property: Severity of error.
     *
     * @param severity the severity value to set.
     * @return the HealthErrorSummary object itself.
     */
    public HealthErrorSummary withSeverity(Severity severity) {
        this.severity = severity;
        return this;
    }

    /**
     * Get the summaryMessage property: The summary message of the health error.
     *
     * @return the summaryMessage value.
     */
    public String summaryMessage() {
        return this.summaryMessage;
    }

    /**
     * Set the summaryMessage property: The summary message of the health error.
     *
     * @param summaryMessage the summaryMessage value to set.
     * @return the HealthErrorSummary object itself.
     */
    public HealthErrorSummary withSummaryMessage(String summaryMessage) {
        this.summaryMessage = summaryMessage;
        return this;
    }

    /**
     * Get the affectedResourceType property: The type of affected ARM resource.
     *
     * @return the affectedResourceType value.
     */
    public String affectedResourceType() {
        return this.affectedResourceType;
    }

    /**
     * Set the affectedResourceType property: The type of affected ARM resource.
     *
     * @param affectedResourceType the affectedResourceType value to set.
     * @return the HealthErrorSummary object itself.
     */
    public HealthErrorSummary withAffectedResourceType(String affectedResourceType) {
        this.affectedResourceType = affectedResourceType;
        return this;
    }

    /**
     * Get the affectedResourceSubtype property: The sub type of any subcomponent within the ARM resource that this
     * might be applicable. Value remains null if not applicable.
     *
     * @return the affectedResourceSubtype value.
     */
    public String affectedResourceSubtype() {
        return this.affectedResourceSubtype;
    }

    /**
     * Set the affectedResourceSubtype property: The sub type of any subcomponent within the ARM resource that this
     * might be applicable. Value remains null if not applicable.
     *
     * @param affectedResourceSubtype the affectedResourceSubtype value to set.
     * @return the HealthErrorSummary object itself.
     */
    public HealthErrorSummary withAffectedResourceSubtype(String affectedResourceSubtype) {
        this.affectedResourceSubtype = affectedResourceSubtype;
        return this;
    }

    /**
     * Get the affectedResourceCorrelationIds property: The list of affected resource correlation Ids. This can be used
     * to uniquely identify the count of items affected by a specific category and severity as well as count of item
     * affected by an specific issue.
     *
     * @return the affectedResourceCorrelationIds value.
     */
    public List<String> affectedResourceCorrelationIds() {
        return this.affectedResourceCorrelationIds;
    }

    /**
     * Set the affectedResourceCorrelationIds property: The list of affected resource correlation Ids. This can be used
     * to uniquely identify the count of items affected by a specific category and severity as well as count of item
     * affected by an specific issue.
     *
     * @param affectedResourceCorrelationIds the affectedResourceCorrelationIds value to set.
     * @return the HealthErrorSummary object itself.
     */
    public HealthErrorSummary withAffectedResourceCorrelationIds(List<String> affectedResourceCorrelationIds) {
        this.affectedResourceCorrelationIds = affectedResourceCorrelationIds;
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
