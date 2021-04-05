/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance.v2020_11_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for OperatingSystemTypes.
 */
public final class OperatingSystemTypes extends ExpandableStringEnum<OperatingSystemTypes> {
    /** Static value Windows for OperatingSystemTypes. */
    public static final OperatingSystemTypes WINDOWS = fromString("Windows");

    /** Static value Linux for OperatingSystemTypes. */
    public static final OperatingSystemTypes LINUX = fromString("Linux");

    /**
     * Creates or finds a OperatingSystemTypes from its string representation.
     * @param name a name to look for
     * @return the corresponding OperatingSystemTypes
     */
    @JsonCreator
    public static OperatingSystemTypes fromString(String name) {
        return fromString(name, OperatingSystemTypes.class);
    }

    /**
     * @return known OperatingSystemTypes values
     */
    public static Collection<OperatingSystemTypes> values() {
        return values(OperatingSystemTypes.class);
    }
}
