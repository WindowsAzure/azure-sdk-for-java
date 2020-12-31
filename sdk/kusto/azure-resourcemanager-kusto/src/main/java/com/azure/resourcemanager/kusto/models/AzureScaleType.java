// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AzureScaleType. */
public final class AzureScaleType extends ExpandableStringEnum<AzureScaleType> {
    /** Static value automatic for AzureScaleType. */
    public static final AzureScaleType AUTOMATIC = fromString("automatic");

    /** Static value manual for AzureScaleType. */
    public static final AzureScaleType MANUAL = fromString("manual");

    /** Static value none for AzureScaleType. */
    public static final AzureScaleType NONE = fromString("none");

    /**
     * Creates or finds a AzureScaleType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AzureScaleType.
     */
    @JsonCreator
    public static AzureScaleType fromString(String name) {
        return fromString(name, AzureScaleType.class);
    }

    /** @return known AzureScaleType values. */
    public static Collection<AzureScaleType> values() {
        return values(AzureScaleType.class);
    }
}
