// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.digitaltwins.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for EndpointType. */
public final class EndpointType extends ExpandableStringEnum<EndpointType> {
    /** Static value EventHub for EndpointType. */
    public static final EndpointType EVENT_HUB = fromString("EventHub");

    /** Static value EventGrid for EndpointType. */
    public static final EndpointType EVENT_GRID = fromString("EventGrid");

    /** Static value ServiceBus for EndpointType. */
    public static final EndpointType SERVICE_BUS = fromString("ServiceBus");

    /**
     * Creates or finds a EndpointType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EndpointType.
     */
    @JsonCreator
    public static EndpointType fromString(String name) {
        return fromString(name, EndpointType.class);
    }

    /** @return known EndpointType values. */
    public static Collection<EndpointType> values() {
        return values(EndpointType.class);
    }
}
