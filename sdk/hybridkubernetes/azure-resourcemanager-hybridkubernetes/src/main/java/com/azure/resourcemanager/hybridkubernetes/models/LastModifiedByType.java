// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridkubernetes.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for LastModifiedByType. */
public final class LastModifiedByType extends ExpandableStringEnum<LastModifiedByType> {
    /** Static value User for LastModifiedByType. */
    public static final LastModifiedByType USER = fromString("User");

    /** Static value Application for LastModifiedByType. */
    public static final LastModifiedByType APPLICATION = fromString("Application");

    /** Static value ManagedIdentity for LastModifiedByType. */
    public static final LastModifiedByType MANAGED_IDENTITY = fromString("ManagedIdentity");

    /** Static value Key for LastModifiedByType. */
    public static final LastModifiedByType KEY = fromString("Key");

    /**
     * Creates or finds a LastModifiedByType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding LastModifiedByType.
     */
    @JsonCreator
    public static LastModifiedByType fromString(String name) {
        return fromString(name, LastModifiedByType.class);
    }

    /** @return known LastModifiedByType values. */
    public static Collection<LastModifiedByType> values() {
        return values(LastModifiedByType.class);
    }
}
