/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01;

import com.microsoft.azure.management.appservice.v2018_02_01.implementation.DetectorDefinitionInner;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Class Representing Detector Evidence used for analysis.
 */
public class AnalysisData {
    /**
     * Name of the Detector.
     */
    @JsonProperty(value = "source")
    private String source;

    /**
     * Detector Definition.
     */
    @JsonProperty(value = "detectorDefinition")
    private DetectorDefinitionInner detectorDefinition;

    /**
     * Source Metrics.
     */
    @JsonProperty(value = "metrics")
    private List<DiagnosticMetricSet> metrics;

    /**
     * Additional Source Data.
     */
    @JsonProperty(value = "data")
    private List<List<NameValuePair>> data;

    /**
     * Detector Meta Data.
     */
    @JsonProperty(value = "detectorMetaData")
    private ResponseMetaData detectorMetaData;

    /**
     * Get the source value.
     *
     * @return the source value
     */
    public String source() {
        return this.source;
    }

    /**
     * Set the source value.
     *
     * @param source the source value to set
     * @return the AnalysisData object itself.
     */
    public AnalysisData withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * Get the detectorDefinition value.
     *
     * @return the detectorDefinition value
     */
    public DetectorDefinitionInner detectorDefinition() {
        return this.detectorDefinition;
    }

    /**
     * Set the detectorDefinition value.
     *
     * @param detectorDefinition the detectorDefinition value to set
     * @return the AnalysisData object itself.
     */
    public AnalysisData withDetectorDefinition(DetectorDefinitionInner detectorDefinition) {
        this.detectorDefinition = detectorDefinition;
        return this;
    }

    /**
     * Get the metrics value.
     *
     * @return the metrics value
     */
    public List<DiagnosticMetricSet> metrics() {
        return this.metrics;
    }

    /**
     * Set the metrics value.
     *
     * @param metrics the metrics value to set
     * @return the AnalysisData object itself.
     */
    public AnalysisData withMetrics(List<DiagnosticMetricSet> metrics) {
        this.metrics = metrics;
        return this;
    }

    /**
     * Get the data value.
     *
     * @return the data value
     */
    public List<List<NameValuePair>> data() {
        return this.data;
    }

    /**
     * Set the data value.
     *
     * @param data the data value to set
     * @return the AnalysisData object itself.
     */
    public AnalysisData withData(List<List<NameValuePair>> data) {
        this.data = data;
        return this;
    }

    /**
     * Get the detectorMetaData value.
     *
     * @return the detectorMetaData value
     */
    public ResponseMetaData detectorMetaData() {
        return this.detectorMetaData;
    }

    /**
     * Set the detectorMetaData value.
     *
     * @param detectorMetaData the detectorMetaData value to set
     * @return the AnalysisData object itself.
     */
    public AnalysisData withDetectorMetaData(ResponseMetaData detectorMetaData) {
        this.detectorMetaData = detectorMetaData;
        return this;
    }

}
