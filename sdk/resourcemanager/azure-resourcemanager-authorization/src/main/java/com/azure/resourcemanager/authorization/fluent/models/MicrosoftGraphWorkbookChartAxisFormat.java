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

/** workbookChartAxisFormat. */
@Fluent
public final class MicrosoftGraphWorkbookChartAxisFormat extends MicrosoftGraphEntity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphWorkbookChartAxisFormat.class);

    /*
     * workbookChartFont
     */
    @JsonProperty(value = "font")
    private MicrosoftGraphWorkbookChartFont font;

    /*
     * workbookChartLineFormat
     */
    @JsonProperty(value = "line")
    private MicrosoftGraphWorkbookChartLineFormat line;

    /*
     * workbookChartAxisFormat
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the font property: workbookChartFont.
     *
     * @return the font value.
     */
    public MicrosoftGraphWorkbookChartFont font() {
        return this.font;
    }

    /**
     * Set the font property: workbookChartFont.
     *
     * @param font the font value to set.
     * @return the MicrosoftGraphWorkbookChartAxisFormat object itself.
     */
    public MicrosoftGraphWorkbookChartAxisFormat withFont(MicrosoftGraphWorkbookChartFont font) {
        this.font = font;
        return this;
    }

    /**
     * Get the line property: workbookChartLineFormat.
     *
     * @return the line value.
     */
    public MicrosoftGraphWorkbookChartLineFormat line() {
        return this.line;
    }

    /**
     * Set the line property: workbookChartLineFormat.
     *
     * @param line the line value to set.
     * @return the MicrosoftGraphWorkbookChartAxisFormat object itself.
     */
    public MicrosoftGraphWorkbookChartAxisFormat withLine(MicrosoftGraphWorkbookChartLineFormat line) {
        this.line = line;
        return this;
    }

    /**
     * Get the additionalProperties property: workbookChartAxisFormat.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: workbookChartAxisFormat.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphWorkbookChartAxisFormat object itself.
     */
    public MicrosoftGraphWorkbookChartAxisFormat withAdditionalProperties(Map<String, Object> additionalProperties) {
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

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphWorkbookChartAxisFormat withId(String id) {
        super.withId(id);
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
        if (font() != null) {
            font().validate();
        }
        if (line() != null) {
            line().validate();
        }
    }
}
