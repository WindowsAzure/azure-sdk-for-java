// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Severity. */
public final class Severity extends ExpandableStringEnum<Severity> {
    /** Static value Low for Severity. */
    public static final Severity LOW = fromString("Low");

    /** Static value Medium for Severity. */
    public static final Severity MEDIUM = fromString("Medium");

    /** Static value High for Severity. */
    public static final Severity HIGH = fromString("High");

    /**
     * Creates or finds a Severity from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Severity.
     */
    @JsonCreator
    public static Severity fromString(String name) {
        return fromString(name, Severity.class);
    }

    /** @return known Severity values. */
    public static Collection<Severity> values() {
        return values(Severity.class);
    }
}
