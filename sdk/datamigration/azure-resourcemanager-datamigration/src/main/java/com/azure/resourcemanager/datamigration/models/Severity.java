// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Severity. */
public final class Severity extends ExpandableStringEnum<Severity> {
    /** Static value Message for Severity. */
    public static final Severity MESSAGE = fromString("Message");

    /** Static value Warning for Severity. */
    public static final Severity WARNING = fromString("Warning");

    /** Static value Error for Severity. */
    public static final Severity ERROR = fromString("Error");

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
