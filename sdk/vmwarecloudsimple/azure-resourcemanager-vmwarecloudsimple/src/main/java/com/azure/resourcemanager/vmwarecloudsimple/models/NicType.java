// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for NicType. */
public enum NicType {
    /** Enum value E1000. */
    E1000("E1000"),

    /** Enum value E1000E. */
    E1000E("E1000E"),

    /** Enum value PCNET32. */
    PCNET32("PCNET32"),

    /** Enum value VMXNET. */
    VMXNET("VMXNET"),

    /** Enum value VMXNET2. */
    VMXNET2("VMXNET2"),

    /** Enum value VMXNET3. */
    VMXNET3("VMXNET3");

    /** The actual serialized value for a NicType instance. */
    private final String value;

    NicType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a NicType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed NicType object, or null if unable to parse.
     */
    @JsonCreator
    public static NicType fromString(String value) {
        NicType[] items = NicType.values();
        for (NicType item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
