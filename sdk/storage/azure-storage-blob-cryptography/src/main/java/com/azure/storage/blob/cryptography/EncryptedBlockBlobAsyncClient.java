// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob.cryptography;

import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.implementation.util.FluxUtil;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.storage.blob.BlobAsyncClient;
import com.azure.storage.blob.BlockBlobAsyncClient;
import com.azure.storage.blob.implementation.AzureBlobStorageImpl;
import com.azure.storage.blob.models.AccessTier;
import com.azure.storage.blob.models.BlobAccessConditions;
import com.azure.storage.blob.models.BlobHTTPHeaders;
import com.azure.storage.blob.models.BlockBlobItem;
import com.azure.storage.blob.models.Metadata;
import com.azure.storage.common.Constants;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Objects;

import static com.azure.core.implementation.util.FluxUtil.withContext;
import static com.azure.storage.blob.PostProcessor.postProcessResponse;

public class EncryptedBlockBlobAsyncClient extends BlobAsyncClient {

    static final int BLOB_DEFAULT_UPLOAD_BLOCK_SIZE = 4 * Constants.MB;
    private static final int BLOB_MAX_UPLOAD_BLOCK_SIZE = 100 * Constants.MB;
    private final ClientLogger logger = new ClientLogger(EncryptedBlockBlobAsyncClient.class);

    private final BlobEncryptionPolicy encryptionPolicy;

    private final BlockBlobAsyncClient regularClient;

    /**
     * Package-private constructor for use by {@link EncryptedBlobClientBuilder}.
     */
    EncryptedBlockBlobAsyncClient(AzureBlobStorageImpl constructImpl, String snapshot,
        BlobEncryptionPolicy encryptionPolicy, BlockBlobAsyncClient client) {
        super(constructImpl, snapshot, null);
        this.encryptionPolicy = encryptionPolicy;
        this.regularClient = client;
    }

    public BlockBlobAsyncClient getBlockBlobAsyncClient() {
        return regularClient;
    }

    static HttpPipeline removeDecryptionPolicy(HttpPipeline originalPipeline, HttpClient client) {
        HttpPipelinePolicy[] policies = new HttpPipelinePolicy[originalPipeline.getPolicyCount() - 1];
        int index = 0;
        for (int i = 0; i < originalPipeline.getPolicyCount(); i++) {
            if (!(originalPipeline.getPolicy(i) instanceof BlobDecryptionPolicy)) {
                policies[index] = originalPipeline.getPolicy(i);
            } else {
                index--;
            }
            index++;
        }
        return new HttpPipelineBuilder()
            .httpClient(client)
            .policies(policies)
            .build();
    }

    /**
     * Creates a new block blob, or updates the content of an existing block blob. Updating an existing block blob
     * overwrites any existing metadata on the blob. Partial updates are not supported with PutBlob; the content of the
     * existing blob is overwritten with the new content. To perform a partial update of a block blob's, use PutBlock
     * and PutBlockList on a regular BlockBlob. For more information, see the
     * <a href="https://docs.microsoft.com/rest/api/storageservices/put-blob">Azure Docs</a>.
     * <p>
     * Note that the data passed must be replayable if retries are enabled (the default). In other words, the
     * {@code Flux} must produce the same data each time it is subscribed to.
     * <p>
     *
     * <p><strong>Code Samples</strong></p>
     *
     * {@codesnippet com.azure.storage.blob.cryptography.EncryptedBlockBlobAsyncClient.upload#Flux-long}
     *
     * @param data The data to write to the blob. Note that this {@code Flux} must be replayable if retries are enabled
     * (the default). In other words, the Flux must produce the same data each time it is subscribed to.
     * @param length The exact length of the data. It is important that this value match precisely the length of the
     * data emitted by the {@code Flux}.
     * @return A reactive response containing the information of the uploaded block blob.
     */
    public Mono<BlockBlobItem> upload(Flux<ByteBuffer> data, long length) {
        return uploadWithResponse(data, length, null, null, null, null).flatMap(FluxUtil::toMono);
    }

