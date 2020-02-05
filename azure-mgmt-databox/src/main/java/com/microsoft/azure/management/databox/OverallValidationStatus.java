/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databox;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for OverallValidationStatus.
 */
public enum OverallValidationStatus {
    /** Every input request is valid. */
    ALL_VALID_TO_PROCEED("AllValidToProceed"),

    /** Some input requests are not valid. */
    INPUTS_REVISIT_REQUIRED("InputsRevisitRequired"),

    /** Certain input validations skipped. */
    CERTAIN_INPUT_VALIDATIONS_SKIPPED("CertainInputValidationsSkipped");

    /** The actual serialized value for a OverallValidationStatus instance. */
    private String value;

    OverallValidationStatus(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a OverallValidationStatus instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed OverallValidationStatus object, or null if unable to parse.
     */
    @JsonCreator
    public static OverallValidationStatus fromString(String value) {
        OverallValidationStatus[] items = OverallValidationStatus.values();
        for (OverallValidationStatus item : items) {
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
