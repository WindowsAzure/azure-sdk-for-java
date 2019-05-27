package com.azure.keyvault.certificates.models;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for KeyUsageType.
 */
public final class KeyUsageType {
    /** Static value digitalSignature for KeyUsageType. */
    public static final KeyUsageType DIGITAL_SIGNATURE = new KeyUsageType("digitalSignature");

    /** Static value nonRepudiation for KeyUsageType. */
    public static final KeyUsageType NON_REPUDIATION = new KeyUsageType("nonRepudiation");

    /** Static value keyEncipherment for KeyUsageType. */
    public static final KeyUsageType KEY_ENCIPHERMENT = new KeyUsageType("keyEncipherment");

    /** Static value dataEncipherment for KeyUsageType. */
    public static final KeyUsageType DATA_ENCIPHERMENT = new KeyUsageType("dataEncipherment");

    /** Static value keyAgreement for KeyUsageType. */
    public static final KeyUsageType KEY_AGREEMENT = new KeyUsageType("keyAgreement");

    /** Static value keyCertSign for KeyUsageType. */
    public static final KeyUsageType KEY_CERT_SIGN = new KeyUsageType("keyCertSign");

    /** Static value cRLSign for KeyUsageType. */
    public static final KeyUsageType C_RLSIGN = new KeyUsageType("cRLSign");

    /** Static value encipherOnly for KeyUsageType. */
    public static final KeyUsageType ENCIPHER_ONLY = new KeyUsageType("encipherOnly");

    /** Static value decipherOnly for KeyUsageType. */
    public static final KeyUsageType DECIPHER_ONLY = new KeyUsageType("decipherOnly");

    private String value;

    /**
     * Creates a custom value for KeyUsageType.
     * @param value the custom value
     */
    public KeyUsageType(String value) {
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
        if (!(obj instanceof KeyUsageType)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        KeyUsageType rhs = (KeyUsageType) obj;
        if (value == null) {
            return rhs.value == null;
        } else {
            return value.equals(rhs.value);
        }
    }
}