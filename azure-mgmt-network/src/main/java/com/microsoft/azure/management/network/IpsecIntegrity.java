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
 * Defines values for IpsecIntegrity.
 */
public final class IpsecIntegrity {
    /** Static value MD5 for IpsecIntegrity. */
    public static final IpsecIntegrity MD5 = new IpsecIntegrity("MD5");

    /** Static value SHA1 for IpsecIntegrity. */
    public static final IpsecIntegrity SHA1 = new IpsecIntegrity("SHA1");

    /** Static value SHA256 for IpsecIntegrity. */
    public static final IpsecIntegrity SHA256 = new IpsecIntegrity("SHA256");

    /** Static value GCMAES128 for IpsecIntegrity. */
    public static final IpsecIntegrity GCMAES128 = new IpsecIntegrity("GCMAES128");

    /** Static value GCMAES192 for IpsecIntegrity. */
    public static final IpsecIntegrity GCMAES192 = new IpsecIntegrity("GCMAES192");

    /** Static value GCMAES256 for IpsecIntegrity. */
    public static final IpsecIntegrity GCMAES256 = new IpsecIntegrity("GCMAES256");

    private String value;

    /**
     * Creates a custom value for IpsecIntegrity.
     * @param value the custom value
     */
    public IpsecIntegrity(String value) {
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
        if (!(obj instanceof IpsecIntegrity)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        IpsecIntegrity rhs = (IpsecIntegrity) obj;
        if (value == null) {
            return rhs.value == null;
        } else {
            return value.equals(rhs.value);
        }
    }
}
