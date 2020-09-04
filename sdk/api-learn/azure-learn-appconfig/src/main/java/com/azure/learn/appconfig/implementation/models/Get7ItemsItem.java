// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.learn.appconfig.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Get7ItemsItem. */
public final class Get7ItemsItem extends ExpandableStringEnum<Get7ItemsItem> {
    /** Static value key for Get7ItemsItem. */
    public static final Get7ItemsItem KEY = fromString("key");

    /** Static value label for Get7ItemsItem. */
    public static final Get7ItemsItem LABEL = fromString("label");

    /** Static value content_type for Get7ItemsItem. */
    public static final Get7ItemsItem CONTENT_TYPE = fromString("content_type");

    /** Static value value for Get7ItemsItem. */
    public static final Get7ItemsItem VALUE = fromString("value");

    /** Static value last_modified for Get7ItemsItem. */
    public static final Get7ItemsItem LAST_MODIFIED = fromString("last_modified");

    /** Static value tags for Get7ItemsItem. */
    public static final Get7ItemsItem TAGS = fromString("tags");

    /** Static value locked for Get7ItemsItem. */
    public static final Get7ItemsItem LOCKED = fromString("locked");

    /** Static value etag for Get7ItemsItem. */
    public static final Get7ItemsItem ETAG = fromString("etag");

    /**
     * Creates or finds a Get7ItemsItem from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Get7ItemsItem.
     */
    @JsonCreator
    public static Get7ItemsItem fromString(String name) {
        return fromString(name, Get7ItemsItem.class);
    }

    /** @return known Get7ItemsItem values. */
    public static Collection<Get7ItemsItem> values() {
        return values(Get7ItemsItem.class);
    }
}
