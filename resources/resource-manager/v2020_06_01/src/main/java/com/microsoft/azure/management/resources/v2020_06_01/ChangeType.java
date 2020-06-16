/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2020_06_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ChangeType.
 */
public enum ChangeType {
    /** The resource does not exist in the current state but is present in the desired state. The resource will be created when the deployment is executed. */
    CREATE("Create"),

    /** The resource exists in the current state and is missing from the desired state. The resource will be deleted when the deployment is executed. */
    DELETE("Delete"),

    /** The resource exists in the current state and is missing from the desired state. The resource will not be deployed or modified when the deployment is executed. */
    IGNORE("Ignore"),

    /** The resource exists in the current state and the desired state and will be redeployed when the deployment is executed. The properties of the resource may or may not change. */
    DEPLOY("Deploy"),

    /** The resource exists in the current state and the desired state and will be redeployed when the deployment is executed. The properties of the resource will not change. */
    NO_CHANGE("NoChange"),

    /** The resource exists in the current state and the desired state and will be redeployed when the deployment is executed. The properties of the resource will change. */
    MODIFY("Modify");

    /** The actual serialized value for a ChangeType instance. */
    private String value;

    ChangeType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ChangeType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ChangeType object, or null if unable to parse.
     */
    @JsonCreator
    public static ChangeType fromString(String value) {
        ChangeType[] items = ChangeType.values();
        for (ChangeType item : items) {
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
