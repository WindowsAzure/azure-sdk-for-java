// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob.implementation;

import com.azure.core.annotations.BodyParam;
import com.azure.core.annotations.ExpectedResponses;
import com.azure.core.annotations.GET;
import com.azure.core.annotations.HeaderParam;
import com.azure.core.annotations.Host;
import com.azure.core.annotations.HostParam;
import com.azure.core.annotations.PUT;
import com.azure.core.annotations.PathParam;
import com.azure.core.annotations.QueryParam;
import com.azure.core.annotations.Service;
import com.azure.core.annotations.UnexpectedResponseExceptionType;
import com.azure.core.implementation.DateTimeRfc1123;
import com.azure.core.implementation.RestProxy;
import com.azure.core.implementation.util.Base64Util;
import com.azure.core.util.Context;
import com.azure.storage.blob.models.BlobHTTPHeaders;
import com.azure.storage.blob.models.BlockBlobsCommitBlockListResponse;
import com.azure.storage.blob.models.BlockBlobsGetBlockListResponse;
import com.azure.storage.blob.models.BlockBlobsStageBlockFromURLResponse;
import com.azure.storage.blob.models.BlockBlobsStageBlockResponse;
import com.azure.storage.blob.models.BlockBlobsUploadResponse;
import com.azure.storage.blob.models.BlockListType;
import com.azure.storage.blob.models.BlockLookupList;
import com.azure.storage.blob.models.EncryptionAlgorithmType;
import com.azure.storage.blob.models.LeaseAccessConditions;
import com.azure.storage.blob.models.ModifiedAccessConditions;
import com.azure.storage.blob.models.SourceModifiedAccessConditions;
import com.azure.storage.blob.models.StorageErrorException;
import io.netty.buffer.ByteBuf;
import java.net.URL;
import java.time.OffsetDateTime;
import java.util.Map;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * BlockBlobs.
 */
