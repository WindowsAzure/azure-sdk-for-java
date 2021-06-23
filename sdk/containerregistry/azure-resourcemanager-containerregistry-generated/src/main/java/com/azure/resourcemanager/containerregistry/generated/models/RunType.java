// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for RunType. */
public final class RunType extends ExpandableStringEnum<RunType> {
    /** Static value QuickBuild for RunType. */
    public static final RunType QUICK_BUILD = fromString("QuickBuild");

    /** Static value QuickRun for RunType. */
    public static final RunType QUICK_RUN = fromString("QuickRun");

    /** Static value AutoBuild for RunType. */
    public static final RunType AUTO_BUILD = fromString("AutoBuild");

    /** Static value AutoRun for RunType. */
    public static final RunType AUTO_RUN = fromString("AutoRun");

    /**
     * Creates or finds a RunType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RunType.
     */
    @JsonCreator
    public static RunType fromString(String name) {
        return fromString(name, RunType.class);
    }

    /** @return known RunType values. */
    public static Collection<RunType> values() {
        return values(RunType.class);
    }
}
