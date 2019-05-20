// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.keyvault.keys;

import com.azure.core.ServiceClient;
import com.azure.core.exception.HttpRequestException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.http.rest.VoidResponse;
import com.azure.core.implementation.RestProxy;
import com.azure.keyvault.keys.implementation.DeletedKeyPage;
import com.azure.keyvault.keys.implementation.KeyBasePage;
import com.azure.keyvault.keys.models.*;
import com.azure.keyvault.keys.models.webkey.JsonWebKey;
import com.azure.keyvault.keys.models.webkey.JsonWebKeyType;
import org.reactivestreams.Publisher;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.net.URL;
import java.util.Objects;
import java.util.function.Function;


/**
 * The KeyAsyncClient provides asynchronous methods to manage {@link Key keys} in the Azure Key Vault. The client
 * supports creating, retrieving, updating, deleting, purging, backing up, restoring and listing the {@link Key keys}. The client
 * also supports listing {@link DeletedKey deleted keys} for a soft-delete enabled Azure Key Vault.
 *
 * <p><strong>Samples to construct the client</strong></p>
 * <pre>
 * KeyAsyncClient.builder()
 *   .endpoint("https://myvault.vault.azure.net/")
 *   .credentials(keyVaultCredentials)
 *   .build()
 * </pre>
 *
 * @see KeyAsyncClientBuilder
 */
public final class KeyAsyncClient extends ServiceClient {
    static final String API_VERSION = "7.0";
    static final String ACCEPT_LANGUAGE = "en-US";
    static final int DEFAULT_MAX_PAGE_RESULTS = 25;
    static final String CONTENT_TYPE_HEADER_VALUE = "application/json";
    private String endpoint;
    private final KeyService service;

    /**
     * Creates a KeyAsyncClient that uses {@code pipeline} to service requests
     *
     * @param endpoint URL for the Azure KeyVault service.
     * @param pipeline HttpPipeline that the HTTP requests and responses flow through.
     */
    KeyAsyncClient(URL endpoint, HttpPipeline pipeline) {
        super(pipeline);
        // Objects.requireNonNull(endpoint, KeyVaultErrorCodeStrings.getErrorString(KeyVaultErrorCodeStrings.VAULT_END_POINT_REQUIRED));
        this.endpoint = endpoint.toString();
        this.service = RestProxy.create(KeyService.class, this);
    }

    /**
     * Creates a builder that can configure options for the KeyAsyncClient before creating an instance of it.
     * @return A new builder to create a KeyAsyncClient from.
     */
    static KeyAsyncClientBuilder builder() {
        return new KeyAsyncClientBuilder();
    }

    /**
     * Creates a new key and  stores it in the key vault. The create key operation can be used to create any key type in
     * key vault. If the named key already exists, Azure Key Vault creates a new version of the key. It requires the {@code keys/create} permission.
     *
     * <p>The {@link JsonWebKeyType keyType} indicates the type of key to create. Possible values include: {@link JsonWebKeyType#EC EC},
     * {@link JsonWebKeyType#EC_HSM EC-HSM}, {@link JsonWebKeyType#RSA RSA}, {@link JsonWebKeyType#RSA_HSM RSA-HSM}, {@link JsonWebKeyType#OCT OCT}.</p>
     *
     * <p><strong>Code Samples</strong></p>
     * <p>Creates a new EC key. Subscribes to the call asynchronously and prints out the newly created key details when the callback happens.</p>
     * <pre>
     * keyAsyncClient.createKey("keyName", JsonWebKeyType.EC).subscribe(keyResponse ->
     *   System.out.printf("Key is created with name %s and id %s \n", keyResponse.value().name(), keyResponse.value().keyId()));
     * </pre>
     *
     * @param name The name of the key being created.
     * @param keyType The type of key to create. For valid values, see {@link JsonWebKeyType JsonWebKeyType}.
     * @throws HttpRequestException if {@code name} is empty string.
     * @return A {@link Mono} containing a {@link Response} whose {@link Response#value() value} contains the {@link Key created key}.
     */
    public Mono<Response<Key>> createKey(String name, JsonWebKeyType keyType) {
        KeyRequestParameters parameters = new KeyRequestParameters().kty(keyType);
        return service.createKey(endpoint, name, API_VERSION, ACCEPT_LANGUAGE, parameters, CONTENT_TYPE_HEADER_VALUE);
    }

