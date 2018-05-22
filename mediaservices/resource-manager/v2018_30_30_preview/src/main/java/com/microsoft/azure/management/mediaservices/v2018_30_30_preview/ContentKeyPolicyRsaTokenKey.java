/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_30_30_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Specifies a RSA key for token validation.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata.type")
@JsonTypeName("#Microsoft.Media.ContentKeyPolicyRsaTokenKey")
public class ContentKeyPolicyRsaTokenKey extends ContentKeyPolicyRestrictionTokenKey {
    /**
     * The RSA Parameter exponent.
     */
    @JsonProperty(value = "exponent", required = true)
    private byte[] exponent;

    /**
     * The RSA Parameter modulus.
     */
    @JsonProperty(value = "modulus", required = true)
    private byte[] modulus;

    /**
     * Get the exponent value.
     *
     * @return the exponent value
     */
    public byte[] exponent() {
        return this.exponent;
    }

    /**
     * Set the exponent value.
     *
     * @param exponent the exponent value to set
     * @return the ContentKeyPolicyRsaTokenKey object itself.
     */
    public ContentKeyPolicyRsaTokenKey withExponent(byte[] exponent) {
        this.exponent = exponent;
        return this;
    }

    /**
     * Get the modulus value.
     *
     * @return the modulus value
     */
    public byte[] modulus() {
        return this.modulus;
    }

    /**
     * Set the modulus value.
     *
     * @param modulus the modulus value to set
     * @return the ContentKeyPolicyRsaTokenKey object itself.
     */
    public ContentKeyPolicyRsaTokenKey withModulus(byte[] modulus) {
        this.modulus = modulus;
        return this;
    }

}
