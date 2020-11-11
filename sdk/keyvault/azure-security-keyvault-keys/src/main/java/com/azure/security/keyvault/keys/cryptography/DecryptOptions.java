// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.security.keyvault.keys.cryptography;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A class containing various configuration parameters that can be applied when performing decryption operations.
 */
public class DecryptOptions {
    /**
     * Initialization vector to be used in the decryption operation using a symmetric algorithm.
     */
    @JsonProperty(value = "iv")
    private final byte[] iv;

    /**
     * Get additional data to authenticate when performing decryption with an authenticated algorithm.
     */
    @JsonProperty(value = "aad")
    private final byte[] additionalAuthenticatedData;

    /**
     * The tag to authenticate when performing decryption with an authenticated algorithm.
     */
    @JsonProperty(value = "tag")
    private final byte[] authenticationTag;

    /**
     * Creates an instance of {@link DecryptOptions} with the given parameters.
     *
     * @param iv Initialization vector for symmetric algorithms.
     * @param additionalAuthenticatedData Additional data to authenticate but not encrypt/decrypt when using
     * authenticated crypto algorithms.
     * @param authenticationTag The tag to authenticate when performing decryption with an authenticated algorithm.
     */
    public DecryptOptions(byte[] iv, byte[] additionalAuthenticatedData, byte[] authenticationTag) {
        if (iv == null) {
            this.iv = null;
        } else {
            this.iv = new byte[iv.length];
            System.arraycopy(iv, 0, this.iv, 0, iv.length);
        }

        if (additionalAuthenticatedData == null) {
            this.additionalAuthenticatedData = null;
        } else {
            this.additionalAuthenticatedData = new byte[additionalAuthenticatedData.length];
            System.arraycopy(additionalAuthenticatedData, 0, this.additionalAuthenticatedData, 0,
                additionalAuthenticatedData.length);
        }

        if (authenticationTag == null) {
            this.authenticationTag = null;
        } else {
            this.authenticationTag = new byte[authenticationTag.length];
            System.arraycopy(authenticationTag, 0, this.authenticationTag, 0, authenticationTag.length);
        }
    }

    /**
     * Get the initialization vector to be used in the decryption operation using a symmetric algorithm.
     *
     * @return The initialization vector.
     */
    public byte[] getIv() {
        if (iv == null) {
            return null;
        } else {
            return iv.clone();
        }
    }

    /**
     * Get additional data to authenticate when performing decryption with an authenticated algorithm.
     *
     * @return The additional authenticated data.
     */
    public byte[] getAdditionalAuthenticatedData() {
        if (additionalAuthenticatedData == null) {
            return null;
        } else {
            return additionalAuthenticatedData.clone();
        }
    }

    /**
     * Get the tag to authenticate when performing decryption with an authenticated algorithm.
     *
     * @return The authentication tag.
     */
    public byte[] getAuthenticationTag() {
        if (authenticationTag == null) {
            return null;
        } else {
            return authenticationTag.clone();
        }
    }
}
