// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for IngressState. */
public final class IngressState extends ExpandableStringEnum<IngressState> {
    /** Static value Disabled for IngressState. */
    public static final IngressState DISABLED = fromString("Disabled");

    /** Static value Ready for IngressState. */
    public static final IngressState READY = fromString("Ready");

    /** Static value Running for IngressState. */
    public static final IngressState RUNNING = fromString("Running");

    /** Static value Paused for IngressState. */
    public static final IngressState PAUSED = fromString("Paused");

    /** Static value Unknown for IngressState. */
    public static final IngressState UNKNOWN = fromString("Unknown");

    /**
     * Creates or finds a IngressState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding IngressState.
     */
    @JsonCreator
    public static IngressState fromString(String name) {
        return fromString(name, IngressState.class);
    }

    /** @return known IngressState values. */
    public static Collection<IngressState> values() {
        return values(IngressState.class);
    }
}
