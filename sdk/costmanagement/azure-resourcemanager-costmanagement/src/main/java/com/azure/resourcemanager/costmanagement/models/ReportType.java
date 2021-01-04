// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ReportType. */
public final class ReportType extends ExpandableStringEnum<ReportType> {
    /** Static value Usage for ReportType. */
    public static final ReportType USAGE = fromString("Usage");

    /**
     * Creates or finds a ReportType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ReportType.
     */
    @JsonCreator
    public static ReportType fromString(String name) {
        return fromString(name, ReportType.class);
    }

    /** @return known ReportType values. */
    public static Collection<ReportType> values() {
        return values(ReportType.class);
    }
}
