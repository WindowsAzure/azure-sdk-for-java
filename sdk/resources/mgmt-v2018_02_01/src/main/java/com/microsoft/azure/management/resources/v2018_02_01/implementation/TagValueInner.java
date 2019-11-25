/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2018_02_01.implementation;

import com.microsoft.azure.management.resources.v2018_02_01.TagCount;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Tag information.
 */
public class TagValueInner {
    /**
     * The tag ID.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * The tag value.
     */
    @JsonProperty(value = "tagValue")
    private String tagValue;

    /**
     * The tag value count.
     */
    @JsonProperty(value = "count")
    private TagCount count;

    /**
     * Get the tag ID.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the tag value.
     *
     * @return the tagValue value
     */
    public String tagValue() {
        return this.tagValue;
    }

    /**
     * Set the tag value.
     *
     * @param tagValue the tagValue value to set
     * @return the TagValueInner object itself.
     */
    public TagValueInner withTagValue(String tagValue) {
        this.tagValue = tagValue;
        return this;
    }

    /**
     * Get the tag value count.
     *
     * @return the count value
     */
    public TagCount count() {
        return this.count;
    }

    /**
     * Set the tag value count.
     *
     * @param count the count value to set
     * @return the TagValueInner object itself.
     */
    public TagValueInner withCount(TagCount count) {
        this.count = count;
        return this;
    }

}
