/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Copy activity.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Copy")
@JsonFlatten
public class CopyActivity extends ExecutionActivity {
    /**
     * Copy activity source.
     */
    @JsonProperty(value = "typeProperties.source", required = true)
    private CopySource source;

    /**
     * Copy activity sink.
     */
    @JsonProperty(value = "typeProperties.sink", required = true)
    private CopySink sink;

    /**
     * Copy activity translator. If not specificed, tabular translator is used.
     */
    @JsonProperty(value = "typeProperties.translator")
    private CopyTranslator translator;

    /**
     * Specifies whether to copy data via an interim staging. Default value is
     * false. Type: boolean (or Expression with resultType boolean).
     */
    @JsonProperty(value = "typeProperties.enableStaging")
    private Object enableStaging;

    /**
     * Specifies interim staging settings when EnableStaging is true.
     */
    @JsonProperty(value = "typeProperties.stagingSettings")
    private StagingSettings stagingSettings;

    /**
     * Maximum number of concurrent sessions opened on the source or sink to
     * avoid overloading the data store. Type: integer (or Expression with
     * resultType integer), minimum: 0.
     */
    @JsonProperty(value = "typeProperties.parallelCopies")
    private Object parallelCopies;

    /**
     * Maximum number of cloud data movement units that can be used to perform
     * this data movement. Type: integer (or Expression with resultType
     * integer), minimum: 0.
     */
    @JsonProperty(value = "typeProperties.cloudDataMovementUnits")
    private Object cloudDataMovementUnits;

    /**
     * Whether to skip incompatible row. Default value is false. Type: boolean
     * (or Expression with resultType boolean).
     */
    @JsonProperty(value = "typeProperties.enableSkipIncompatibleRow")
    private Object enableSkipIncompatibleRow;

    /**
     * Redirect incompatible row settings when EnableSkipIncompatibleRow is
     * true.
     */
    @JsonProperty(value = "typeProperties.redirectIncompatibleRowSettings")
    private RedirectIncompatibleRowSettings redirectIncompatibleRowSettings;

    /**
     * List of inputs for the activity.
     */
    @JsonProperty(value = "inputs")
    private List<DatasetReference> inputs;

    /**
     * List of outputs for the activity.
     */
    @JsonProperty(value = "outputs")
    private List<DatasetReference> outputs;

    /**
     * Get copy activity source.
     *
     * @return the source value
     */
    public CopySource source() {
        return this.source;
    }

    /**
     * Set copy activity source.
     *
     * @param source the source value to set
     * @return the CopyActivity object itself.
     */
    public CopyActivity withSource(CopySource source) {
        this.source = source;
        return this;
    }

    /**
     * Get copy activity sink.
     *
     * @return the sink value
     */
    public CopySink sink() {
        return this.sink;
    }

    /**
     * Set copy activity sink.
     *
     * @param sink the sink value to set
     * @return the CopyActivity object itself.
     */
    public CopyActivity withSink(CopySink sink) {
        this.sink = sink;
        return this;
    }

    /**
     * Get copy activity translator. If not specificed, tabular translator is used.
     *
     * @return the translator value
     */
    public CopyTranslator translator() {
        return this.translator;
    }

    /**
     * Set copy activity translator. If not specificed, tabular translator is used.
     *
     * @param translator the translator value to set
     * @return the CopyActivity object itself.
     */
    public CopyActivity withTranslator(CopyTranslator translator) {
        this.translator = translator;
        return this;
    }

    /**
     * Get specifies whether to copy data via an interim staging. Default value is false. Type: boolean (or Expression with resultType boolean).
     *
     * @return the enableStaging value
     */
    public Object enableStaging() {
        return this.enableStaging;
    }

    /**
     * Set specifies whether to copy data via an interim staging. Default value is false. Type: boolean (or Expression with resultType boolean).
     *
     * @param enableStaging the enableStaging value to set
     * @return the CopyActivity object itself.
     */
    public CopyActivity withEnableStaging(Object enableStaging) {
        this.enableStaging = enableStaging;
        return this;
    }

    /**
     * Get specifies interim staging settings when EnableStaging is true.
     *
     * @return the stagingSettings value
     */
    public StagingSettings stagingSettings() {
        return this.stagingSettings;
    }

