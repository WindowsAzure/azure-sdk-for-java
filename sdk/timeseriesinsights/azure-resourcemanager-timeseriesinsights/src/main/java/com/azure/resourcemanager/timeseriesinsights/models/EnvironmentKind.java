// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for EnvironmentKind. */
public final class EnvironmentKind extends ExpandableStringEnum<EnvironmentKind> {
    /** Static value Gen1 for EnvironmentKind. */
    public static final EnvironmentKind GEN1 = fromString("Gen1");

    /** Static value Gen2 for EnvironmentKind. */
    public static final EnvironmentKind GEN2 = fromString("Gen2");

    /**
     * Creates or finds a EnvironmentKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EnvironmentKind.
     */
    @JsonCreator
    public static EnvironmentKind fromString(String name) {
        return fromString(name, EnvironmentKind.class);
    }

    /** @return known EnvironmentKind values. */
    public static Collection<EnvironmentKind> values() {
        return values(EnvironmentKind.class);
    }
}
