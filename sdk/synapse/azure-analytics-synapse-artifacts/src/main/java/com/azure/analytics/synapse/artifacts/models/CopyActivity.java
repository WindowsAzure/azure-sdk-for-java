// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Copy activity. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Copy")
@JsonFlatten
@Fluent
public class CopyActivity extends ExecutionActivity {
    /*
     * List of inputs for the activity.
     */
    @JsonProperty(value = "inputs")
    private List<DatasetReference> inputs;

    /*
     * List of outputs for the activity.
     */
    @JsonProperty(value = "outputs")
    private List<DatasetReference> outputs;

    /*
     * Copy activity source.
     */
    @JsonProperty(value = "typeProperties.source", required = true)
    private CopySource source;

    /*
     * Copy activity sink.
     */
    @JsonProperty(value = "typeProperties.sink", required = true)
    private CopySink sink;

    /*
     * Copy activity translator. If not specified, tabular translator is used.
     */
    @JsonProperty(value = "typeProperties.translator")
    private Object translator;

    /*
     * Specifies whether to copy data via an interim staging. Default value is
     * false. Type: boolean (or Expression with resultType boolean).
     */
    @JsonProperty(value = "typeProperties.enableStaging")
    private Object enableStaging;

    /*
     * Specifies interim staging settings when EnableStaging is true.
     */
    @JsonProperty(value = "typeProperties.stagingSettings")
    private StagingSettings stagingSettings;

    /*
     * Maximum number of concurrent sessions opened on the source or sink to
     * avoid overloading the data store. Type: integer (or Expression with
     * resultType integer), minimum: 0.
     */
    @JsonProperty(value = "typeProperties.parallelCopies")
    private Object parallelCopies;

    /*
     * Maximum number of data integration units that can be used to perform
     * this data movement. Type: integer (or Expression with resultType
     * integer), minimum: 0.
     */
    @JsonProperty(value = "typeProperties.dataIntegrationUnits")
    private Object dataIntegrationUnits;

    /*
     * Whether to skip incompatible row. Default value is false. Type: boolean
     * (or Expression with resultType boolean).
     */
    @JsonProperty(value = "typeProperties.enableSkipIncompatibleRow")
    private Object enableSkipIncompatibleRow;

    /*
     * Redirect incompatible row settings when EnableSkipIncompatibleRow is
     * true.
     */
    @JsonProperty(value = "typeProperties.redirectIncompatibleRowSettings")
    private RedirectIncompatibleRowSettings redirectIncompatibleRowSettings;

    /*
     * (Deprecated. Please use LogSettings) Log storage settings customer need
     * to provide when enabling session log.
     */
    @JsonProperty(value = "typeProperties.logStorageSettings")
    private LogStorageSettings logStorageSettings;

    /*
     * Log settings customer needs provide when enabling log.
     */
    @JsonProperty(value = "typeProperties.logSettings")
    private LogSettings logSettings;

    /*
     * Preserve Rules.
     */
    @JsonProperty(value = "typeProperties.preserveRules")
    private List<Object> preserveRules;

    /*
     * Preserve rules.
     */
    @JsonProperty(value = "typeProperties.preserve")
    private List<Object> preserve;

    /*
     * Whether to enable Data Consistency validation. Type: boolean (or
     * Expression with resultType boolean).
     */
    @JsonProperty(value = "typeProperties.validateDataConsistency")
    private Object validateDataConsistency;

    /*
     * Specify the fault tolerance for data consistency.
     */
    @JsonProperty(value = "typeProperties.skipErrorFile")
    private SkipErrorFile skipErrorFile;

    /**
     * Get the inputs property: List of inputs for the activity.
     *
     * @return the inputs value.
     */
    public List<DatasetReference> getInputs() {
        return this.inputs;
    }

    /**
     * Set the inputs property: List of inputs for the activity.
     *
     * @param inputs the inputs value to set.
     * @return the CopyActivity object itself.
     */
    public CopyActivity setInputs(List<DatasetReference> inputs) {
        this.inputs = inputs;
        return this;
    }

    /**
     * Get the outputs property: List of outputs for the activity.
     *
     * @return the outputs value.
     */
    public List<DatasetReference> getOutputs() {
        return this.outputs;
    }

    /**
     * Set the outputs property: List of outputs for the activity.
     *
     * @param outputs the outputs value to set.
     * @return the CopyActivity object itself.
     */
    public CopyActivity setOutputs(List<DatasetReference> outputs) {
        this.outputs = outputs;
        return this;
    }

    /**
     * Get the source property: Copy activity source.
     *
     * @return the source value.
     */
    public CopySource getSource() {
        return this.source;
    }

