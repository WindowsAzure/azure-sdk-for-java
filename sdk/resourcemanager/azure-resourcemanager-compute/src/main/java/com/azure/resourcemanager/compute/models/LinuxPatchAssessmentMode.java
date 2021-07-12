// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for LinuxPatchAssessmentMode. */
public final class LinuxPatchAssessmentMode extends ExpandableStringEnum<LinuxPatchAssessmentMode> {
    /** Static value ImageDefault for LinuxPatchAssessmentMode. */
    public static final LinuxPatchAssessmentMode IMAGE_DEFAULT = fromString("ImageDefault");

    /** Static value AutomaticByPlatform for LinuxPatchAssessmentMode. */
    public static final LinuxPatchAssessmentMode AUTOMATIC_BY_PLATFORM = fromString("AutomaticByPlatform");

    /**
     * Creates or finds a LinuxPatchAssessmentMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding LinuxPatchAssessmentMode.
     */
    @JsonCreator
    public static LinuxPatchAssessmentMode fromString(String name) {
        return fromString(name, LinuxPatchAssessmentMode.class);
    }

    /** @return known LinuxPatchAssessmentMode values. */
    public static Collection<LinuxPatchAssessmentMode> values() {
        return values(LinuxPatchAssessmentMode.class);
    }
}
