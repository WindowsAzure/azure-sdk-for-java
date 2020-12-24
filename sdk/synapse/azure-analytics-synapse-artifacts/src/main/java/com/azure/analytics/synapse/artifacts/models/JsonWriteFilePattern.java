// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for JsonWriteFilePattern. */
public final class JsonWriteFilePattern extends ExpandableStringEnum<JsonWriteFilePattern> {
    /** Static value setOfObjects for JsonWriteFilePattern. */
    public static final JsonWriteFilePattern SET_OF_OBJECTS = fromString("setOfObjects");

    /** Static value arrayOfObjects for JsonWriteFilePattern. */
    public static final JsonWriteFilePattern ARRAY_OF_OBJECTS = fromString("arrayOfObjects");

    /**
     * Creates or finds a JsonWriteFilePattern from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding JsonWriteFilePattern.
     */
    @JsonCreator
    public static JsonWriteFilePattern fromString(String name) {
        return fromString(name, JsonWriteFilePattern.class);
    }

    /** @return known JsonWriteFilePattern values. */
    public static Collection<JsonWriteFilePattern> values() {
        return values(JsonWriteFilePattern.class);
    }
}