    /**
     * Creates a new RSA key and  stores it in the key vault. The create rsa key operation can be used to create any rsa key type in
     * key vault. If the named key already exists, Azure Key Vault creates a new version of the key. It requires the {@code keys/create} permission.
     *
     * <p>The {@code rsaKeyCreateConfig} is required and its fields {@link RSAKeyCreateConfig#name() name} and {@link RSAKeyCreateConfig#keyType() key type} cannot
     * be null. The {@link RSAKeyCreateConfig#keySize() key size}, {@link RSAKeyCreateConfig#expires() expires}, {@link RSAKeyCreateConfig#contentType() contentType}
     * and {@link RSAKeyCreateConfig#notBefore() notBefore} values in {@code rsaKeyCreateConfig} are optional. If not specified, no values are set for the
     * fields. The {@link RSAKeyCreateConfig#enabled() enabled} field is set to true by Azure Key Vault, if not specified.</p>
     *
     * <p>The {@link RSAKeyCreateConfig#keyType() keyType} indicates the type of key to create. Possible values include: {@link JsonWebKeyType#RSA RSA},
     * {@link JsonWebKeyType#RSA_HSM RSA-HSM}.</p>
     *
     * <p><strong>Code Samples</strong></p>
     * <p>Creates a new RSA key with size 2048 which activates in one day and expires in one year. Subscribes to the call asynchronously
     * and prints out the newly created key details when the callback happens.</p>
     * <pre>
     * RSAKeyCreateConfig rsaKeyCreateConfig = new RSAKeyCreateConfig("keyName", JsonWebKeyType.RSA)
     *    .keySize(2048)
     *    .notBefore(OffsetDateTime.now().plusDays(1))
     *    .expires(OffsetDateTime.now().plusYears(1));
     *
     * keyAsyncClient.createRSAKey(rsaKeyCreateConfig).subscribe(keyResponse ->
     *   System.out.printf("RSA Key is created with name %s and id %s \n", keyResponse.value().name(), keyResponse.value().keyId()));
     * </pre>
     *
     * @param rsaKeyCreateConfig The key configuration object containing information about the rsa key being created.
     * @throws NullPointerException if {@code rsaKeyCreateConfig} is {@code null}.
     * @throws HttpRequestException if {@code name} is empty string.
     * @return A {@link Mono} containing a {@link Response} whose {@link Response#value() value} contains the {@link Key created key}.
     */
    public Mono<Response<Key>> createRSAKey(RSAKeyCreateConfig rsaKeyCreateConfig) {
        Objects.requireNonNull(rsaKeyCreateConfig, "The rsa key configuration parameter cannot be null.");
        KeyRequestParameters parameters = new KeyRequestParameters()
            .kty(rsaKeyCreateConfig.keyType())
            .keySize(rsaKeyCreateConfig.keySize())
            .keyOps(rsaKeyCreateConfig.keyOperations())
            .keyAttributes(new KeyRequestAttributes(rsaKeyCreateConfig));
        return service.createKey(endpoint, rsaKeyCreateConfig.name(), API_VERSION, ACCEPT_LANGUAGE, parameters, CONTENT_TYPE_HEADER_VALUE);
    }

    /**
     * Creates a new EC key and  stores it in the key vault. The create ec key operation can be used to create any ec key type in
     * key vault. If the named key already exists, Azure Key Vault creates a new version of the key. It requires the {@code keys/create} permission.
     *
     * <p>The {@code ecKeyCreateConfig} is required and its fields {@link ECKeyCreateConfig#name() name} and {@link ECKeyCreateConfig#keyType() key type} cannot
     * be null. The {@link ECKeyCreateConfig#curve() key curve}, {@link ECKeyCreateConfig#expires() expires}, {@link ECKeyCreateConfig#contentType() contentType}
     * and {@link ECKeyCreateConfig#notBefore() notBefore} values in {@code ecKeyCreateConfig} are optional. If not specified, no values are set for the
     * fields. The {@link ECKeyCreateConfig#enabled() enabled} field is set to true by Azure Key Vault, if not specified.</p>
     *
     * <p>The {@link ECKeyCreateConfig#keyType() keyType} indicates the type of key to create. Possible values include: {@link JsonWebKeyType#EC EC},
     * {@link JsonWebKeyType#EC_HSM EC-HSM}.</p>
     *
     * <p><strong>Code Samples</strong></p>
     * <p>Creates a new EC key with P-384 web key curve. The key activates in one day and expires in one year. Subscribes to the call asynchronously
     * and prints out the newly created ec key details when the callback happens.</p>
     * <pre>
     * ECKeyCreateConfig ecKeyCreateConfig = new ECKeyCreateConfig("keyName", JsonWebKeyType.EC)
     *    .curve(JsonWebKeyCurveName.P_384)
     *    .notBefore(OffsetDateTime.now().plusDays(1))
     *    .expires(OffsetDateTime.now().plusYears(1));
     *
     * keyAsyncClient.createECKey(ecKeyCreateConfig).subscribe(keyResponse ->
     *   System.out.printf("EC Key is created with name %s and id %s \n", keyResponse.value().name(), keyResponse.value().keyId()));
     * </pre>
     *
     * @param ecKeyCreateConfig The key configuration object containing information about the rsa key being created.
     * @throws NullPointerException if {@code rsaKeyCreateConfig} is {@code null}.
     * @throws HttpRequestException if {@code name} is empty string.
     * @return A {@link Mono} containing a {@link Response} whose {@link Response#value() value} contains the {@link Key created key}.
     */
    public Mono<Response<Key>> createECKey(ECKeyCreateConfig ecKeyCreateConfig) {
        KeyRequestParameters parameters = new KeyRequestParameters()
            .kty(ecKeyCreateConfig.keyType())
            .curve(ecKeyCreateConfig.curve())
            .keyOps(ecKeyCreateConfig.keyOperations())
            .keyAttributes(new KeyRequestAttributes(ecKeyCreateConfig));
        return service.createKey(endpoint, ecKeyCreateConfig.name(), API_VERSION, ACCEPT_LANGUAGE, parameters, CONTENT_TYPE_HEADER_VALUE);
    }

