// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.security.keyvault.keys.cryptography;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;
import java.util.Objects;

abstract class AesGcm extends SymmetricEncryptionAlgorithm {
    static final int DEFAULT_TAG_LENGTH = 96;

    final int keySizeInBytes;
    final int keySize;

    protected AesGcm(String name, int size) {
        super(name);

        keySize = size;
        keySizeInBytes = size >> 3;
    }

    static class AesGcmEncryptor implements ICryptoTransform {
        private final Cipher cipher;

        AesGcmEncryptor(byte[] key, byte[] iv, byte[] authenticationData, Provider provider)
            throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException,
            InvalidAlgorithmParameterException {

            // Create the cipher using the Provider if specified
            if (provider == null) {
                cipher = Cipher.getInstance("AES/GCM/NoPadding");
            } else {
                cipher = Cipher.getInstance("AES/GCM/NoPadding", provider);
            }

            cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(key, "AES"),
                new GCMParameterSpec(DEFAULT_TAG_LENGTH, iv));
        }

        @Override
        public byte[] doFinal(byte[] plaintext) throws IllegalBlockSizeException, BadPaddingException {
            return cipher.doFinal(plaintext);
        }
    }

    static class AesGcmDecryptor implements ICryptoTransform {
        private final Cipher cipher;

        AesGcmDecryptor(byte[] key, byte[] iv, byte[] authenticationData, byte[] authenticationTag, Provider provider)
            throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException,
            InvalidAlgorithmParameterException {

            // Create the cipher using the Provider if specified
            if (provider == null) {
                cipher = Cipher.getInstance("AES/GCM/NoPadding");
            } else {
                cipher = Cipher.getInstance("AES/GCM/NoPadding", provider);
            }


            Objects.requireNonNull(authenticationTag, "'authenticationTag' cannot be null");

            cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(key, "AES"),
                new GCMParameterSpec(authenticationTag.length << 3, iv));
        }

        @Override
        public byte[] doFinal(byte[] plaintext) throws IllegalBlockSizeException, BadPaddingException {
            return cipher.doFinal(plaintext);
        }
    }

    @Override
    public ICryptoTransform createEncryptor(byte[] key, byte[] iv, byte[] authenticationData)
        throws InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException,
        InvalidAlgorithmParameterException {

        return createEncryptor(key, iv, authenticationData, null);
    }

    @Override
    public ICryptoTransform createEncryptor(byte[] key, byte[] iv, byte[] authenticationData, Provider provider)
        throws InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException,
        InvalidAlgorithmParameterException {

        if (key == null || key.length < keySizeInBytes) {
            throw new InvalidKeyException("key must be at least " + keySize + " bits in length");
        }

        return new AesGcmEncryptor(Arrays.copyOfRange(key, 0, keySizeInBytes), iv, authenticationData, provider);
    }

    @Override
    public ICryptoTransform createDecryptor(byte[] key, byte[] iv, byte[] authenticationData, byte[] authenticationTag)
        throws InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException,
        InvalidAlgorithmParameterException {

        return createDecryptor(key, iv, authenticationData, authenticationTag, null);
    }

    @Override
    public ICryptoTransform createDecryptor(byte[] key, byte[] iv, byte[] authenticationData, byte[] authenticationTag,
                                            Provider provider)
        throws InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException,
        InvalidAlgorithmParameterException {

        if (key == null || key.length < keySizeInBytes) {
            throw new InvalidKeyException("key must be at least " + keySize + " bits in length");
        }

        return new AesGcmDecryptor(Arrays.copyOfRange(key, 0, keySizeInBytes), iv, authenticationData,
            authenticationTag, provider);
    }
}
