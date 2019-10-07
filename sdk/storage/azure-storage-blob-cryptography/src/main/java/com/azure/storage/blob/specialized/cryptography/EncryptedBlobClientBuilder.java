// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob.specialized.cryptography;

import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.cryptography.AsyncKeyEncryptionKey;
import com.azure.core.cryptography.AsyncKeyEncryptionKeyResolver;
import com.azure.security.keyvault.keys.cryptography.models.KeyWrapAlgorithm;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.util.logging.ClientLogger;
import com.azure.storage.blob.BaseBlobClientBuilder;
import com.azure.storage.blob.BlobURLParts;
import com.azure.storage.blob.implementation.AzureBlobStorageBuilder;
import com.azure.storage.blob.implementation.AzureBlobStorageImpl;
import com.azure.storage.blob.models.CustomerProvidedKey;
import com.azure.storage.blob.specialized.BlockBlobAsyncClient;
import com.azure.storage.blob.specialized.BlockBlobClient;
import com.azure.storage.common.credentials.SASTokenCredential;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Objects;

/**
 * This class provides a fluent builder API to help aid the configuration and instantiation of Storage Blob clients.
 *
 * <p>
 * The following information must be provided on this builder:
 *
 * <ul>
 * <li>the endpoint through {@code .endpoint()}, including the container name and blob name, in the format of
 * {@code https://{accountName}.blob.core.windows.net/{containerName}/{blobName}}.
 * <li>if the container and blob name are not specified, they must be specified through {@code .blobName90} and
 * {@code .containerName()}.
 * <li>the credential through {@code .credential()} or {@code .connectionString()} if the container is not publicly
 * accessible.
 * <li>the key and key wrapping algorithm (for encryption) and/or key resolver (for decryption) must be specified
 * through {@code .key()} and {@code .keyResolver()}
 * </ul>
 *
 * <p>
 * Once all the configurations are set on this builder use the following mapping to construct the given client:
 * <ul>
 * <li>{@link EncryptedBlobClientBuilder#buildEncryptedBlockBlobClient()} - {@link EncryptedBlockBlobClient}</li>
 * <li>{@link EncryptedBlobClientBuilder#buildEncryptedBlockBlobClient(BlockBlobClient)} -
 * {@link EncryptedBlockBlobClient}</li>
 * <li>{@link EncryptedBlobClientBuilder#buildEncryptedBlockBlobAsyncClient()} -
 * {@link EncryptedBlockBlobAsyncClient}</li>
 * <li>{@link EncryptedBlobClientBuilder#buildEncryptedBlockBlobAsyncClient(BlockBlobAsyncClient)} -
 * {@link EncryptedBlockBlobAsyncClient}</li>
 * </ul>
 */
@ServiceClientBuilder(serviceClients = {EncryptedBlockBlobAsyncClient.class, EncryptedBlockBlobClient.class})
public final class EncryptedBlobClientBuilder extends BaseBlobClientBuilder<EncryptedBlobClientBuilder> {

    private final ClientLogger logger = new ClientLogger(EncryptedBlobClientBuilder.class);

    private String containerName;
    private String blobName;
    private String snapshot;

    private AsyncKeyEncryptionKey keyWrapper;
    private AsyncKeyEncryptionKeyResolver keyResolver;
    private KeyWrapAlgorithm keyWrapAlgorithm;

    /**
     * Creates a new instance of the EncryptedBlobClientBuilder
     */
    public EncryptedBlobClientBuilder() {
    }

    private AzureBlobStorageImpl constructImpl() {
        Objects.requireNonNull(containerName);
        Objects.requireNonNull(blobName);

        checkValidEncryptionParameters();

        HttpPipeline pipeline = super.getPipeline();
        if (pipeline == null) {
            pipeline = buildPipeline();
        }

        return new AzureBlobStorageBuilder()
            .url(String.format("%s/%s/%s", endpoint, containerName, blobName))
            .pipeline(pipeline)
            .build();
    }

