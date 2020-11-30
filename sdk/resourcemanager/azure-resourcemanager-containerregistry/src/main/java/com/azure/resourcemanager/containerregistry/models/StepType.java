// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for StepType. */
public final class StepType extends ExpandableStringEnum<StepType> {
    /** Static value Docker for StepType. */
    public static final StepType DOCKER = fromString("Docker");

    /** Static value FileTask for StepType. */
    public static final StepType FILE_TASK = fromString("FileTask");

    /** Static value EncodedTask for StepType. */
    public static final StepType ENCODED_TASK = fromString("EncodedTask");

    /**
     * Creates or finds a StepType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding StepType.
     */
    @JsonCreator
    public static StepType fromString(String name) {
        return fromString(name, StepType.class);
    }

    /** @return known StepType values. */
    public static Collection<StepType> values() {
        return values(StepType.class);
    }
}
