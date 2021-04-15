// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ObjectType. */
public final class ObjectType extends ExpandableStringEnum<ObjectType> {
    /** Static value StoredProcedures for ObjectType. */
    public static final ObjectType STORED_PROCEDURES = fromString("StoredProcedures");

    /** Static value Table for ObjectType. */
    public static final ObjectType TABLE = fromString("Table");

    /** Static value User for ObjectType. */
    public static final ObjectType USER = fromString("User");

    /** Static value View for ObjectType. */
    public static final ObjectType VIEW = fromString("View");

    /** Static value Function for ObjectType. */
    public static final ObjectType FUNCTION = fromString("Function");

    /**
     * Creates or finds a ObjectType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ObjectType.
     */
    @JsonCreator
    public static ObjectType fromString(String name) {
        return fromString(name, ObjectType.class);
    }

    /** @return known ObjectType values. */
    public static Collection<ObjectType> values() {
        return values(ObjectType.class);
    }
}
