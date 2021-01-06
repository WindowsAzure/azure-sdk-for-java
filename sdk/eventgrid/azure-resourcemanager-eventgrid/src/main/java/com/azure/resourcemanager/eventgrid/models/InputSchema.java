// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for InputSchema. */
public final class InputSchema extends ExpandableStringEnum<InputSchema> {
    /** Static value EventGridSchema for InputSchema. */
    public static final InputSchema EVENT_GRID_SCHEMA = fromString("EventGridSchema");

    /** Static value CustomEventSchema for InputSchema. */
    public static final InputSchema CUSTOM_EVENT_SCHEMA = fromString("CustomEventSchema");

    /** Static value CloudEventSchemaV1_0 for InputSchema. */
    public static final InputSchema CLOUD_EVENT_SCHEMA_V1_0 = fromString("CloudEventSchemaV1_0");

    /**
     * Creates or finds a InputSchema from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding InputSchema.
     */
    @JsonCreator
    public static InputSchema fromString(String name) {
        return fromString(name, InputSchema.class);
    }

    /** @return known InputSchema values. */
    public static Collection<InputSchema> values() {
        return values(InputSchema.class);
    }
}
