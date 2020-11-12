// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.security.keyvault.keys.cryptography;

import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.security.keyvault.keys.cryptography.models.DecryptResult;
import com.azure.security.keyvault.keys.cryptography.models.EncryptionAlgorithm;
import com.azure.security.keyvault.keys.cryptography.models.EncryptResult;
import com.azure.security.keyvault.keys.cryptography.models.UnwrapResult;
import com.azure.security.keyvault.keys.cryptography.models.WrapResult;
import com.azure.security.keyvault.keys.cryptography.models.KeyWrapAlgorithm;
import com.azure.security.keyvault.keys.cryptography.models.SignatureAlgorithm;
import com.azure.security.keyvault.keys.cryptography.models.SignResult;
import com.azure.security.keyvault.keys.cryptography.models.VerifyResult;
import com.azure.security.keyvault.keys.models.JsonWebKey;
import reactor.core.publisher.Mono;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Objects;

class SymmetricKeyCryptographyClient extends LocalKeyCryptographyClient {
    private static final int CBC_BLOCK_SIZE = 16;
    private static final int GCM_NONCE_SIZE = 12;

    private final ClientLogger logger = new ClientLogger(SymmetricKeyCryptographyClient.class);

    private byte[] key;

    /**
     * Creates a {@link SymmetricKeyCryptographyClient} to perform local cryptography operations.
     *
     * @param serviceClient The client to route the requests through.
     */
    SymmetricKeyCryptographyClient(CryptographyServiceClient serviceClient) {
        super(serviceClient);
    }

    SymmetricKeyCryptographyClient(JsonWebKey key, CryptographyServiceClient serviceClient) {
        super(serviceClient);
        this.key = key.toAes().getEncoded();
    }

    private byte[] getKey(JsonWebKey key) {
        if (this.key == null) {
            this.key = key.toAes().getEncoded();
        }
        return this.key;
    }

    @Override
    Mono<EncryptResult> encryptAsync(EncryptOptions encryptOptions, Context context, JsonWebKey jsonWebKey) {
        Objects.requireNonNull(encryptOptions, "'encryptOptions' cannot be null.");
        Objects.requireNonNull(encryptOptions.getAlgorithm(), "Encryption algorithm cannot be null.");
        Objects.requireNonNull(encryptOptions.getPlainText(), "Plain text content to be encrypted cannot be null.");

        this.key = getKey(jsonWebKey);

        if (key == null || key.length == 0) {
            throw logger.logExceptionAsError(new IllegalArgumentException("Key is empty."));
        }

        // Interpret the algorithm
        EncryptionAlgorithm algorithm = encryptOptions.getAlgorithm();
        Algorithm baseAlgorithm = AlgorithmResolver.Default.get(algorithm.toString());

        if (!(baseAlgorithm instanceof SymmetricEncryptionAlgorithm)) {
            return Mono.error(new NoSuchAlgorithmException(algorithm.toString()));
        }

        SymmetricEncryptionAlgorithm symmetricEncryptionAlgorithm = (SymmetricEncryptionAlgorithm) baseAlgorithm;

        ICryptoTransform transform;

        byte[] iv = encryptOptions.getIv();
        byte[] additionalAuthenticatedData = encryptOptions.getAdditionalAuthenticatedData();
        byte[] authenticationTag = generateRandomByteArray(GCM_NONCE_SIZE);

        if (iv == null) {
            if (algorithm == EncryptionAlgorithm.A128GCM || algorithm == EncryptionAlgorithm.A192GCM
                || algorithm == EncryptionAlgorithm.A256GCM) {

                iv = generateRandomByteArray(GCM_NONCE_SIZE);
            } else if (algorithm == EncryptionAlgorithm.A128CBC || algorithm == EncryptionAlgorithm.A192CBC
                || algorithm == EncryptionAlgorithm.A256CBC || algorithm == EncryptionAlgorithm.A128CBCPAD
                || algorithm == EncryptionAlgorithm.A192CBCPAD || algorithm == EncryptionAlgorithm.A256CBCPAD) {

                iv = generateRandomByteArray(CBC_BLOCK_SIZE);
            }
        }

        try {
            transform = symmetricEncryptionAlgorithm.createEncryptor(this.key, iv, additionalAuthenticatedData,
                authenticationTag);
        } catch (Exception e) {
            return Mono.error(e);
        }

        byte[] encrypted;

        try {
            encrypted = transform.doFinal(encryptOptions.getPlainText());
        } catch (Exception e) {
            return Mono.error(e);
        }

        return Mono.just(new EncryptResult(encrypted, algorithm, jsonWebKey.getId(), iv, additionalAuthenticatedData,
            authenticationTag));
    }

