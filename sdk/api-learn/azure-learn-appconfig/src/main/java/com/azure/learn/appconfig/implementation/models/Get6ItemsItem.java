// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.learn.appconfig.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Get6ItemsItem. */
public final class Get6ItemsItem extends ExpandableStringEnum<Get6ItemsItem> {
    /** Static value key for Get6ItemsItem. */
    public static final Get6ItemsItem KEY = fromString("key");

    /** Static value label for Get6ItemsItem. */
    public static final Get6ItemsItem LABEL = fromString("label");

    /** Static value content_type for Get6ItemsItem. */
    public static final Get6ItemsItem CONTENT_TYPE = fromString("content_type");

    /** Static value value for Get6ItemsItem. */
    public static final Get6ItemsItem VALUE = fromString("value");

    /** Static value last_modified for Get6ItemsItem. */
    public static final Get6ItemsItem LAST_MODIFIED = fromString("last_modified");

    /** Static value tags for Get6ItemsItem. */
    public static final Get6ItemsItem TAGS = fromString("tags");

    /** Static value locked for Get6ItemsItem. */
    public static final Get6ItemsItem LOCKED = fromString("locked");

    /** Static value etag for Get6ItemsItem. */
    public static final Get6ItemsItem ETAG = fromString("etag");

    /**
     * Creates or finds a Get6ItemsItem from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Get6ItemsItem.
     */
    @JsonCreator
    public static Get6ItemsItem fromString(String name) {
        return fromString(name, Get6ItemsItem.class);
    }

    /** @return known Get6ItemsItem values. */
    public static Collection<Get6ItemsItem> values() {
        return values(Get6ItemsItem.class);
    }
}
