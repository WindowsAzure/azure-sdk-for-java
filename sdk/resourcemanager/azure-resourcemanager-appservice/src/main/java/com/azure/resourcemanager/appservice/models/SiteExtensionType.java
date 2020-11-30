// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for SiteExtensionType. */
public enum SiteExtensionType {
    /** Enum value Gallery. */
    GALLERY("Gallery"),

    /** Enum value WebRoot. */
    WEB_ROOT("WebRoot");

    /** The actual serialized value for a SiteExtensionType instance. */
    private final String value;

    SiteExtensionType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a SiteExtensionType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed SiteExtensionType object, or null if unable to parse.
     */
    @JsonCreator
    public static SiteExtensionType fromString(String value) {
        SiteExtensionType[] items = SiteExtensionType.values();
        for (SiteExtensionType item : items) {
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
