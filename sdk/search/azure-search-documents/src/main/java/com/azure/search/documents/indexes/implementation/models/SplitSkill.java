// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** The SplitSkill model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type")
@JsonTypeName("#Microsoft.Skills.Text.SplitSkill")
@JsonFlatten
@Fluent
public class SplitSkill extends SearchIndexerSkill {
    /*
     * A value indicating which language code to use. Default is en.
     */
    @JsonProperty(value = "defaultLanguageCode")
    private SplitSkillLanguage defaultLanguageCode;

    /*
     * A value indicating which split mode to perform.
     */
    @JsonProperty(value = "textSplitMode")
    private TextSplitMode textSplitMode;

    /*
     * The desired maximum page length. Default is 10000.
     */
    @JsonProperty(value = "maximumPageLength")
    private Integer maximumPageLength;

    /** Creates an instance of SplitSkill class. */
    @JsonCreator
    public SplitSkill(
            @JsonProperty(value = "outputs", required = true) List<OutputFieldMappingEntry> outputs,
            @JsonProperty(value = "inputs", required = true) List<InputFieldMappingEntry> inputs) {
        super(inputs, outputs);
    }

    /**
     * Get the defaultLanguageCode property: A value indicating which language code to use. Default is en.
     *
     * @return the defaultLanguageCode value.
     */
    public SplitSkillLanguage getDefaultLanguageCode() {
        return this.defaultLanguageCode;
    }

    /**
     * Set the defaultLanguageCode property: A value indicating which language code to use. Default is en.
     *
     * @param defaultLanguageCode the defaultLanguageCode value to set.
     * @return the SplitSkill object itself.
     */
    public SplitSkill setDefaultLanguageCode(SplitSkillLanguage defaultLanguageCode) {
        this.defaultLanguageCode = defaultLanguageCode;
        return this;
    }

    /**
     * Get the textSplitMode property: A value indicating which split mode to perform.
     *
     * @return the textSplitMode value.
     */
    public TextSplitMode getTextSplitMode() {
        return this.textSplitMode;
    }

    /**
     * Set the textSplitMode property: A value indicating which split mode to perform.
     *
     * @param textSplitMode the textSplitMode value to set.
     * @return the SplitSkill object itself.
     */
    public SplitSkill setTextSplitMode(TextSplitMode textSplitMode) {
        this.textSplitMode = textSplitMode;
        return this;
    }

    /**
     * Get the maximumPageLength property: The desired maximum page length. Default is 10000.
     *
     * @return the maximumPageLength value.
     */
    public Integer getMaximumPageLength() {
        return this.maximumPageLength;
    }

    /**
     * Set the maximumPageLength property: The desired maximum page length. Default is 10000.
     *
     * @param maximumPageLength the maximumPageLength value to set.
     * @return the SplitSkill object itself.
     */
    public SplitSkill setMaximumPageLength(Integer maximumPageLength) {
        this.maximumPageLength = maximumPageLength;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
