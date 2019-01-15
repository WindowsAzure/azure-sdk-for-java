/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.keyvault.models;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for SasTokenType.
 */
public final class SasTokenType {
    /** Static value account for SasTokenType. */
    public static final SasTokenType ACCOUNT = new SasTokenType("account");

    /** Static value service for SasTokenType. */
    public static final SasTokenType SERVICE = new SasTokenType("service");

    private String value;

    /**
     * Creates a custom value for SasTokenType.
     * @param value the custom value
     */
    public SasTokenType(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof SasTokenType)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        SasTokenType rhs = (SasTokenType) obj;
        if (value == null) {
            return rhs.value == null;
        } else {
            return value.equals(rhs.value);
        }
    }
}
