// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.management.appservice.AbnormalTimePeriod;
import com.azure.management.appservice.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** The DiagnosticAnalysis model. */
@JsonFlatten
@Fluent
public class DiagnosticAnalysisInner extends ProxyOnlyResource {
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
     * List of time periods.
     */
    @JsonProperty(value = "properties.abnormalTimePeriods")
    private List<AbnormalTimePeriod> abnormalTimePeriods;

    /*
     * Data by each detector
     */
    @JsonProperty(value = "properties.payload")
    private List<AnalysisDataInner> payload;

    /*
     * Data by each detector for detectors that did not corelate
     */
    @JsonProperty(value = "properties.nonCorrelatedDetectors")
    private List<DetectorDefinitionInner> nonCorrelatedDetectors;

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
     * @return the DiagnosticAnalysisInner object itself.
     */
    public DiagnosticAnalysisInner withStartTime(OffsetDateTime startTime) {
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
     * @return the DiagnosticAnalysisInner object itself.
     */
    public DiagnosticAnalysisInner withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the abnormalTimePeriods property: List of time periods.
     *
     * @return the abnormalTimePeriods value.
     */
    public List<AbnormalTimePeriod> abnormalTimePeriods() {
        return this.abnormalTimePeriods;
    }

    /**
     * Set the abnormalTimePeriods property: List of time periods.
     *
     * @param abnormalTimePeriods the abnormalTimePeriods value to set.
     * @return the DiagnosticAnalysisInner object itself.
     */
    public DiagnosticAnalysisInner withAbnormalTimePeriods(List<AbnormalTimePeriod> abnormalTimePeriods) {
        this.abnormalTimePeriods = abnormalTimePeriods;
        return this;
    }

    /**
     * Get the payload property: Data by each detector.
     *
     * @return the payload value.
     */
    public List<AnalysisDataInner> payload() {
        return this.payload;
    }

    /**
     * Set the payload property: Data by each detector.
     *
     * @param payload the payload value to set.
     * @return the DiagnosticAnalysisInner object itself.
     */
    public DiagnosticAnalysisInner withPayload(List<AnalysisDataInner> payload) {
        this.payload = payload;
        return this;
    }

    /**
     * Get the nonCorrelatedDetectors property: Data by each detector for detectors that did not corelate.
     *
     * @return the nonCorrelatedDetectors value.
     */
    public List<DetectorDefinitionInner> nonCorrelatedDetectors() {
        return this.nonCorrelatedDetectors;
    }

    /**
     * Set the nonCorrelatedDetectors property: Data by each detector for detectors that did not corelate.
     *
     * @param nonCorrelatedDetectors the nonCorrelatedDetectors value to set.
     * @return the DiagnosticAnalysisInner object itself.
     */
    public DiagnosticAnalysisInner withNonCorrelatedDetectors(List<DetectorDefinitionInner> nonCorrelatedDetectors) {
        this.nonCorrelatedDetectors = nonCorrelatedDetectors;
        return this;
    }
}
