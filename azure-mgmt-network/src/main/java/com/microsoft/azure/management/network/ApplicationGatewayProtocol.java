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
 * Defines values for ApplicationGatewayProtocol.
 */
public class ApplicationGatewayProtocol {
    /** Static value Http for ApplicationGatewayProtocol. */
    public static final ApplicationGatewayProtocol HTTP = new ApplicationGatewayProtocol("Http");

    /** Static value Https for ApplicationGatewayProtocol. */
    public static final ApplicationGatewayProtocol HTTPS = new ApplicationGatewayProtocol("Https");

    private String value;

    /**
     * Creates a custom value for ApplicationGatewayProtocol.
     * @param value the custom value
     */
    public ApplicationGatewayProtocol(String value) {
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
        if (!(obj instanceof ApplicationGatewayProtocol)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ApplicationGatewayProtocol rhs = (ApplicationGatewayProtocol) obj;
        if (value == null) {
            return rhs.value == null;
        } else {
            return value.equals(rhs.value);
        }
    }
}
