// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.Collection;

/**
 * Defines values for TextStyleName.
 */
public final class TextStyleName extends ExpandableStringEnum<TextStyleName> {
    /** Static value other for TextStyleName. */
    public static final TextStyleName OTHER = fromString("other");

    /** Static value handwriting for TextStyleName. */
    public static final TextStyleName HANDWRITING = fromString("handwriting");

    /**
     * Creates or finds a TextStyleName from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TextStyleName.
     */
    @JsonCreator
    public static TextStyleName fromString(String name) {
        return fromString(name, TextStyleName.class);
    }

    /** @return known TextStyleName values. */
    public static Collection<TextStyleName> values() {
        return values(TextStyleName.class);
    }
}
