// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ProtocolValue. */
public final class ProtocolValue extends ExpandableStringEnum<ProtocolValue> {
    /** Static value TCP for ProtocolValue. */
    public static final ProtocolValue TCP = fromString("TCP");

    /** Static value UDP for ProtocolValue. */
    public static final ProtocolValue UDP = fromString("UDP");

    /** Static value * for ProtocolValue. */
    public static final ProtocolValue ASTERISK = fromString("*");

    /**
     * Creates or finds a ProtocolValue from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ProtocolValue.
     */
    @JsonCreator
    public static ProtocolValue fromString(String name) {
        return fromString(name, ProtocolValue.class);
    }

    /** @return known ProtocolValue values. */
    public static Collection<ProtocolValue> values() {
        return values(ProtocolValue.class);
    }
}