    /**
     * Set the source property: Copy activity source.
     *
     * @param source the source value to set.
     * @return the CopyActivity object itself.
     */
    public CopyActivity setSource(CopySource source) {
        this.source = source;
        return this;
    }

    /**
     * Get the sink property: Copy activity sink.
     *
     * @return the sink value.
     */
    public CopySink getSink() {
        return this.sink;
    }

    /**
     * Set the sink property: Copy activity sink.
     *
     * @param sink the sink value to set.
     * @return the CopyActivity object itself.
     */
    public CopyActivity setSink(CopySink sink) {
        this.sink = sink;
        return this;
    }

    /**
     * Get the translator property: Copy activity translator. If not specified, tabular translator is used.
     *
     * @return the translator value.
     */
    public Object getTranslator() {
        return this.translator;
    }

    /**
     * Set the translator property: Copy activity translator. If not specified, tabular translator is used.
     *
     * @param translator the translator value to set.
     * @return the CopyActivity object itself.
     */
    public CopyActivity setTranslator(Object translator) {
        this.translator = translator;
        return this;
    }

    /**
     * Get the enableStaging property: Specifies whether to copy data via an interim staging. Default value is false.
     * Type: boolean (or Expression with resultType boolean).
     *
     * @return the enableStaging value.
     */
    public Object getEnableStaging() {
        return this.enableStaging;
    }

    /**
     * Set the enableStaging property: Specifies whether to copy data via an interim staging. Default value is false.
     * Type: boolean (or Expression with resultType boolean).
     *
     * @param enableStaging the enableStaging value to set.
     * @return the CopyActivity object itself.
     */
    public CopyActivity setEnableStaging(Object enableStaging) {
        this.enableStaging = enableStaging;
        return this;
    }

    /**
     * Get the stagingSettings property: Specifies interim staging settings when EnableStaging is true.
     *
     * @return the stagingSettings value.
     */
    public StagingSettings getStagingSettings() {
        return this.stagingSettings;
    }

    /**
     * Set the stagingSettings property: Specifies interim staging settings when EnableStaging is true.
     *
     * @param stagingSettings the stagingSettings value to set.
     * @return the CopyActivity object itself.
     */
    public CopyActivity setStagingSettings(StagingSettings stagingSettings) {
        this.stagingSettings = stagingSettings;
        return this;
    }

    /**
     * Get the parallelCopies property: Maximum number of concurrent sessions opened on the source or sink to avoid
     * overloading the data store. Type: integer (or Expression with resultType integer), minimum: 0.
     *
     * @return the parallelCopies value.
     */
    public Object getParallelCopies() {
        return this.parallelCopies;
    }

    /**
     * Set the parallelCopies property: Maximum number of concurrent sessions opened on the source or sink to avoid
     * overloading the data store. Type: integer (or Expression with resultType integer), minimum: 0.
     *
     * @param parallelCopies the parallelCopies value to set.
     * @return the CopyActivity object itself.
     */
    public CopyActivity setParallelCopies(Object parallelCopies) {
        this.parallelCopies = parallelCopies;
        return this;
    }

    /**
     * Get the dataIntegrationUnits property: Maximum number of data integration units that can be used to perform this
     * data movement. Type: integer (or Expression with resultType integer), minimum: 0.
     *
     * @return the dataIntegrationUnits value.
     */
    public Object getDataIntegrationUnits() {
        return this.dataIntegrationUnits;
    }

    /**
     * Set the dataIntegrationUnits property: Maximum number of data integration units that can be used to perform this
     * data movement. Type: integer (or Expression with resultType integer), minimum: 0.
     *
     * @param dataIntegrationUnits the dataIntegrationUnits value to set.
     * @return the CopyActivity object itself.
     */
    public CopyActivity setDataIntegrationUnits(Object dataIntegrationUnits) {
        this.dataIntegrationUnits = dataIntegrationUnits;
        return this;
    }

    /**
     * Get the enableSkipIncompatibleRow property: Whether to skip incompatible row. Default value is false. Type:
     * boolean (or Expression with resultType boolean).
     *
     * @return the enableSkipIncompatibleRow value.
     */
    public Object getEnableSkipIncompatibleRow() {
        return this.enableSkipIncompatibleRow;
    }

    /**
     * Set the enableSkipIncompatibleRow property: Whether to skip incompatible row. Default value is false. Type:
     * boolean (or Expression with resultType boolean).
     *
     * @param enableSkipIncompatibleRow the enableSkipIncompatibleRow value to set.
     * @return the CopyActivity object itself.
     */
    public CopyActivity setEnableSkipIncompatibleRow(Object enableSkipIncompatibleRow) {
        this.enableSkipIncompatibleRow = enableSkipIncompatibleRow;
        return this;
    }

