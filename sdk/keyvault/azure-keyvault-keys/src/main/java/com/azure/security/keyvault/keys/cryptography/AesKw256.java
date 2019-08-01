// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.security.keyvault.keys.cryptography;

import javax.crypto.NoSuchPaddingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;

class AesKw256 extends AesKw {

    public static final String ALGORITHM_NAME = "A256KW";

    static final int KEY_SIZE_IN_BYTES = 256 >> 3;

    public AesKw256() {
        super(ALGORITHM_NAME);
    }

    @Override
    public ICryptoTransform CreateEncryptor(byte[] key, byte[] iv, Provider provider) throws InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidAlgorithmParameterException {

        if (key == null) {
            throw new IllegalArgumentException("key must not be null");
        }

        if (key.length < KEY_SIZE_IN_BYTES) {
            throw new IllegalArgumentException("key must be at least 256 bits long");
        }

        return super.CreateEncryptor(Arrays.copyOfRange(key, 0, KEY_SIZE_IN_BYTES), iv, provider);
    }

    @Override
    public ICryptoTransform CreateDecryptor(byte[] key, byte[] iv, Provider provider) throws InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidAlgorithmParameterException {

        if (key == null) {
            throw new IllegalArgumentException("key must not be null");
        }

        if (key.length < KEY_SIZE_IN_BYTES) {
            throw new IllegalArgumentException("key must be at least 256 bits long");
        }

        return super.CreateDecryptor(Arrays.copyOfRange(key, 0, KEY_SIZE_IN_BYTES), iv, provider);
    }

}
