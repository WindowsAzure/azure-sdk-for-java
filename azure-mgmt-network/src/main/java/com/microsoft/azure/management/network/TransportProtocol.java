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
 * Defines values for TransportProtocol.
 */
public class TransportProtocol {
    /** Static value Udp for TransportProtocol. */
    public static final TransportProtocol UDP = new TransportProtocol("Udp");

    /** Static value Tcp for TransportProtocol. */
    public static final TransportProtocol TCP = new TransportProtocol("Tcp");

    private String value;

    /**
     * Creates a custom value for TransportProtocol.
     * @param value the custom value
     */
    public TransportProtocol(String value) {
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
        if (!(obj instanceof TransportProtocol)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        TransportProtocol rhs = (TransportProtocol) obj;
        if (value == null) {
            return rhs.value == null;
        } else {
            return value.equals(rhs.value);
        }
    }
}
