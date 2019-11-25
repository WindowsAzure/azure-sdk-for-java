/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for WorkflowTriggerProvisioningState.
 */
public enum WorkflowTriggerProvisioningState {
    /** Enum value NotSpecified. */
    NOT_SPECIFIED("NotSpecified"),

    /** Enum value Accepted. */
    ACCEPTED("Accepted"),

    /** Enum value Running. */
    RUNNING("Running"),

    /** Enum value Ready. */
    READY("Ready"),

    /** Enum value Creating. */
    CREATING("Creating"),

    /** Enum value Created. */
    CREATED("Created"),

    /** Enum value Deleting. */
    DELETING("Deleting"),

    /** Enum value Deleted. */
    DELETED("Deleted"),

    /** Enum value Canceled. */
    CANCELED("Canceled"),

    /** Enum value Failed. */
    FAILED("Failed"),

    /** Enum value Succeeded. */
    SUCCEEDED("Succeeded"),

    /** Enum value Moving. */
    MOVING("Moving"),

    /** Enum value Updating. */
    UPDATING("Updating"),

    /** Enum value Registering. */
    REGISTERING("Registering"),

    /** Enum value Registered. */
    REGISTERED("Registered"),

    /** Enum value Unregistering. */
    UNREGISTERING("Unregistering"),

    /** Enum value Unregistered. */
    UNREGISTERED("Unregistered"),

    /** Enum value Completed. */
    COMPLETED("Completed");

    /** The actual serialized value for a WorkflowTriggerProvisioningState instance. */
    private String value;

    WorkflowTriggerProvisioningState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a WorkflowTriggerProvisioningState instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed WorkflowTriggerProvisioningState object, or null if unable to parse.
     */
    @JsonCreator
    public static WorkflowTriggerProvisioningState fromString(String value) {
        WorkflowTriggerProvisioningState[] items = WorkflowTriggerProvisioningState.values();
        for (WorkflowTriggerProvisioningState item : items) {
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
