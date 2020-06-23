// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.indexes.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for VisualFeature.
 */
public final class VisualFeature extends ExpandableStringEnum<VisualFeature> {
    /**
     * Static value adult for VisualFeature.
     */
    public static final VisualFeature ADULT = fromString("adult");

    /**
     * Static value brands for VisualFeature.
     */
    public static final VisualFeature BRANDS = fromString("brands");

    /**
     * Static value categories for VisualFeature.
     */
    public static final VisualFeature CATEGORIES = fromString("categories");

    /**
     * Static value description for VisualFeature.
     */
    public static final VisualFeature DESCRIPTION = fromString("description");

    /**
     * Static value faces for VisualFeature.
     */
    public static final VisualFeature FACES = fromString("faces");

    /**
     * Static value objects for VisualFeature.
     */
    public static final VisualFeature OBJECTS = fromString("objects");

    /**
     * Static value tags for VisualFeature.
     */
    public static final VisualFeature TAGS = fromString("tags");

    /**
     * Creates or finds a VisualFeature from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding VisualFeature.
     */
    @JsonCreator
    public static VisualFeature fromString(String name) {
        return fromString(name, VisualFeature.class);
    }

    /**
     * @return known VisualFeature values.
     */
    public static Collection<VisualFeature> values() {
        return values(VisualFeature.class);
    }
}
