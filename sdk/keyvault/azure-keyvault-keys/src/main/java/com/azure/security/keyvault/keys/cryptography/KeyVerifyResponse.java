package com.azure.security.keyvault.keys.cryptography;

import com.fasterxml.jackson.annotation.JsonProperty;

public class KeyVerifyResponse {

    /**
     * True if the signature is verified, otherwise false.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean value;

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public Boolean value() {
        return this.value;
    }
}
