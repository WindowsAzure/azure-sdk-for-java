// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DiskSecurityTypes. */
public final class DiskSecurityTypes extends ExpandableStringEnum<DiskSecurityTypes> {
    /** Static value TrustedLaunch for DiskSecurityTypes. */
    public static final DiskSecurityTypes TRUSTED_LAUNCH = fromString("TrustedLaunch");

    /**
     * Creates or finds a DiskSecurityTypes from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DiskSecurityTypes.
     */
    @JsonCreator
    public static DiskSecurityTypes fromString(String name) {
        return fromString(name, DiskSecurityTypes.class);
    }

    /** @return known DiskSecurityTypes values. */
    public static Collection<DiskSecurityTypes> values() {
        return values(DiskSecurityTypes.class);
    }
}