    /**
     * Imports an externally created key and stores it in key vault. The import key operation may be used to import any key type
     * into the Azure Key Vault. If the named key already exists, Azure Key Vault creates a new version of the key. This operation requires the {@code keys/import} permission.
     *
     * <p><strong>Code Samples</strong></p>
     * <p>Imports a new key into key vault. Subscribes to the call asynchronously and prints out the newly imported key details
     * when the callback happens.</p>
     * <pre>
     * keyAsyncClient.importKey("keyName", jsonWebKeyToImport).subscribe(keyResponse ->
     *   System.out.printf("Key is imported with name %s and id %s \n", keyResponse.value().name(), keyResponse.value().keyId()));
     * </pre>
     *
     * @param name The name for the imported key.
     * @param keyMaterial The Json web key being imported.
     * @throws HttpRequestException if {@code name} is empty string.
     * @return A {@link Mono} containing a {@link Response} whose {@link Response#value() value} contains the {@link Key imported key}.
     */
    public Mono<Response<Key>> importKey(String name, JsonWebKey keyMaterial){
        KeyImportRequestParameters parameters = new KeyImportRequestParameters().key(keyMaterial);
        return service.importKey(endpoint, name, API_VERSION, ACCEPT_LANGUAGE, parameters, CONTENT_TYPE_HEADER_VALUE);
    }

    /**
     * Imports an externally created key and stores it in key vault. The import key operation may be used to import any key type
     * into the Azure Key Vault. If the named key already exists, Azure Key Vault creates a new version of the key. This operation requires the {@code keys/import} permission.
     *
     * <p>The {@code keyImportConfig} is required and its fields {@link KeyImportConfig#name() name} and {@link KeyImportConfig#keyMaterial() key material} cannot
     * be null. The {@link KeyImportConfig#expires() expires}, {@link KeyImportConfig#contentType() contentType}
     * and {@link KeyImportConfig#notBefore() notBefore} values in {@code keyImportConfig} are optional. If not specified, no values are set for the
     * fields. The {@link KeyImportConfig#enabled() enabled} field is set to true and the {@link KeyImportConfig#hsm() hsm} field is
     * set to false by Azure Key Vault, if they are not specified.</p>
     *
     * <p><strong>Code Samples</strong></p>
     * <p>Imports a new key into key vault. Subscribes to the call asynchronously and prints out the newly imported key details
     * when the callback happens.</p>
     * <pre>
     * KeyImportConfig keyImportConfig = new KeyImportConfig("keyName", jsonWebKeyToImport)
     *   .hsm(true)
     *   .expires(OffsetDateTime.now().plusDays(60));
     *
     * keyAsyncClient.importKey(keyImportConfig).subscribe(keyResponse ->
     *   System.out.printf("Key is imported with name %s and id %s \n", keyResponse.value().name(), keyResponse.value().keyId()));
     * </pre>
     *
     * @param keyImportConfig The key import configuration object containing information about the json web key being imported.
     * @throws NullPointerException if {@code keyImportConfig} is {@code null}.
     * @throws HttpRequestException if {@code name} is empty string.
     * @return A {@link Mono} containing a {@link Response} whose {@link Response#value() value} contains the {@link Key imported key}.
     */
    public Mono<Response<Key>> importKey(KeyImportConfig keyImportConfig) {
        Objects.requireNonNull(keyImportConfig, "The key import configuration parameter cannot be null.");
        KeyImportRequestParameters parameters = new KeyImportRequestParameters()
                .key(keyImportConfig.keyMaterial())
                .hsm(keyImportConfig.hsm())
                .keyAttributes(new KeyRequestAttributes(keyImportConfig));
        return service.importKey(endpoint, keyImportConfig.name(), API_VERSION, ACCEPT_LANGUAGE, parameters, CONTENT_TYPE_HEADER_VALUE);
    }

