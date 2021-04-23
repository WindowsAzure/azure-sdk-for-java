// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for LabUserAccessMode. */
public final class LabUserAccessMode extends ExpandableStringEnum<LabUserAccessMode> {
    /** Static value Restricted for LabUserAccessMode. */
    public static final LabUserAccessMode RESTRICTED = fromString("Restricted");

    /** Static value Open for LabUserAccessMode. */
    public static final LabUserAccessMode OPEN = fromString("Open");

    /**
     * Creates or finds a LabUserAccessMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding LabUserAccessMode.
     */
    @JsonCreator
    public static LabUserAccessMode fromString(String name) {
        return fromString(name, LabUserAccessMode.class);
    }

    /** @return known LabUserAccessMode values. */
    public static Collection<LabUserAccessMode> values() {
        return values(LabUserAccessMode.class);
    }
}