public final class BlockBlobsImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private BlockBlobsService service;

    /**
     * The service client containing this operation class.
     */
    private AzureBlobStorageImpl client;

    /**
     * Initializes an instance of BlockBlobsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public BlockBlobsImpl(AzureBlobStorageImpl client) {
        this.service = RestProxy.create(BlockBlobsService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for BlockBlobs to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{url}")
    @Service("Storage Blobs BlockBlob")
    private interface BlockBlobsService {
        @PUT("{containerName}/{blob}")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<BlockBlobsUploadResponse> upload(@PathParam("containerName") String containerName, @PathParam("blob") String blob, @HostParam("url") String url, @BodyParam("application/octet-stream") Flux<ByteBuf> body, @QueryParam("timeout") Integer timeout, @HeaderParam("Content-Length") long contentLength, @HeaderParam("x-ms-meta-") Map<String, String> metadata, @QueryParam("x-ms-encryption-key") String encryptionKey, @QueryParam("x-ms-encryption-key-sha256") String encryptionKeySha256, @QueryParam("x-ms-encryption-algorithm") EncryptionAlgorithmType encryptionAlgorithm, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @HeaderParam("x-ms-blob-type") String blobType, @HeaderParam("x-ms-blob-content-type") String blobContentType, @HeaderParam("x-ms-blob-content-encoding") String blobContentEncoding, @HeaderParam("x-ms-blob-content-language") String blobContentLanguage, @HeaderParam("x-ms-blob-content-md5") String blobContentMD5, @HeaderParam("x-ms-blob-cache-control") String blobCacheControl, @HeaderParam("x-ms-blob-content-disposition") String blobContentDisposition, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, Context context);

        @PUT("{containerName}/{blob}")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<BlockBlobsStageBlockResponse> stageBlock(@PathParam("containerName") String containerName, @PathParam("blob") String blob, @HostParam("url") String url, @QueryParam("blockid") String blockId, @HeaderParam("Content-Length") long contentLength, @HeaderParam("Content-MD5") String transactionalContentMD5, @BodyParam("application/octet-stream") Flux<ByteBuf> body, @QueryParam("timeout") Integer timeout, @QueryParam("x-ms-encryption-key") String encryptionKey, @QueryParam("x-ms-encryption-key-sha256") String encryptionKeySha256, @QueryParam("x-ms-encryption-algorithm") EncryptionAlgorithmType encryptionAlgorithm, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("comp") String comp, @HeaderParam("x-ms-lease-id") String leaseId, Context context);

        @PUT("{containerName}/{blob}")
        @ExpectedResponses({201, 304})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<BlockBlobsStageBlockFromURLResponse> stageBlockFromURL(@PathParam("containerName") String containerName, @PathParam("blob") String blob, @HostParam("url") String url, @QueryParam("blockid") String blockId, @HeaderParam("Content-Length") long contentLength, @HeaderParam("x-ms-copy-source") URL copySource, @HeaderParam("x-ms-source-range") String sourceRange, @HeaderParam("x-ms-source-content-md5") String sourceContentMD5, @QueryParam("timeout") Integer timeout, @QueryParam("x-ms-encryption-key") String encryptionKey, @QueryParam("x-ms-encryption-key-sha256") String encryptionKeySha256, @QueryParam("x-ms-encryption-algorithm") EncryptionAlgorithmType encryptionAlgorithm, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("comp") String comp, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("x-ms-source-if-modified-since") DateTimeRfc1123 sourceIfModifiedSince, @HeaderParam("x-ms-source-if-unmodified-since") DateTimeRfc1123 sourceIfUnmodifiedSince, @HeaderParam("x-ms-source-if-match") String sourceIfMatch, @HeaderParam("x-ms-source-if-none-match") String sourceIfNoneMatch, Context context);

        @PUT("{containerName}/{blob}")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<BlockBlobsCommitBlockListResponse> commitBlockList(@PathParam("containerName") String containerName, @PathParam("blob") String blob, @HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-meta-") Map<String, String> metadata, @QueryParam("x-ms-encryption-key") String encryptionKey, @QueryParam("x-ms-encryption-key-sha256") String encryptionKeySha256, @QueryParam("x-ms-encryption-algorithm") EncryptionAlgorithmType encryptionAlgorithm, @BodyParam("application/xml; charset=utf-8") BlockLookupList blocks, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("comp") String comp, @HeaderParam("x-ms-blob-cache-control") String blobCacheControl, @HeaderParam("x-ms-blob-content-type") String blobContentType, @HeaderParam("x-ms-blob-content-encoding") String blobContentEncoding, @HeaderParam("x-ms-blob-content-language") String blobContentLanguage, @HeaderParam("x-ms-blob-content-md5") String blobContentMD5, @HeaderParam("x-ms-blob-content-disposition") String blobContentDisposition, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, Context context);

        @GET("{containerName}/{blob}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<BlockBlobsGetBlockListResponse> getBlockList(@PathParam("containerName") String containerName, @PathParam("blob") String blob, @HostParam("url") String url, @QueryParam("snapshot") String snapshot, @QueryParam("versionid") String versionId, @QueryParam("blocklisttype") BlockListType listType, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("comp") String comp, @HeaderParam("x-ms-lease-id") String leaseId, Context context);
    }

    /**
     * The Upload Block Blob operation updates the content of an existing block blob. Updating an existing block blob overwrites any existing metadata on the blob. Partial updates are not supported with Put Blob; the content of the existing blob is overwritten with the content of the new blob. To perform a partial update of the content of a block blob, use the Put Block List operation.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param body Initial data.
     * @param contentLength The length of the request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<BlockBlobsUploadResponse> uploadWithRestResponseAsync(String containerName, String blob, Flux<ByteBuf> body, long contentLength, Context context) {
        final Integer timeout = null;
        final Map<String, String> metadata = null;
        final String encryptionKey = null;
        final String encryptionKeySha256 = null;
        final EncryptionAlgorithmType encryptionAlgorithm = null;
        final String requestId = null;
        final String blobType = "BlockBlob";
        final String blobContentType = null;
        final String blobContentEncoding = null;
        final String blobContentLanguage = null;
        final String blobCacheControl = null;
        final String blobContentDisposition = null;
        final String leaseId = null;
        final String ifMatch = null;
        final String ifNoneMatch = null;
        String blobContentMD5Converted = null;
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        return service.upload(containerName, blob, this.client.url(), body, timeout, contentLength, metadata, encryptionKey, encryptionKeySha256, encryptionAlgorithm, this.client.version(), requestId, blobType, blobContentType, blobContentEncoding, blobContentLanguage, blobContentMD5Converted, blobCacheControl, blobContentDisposition, leaseId, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, context);
    }

    /**
     * The Upload Block Blob operation updates the content of an existing block blob. Updating an existing block blob overwrites any existing metadata on the blob. Partial updates are not supported with Put Blob; the content of the existing blob is overwritten with the content of the new blob. To perform a partial update of the content of a block blob, use the Put Block List operation.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param body Initial data.
     * @param contentLength The length of the request.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param metadata Optional. Specifies a user-defined name-value pair associated with the blob. If no name-value pairs are specified, the operation will copy the metadata from the source blob or file to the destination blob. If one or more name-value pairs are specified, the destination blob is created with the specified metadata, and metadata is not copied from the source blob or file. Note that beginning with version 2009-09-19, metadata names must adhere to the naming rules for C# identifiers. See Naming and Referencing Containers, Blobs, and Metadata for more information.
     * @param encryptionKey Optional. Specifies the encryption key to use to encrypt the data provided in the request. If not specified, encryption is performed with the root account encryption key.  For more information, see Encryption at Rest for Azure Storage Services.
     * @param encryptionKeySha256 The SHA-256 hash of the provided encryption key. Must be provided if the x-ms-encryption-key header is provided.
     * @param encryptionAlgorithm The algorithm used to produce the encryption key hash. Currently, the only accepted value is "AES256". Must be provided if the x-ms-encryption-key header is provided. Possible values include: 'AES256'.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param blobHTTPHeaders Additional parameters for the operation.
     * @param leaseAccessConditions Additional parameters for the operation.
     * @param modifiedAccessConditions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<BlockBlobsUploadResponse> uploadWithRestResponseAsync(String containerName, String blob, Flux<ByteBuf> body, long contentLength, Integer timeout, Map<String, String> metadata, String encryptionKey, String encryptionKeySha256, EncryptionAlgorithmType encryptionAlgorithm, String requestId, BlobHTTPHeaders blobHTTPHeaders, LeaseAccessConditions leaseAccessConditions, ModifiedAccessConditions modifiedAccessConditions, Context context) {
        final String blobType = "BlockBlob";
        String blobContentType = null;
        if (blobHTTPHeaders != null) {
            blobContentType = blobHTTPHeaders.blobContentType();
        }
        String blobContentEncoding = null;
        if (blobHTTPHeaders != null) {
            blobContentEncoding = blobHTTPHeaders.blobContentEncoding();
        }
        String blobContentLanguage = null;
        if (blobHTTPHeaders != null) {
            blobContentLanguage = blobHTTPHeaders.blobContentLanguage();
        }
        byte[] blobContentMD5 = null;
        if (blobHTTPHeaders != null) {
            blobContentMD5 = blobHTTPHeaders.blobContentMD5();
        }
        String blobCacheControl = null;
        if (blobHTTPHeaders != null) {
            blobCacheControl = blobHTTPHeaders.blobCacheControl();
        }
        String blobContentDisposition = null;
        if (blobHTTPHeaders != null) {
            blobContentDisposition = blobHTTPHeaders.blobContentDisposition();
        }
        String leaseId = null;
        if (leaseAccessConditions != null) {
            leaseId = leaseAccessConditions.leaseId();
        }
        OffsetDateTime ifModifiedSince = null;
        if (modifiedAccessConditions != null) {
            ifModifiedSince = modifiedAccessConditions.ifModifiedSince();
        }
        OffsetDateTime ifUnmodifiedSince = null;
        if (modifiedAccessConditions != null) {
            ifUnmodifiedSince = modifiedAccessConditions.ifUnmodifiedSince();
        }
        String ifMatch = null;
        if (modifiedAccessConditions != null) {
            ifMatch = modifiedAccessConditions.ifMatch();
        }
        String ifNoneMatch = null;
        if (modifiedAccessConditions != null) {
            ifNoneMatch = modifiedAccessConditions.ifNoneMatch();
        }
        String blobContentMD5Converted = Base64Util.encodeToString(blobContentMD5);
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.upload(containerName, blob, this.client.url(), body, timeout, contentLength, metadata, encryptionKey, encryptionKeySha256, encryptionAlgorithm, this.client.version(), requestId, blobType, blobContentType, blobContentEncoding, blobContentLanguage, blobContentMD5Converted, blobCacheControl, blobContentDisposition, leaseId, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, context);
    }

    /**
     * The Stage Block operation creates a new block to be committed as part of a blob.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param blockId A valid Base64 string value that identifies the block. Prior to encoding, the string must be less than or equal to 64 bytes in size. For a given blob, the length of the value specified for the blockid parameter must be the same size for each block.
     * @param contentLength The length of the request.
     * @param body Initial data.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<BlockBlobsStageBlockResponse> stageBlockWithRestResponseAsync(String containerName, String blob, String blockId, long contentLength, Flux<ByteBuf> body, Context context) {
        final Integer timeout = null;
        final String encryptionKey = null;
        final String encryptionKeySha256 = null;
        final EncryptionAlgorithmType encryptionAlgorithm = null;
        final String requestId = null;
        final String comp = "block";
        final String leaseId = null;
        String transactionalContentMD5Converted = null;
        return service.stageBlock(containerName, blob, this.client.url(), blockId, contentLength, transactionalContentMD5Converted, body, timeout, encryptionKey, encryptionKeySha256, encryptionAlgorithm, this.client.version(), requestId, comp, leaseId, context);
    }

    /**
     * The Stage Block operation creates a new block to be committed as part of a blob.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param blockId A valid Base64 string value that identifies the block. Prior to encoding, the string must be less than or equal to 64 bytes in size. For a given blob, the length of the value specified for the blockid parameter must be the same size for each block.
     * @param contentLength The length of the request.
     * @param body Initial data.
     * @param transactionalContentMD5 Specify the transactional md5 for the body, to be validated by the service.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param encryptionKey Optional. Specifies the encryption key to use to encrypt the data provided in the request. If not specified, encryption is performed with the root account encryption key.  For more information, see Encryption at Rest for Azure Storage Services.
     * @param encryptionKeySha256 The SHA-256 hash of the provided encryption key. Must be provided if the x-ms-encryption-key header is provided.
     * @param encryptionAlgorithm The algorithm used to produce the encryption key hash. Currently, the only accepted value is "AES256". Must be provided if the x-ms-encryption-key header is provided. Possible values include: 'AES256'.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param leaseAccessConditions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<BlockBlobsStageBlockResponse> stageBlockWithRestResponseAsync(String containerName, String blob, String blockId, long contentLength, Flux<ByteBuf> body, byte[] transactionalContentMD5, Integer timeout, String encryptionKey, String encryptionKeySha256, EncryptionAlgorithmType encryptionAlgorithm, String requestId, LeaseAccessConditions leaseAccessConditions, Context context) {
        final String comp = "block";
        String leaseId = null;
        if (leaseAccessConditions != null) {
            leaseId = leaseAccessConditions.leaseId();
        }
        String transactionalContentMD5Converted = Base64Util.encodeToString(transactionalContentMD5);
        return service.stageBlock(containerName, blob, this.client.url(), blockId, contentLength, transactionalContentMD5Converted, body, timeout, encryptionKey, encryptionKeySha256, encryptionAlgorithm, this.client.version(), requestId, comp, leaseId, context);
    }

    /**
     * The Stage Block operation creates a new block to be committed as part of a blob where the contents are read from a URL.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param blockId A valid Base64 string value that identifies the block. Prior to encoding, the string must be less than or equal to 64 bytes in size. For a given blob, the length of the value specified for the blockid parameter must be the same size for each block.
     * @param contentLength The length of the request.
     * @param sourceUrl Specify a URL to the copy source.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<BlockBlobsStageBlockFromURLResponse> stageBlockFromURLWithRestResponseAsync(String containerName, String blob, String blockId, long contentLength, URL sourceUrl, Context context) {
        final String sourceRange = null;
        final Integer timeout = null;
        final String encryptionKey = null;
        final String encryptionKeySha256 = null;
        final EncryptionAlgorithmType encryptionAlgorithm = null;
        final String requestId = null;
        final String comp = "block";
        final String leaseId = null;
        final String sourceIfMatch = null;
        final String sourceIfNoneMatch = null;
        String sourceContentMD5Converted = null;
        DateTimeRfc1123 sourceIfModifiedSinceConverted = null;
        DateTimeRfc1123 sourceIfUnmodifiedSinceConverted = null;
        return service.stageBlockFromURL(containerName, blob, this.client.url(), blockId, contentLength, sourceUrl, sourceRange, sourceContentMD5Converted, timeout, encryptionKey, encryptionKeySha256, encryptionAlgorithm, this.client.version(), requestId, comp, leaseId, sourceIfModifiedSinceConverted, sourceIfUnmodifiedSinceConverted, sourceIfMatch, sourceIfNoneMatch, context);
    }

    /**
     * The Stage Block operation creates a new block to be committed as part of a blob where the contents are read from a URL.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param blockId A valid Base64 string value that identifies the block. Prior to encoding, the string must be less than or equal to 64 bytes in size. For a given blob, the length of the value specified for the blockid parameter must be the same size for each block.
     * @param contentLength The length of the request.
     * @param sourceUrl Specify a URL to the copy source.
     * @param sourceRange Bytes of source data in the specified range.
     * @param sourceContentMD5 Specify the md5 calculated for the range of bytes that must be read from the copy source.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param encryptionKey Optional. Specifies the encryption key to use to encrypt the data provided in the request. If not specified, encryption is performed with the root account encryption key.  For more information, see Encryption at Rest for Azure Storage Services.
     * @param encryptionKeySha256 The SHA-256 hash of the provided encryption key. Must be provided if the x-ms-encryption-key header is provided.
     * @param encryptionAlgorithm The algorithm used to produce the encryption key hash. Currently, the only accepted value is "AES256". Must be provided if the x-ms-encryption-key header is provided. Possible values include: 'AES256'.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param leaseAccessConditions Additional parameters for the operation.
     * @param sourceModifiedAccessConditions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<BlockBlobsStageBlockFromURLResponse> stageBlockFromURLWithRestResponseAsync(String containerName, String blob, String blockId, long contentLength, URL sourceUrl, String sourceRange, byte[] sourceContentMD5, Integer timeout, String encryptionKey, String encryptionKeySha256, EncryptionAlgorithmType encryptionAlgorithm, String requestId, LeaseAccessConditions leaseAccessConditions, SourceModifiedAccessConditions sourceModifiedAccessConditions, Context context) {
        final String comp = "block";
        String leaseId = null;
        if (leaseAccessConditions != null) {
            leaseId = leaseAccessConditions.leaseId();
        }
        OffsetDateTime sourceIfModifiedSince = null;
        if (sourceModifiedAccessConditions != null) {
            sourceIfModifiedSince = sourceModifiedAccessConditions.sourceIfModifiedSince();
        }
        OffsetDateTime sourceIfUnmodifiedSince = null;
        if (sourceModifiedAccessConditions != null) {
            sourceIfUnmodifiedSince = sourceModifiedAccessConditions.sourceIfUnmodifiedSince();
        }
        String sourceIfMatch = null;
        if (sourceModifiedAccessConditions != null) {
            sourceIfMatch = sourceModifiedAccessConditions.sourceIfMatch();
        }
        String sourceIfNoneMatch = null;
        if (sourceModifiedAccessConditions != null) {
            sourceIfNoneMatch = sourceModifiedAccessConditions.sourceIfNoneMatch();
        }
        String sourceContentMD5Converted = Base64Util.encodeToString(sourceContentMD5);
        DateTimeRfc1123 sourceIfModifiedSinceConverted = sourceIfModifiedSince == null ? null : new DateTimeRfc1123(sourceIfModifiedSince);
        DateTimeRfc1123 sourceIfUnmodifiedSinceConverted = sourceIfUnmodifiedSince == null ? null : new DateTimeRfc1123(sourceIfUnmodifiedSince);
        return service.stageBlockFromURL(containerName, blob, this.client.url(), blockId, contentLength, sourceUrl, sourceRange, sourceContentMD5Converted, timeout, encryptionKey, encryptionKeySha256, encryptionAlgorithm, this.client.version(), requestId, comp, leaseId, sourceIfModifiedSinceConverted, sourceIfUnmodifiedSinceConverted, sourceIfMatch, sourceIfNoneMatch, context);
    }

    /**
     * The Commit Block List operation writes a blob by specifying the list of block IDs that make up the blob. In order to be written as part of a blob, a block must have been successfully written to the server in a prior Put Block operation. You can call Put Block List to update a blob by uploading only those blocks that have changed, then committing the new and existing blocks together. You can do this by specifying whether to commit a block from the committed block list or from the uncommitted block list, or to commit the most recently uploaded version of the block, whichever list it may belong to.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param blocks the BlockLookupList value.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<BlockBlobsCommitBlockListResponse> commitBlockListWithRestResponseAsync(String containerName, String blob, BlockLookupList blocks, Context context) {
        final Integer timeout = null;
        final Map<String, String> metadata = null;
        final String encryptionKey = null;
        final String encryptionKeySha256 = null;
        final EncryptionAlgorithmType encryptionAlgorithm = null;
        final String requestId = null;
        final String comp = "blocklist";
        final String blobCacheControl = null;
        final String blobContentType = null;
        final String blobContentEncoding = null;
        final String blobContentLanguage = null;
        final String blobContentDisposition = null;
        final String leaseId = null;
        final String ifMatch = null;
        final String ifNoneMatch = null;
        String blobContentMD5Converted = null;
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        return service.commitBlockList(containerName, blob, this.client.url(), timeout, metadata, encryptionKey, encryptionKeySha256, encryptionAlgorithm, blocks, this.client.version(), requestId, comp, blobCacheControl, blobContentType, blobContentEncoding, blobContentLanguage, blobContentMD5Converted, blobContentDisposition, leaseId, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, context);
    }

    /**
     * The Commit Block List operation writes a blob by specifying the list of block IDs that make up the blob. In order to be written as part of a blob, a block must have been successfully written to the server in a prior Put Block operation. You can call Put Block List to update a blob by uploading only those blocks that have changed, then committing the new and existing blocks together. You can do this by specifying whether to commit a block from the committed block list or from the uncommitted block list, or to commit the most recently uploaded version of the block, whichever list it may belong to.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param blocks the BlockLookupList value.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param metadata Optional. Specifies a user-defined name-value pair associated with the blob. If no name-value pairs are specified, the operation will copy the metadata from the source blob or file to the destination blob. If one or more name-value pairs are specified, the destination blob is created with the specified metadata, and metadata is not copied from the source blob or file. Note that beginning with version 2009-09-19, metadata names must adhere to the naming rules for C# identifiers. See Naming and Referencing Containers, Blobs, and Metadata for more information.
     * @param encryptionKey Optional. Specifies the encryption key to use to encrypt the data provided in the request. If not specified, encryption is performed with the root account encryption key.  For more information, see Encryption at Rest for Azure Storage Services.
     * @param encryptionKeySha256 The SHA-256 hash of the provided encryption key. Must be provided if the x-ms-encryption-key header is provided.
     * @param encryptionAlgorithm The algorithm used to produce the encryption key hash. Currently, the only accepted value is "AES256". Must be provided if the x-ms-encryption-key header is provided. Possible values include: 'AES256'.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param blobHTTPHeaders Additional parameters for the operation.
     * @param leaseAccessConditions Additional parameters for the operation.
     * @param modifiedAccessConditions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<BlockBlobsCommitBlockListResponse> commitBlockListWithRestResponseAsync(String containerName, String blob, BlockLookupList blocks, Integer timeout, Map<String, String> metadata, String encryptionKey, String encryptionKeySha256, EncryptionAlgorithmType encryptionAlgorithm, String requestId, BlobHTTPHeaders blobHTTPHeaders, LeaseAccessConditions leaseAccessConditions, ModifiedAccessConditions modifiedAccessConditions, Context context) {
        final String comp = "blocklist";
        String blobCacheControl = null;
        if (blobHTTPHeaders != null) {
            blobCacheControl = blobHTTPHeaders.blobCacheControl();
        }
        String blobContentType = null;
        if (blobHTTPHeaders != null) {
            blobContentType = blobHTTPHeaders.blobContentType();
        }
        String blobContentEncoding = null;
        if (blobHTTPHeaders != null) {
            blobContentEncoding = blobHTTPHeaders.blobContentEncoding();
        }
        String blobContentLanguage = null;
        if (blobHTTPHeaders != null) {
            blobContentLanguage = blobHTTPHeaders.blobContentLanguage();
        }
        byte[] blobContentMD5 = null;
        if (blobHTTPHeaders != null) {
            blobContentMD5 = blobHTTPHeaders.blobContentMD5();
        }
        String blobContentDisposition = null;
        if (blobHTTPHeaders != null) {
            blobContentDisposition = blobHTTPHeaders.blobContentDisposition();
        }
        String leaseId = null;
        if (leaseAccessConditions != null) {
            leaseId = leaseAccessConditions.leaseId();
        }
        OffsetDateTime ifModifiedSince = null;
        if (modifiedAccessConditions != null) {
            ifModifiedSince = modifiedAccessConditions.ifModifiedSince();
        }
        OffsetDateTime ifUnmodifiedSince = null;
        if (modifiedAccessConditions != null) {
            ifUnmodifiedSince = modifiedAccessConditions.ifUnmodifiedSince();
        }
        String ifMatch = null;
        if (modifiedAccessConditions != null) {
            ifMatch = modifiedAccessConditions.ifMatch();
        }
        String ifNoneMatch = null;
        if (modifiedAccessConditions != null) {
            ifNoneMatch = modifiedAccessConditions.ifNoneMatch();
        }
        String blobContentMD5Converted = Base64Util.encodeToString(blobContentMD5);
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.commitBlockList(containerName, blob, this.client.url(), timeout, metadata, encryptionKey, encryptionKeySha256, encryptionAlgorithm, blocks, this.client.version(), requestId, comp, blobCacheControl, blobContentType, blobContentEncoding, blobContentLanguage, blobContentMD5Converted, blobContentDisposition, leaseId, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, context);
    }

    /**
     * The Get Block List operation retrieves the list of blocks that have been uploaded as part of a block blob.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param listType Specifies whether to return the list of committed blocks, the list of uncommitted blocks, or both lists together. Possible values include: 'committed', 'uncommitted', 'all'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<BlockBlobsGetBlockListResponse> getBlockListWithRestResponseAsync(String containerName, String blob, BlockListType listType, Context context) {
        final String snapshot = null;
        final String versionId = null;
        final Integer timeout = null;
        final String requestId = null;
        final String comp = "blocklist";
        final String leaseId = null;
        return service.getBlockList(containerName, blob, this.client.url(), snapshot, versionId, listType, timeout, this.client.version(), requestId, comp, leaseId, context);
    }

    /**
     * The Get Block List operation retrieves the list of blocks that have been uploaded as part of a block blob.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param listType Specifies whether to return the list of committed blocks, the list of uncommitted blocks, or both lists together. Possible values include: 'committed', 'uncommitted', 'all'.
     * @param snapshot The snapshot parameter is an opaque DateTime value that, when present, specifies the blob snapshot to retrieve. For more information on working with blob snapshots, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/creating-a-snapshot-of-a-blob"&gt;Creating a Snapshot of a Blob.&lt;/a&gt;.
     * @param versionId The version ID parameter is an opaque DateTime value that, when present, specifies the blob version to retrieve.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param leaseAccessConditions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<BlockBlobsGetBlockListResponse> getBlockListWithRestResponseAsync(String containerName, String blob, BlockListType listType, String snapshot, String versionId, Integer timeout, String requestId, LeaseAccessConditions leaseAccessConditions, Context context) {
        final String comp = "blocklist";
        String leaseId = null;
        if (leaseAccessConditions != null) {
            leaseId = leaseAccessConditions.leaseId();
        }
        return service.getBlockList(containerName, blob, this.client.url(), snapshot, versionId, listType, timeout, this.client.version(), requestId, comp, leaseId, context);
    }
}
