/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for OriginResourceState.
 */
public final class OriginResourceState {
    /** Static value Creating for OriginResourceState. */
    public static final OriginResourceState CREATING = new OriginResourceState("Creating");

    /** Static value Active for OriginResourceState. */
    public static final OriginResourceState ACTIVE = new OriginResourceState("Active");

    /** Static value Deleting for OriginResourceState. */
    public static final OriginResourceState DELETING = new OriginResourceState("Deleting");

    private String value;

    /**
     * Creates a custom value for OriginResourceState.
     * @param value the custom value
     */
    public OriginResourceState(String value) {
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
        if (!(obj instanceof OriginResourceState)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        OriginResourceState rhs = (OriginResourceState) obj;
        if (value == null) {
            return rhs.value == null;
        } else {
            return value.equals(rhs.value);
        }
    }
}
