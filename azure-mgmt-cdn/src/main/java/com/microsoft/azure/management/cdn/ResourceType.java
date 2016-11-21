/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ResourceType.
 */
public enum ResourceType {
    /** Enum value Microsoft.Cdn/Profiles/Endpoints. */
    MICROSOFT_CDN_PROFILES_ENDPOINTS("Microsoft.Cdn/Profiles/Endpoints");

    /** The actual serialized value for a ResourceType instance. */
    private String value;

    ResourceType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ResourceType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ResourceType object, or null if unable to parse.
     */
    @JsonCreator
    public static ResourceType fromString(String value) {
        ResourceType[] items = ResourceType.values();
        for (ResourceType item : items) {
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
