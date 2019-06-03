/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_03_01;

import org.joda.time.DateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Class representing Abnormal Time Period detected.
 */
public class DetectorAbnormalTimePeriod {
    /**
     * Start time of the correlated event.
     */
    @JsonProperty(value = "startTime")
    private DateTime startTime;

    /**
     * End time of the correlated event.
     */
    @JsonProperty(value = "endTime")
    private DateTime endTime;

    /**
     * Message describing the event.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Represents the name of the Detector.
     */
    @JsonProperty(value = "source")
    private String source;

    /**
     * Represents the rank of the Detector.
     */
    @JsonProperty(value = "priority")
    private Double priority;

    /**
     * Downtime metadata.
     */
    @JsonProperty(value = "metaData")
    private List<List<NameValuePair>> metaData;

    /**
     * Represents the type of the Detector. Possible values include:
     * 'ServiceIncident', 'AppDeployment', 'AppCrash', 'RuntimeIssueDetected',
     * 'AseDeployment', 'UserIssue', 'PlatformIssue', 'Other'.
     */
    @JsonProperty(value = "type")
    private IssueType type;

    /**
     * List of proposed solutions.
     */
    @JsonProperty(value = "solutions")
    private List<Solution> solutions;

    /**
     * Get start time of the correlated event.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Set start time of the correlated event.
     *
     * @param startTime the startTime value to set
     * @return the DetectorAbnormalTimePeriod object itself.
     */
    public DetectorAbnormalTimePeriod withStartTime(DateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get end time of the correlated event.
     *
     * @return the endTime value
     */
    public DateTime endTime() {
        return this.endTime;
    }

    /**
     * Set end time of the correlated event.
     *
     * @param endTime the endTime value to set
     * @return the DetectorAbnormalTimePeriod object itself.
     */
    public DetectorAbnormalTimePeriod withEndTime(DateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get message describing the event.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set message describing the event.
     *
     * @param message the message value to set
     * @return the DetectorAbnormalTimePeriod object itself.
     */
    public DetectorAbnormalTimePeriod withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get represents the name of the Detector.
     *
     * @return the source value
     */
    public String source() {
        return this.source;
    }

    /**
     * Set represents the name of the Detector.
     *
     * @param source the source value to set
     * @return the DetectorAbnormalTimePeriod object itself.
     */
    public DetectorAbnormalTimePeriod withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * Get represents the rank of the Detector.
     *
     * @return the priority value
     */
    public Double priority() {
        return this.priority;
    }

    /**
     * Set represents the rank of the Detector.
     *
     * @param priority the priority value to set
     * @return the DetectorAbnormalTimePeriod object itself.
     */
    public DetectorAbnormalTimePeriod withPriority(Double priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get downtime metadata.
     *
     * @return the metaData value
     */
    public List<List<NameValuePair>> metaData() {
        return this.metaData;
    }

    /**
     * Set downtime metadata.
     *
     * @param metaData the metaData value to set
     * @return the DetectorAbnormalTimePeriod object itself.
     */
    public DetectorAbnormalTimePeriod withMetaData(List<List<NameValuePair>> metaData) {
        this.metaData = metaData;
        return this;
    }

    /**
     * Get represents the type of the Detector. Possible values include: 'ServiceIncident', 'AppDeployment', 'AppCrash', 'RuntimeIssueDetected', 'AseDeployment', 'UserIssue', 'PlatformIssue', 'Other'.
     *
     * @return the type value
     */
    public IssueType type() {
        return this.type;
    }

    /**
     * Set represents the type of the Detector. Possible values include: 'ServiceIncident', 'AppDeployment', 'AppCrash', 'RuntimeIssueDetected', 'AseDeployment', 'UserIssue', 'PlatformIssue', 'Other'.
     *
     * @param type the type value to set
     * @return the DetectorAbnormalTimePeriod object itself.
     */
    public DetectorAbnormalTimePeriod withType(IssueType type) {
        this.type = type;
        return this;
    }

    /**
     * Get list of proposed solutions.
     *
     * @return the solutions value
     */
    public List<Solution> solutions() {
        return this.solutions;
    }

    /**
     * Set list of proposed solutions.
     *
     * @param solutions the solutions value to set
     * @return the DetectorAbnormalTimePeriod object itself.
     */
    public DetectorAbnormalTimePeriod withSolutions(List<Solution> solutions) {
        this.solutions = solutions;
        return this;
    }

}
