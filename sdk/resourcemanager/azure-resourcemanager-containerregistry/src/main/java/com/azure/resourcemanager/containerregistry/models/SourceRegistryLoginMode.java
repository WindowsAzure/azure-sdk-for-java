// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SourceRegistryLoginMode. */
public final class SourceRegistryLoginMode extends ExpandableStringEnum<SourceRegistryLoginMode> {
    /** Static value None for SourceRegistryLoginMode. */
    public static final SourceRegistryLoginMode NONE = fromString("None");

    /** Static value Default for SourceRegistryLoginMode. */
    public static final SourceRegistryLoginMode DEFAULT = fromString("Default");

    /**
     * Creates or finds a SourceRegistryLoginMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SourceRegistryLoginMode.
     */
    @JsonCreator
    public static SourceRegistryLoginMode fromString(String name) {
        return fromString(name, SourceRegistryLoginMode.class);
    }

    /** @return known SourceRegistryLoginMode values. */
    public static Collection<SourceRegistryLoginMode> values() {
        return values(SourceRegistryLoginMode.class);
    }
}