    /**
     * Gets the public part of the specified key and key version. The get key operation is applicable to all key types and
     * If the requested key is symmetric, then no key material is released in the response. This operation requires the {@code keys/get} permission.
     *
     * <p><strong>Code Samples</strong></p>
     * <p>Gets a specific version of the key in the key vault. Subscribes to the call asynchronously and prints out the
     * returned key details when the callback happens.</p>
     * <pre>
     * String keyVersion = "6A385B124DEF4096AF1361A85B16C204";
     * keyAsyncClient.getKey("keyName", keyVersion).subscribe(keyResponse -&gt;
     *   System.out.printf("Key returned with name %s, id %s and version %s", keyResponse.value().name(),
     *   keyResponse.value().keyId(), keyResponse.value().version()));
     * </pre>
     *
     * @param name The name of the key, cannot be null
     * @param version The version of the key to retrieve. If this is an empty String or null, this call is equivalent to calling {@link KeyAsyncClient#getKey(String)}, with the latest version being retrieved.
     * @throws ResourceNotFoundException when a key with {@code name} and {@code version} doesn't exist in the key vault.
     * @throws HttpRequestException if {@code name} or {@code version} are empty strings.
     * @return A {@link Mono} containing a {@link Response} whose {@link Response#value() value} contains the requested {@link Key key}.
     */
    public Mono<Response<Key>> getKey(String name, String version) {
        String keyVersion = "";
        if(version != null){
            keyVersion = version;
        }
        return service.getKey(endpoint, name, keyVersion, API_VERSION, ACCEPT_LANGUAGE, CONTENT_TYPE_HEADER_VALUE);
    }

    public Mono<Response<KeyVariant>> getKeyVariant(String name) {
        String keyVersion = "";
        return service.getKeyVariant(endpoint, name, keyVersion, API_VERSION, ACCEPT_LANGUAGE, CONTENT_TYPE_HEADER_VALUE);
    }


    /**
     * Get the public part of the latest version of the specified key from the key vault. The get key operation is applicable to all key types and
     * If the requested key is symmetric, then no key material is released in the response. This operation requires the {@code keys/get} permission.
     *
     * <p><strong>Code Samples</strong></p>
     * <p>Gets latest version of the key in the key vault. Subscribes to the call asynchronously and prints out the
     * returned key details when the callback happens.</p>
     * <pre>
     * keyAsyncClient.getKey("keyName").subscribe(keyResponse -&gt;
     *   System.out.printf("Key with name %s, id %s \n", keyResponse.value().name(),
     *   keyResponse.value().keyId()));
     * </pre>
     *
     * @param name The name of the key.
     * @throws ResourceNotFoundException when a key with {@code name} doesn't exist in the key vault.
     * @throws HttpRequestException if {@code name} is empty string.
     * @return A {@link Mono} containing a {@link Response} whose {@link Response#value() value} contains the requested {@link Key key}.
     */
    public Mono<Response<Key>> getKey(String name) {
        return getKey(name, "");
    }


    /**
     * Get public part of the key which represents {@link KeyBase keyBase} from the key vault. If {@link KeyBase#version() version} is not set
     * then the latest version of the key is returned. The get key operation is applicable to all key types and If the requested key is symmetric,
     * then no key material is released in the response. This operation requires the {@code keys/get} permission.
     *
     * <p>The list operations {@link KeyAsyncClient#listKeys()} and {@link KeyAsyncClient#listKeytVersions(String)} return
     * the {@link Flux} containing {@link KeyBase base key} as output excluding the key material of the key.
     * This operation can then be used to get the full key with its key material from {@code keyBase}.</p>
     * <pre>
     * keyAsyncClient.listKeys().subscribe(keyBase -&gt;
     *     client.getKey(keyBase).subscribe(keyResponse -&gt;
     *       System.out.printf("Key with name %s and value %s \n", keyResponse.value().name(), keyResponse.value().keyId())));
     * </pre>
     *
     * @param keyBase The {@link KeyBase base key} holding attributes of the key being requested.
     * @throws ResourceNotFoundException when a key with {@link KeyBase#name() name} and {@link KeyBase#version() version} doesn't exist in the key vault.
     * @throws HttpRequestException if {@link KeyBase#name()}  name} or {@link KeyBase#version() version} are empty strings.
     * @return A {@link Mono} containing a {@link Response} whose {@link Response#value() value} contains the requested {@link Key key}.
     */
    public Mono<Response<Key>> getKey(KeyBase keyBase) {
        Objects.requireNonNull(keyBase, "The Key Base parameter cannot be null.");
        String keyVersion = "";
        return service.getKey(endpoint, keyBase.name(), keyVersion, API_VERSION, ACCEPT_LANGUAGE, CONTENT_TYPE_HEADER_VALUE);
    }