    /**
     * Creates an {@code EncryptedBlockBlobAsyncClient} from a {@code BlockBlobAsyncClient}.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * {@codesnippet com.azure.storage.blob.specialized.cryptography.EncryptedBlobClientBuilder.buildEncryptedBlockBlobAsyncClient#blockblobasyncclient}
     *
     * @param client The client to convert.
     * @return The encrypted client.
     */
    public EncryptedBlockBlobAsyncClient buildEncryptedBlockBlobAsyncClient(BlockBlobAsyncClient client) {

        checkValidEncryptionParameters();

        AzureBlobStorageImpl impl = new AzureBlobStorageBuilder()
            .url(client.getBlobUrl())
            .pipeline(addDecryptionPolicy(client.getHttpPipeline(),
                client.getHttpPipeline().getHttpClient()))
            .build();

        return new EncryptedBlockBlobAsyncClient(impl, client.getSnapshotId(), this.keyWrapper, this.keyWrapAlgorithm);
    }

    /**
     * Creates an {@code EncryptedBlockBlobClient} from a {@code BlockBlobClient}.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * {@codesnippet com.azure.storage.blob.specialized.cryptography.EncryptedBlobClientBuilder.buildEncryptedBlockBlobClient#blockblobclient}
     *
     * @param client The client to convert.
     * @return The encrypted client.
     */
    public EncryptedBlockBlobClient buildEncryptedBlockBlobClient(BlockBlobClient client) {

        checkValidEncryptionParameters();

        AzureBlobStorageImpl impl = new AzureBlobStorageBuilder()
            .url(client.getBlobUrl())
            .pipeline(addDecryptionPolicy(client.getHttpPipeline(),
                client.getHttpPipeline().getHttpClient()))
            .build();

        return new EncryptedBlockBlobClient(
            new EncryptedBlockBlobAsyncClient(impl, client.getSnapshotId(), this.keyWrapper, this.keyWrapAlgorithm));
    }

    /**
     * Creates a {@link EncryptedBlockBlobClient} based on options set in the Builder.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * {@codesnippet com.azure.storage.blob.specialized.cryptography.EncryptedBlobClientBuilder.buildEncryptedBlockBlobAsyncClient}
     *
     * @return a {@link EncryptedBlockBlobClient} created from the configurations in this builder.
     * @throws NullPointerException If {@code endpoint}, {@code containerName}, or {@code blobName} is {@code null}.
     */
    public EncryptedBlockBlobClient buildEncryptedBlockBlobClient() {
        return new EncryptedBlockBlobClient(buildEncryptedBlockBlobAsyncClient());
    }

    /**
     * Creates a {@link EncryptedBlockBlobAsyncClient} based on options set in the Builder.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * {@codesnippet com.azure.storage.blob.specialized.cryptography.EncryptedBlobClientBuilder.buildEncryptedBlockBlobClient}
     *
     * @return a {@link EncryptedBlockBlobAsyncClient} created from the configurations in this builder.
     * @throws NullPointerException If {@code endpoint}, {@code containerName}, or {@code blobName} is {@code null}.
     */
    public EncryptedBlockBlobAsyncClient buildEncryptedBlockBlobAsyncClient() {
        return new EncryptedBlockBlobAsyncClient(constructImpl(), snapshot,
            this.keyWrapper, this.keyWrapAlgorithm);
    }

    /**
     * Sets the service endpoint, additionally parses it for information (SAS token, container name, blob name)
     * @param endpoint URL of the service
     * @return the updated BlobClientBuilder object
     * @throws IllegalArgumentException If {@code endpoint} is {@code null} or is a malformed URL.
     */
    @Override
    public EncryptedBlobClientBuilder endpoint(String endpoint) {
        try {
            URL url = new URL(endpoint);
            BlobURLParts parts = BlobURLParts.parse(url);

            this.endpoint = parts.getScheme() + "://" + parts.getHost();
            this.containerName = parts.getBlobContainerName();
            this.blobName = parts.getBlobName();
            this.snapshot = parts.getSnapshot();

            SASTokenCredential sasTokenCredential =
                SASTokenCredential.fromSASTokenString(parts.getSasQueryParameters().encode());
            if (sasTokenCredential != null) {
                super.credential(sasTokenCredential);
            }
        } catch (MalformedURLException ex) {
            throw logger.logExceptionAsError(
                new IllegalArgumentException("The Azure Storage Blob endpoint url is malformed."));
        }
        return this;
    }

