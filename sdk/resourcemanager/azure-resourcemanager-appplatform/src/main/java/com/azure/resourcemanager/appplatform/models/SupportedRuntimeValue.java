// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SupportedRuntimeValue. */
public final class SupportedRuntimeValue extends ExpandableStringEnum<SupportedRuntimeValue> {
    /** Static value Java_8 for SupportedRuntimeValue. */
    public static final SupportedRuntimeValue JAVA_8 = fromString("Java_8");

    /** Static value Java_11 for SupportedRuntimeValue. */
    public static final SupportedRuntimeValue JAVA_11 = fromString("Java_11");

    /** Static value NetCore_31 for SupportedRuntimeValue. */
    public static final SupportedRuntimeValue NET_CORE_31 = fromString("NetCore_31");

    /**
     * Creates or finds a SupportedRuntimeValue from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SupportedRuntimeValue.
     */
    @JsonCreator
    public static SupportedRuntimeValue fromString(String name) {
        return fromString(name, SupportedRuntimeValue.class);
    }

    /** @return known SupportedRuntimeValue values. */
    public static Collection<SupportedRuntimeValue> values() {
        return values(SupportedRuntimeValue.class);
    }
}