    /**
     * Updates the attributes associated with the specified key, but not the cryptographic key material of the specified key in the key vault. The update
     * operation changes specified attributes of an existing stored key and attributes that are not specified in the request are left unchanged.
     * The cryptographic key material of a key itself cannot be changed. This operation requires the {@code keys/set} permission.
     *
     * <p>The {@code key} is required and its fields {@link KeyBase#name() name} and {@link KeyBase#version() version} cannot be null.</p>
     *
     * <p><strong>Code Samples</strong></p>
     * <p>Gets latest version of the key, changes its notBefore time and then updates it in the Azure Key Vault. Subscribes to the call asynchronously and prints out the
     * returned key details when the callback happens.</p>
     * <pre>
     * keyAsyncClient.getKey("keyName").subscribe(keyResponse -&gt; {
     *     Key key = keyResponse.value();
     *     //Update the not before time of the key.
     *     key.notBefore(OffsetDateTime.now().plusDays(50));
     *     keyAsyncClient.updateKey(key).subscribe(updatedKeyResponse -&gt;
     *         System.out.printf("Key's updated not before time %s \n", updatedKeyResponse.value().notBefore().toString()));
     *   });
     * </pre>
     *
     * @param key The {@link KeyBase base key} object with updated properties.
     * @throws NullPointerException if {@code key} is {@code null}.
     * @throws ResourceNotFoundException when a key with {@link KeyBase#name() name} and {@link KeyBase#version() version} doesn't exist in the key vault.
     * @throws HttpRequestException if {@link KeyBase#name() name} or {@link KeyBase#version() version} are empty strings.
     * @return A {@link Mono} containing a {@link Response} whose {@link Response#value() value} contains the {@link KeyBase updated key}.
     */
    public Mono<Response<Key>> updateKey(KeyBase key) {
        Objects.requireNonNull(key, "The key input parameter cannot be null.");
        KeyRequestParameters parameters = new KeyRequestParameters()
                .tags(key.tags())
                .keyOps(key.keyOperations())
                .keyAttributes(new KeyRequestAttributes(key));

        return service.updateKey(endpoint, key.name(), key.version(), API_VERSION, ACCEPT_LANGUAGE, parameters, CONTENT_TYPE_HEADER_VALUE);
    }

    /**
     * Deletes a key of any type from the key vault. If soft-delete is enabled on the key vault then the key is placed in the deleted state
     * and requires to be purged for permanent deletion else the key is permanently deleted. The delete operation applies to any key stored
     * in Azure Key Vault but it cannot be applied to an individual version of a key. This operation removes the cryptographic material
     * associated with the key, which means the key is not usable for Sign/Verify, Wrap/Unwrap or Encrypt/Decrypt operations. This operation
     * requires the {@code keys/delete} permission.
     *
     * <p><strong>Code Samples</strong></p>
     * <p>Deletes the key in the Azure Key Vault. Subscribes to the call asynchronously and prints out the
     * deleted key details when the callback happens.</p>
     * <pre>
     * keyAsyncClient.deleteKey("keyName").subscribe(deletedKeyResponse -&gt;
     *   System.out.printf("Deleted Key's Recovery Id %s \n", deletedKeyResponse.value().recoveryId()));
     * </pre>
     *
     * @param name The name of the key to be deleted.
     * @throws ResourceNotFoundException when a key with {@code name} doesn't exist in the key vault.
     * @throws HttpRequestException when a key with {@code name} is empty string.
     * @return A {@link Mono} containing a {@link Response} whose {@link Response#value() value} contains the {@link DeletedKey deleted key}.
     */
    public Mono<Response<DeletedKey>> deleteKey(String name) {
        return service.deleteKey(endpoint, name, API_VERSION, ACCEPT_LANGUAGE, CONTENT_TYPE_HEADER_VALUE);
    }

