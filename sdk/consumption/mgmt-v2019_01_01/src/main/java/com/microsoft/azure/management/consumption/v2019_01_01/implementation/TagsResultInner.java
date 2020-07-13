/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.consumption.v2019_01_01.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * A resource listing all tags.
 */
@JsonFlatten
public class TagsResultInner extends ProxyResource {
    /**
     * A list of Tag.
     */
    @JsonProperty(value = "properties.tags")
    private List<TagInner> tags;

    /**
     * eTag of the resource. To handle concurrent update scenario, this field
     * will be used to determine whether the user is updating the latest
     * version or not.
     */
    @JsonProperty(value = "eTag")
    private String eTag;

    /**
     * Get a list of Tag.
     *
     * @return the tags value
     */
    public List<TagInner> tags() {
        return this.tags;
    }

    /**
     * Set a list of Tag.
     *
     * @param tags the tags value to set
     * @return the TagsResultInner object itself.
     */
    public TagsResultInner withTags(List<TagInner> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get eTag of the resource. To handle concurrent update scenario, this field will be used to determine whether the user is updating the latest version or not.
     *
     * @return the eTag value
     */
    public String eTag() {
        return this.eTag;
    }

    /**
     * Set eTag of the resource. To handle concurrent update scenario, this field will be used to determine whether the user is updating the latest version or not.
     *
     * @param eTag the eTag value to set
     * @return the TagsResultInner object itself.
     */
    public TagsResultInner withETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

}
