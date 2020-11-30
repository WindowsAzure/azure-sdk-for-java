// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.resources.models.TagCount;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Tag information. */
@Fluent
public final class TagValueInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TagValueInner.class);

    /*
     * The tag value ID.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The tag value.
     */
    @JsonProperty(value = "tagValue")
    private String tagValue;

    /*
     * The tag value count.
     */
    @JsonProperty(value = "count")
    private TagCount count;

    /**
     * Get the id property: The tag value ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
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
     * @return the TagValueInner object itself.
     */
    public TagValueInner withTagValue(String tagValue) {
        this.tagValue = tagValue;
        return this;
    }

    /**
     * Get the count property: The tag value count.
     *
     * @return the count value.
     */
    public TagCount count() {
        return this.count;
    }

    /**
     * Set the count property: The tag value count.
     *
     * @param count the count value to set.
     * @return the TagValueInner object itself.
     */
    public TagValueInner withCount(TagCount count) {
        this.count = count;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (count() != null) {
            count().validate();
        }
    }
}