    /**
     * Gets the public part of a deleted key. The Get Deleted Key operation is applicable for soft-delete enabled vaults. This operation
     * requires the {@code keys/get} permission.
     *
     * <p><strong>Code Samples</strong></p>
     * <p> Gets the deleted key from the key vault enabled for soft-delete. Subscribes to the call asynchronously and prints out the
     * deleted key details when the callback happens.</p>
     * <pre>
     * //Assuming key is deleted on a soft-delete enabled vault.
     * keyAsyncClient.getDeletedKey("keyName").subscribe(deletedKeyResponse -&gt;
     *   System.out.printf("Deleted Key with recovery Id %s \n", deletedKeyResponse.value().recoveryId()));
     * </pre>
     *
     * @param name The name of the deleted key.
     * @throws ResourceNotFoundException when a key with {@code name} doesn't exist in the key vault.
     * @throws HttpRequestException when a key with {@code name} is empty string.
     * @return A {@link Mono} containing a {@link Response} whose {@link Response#value() value} contains the {@link DeletedKey deleted key}.
     */
    public Mono<Response<DeletedKey>> getDeletedKey(String name) {
        return service.getDeletedKey(endpoint, name, API_VERSION, ACCEPT_LANGUAGE, CONTENT_TYPE_HEADER_VALUE);
    }

    /**
     * Permanently deletes the specified key without the possibility of recovery. The Purge Deleted Key operation is applicable for
     * soft-delete enabled vaults. This operation requires the {@code keys/purge} permission.
     *
     * <p><strong>Code Samples</strong></p>
     * <p>Purges the deleted key from the key vault enabled for soft-delete. Subscribes to the call asynchronously and prints out the
     * status code from the server response when the callback happens.</p>
     * <pre>
     * //Assuming key is deleted on a soft-delete enabled vault.
     * keyAsyncClient.purgeDeletedKey("deletedKeyName").subscribe(purgeResponse -&gt;
     *   System.out.printf("Purge Status response %rsaPrivateExponent \n", purgeResponse.statusCode()));
     * </pre>
     *
     * @param name The name of the deleted key.
     * @throws ResourceNotFoundException when a key with {@code name} doesn't exist in the key vault.
     * @throws HttpRequestException when a key with {@code name} is empty string.
     * @return A {@link Mono} containing a {@link VoidResponse}.
     */
    public Mono<VoidResponse> purgeDeletedKey(String name) {
        return service.purgeDeletedKey(endpoint, name, API_VERSION, ACCEPT_LANGUAGE, CONTENT_TYPE_HEADER_VALUE);
    }

    /**
     * Recovers the deleted key in the key vault to its latest version and can only be performed on a soft-delete enabled vault. An attempt
     * to recover an non-deleted key will return an error. Consider this the inverse of the delete operation on soft-delete enabled vaults.
     * This operation requires the {@code keys/recover} permission.
     *
     * <p><strong>Code Samples</strong></p>
     * <p>Recovers the deleted key from the key vault enabled for soft-delete. Subscribes to the call asynchronously and prints out the
     * recovered key details when the callback happens.</p>
     * <pre>
     * //Assuming key is deleted on a soft-delete enabled vault.
     * keyAsyncClient.recoverDeletedKey("deletedKeyName").subscribe(recoveredKeyResponse -&gt;
     *   System.out.printf("Recovered Key with name %s \n", recoveredKeyResponse.value().name()));
     * </pre>
     *
     * @param name The name of the deleted key to be recovered.
     * @throws ResourceNotFoundException when a key with {@code name} doesn't exist in the key vault.
     * @throws HttpRequestException when a key with {@code name} is empty string.
     * @return A {@link Mono} containing a {@link Response} whose {@link Response#value() value} contains the {@link Key recovered key}.
     */
    public Mono<Response<Key>> recoverDeletedKey(String name) {
        return service.recoverDeletedKey(endpoint, name, API_VERSION, ACCEPT_LANGUAGE, CONTENT_TYPE_HEADER_VALUE);
    }