    @Override
    protected void addOptionalEncryptionPolicy(List<HttpPipelinePolicy> policies) {
        BlobDecryptionPolicy decryptionPolicy = new BlobDecryptionPolicy(keyWrapper, keyResolver);
        policies.add(decryptionPolicy);
    }

    /**
     * Sets the name of the container this client is connecting to.
     * @param containerName the name of the container
     * @return the updated EncryptedBlobClientBuilder  object
     * @throws NullPointerException If {@code containerName} is {@code null}
     */
    public EncryptedBlobClientBuilder containerName(String containerName) {
        this.containerName = Objects.requireNonNull(containerName);
        return this;
    }

    /**
     * Sets the name of the blob this client is connecting to.
     *
     * @param blobName the name of the blob
     * @return the updated EncryptedBlobClientBuilder object
     * @throws NullPointerException If {@code blobName} is {@code null}
     */
    public EncryptedBlobClientBuilder blobName(String blobName) {
        this.blobName = Objects.requireNonNull(blobName);
        return this;
    }

    /**
     * Sets the snapshot of the blob this client is connecting to.
     *
     * @param snapshot the snapshot identifier for the blob
     * @return the updated EncryptedBlobClientBuilder object
     */
    public EncryptedBlobClientBuilder snapshot(String snapshot) {
        this.snapshot = snapshot;
        return this;
    }

    /**
     * Sets the customer provided key for a Storage Builder. This will not work for an Encrypted Client
     * since they are not compatible functions.
     *
     * @param key The customer provided key
     * @return the updated EncryptedBlobClientBuilder object
     * @throws UnsupportedOperationException Since customer provided key and client side encryption
     * are different functions
     */
    @Override
    public EncryptedBlobClientBuilder customerProvidedKey(CustomerProvidedKey key) {
        throw logger.logExceptionAsError(new UnsupportedOperationException("Customer Provided Key "
            + "and Encryption are not compatible"));
    }

    /**
     * Sets the encryption key parameters for the client
     *
     * @param key An object of type {@link AsyncKeyEncryptionKey} that is used to wrap/unwrap the content encryption key
     * @param keyWrapAlgorithm The {@link KeyWrapAlgorithm} used to wrap the key.
     * @return the updated EncryptedBlobClientBuilder object
     */
    public EncryptedBlobClientBuilder key(AsyncKeyEncryptionKey key, KeyWrapAlgorithm keyWrapAlgorithm) {
        this.keyWrapper = key;
        this.keyWrapAlgorithm = keyWrapAlgorithm;
        return this;
    }

    /**
     * Sets the encryption parameters for this client
     *
     * @param keyResolver The key resolver used to select the correct key for decrypting existing blobs.
     * @return the updated EncryptedBlobClientBuilder object
     */
    public EncryptedBlobClientBuilder keyResolver(AsyncKeyEncryptionKeyResolver keyResolver) {
        this.keyResolver = keyResolver;
        return this;
    }

    private void checkValidEncryptionParameters() {
        // Check that key and key wrapper are not both null.
        if (this.keyWrapper == null && this.keyResolver == null) {
            throw logger.logExceptionAsError(new IllegalArgumentException("Key and KeyResolver cannot both be null"));
        }
        // If the key is provided, ensure the key wrap algorithm is also provided.
        if (this.keyWrapper != null && this.keyWrapAlgorithm == null) {
            throw logger.logExceptionAsError(new IllegalArgumentException("Key Wrap Algorithm must be specified with "
                + "the Key."));
        }
    }

    @Override
    protected Class<EncryptedBlobClientBuilder> getClazz() {
        return EncryptedBlobClientBuilder.class;
    }

    private HttpPipeline addDecryptionPolicy(HttpPipeline originalPipeline, HttpClient client) {
        HttpPipelinePolicy[] policies = new HttpPipelinePolicy[originalPipeline.getPolicyCount() + 1];
        policies[0] = new BlobDecryptionPolicy(keyWrapper, keyResolver);
        for (int i = 0; i < originalPipeline.getPolicyCount(); i++) {
            policies[i + 1] = originalPipeline.getPolicy(i);
        }
        return new HttpPipelineBuilder()
            .httpClient(client)
            .policies(policies)
            .build();
    }
}
