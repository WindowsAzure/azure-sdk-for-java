// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Verbosity. */
public final class Verbosity extends ExpandableStringEnum<Verbosity> {
    /** Static value verbose for Verbosity. */
    public static final Verbosity VERBOSE = fromString("verbose");

    /** Static value information for Verbosity. */
    public static final Verbosity INFORMATION = fromString("information");

    /** Static value error for Verbosity. */
    public static final Verbosity ERROR = fromString("error");

    /**
     * Creates or finds a Verbosity from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Verbosity.
     */
    @JsonCreator
    public static Verbosity fromString(String name) {
        return fromString(name, Verbosity.class);
    }

    /** @return known Verbosity values. */
    public static Collection<Verbosity> values() {
        return values(Verbosity.class);
    }
}
