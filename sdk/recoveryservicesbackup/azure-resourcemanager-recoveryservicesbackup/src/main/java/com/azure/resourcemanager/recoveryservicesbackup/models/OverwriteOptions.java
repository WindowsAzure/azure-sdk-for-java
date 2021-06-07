// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for OverwriteOptions. */
public final class OverwriteOptions extends ExpandableStringEnum<OverwriteOptions> {
    /** Static value Invalid for OverwriteOptions. */
    public static final OverwriteOptions INVALID = fromString("Invalid");

    /** Static value FailOnConflict for OverwriteOptions. */
    public static final OverwriteOptions FAIL_ON_CONFLICT = fromString("FailOnConflict");

    /** Static value Overwrite for OverwriteOptions. */
    public static final OverwriteOptions OVERWRITE = fromString("Overwrite");

    /**
     * Creates or finds a OverwriteOptions from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OverwriteOptions.
     */
    @JsonCreator
    public static OverwriteOptions fromString(String name) {
        return fromString(name, OverwriteOptions.class);
    }

    /** @return known OverwriteOptions values. */
    public static Collection<OverwriteOptions> values() {
        return values(OverwriteOptions.class);
    }
}