    @Override
    Mono<DecryptResult> decryptAsync(DecryptOptions decryptOptions, Context context, JsonWebKey jsonWebKey) {
        Objects.requireNonNull(decryptOptions, "'decryptOptions' cannot be null.");
        Objects.requireNonNull(decryptOptions.getAlgorithm(), "Encryption algorithm cannot be null.");
        Objects.requireNonNull(decryptOptions.getCipherText(), "Cipher text content to be decrypted cannot be null.");

        this.key = getKey(jsonWebKey);

        if (key == null || key.length == 0) {
            throw logger.logExceptionAsError(new IllegalArgumentException("Key is empty."));
        }

        // Interpret the algorithm
        EncryptionAlgorithm algorithm = decryptOptions.getAlgorithm();
        Algorithm baseAlgorithm = AlgorithmResolver.Default.get(algorithm.toString());

        if (!(baseAlgorithm instanceof SymmetricEncryptionAlgorithm)) {
            return Mono.error(new NoSuchAlgorithmException(algorithm.toString()));
        }

        SymmetricEncryptionAlgorithm symmetricEncryptionAlgorithm = (SymmetricEncryptionAlgorithm) baseAlgorithm;

        ICryptoTransform transform;

        byte[] iv = decryptOptions.getIv();
        byte[] additionalAuthenticatedData = decryptOptions.getAdditionalAuthenticatedData();
        byte[] authenticationTag = decryptOptions.getAuthenticationTag();

        if (iv == null) {
            if (algorithm == EncryptionAlgorithm.A128GCM || algorithm == EncryptionAlgorithm.A192GCM
                || algorithm == EncryptionAlgorithm.A256GCM) {

                iv = generateRandomByteArray(GCM_NONCE_SIZE);
            } else if (algorithm == EncryptionAlgorithm.A128CBC || algorithm == EncryptionAlgorithm.A192CBC
                || algorithm == EncryptionAlgorithm.A256CBC || algorithm == EncryptionAlgorithm.A128CBCPAD
                || algorithm == EncryptionAlgorithm.A192CBCPAD || algorithm == EncryptionAlgorithm.A256CBCPAD) {

                iv = generateRandomByteArray(CBC_BLOCK_SIZE);
            }
        }

        try {
            transform = symmetricEncryptionAlgorithm.createDecryptor(this.key, iv, additionalAuthenticatedData, authenticationTag);
        } catch (Exception e) {
            return Mono.error(e);
        }

        byte[] decrypted;

        try {
            decrypted = transform.doFinal(decryptOptions.getCipherText());
        } catch (Exception e) {
            return Mono.error(e);
        }

        return Mono.just(new DecryptResult(decrypted, algorithm, jsonWebKey.getId()));
    }

    @Override
    Mono<SignResult> signAsync(SignatureAlgorithm algorithm, byte[] digest, Context context, JsonWebKey key) {
        return Mono.error(new UnsupportedOperationException("Sign operation not supported for OCT/Symmetric key"));
    }

    @Override
    Mono<VerifyResult> verifyAsync(SignatureAlgorithm algorithm, byte[] digest, byte[] signature, Context context,
                                   JsonWebKey key) {
        return Mono.error(new UnsupportedOperationException("Verify operation not supported for OCT/Symmetric key"));
    }

    @Override
    Mono<WrapResult> wrapKeyAsync(KeyWrapAlgorithm algorithm, byte[] key, Context context, JsonWebKey jsonWebKey) {
        this.key = getKey(jsonWebKey);

        if (key == null || key.length == 0) {
            throw logger.logExceptionAsError(new IllegalArgumentException("key"));
        }

        // Interpret the algorithm
        Algorithm baseAlgorithm = AlgorithmResolver.Default.get(algorithm.toString());

        if (!(baseAlgorithm instanceof LocalKeyWrapAlgorithm)) {
            return Mono.error(new NoSuchAlgorithmException(algorithm.toString()));
        }

        LocalKeyWrapAlgorithm localKeyWrapAlgorithm = (LocalKeyWrapAlgorithm) baseAlgorithm;

        ICryptoTransform transform;

        try {
            transform = localKeyWrapAlgorithm.createEncryptor(this.key, null, null);
        } catch (Exception e) {
            return Mono.error(e);
        }

        byte[] encrypted;

        try {
            encrypted = transform.doFinal(key);
        } catch (Exception e) {
            return Mono.error(e);
        }

        return Mono.just(new WrapResult(encrypted, algorithm, jsonWebKey.getId()));
    }

    @Override
    Mono<UnwrapResult> unwrapKeyAsync(KeyWrapAlgorithm algorithm, byte[] encryptedKey, Context context, JsonWebKey jsonWebKey) {
        this.key = getKey(jsonWebKey);

        Algorithm baseAlgorithm = AlgorithmResolver.Default.get(algorithm.toString());

        if (!(baseAlgorithm instanceof LocalKeyWrapAlgorithm)) {
            return Mono.error(new NoSuchAlgorithmException(algorithm.toString()));
        }

        LocalKeyWrapAlgorithm localKeyWrapAlgorithm = (LocalKeyWrapAlgorithm) baseAlgorithm;

        ICryptoTransform transform;

        try {
            transform = localKeyWrapAlgorithm.createDecryptor(this.key, null, null);
        } catch (Exception e) {
            return Mono.error(e);
        }

        byte[] decrypted;

        try {
            decrypted = transform.doFinal(encryptedKey);
        } catch (Exception e) {
            return Mono.error(e);
        }

        return Mono.just(new UnwrapResult(decrypted, algorithm, jsonWebKey.getId()));
    }

    @Override
    Mono<SignResult> signDataAsync(SignatureAlgorithm algorithm, byte[] data, Context context, JsonWebKey key) {
        return signAsync(algorithm, data, context, key);
    }

    @Override
    Mono<VerifyResult> verifyDataAsync(SignatureAlgorithm algorithm, byte[] data, byte[] signature, Context context,
                                       JsonWebKey key) {
        return verifyAsync(algorithm, data, signature, context, key);
    }

    private byte[] generateRandomByteArray(int sizeInBytes) {
        byte[] iv = new byte[0];
        SecureRandom randomSecureRandom;

        try {
            randomSecureRandom = SecureRandom.getInstance("SHA1PRNG");
            iv = new byte[sizeInBytes];
            randomSecureRandom.nextBytes(iv);
        } catch (NoSuchAlgorithmException e) {
            logger.logThrowableAsError(e);
        }

        return iv;
    }
}
