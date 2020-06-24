// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** The LanguageDetectionSkill model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type")
@JsonTypeName("#Microsoft.Skills.Text.LanguageDetectionSkill")
@JsonFlatten
@Immutable
public class LanguageDetectionSkill extends SearchIndexerSkill {
    /** Creates an instance of LanguageDetectionSkill class. */
    @JsonCreator
    public LanguageDetectionSkill(
            @JsonProperty(value = "outputs", required = true) List<OutputFieldMappingEntry> outputs,
            @JsonProperty(value = "inputs", required = true) List<InputFieldMappingEntry> inputs) {
        super(inputs, outputs);
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