    /**
     * Creates a new block blob, or updates the content of an existing block blob.
     * <p>
     * Updating an existing block blob overwrites any existing metadata on the blob. Partial updates are not supported
     * with PutBlob; the content of the existing blob is overwritten with the new content. To perform a partial update
     * of a block blob's, use PutBlock and PutBlockList on a regular BlockBlob. For more information, see the
     * <a href="https://docs.microsoft.com/rest/api/storageservices/put-blob">Azure Docs</a>.
     * <p>
     * Note that the data passed must be replayable if retries are enabled (the default). In other words, the
     * {@code Flux} must produce the same data each time it is subscribed to.
     * <p>
     *
     * <p><strong>Code Samples</strong></p>
     *
     * {@codesnippet com.azure.storage.blob.cryptography.EncryptedBlockBlobAsyncClient.uploadWithResponse#Flux-long-BlobHTTPHeaders-Metadata-AccessTier-BlobAccessConditions}
     *
     * @param data The data to write to the blob. Note that this {@code Flux} must be replayable if retries are enabled
     * (the default). In other words, the Flux must produce the same data each time it is subscribed to.
     * @param length The exact length of the data. It is important that this value match precisely the length of the
     * data emitted by the {@code Flux}.
     * @param headers {@link BlobHTTPHeaders}
     * @param metadata {@link Metadata}
     * @param tier {@link AccessTier} for the destination blob.
     * @param accessConditions {@link BlobAccessConditions}
     * @return A reactive response containing the information of the uploaded block blob.
     */
    // NOTE: the rest of the APIs funnel into the regular client
    public Mono<Response<BlockBlobItem>> uploadWithResponse(Flux<ByteBuffer> data, long length, BlobHTTPHeaders headers,
        Metadata metadata, AccessTier tier, BlobAccessConditions accessConditions) {
        return withContext(context -> uploadWithResponse(data, length, headers, metadata, tier, accessConditions,
            context));
    }

    Mono<Response<BlockBlobItem>> uploadWithResponse(Flux<ByteBuffer> data, long length, BlobHTTPHeaders headers,
        Metadata metadata, AccessTier tier, BlobAccessConditions accessConditions, Context context) {
        final Metadata metadataFinal = metadata == null ? new Metadata() : metadata;
        final BlobAccessConditions accessConditionsFinal = accessConditions == null ? new BlobAccessConditions()
            : accessConditions;
        Mono<Flux<ByteBuffer>> dataFinal = encryptionPolicy.prepareToSendEncryptedRequest(data, metadataFinal);
        // Readjust the length to account for padding.
        long lengthFinal =  length + (16 - length % 16);

        return dataFinal.flatMap(df ->
            postProcessResponse(this.azureBlobStorage.blockBlobs().uploadWithRestResponseAsync(null, null, df,
                lengthFinal, null, metadataFinal, tier, null, headers,
                accessConditionsFinal.getLeaseAccessConditions(), null /*cpk*/,
                accessConditionsFinal.getModifiedAccessConditions(), context))
                .map(rb -> new SimpleResponse<>(rb, new BlockBlobItem(rb.getDeserializedHeaders()))));
    }

    /**
     * Creates a new block blob, or updates the content of an existing block blob.
     * <p>
     * Updating an existing block blob overwrites any existing metadata on the blob. Partial updates are not supported
     * with this method; the content of the existing blob is overwritten with the new content. To perform a partial
     * update of a block blob's, use {@link BlockBlobAsyncClient#stageBlock(String, Flux, long) stageBlock} and {@link
     * BlockBlobAsyncClient#commitBlockList(List)}. For more information, see the
     * <a href="https://docs.microsoft.com/rest/api/storageservices/put-block">Azure Docs for Put Block</a> and the
     * <a href="https://docs.microsoft.com/rest/api/storageservices/put-block-list">Azure Docs for Put Block List</a>.
     * <p>
     * The data passed need not support multiple subscriptions/be replayable as is required in other upload methods when
     * retries are enabled, and the length of the data need not be known in advance. Therefore, this method should
     * support uploading any arbitrary data source, including network streams. This behavior is possible because this
     * method will perform some internal buffering as configured by the blockSize and numBuffers parameters, so while
     * this method may offer additional convenience, it will not be as performant as other options, which should be
     * preferred when possible.
     * <p>
     * Typically, the greater the number of buffers used, the greater the possible parallelism when transferring the
     * data. Larger buffers means we will have to stage fewer blocks and therefore require fewer IO operations. The
     * trade-offs between these values are context-dependent, so some experimentation may be required to optimize inputs
     * for a given scenario.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * {@codesnippet com.azure.storage.blob.cryptography.EncryptedBlockBlobAsyncClient.upload#Flux-int-int}
     *
     * @param data The data to write to the blob. Unlike other upload methods, this method does not require that the
     * {@code Flux} be replayable. In other words, it does not have to support multiple subscribers and is not expected
     * to produce the same values across subscriptions.
     * @param blockSize The size of each block that will be staged. This value also determines the size that each buffer
     * used by this method will be and determines the number of requests that need to be made. The amount of memory
     * consumed by this method may be up to blockSize * numBuffers. If block size is large, this method will make fewer
     * network calls, but each individual call will send more data and will therefore take longer.
     * @param numBuffers The maximum number of buffers this method should allocate. Must be at least two. Typically, the
     * larger the number of buffers, the more parallel, and thus faster, the upload portion of this operation will be.
     * The amount of memory consumed by this method may be up to blockSize * numBuffers.
     * @return A reactive response containing the information of the uploaded block blob.
     */
    public Mono<BlockBlobItem> upload(Flux<ByteBuffer> data, int blockSize, int numBuffers) {
        return this.uploadWithResponse(data, blockSize, numBuffers, null, null, null, null).flatMap(FluxUtil::toMono);
    }

