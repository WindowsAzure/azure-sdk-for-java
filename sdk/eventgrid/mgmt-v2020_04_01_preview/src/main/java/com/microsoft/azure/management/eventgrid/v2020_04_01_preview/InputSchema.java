/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2020_04_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for InputSchema.
 */
public final class InputSchema extends ExpandableStringEnum<InputSchema> {
    /** Static value EventGridSchema for InputSchema. */
    public static final InputSchema EVENT_GRID_SCHEMA = fromString("EventGridSchema");

    /** Static value CustomEventSchema for InputSchema. */
    public static final InputSchema CUSTOM_EVENT_SCHEMA = fromString("CustomEventSchema");

    /** Static value CloudEventSchemaV1_0 for InputSchema. */
    public static final InputSchema CLOUD_EVENT_SCHEMA_V1_0 = fromString("CloudEventSchemaV1_0");

    /**
     * Creates or finds a InputSchema from its string representation.
     * @param name a name to look for
     * @return the corresponding InputSchema
     */
    @JsonCreator
    public static InputSchema fromString(String name) {
        return fromString(name, InputSchema.class);
    }

    /**
     * @return known InputSchema values
     */
    public static Collection<InputSchema> values() {
        return values(InputSchema.class);
    }
}
