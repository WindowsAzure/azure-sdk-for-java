/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ApplicationGatewayTier.
 */
public class ApplicationGatewayTier {
    /** Static value Standard for ApplicationGatewayTier. */
    public static final ApplicationGatewayTier STANDARD = new ApplicationGatewayTier("Standard");

    private String value;

    /**
     * Creates a custom value for ApplicationGatewayTier.
     * @param value the custom value
     */
    public ApplicationGatewayTier(String value) {
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
        if (!(obj instanceof ApplicationGatewayTier)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ApplicationGatewayTier rhs = (ApplicationGatewayTier) obj;
        if (value == null) {
            return rhs.value == null;
        } else {
            return value.equals(rhs.value);
        }
    }
}
