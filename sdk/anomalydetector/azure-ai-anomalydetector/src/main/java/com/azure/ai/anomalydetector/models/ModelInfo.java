// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.anomalydetector.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Train result of a model including status, errors and diagnose info for model and variables. */
@Fluent
public final class ModelInfo {
    /*
     * An optional field, indicates how many history points will be used to
     * determine the anomaly score of one subsequent point.
     */
    @JsonProperty(value = "slidingWindow")
    private Integer slidingWindow;

    /*
     * An optional field, since those multivariate need to be aligned in the
     * same timestamp before starting the detection.
     */
    @JsonProperty(value = "alignPolicy")
    private AlignPolicy alignPolicy;

    /*
     * source file link of the input variables, each variable will be a csv
     * with two columns, the first column will be timestamp, the second column
     * will be value.Besides these variable csv files, an extra meta.json can
     * be included in th zip file if you would like to rename a variable.Be
     * default, the file name of the variable will be used as the variable
     * name.
     */
    @JsonProperty(value = "source", required = true)
    private String source;

    /*
     * require field, start time of data be used for generating multivariate
     * anomaly detection model, should be data-time
     */
    @JsonProperty(value = "startTime", required = true)
    private OffsetDateTime startTime;

    /*
     * require field, end time of data be used for generating multivariate
     * anomaly detection model, should be data-time
     */
    @JsonProperty(value = "endTime", required = true)
    private OffsetDateTime endTime;

    /*
     * optional field, name of the model
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Model training status.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private ModelStatus status;

    /*
     * Error message when fails to create a model.
     */
    @JsonProperty(value = "errors", access = JsonProperty.Access.WRITE_ONLY)
    private List<ErrorResponse> errors;

    /*
     * Used for deep analysis model and variables
     */
    @JsonProperty(value = "diagnosticsInfo", access = JsonProperty.Access.WRITE_ONLY)
    private DiagnosticsInfo diagnosticsInfo;

    /**
     * Get the slidingWindow property: An optional field, indicates how many history points will be used to determine
     * the anomaly score of one subsequent point.
     *
     * @return the slidingWindow value.
     */
    public Integer getSlidingWindow() {
        return this.slidingWindow;
    }

    /**
     * Set the slidingWindow property: An optional field, indicates how many history points will be used to determine
     * the anomaly score of one subsequent point.
     *
     * @param slidingWindow the slidingWindow value to set.
     * @return the ModelInfo object itself.
     */
    public ModelInfo setSlidingWindow(Integer slidingWindow) {
        this.slidingWindow = slidingWindow;
        return this;
    }

    /**
     * Get the alignPolicy property: An optional field, since those multivariate need to be aligned in the same
     * timestamp before starting the detection.
     *
     * @return the alignPolicy value.
     */
    public AlignPolicy getAlignPolicy() {
        return this.alignPolicy;
    }

    /**
     * Set the alignPolicy property: An optional field, since those multivariate need to be aligned in the same
     * timestamp before starting the detection.
     *
     * @param alignPolicy the alignPolicy value to set.
     * @return the ModelInfo object itself.
     */
    public ModelInfo setAlignPolicy(AlignPolicy alignPolicy) {
        this.alignPolicy = alignPolicy;
        return this;
    }

    /**
     * Get the source property: source file link of the input variables, each variable will be a csv with two columns,
     * the first column will be timestamp, the second column will be value.Besides these variable csv files, an extra
     * meta.json can be included in th zip file if you would like to rename a variable.Be default, the file name of the
     * variable will be used as the variable name.
     *
     * @return the source value.
     */
    public String getSource() {
        return this.source;
    }

    /**
     * Set the source property: source file link of the input variables, each variable will be a csv with two columns,
     * the first column will be timestamp, the second column will be value.Besides these variable csv files, an extra
     * meta.json can be included in th zip file if you would like to rename a variable.Be default, the file name of the
     * variable will be used as the variable name.
     *
     * @param source the source value to set.
     * @return the ModelInfo object itself.
     */
    public ModelInfo setSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * Get the startTime property: require field, start time of data be used for generating multivariate anomaly
     * detection model, should be data-time.
     *
     * @return the startTime value.
     */
    public OffsetDateTime getStartTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: require field, start time of data be used for generating multivariate anomaly
     * detection model, should be data-time.
     *
     * @param startTime the startTime value to set.
     * @return the ModelInfo object itself.
     */
    public ModelInfo setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime property: require field, end time of data be used for generating multivariate anomaly detection
     * model, should be data-time.
     *
     * @return the endTime value.
     */
    public OffsetDateTime getEndTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: require field, end time of data be used for generating multivariate anomaly detection
     * model, should be data-time.
     *
     * @param endTime the endTime value to set.
     * @return the ModelInfo object itself.
     */
    public ModelInfo setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the displayName property: optional field, name of the model.
     *
     * @return the displayName value.
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: optional field, name of the model.
     *
     * @param displayName the displayName value to set.
     * @return the ModelInfo object itself.
     */
    public ModelInfo setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the status property: Model training status.
     *
     * @return the status value.
     */
    public ModelStatus getStatus() {
        return this.status;
    }

    /**
     * Get the errors property: Error message when fails to create a model.
     *
     * @return the errors value.
     */
    public List<ErrorResponse> getErrors() {
        return this.errors;
    }

    /**
     * Get the diagnosticsInfo property: Used for deep analysis model and variables.
     *
     * @return the diagnosticsInfo value.
     */
    public DiagnosticsInfo getDiagnosticsInfo() {
        return this.diagnosticsInfo;
    }
}
