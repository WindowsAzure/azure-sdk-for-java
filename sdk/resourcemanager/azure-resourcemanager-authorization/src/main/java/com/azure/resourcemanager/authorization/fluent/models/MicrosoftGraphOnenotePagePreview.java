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

/** onenotePagePreview. */
@Fluent
public final class MicrosoftGraphOnenotePagePreview {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphOnenotePagePreview.class);

    /*
     * onenotePagePreviewLinks
     */
    @JsonProperty(value = "links")
    private MicrosoftGraphOnenotePagePreviewLinks links;

    /*
     * The previewText property.
     */
    @JsonProperty(value = "previewText")
    private String previewText;

    /*
     * onenotePagePreview
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the links property: onenotePagePreviewLinks.
     *
     * @return the links value.
     */
    public MicrosoftGraphOnenotePagePreviewLinks links() {
        return this.links;
    }

    /**
     * Set the links property: onenotePagePreviewLinks.
     *
     * @param links the links value to set.
     * @return the MicrosoftGraphOnenotePagePreview object itself.
     */
    public MicrosoftGraphOnenotePagePreview withLinks(MicrosoftGraphOnenotePagePreviewLinks links) {
        this.links = links;
        return this;
    }

    /**
     * Get the previewText property: The previewText property.
     *
     * @return the previewText value.
     */
    public String previewText() {
        return this.previewText;
    }

    /**
     * Set the previewText property: The previewText property.
     *
     * @param previewText the previewText value to set.
     * @return the MicrosoftGraphOnenotePagePreview object itself.
     */
    public MicrosoftGraphOnenotePagePreview withPreviewText(String previewText) {
        this.previewText = previewText;
        return this;
    }

    /**
     * Get the additionalProperties property: onenotePagePreview.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: onenotePagePreview.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphOnenotePagePreview object itself.
     */
    public MicrosoftGraphOnenotePagePreview withAdditionalProperties(Map<String, Object> additionalProperties) {
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
        if (links() != null) {
            links().validate();
        }
    }
}
