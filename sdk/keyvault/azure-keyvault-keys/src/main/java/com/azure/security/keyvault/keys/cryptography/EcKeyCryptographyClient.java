package com.azure.security.keyvault.keys.cryptography;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.rest.Response;
import com.azure.core.implementation.RestProxy;
import com.azure.core.implementation.annotation.ReturnType;
import com.azure.core.implementation.annotation.ServiceClient;
import com.azure.core.implementation.annotation.ServiceMethod;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.security.keyvault.keys.KeyClientBuilder;
import com.azure.security.keyvault.keys.models.Key;
import com.azure.security.keyvault.keys.models.webkey.JsonWebKey;
import reactor.core.publisher.Mono;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;

import static com.azure.core.implementation.util.FluxUtil.withContext;

class EcKeyCryptographyClient {
    static final String API_VERSION = "7.0";
    static final String ACCEPT_LANGUAGE = "en-US";
    static final String CONTENT_TYPE_HEADER_VALUE = "application/json";

    private JsonWebKey key;
    private final ClientLogger logger = new ClientLogger(EcKeyCryptographyClient.class);
    private final CryptographyService service;
    private String endpoint;
    private String version;
    private String keyName;

    /**
     * Creates a EcKeyCryptographyClient that uses {@code service} to service requests
     *
     * @param key the JsonWebKey to use for cryptography operations.
     */
    EcKeyCryptographyClient(JsonWebKey key, CryptographyService service) {
        Objects.requireNonNull(key);
        this.key = key;
        this.service = service;
    }

    EcKeyCryptographyClient(String kid, CryptographyService service) {
        Objects.requireNonNull(kid);
        unpackId(kid);
        this.service = service;
    }

    Mono<Response<Key>> getKey() {
        if (version == null) {
            version = "";
        }
        return withContext(context -> getKey(keyName, version, context));
    }

    private Mono<Response<Key>> getKey(String name, String version, Context context) {
        return service.getKey(endpoint, name, version, API_VERSION, ACCEPT_LANGUAGE, CONTENT_TYPE_HEADER_VALUE, context)
                .doOnRequest(ignored -> logger.info("Retrieving key - {}",  name))
                .doOnSuccess(response -> logger.info("Retrieved key - {}", response.value().name()))
                .doOnError(error -> logger.warning("Failed to get key - {}", name, error));
    }


    Mono<EncryptResult> encryptAsync(EncryptionAlgorithm algorithm, byte[] plaintext, Context context) {
        throw new UnsupportedOperationException("Encrypt Async is not supported");
    }


    Mono<byte[]> decryptAsync(EncryptionAlgorithm algorithm, byte[] cipherText, Context context) {

        throw new UnsupportedOperationException("Decrypt Async is not supported");
    }


    Mono<SignResult> signAsync(SignatureAlgorithm algorithm, byte[] digest, Context context) {

        if(key == null){
            this.key = getKey().block().value().keyMaterial();
        }

        KeySignRequest parameters = new KeySignRequest().algorithm(algorithm).value(digest);
        return service.sign(endpoint,keyName,version,API_VERSION,ACCEPT_LANGUAGE, parameters, CONTENT_TYPE_HEADER_VALUE, context)
                .flatMap(keyOperationResultResponse ->
                        Mono.just(new SignResult().algorithm(algorithm)
                                .signature(keyOperationResultResponse.value().result())));
        // plaintext is required
        // iv is required for some algorithms, for instance AESCBC
        // authenticationData is never required but it only makes sense in the case of authenticated encryption algorithms, for instance AES-GCM AESCBC-HMAC
        // algorithm is not required in the case that we have the key locally and know the keytype (in which case we can use the best available algorithm for the keytype), otherwise it would be required

        // this method **could** be performed locally in the case that the public portion of the key is available locally for asymmetric keys, or all the key data in the case of symmetric
    }

    Mono<Boolean> verifyAsync(SignatureAlgorithm algorithm, byte[] digest, byte[] signature, Context context) {

        if(key == null){
            this.key = getKey().block().value().keyMaterial();
        }

        KeyVerifyRequest parameters = new KeyVerifyRequest().algorithm(algorithm).digest(digest).signature(signature);
        return service.verify(endpoint,keyName,version,API_VERSION,ACCEPT_LANGUAGE, parameters, CONTENT_TYPE_HEADER_VALUE, context)
                .flatMap(response ->
                        Mono.just(response.value().value()));
        // plaintext is required
        // iv is required for some algorithms, for instance AESCBC
        // authenticationData is never required but it only makes sense in the case of authenticated encryption algorithms, for instance AES-GCM AESCBC-HMAC
        // algorithm is not required in the case that we have the key locally and know the keytype (in which case we can use the best available algorithm for the keytype), otherwise it would be required

        // this method **could** be performed locally in the case that the public portion of the key is available locally for asymmetric keys, or all the key data in the case of symmetric
    }

    Mono<KeyWrapResult> wrapKeyAsync(KeyWrapAlgorithm algorithm, byte[] key, Context context) {

        throw new UnsupportedOperationException("Wrap key Async is not supported");
    }

    Mono<byte[]> unwrapKeyAsync(KeyWrapAlgorithm algorithm, byte[] encryptedKey, Context context) {

        throw new UnsupportedOperationException("Unwrap key Async is not supported");

    }

    private void unpackId(String keyId) {
        if (keyId != null && keyId.length() > 0) {
            try {
                URL url = new URL(keyId);
                String[] tokens = url.getPath().split("/");
                this.endpoint = url.getProtocol() + "://" + url.getHost();
                this.keyName = (tokens.length >= 3 ? tokens[2] : null);
                this.version = (tokens.length >= 4 ? tokens[3] : null);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
    }


}
