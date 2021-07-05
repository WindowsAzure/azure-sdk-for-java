// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PauseDelayTimeUnit. */
public final class PauseDelayTimeUnit extends ExpandableStringEnum<PauseDelayTimeUnit> {
    /** Static value Minutes for PauseDelayTimeUnit. */
    public static final PauseDelayTimeUnit MINUTES = fromString("Minutes");

    /**
     * Creates or finds a PauseDelayTimeUnit from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PauseDelayTimeUnit.
     */
    @JsonCreator
    public static PauseDelayTimeUnit fromString(String name) {
        return fromString(name, PauseDelayTimeUnit.class);
    }

    /** @return known PauseDelayTimeUnit values. */
    public static Collection<PauseDelayTimeUnit> values() {
        return values(PauseDelayTimeUnit.class);
    }
}
