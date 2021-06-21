// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for LinuxVMGuestPatchMode. */
public final class LinuxVMGuestPatchMode extends ExpandableStringEnum<LinuxVMGuestPatchMode> {
    /** Static value ImageDefault for LinuxVMGuestPatchMode. */
    public static final LinuxVMGuestPatchMode IMAGE_DEFAULT = fromString("ImageDefault");

    /** Static value AutomaticByPlatform for LinuxVMGuestPatchMode. */
    public static final LinuxVMGuestPatchMode AUTOMATIC_BY_PLATFORM = fromString("AutomaticByPlatform");

    /**
     * Creates or finds a LinuxVMGuestPatchMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding LinuxVMGuestPatchMode.
     */
    @JsonCreator
    public static LinuxVMGuestPatchMode fromString(String name) {
        return fromString(name, LinuxVMGuestPatchMode.class);
    }

    /** @return known LinuxVMGuestPatchMode values. */
    public static Collection<LinuxVMGuestPatchMode> values() {
        return values(LinuxVMGuestPatchMode.class);
    }
}