    /**
     * Requests a backup of the specified key be downloaded to the client. The Key Backup operation exports a key from Azure Key
     * Vault in a protected form. Note that this operation does NOT return key material in a form that can be used outside the Azure Key
     * Vault system, the returned key material is either protected to a Azure Key Vault HSM or to Azure Key Vault itself. The intent
     * of this operation is to allow a client to generate a key in one Azure Key Vault instance, BACKUP the key, and then RESTORE it
     * into another Azure Key Vault instance. The backup operation may be used to export, in protected form, any key type from Azure
     * Key Vault. Individual versions of a key cannot be backed up. BACKUP / RESTORE can be performed within geographical boundaries only;
     * meaning that a BACKUP from one geographical area cannot be restored to another geographical area. For example, a backup
     * from the US geographical area cannot be restored in an EU geographical area. This operation requires the {@code key/backup} permission.
     *
     *
     * <p><strong>Code Samples</strong></p>
     * <p>Backs up the key from the key vault. Subscribes to the call asynchronously and prints out the
     * length of the key's backup byte array returned in the response.</p>
     * <pre>
     * keyAsyncClient.backupKey("keyName").subscribe(keyBackupResponse -&gt;
     *   System.out.printf("Key's Backup Byte array's length %s \n", keyBackupResponse.value().length));
     * </pre>
     *
     * @param name The name of the key.
     * @throws ResourceNotFoundException when a key with {@code name} doesn't exist in the key vault.
     * @throws HttpRequestException when a key with {@code name} is empty string.
     * @return A {@link Mono} containing a {@link Response} whose {@link Response#value() value} contains the backed up key blob.
     */
    public Mono<Response<byte[]>> backupKey(String name) {
        return service.backupKey(endpoint, name, API_VERSION, ACCEPT_LANGUAGE, CONTENT_TYPE_HEADER_VALUE)
                .flatMap(base64URLResponse ->  Mono.just(new SimpleResponse<byte[]>(base64URLResponse.request(),
                base64URLResponse.statusCode(), base64URLResponse.headers(), base64URLResponse.value().value())));
    }

    /**
     * Restores a backed up key to a vault. Imports a previously backed up key into Azure Key Vault, restoring the key, its key identifier,
     * attributes and access control policies. The RESTORE operation may be used to import a previously backed up key. Individual versions of a
     * key cannot be restored. The key is restored in its entirety with the same key name as it had when it was backed up. If the key name is not
     * available in the target Key Vault, the RESTORE operation will be rejected. While the key name is retained during restore, the final key identifier
     * will change if the key is restored to a different vault. Restore will restore all versions and preserve version identifiers. The RESTORE operation is subject
     * to security constraints: The target Key Vault must be owned by the same Microsoft Azure Subscription as the source Key Vault The user must have RESTORE permission in
     * the target Key Vault. This operation requires the {@code keys/restore} permission.
     *
     * <p><strong>Code Samples</strong></p>
     * <p>Restores the key in the key vault from its backup. Subscribes to the call asynchronously and prints out the restored key
     * details when the callback happens.</p>
     * <pre>
     * //Pass the Key Backup Byte array to the restore operation.
     * keyAsyncClient.restoreKey(keyBackupByteArray).subscribe(keyResponse -&gt;
     *   System.out.printf("Restored Key with name %s and id %s \n", keyResponse.value().name(), keyResponse.value().keyId()));
     * </pre>
     *
     * @param backup The backup blob associated with the key.
     * @throws ResourceModifiedException when {@code backup} blob is malformed.
     * @return A {@link Mono} containing a {@link Response} whose {@link Response#value() value} contains the {@link Key restored key}.
     */
    public Mono<Response<Key>> restoreKey(byte[] backup) {
        KeyRestoreRequestParameters parameters = new KeyRestoreRequestParameters().keyBackup(backup);
        return service.restoreKey(endpoint, API_VERSION, parameters, ACCEPT_LANGUAGE, CONTENT_TYPE_HEADER_VALUE);
    }

    /**
     * List keys in the key vault. Retrieves a list of the keys in the Key Vault as JSON Web Key structures that contain the public
     * part of a stored key. The List operation is applicable to all key types and the individual key response in the flux is represented by {@link KeyBase} as only the base key identifier,
     * attributes and tags are provided in the response. The key material and individual key versions are not listed in the response. This operation requires the {@code keys/list} permission.
     *
     * <p>It is possible to get full keys with key material from this information. Convert the {@link Flux} containing {@link KeyBase base key} to
     * {@link Flux} containing {@link Key key} using {@link KeyAsyncClient#getKey(KeyBase baseKey)} within {@link Flux#flatMap(Function)}.</p>
     * <pre>
     * Flux&lt;Key&gt; keys = keyAsyncClient.listKeys()
     *   .flatMap(keyAsyncClient::getKey)
     *   .map(Response::value);
     * </pre>
     *
     * @return A {@link Flux} containing {@link KeyBase key} of all the keys in the vault.
     */
    public Flux<KeyBase> listKeys() {
        return service.getKeys(endpoint, DEFAULT_MAX_PAGE_RESULTS, API_VERSION, ACCEPT_LANGUAGE, CONTENT_TYPE_HEADER_VALUE).flatMapMany(this::extractAndFetchKeys);
    }

