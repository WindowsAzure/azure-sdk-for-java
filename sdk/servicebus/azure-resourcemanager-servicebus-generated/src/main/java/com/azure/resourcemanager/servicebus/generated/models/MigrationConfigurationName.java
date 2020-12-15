// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for MigrationConfigurationName. */
public final class MigrationConfigurationName extends ExpandableStringEnum<MigrationConfigurationName> {
    /** Static value $default for MigrationConfigurationName. */
    public static final MigrationConfigurationName DEFAULT = fromString("$default");

    /**
     * Creates or finds a MigrationConfigurationName from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MigrationConfigurationName.
     */
    @JsonCreator
    public static MigrationConfigurationName fromString(String name) {
        return fromString(name, MigrationConfigurationName.class);
    }

    /** @return known MigrationConfigurationName values. */
    public static Collection<MigrationConfigurationName> values() {
        return values(MigrationConfigurationName.class);
    }
}
