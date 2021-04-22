// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentityActualState. */
public final class ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentityActualState
    extends ExpandableStringEnum<
        ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentityActualState> {
    /**
     * Static value Enabling for
     * ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentityActualState.
     */
    public static final ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentityActualState
        ENABLING = fromString("Enabling");

    /**
     * Static value Enabled for
     * ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentityActualState.
     */
    public static final ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentityActualState
        ENABLED = fromString("Enabled");

    /**
     * Static value Disabling for
     * ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentityActualState.
     */
    public static final ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentityActualState
        DISABLING = fromString("Disabling");

    /**
     * Static value Disabled for
     * ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentityActualState.
     */
    public static final ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentityActualState
        DISABLED = fromString("Disabled");

    /**
     * Static value Unknown for
     * ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentityActualState.
     */
    public static final ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentityActualState
        UNKNOWN = fromString("Unknown");

    /**
     * Creates or finds a ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentityActualState
     * from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding
     *     ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentityActualState.
     */
    @JsonCreator
    public static ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentityActualState
        fromString(String name) {
        return fromString(
            name, ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentityActualState.class);
    }

    /**
     * @return known ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentityActualState values.
     */
    public static Collection<
            ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentityActualState>
        values() {
        return values(
            ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentityActualState.class);
    }
}