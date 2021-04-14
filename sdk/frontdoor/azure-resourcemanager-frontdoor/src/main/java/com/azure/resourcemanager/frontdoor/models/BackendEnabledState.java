// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for BackendEnabledState. */
public final class BackendEnabledState extends ExpandableStringEnum<BackendEnabledState> {
    /** Static value Enabled for BackendEnabledState. */
    public static final BackendEnabledState ENABLED = fromString("Enabled");

    /** Static value Disabled for BackendEnabledState. */
    public static final BackendEnabledState DISABLED = fromString("Disabled");

    /**
     * Creates or finds a BackendEnabledState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding BackendEnabledState.
     */
    @JsonCreator
    public static BackendEnabledState fromString(String name) {
        return fromString(name, BackendEnabledState.class);
    }

    /** @return known BackendEnabledState values. */
    public static Collection<BackendEnabledState> values() {
        return values(BackendEnabledState.class);
    }
}
