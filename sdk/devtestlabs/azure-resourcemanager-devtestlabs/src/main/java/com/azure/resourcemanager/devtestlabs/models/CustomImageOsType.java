// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for CustomImageOsType. */
public final class CustomImageOsType extends ExpandableStringEnum<CustomImageOsType> {
    /** Static value Windows for CustomImageOsType. */
    public static final CustomImageOsType WINDOWS = fromString("Windows");

    /** Static value Linux for CustomImageOsType. */
    public static final CustomImageOsType LINUX = fromString("Linux");

    /** Static value None for CustomImageOsType. */
    public static final CustomImageOsType NONE = fromString("None");

    /**
     * Creates or finds a CustomImageOsType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CustomImageOsType.
     */
    @JsonCreator
    public static CustomImageOsType fromString(String name) {
        return fromString(name, CustomImageOsType.class);
    }

    /** @return known CustomImageOsType values. */
    public static Collection<CustomImageOsType> values() {
        return values(CustomImageOsType.class);
    }
}
