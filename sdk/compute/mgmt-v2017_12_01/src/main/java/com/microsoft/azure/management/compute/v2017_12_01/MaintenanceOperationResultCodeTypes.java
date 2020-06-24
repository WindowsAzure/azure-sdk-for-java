/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_12_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for MaintenanceOperationResultCodeTypes.
 */
public enum MaintenanceOperationResultCodeTypes {
    /** Enum value None. */
    NONE("None"),

    /** Enum value RetryLater. */
    RETRY_LATER("RetryLater"),

    /** Enum value MaintenanceAborted. */
    MAINTENANCE_ABORTED("MaintenanceAborted"),

    /** Enum value MaintenanceCompleted. */
    MAINTENANCE_COMPLETED("MaintenanceCompleted");

    /** The actual serialized value for a MaintenanceOperationResultCodeTypes instance. */
    private String value;

    MaintenanceOperationResultCodeTypes(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a MaintenanceOperationResultCodeTypes instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed MaintenanceOperationResultCodeTypes object, or null if unable to parse.
     */
    @JsonCreator
    public static MaintenanceOperationResultCodeTypes fromString(String value) {
        MaintenanceOperationResultCodeTypes[] items = MaintenanceOperationResultCodeTypes.values();
        for (MaintenanceOperationResultCodeTypes item : items) {
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
