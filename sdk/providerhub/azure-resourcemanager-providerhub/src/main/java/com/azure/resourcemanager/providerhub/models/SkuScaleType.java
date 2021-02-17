// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SkuScaleType. */
public final class SkuScaleType extends ExpandableStringEnum<SkuScaleType> {
    /** Static value None for SkuScaleType. */
    public static final SkuScaleType NONE = fromString("None");

    /** Static value Manual for SkuScaleType. */
    public static final SkuScaleType MANUAL = fromString("Manual");

    /** Static value Automatic for SkuScaleType. */
    public static final SkuScaleType AUTOMATIC = fromString("Automatic");

    /**
     * Creates or finds a SkuScaleType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SkuScaleType.
     */
    @JsonCreator
    public static SkuScaleType fromString(String name) {
        return fromString(name, SkuScaleType.class);
    }

    /** @return known SkuScaleType values. */
    public static Collection<SkuScaleType> values() {
        return values(SkuScaleType.class);
    }
}