    /**
     * Get the redirectIncompatibleRowSettings property: Redirect incompatible row settings when
     * EnableSkipIncompatibleRow is true.
     *
     * @return the redirectIncompatibleRowSettings value.
     */
    public RedirectIncompatibleRowSettings getRedirectIncompatibleRowSettings() {
        return this.redirectIncompatibleRowSettings;
    }

    /**
     * Set the redirectIncompatibleRowSettings property: Redirect incompatible row settings when
     * EnableSkipIncompatibleRow is true.
     *
     * @param redirectIncompatibleRowSettings the redirectIncompatibleRowSettings value to set.
     * @return the CopyActivity object itself.
     */
    public CopyActivity setRedirectIncompatibleRowSettings(
            RedirectIncompatibleRowSettings redirectIncompatibleRowSettings) {
        this.redirectIncompatibleRowSettings = redirectIncompatibleRowSettings;
        return this;
    }

    /**
     * Get the logStorageSettings property: (Deprecated. Please use LogSettings) Log storage settings customer need to
     * provide when enabling session log.
     *
     * @return the logStorageSettings value.
     */
    public LogStorageSettings getLogStorageSettings() {
        return this.logStorageSettings;
    }

    /**
     * Set the logStorageSettings property: (Deprecated. Please use LogSettings) Log storage settings customer need to
     * provide when enabling session log.
     *
     * @param logStorageSettings the logStorageSettings value to set.
     * @return the CopyActivity object itself.
     */
    public CopyActivity setLogStorageSettings(LogStorageSettings logStorageSettings) {
        this.logStorageSettings = logStorageSettings;
        return this;
    }

    /**
     * Get the logSettings property: Log settings customer needs provide when enabling log.
     *
     * @return the logSettings value.
     */
    public LogSettings getLogSettings() {
        return this.logSettings;
    }

    /**
     * Set the logSettings property: Log settings customer needs provide when enabling log.
     *
     * @param logSettings the logSettings value to set.
     * @return the CopyActivity object itself.
     */
    public CopyActivity setLogSettings(LogSettings logSettings) {
        this.logSettings = logSettings;
        return this;
    }

    /**
     * Get the preserveRules property: Preserve Rules.
     *
     * @return the preserveRules value.
     */
    public List<Object> getPreserveRules() {
        return this.preserveRules;
    }

    /**
     * Set the preserveRules property: Preserve Rules.
     *
     * @param preserveRules the preserveRules value to set.
     * @return the CopyActivity object itself.
     */
    public CopyActivity setPreserveRules(List<Object> preserveRules) {
        this.preserveRules = preserveRules;
        return this;
    }

    /**
     * Get the preserve property: Preserve rules.
     *
     * @return the preserve value.
     */
    public List<Object> getPreserve() {
        return this.preserve;
    }

    /**
     * Set the preserve property: Preserve rules.
     *
     * @param preserve the preserve value to set.
     * @return the CopyActivity object itself.
     */
    public CopyActivity setPreserve(List<Object> preserve) {
        this.preserve = preserve;
        return this;
    }

    /**
     * Get the validateDataConsistency property: Whether to enable Data Consistency validation. Type: boolean (or
     * Expression with resultType boolean).
     *
     * @return the validateDataConsistency value.
     */
    public Object getValidateDataConsistency() {
        return this.validateDataConsistency;
    }

    /**
     * Set the validateDataConsistency property: Whether to enable Data Consistency validation. Type: boolean (or
     * Expression with resultType boolean).
     *
     * @param validateDataConsistency the validateDataConsistency value to set.
     * @return the CopyActivity object itself.
     */
    public CopyActivity setValidateDataConsistency(Object validateDataConsistency) {
        this.validateDataConsistency = validateDataConsistency;
        return this;
    }

    /**
     * Get the skipErrorFile property: Specify the fault tolerance for data consistency.
     *
     * @return the skipErrorFile value.
     */
    public SkipErrorFile getSkipErrorFile() {
        return this.skipErrorFile;
    }

    /**
     * Set the skipErrorFile property: Specify the fault tolerance for data consistency.
     *
     * @param skipErrorFile the skipErrorFile value to set.
     * @return the CopyActivity object itself.
     */
    public CopyActivity setSkipErrorFile(SkipErrorFile skipErrorFile) {
        this.skipErrorFile = skipErrorFile;
        return this;
    }
}
