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

/** localeInfo. */
@Fluent
public final class MicrosoftGraphLocaleInfo {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphLocaleInfo.class);

    /*
     * A name representing the user's locale in natural language, for example,
     * 'English (United States)'.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * A locale representation for the user, which includes the user's
     * preferred language and country/region. For example, 'en-us'. The
     * language component follows 2-letter codes as defined in ISO 639-1, and
     * the country component follows 2-letter codes as defined in ISO 3166-1
     * alpha-2.
     */
    @JsonProperty(value = "locale")
    private String locale;

    /*
     * localeInfo
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the displayName property: A name representing the user's locale in natural language, for example, 'English
     * (United States)'.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: A name representing the user's locale in natural language, for example, 'English
     * (United States)'.
     *
     * @param displayName the displayName value to set.
     * @return the MicrosoftGraphLocaleInfo object itself.
     */
    public MicrosoftGraphLocaleInfo withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the locale property: A locale representation for the user, which includes the user's preferred language and
     * country/region. For example, 'en-us'. The language component follows 2-letter codes as defined in ISO 639-1, and
     * the country component follows 2-letter codes as defined in ISO 3166-1 alpha-2.
     *
     * @return the locale value.
     */
    public String locale() {
        return this.locale;
    }

    /**
     * Set the locale property: A locale representation for the user, which includes the user's preferred language and
     * country/region. For example, 'en-us'. The language component follows 2-letter codes as defined in ISO 639-1, and
     * the country component follows 2-letter codes as defined in ISO 3166-1 alpha-2.
     *
     * @param locale the locale value to set.
     * @return the MicrosoftGraphLocaleInfo object itself.
     */
    public MicrosoftGraphLocaleInfo withLocale(String locale) {
        this.locale = locale;
        return this;
    }

    /**
     * Get the additionalProperties property: localeInfo.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: localeInfo.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphLocaleInfo object itself.
     */
    public MicrosoftGraphLocaleInfo withAdditionalProperties(Map<String, Object> additionalProperties) {
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