    /**
     * Set specifies interim staging settings when EnableStaging is true.
     *
     * @param stagingSettings the stagingSettings value to set
     * @return the CopyActivity object itself.
     */
    public CopyActivity withStagingSettings(StagingSettings stagingSettings) {
        this.stagingSettings = stagingSettings;
        return this;
    }

    /**
     * Get maximum number of concurrent sessions opened on the source or sink to avoid overloading the data store. Type: integer (or Expression with resultType integer), minimum: 0.
     *
     * @return the parallelCopies value
     */
    public Object parallelCopies() {
        return this.parallelCopies;
    }

    /**
     * Set maximum number of concurrent sessions opened on the source or sink to avoid overloading the data store. Type: integer (or Expression with resultType integer), minimum: 0.
     *
     * @param parallelCopies the parallelCopies value to set
     * @return the CopyActivity object itself.
     */
    public CopyActivity withParallelCopies(Object parallelCopies) {
        this.parallelCopies = parallelCopies;
        return this;
    }

    /**
     * Get maximum number of cloud data movement units that can be used to perform this data movement. Type: integer (or Expression with resultType integer), minimum: 0.
     *
     * @return the cloudDataMovementUnits value
     */
    public Object cloudDataMovementUnits() {
        return this.cloudDataMovementUnits;
    }

    /**
     * Set maximum number of cloud data movement units that can be used to perform this data movement. Type: integer (or Expression with resultType integer), minimum: 0.
     *
     * @param cloudDataMovementUnits the cloudDataMovementUnits value to set
     * @return the CopyActivity object itself.
     */
    public CopyActivity withCloudDataMovementUnits(Object cloudDataMovementUnits) {
        this.cloudDataMovementUnits = cloudDataMovementUnits;
        return this;
    }

    /**
     * Get whether to skip incompatible row. Default value is false. Type: boolean (or Expression with resultType boolean).
     *
     * @return the enableSkipIncompatibleRow value
     */
    public Object enableSkipIncompatibleRow() {
        return this.enableSkipIncompatibleRow;
    }

    /**
     * Set whether to skip incompatible row. Default value is false. Type: boolean (or Expression with resultType boolean).
     *
     * @param enableSkipIncompatibleRow the enableSkipIncompatibleRow value to set
     * @return the CopyActivity object itself.
     */
    public CopyActivity withEnableSkipIncompatibleRow(Object enableSkipIncompatibleRow) {
        this.enableSkipIncompatibleRow = enableSkipIncompatibleRow;
        return this;
    }

    /**
     * Get redirect incompatible row settings when EnableSkipIncompatibleRow is true.
     *
     * @return the redirectIncompatibleRowSettings value
     */
    public RedirectIncompatibleRowSettings redirectIncompatibleRowSettings() {
        return this.redirectIncompatibleRowSettings;
    }

    /**
     * Set redirect incompatible row settings when EnableSkipIncompatibleRow is true.
     *
     * @param redirectIncompatibleRowSettings the redirectIncompatibleRowSettings value to set
     * @return the CopyActivity object itself.
     */
    public CopyActivity withRedirectIncompatibleRowSettings(RedirectIncompatibleRowSettings redirectIncompatibleRowSettings) {
        this.redirectIncompatibleRowSettings = redirectIncompatibleRowSettings;
        return this;
    }

    /**
     * Get list of inputs for the activity.
     *
     * @return the inputs value
     */
    public List<DatasetReference> inputs() {
        return this.inputs;
    }

    /**
     * Set list of inputs for the activity.
     *
     * @param inputs the inputs value to set
     * @return the CopyActivity object itself.
     */
    public CopyActivity withInputs(List<DatasetReference> inputs) {
        this.inputs = inputs;
        return this;
    }

    /**
     * Get list of outputs for the activity.
     *
     * @return the outputs value
     */
    public List<DatasetReference> outputs() {
        return this.outputs;
    }

    /**
     * Set list of outputs for the activity.
     *
     * @param outputs the outputs value to set
     * @return the CopyActivity object itself.
     */
    public CopyActivity withOutputs(List<DatasetReference> outputs) {
        this.outputs = outputs;
        return this;
    }

}
