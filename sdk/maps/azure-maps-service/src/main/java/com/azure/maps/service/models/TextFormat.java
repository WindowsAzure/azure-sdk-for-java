// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for TextFormat. */
public final class TextFormat extends ExpandableStringEnum<TextFormat> {
    /** Static value json for TextFormat. */
    public static final TextFormat JSON = fromString("json");

    /** Static value xml for TextFormat. */
    public static final TextFormat XML = fromString("xml");

    /**
     * Creates or finds a TextFormat from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TextFormat.
     */
    @JsonCreator
    public static TextFormat fromString(String name) {
        return fromString(name, TextFormat.class);
    }

    /** @return known TextFormat values. */
    public static Collection<TextFormat> values() {
        return values(TextFormat.class);
    }
}
