// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** Request body structure for starting data flow debug session. */
@Fluent
public final class DataFlowDebugPackage {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DataFlowDebugPackage.class);

    /*
     * The ID of data flow debug session.
     */
    @JsonProperty(value = "sessionId")
    private String sessionId;

    /*
     * Data flow instance.
     */
    @JsonProperty(value = "dataFlow")
    private DataFlowDebugResource dataFlow;

    /*
     * List of datasets.
     */
    @JsonProperty(value = "datasets")
    private List<DatasetDebugResource> datasets;

    /*
     * List of linked services.
     */
    @JsonProperty(value = "linkedServices")
    private List<LinkedServiceDebugResource> linkedServices;

    /*
     * Staging info for debug session.
     */
    @JsonProperty(value = "staging")
    private DataFlowStagingInfo staging;

    /*
     * Data flow debug settings.
     */
    @JsonProperty(value = "debugSettings")
    private DataFlowDebugPackageDebugSettings debugSettings;

    /*
     * Request body structure for starting data flow debug session.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the sessionId property: The ID of data flow debug session.
     *
     * @return the sessionId value.
     */
    public String sessionId() {
        return this.sessionId;
    }

    /**
     * Set the sessionId property: The ID of data flow debug session.
     *
     * @param sessionId the sessionId value to set.
     * @return the DataFlowDebugPackage object itself.
     */
    public DataFlowDebugPackage withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * Get the dataFlow property: Data flow instance.
     *
     * @return the dataFlow value.
     */
    public DataFlowDebugResource dataFlow() {
        return this.dataFlow;
    }

    /**
     * Set the dataFlow property: Data flow instance.
     *
     * @param dataFlow the dataFlow value to set.
     * @return the DataFlowDebugPackage object itself.
     */
    public DataFlowDebugPackage withDataFlow(DataFlowDebugResource dataFlow) {
        this.dataFlow = dataFlow;
        return this;
    }

    /**
     * Get the datasets property: List of datasets.
     *
     * @return the datasets value.
     */
    public List<DatasetDebugResource> datasets() {
        return this.datasets;
    }

    /**
     * Set the datasets property: List of datasets.
     *
     * @param datasets the datasets value to set.
     * @return the DataFlowDebugPackage object itself.
     */
    public DataFlowDebugPackage withDatasets(List<DatasetDebugResource> datasets) {
        this.datasets = datasets;
        return this;
    }

    /**
     * Get the linkedServices property: List of linked services.
     *
     * @return the linkedServices value.
     */
    public List<LinkedServiceDebugResource> linkedServices() {
        return this.linkedServices;
    }

    /**
     * Set the linkedServices property: List of linked services.
     *
     * @param linkedServices the linkedServices value to set.
     * @return the DataFlowDebugPackage object itself.
     */
    public DataFlowDebugPackage withLinkedServices(List<LinkedServiceDebugResource> linkedServices) {
        this.linkedServices = linkedServices;
        return this;
    }

    /**
     * Get the staging property: Staging info for debug session.
     *
     * @return the staging value.
     */
    public DataFlowStagingInfo staging() {
        return this.staging;
    }

    /**
     * Set the staging property: Staging info for debug session.
     *
     * @param staging the staging value to set.
     * @return the DataFlowDebugPackage object itself.
     */
    public DataFlowDebugPackage withStaging(DataFlowStagingInfo staging) {
        this.staging = staging;
        return this;
    }

    /**
     * Get the debugSettings property: Data flow debug settings.
     *
     * @return the debugSettings value.
     */
    public DataFlowDebugPackageDebugSettings debugSettings() {
        return this.debugSettings;
    }

    /**
     * Set the debugSettings property: Data flow debug settings.
     *
     * @param debugSettings the debugSettings value to set.
     * @return the DataFlowDebugPackage object itself.
     */
    public DataFlowDebugPackage withDebugSettings(DataFlowDebugPackageDebugSettings debugSettings) {
        this.debugSettings = debugSettings;
        return this;
    }

    /**
     * Get the additionalProperties property: Request body structure for starting data flow debug session.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Request body structure for starting data flow debug session.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the DataFlowDebugPackage object itself.
     */
    public DataFlowDebugPackage withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dataFlow() != null) {
            dataFlow().validate();
        }
        if (datasets() != null) {
            datasets().forEach(e -> e.validate());
        }
        if (linkedServices() != null) {
            linkedServices().forEach(e -> e.validate());
        }
        if (staging() != null) {
            staging().validate();
        }
        if (debugSettings() != null) {
            debugSettings().validate();
        }
    }
}
