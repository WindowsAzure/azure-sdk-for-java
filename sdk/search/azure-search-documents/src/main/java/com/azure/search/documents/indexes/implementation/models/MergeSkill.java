// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.search.documents.indexes.models.OutputFieldMappingEntry;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** The MergeSkill model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type")
@JsonTypeName("#Microsoft.Skills.Text.MergeSkill")
@JsonFlatten
@Fluent
public class MergeSkill extends SearchIndexerSkill {
    /*
     * The tag indicates the start of the merged text. By default, the tag is
     * an empty space.
     */
    @JsonProperty(value = "insertPreTag")
    private String insertPreTag;

    /*
     * The tag indicates the end of the merged text. By default, the tag is an
     * empty space.
     */
    @JsonProperty(value = "insertPostTag")
    private String insertPostTag;

    /** Creates an instance of MergeSkill class. */
    @JsonCreator
    public MergeSkill(
            @JsonProperty(value = "inputs", required = true) List<InputFieldMappingEntry> inputs,
            @JsonProperty(value = "outputs", required = true) List<OutputFieldMappingEntry> outputs) {
        super(inputs, outputs);
    }

    /**
     * Get the insertPreTag property: The tag indicates the start of the merged text. By default, the tag is an empty
     * space.
     *
     * @return the insertPreTag value.
     */
    public String getInsertPreTag() {
        return this.insertPreTag;
    }

    /**
     * Set the insertPreTag property: The tag indicates the start of the merged text. By default, the tag is an empty
     * space.
     *
     * @param insertPreTag the insertPreTag value to set.
     * @return the MergeSkill object itself.
     */
    public MergeSkill setInsertPreTag(String insertPreTag) {
        this.insertPreTag = insertPreTag;
        return this;
    }

    /**
     * Get the insertPostTag property: The tag indicates the end of the merged text. By default, the tag is an empty
     * space.
     *
     * @return the insertPostTag value.
     */
    public String getInsertPostTag() {
        return this.insertPostTag;
    }

    /**
     * Set the insertPostTag property: The tag indicates the end of the merged text. By default, the tag is an empty
     * space.
     *
     * @param insertPostTag the insertPostTag value to set.
     * @return the MergeSkill object itself.
     */
    public MergeSkill setInsertPostTag(String insertPostTag) {
        this.insertPostTag = insertPostTag;
        return this;
    }
}
