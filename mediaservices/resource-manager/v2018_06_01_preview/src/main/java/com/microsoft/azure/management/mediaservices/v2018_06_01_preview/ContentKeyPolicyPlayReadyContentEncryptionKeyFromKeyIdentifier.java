/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_06_01_preview;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Specifies that the content key ID is specified in the PlayReady
 * configuration.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type", defaultImpl = ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifier.class)
@JsonTypeName("#Microsoft.Media.ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifier")
public class ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifier extends ContentKeyPolicyPlayReadyContentKeyLocation {
    /**
     * The content key ID.
     */
    @JsonProperty(value = "keyId", required = true)
    private UUID keyId;

    /**
     * Get the content key ID.
     *
     * @return the keyId value
     */
    public UUID keyId() {
        return this.keyId;
    }

    /**
     * Set the content key ID.
     *
     * @param keyId the keyId value to set
     * @return the ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifier object itself.
     */
    public ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifier withKeyId(UUID keyId) {
        this.keyId = keyId;
        return this;
    }

}
