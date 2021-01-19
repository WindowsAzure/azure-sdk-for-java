/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for FlowLogFormatType.
 */
public final class FlowLogFormatType extends ExpandableStringEnum<FlowLogFormatType> {
    /** Static value JSON for FlowLogFormatType. */
    public static final FlowLogFormatType JSON = fromString("JSON");

    /**
     * Creates or finds a FlowLogFormatType from its string representation.
     * @param name a name to look for
     * @return the corresponding FlowLogFormatType
     */
    @JsonCreator
    public static FlowLogFormatType fromString(String name) {
        return fromString(name, FlowLogFormatType.class);
    }

    /**
     * @return known FlowLogFormatType values
     */
    public static Collection<FlowLogFormatType> values() {
        return values(FlowLogFormatType.class);
    }
}
