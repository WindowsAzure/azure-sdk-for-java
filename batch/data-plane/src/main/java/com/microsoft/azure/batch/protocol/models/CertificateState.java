/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for CertificateState.
 */
public enum CertificateState {
    /** The certificate is available for use in pools. */
    ACTIVE("active"),

    /** The user has requested that the certificate be deleted, but the delete operation has not yet completed. You may not reference the certificate when creating or updating pools. */
    DELETING("deleting"),

    /** The user requested that the certificate be deleted, but there are pools that still have references to the certificate, or it is still installed on one or more compute nodes. (The latter can occur if the certificate has been removed from the pool, but the node has not yet restarted. Nodes refresh their certificates only when they restart.) You may use the cancel certificate delete operation to cancel the delete, or the delete certificate operation to retry the delete. */
    DELETE_FAILED("deletefailed");

    /** The actual serialized value for a CertificateState instance. */
    private String value;

    CertificateState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a CertificateState instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed CertificateState object, or null if unable to parse.
     */
    @JsonCreator
    public static CertificateState fromString(String value) {
        CertificateState[] items = CertificateState.values();
        for (CertificateState item : items) {
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
