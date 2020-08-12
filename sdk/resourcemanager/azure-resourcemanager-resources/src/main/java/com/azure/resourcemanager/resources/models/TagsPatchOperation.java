// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for TagsPatchOperation. */
public final class TagsPatchOperation extends ExpandableStringEnum<TagsPatchOperation> {
    /** Static value Replace for TagsPatchOperation. */
    public static final TagsPatchOperation REPLACE = fromString("Replace");

    /** Static value Merge for TagsPatchOperation. */
    public static final TagsPatchOperation MERGE = fromString("Merge");

    /** Static value Delete for TagsPatchOperation. */
    public static final TagsPatchOperation DELETE = fromString("Delete");

    /**
     * Creates or finds a TagsPatchOperation from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TagsPatchOperation.
     */
    @JsonCreator
    public static TagsPatchOperation fromString(String name) {
        return fromString(name, TagsPatchOperation.class);
    }

    /** @return known TagsPatchOperation values. */
    public static Collection<TagsPatchOperation> values() {
        return values(TagsPatchOperation.class);
    }
}
