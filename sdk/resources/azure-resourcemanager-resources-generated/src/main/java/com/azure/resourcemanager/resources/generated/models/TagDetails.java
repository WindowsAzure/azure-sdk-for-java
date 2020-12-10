// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.models;

import com.azure.resourcemanager.resources.generated.fluent.models.TagDetailsInner;
import java.util.List;

/** An immutable client-side representation of TagDetails. */
public interface TagDetails {
    /**
     * Gets the id property: The tag name ID.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the tagName property: The tag name.
     *
     * @return the tagName value.
     */
    String tagName();

    /**
     * Gets the count property: The total number of resources that use the resource tag. When a tag is initially created
     * and has no associated resources, the value is 0.
     *
     * @return the count value.
     */
    TagCount count();

    /**
     * Gets the values property: The list of tag values.
     *
     * @return the values value.
     */
    List<TagValue> values();

    /**
     * Gets the inner com.azure.resourcemanager.resources.generated.fluent.models.TagDetailsInner object.
     *
     * @return the inner object.
     */
    TagDetailsInner innerModel();
}
