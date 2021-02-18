// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DomainJoinedType. */
public final class DomainJoinedType extends ExpandableStringEnum<DomainJoinedType> {
    /** Static value Yes for DomainJoinedType. */
    public static final DomainJoinedType YES = fromString("Yes");

    /** Static value No for DomainJoinedType. */
    public static final DomainJoinedType NO = fromString("No");

    /** Static value Error for DomainJoinedType. */
    public static final DomainJoinedType ERROR = fromString("Error");

    /**
     * Creates or finds a DomainJoinedType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DomainJoinedType.
     */
    @JsonCreator
    public static DomainJoinedType fromString(String name) {
        return fromString(name, DomainJoinedType.class);
    }

    /** @return known DomainJoinedType values. */
    public static Collection<DomainJoinedType> values() {
        return values(DomainJoinedType.class);
    }
}
