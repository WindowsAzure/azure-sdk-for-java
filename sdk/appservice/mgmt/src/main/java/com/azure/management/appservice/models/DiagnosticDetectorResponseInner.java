// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.azure.management.appservice.DetectorAbnormalTimePeriod;
import com.azure.management.appservice.DiagnosticMetricSet;
import com.azure.management.appservice.NameValuePair;
import com.azure.management.appservice.ProxyOnlyResource;
import com.azure.management.appservice.ResponseMetaData;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * The DiagnosticDetectorResponse model.
 */
@JsonFlatten
@Fluent
public class DiagnosticDetectorResponseInner extends ProxyOnlyResource {
    /*
     * Start time of the period
     */
    @JsonProperty(value = "properties.startTime")
    private OffsetDateTime startTime;

    /*
     * End time of the period
     */
    @JsonProperty(value = "properties.endTime")
    private OffsetDateTime endTime;

    /*
     * Flag representing Issue was detected.
     */
    @JsonProperty(value = "properties.issueDetected")
    private Boolean issueDetected;

    /*
     * Class representing detector definition
     */
    @JsonProperty(value = "properties.detectorDefinition")
    private DetectorDefinitionInner detectorDefinition;

    /*
     * Metrics provided by the detector
     */
    @JsonProperty(value = "properties.metrics")
    private List<DiagnosticMetricSet> metrics;

    /*
     * List of Correlated events found by the detector
     */
    @JsonProperty(value = "properties.abnormalTimePeriods")
    private List<DetectorAbnormalTimePeriod> abnormalTimePeriods;

    /*
     * Additional Data that detector wants to send.
     */
    @JsonProperty(value = "properties.data")
    private List<List<NameValuePair>> data;

    /*
     * The responseMetaData property.
     */
    @JsonProperty(value = "properties.responseMetaData")
    private ResponseMetaData responseMetaData;

    /**
     * Get the startTime property: Start time of the period.
     * 
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: Start time of the period.
     * 
     * @param startTime the startTime value to set.
     * @return the DiagnosticDetectorResponseInner object itself.
     */
    public DiagnosticDetectorResponseInner withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime property: End time of the period.
     * 
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: End time of the period.
     * 
     * @param endTime the endTime value to set.
     * @return the DiagnosticDetectorResponseInner object itself.
     */
    public DiagnosticDetectorResponseInner withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the issueDetected property: Flag representing Issue was detected.
     * 
     * @return the issueDetected value.
     */
    public Boolean issueDetected() {
        return this.issueDetected;
    }

    /**
     * Set the issueDetected property: Flag representing Issue was detected.
     * 
     * @param issueDetected the issueDetected value to set.
     * @return the DiagnosticDetectorResponseInner object itself.
     */
    public DiagnosticDetectorResponseInner withIssueDetected(Boolean issueDetected) {
        this.issueDetected = issueDetected;
        return this;
    }

    /**
     * Get the detectorDefinition property: Class representing detector
     * definition.
     * 
     * @return the detectorDefinition value.
     */
    public DetectorDefinitionInner detectorDefinition() {
        return this.detectorDefinition;
    }

    /**
     * Set the detectorDefinition property: Class representing detector
     * definition.
     * 
     * @param detectorDefinition the detectorDefinition value to set.
     * @return the DiagnosticDetectorResponseInner object itself.
     */
    public DiagnosticDetectorResponseInner withDetectorDefinition(DetectorDefinitionInner detectorDefinition) {
        this.detectorDefinition = detectorDefinition;
        return this;
    }

    /**
     * Get the metrics property: Metrics provided by the detector.
     * 
     * @return the metrics value.
     */
    public List<DiagnosticMetricSet> metrics() {
        return this.metrics;
    }

    /**
     * Set the metrics property: Metrics provided by the detector.
     * 
     * @param metrics the metrics value to set.
     * @return the DiagnosticDetectorResponseInner object itself.
     */
    public DiagnosticDetectorResponseInner withMetrics(List<DiagnosticMetricSet> metrics) {
        this.metrics = metrics;
        return this;
    }

    /**
     * Get the abnormalTimePeriods property: List of Correlated events found by
     * the detector.
     * 
     * @return the abnormalTimePeriods value.
     */
    public List<DetectorAbnormalTimePeriod> abnormalTimePeriods() {
        return this.abnormalTimePeriods;
    }

    /**
     * Set the abnormalTimePeriods property: List of Correlated events found by
     * the detector.
     * 
     * @param abnormalTimePeriods the abnormalTimePeriods value to set.
     * @return the DiagnosticDetectorResponseInner object itself.
     */
    public DiagnosticDetectorResponseInner withAbnormalTimePeriods(List<DetectorAbnormalTimePeriod> abnormalTimePeriods) {
        this.abnormalTimePeriods = abnormalTimePeriods;
        return this;
    }

    /**
     * Get the data property: Additional Data that detector wants to send.
     * 
     * @return the data value.
     */
    public List<List<NameValuePair>> data() {
        return this.data;
    }

    /**
     * Set the data property: Additional Data that detector wants to send.
     * 
     * @param data the data value to set.
     * @return the DiagnosticDetectorResponseInner object itself.
     */
    public DiagnosticDetectorResponseInner withData(List<List<NameValuePair>> data) {
        this.data = data;
        return this;
    }

    /**
     * Get the responseMetaData property: The responseMetaData property.
     * 
     * @return the responseMetaData value.
     */
    public ResponseMetaData responseMetaData() {
        return this.responseMetaData;
    }

    /**
     * Set the responseMetaData property: The responseMetaData property.
     * 
     * @param responseMetaData the responseMetaData value to set.
     * @return the DiagnosticDetectorResponseInner object itself.
     */
    public DiagnosticDetectorResponseInner withResponseMetaData(ResponseMetaData responseMetaData) {
        this.responseMetaData = responseMetaData;
        return this;
    }
}
