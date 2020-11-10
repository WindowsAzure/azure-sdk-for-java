// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for IsDeviceOperator. */
public final class IsDeviceOperator extends ExpandableStringEnum<IsDeviceOperator> {
    /** Static value Equal for IsDeviceOperator. */
    public static final IsDeviceOperator EQUAL = fromString("Equal");

    /**
     * Creates or finds a IsDeviceOperator from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding IsDeviceOperator.
     */
    @JsonCreator
    public static IsDeviceOperator fromString(String name) {
        return fromString(name, IsDeviceOperator.class);
    }

    /** @return known IsDeviceOperator values. */
    public static Collection<IsDeviceOperator> values() {
        return values(IsDeviceOperator.class);
    }
}
