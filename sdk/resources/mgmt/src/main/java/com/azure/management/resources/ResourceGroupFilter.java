// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.resources;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ResourceGroupFilter model. */
@Fluent
public final class ResourceGroupFilter {
    /*
     * The tag name.
     */
    @JsonProperty(value = "tagName")
    private String tagName;

    /*
     * The tag value.
     */
    @JsonProperty(value = "tagValue")
    private String tagValue;

    /**
     * Get the tagName property: The tag name.
     *
     * @return the tagName value.
     */
    public String tagName() {
        return this.tagName;
    }

    /**
     * Set the tagName property: The tag name.
     *
     * @param tagName the tagName value to set.
     * @return the ResourceGroupFilter object itself.
     */
    public ResourceGroupFilter withTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }

    /**
     * Get the tagValue property: The tag value.
     *
     * @return the tagValue value.
     */
    public String tagValue() {
        return this.tagValue;
    }

    /**
     * Set the tagValue property: The tag value.
     *
     * @param tagValue the tagValue value to set.
     * @return the ResourceGroupFilter object itself.
     */
    public ResourceGroupFilter withTagValue(String tagValue) {
        this.tagValue = tagValue;
        return this;
    }
}
