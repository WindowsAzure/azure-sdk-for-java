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
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Base64Util;
import com.azure.core.util.Context;
import com.azure.core.util.DateTimeRfc1123;
import com.azure.storage.blob.implementation.models.AppendBlobsAppendBlockFromUrlResponse;
import com.azure.storage.blob.implementation.models.AppendBlobsAppendBlockResponse;
import com.azure.storage.blob.implementation.models.AppendBlobsCreateResponse;
import com.azure.storage.blob.implementation.models.EncryptionScope;
import com.azure.storage.blob.models.BlobStorageException;
import com.azure.storage.blob.models.BlobHttpHeaders;
import com.azure.storage.blob.models.CpkInfo;
import com.azure.storage.blob.models.EncryptionAlgorithmType;
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
        @UnexpectedResponseExceptionType(BlobStorageException.class)
        Mono<AppendBlobsCreateResponse> create(@PathParam("containerName") String containerName, @PathParam("blob") String blob, @HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("Content-Length") long contentLength, @HeaderParam("x-ms-meta-") Map<String, String> metadata, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @HeaderParam("x-ms-blob-type") String blobType, @HeaderParam("x-ms-blob-content-type") String contentType, @HeaderParam("x-ms-blob-content-encoding") String contentEncoding, @HeaderParam("x-ms-blob-content-language") String contentLanguage, @HeaderParam("x-ms-blob-content-md5") String contentMd5, @HeaderParam("x-ms-blob-cache-control") String cacheControl, @HeaderParam("x-ms-blob-content-disposition") String contentDisposition, @HeaderParam("x-ms-encryption-key") String encryptionKey, @HeaderParam("x-ms-encryption-key-sha256") String encryptionKeySha256, @HeaderParam("x-ms-encryption-algorithm") EncryptionAlgorithmType encryptionAlgorithm, @HeaderParam("x-ms-encryption-scope") String encryptionScope, Context context);

        @Put("{containerName}/{blob}")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(BlobStorageException.class)
        Mono<AppendBlobsAppendBlockResponse> appendBlock(@PathParam("containerName") String containerName, @PathParam("blob") String blob, @HostParam("url") String url, @BodyParam("application/octet-stream") Flux<ByteBuffer> body, @QueryParam("timeout") Integer timeout, @HeaderParam("Content-Length") long contentLength, @HeaderParam("Content-MD5") String transactionalContentMD5, @HeaderParam("x-ms-content-crc64") String transactionalContentCrc64, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("x-ms-blob-condition-maxsize") Long maxSize, @HeaderParam("x-ms-blob-condition-appendpos") Long appendPosition, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("comp") String comp, @HeaderParam("x-ms-encryption-key") String encryptionKey, @HeaderParam("x-ms-encryption-key-sha256") String encryptionKeySha256, @HeaderParam("x-ms-encryption-algorithm") EncryptionAlgorithmType encryptionAlgorithm, @HeaderParam("x-ms-encryption-scope") String encryptionScope, Context context);

        @Put("{containerName}/{blob}")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(BlobStorageException.class)
        Mono<AppendBlobsAppendBlockFromUrlResponse> appendBlockFromUrl(@PathParam("containerName") String containerName, @PathParam("blob") String blob, @HostParam("url") String url, @HeaderParam("x-ms-copy-source") URL copySource, @HeaderParam("x-ms-source-range") String sourceRange, @HeaderParam("x-ms-source-content-md5") String sourceContentMD5, @HeaderParam("x-ms-source-content-crc64") String sourceContentcrc64, @QueryParam("timeout") Integer timeout, @HeaderParam("Content-Length") long contentLength, @HeaderParam("Content-MD5") String transactionalContentMD5, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("x-ms-blob-condition-maxsize") Long maxSize, @HeaderParam("x-ms-blob-condition-appendpos") Long appendPosition, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, @HeaderParam("x-ms-source-if-modified-since") DateTimeRfc1123 sourceIfModifiedSince, @HeaderParam("x-ms-source-if-unmodified-since") DateTimeRfc1123 sourceIfUnmodifiedSince, @HeaderParam("x-ms-source-if-match") String sourceIfMatch, @HeaderParam("x-ms-source-if-none-match") String sourceIfNoneMatch, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("comp") String comp, @HeaderParam("x-ms-encryption-key") String encryptionKey, @HeaderParam("x-ms-encryption-key-sha256") String encryptionKeySha256, @HeaderParam("x-ms-encryption-algorithm") EncryptionAlgorithmType encryptionAlgorithm, @HeaderParam("x-ms-encryption-scope") String encryptionScope, Context context);
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
        final String leaseId = null;
        final String ifMatch = null;
        final String ifNoneMatch = null;
        final String requestId = null;
        final String blobType = "AppendBlob";
        final String contentType = null;
        final String contentEncoding = null;
        final String contentLanguage = null;
        final String cacheControl = null;
        final String contentDisposition = null;
        final String encryptionKey = null;
        final String encryptionKeySha256 = null;
        final EncryptionAlgorithmType encryptionAlgorithm = null;
        final String encryptionScope = null;
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        String contentMd5Converted = null;
        return service.create(containerName, blob, this.client.getUrl(), timeout, contentLength, metadata, leaseId, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, this.client.getVersion(), requestId, blobType, contentType, contentEncoding, contentLanguage, contentMd5Converted, cacheControl, contentDisposition, encryptionKey, encryptionKeySha256, encryptionAlgorithm, encryptionScope, context);
    }

    /**
     * The Create Append Blob operation creates a new append blob.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param contentLength The length of the request.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param metadata Optional. Specifies a user-defined name-value pair associated with the blob. If no name-value pairs are specified, the operation will copy the metadata from the source blob or file to the destination blob. If one or more name-value pairs are specified, the destination blob is created with the specified metadata, and metadata is not copied from the source blob or file. Note that beginning with version 2009-09-19, metadata names must adhere to the naming rules for C# identifiers. See Naming and Referencing Containers, Blobs, and Metadata for more information.
     * @param leaseId If specified, the operation only succeeds if the resource's lease is active and matches this ID.
     * @param ifModifiedSince Specify this header value to operate only on a blob if it has been modified since the specified date/time.
     * @param ifUnmodifiedSince Specify this header value to operate only on a blob if it has not been modified since the specified date/time.
     * @param ifMatch Specify an ETag value to operate only on blobs with a matching value.
     * @param ifNoneMatch Specify an ETag value to operate only on blobs without a matching value.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param blobHttpHeaders Additional parameters for the operation.
     * @param cpkInfo Additional parameters for the operation.
     * @param encryptionScope Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AppendBlobsCreateResponse> createWithRestResponseAsync(String containerName, String blob, long contentLength, Integer timeout, Map<String, String> metadata, String leaseId, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId, BlobHttpHeaders blobHttpHeaders, CpkInfo cpkInfo, EncryptionScope encryptionScope, Context context) {
        final String blobType = "AppendBlob";
        String contentType = null;
        if (blobHttpHeaders != null) {
            contentType = blobHttpHeaders.getContentType();
        }
        String contentEncoding = null;
        if (blobHttpHeaders != null) {
            contentEncoding = blobHttpHeaders.getContentEncoding();
        }
        String contentLanguage = null;
        if (blobHttpHeaders != null) {
            contentLanguage = blobHttpHeaders.getContentLanguage();
        }
        byte[] contentMd5 = null;
        if (blobHttpHeaders != null) {
            contentMd5 = blobHttpHeaders.getContentMd5();
        }
        String cacheControl = null;
        if (blobHttpHeaders != null) {
            cacheControl = blobHttpHeaders.getCacheControl();
        }
        String contentDisposition = null;
        if (blobHttpHeaders != null) {
            contentDisposition = blobHttpHeaders.getContentDisposition();
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
        String encryptionScope1 = null;
        if (encryptionScope != null) {
            encryptionScope1 = encryptionScope.getEncryptionScope();
        }
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        String contentMd5Converted = Base64Util.encodeToString(contentMd5);
        return service.create(containerName, blob, this.client.getUrl(), timeout, contentLength, metadata, leaseId, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, this.client.getVersion(), requestId, blobType, contentType, contentEncoding, contentLanguage, contentMd5Converted, cacheControl, contentDisposition, encryptionKey, encryptionKeySha256, encryptionAlgorithm, encryptionScope1, context);
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
        final String leaseId = null;
        final Long maxSize = null;
        final Long appendPosition = null;
        final String ifMatch = null;
        final String ifNoneMatch = null;
        final String requestId = null;
        final String comp = "appendblock";
        final String encryptionKey = null;
        final String encryptionKeySha256 = null;
        final EncryptionAlgorithmType encryptionAlgorithm = null;
        final String encryptionScope = null;
        String transactionalContentMD5Converted = null;
        String transactionalContentCrc64Converted = null;
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        return service.appendBlock(containerName, blob, this.client.getUrl(), body, timeout, contentLength, transactionalContentMD5Converted, transactionalContentCrc64Converted, leaseId, maxSize, appendPosition, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, this.client.getVersion(), requestId, comp, encryptionKey, encryptionKeySha256, encryptionAlgorithm, encryptionScope, context);
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
     * @param leaseId If specified, the operation only succeeds if the resource's lease is active and matches this ID.
     * @param maxSize Optional conditional header. The max length in bytes permitted for the append blob. If the Append Block operation would cause the blob to exceed that limit or if the blob size is already greater than the value specified in this header, the request will fail with MaxBlobSizeConditionNotMet error (HTTP status code 412 - Precondition Failed).
     * @param appendPosition Optional conditional header, used only for the Append Block operation. A number indicating the byte offset to compare. Append Block will succeed only if the append position is equal to this number. If it is not, the request will fail with the AppendPositionConditionNotMet error (HTTP status code 412 - Precondition Failed).
     * @param ifModifiedSince Specify this header value to operate only on a blob if it has been modified since the specified date/time.
     * @param ifUnmodifiedSince Specify this header value to operate only on a blob if it has not been modified since the specified date/time.
     * @param ifMatch Specify an ETag value to operate only on blobs with a matching value.
     * @param ifNoneMatch Specify an ETag value to operate only on blobs without a matching value.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param cpkInfo Additional parameters for the operation.
     * @param encryptionScope Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AppendBlobsAppendBlockResponse> appendBlockWithRestResponseAsync(String containerName, String blob, Flux<ByteBuffer> body, long contentLength, Integer timeout, byte[] transactionalContentMD5, byte[] transactionalContentCrc64, String leaseId, Long maxSize, Long appendPosition, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, String requestId, CpkInfo cpkInfo, EncryptionScope encryptionScope, Context context) {
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
        String encryptionScope1 = null;
        if (encryptionScope != null) {
            encryptionScope1 = encryptionScope.getEncryptionScope();
        }
        String transactionalContentMD5Converted = Base64Util.encodeToString(transactionalContentMD5);
        String transactionalContentCrc64Converted = Base64Util.encodeToString(transactionalContentCrc64);
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.appendBlock(containerName, blob, this.client.getUrl(), body, timeout, contentLength, transactionalContentMD5Converted, transactionalContentCrc64Converted, leaseId, maxSize, appendPosition, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, this.client.getVersion(), requestId, comp, encryptionKey, encryptionKeySha256, encryptionAlgorithm, encryptionScope1, context);
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
        final String leaseId = null;
        final Long maxSize = null;
        final Long appendPosition = null;
        final String ifMatch = null;
        final String ifNoneMatch = null;
        final String sourceIfMatch = null;
        final String sourceIfNoneMatch = null;
        final String requestId = null;
        final String comp = "appendblock";
        final String encryptionKey = null;
        final String encryptionKeySha256 = null;
        final EncryptionAlgorithmType encryptionAlgorithm = null;
        final String encryptionScope = null;
        String sourceContentMD5Converted = null;
        String sourceContentcrc64Converted = null;
        String transactionalContentMD5Converted = null;
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        DateTimeRfc1123 sourceIfModifiedSinceConverted = null;
        DateTimeRfc1123 sourceIfUnmodifiedSinceConverted = null;
        return service.appendBlockFromUrl(containerName, blob, this.client.getUrl(), sourceUrl, sourceRange, sourceContentMD5Converted, sourceContentcrc64Converted, timeout, contentLength, transactionalContentMD5Converted, leaseId, maxSize, appendPosition, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, sourceIfModifiedSinceConverted, sourceIfUnmodifiedSinceConverted, sourceIfMatch, sourceIfNoneMatch, this.client.getVersion(), requestId, comp, encryptionKey, encryptionKeySha256, encryptionAlgorithm, encryptionScope, context);
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
     * @param leaseId If specified, the operation only succeeds if the resource's lease is active and matches this ID.
     * @param maxSize Optional conditional header. The max length in bytes permitted for the append blob. If the Append Block operation would cause the blob to exceed that limit or if the blob size is already greater than the value specified in this header, the request will fail with MaxBlobSizeConditionNotMet error (HTTP status code 412 - Precondition Failed).
     * @param appendPosition Optional conditional header, used only for the Append Block operation. A number indicating the byte offset to compare. Append Block will succeed only if the append position is equal to this number. If it is not, the request will fail with the AppendPositionConditionNotMet error (HTTP status code 412 - Precondition Failed).
     * @param ifModifiedSince Specify this header value to operate only on a blob if it has been modified since the specified date/time.
     * @param ifUnmodifiedSince Specify this header value to operate only on a blob if it has not been modified since the specified date/time.
     * @param ifMatch Specify an ETag value to operate only on blobs with a matching value.
     * @param ifNoneMatch Specify an ETag value to operate only on blobs without a matching value.
     * @param sourceIfModifiedSince Specify this header value to operate only on a blob if it has been modified since the specified date/time.
     * @param sourceIfUnmodifiedSince Specify this header value to operate only on a blob if it has not been modified since the specified date/time.
     * @param sourceIfMatch Specify an ETag value to operate only on blobs with a matching value.
     * @param sourceIfNoneMatch Specify an ETag value to operate only on blobs without a matching value.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param cpkInfo Additional parameters for the operation.
     * @param encryptionScope Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AppendBlobsAppendBlockFromUrlResponse> appendBlockFromUrlWithRestResponseAsync(String containerName, String blob, URL sourceUrl, long contentLength, String sourceRange, byte[] sourceContentMD5, byte[] sourceContentcrc64, Integer timeout, byte[] transactionalContentMD5, String leaseId, Long maxSize, Long appendPosition, OffsetDateTime ifModifiedSince, OffsetDateTime ifUnmodifiedSince, String ifMatch, String ifNoneMatch, OffsetDateTime sourceIfModifiedSince, OffsetDateTime sourceIfUnmodifiedSince, String sourceIfMatch, String sourceIfNoneMatch, String requestId, CpkInfo cpkInfo, EncryptionScope encryptionScope, Context context) {
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
        String encryptionScope1 = null;
        if (encryptionScope != null) {
            encryptionScope1 = encryptionScope.getEncryptionScope();
        }
        String sourceContentMD5Converted = Base64Util.encodeToString(sourceContentMD5);
        String sourceContentcrc64Converted = Base64Util.encodeToString(sourceContentcrc64);
        String transactionalContentMD5Converted = Base64Util.encodeToString(transactionalContentMD5);
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        DateTimeRfc1123 sourceIfModifiedSinceConverted = sourceIfModifiedSince == null ? null : new DateTimeRfc1123(sourceIfModifiedSince);
        DateTimeRfc1123 sourceIfUnmodifiedSinceConverted = sourceIfUnmodifiedSince == null ? null : new DateTimeRfc1123(sourceIfUnmodifiedSince);
        return service.appendBlockFromUrl(containerName, blob, this.client.getUrl(), sourceUrl, sourceRange, sourceContentMD5Converted, sourceContentcrc64Converted, timeout, contentLength, transactionalContentMD5Converted, leaseId, maxSize, appendPosition, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, sourceIfModifiedSinceConverted, sourceIfUnmodifiedSinceConverted, sourceIfMatch, sourceIfNoneMatch, this.client.getVersion(), requestId, comp, encryptionKey, encryptionKeySha256, encryptionAlgorithm, encryptionScope1, context);
    }
}
