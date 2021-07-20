// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for State. */
public final class State extends ExpandableStringEnum<State> {
    /** Static value Passed for State. */
    public static final State PASSED = fromString("Passed");

    /** Static value Failed for State. */
    public static final State FAILED = fromString("Failed");

    /** Static value Skipped for State. */
    public static final State SKIPPED = fromString("Skipped");

    /** Static value Unsupported for State. */
    public static final State UNSUPPORTED = fromString("Unsupported");

    /**
     * Creates or finds a State from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding State.
     */
    @JsonCreator
    public static State fromString(String name) {
        return fromString(name, State.class);
    }

    /** @return known State values. */
    public static Collection<State> values() {
        return values(State.class);
    }
}