    /**
     * Creates a new block blob, or updates the content of an existing block blob. Updating an existing block blob
     * overwrites any existing metadata on the blob. Partial updates are not supported with this method; the content of
     * the existing blob is overwritten with the new content. To perform a partial update of a block blob's, use {@link
     * BlockBlobAsyncClient#stageBlock(String, Flux, long) stageBlock} and
     * {@link BlockBlobAsyncClient#commitBlockList(List)}, which this method uses internally. For more information,
     * see the <a href="https://docs.microsoft.com/rest/api/storageservices/put-block">Azure Docs for Put Block</a> and
     * the <a href="https://docs.microsoft.com/rest/api/storageservices/put-block-list">Azure Docs for Put Block List</a>.
     * <p>
     * The data passed need not support multiple subscriptions/be replayable as is required in other upload methods when
     * retries are enabled, and the length of the data need not be known in advance. Therefore, this method should
     * support uploading any arbitrary data source, including network streams. This behavior is possible because this
     * method will perform some internal buffering as configured by the blockSize and numBuffers parameters, so while
     * this method may offer additional convenience, it will not be as performant as other options, which should be
     * preferred when possible.
     * <p>
     * Typically, the greater the number of buffers used, the greater the possible parallelism when transferring the
     * data. Larger buffers means we will have to stage fewer blocks and therefore require fewer IO operations. The
     * trade-offs between these values are context-dependent, so some experimentation may be required to optimize inputs
     * for a given scenario.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * {@codesnippet com.azure.storage.blob.cryptography.EncryptedBlockBlobAsyncClient.uploadWithResponse#Flux-int-int-BlobHTTPHeaders-Metadata-AccessTier-BlobAccessConditions}
     *
     * @param data The data to write to the blob. Unlike other upload methods, this method does not require that the
     * {@code Flux} be replayable. In other words, it does not have to support multiple subscribers and is not expected
     * to produce the same values across subscriptions.
     * @param blockSize The size of each block that will be staged. This value also determines the size that each buffer
     * used by this method will be and determines the number of requests that need to be made. The amount of memory
     * consumed by this method may be up to blockSize * numBuffers. If block size is large, this method will make fewer
     * network calls, but each individual call will send more data and will therefore take longer.
     * @param numBuffers The maximum number of buffers this method should allocate. Must be at least two. Typically, the
     * larger the number of buffers, the more parallel, and thus faster, the upload portion of this operation will be.
     * The amount of memory consumed by this method may be up to blockSize * numBuffers.
     * @param headers {@link BlobHTTPHeaders}
     * @param metadata {@link Metadata}
     * @param tier {@link AccessTier} for the destination blob.
     * @param accessConditions {@link BlobAccessConditions}
     * @return A reactive response containing the information of the uploaded block blob.
     */
    public Mono<Response<BlockBlobItem>> uploadWithResponse(Flux<ByteBuffer> data, int blockSize, int numBuffers,
        BlobHTTPHeaders headers, Metadata metadata, AccessTier tier, BlobAccessConditions accessConditions) {
        Objects.requireNonNull(data, "data must not be null");
        final Metadata metadataFinal = metadata == null ? new Metadata() : metadata;
        Mono<Flux<ByteBuffer>> dataFinal = encryptionPolicy.prepareToSendEncryptedRequest(data, metadataFinal);

        return dataFinal.flatMap(df ->
            regularClient.uploadWithResponse(df, blockSize, numBuffers, headers, metadataFinal, tier, accessConditions)
        );
    }

