// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.List;
import java.util.Map;

/** A skill that extracts content from a file within the enrichment pipeline. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type")
@JsonTypeName("#Microsoft.Skills.Util.DocumentExtractionSkill")
@JsonFlatten
@Fluent
public final class DocumentExtractionSkill extends SearchIndexerSkill {
    /*
     * The parsingMode for the skill. Will be set to 'default' if not defined.
     */
    @JsonProperty(value = "parsingMode")
    private String parsingMode;

    /*
     * The type of data to be extracted for the skill. Will be set to
     * 'contentAndMetadata' if not defined.
     */
    @JsonProperty(value = "dataToExtract")
    private String dataToExtract;

    /*
     * A dictionary of configurations for the skill.
     */
    @JsonProperty(value = "configuration")
    private Map<String, Object> configuration;

    /**
     * Creates an instance of DocumentExtractionSkill class.
     *
     * @param inputs the inputs value to set.
     * @param outputs the outputs value to set.
     */
    @JsonCreator
    public DocumentExtractionSkill(
        @JsonProperty(value = "inputs", required = true) List<InputFieldMappingEntry> inputs,
        @JsonProperty(value = "outputs", required = true) List<OutputFieldMappingEntry> outputs) {
        super(inputs, outputs);
    }

    /**
     * Get the parsingMode property: The parsingMode for the skill. Will be set to 'default' if not defined.
     *
     * @return the parsingMode value.
     */
    public String getParsingMode() {
        return this.parsingMode;
    }

    /**
     * Set the parsingMode property: The parsingMode for the skill. Will be set to 'default' if not defined.
     *
     * @param parsingMode the parsingMode value to set.
     * @return the DocumentExtractionSkill object itself.
     */
    public DocumentExtractionSkill setParsingMode(String parsingMode) {
        this.parsingMode = parsingMode;
        return this;
    }

    /**
     * Get the dataToExtract property: The type of data to be extracted for the skill. Will be set to
     * 'contentAndMetadata' if not defined.
     *
     * @return the dataToExtract value.
     */
    public String getDataToExtract() {
        return this.dataToExtract;
    }

    /**
     * Set the dataToExtract property: The type of data to be extracted for the skill. Will be set to
     * 'contentAndMetadata' if not defined.
     *
     * @param dataToExtract the dataToExtract value to set.
     * @return the DocumentExtractionSkill object itself.
     */
    public DocumentExtractionSkill setDataToExtract(String dataToExtract) {
        this.dataToExtract = dataToExtract;
        return this;
    }

    /**
     * Get the configuration property: A dictionary of configurations for the skill.
     *
     * @return the configuration value.
     */
    public Map<String, Object> getConfiguration() {
        return this.configuration;
    }

    /**
     * Set the configuration property: A dictionary of configurations for the skill.
     *
     * @param configuration the configuration value to set.
     * @return the DocumentExtractionSkill object itself.
     */
    public DocumentExtractionSkill setConfiguration(Map<String, Object> configuration) {
        this.configuration = configuration;
        return this;
    }
}
