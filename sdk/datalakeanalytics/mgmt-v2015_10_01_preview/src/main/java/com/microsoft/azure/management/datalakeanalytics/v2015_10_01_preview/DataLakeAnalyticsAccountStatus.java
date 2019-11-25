/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalakeanalytics.v2015_10_01_preview;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for DataLakeAnalyticsAccountStatus.
 */
public enum DataLakeAnalyticsAccountStatus {
    /** Enum value Failed. */
    FAILED("Failed"),

    /** Enum value Creating. */
    CREATING("Creating"),

    /** Enum value Running. */
    RUNNING("Running"),

    /** Enum value Succeeded. */
    SUCCEEDED("Succeeded"),

    /** Enum value Patching. */
    PATCHING("Patching"),

    /** Enum value Suspending. */
    SUSPENDING("Suspending"),

    /** Enum value Resuming. */
    RESUMING("Resuming"),

    /** Enum value Deleting. */
    DELETING("Deleting"),

    /** Enum value Deleted. */
    DELETED("Deleted");

    /** The actual serialized value for a DataLakeAnalyticsAccountStatus instance. */
    private String value;

    DataLakeAnalyticsAccountStatus(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a DataLakeAnalyticsAccountStatus instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed DataLakeAnalyticsAccountStatus object, or null if unable to parse.
     */
    @JsonCreator
    public static DataLakeAnalyticsAccountStatus fromString(String value) {
        DataLakeAnalyticsAccountStatus[] items = DataLakeAnalyticsAccountStatus.values();
        for (DataLakeAnalyticsAccountStatus item : items) {
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
