// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.cosmosdb;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for TriggerOperation.
 */
public final class TriggerOperation extends ExpandableStringEnum<TriggerOperation> {
    /**
     * Static value All for TriggerOperation.
     */
    public static final TriggerOperation ALL = fromString("All");

    /**
     * Static value Create for TriggerOperation.
     */
    public static final TriggerOperation CREATE = fromString("Create");

    /**
     * Static value Update for TriggerOperation.
     */
    public static final TriggerOperation UPDATE = fromString("Update");

    /**
     * Static value Delete for TriggerOperation.
     */
    public static final TriggerOperation DELETE = fromString("Delete");

    /**
     * Static value Replace for TriggerOperation.
     */
    public static final TriggerOperation REPLACE = fromString("Replace");

    /**
     * Creates or finds a TriggerOperation from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding TriggerOperation.
     */
    @JsonCreator
    public static TriggerOperation fromString(String name) {
        return fromString(name, TriggerOperation.class);
    }

    /**
     * @return known TriggerOperation values.
     */
    public static Collection<TriggerOperation> values() {
        return values(TriggerOperation.class);
    }
}
