// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.azure.security.keyvault.keys.models.webkey;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for KeyCurveName.
 */
public enum KeyCurveName {
    P_256("P-256"),

    P_384("P-384"),

    P_521("P-521"),

    P_256K("P-256K");

    private String value;

    /**
     * Creates a custom value for KeyCurveName.
     * @param value The custom value
     */
    KeyCurveName(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return value;
    }

    /**
     * Calculates the hashcode of the custom value
     * @return the hashcode of custom value for {@link KeyCurveName}
     */
    public int hashValue() {
        return value.hashCode();
    }

    /**
     * Return the KeyCurveName which maps to {@code value}.
     * @param value The value whose equivalent KeyCurveName is needed.
     * @return the KeyCurveName
     */
    public static KeyCurveName fromString(String value) {
        for (KeyCurveName keyCurve : values()) {
            if (keyCurve.value.equalsIgnoreCase(value)) {
                return keyCurve;
            }
        }
        return null;
    }
}
