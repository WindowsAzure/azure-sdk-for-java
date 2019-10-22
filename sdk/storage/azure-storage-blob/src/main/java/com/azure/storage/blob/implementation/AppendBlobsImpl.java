// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.implementation.DateTimeRfc1123;
import com.azure.core.implementation.RestProxy;
import com.azure.core.implementation.util.Base64Util;
import com.azure.core.util.Context;
import com.azure.storage.blob.implementation.models.AppendBlobsAppendBlockFromUrlResponse;
import com.azure.storage.blob.implementation.models.AppendBlobsAppendBlockResponse;
import com.azure.storage.blob.implementation.models.AppendBlobsCreateResponse;
import com.azure.storage.blob.models.AppendPositionAccessConditions;
import com.azure.storage.blob.models.BlobHttpHeaders;
import com.azure.storage.blob.models.CpkInfo;
import com.azure.storage.blob.models.EncryptionAlgorithmType;
import com.azure.storage.blob.models.LeaseAccessConditions;
import com.azure.storage.blob.models.ModifiedAccessConditions;
import com.azure.storage.blob.models.SourceModifiedAccessConditions;
import com.azure.storage.blob.models.StorageErrorException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.time.OffsetDateTime;
import java.util.Map;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * AppendBlobs.
 */
public final class AppendBlobsImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private AppendBlobsService service;

    /**
     * The service client containing this operation class.
     */
    private AzureBlobStorageImpl client;

    /**
     * Initializes an instance of AppendBlobsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public AppendBlobsImpl(AzureBlobStorageImpl client) {
        this.service = RestProxy.create(AppendBlobsService.class, client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureBlobStorageAppendBlobs
     * to be used by the proxy service to perform REST calls.
     */
    @Host("{url}")
    @ServiceInterface(name = "AzureBlobStorageAppendBlobs")
    private interface AppendBlobsService {
        @Put("{containerName}/{blob}")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<AppendBlobsCreateResponse> create(@PathParam("containerName") String containerName, @PathParam("blob") String blob, @HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("Content-Length") long contentLength, @HeaderParam("x-ms-meta-") Map<String, String> metadata, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @HeaderParam("x-ms-blob-type") String blobType, @HeaderParam("x-ms-blob-content-type") String blobContentType, @HeaderParam("x-ms-blob-content-encoding") String blobContentEncoding, @HeaderParam("x-ms-blob-content-language") String blobContentLanguage, @HeaderParam("x-ms-blob-content-md5") String blobContentMD5, @HeaderParam("x-ms-blob-cache-control") String blobCacheControl, @HeaderParam("x-ms-blob-content-disposition") String blobContentDisposition, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("x-ms-encryption-key") String encryptionKey, @HeaderParam("x-ms-encryption-key-sha256") String encryptionKeySha256, @HeaderParam("x-ms-encryption-algorithm") EncryptionAlgorithmType encryptionAlgorithm, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, Context context);

        @Put("{containerName}/{blob}")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<AppendBlobsAppendBlockResponse> appendBlock(@PathParam("containerName") String containerName, @PathParam("blob") String blob, @HostParam("url") String url, @BodyParam("application/octet-stream") Flux<ByteBuffer> body, @QueryParam("timeout") Integer timeout, @HeaderParam("Content-Length") long contentLength, @HeaderParam("Content-MD5") String transactionalContentMD5, @HeaderParam("x-ms-content-crc64") String transactionalContentCrc64, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("comp") String comp, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("x-ms-blob-condition-maxsize") Long maxSize, @HeaderParam("x-ms-blob-condition-appendpos") Long appendPosition, @HeaderParam("x-ms-encryption-key") String encryptionKey, @HeaderParam("x-ms-encryption-key-sha256") String encryptionKeySha256, @HeaderParam("x-ms-encryption-algorithm") EncryptionAlgorithmType encryptionAlgorithm, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, Context context);

        @Put("{containerName}/{blob}")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<AppendBlobsAppendBlockFromUrlResponse> appendBlockFromUrl(@PathParam("containerName") String containerName, @PathParam("blob") String blob, @HostParam("url") String url, @HeaderParam("x-ms-copy-source") URL copySource, @HeaderParam("x-ms-source-range") String sourceRange, @HeaderParam("x-ms-source-content-md5") String sourceContentMD5, @HeaderParam("x-ms-source-content-crc64") String sourceContentcrc64, @QueryParam("timeout") Integer timeout, @HeaderParam("Content-Length") long contentLength, @HeaderParam("Content-MD5") String transactionalContentMD5, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("comp") String comp, @HeaderParam("x-ms-encryption-key") String encryptionKey, @HeaderParam("x-ms-encryption-key-sha256") String encryptionKeySha256, @HeaderParam("x-ms-encryption-algorithm") EncryptionAlgorithmType encryptionAlgorithm, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("x-ms-blob-condition-maxsize") Long maxSize, @HeaderParam("x-ms-blob-condition-appendpos") Long appendPosition, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, @HeaderParam("x-ms-source-if-modified-since") DateTimeRfc1123 sourceIfModifiedSince, @HeaderParam("x-ms-source-if-unmodified-since") DateTimeRfc1123 sourceIfUnmodifiedSince, @HeaderParam("x-ms-source-if-match") String sourceIfMatch, @HeaderParam("x-ms-source-if-none-match") String sourceIfNoneMatch, Context context);
    }

    /**
     * The Create Append Blob operation creates a new append blob.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param contentLength The length of the request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AppendBlobsCreateResponse> createWithRestResponseAsync(String containerName, String blob, long contentLength, Context context) {
        final Integer timeout = null;
        final Map<String, String> metadata = null;
        final String requestId = null;
        final String blobType = "AppendBlob";
        final String blobContentType = null;
        final String blobContentEncoding = null;
        final String blobContentLanguage = null;
        final String blobCacheControl = null;
        final String blobContentDisposition = null;
        final String leaseId = null;
        final String encryptionKey = null;
        final String encryptionKeySha256 = null;
        final EncryptionAlgorithmType encryptionAlgorithm = null;
        final String ifMatch = null;
        final String ifNoneMatch = null;
        String blobContentMD5Converted = null;
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        return service.create(containerName, blob, this.client.getUrl(), timeout, contentLength, metadata, this.client.getVersion(), requestId, blobType, blobContentType, blobContentEncoding, blobContentLanguage, blobContentMD5Converted, blobCacheControl, blobContentDisposition, leaseId, encryptionKey, encryptionKeySha256, encryptionAlgorithm, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, context);
    }

    /**
     * The Create Append Blob operation creates a new append blob.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param contentLength The length of the request.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param metadata Optional. Specifies a user-defined name-value pair associated with the blob. If no name-value pairs are specified, the operation will copy the metadata from the source blob or file to the destination blob. If one or more name-value pairs are specified, the destination blob is created with the specified metadata, and metadata is not copied from the source blob or file. Note that beginning with version 2009-09-19, metadata names must adhere to the naming rules for C# identifiers. See Naming and Referencing Containers, Blobs, and Metadata for more information.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param blobHTTPHeaders Additional parameters for the operation.
     * @param leaseAccessConditions Additional parameters for the operation.
     * @param cpkInfo Additional parameters for the operation.
     * @param modifiedAccessConditions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AppendBlobsCreateResponse> createWithRestResponseAsync(String containerName, String blob, long contentLength, Integer timeout, Map<String, String> metadata, String requestId, BlobHttpHeaders blobHTTPHeaders, LeaseAccessConditions leaseAccessConditions, CpkInfo cpkInfo, ModifiedAccessConditions modifiedAccessConditions, Context context) {
        final String blobType = "AppendBlob";
        String blobContentType = null;
        if (blobHTTPHeaders != null) {
            blobContentType = blobHTTPHeaders.getBlobContentType();
        }
        String blobContentEncoding = null;
        if (blobHTTPHeaders != null) {
            blobContentEncoding = blobHTTPHeaders.getBlobContentEncoding();
        }
        String blobContentLanguage = null;
        if (blobHTTPHeaders != null) {
            blobContentLanguage = blobHTTPHeaders.getBlobContentLanguage();
        }
        byte[] blobContentMD5 = null;
        if (blobHTTPHeaders != null) {
            blobContentMD5 = blobHTTPHeaders.getBlobContentMD5();
        }
        String blobCacheControl = null;
        if (blobHTTPHeaders != null) {
            blobCacheControl = blobHTTPHeaders.getBlobCacheControl();
        }
        String blobContentDisposition = null;
        if (blobHTTPHeaders != null) {
            blobContentDisposition = blobHTTPHeaders.getBlobContentDisposition();
        }
        String leaseId = null;
        if (leaseAccessConditions != null) {
            leaseId = leaseAccessConditions.getLeaseId();
        }
        String encryptionKey = null;
        if (cpkInfo != null) {
            encryptionKey = cpkInfo.getEncryptionKey();
        }
        String encryptionKeySha256 = null;
        if (cpkInfo != null) {
            encryptionKeySha256 = cpkInfo.getEncryptionKeySha256();
        }
        EncryptionAlgorithmType encryptionAlgorithm = null;
        if (cpkInfo != null) {
            encryptionAlgorithm = cpkInfo.getEncryptionAlgorithm();
        }
        OffsetDateTime ifModifiedSince = null;
        if (modifiedAccessConditions != null) {
            ifModifiedSince = modifiedAccessConditions.getIfModifiedSince();
        }
        OffsetDateTime ifUnmodifiedSince = null;
        if (modifiedAccessConditions != null) {
            ifUnmodifiedSince = modifiedAccessConditions.getIfUnmodifiedSince();
        }
        String ifMatch = null;
        if (modifiedAccessConditions != null) {
            ifMatch = modifiedAccessConditions.getIfMatch();
        }
        String ifNoneMatch = null;
        if (modifiedAccessConditions != null) {
            ifNoneMatch = modifiedAccessConditions.getIfNoneMatch();
        }
        String blobContentMD5Converted = Base64Util.encodeToString(blobContentMD5);
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.create(containerName, blob, this.client.getUrl(), timeout, contentLength, metadata, this.client.getVersion(), requestId, blobType, blobContentType, blobContentEncoding, blobContentLanguage, blobContentMD5Converted, blobCacheControl, blobContentDisposition, leaseId, encryptionKey, encryptionKeySha256, encryptionAlgorithm, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, context);
    }

    /**
     * The Append Block operation commits a new block of data to the end of an existing append blob. The Append Block operation is permitted only if the blob was created with x-ms-blob-type set to AppendBlob. Append Block is supported only on version 2015-02-21 version or later.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param body Initial data.
     * @param contentLength The length of the request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AppendBlobsAppendBlockResponse> appendBlockWithRestResponseAsync(String containerName, String blob, Flux<ByteBuffer> body, long contentLength, Context context) {
        final Integer timeout = null;
        final String requestId = null;
        final String comp = "appendblock";
        final String leaseId = null;
        final Long maxSize = null;
        final Long appendPosition = null;
        final String encryptionKey = null;
        final String encryptionKeySha256 = null;
        final EncryptionAlgorithmType encryptionAlgorithm = null;
        final String ifMatch = null;
        final String ifNoneMatch = null;
        String transactionalContentMD5Converted = null;
        String transactionalContentCrc64Converted = null;
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        return service.appendBlock(containerName, blob, this.client.getUrl(), body, timeout, contentLength, transactionalContentMD5Converted, transactionalContentCrc64Converted, this.client.getVersion(), requestId, comp, leaseId, maxSize, appendPosition, encryptionKey, encryptionKeySha256, encryptionAlgorithm, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, context);
    }

    /**
     * The Append Block operation commits a new block of data to the end of an existing append blob. The Append Block operation is permitted only if the blob was created with x-ms-blob-type set to AppendBlob. Append Block is supported only on version 2015-02-21 version or later.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param body Initial data.
     * @param contentLength The length of the request.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param transactionalContentMD5 Specify the transactional md5 for the body, to be validated by the service.
     * @param transactionalContentCrc64 Specify the transactional crc64 for the body, to be validated by the service.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param leaseAccessConditions Additional parameters for the operation.
     * @param appendPositionAccessConditions Additional parameters for the operation.
     * @param cpkInfo Additional parameters for the operation.
     * @param modifiedAccessConditions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AppendBlobsAppendBlockResponse> appendBlockWithRestResponseAsync(String containerName, String blob, Flux<ByteBuffer> body, long contentLength, Integer timeout, byte[] transactionalContentMD5, byte[] transactionalContentCrc64, String requestId, LeaseAccessConditions leaseAccessConditions, AppendPositionAccessConditions appendPositionAccessConditions, CpkInfo cpkInfo, ModifiedAccessConditions modifiedAccessConditions, Context context) {
        final String comp = "appendblock";
        String leaseId = null;
        if (leaseAccessConditions != null) {
            leaseId = leaseAccessConditions.getLeaseId();
        }
        Long maxSize = null;
        if (appendPositionAccessConditions != null) {
            maxSize = appendPositionAccessConditions.getMaxSize();
        }
        Long appendPosition = null;
        if (appendPositionAccessConditions != null) {
            appendPosition = appendPositionAccessConditions.getAppendPosition();
        }
        String encryptionKey = null;
        if (cpkInfo != null) {
            encryptionKey = cpkInfo.getEncryptionKey();
        }
        String encryptionKeySha256 = null;
        if (cpkInfo != null) {
            encryptionKeySha256 = cpkInfo.getEncryptionKeySha256();
        }
        EncryptionAlgorithmType encryptionAlgorithm = null;
        if (cpkInfo != null) {
            encryptionAlgorithm = cpkInfo.getEncryptionAlgorithm();
        }
        OffsetDateTime ifModifiedSince = null;
        if (modifiedAccessConditions != null) {
            ifModifiedSince = modifiedAccessConditions.getIfModifiedSince();
        }
        OffsetDateTime ifUnmodifiedSince = null;
        if (modifiedAccessConditions != null) {
            ifUnmodifiedSince = modifiedAccessConditions.getIfUnmodifiedSince();
        }
        String ifMatch = null;
        if (modifiedAccessConditions != null) {
            ifMatch = modifiedAccessConditions.getIfMatch();
        }
        String ifNoneMatch = null;
        if (modifiedAccessConditions != null) {
            ifNoneMatch = modifiedAccessConditions.getIfNoneMatch();
        }
        String transactionalContentMD5Converted = Base64Util.encodeToString(transactionalContentMD5);
        String transactionalContentCrc64Converted = Base64Util.encodeToString(transactionalContentCrc64);
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.appendBlock(containerName, blob, this.client.getUrl(), body, timeout, contentLength, transactionalContentMD5Converted, transactionalContentCrc64Converted, this.client.getVersion(), requestId, comp, leaseId, maxSize, appendPosition, encryptionKey, encryptionKeySha256, encryptionAlgorithm, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, context);
    }

    /**
     * The Append Block operation commits a new block of data to the end of an existing append blob where the contents are read from a source url. The Append Block operation is permitted only if the blob was created with x-ms-blob-type set to AppendBlob. Append Block is supported only on version 2015-02-21 version or later.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param sourceUrl Specify a URL to the copy source.
     * @param contentLength The length of the request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AppendBlobsAppendBlockFromUrlResponse> appendBlockFromUrlWithRestResponseAsync(String containerName, String blob, URL sourceUrl, long contentLength, Context context) {
        final String sourceRange = null;
        final Integer timeout = null;
        final String requestId = null;
        final String comp = "appendblock";
        final String encryptionKey = null;
        final String encryptionKeySha256 = null;
        final EncryptionAlgorithmType encryptionAlgorithm = null;
        final String leaseId = null;
        final Long maxSize = null;
        final Long appendPosition = null;
        final String ifMatch = null;
        final String ifNoneMatch = null;
        final String sourceIfMatch = null;
        final String sourceIfNoneMatch = null;
        String sourceContentMD5Converted = null;
        String sourceContentcrc64Converted = null;
        String transactionalContentMD5Converted = null;
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        DateTimeRfc1123 sourceIfModifiedSinceConverted = null;
        DateTimeRfc1123 sourceIfUnmodifiedSinceConverted = null;
        return service.appendBlockFromUrl(containerName, blob, this.client.getUrl(), sourceUrl, sourceRange, sourceContentMD5Converted, sourceContentcrc64Converted, timeout, contentLength, transactionalContentMD5Converted, this.client.getVersion(), requestId, comp, encryptionKey, encryptionKeySha256, encryptionAlgorithm, leaseId, maxSize, appendPosition, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, sourceIfModifiedSinceConverted, sourceIfUnmodifiedSinceConverted, sourceIfMatch, sourceIfNoneMatch, context);
    }

    /**
     * The Append Block operation commits a new block of data to the end of an existing append blob where the contents are read from a source url. The Append Block operation is permitted only if the blob was created with x-ms-blob-type set to AppendBlob. Append Block is supported only on version 2015-02-21 version or later.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param sourceUrl Specify a URL to the copy source.
     * @param contentLength The length of the request.
     * @param sourceRange Bytes of source data in the specified range.
     * @param sourceContentMD5 Specify the md5 calculated for the range of bytes that must be read from the copy source.
     * @param sourceContentcrc64 Specify the crc64 calculated for the range of bytes that must be read from the copy source.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param transactionalContentMD5 Specify the transactional md5 for the body, to be validated by the service.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param cpkInfo Additional parameters for the operation.
     * @param leaseAccessConditions Additional parameters for the operation.
     * @param appendPositionAccessConditions Additional parameters for the operation.
     * @param modifiedAccessConditions Additional parameters for the operation.
     * @param sourceModifiedAccessConditions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AppendBlobsAppendBlockFromUrlResponse> appendBlockFromUrlWithRestResponseAsync(String containerName, String blob, URL sourceUrl, long contentLength, String sourceRange, byte[] sourceContentMD5, byte[] sourceContentcrc64, Integer timeout, byte[] transactionalContentMD5, String requestId, CpkInfo cpkInfo, LeaseAccessConditions leaseAccessConditions, AppendPositionAccessConditions appendPositionAccessConditions, ModifiedAccessConditions modifiedAccessConditions, SourceModifiedAccessConditions sourceModifiedAccessConditions, Context context) {
        final String comp = "appendblock";
        String encryptionKey = null;
        if (cpkInfo != null) {
            encryptionKey = cpkInfo.getEncryptionKey();
        }
        String encryptionKeySha256 = null;
        if (cpkInfo != null) {
            encryptionKeySha256 = cpkInfo.getEncryptionKeySha256();
        }
        EncryptionAlgorithmType encryptionAlgorithm = null;
        if (cpkInfo != null) {
            encryptionAlgorithm = cpkInfo.getEncryptionAlgorithm();
        }
        String leaseId = null;
        if (leaseAccessConditions != null) {
            leaseId = leaseAccessConditions.getLeaseId();
        }
        Long maxSize = null;
        if (appendPositionAccessConditions != null) {
            maxSize = appendPositionAccessConditions.getMaxSize();
        }
        Long appendPosition = null;
        if (appendPositionAccessConditions != null) {
            appendPosition = appendPositionAccessConditions.getAppendPosition();
        }
        OffsetDateTime ifModifiedSince = null;
        if (modifiedAccessConditions != null) {
            ifModifiedSince = modifiedAccessConditions.getIfModifiedSince();
        }
        OffsetDateTime ifUnmodifiedSince = null;
        if (modifiedAccessConditions != null) {
            ifUnmodifiedSince = modifiedAccessConditions.getIfUnmodifiedSince();
        }
        String ifMatch = null;
        if (modifiedAccessConditions != null) {
            ifMatch = modifiedAccessConditions.getIfMatch();
        }
        String ifNoneMatch = null;
        if (modifiedAccessConditions != null) {
            ifNoneMatch = modifiedAccessConditions.getIfNoneMatch();
        }
        OffsetDateTime sourceIfModifiedSince = null;
        if (sourceModifiedAccessConditions != null) {
            sourceIfModifiedSince = sourceModifiedAccessConditions.getSourceIfModifiedSince();
        }
        OffsetDateTime sourceIfUnmodifiedSince = null;
        if (sourceModifiedAccessConditions != null) {
            sourceIfUnmodifiedSince = sourceModifiedAccessConditions.getSourceIfUnmodifiedSince();
        }
        String sourceIfMatch = null;
        if (sourceModifiedAccessConditions != null) {
            sourceIfMatch = sourceModifiedAccessConditions.getSourceIfMatch();
        }
        String sourceIfNoneMatch = null;
        if (sourceModifiedAccessConditions != null) {
            sourceIfNoneMatch = sourceModifiedAccessConditions.getSourceIfNoneMatch();
        }
        String sourceContentMD5Converted = Base64Util.encodeToString(sourceContentMD5);
        String sourceContentcrc64Converted = Base64Util.encodeToString(sourceContentcrc64);
        String transactionalContentMD5Converted = Base64Util.encodeToString(transactionalContentMD5);
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        DateTimeRfc1123 sourceIfModifiedSinceConverted = sourceIfModifiedSince == null ? null : new DateTimeRfc1123(sourceIfModifiedSince);
        DateTimeRfc1123 sourceIfUnmodifiedSinceConverted = sourceIfUnmodifiedSince == null ? null : new DateTimeRfc1123(sourceIfUnmodifiedSince);
        return service.appendBlockFromUrl(containerName, blob, this.client.getUrl(), sourceUrl, sourceRange, sourceContentMD5Converted, sourceContentcrc64Converted, timeout, contentLength, transactionalContentMD5Converted, this.client.getVersion(), requestId, comp, encryptionKey, encryptionKeySha256, encryptionAlgorithm, leaseId, maxSize, appendPosition, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, sourceIfModifiedSinceConverted, sourceIfUnmodifiedSinceConverted, sourceIfMatch, sourceIfNoneMatch, context);
    }
}
