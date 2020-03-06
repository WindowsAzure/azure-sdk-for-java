/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_12_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for RegistryUsageUnit.
 */
public final class RegistryUsageUnit extends ExpandableStringEnum<RegistryUsageUnit> {
    /** Static value Count for RegistryUsageUnit. */
    public static final RegistryUsageUnit COUNT = fromString("Count");

    /** Static value Bytes for RegistryUsageUnit. */
    public static final RegistryUsageUnit BYTES = fromString("Bytes");

    /**
     * Creates or finds a RegistryUsageUnit from its string representation.
     * @param name a name to look for
     * @return the corresponding RegistryUsageUnit
     */
    @JsonCreator
    public static RegistryUsageUnit fromString(String name) {
        return fromString(name, RegistryUsageUnit.class);
    }

    /**
     * @return known RegistryUsageUnit values
     */
    public static Collection<RegistryUsageUnit> values() {
        return values(RegistryUsageUnit.class);
    }
}