    /**
     * Creates a new block blob, or updates the content of an existing block blob, with the content of the specified
     * file.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * {@codesnippet com.azure.storage.blob.cryptography.EncryptedBlockBlobAsyncClient.uploadFromFile#String}
     *
     * @param filePath Path to the upload file
     * @return An empty response
     */
    public Mono<Void> uploadFromFile(String filePath) {
        return uploadFromFile(filePath, BLOB_DEFAULT_UPLOAD_BLOCK_SIZE, null, null, null, null);
    }

//    /**
//     * Creates a new block blob, or updates the content of an existing block blob, with the content of the specified
//     * file.
//     *
//     * <p><strong>Code Samples</strong></p>
//     *
//     * {@codesnippet com.azure.storage.blob.cryptography.EncryptedBlockBlobAsyncClient.uploadFromFile#String-Integer-BlobHTTPHeaders-Metadata-AccessTier-BlobAccessConditions}
//     *
//     * @param filePath Path to the upload file
//     * @param blockSize Size of the blocks to upload
//     * @param headers {@link BlobHTTPHeaders}
//     * @param metadata {@link Metadata}
//     * @param tier {@link AccessTier} for the destination blob.
//     * @param accessConditions {@link BlobAccessConditions}
//     * @return An empty response
//     * @throws IllegalArgumentException If {@code blockSize} is less than 0 or greater than 100MB
//     * @throws UncheckedIOException If an I/O error occurs
//     */
//    public Mono<Void> uploadFromFile(String filePath, Integer blockSize, BlobHTTPHeaders headers, Metadata metadata,
//        AccessTier tier, BlobAccessConditions accessConditions) {
//        if (blockSize < 0 || blockSize > BLOB_MAX_UPLOAD_BLOCK_SIZE) {
//            throw logger.logExceptionAsError(new IllegalArgumentException("Block size should not exceed 100MB"));
//        }
//        Metadata metadataFinal = metadata == null ? new Metadata() : metadata;
//
//        return Mono.using(() -> uploadFileResourceSupplier(filePath),
//            channel -> this.uploadWithResponse(FluxUtil.readFile(channel), blockSize, 2, headers, metadataFinal, tier,
//                accessConditions)
//                .then()
//                .doOnTerminate(() -> {
//                    try {
//                        channel.close();
//                    } catch (IOException e) {
//                        throw logger.logExceptionAsError(new UncheckedIOException(e));
//                    }
//                }), this::uploadFileCleanup);
//    }
//
//    private AsynchronousFileChannel uploadFileResourceSupplier(String filePath) {
//        try {
//            return AsynchronousFileChannel.open(Paths.get(filePath), StandardOpenOption.READ);
//        } catch (IOException e) {
//            throw logger.logExceptionAsError(new UncheckedIOException(e));
//        }
//    }
//
//    private void uploadFileCleanup(AsynchronousFileChannel channel) {
//        try {
//            channel.close();
//        } catch (IOException e) {
//            throw logger.logExceptionAsError(new UncheckedIOException(e));
//        }
//    }

    /**
     * Creates a new block blob, or updates the content of an existing block blob, with the content of the specified
     * file.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * {@codesnippet com.azure.storage.blob.specialized.BlockBlobAsyncClient.uploadFromFile#String-Integer-BlobHTTPHeaders-Metadata-AccessTier-BlobAccessConditions}
     *
     * @param filePath Path to the upload file
     * @param blockSize Size of the blocks to upload
     * @param headers {@link BlobHTTPHeaders}
     * @param metadata {@link Metadata}
     * @param tier {@link AccessTier} for the destination blob.
     * @param accessConditions {@link BlobAccessConditions}
     * @return An empty response
     * @throws IllegalArgumentException If {@code blockSize} is less than 0 or greater than 100MB
     * @throws UncheckedIOException If an I/O error occurs
     */
    public Mono<Void> uploadFromFile(String filePath, Integer blockSize, BlobHTTPHeaders headers, Metadata metadata,
        AccessTier tier, BlobAccessConditions accessConditions) {
        int sliceBlockSize;
        if (blockSize == null) {
            sliceBlockSize = BLOB_DEFAULT_UPLOAD_BLOCK_SIZE;
        } else if (blockSize < 0 || blockSize > BLOB_MAX_UPLOAD_BLOCK_SIZE) {
            throw logger.logExceptionAsError(new IllegalArgumentException("Block size should not exceed 100MB"));
        } else {
            sliceBlockSize = blockSize;
        }
        Metadata metadataFinal = metadata == null ? new Metadata() : metadata;

        return Mono.using(() -> uploadFileResourceSupplier(filePath),
            channel -> this.uploadWithResponse(FluxUtil.readFile(channel), sliceBlockSize, 2, headers, metadataFinal,
                tier, accessConditions)
                .then()
                .doOnTerminate(() -> {
                    try {
                        channel.close();
                    } catch (IOException e) {
                        throw logger.logExceptionAsError(new UncheckedIOException(e));
                    }
                }), this::uploadFileCleanup);
    }


    private AsynchronousFileChannel uploadFileResourceSupplier(String filePath) {
        try {
            return AsynchronousFileChannel.open(Paths.get(filePath), StandardOpenOption.READ);
        } catch (IOException e) {
            throw logger.logExceptionAsError(new UncheckedIOException(e));
        }
    }

    private void uploadFileCleanup(AsynchronousFileChannel channel) {
        try {
            channel.close();
        } catch (IOException e) {
            throw logger.logExceptionAsError(new UncheckedIOException(e));
        }
    }
}
