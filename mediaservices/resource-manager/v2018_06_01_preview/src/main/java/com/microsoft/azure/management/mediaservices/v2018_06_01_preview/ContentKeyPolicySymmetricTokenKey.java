/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_06_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Specifies a symmetric key for token validation.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata.type")
@JsonTypeName("#Microsoft.Media.ContentKeyPolicySymmetricTokenKey")
public class ContentKeyPolicySymmetricTokenKey extends ContentKeyPolicyRestrictionTokenKey {
    /**
     * The key value of the key.
     */
    @JsonProperty(value = "keyValue", required = true)
    private byte[] keyValue;

    /**
     * Get the key value of the key.
     *
     * @return the keyValue value
     */
    public byte[] keyValue() {
        return this.keyValue;
    }

    /**
     * Set the key value of the key.
     *
     * @param keyValue the keyValue value to set
     * @return the ContentKeyPolicySymmetricTokenKey object itself.
     */
    public ContentKeyPolicySymmetricTokenKey withKeyValue(byte[] keyValue) {
        this.keyValue = keyValue;
        return this;
    }

}
