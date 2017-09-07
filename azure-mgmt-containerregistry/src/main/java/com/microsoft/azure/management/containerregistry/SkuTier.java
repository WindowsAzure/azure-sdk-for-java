/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for SkuTier.
 */
public final class SkuTier {
    /** Static value Basic for SkuTier. */
    public static final SkuTier BASIC = new SkuTier("Basic");

    /** Static value Managed for SkuTier. */
    public static final SkuTier MANAGED = new SkuTier("Managed");

    private String value;

    /**
     * Creates a custom value for SkuTier.
     * @param value the custom value
     */
    public SkuTier(String value) {
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
        if (!(obj instanceof SkuTier)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        SkuTier rhs = (SkuTier) obj;
        if (value == null) {
            return rhs.value == null;
        } else {
            return value.equals(rhs.value);
        }
    }
}
