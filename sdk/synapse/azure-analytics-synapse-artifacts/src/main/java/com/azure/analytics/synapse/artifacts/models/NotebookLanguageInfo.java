// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** Language info. */
@Fluent
public final class NotebookLanguageInfo {
    /*
     * The programming language which this kernel runs.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The codemirror mode to use for code in this language.
     */
    @JsonProperty(value = "codemirror_mode")
    private String codemirrorMode;

    /*
     * Language info.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the name property: The programming language which this kernel runs.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The programming language which this kernel runs.
     *
     * @param name the name value to set.
     * @return the NotebookLanguageInfo object itself.
     */
    public NotebookLanguageInfo setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the codemirrorMode property: The codemirror mode to use for code in this language.
     *
     * @return the codemirrorMode value.
     */
    public String getCodemirrorMode() {
        return this.codemirrorMode;
    }

    /**
     * Set the codemirrorMode property: The codemirror mode to use for code in this language.
     *
     * @param codemirrorMode the codemirrorMode value to set.
     * @return the NotebookLanguageInfo object itself.
     */
    public NotebookLanguageInfo setCodemirrorMode(String codemirrorMode) {
        this.codemirrorMode = codemirrorMode;
        return this;
    }

    /**
     * Get the additionalProperties property: Language info.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Language info.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the NotebookLanguageInfo object itself.
     */
    public NotebookLanguageInfo setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void setAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }
}
