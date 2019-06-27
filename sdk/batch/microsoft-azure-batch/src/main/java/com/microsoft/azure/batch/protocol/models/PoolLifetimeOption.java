/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for PoolLifetimeOption.
 */
public enum PoolLifetimeOption {
    /** The Pool exists for the lifetime of the Job Schedule. The Batch Service creates the Pool when it creates the first Job on the schedule. You may apply this option only to Job Schedules, not to Jobs. */
    JOB_SCHEDULE("jobschedule"),

    /** The Pool exists for the lifetime of the Job to which it is dedicated. The Batch service creates the Pool when it creates the Job. If the 'job' option is applied to a Job Schedule, the Batch service creates a new auto Pool for every Job created on the schedule. */
    JOB("job");

    /** The actual serialized value for a PoolLifetimeOption instance. */
    private String value;

    PoolLifetimeOption(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a PoolLifetimeOption instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed PoolLifetimeOption object, or null if unable to parse.
     */
    @JsonCreator
    public static PoolLifetimeOption fromString(String value) {
        PoolLifetimeOption[] items = PoolLifetimeOption.values();
        for (PoolLifetimeOption item : items) {
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
