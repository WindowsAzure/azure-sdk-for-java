package com.azure.security.keyvault.keys.cryptography;

import com.azure.core.util.Context;
import com.azure.security.keyvault.keys.models.webkey.JsonWebKey;
import reactor.core.publisher.Mono;

import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.security.MessageDigest;

class EcKeyCryptographyClient extends LocalKeyCryptographyClient {
    private KeyPair keyPair;
    private CryptographyServiceClient serviceClient;
    private Provider provider;

    /**
     * Creates a EcKeyCryptographyClient that uses {@code service} to service requests
     *
     * @param serviceClient the client to use for service side cryptography operations.
     */
    EcKeyCryptographyClient( CryptographyServiceClient serviceClient) {
        super(serviceClient);
        this.serviceClient = serviceClient;
    }

    EcKeyCryptographyClient(JsonWebKey key, CryptographyServiceClient serviceClient) {
        super(serviceClient);
        this.provider = Security.getProvider("SunEC");
        this.keyPair = key.toEC(key.hasPrivateKey(), provider);
        this.serviceClient = serviceClient;
    }

    private KeyPair getKeyPair(JsonWebKey key) {
        if(keyPair == null){
            keyPair = key.toEC(key.hasPrivateKey());
        }
        return keyPair;
    }

    Mono<EncryptResult> encryptAsync(EncryptionAlgorithm algorithm, byte[] plaintext, byte[] iv, byte[] authenticationData, Context context, JsonWebKey key) {
        throw new UnsupportedOperationException("Encrypt operation is not supported for EC key");
    }


    Mono<DecryptResult> decryptAsync(EncryptionAlgorithm algorithm, byte[] cipherText, byte[] iv, byte[] authenticationData, byte[] authenticationTag, Context context, JsonWebKey key) {

        throw new UnsupportedOperationException("Decrypt operation is not supported for EC key");
    }

    Mono<SignResult> signAsync(SignatureAlgorithm algorithm, byte[] digest, Context context, JsonWebKey key) {
        keyPair = getKeyPair(key);

        // Interpret the requested algorithm
        Algorithm baseAlgorithm = AlgorithmResolver.Default.get(algorithm.toString());

        if (baseAlgorithm == null) {
            if(serviceCryptoAvailable()) {
                return serviceClient.sign(algorithm, digest, context);
            }
            return Mono.error(new NoSuchAlgorithmException(algorithm.toString()));
        } else if (!(baseAlgorithm instanceof AsymmetricSignatureAlgorithm)) {
            return Mono.error(new NoSuchAlgorithmException(algorithm.toString()));
        }

        if (keyPair.getPrivate() == null){
            if(serviceCryptoAvailable()) {
                return serviceClient.sign(algorithm, digest, context);
            }
            return Mono.error(new IllegalArgumentException("Private portion of the key not available to perform sign operation"));
        }

        Ecdsa algo = (Ecdsa) baseAlgorithm;
        ISignatureTransform signer = algo.createSignatureTransform(keyPair, provider);

        try {
            return Mono.just(new SignResult(signer.sign(digest), algorithm));
        } catch (Exception e) {
            return Mono.error(e);
        }
     }

    Mono<VerifyResult> verifyAsync(SignatureAlgorithm algorithm, byte[] digest, byte[] signature, Context context, JsonWebKey key) {

        keyPair = getKeyPair(key);

        // Interpret the requested algorithm
        Algorithm baseAlgorithm = AlgorithmResolver.Default.get(algorithm.toString());

        if (baseAlgorithm == null) {
            if(serviceCryptoAvailable()) {
                return serviceClient.verify(algorithm, digest, signature, context);
            }
            return Mono.error(new NoSuchAlgorithmException(algorithm.toString()));
        } else if (!(baseAlgorithm instanceof AsymmetricSignatureAlgorithm)) {
            return Mono.error(new NoSuchAlgorithmException(algorithm.toString()));
        }

        if (keyPair.getPublic() == null){
            if(serviceCryptoAvailable()) {
                return serviceClient.verify(algorithm, digest, signature, context);
            }
            return Mono.error(new IllegalArgumentException("Public portion of the key not available to perform verify operation"));
        }

        Ecdsa algo = (Ecdsa) baseAlgorithm;

        ISignatureTransform signer = algo.createSignatureTransform(keyPair, provider);

        try {
            return Mono.just(new VerifyResult(signer.verify(digest, signature)));
        } catch (Exception e) {
            return Mono.error(e);
        }
    }

    Mono<KeyWrapResult> wrapKeyAsync(KeyWrapAlgorithm algorithm, byte[] key, Context context, JsonWebKey webKey) {

        return Mono.error(new UnsupportedOperationException("Wrap key operation is not supported for EC key"));
    }

    Mono<KeyUnwrapResult> unwrapKeyAsync(KeyWrapAlgorithm algorithm, byte[] encryptedKey, Context context, JsonWebKey key) {

        throw new UnsupportedOperationException("Unwrap key operation is not supported for Ec key");
    }

    Mono<SignResult> signDataAsync(SignatureAlgorithm algorithm, byte[] data, Context context, JsonWebKey key) {
        try {
            HashAlgorithm hashAlgorithm = SignatureHashResolver.Default.get(algorithm);
            MessageDigest md = MessageDigest.getInstance(hashAlgorithm.toString());
            md.update(data);
            byte[] digest = md.digest();
            return signAsync(algorithm, digest, context, key);
        } catch (NoSuchAlgorithmException e){
            return Mono.error(e);
        }
    }

    Mono<VerifyResult> verifyDataAsync(SignatureAlgorithm algorithm, byte[] data, byte[] signature, Context context, JsonWebKey key) {
        try {
            HashAlgorithm hashAlgorithm = SignatureHashResolver.Default.get(algorithm);
            MessageDigest md = MessageDigest.getInstance(hashAlgorithm.toString());
            md.update(data);
            byte[] digest = md.digest();

            return verifyAsync(algorithm, digest, signature, context, key);
        } catch (NoSuchAlgorithmException e) {
            return Mono.error(e);
        }
    }

    private boolean serviceCryptoAvailable(){
        return serviceClient != null ;
    }
}
