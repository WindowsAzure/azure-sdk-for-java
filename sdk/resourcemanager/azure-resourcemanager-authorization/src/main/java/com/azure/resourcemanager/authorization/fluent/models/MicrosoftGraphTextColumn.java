// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** textColumn. */
@Fluent
public final class MicrosoftGraphTextColumn {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphTextColumn.class);

    /*
     * Whether to allow multiple lines of text.
     */
    @JsonProperty(value = "allowMultipleLines")
    private Boolean allowMultipleLines;

    /*
     * Whether updates to this column should replace existing text, or append
     * to it.
     */
    @JsonProperty(value = "appendChangesToExistingText")
    private Boolean appendChangesToExistingText;

    /*
     * The size of the text box.
     */
    @JsonProperty(value = "linesForEditing")
    private Integer linesForEditing;

    /*
     * The maximum number of characters for the value.
     */
    @JsonProperty(value = "maxLength")
    private Integer maxLength;

    /*
     * The type of text being stored. Must be one of plain or richText
     */
    @JsonProperty(value = "textType")
    private String textType;

    /*
     * textColumn
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the allowMultipleLines property: Whether to allow multiple lines of text.
     *
     * @return the allowMultipleLines value.
     */
    public Boolean allowMultipleLines() {
        return this.allowMultipleLines;
    }

    /**
     * Set the allowMultipleLines property: Whether to allow multiple lines of text.
     *
     * @param allowMultipleLines the allowMultipleLines value to set.
     * @return the MicrosoftGraphTextColumn object itself.
     */
    public MicrosoftGraphTextColumn withAllowMultipleLines(Boolean allowMultipleLines) {
        this.allowMultipleLines = allowMultipleLines;
        return this;
    }

    /**
     * Get the appendChangesToExistingText property: Whether updates to this column should replace existing text, or
     * append to it.
     *
     * @return the appendChangesToExistingText value.
     */
    public Boolean appendChangesToExistingText() {
        return this.appendChangesToExistingText;
    }

    /**
     * Set the appendChangesToExistingText property: Whether updates to this column should replace existing text, or
     * append to it.
     *
     * @param appendChangesToExistingText the appendChangesToExistingText value to set.
     * @return the MicrosoftGraphTextColumn object itself.
     */
    public MicrosoftGraphTextColumn withAppendChangesToExistingText(Boolean appendChangesToExistingText) {
        this.appendChangesToExistingText = appendChangesToExistingText;
        return this;
    }

    /**
     * Get the linesForEditing property: The size of the text box.
     *
     * @return the linesForEditing value.
     */
    public Integer linesForEditing() {
        return this.linesForEditing;
    }

    /**
     * Set the linesForEditing property: The size of the text box.
     *
     * @param linesForEditing the linesForEditing value to set.
     * @return the MicrosoftGraphTextColumn object itself.
     */
    public MicrosoftGraphTextColumn withLinesForEditing(Integer linesForEditing) {
        this.linesForEditing = linesForEditing;
        return this;
    }

    /**
     * Get the maxLength property: The maximum number of characters for the value.
     *
     * @return the maxLength value.
     */
    public Integer maxLength() {
        return this.maxLength;
    }

    /**
     * Set the maxLength property: The maximum number of characters for the value.
     *
     * @param maxLength the maxLength value to set.
     * @return the MicrosoftGraphTextColumn object itself.
     */
    public MicrosoftGraphTextColumn withMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
        return this;
    }

    /**
     * Get the textType property: The type of text being stored. Must be one of plain or richText.
     *
     * @return the textType value.
     */
    public String textType() {
        return this.textType;
    }

    /**
     * Set the textType property: The type of text being stored. Must be one of plain or richText.
     *
     * @param textType the textType value to set.
     * @return the MicrosoftGraphTextColumn object itself.
     */
    public MicrosoftGraphTextColumn withTextType(String textType) {
        this.textType = textType;
        return this;
    }

    /**
     * Get the additionalProperties property: textColumn.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: textColumn.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphTextColumn object itself.
     */
    public MicrosoftGraphTextColumn withAdditionalProperties(Map<String, Object> additionalProperties) {
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
    }
}
