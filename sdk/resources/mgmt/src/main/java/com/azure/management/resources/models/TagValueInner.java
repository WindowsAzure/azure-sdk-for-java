// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.resources.models;

import com.azure.core.annotation.Fluent;
import com.azure.management.resources.TagCount;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The TagValue model. */
@Fluent
public final class TagValueInner {
    /*
     * The tag ID.
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
     * Get the id property: The tag ID.
     *
     * @return the id value.
     */
    public String getId() {
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
}
