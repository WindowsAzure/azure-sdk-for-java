// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
=======
>>>>>>> b58ce026c9fe5fc4ad488b3aa7c0985968f73487
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** The ShaperSkill model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type")
@JsonTypeName("#Microsoft.Skills.Util.ShaperSkill")
@JsonFlatten
@Immutable
<<<<<<< HEAD
public class ShaperSkill extends SearchIndexerSkill {
    /** Creates an instance of ShaperSkill class. */
    @JsonCreator
    public ShaperSkill(
            @JsonProperty(value = "inputs") List<InputFieldMappingEntry> inputs,
            @JsonProperty(value = "outputs") List<OutputFieldMappingEntry> outputs) {
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
=======
public class ShaperSkill extends SearchIndexerSkill {}
>>>>>>> b58ce026c9fe5fc4ad488b3aa7c0985968f73487
