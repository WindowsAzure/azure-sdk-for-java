/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.healthcareapis.v2019-09-16;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ServiceNameUnavailabilityReason.
 */
public enum ServiceNameUnavailabilityReason {
    /** Enum value Invalid. */
    INVALID("Invalid"),

    /** Enum value AlreadyExists. */
    ALREADY_EXISTS("AlreadyExists");

    /** The actual serialized value for a ServiceNameUnavailabilityReason instance. */
    private String value;

    ServiceNameUnavailabilityReason(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ServiceNameUnavailabilityReason instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ServiceNameUnavailabilityReason object, or null if unable to parse.
     */
    @JsonCreator
    public static ServiceNameUnavailabilityReason fromString(String value) {
        ServiceNameUnavailabilityReason[] items = ServiceNameUnavailabilityReason.values();
        for (ServiceNameUnavailabilityReason item : items) {
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
