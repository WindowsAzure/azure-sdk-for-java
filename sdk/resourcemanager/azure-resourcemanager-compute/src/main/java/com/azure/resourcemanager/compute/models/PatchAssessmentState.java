// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PatchAssessmentState. */
public final class PatchAssessmentState extends ExpandableStringEnum<PatchAssessmentState> {
    /** Static value Installed for PatchAssessmentState. */
    public static final PatchAssessmentState INSTALLED = fromString("Installed");

    /** Static value Failed for PatchAssessmentState. */
    public static final PatchAssessmentState FAILED = fromString("Failed");

    /** Static value Excluded for PatchAssessmentState. */
    public static final PatchAssessmentState EXCLUDED = fromString("Excluded");

    /** Static value NotSelected for PatchAssessmentState. */
    public static final PatchAssessmentState NOT_SELECTED = fromString("NotSelected");

    /** Static value Pending for PatchAssessmentState. */
    public static final PatchAssessmentState PENDING = fromString("Pending");

    /** Static value Available for PatchAssessmentState. */
    public static final PatchAssessmentState AVAILABLE = fromString("Available");

    /**
     * Creates or finds a PatchAssessmentState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PatchAssessmentState.
     */
    @JsonCreator
    public static PatchAssessmentState fromString(String name) {
        return fromString(name, PatchAssessmentState.class);
    }

    /** @return known PatchAssessmentState values. */
    public static Collection<PatchAssessmentState> values() {
        return values(PatchAssessmentState.class);
    }
}
