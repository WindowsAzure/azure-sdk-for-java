/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for MaxSizeUnits.
 */
public final class MaxSizeUnits {
    /** Static value Megabytes for MaxSizeUnits. */
    public static final MaxSizeUnits MEGABYTES = new MaxSizeUnits("Megabytes");

    /** Static value Gigabytes for MaxSizeUnits. */
    public static final MaxSizeUnits GIGABYTES = new MaxSizeUnits("Gigabytes");

    /** Static value Terabytes for MaxSizeUnits. */
    public static final MaxSizeUnits TERABYTES = new MaxSizeUnits("Terabytes");

    /** Static value Petabytes for MaxSizeUnits. */
    public static final MaxSizeUnits PETABYTES = new MaxSizeUnits("Petabytes");

    private String value;

    /**
     * Creates a custom value for MaxSizeUnits.
     * @param value the custom value
     */
    public MaxSizeUnits(String value) {
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
        if (!(obj instanceof MaxSizeUnits)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        MaxSizeUnits rhs = (MaxSizeUnits) obj;
        if (value == null) {
            return rhs.value == null;
        } else {
            return value.equals(rhs.value);
        }
    }
}
