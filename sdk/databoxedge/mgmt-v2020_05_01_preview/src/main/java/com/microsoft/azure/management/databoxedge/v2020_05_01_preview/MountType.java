/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2020_05_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for MountType.
 */
public final class MountType extends ExpandableStringEnum<MountType> {
    /** Static value Volume for MountType. */
    public static final MountType VOLUME = fromString("Volume");

    /** Static value HostPath for MountType. */
    public static final MountType HOST_PATH = fromString("HostPath");

    /**
     * Creates or finds a MountType from its string representation.
     * @param name a name to look for
     * @return the corresponding MountType
     */
    @JsonCreator
    public static MountType fromString(String name) {
        return fromString(name, MountType.class);
    }

    /**
     * @return known MountType values
     */
    public static Collection<MountType> values() {
        return values(MountType.class);
    }
}
