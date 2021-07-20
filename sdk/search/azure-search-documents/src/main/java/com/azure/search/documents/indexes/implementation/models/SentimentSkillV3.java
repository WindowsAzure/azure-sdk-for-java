// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.search.documents.indexes.models.InputFieldMappingEntry;
import com.azure.search.documents.indexes.models.OutputFieldMappingEntry;
import com.azure.search.documents.indexes.models.SearchIndexerSkill;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Using the Text Analytics API, evaluates unstructured text and for each record, provides sentiment labels (such as
 * "negative", "neutral" and "positive") based on the highest confidence score found by the service at a sentence and
 * document-level.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata.type")
@JsonTypeName("#Microsoft.Skills.Text.V3.SentimentSkill")
@Fluent
public final class SentimentSkillV3 extends SearchIndexerSkill {
    /*
     * A value indicating which language code to use. Default is en.
     */
    @JsonProperty(value = "defaultLanguageCode")
    private String defaultLanguageCode;

    /*
     * If set to true, the skill output will include information from Text
     * Analytics for opinion mining, namely targets (nouns or verbs) and their
     * associated assessment (adjective) in the text. Default is false.
     */
    @JsonProperty(value = "includeOpinionMining")
    private Boolean includeOpinionMining;

    /*
     * The version of the model to use when calling the Text Analytics service.
     * It will default to the latest available when not specified. We recommend
     * you do not specify this value unless absolutely necessary.
     */
    @JsonProperty(value = "modelVersion")
    private String modelVersion;

    /**
     * Creates an instance of SentimentSkillV3 class.
     *
     * @param inputs the inputs value to set.
     * @param outputs the outputs value to set.
     */
    @JsonCreator
    public SentimentSkillV3(
            @JsonProperty(value = "inputs", required = true) List<InputFieldMappingEntry> inputs,
            @JsonProperty(value = "outputs", required = true) List<OutputFieldMappingEntry> outputs) {
        super(inputs, outputs);
    }

    /**
     * Get the defaultLanguageCode property: A value indicating which language code to use. Default is en.
     *
     * @return the defaultLanguageCode value.
     */
    public String getDefaultLanguageCode() {
        return this.defaultLanguageCode;
    }

    /**
     * Set the defaultLanguageCode property: A value indicating which language code to use. Default is en.
     *
     * @param defaultLanguageCode the defaultLanguageCode value to set.
     * @return the SentimentSkillV3 object itself.
     */
    public SentimentSkillV3 setDefaultLanguageCode(String defaultLanguageCode) {
        this.defaultLanguageCode = defaultLanguageCode;
        return this;
    }

    /**
     * Get the includeOpinionMining property: If set to true, the skill output will include information from Text
     * Analytics for opinion mining, namely targets (nouns or verbs) and their associated assessment (adjective) in the
     * text. Default is false.
     *
     * @return the includeOpinionMining value.
     */
    public Boolean isIncludeOpinionMining() {
        return this.includeOpinionMining;
    }

    /**
     * Set the includeOpinionMining property: If set to true, the skill output will include information from Text
     * Analytics for opinion mining, namely targets (nouns or verbs) and their associated assessment (adjective) in the
     * text. Default is false.
     *
     * @param includeOpinionMining the includeOpinionMining value to set.
     * @return the SentimentSkillV3 object itself.
     */
    public SentimentSkillV3 setIncludeOpinionMining(Boolean includeOpinionMining) {
        this.includeOpinionMining = includeOpinionMining;
        return this;
    }

    /**
     * Get the modelVersion property: The version of the model to use when calling the Text Analytics service. It will
     * default to the latest available when not specified. We recommend you do not specify this value unless absolutely
     * necessary.
     *
     * @return the modelVersion value.
     */
    public String getModelVersion() {
        return this.modelVersion;
    }

    /**
     * Set the modelVersion property: The version of the model to use when calling the Text Analytics service. It will
     * default to the latest available when not specified. We recommend you do not specify this value unless absolutely
     * necessary.
     *
     * @param modelVersion the modelVersion value to set.
     * @return the SentimentSkillV3 object itself.
     */
    public SentimentSkillV3 setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }
}
