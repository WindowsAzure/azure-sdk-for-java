// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for CloneAbilityResult. */
public enum CloneAbilityResult {
    /** Enum value Cloneable. */
    CLONEABLE("Cloneable"),

    /** Enum value PartiallyCloneable. */
    PARTIALLY_CLONEABLE("PartiallyCloneable"),

    /** Enum value NotCloneable. */
    NOT_CLONEABLE("NotCloneable");

    /** The actual serialized value for a CloneAbilityResult instance. */
    private final String value;

    CloneAbilityResult(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a CloneAbilityResult instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed CloneAbilityResult object, or null if unable to parse.
     */
    @JsonCreator
    public static CloneAbilityResult fromString(String value) {
        CloneAbilityResult[] items = CloneAbilityResult.values();
        for (CloneAbilityResult item : items) {
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
