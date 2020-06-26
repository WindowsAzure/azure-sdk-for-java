/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.azure.messaging.eventgrid.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Schema of the Data property of an EventGridEvent for an
 * Microsoft.MachineLearningServices.RunCompleted event.
 */
public class MachineLearningServicesRunCompletedEventData {
    /**
     * The ID of the experiment that the run belongs to.
     */
    @JsonProperty(value = "experimentId")
    private String experimentId;

    /**
     * The name of the experiment that the run belongs to.
     */
    @JsonProperty(value = "experimentName")
    private String experimentName;

    /**
     * The ID of the Run that was completed.
     */
    @JsonProperty(value = "runId")
    private String runId;

    /**
     * The Run Type of the completed Run.
     */
    @JsonProperty(value = "runType")
    private String runType;

    /**
     * The tags of the completed Run.
     */
    @JsonProperty(value = "runTags")
    private Object runTags;

    /**
     * The properties of the completed Run.
     */
    @JsonProperty(value = "runProperties")
    private Object runProperties;

    /**
     * Get the ID of the experiment that the run belongs to.
     *
     * @return the experimentId value
     */
    public String experimentId() {
        return this.experimentId;
    }

    /**
     * Set the ID of the experiment that the run belongs to.
     *
     * @param experimentId the experimentId value to set
     * @return the MachineLearningServicesRunCompletedEventData object itself.
     */
    public MachineLearningServicesRunCompletedEventData withExperimentId(String experimentId) {
        this.experimentId = experimentId;
        return this;
    }

    /**
     * Get the name of the experiment that the run belongs to.
     *
     * @return the experimentName value
     */
    public String experimentName() {
        return this.experimentName;
    }

    /**
     * Set the name of the experiment that the run belongs to.
     *
     * @param experimentName the experimentName value to set
     * @return the MachineLearningServicesRunCompletedEventData object itself.
     */
    public MachineLearningServicesRunCompletedEventData withExperimentName(String experimentName) {
        this.experimentName = experimentName;
        return this;
    }

    /**
     * Get the ID of the Run that was completed.
     *
     * @return the runId value
     */
    public String runId() {
        return this.runId;
    }

    /**
     * Set the ID of the Run that was completed.
     *
     * @param runId the runId value to set
     * @return the MachineLearningServicesRunCompletedEventData object itself.
     */
    public MachineLearningServicesRunCompletedEventData withRunId(String runId) {
        this.runId = runId;
        return this;
    }

    /**
     * Get the Run Type of the completed Run.
     *
     * @return the runType value
     */
    public String runType() {
        return this.runType;
    }

    /**
     * Set the Run Type of the completed Run.
     *
     * @param runType the runType value to set
     * @return the MachineLearningServicesRunCompletedEventData object itself.
     */
    public MachineLearningServicesRunCompletedEventData withRunType(String runType) {
        this.runType = runType;
        return this;
    }

    /**
     * Get the tags of the completed Run.
     *
     * @return the runTags value
     */
    public Object runTags() {
        return this.runTags;
    }

    /**
     * Set the tags of the completed Run.
     *
     * @param runTags the runTags value to set
     * @return the MachineLearningServicesRunCompletedEventData object itself.
     */
    public MachineLearningServicesRunCompletedEventData withRunTags(Object runTags) {
        this.runTags = runTags;
        return this;
    }

    /**
     * Get the properties of the completed Run.
     *
     * @return the runProperties value
     */
    public Object runProperties() {
        return this.runProperties;
    }

    /**
     * Set the properties of the completed Run.
     *
     * @param runProperties the runProperties value to set
     * @return the MachineLearningServicesRunCompletedEventData object itself.
     */
    public MachineLearningServicesRunCompletedEventData withRunProperties(Object runProperties) {
        this.runProperties = runProperties;
        return this;
    }

}