    /**
     * Lists {@link DeletedKey deleted keys} of the key vault. The deleted keys are retrieved as JSON Web Key structures
     * that contain the public part of a deleted key. The Get Deleted Keys operation is applicable for vaults enabled
     * for soft-delete. This operation requires the {@code keys/list} permission.
     *
     * <p><strong>Code Samples</strong></p>
     * <p>Lists the deleted keys in the key vault. Subscribes to the call asynchronously and prints out the
     * recovery id of each deleted key when the callback happens.</p>
     * <pre>
     * keyAsyncClient.listDeletedKeys().subscribe(deletedKey -&gt;
     *   System.out.printf("Deleted key's recovery Id %s \n", deletedKey.recoveryId()));
     * </pre>
     *
     * @return A {@link Flux} containing all of the {@link DeletedKey deleted keys} in the vault.
     */
    public Flux<DeletedKey> listDeletedKeys() {
        return service.getDeletedKeys(endpoint, DEFAULT_MAX_PAGE_RESULTS, API_VERSION, ACCEPT_LANGUAGE, CONTENT_TYPE_HEADER_VALUE).flatMapMany(this::extractAndFetchDeletedKeys);
    }

    /**
     * List all versions of the specified key. The individual key response in the flux is represented by {@link KeyBase}
     * as only the base key identifier, attributes and tags are provided in the response. The key material values are
     * not provided in the response. This operation requires the {@code keys/list} permission.
     *
     * <p>It is possible to get the keys with key material of all the versions from this information. Convert the {@link Flux}
     * containing {@link KeyBase base key} to {@link Flux} containing {@link Key key} using
     * {@link KeyAsyncClient#getKey(KeyBase baseKey)} within {@link Flux#flatMap(Function)}.</p>
     * <pre>
     * Flux&lt;Key&gt; keys = keyAsyncClient.listKeyVersions("keyName")
     *   .flatMap(keyAsyncClient::getKey)
     *   .map(Response::value);
     * </pre>
     *
     * @param name The name of the key.
     * @throws ResourceNotFoundException when a key with {@code name} doesn't exist in the key vault.
     * @throws HttpRequestException when a key with {@code name} is empty string.
     * @return A {@link Flux} containing {@link KeyBase key} of all the versions of the specified key in the vault. Flux is empty if key with {@code name} does not exist in key vault.
     */
    public Flux<KeyBase> listKeytVersions(String name) {
        return service.getKeyVersions(endpoint, name, DEFAULT_MAX_PAGE_RESULTS, API_VERSION, ACCEPT_LANGUAGE, CONTENT_TYPE_HEADER_VALUE).flatMapMany(this::extractAndFetchKeys);
    }

    /**
     * Gets attributes of all the keys given by the {@code nextPageLink} that was retrieved from a call to
     * {@link KeyAsyncClient#listKeys()}.
     *
     * @param nextPageLink The {@link KeyBasePage#nextLink()} from a previous, successful call to one of the list operations.
     * @return A stream of {@link KeyBase key} from the next page of results.
     */
    private Flux<KeyBase> listKeysNext(String nextPageLink) {
        return service.getKeys(endpoint, nextPageLink, ACCEPT_LANGUAGE, CONTENT_TYPE_HEADER_VALUE).flatMapMany(this::extractAndFetchKeys);
    }

    private Publisher<KeyBase> extractAndFetchKeys(PagedResponse<KeyBase> page) {
        return extractAndFetch(page, this::listKeysNext);
    }

    /**
     * Gets attributes of all the keys given by the {@code nextPageLink} that was retrieved from a call to
     * {@link KeyAsyncClient#listDeletedKeys()}.
     *
     * @param nextPageLink The {@link DeletedKeyPage#nextLink()} from a previous, successful call to one of the list operations.
     * @return A stream of {@link KeyBase key} from the next page of results.
     */
    private Flux<DeletedKey> listDeletedKeysNext(String nextPageLink) {
        return service.getDeletedKeys(endpoint, nextPageLink, ACCEPT_LANGUAGE, CONTENT_TYPE_HEADER_VALUE).flatMapMany(this::extractAndFetchDeletedKeys);
    }

    private Publisher<DeletedKey> extractAndFetchDeletedKeys(PagedResponse<DeletedKey> page) {
        return extractAndFetch(page, this::listDeletedKeysNext);
    }

    //TODO: Extract this in azure-core ImplUtils and use from there
    private <T> Publisher<T> extractAndFetch(PagedResponse<T> page, Function<String, Publisher<T>> content) {
        String nextPageLink = page.nextLink();
        if (nextPageLink == null) {
            return Flux.fromIterable(page.items());
        }
        return Flux.fromIterable(page.items()).concatWith(content.apply(nextPageLink));
    }
}

