/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for MSDeployProvisioningState.
 */
public enum MSDeployProvisioningState {
    /** Enum value accepted. */
    ACCEPTED("accepted"),

    /** Enum value running. */
    RUNNING("running"),

    /** Enum value succeeded. */
    SUCCEEDED("succeeded"),

    /** Enum value failed. */
    FAILED("failed"),

    /** Enum value canceled. */
    CANCELED("canceled");

    /** The actual serialized value for a MSDeployProvisioningState instance. */
    private String value;

    MSDeployProvisioningState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a MSDeployProvisioningState instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed MSDeployProvisioningState object, or null if unable to parse.
     */
    @JsonCreator
    public static MSDeployProvisioningState fromString(String value) {
        MSDeployProvisioningState[] items = MSDeployProvisioningState.values();
        for (MSDeployProvisioningState item : items) {
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
