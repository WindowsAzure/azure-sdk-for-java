// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for HyperVGeneration. */
public final class HyperVGeneration extends ExpandableStringEnum<HyperVGeneration> {
    /** Static value V1 for HyperVGeneration. */
    public static final HyperVGeneration V1 = fromString("V1");

    /** Static value V2 for HyperVGeneration. */
    public static final HyperVGeneration V2 = fromString("V2");

    /**
     * Creates or finds a HyperVGeneration from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding HyperVGeneration.
     */
    @JsonCreator
    public static HyperVGeneration fromString(String name) {
        return fromString(name, HyperVGeneration.class);
    }

    /** @return known HyperVGeneration values. */
    public static Collection<HyperVGeneration> values() {
        return values(HyperVGeneration.class);
    }
}
