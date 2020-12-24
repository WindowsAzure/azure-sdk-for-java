// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Data flow debug settings. */
@Fluent
public final class DataFlowDebugPackageDebugSettings {
    /*
     * Source setting for data flow debug.
     */
    @JsonProperty(value = "sourceSettings")
    private List<DataFlowSourceSetting> sourceSettings;

    /*
     * Data flow parameters.
     */
    @JsonProperty(value = "parameters")
    private Map<String, Object> parameters;

    /*
     * Parameters for dataset.
     */
    @JsonProperty(value = "datasetParameters")
    private Object datasetParameters;

    /**
     * Get the sourceSettings property: Source setting for data flow debug.
     *
     * @return the sourceSettings value.
     */
    public List<DataFlowSourceSetting> getSourceSettings() {
        return this.sourceSettings;
    }

    /**
     * Set the sourceSettings property: Source setting for data flow debug.
     *
     * @param sourceSettings the sourceSettings value to set.
     * @return the DataFlowDebugPackageDebugSettings object itself.
     */
    public DataFlowDebugPackageDebugSettings setSourceSettings(List<DataFlowSourceSetting> sourceSettings) {
        this.sourceSettings = sourceSettings;
        return this;
    }

    /**
     * Get the parameters property: Data flow parameters.
     *
     * @return the parameters value.
     */
    public Map<String, Object> getParameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Data flow parameters.
     *
     * @param parameters the parameters value to set.
     * @return the DataFlowDebugPackageDebugSettings object itself.
     */
    public DataFlowDebugPackageDebugSettings setParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the datasetParameters property: Parameters for dataset.
     *
     * @return the datasetParameters value.
     */
    public Object getDatasetParameters() {
        return this.datasetParameters;
    }

    /**
     * Set the datasetParameters property: Parameters for dataset.
     *
     * @param datasetParameters the datasetParameters value to set.
     * @return the DataFlowDebugPackageDebugSettings object itself.
     */
    public DataFlowDebugPackageDebugSettings setDatasetParameters(Object datasetParameters) {
        this.datasetParameters = datasetParameters;
        return this;
    }
}
