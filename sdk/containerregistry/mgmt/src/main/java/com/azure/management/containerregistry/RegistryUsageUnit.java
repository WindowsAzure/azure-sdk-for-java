// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerregistry;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for RegistryUsageUnit.
 */
public final class RegistryUsageUnit extends ExpandableStringEnum<RegistryUsageUnit> {
    /**
     * Static value Count for RegistryUsageUnit.
     */
    public static final RegistryUsageUnit COUNT = fromString("Count");

    /**
     * Static value Bytes for RegistryUsageUnit.
     */
    public static final RegistryUsageUnit BYTES = fromString("Bytes");

    /**
     * Creates or finds a RegistryUsageUnit from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding RegistryUsageUnit.
     */
    @JsonCreator
    public static RegistryUsageUnit fromString(String name) {
        return fromString(name, RegistryUsageUnit.class);
    }

    /**
     * @return known RegistryUsageUnit values.
     */
    public static Collection<RegistryUsageUnit> values() {
        return values(RegistryUsageUnit.class);
    }
}
