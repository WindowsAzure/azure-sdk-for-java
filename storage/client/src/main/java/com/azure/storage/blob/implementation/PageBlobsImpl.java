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
import com.azure.storage.blob.models.EncryptionAlgorithmType;
import com.azure.storage.blob.models.LeaseAccessConditions;
import com.azure.storage.blob.models.ModifiedAccessConditions;
import com.azure.storage.blob.models.PageBlobsClearPagesResponse;
import com.azure.storage.blob.models.PageBlobsCopyIncrementalResponse;
import com.azure.storage.blob.models.PageBlobsCreateResponse;
import com.azure.storage.blob.models.PageBlobsGetPageRangesDiffResponse;
import com.azure.storage.blob.models.PageBlobsGetPageRangesResponse;
import com.azure.storage.blob.models.PageBlobsResizeResponse;
import com.azure.storage.blob.models.PageBlobsUpdateSequenceNumberResponse;
import com.azure.storage.blob.models.PageBlobsUploadPagesFromURLResponse;
import com.azure.storage.blob.models.PageBlobsUploadPagesResponse;
import com.azure.storage.blob.models.SequenceNumberAccessConditions;
import com.azure.storage.blob.models.SequenceNumberActionType;
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
 * PageBlobs.
 */
public final class PageBlobsImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private PageBlobsService service;

    /**
     * The service client containing this operation class.
     */
    private AzureBlobStorageImpl client;

    /**
     * Initializes an instance of PageBlobsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public PageBlobsImpl(AzureBlobStorageImpl client) {
        this.service = RestProxy.create(PageBlobsService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for PageBlobs to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{url}")
    @Service("Storage Blobs PageBlobs")
    private interface PageBlobsService {
        @PUT("{containerName}/{blob}")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<PageBlobsCreateResponse> create(@PathParam("containerName") String containerName, @PathParam("blob") String blob, @HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("Content-Length") long contentLength, @HeaderParam("x-ms-meta-") Map<String, String> metadata, @QueryParam("x-ms-encryption-key") String encryptionKey, @QueryParam("x-ms-encryption-key-sha256") String encryptionKeySha256, @QueryParam("x-ms-encryption-algorithm") EncryptionAlgorithmType encryptionAlgorithm, @HeaderParam("x-ms-blob-content-length") long blobContentLength, @HeaderParam("x-ms-blob-sequence-number") Long blobSequenceNumber, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @HeaderParam("x-ms-blob-type") String blobType, @HeaderParam("x-ms-blob-content-type") String blobContentType, @HeaderParam("x-ms-blob-content-encoding") String blobContentEncoding, @HeaderParam("x-ms-blob-content-language") String blobContentLanguage, @HeaderParam("x-ms-blob-content-md5") String blobContentMD5, @HeaderParam("x-ms-blob-cache-control") String blobCacheControl, @HeaderParam("x-ms-blob-content-disposition") String blobContentDisposition, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, Context context);

        @PUT("{containerName}/{blob}")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<PageBlobsUploadPagesResponse> uploadPages(@PathParam("containerName") String containerName, @PathParam("blob") String blob, @HostParam("url") String url, @BodyParam("application/octet-stream") Flux<ByteBuf> body, @HeaderParam("Content-Length") long contentLength, @HeaderParam("Content-MD5") String transactionalContentMD5, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-range") String range, @QueryParam("x-ms-encryption-key") String encryptionKey, @QueryParam("x-ms-encryption-key-sha256") String encryptionKeySha256, @QueryParam("x-ms-encryption-algorithm") EncryptionAlgorithmType encryptionAlgorithm, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("comp") String comp, @HeaderParam("x-ms-page-write") String pageWrite, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("x-ms-if-sequence-number-le") Long ifSequenceNumberLessThanOrEqualTo, @HeaderParam("x-ms-if-sequence-number-lt") Long ifSequenceNumberLessThan, @HeaderParam("x-ms-if-sequence-number-eq") Long ifSequenceNumberEqualTo, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, Context context);

        @PUT("{containerName}/{blob}")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<PageBlobsClearPagesResponse> clearPages(@PathParam("containerName") String containerName, @PathParam("blob") String blob, @HostParam("url") String url, @HeaderParam("Content-Length") long contentLength, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-range") String range, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("comp") String comp, @HeaderParam("x-ms-page-write") String pageWrite, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("x-ms-if-sequence-number-le") Long ifSequenceNumberLessThanOrEqualTo, @HeaderParam("x-ms-if-sequence-number-lt") Long ifSequenceNumberLessThan, @HeaderParam("x-ms-if-sequence-number-eq") Long ifSequenceNumberEqualTo, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, Context context);

        @PUT("{containerName}/{blob}")
        @ExpectedResponses({201, 304})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<PageBlobsUploadPagesFromURLResponse> uploadPagesFromURL(@PathParam("containerName") String containerName, @PathParam("blob") String blob, @HostParam("url") String url, @HeaderParam("x-ms-copy-source") URL copySource, @HeaderParam("x-ms-source-range") String sourceRange, @HeaderParam("x-ms-source-content-md5") String sourceContentMD5, @HeaderParam("Content-Length") long contentLength, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-range") String range, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("comp") String comp, @HeaderParam("x-ms-page-write") String pageWrite, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("x-ms-if-sequence-number-le") Long ifSequenceNumberLessThanOrEqualTo, @HeaderParam("x-ms-if-sequence-number-lt") Long ifSequenceNumberLessThan, @HeaderParam("x-ms-if-sequence-number-eq") Long ifSequenceNumberEqualTo, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, @HeaderParam("x-ms-source-if-modified-since") DateTimeRfc1123 sourceIfModifiedSince, @HeaderParam("x-ms-source-if-unmodified-since") DateTimeRfc1123 sourceIfUnmodifiedSince, @HeaderParam("x-ms-source-if-match") String sourceIfMatch, @HeaderParam("x-ms-source-if-none-match") String sourceIfNoneMatch, Context context);

        @GET("{containerName}/{blob}")
        @ExpectedResponses({200, 304})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<PageBlobsGetPageRangesResponse> getPageRanges(@PathParam("containerName") String containerName, @PathParam("blob") String blob, @HostParam("url") String url, @QueryParam("snapshot") String snapshot, @QueryParam("versionid") String versionId, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-range") String range, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("comp") String comp, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, Context context);

        @GET("{containerName}/{blob}")
        @ExpectedResponses({200, 304})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<PageBlobsGetPageRangesDiffResponse> getPageRangesDiff(@PathParam("containerName") String containerName, @PathParam("blob") String blob, @HostParam("url") String url, @QueryParam("snapshot") String snapshot, @QueryParam("versionid") String versionId, @QueryParam("timeout") Integer timeout, @QueryParam("prevsnapshot") String prevsnapshot, @HeaderParam("x-ms-range") String range, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("comp") String comp, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, Context context);

        @PUT("{containerName}/{blob}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<PageBlobsResizeResponse> resize(@PathParam("containerName") String containerName, @PathParam("blob") String blob, @HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-blob-content-length") long blobContentLength, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("comp") String comp, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, Context context);

        @PUT("{containerName}/{blob}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<PageBlobsUpdateSequenceNumberResponse> updateSequenceNumber(@PathParam("containerName") String containerName, @PathParam("blob") String blob, @HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-sequence-number-action") SequenceNumberActionType sequenceNumberAction, @HeaderParam("x-ms-blob-sequence-number") Long blobSequenceNumber, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("comp") String comp, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, Context context);

        @PUT("{containerName}/{blob}")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<PageBlobsCopyIncrementalResponse> copyIncremental(@PathParam("containerName") String containerName, @PathParam("blob") String blob, @HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-copy-source") URL copySource, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("comp") String comp, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, Context context);
    }

    /**
     * The Create operation creates a new page blob.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param contentLength The length of the request.
     * @param blobContentLength This header specifies the maximum size for the page blob, up to 1 TB. The page blob size must be aligned to a 512-byte boundary.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<PageBlobsCreateResponse> createWithRestResponseAsync(String containerName, String blob, long contentLength, long blobContentLength, Context context) {
        final Integer timeout = null;
        final Map<String, String> metadata = null;
        final String encryptionKey = null;
        final String encryptionKeySha256 = null;
        final EncryptionAlgorithmType encryptionAlgorithm = null;
        final Long blobSequenceNumber = 0L;
        final String requestId = null;
        final String blobType = "PageBlob";
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
        return service.create(containerName, blob, this.client.url(), timeout, contentLength, metadata, encryptionKey, encryptionKeySha256, encryptionAlgorithm, blobContentLength, blobSequenceNumber, this.client.version(), requestId, blobType, blobContentType, blobContentEncoding, blobContentLanguage, blobContentMD5Converted, blobCacheControl, blobContentDisposition, leaseId, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, context);
    }

    /**
     * The Create operation creates a new page blob.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param contentLength The length of the request.
     * @param blobContentLength This header specifies the maximum size for the page blob, up to 1 TB. The page blob size must be aligned to a 512-byte boundary.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param metadata Optional. Specifies a user-defined name-value pair associated with the blob. If no name-value pairs are specified, the operation will copy the metadata from the source blob or file to the destination blob. If one or more name-value pairs are specified, the destination blob is created with the specified metadata, and metadata is not copied from the source blob or file. Note that beginning with version 2009-09-19, metadata names must adhere to the naming rules for C# identifiers. See Naming and Referencing Containers, Blobs, and Metadata for more information.
     * @param encryptionKey Optional. Specifies the encryption key to use to encrypt the data provided in the request. If not specified, encryption is performed with the root account encryption key.  For more information, see Encryption at Rest for Azure Storage Services.
     * @param encryptionKeySha256 The SHA-256 hash of the provided encryption key. Must be provided if the x-ms-encryption-key header is provided.
     * @param encryptionAlgorithm The algorithm used to produce the encryption key hash. Currently, the only accepted value is "AES256". Must be provided if the x-ms-encryption-key header is provided. Possible values include: 'AES256'.
     * @param blobSequenceNumber Set for page blobs only. The sequence number is a user-controlled value that you can use to track requests. The value of the sequence number must be between 0 and 2^63 - 1.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param blobHTTPHeaders Additional parameters for the operation.
     * @param leaseAccessConditions Additional parameters for the operation.
     * @param modifiedAccessConditions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<PageBlobsCreateResponse> createWithRestResponseAsync(String containerName, String blob, long contentLength, long blobContentLength, Integer timeout, Map<String, String> metadata, String encryptionKey, String encryptionKeySha256, EncryptionAlgorithmType encryptionAlgorithm, Long blobSequenceNumber, String requestId, BlobHTTPHeaders blobHTTPHeaders, LeaseAccessConditions leaseAccessConditions, ModifiedAccessConditions modifiedAccessConditions, Context context) {
        final String blobType = "PageBlob";
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
        return service.create(containerName, blob, this.client.url(), timeout, contentLength, metadata, encryptionKey, encryptionKeySha256, encryptionAlgorithm, blobContentLength, blobSequenceNumber, this.client.version(), requestId, blobType, blobContentType, blobContentEncoding, blobContentLanguage, blobContentMD5Converted, blobCacheControl, blobContentDisposition, leaseId, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, context);
    }

    /**
     * The Upload Pages operation writes a range of pages to a page blob.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param body Initial data.
     * @param contentLength The length of the request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<PageBlobsUploadPagesResponse> uploadPagesWithRestResponseAsync(String containerName, String blob, Flux<ByteBuf> body, long contentLength, Context context) {
        final Integer timeout = null;
        final String range = null;
        final String encryptionKey = null;
        final String encryptionKeySha256 = null;
        final EncryptionAlgorithmType encryptionAlgorithm = null;
        final String requestId = null;
        final String comp = "page";
        final String pageWrite = "update";
        final String leaseId = null;
        final Long ifSequenceNumberLessThanOrEqualTo = null;
        final Long ifSequenceNumberLessThan = null;
        final Long ifSequenceNumberEqualTo = null;
        final String ifMatch = null;
        final String ifNoneMatch = null;
        String transactionalContentMD5Converted = null;
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        return service.uploadPages(containerName, blob, this.client.url(), body, contentLength, transactionalContentMD5Converted, timeout, range, encryptionKey, encryptionKeySha256, encryptionAlgorithm, this.client.version(), requestId, comp, pageWrite, leaseId, ifSequenceNumberLessThanOrEqualTo, ifSequenceNumberLessThan, ifSequenceNumberEqualTo, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, context);
    }

    /**
     * The Upload Pages operation writes a range of pages to a page blob.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param body Initial data.
     * @param contentLength The length of the request.
     * @param transactionalContentMD5 Specify the transactional md5 for the body, to be validated by the service.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param range Return only the bytes of the blob in the specified range.
     * @param encryptionKey Optional. Specifies the encryption key to use to encrypt the data provided in the request. If not specified, encryption is performed with the root account encryption key.  For more information, see Encryption at Rest for Azure Storage Services.
     * @param encryptionKeySha256 The SHA-256 hash of the provided encryption key. Must be provided if the x-ms-encryption-key header is provided.
     * @param encryptionAlgorithm The algorithm used to produce the encryption key hash. Currently, the only accepted value is "AES256". Must be provided if the x-ms-encryption-key header is provided. Possible values include: 'AES256'.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param leaseAccessConditions Additional parameters for the operation.
     * @param sequenceNumberAccessConditions Additional parameters for the operation.
     * @param modifiedAccessConditions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<PageBlobsUploadPagesResponse> uploadPagesWithRestResponseAsync(String containerName, String blob, Flux<ByteBuf> body, long contentLength, byte[] transactionalContentMD5, Integer timeout, String range, String encryptionKey, String encryptionKeySha256, EncryptionAlgorithmType encryptionAlgorithm, String requestId, LeaseAccessConditions leaseAccessConditions, SequenceNumberAccessConditions sequenceNumberAccessConditions, ModifiedAccessConditions modifiedAccessConditions, Context context) {
        final String comp = "page";
        final String pageWrite = "update";
        String leaseId = null;
        if (leaseAccessConditions != null) {
            leaseId = leaseAccessConditions.leaseId();
        }
        Long ifSequenceNumberLessThanOrEqualTo = null;
        if (sequenceNumberAccessConditions != null) {
            ifSequenceNumberLessThanOrEqualTo = sequenceNumberAccessConditions.ifSequenceNumberLessThanOrEqualTo();
        }
        Long ifSequenceNumberLessThan = null;
        if (sequenceNumberAccessConditions != null) {
            ifSequenceNumberLessThan = sequenceNumberAccessConditions.ifSequenceNumberLessThan();
        }
        Long ifSequenceNumberEqualTo = null;
        if (sequenceNumberAccessConditions != null) {
            ifSequenceNumberEqualTo = sequenceNumberAccessConditions.ifSequenceNumberEqualTo();
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
        String transactionalContentMD5Converted = Base64Util.encodeToString(transactionalContentMD5);
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.uploadPages(containerName, blob, this.client.url(), body, contentLength, transactionalContentMD5Converted, timeout, range, encryptionKey, encryptionKeySha256, encryptionAlgorithm, this.client.version(), requestId, comp, pageWrite, leaseId, ifSequenceNumberLessThanOrEqualTo, ifSequenceNumberLessThan, ifSequenceNumberEqualTo, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, context);
    }

    /**
     * The Clear Pages operation clears a set of pages from a page blob.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param contentLength The length of the request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<PageBlobsClearPagesResponse> clearPagesWithRestResponseAsync(String containerName, String blob, long contentLength, Context context) {
        final Integer timeout = null;
        final String range = null;
        final String requestId = null;
        final String comp = "page";
        final String pageWrite = "clear";
        final String leaseId = null;
        final Long ifSequenceNumberLessThanOrEqualTo = null;
        final Long ifSequenceNumberLessThan = null;
        final Long ifSequenceNumberEqualTo = null;
        final String ifMatch = null;
        final String ifNoneMatch = null;
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        return service.clearPages(containerName, blob, this.client.url(), contentLength, timeout, range, this.client.version(), requestId, comp, pageWrite, leaseId, ifSequenceNumberLessThanOrEqualTo, ifSequenceNumberLessThan, ifSequenceNumberEqualTo, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, context);
    }

    /**
     * The Clear Pages operation clears a set of pages from a page blob.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param contentLength The length of the request.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param range Return only the bytes of the blob in the specified range.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param leaseAccessConditions Additional parameters for the operation.
     * @param sequenceNumberAccessConditions Additional parameters for the operation.
     * @param modifiedAccessConditions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<PageBlobsClearPagesResponse> clearPagesWithRestResponseAsync(String containerName, String blob, long contentLength, Integer timeout, String range, String requestId, LeaseAccessConditions leaseAccessConditions, SequenceNumberAccessConditions sequenceNumberAccessConditions, ModifiedAccessConditions modifiedAccessConditions, Context context) {
        final String comp = "page";
        final String pageWrite = "clear";
        String leaseId = null;
        if (leaseAccessConditions != null) {
            leaseId = leaseAccessConditions.leaseId();
        }
        Long ifSequenceNumberLessThanOrEqualTo = null;
        if (sequenceNumberAccessConditions != null) {
            ifSequenceNumberLessThanOrEqualTo = sequenceNumberAccessConditions.ifSequenceNumberLessThanOrEqualTo();
        }
        Long ifSequenceNumberLessThan = null;
        if (sequenceNumberAccessConditions != null) {
            ifSequenceNumberLessThan = sequenceNumberAccessConditions.ifSequenceNumberLessThan();
        }
        Long ifSequenceNumberEqualTo = null;
        if (sequenceNumberAccessConditions != null) {
            ifSequenceNumberEqualTo = sequenceNumberAccessConditions.ifSequenceNumberEqualTo();
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
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.clearPages(containerName, blob, this.client.url(), contentLength, timeout, range, this.client.version(), requestId, comp, pageWrite, leaseId, ifSequenceNumberLessThanOrEqualTo, ifSequenceNumberLessThan, ifSequenceNumberEqualTo, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, context);
    }

    /**
     * The Upload Pages operation writes a range of pages to a page blob where the contents are read from a URL.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param sourceUrl Specify a URL to the copy source.
     * @param sourceRange Bytes of source data in the specified range. The length of this range should match the ContentLength header and x-ms-range/Range destination range header.
     * @param contentLength The length of the request.
     * @param range The range of bytes to which the source range would be written. The range should be 512 aligned and range-end is required.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<PageBlobsUploadPagesFromURLResponse> uploadPagesFromURLWithRestResponseAsync(String containerName, String blob, URL sourceUrl, String sourceRange, long contentLength, String range, Context context) {
        final Integer timeout = null;
        final String requestId = null;
        final String comp = "page";
        final String pageWrite = "update";
        final String leaseId = null;
        final Long ifSequenceNumberLessThanOrEqualTo = null;
        final Long ifSequenceNumberLessThan = null;
        final Long ifSequenceNumberEqualTo = null;
        final String ifMatch = null;
        final String ifNoneMatch = null;
        final String sourceIfMatch = null;
        final String sourceIfNoneMatch = null;
        String sourceContentMD5Converted = null;
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        DateTimeRfc1123 sourceIfModifiedSinceConverted = null;
        DateTimeRfc1123 sourceIfUnmodifiedSinceConverted = null;
        return service.uploadPagesFromURL(containerName, blob, this.client.url(), sourceUrl, sourceRange, sourceContentMD5Converted, contentLength, timeout, range, this.client.version(), requestId, comp, pageWrite, leaseId, ifSequenceNumberLessThanOrEqualTo, ifSequenceNumberLessThan, ifSequenceNumberEqualTo, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, sourceIfModifiedSinceConverted, sourceIfUnmodifiedSinceConverted, sourceIfMatch, sourceIfNoneMatch, context);
    }

    /**
     * The Upload Pages operation writes a range of pages to a page blob where the contents are read from a URL.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param sourceUrl Specify a URL to the copy source.
     * @param sourceRange Bytes of source data in the specified range. The length of this range should match the ContentLength header and x-ms-range/Range destination range header.
     * @param contentLength The length of the request.
     * @param range The range of bytes to which the source range would be written. The range should be 512 aligned and range-end is required.
     * @param sourceContentMD5 Specify the md5 calculated for the range of bytes that must be read from the copy source.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param leaseAccessConditions Additional parameters for the operation.
     * @param sequenceNumberAccessConditions Additional parameters for the operation.
     * @param modifiedAccessConditions Additional parameters for the operation.
     * @param sourceModifiedAccessConditions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<PageBlobsUploadPagesFromURLResponse> uploadPagesFromURLWithRestResponseAsync(String containerName, String blob, URL sourceUrl, String sourceRange, long contentLength, String range, byte[] sourceContentMD5, Integer timeout, String requestId, LeaseAccessConditions leaseAccessConditions, SequenceNumberAccessConditions sequenceNumberAccessConditions, ModifiedAccessConditions modifiedAccessConditions, SourceModifiedAccessConditions sourceModifiedAccessConditions, Context context) {
        final String comp = "page";
        final String pageWrite = "update";
        String leaseId = null;
        if (leaseAccessConditions != null) {
            leaseId = leaseAccessConditions.leaseId();
        }
        Long ifSequenceNumberLessThanOrEqualTo = null;
        if (sequenceNumberAccessConditions != null) {
            ifSequenceNumberLessThanOrEqualTo = sequenceNumberAccessConditions.ifSequenceNumberLessThanOrEqualTo();
        }
        Long ifSequenceNumberLessThan = null;
        if (sequenceNumberAccessConditions != null) {
            ifSequenceNumberLessThan = sequenceNumberAccessConditions.ifSequenceNumberLessThan();
        }
        Long ifSequenceNumberEqualTo = null;
        if (sequenceNumberAccessConditions != null) {
            ifSequenceNumberEqualTo = sequenceNumberAccessConditions.ifSequenceNumberEqualTo();
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
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        DateTimeRfc1123 sourceIfModifiedSinceConverted = sourceIfModifiedSince == null ? null : new DateTimeRfc1123(sourceIfModifiedSince);
        DateTimeRfc1123 sourceIfUnmodifiedSinceConverted = sourceIfUnmodifiedSince == null ? null : new DateTimeRfc1123(sourceIfUnmodifiedSince);
        return service.uploadPagesFromURL(containerName, blob, this.client.url(), sourceUrl, sourceRange, sourceContentMD5Converted, contentLength, timeout, range, this.client.version(), requestId, comp, pageWrite, leaseId, ifSequenceNumberLessThanOrEqualTo, ifSequenceNumberLessThan, ifSequenceNumberEqualTo, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, sourceIfModifiedSinceConverted, sourceIfUnmodifiedSinceConverted, sourceIfMatch, sourceIfNoneMatch, context);
    }

    /**
     * The Get Page Ranges operation returns the list of valid page ranges for a page blob, version or snapshot of a page blob.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<PageBlobsGetPageRangesResponse> getPageRangesWithRestResponseAsync(String containerName, String blob, Context context) {
        final String snapshot = null;
        final String versionId = null;
        final Integer timeout = null;
        final String range = null;
        final String requestId = null;
        final String comp = "pagelist";
        final String leaseId = null;
        final String ifMatch = null;
        final String ifNoneMatch = null;
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        return service.getPageRanges(containerName, blob, this.client.url(), snapshot, versionId, timeout, range, this.client.version(), requestId, comp, leaseId, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, context);
    }

    /**
     * The Get Page Ranges operation returns the list of valid page ranges for a page blob, version or snapshot of a page blob.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param snapshot The snapshot parameter is an opaque DateTime value that, when present, specifies the blob snapshot to retrieve. For more information on working with blob snapshots, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/creating-a-snapshot-of-a-blob"&gt;Creating a Snapshot of a Blob.&lt;/a&gt;.
     * @param versionId The version ID parameter is an opaque DateTime value that, when present, specifies the blob version to retrieve.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param range Return only the bytes of the blob in the specified range.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param leaseAccessConditions Additional parameters for the operation.
     * @param modifiedAccessConditions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<PageBlobsGetPageRangesResponse> getPageRangesWithRestResponseAsync(String containerName, String blob, String snapshot, String versionId, Integer timeout, String range, String requestId, LeaseAccessConditions leaseAccessConditions, ModifiedAccessConditions modifiedAccessConditions, Context context) {
        final String comp = "pagelist";
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
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.getPageRanges(containerName, blob, this.client.url(), snapshot, versionId, timeout, range, this.client.version(), requestId, comp, leaseId, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, context);
    }

    /**
     * [Update] The Get Page Ranges Diff operation returns the list of valid page ranges for a page blob that were changed between target blob and previous snapshot or version.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<PageBlobsGetPageRangesDiffResponse> getPageRangesDiffWithRestResponseAsync(String containerName, String blob, Context context) {
        final String snapshot = null;
        final String versionId = null;
        final Integer timeout = null;
        final String prevsnapshot = null;
        final String range = null;
        final String requestId = null;
        final String comp = "pagelist";
        final String leaseId = null;
        final String ifMatch = null;
        final String ifNoneMatch = null;
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        return service.getPageRangesDiff(containerName, blob, this.client.url(), snapshot, versionId, timeout, prevsnapshot, range, this.client.version(), requestId, comp, leaseId, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, context);
    }

    /**
     * [Update] The Get Page Ranges Diff operation returns the list of valid page ranges for a page blob that were changed between target blob and previous snapshot or version.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param snapshot The snapshot parameter is an opaque DateTime value that, when present, specifies the blob snapshot to retrieve. For more information on working with blob snapshots, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/creating-a-snapshot-of-a-blob"&gt;Creating a Snapshot of a Blob.&lt;/a&gt;.
     * @param versionId The version ID parameter is an opaque DateTime value that, when present, specifies the blob version to retrieve.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param prevsnapshot Optional in version 2015-07-08 and newer. The prevsnapshot parameter is a DateTime value that specifies that the response will contain only pages that were changed between target blob and previous snapshot. Changed pages include both updated and cleared pages. The target blob may be a snapshot, as long as the snapshot specified by prevsnapshot is the older of the two. Note that incremental snapshots are currently supported only for blobs created on or after January 1, 2016.
     * @param range Return only the bytes of the blob in the specified range.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param leaseAccessConditions Additional parameters for the operation.
     * @param modifiedAccessConditions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<PageBlobsGetPageRangesDiffResponse> getPageRangesDiffWithRestResponseAsync(String containerName, String blob, String snapshot, String versionId, Integer timeout, String prevsnapshot, String range, String requestId, LeaseAccessConditions leaseAccessConditions, ModifiedAccessConditions modifiedAccessConditions, Context context) {
        final String comp = "pagelist";
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
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.getPageRangesDiff(containerName, blob, this.client.url(), snapshot, versionId, timeout, prevsnapshot, range, this.client.version(), requestId, comp, leaseId, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, context);
    }

    /**
     * Resize the Blob.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param blobContentLength This header specifies the maximum size for the page blob, up to 1 TB. The page blob size must be aligned to a 512-byte boundary.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<PageBlobsResizeResponse> resizeWithRestResponseAsync(String containerName, String blob, long blobContentLength, Context context) {
        final Integer timeout = null;
        final String requestId = null;
        final String comp = "properties";
        final String leaseId = null;
        final String ifMatch = null;
        final String ifNoneMatch = null;
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        return service.resize(containerName, blob, this.client.url(), timeout, blobContentLength, this.client.version(), requestId, comp, leaseId, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, context);
    }

    /**
     * Resize the Blob.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param blobContentLength This header specifies the maximum size for the page blob, up to 1 TB. The page blob size must be aligned to a 512-byte boundary.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param leaseAccessConditions Additional parameters for the operation.
     * @param modifiedAccessConditions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<PageBlobsResizeResponse> resizeWithRestResponseAsync(String containerName, String blob, long blobContentLength, Integer timeout, String requestId, LeaseAccessConditions leaseAccessConditions, ModifiedAccessConditions modifiedAccessConditions, Context context) {
        final String comp = "properties";
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
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.resize(containerName, blob, this.client.url(), timeout, blobContentLength, this.client.version(), requestId, comp, leaseId, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, context);
    }

    /**
     * Update the sequence number of the blob.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param sequenceNumberAction Required if the x-ms-blob-sequence-number header is set for the request. This property applies to page blobs only. This property indicates how the service should modify the blob's sequence number. Possible values include: 'max', 'update', 'increment'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<PageBlobsUpdateSequenceNumberResponse> updateSequenceNumberWithRestResponseAsync(String containerName, String blob, SequenceNumberActionType sequenceNumberAction, Context context) {
        final Integer timeout = null;
        final Long blobSequenceNumber = 0L;
        final String requestId = null;
        final String comp = "properties";
        final String leaseId = null;
        final String ifMatch = null;
        final String ifNoneMatch = null;
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        return service.updateSequenceNumber(containerName, blob, this.client.url(), timeout, sequenceNumberAction, blobSequenceNumber, this.client.version(), requestId, comp, leaseId, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, context);
    }

    /**
     * Update the sequence number of the blob.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param sequenceNumberAction Required if the x-ms-blob-sequence-number header is set for the request. This property applies to page blobs only. This property indicates how the service should modify the blob's sequence number. Possible values include: 'max', 'update', 'increment'.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param blobSequenceNumber Set for page blobs only. The sequence number is a user-controlled value that you can use to track requests. The value of the sequence number must be between 0 and 2^63 - 1.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param leaseAccessConditions Additional parameters for the operation.
     * @param modifiedAccessConditions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<PageBlobsUpdateSequenceNumberResponse> updateSequenceNumberWithRestResponseAsync(String containerName, String blob, SequenceNumberActionType sequenceNumberAction, Integer timeout, Long blobSequenceNumber, String requestId, LeaseAccessConditions leaseAccessConditions, ModifiedAccessConditions modifiedAccessConditions, Context context) {
        final String comp = "properties";
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
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.updateSequenceNumber(containerName, blob, this.client.url(), timeout, sequenceNumberAction, blobSequenceNumber, this.client.version(), requestId, comp, leaseId, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, context);
    }

    /**
     * The Copy Incremental operation copies a snapshot of the source page blob to a destination page blob. The snapshot is copied such that only the differential changes between the previously copied snapshot are transferred to the destination. The copied snapshots are complete copies of the original snapshot and can be read or copied from as usual. This API is supported since REST version 2016-05-31.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param copySource Specifies the name of the source page blob snapshot. This value is a URL of up to 2 KB in length that specifies a page blob snapshot. The value should be URL-encoded as it would appear in a request URI. The source blob must either be public or must be authenticated via a shared access signature.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<PageBlobsCopyIncrementalResponse> copyIncrementalWithRestResponseAsync(String containerName, String blob, URL copySource, Context context) {
        final Integer timeout = null;
        final String requestId = null;
        final String comp = "incrementalcopy";
        final String ifMatch = null;
        final String ifNoneMatch = null;
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        return service.copyIncremental(containerName, blob, this.client.url(), timeout, copySource, this.client.version(), requestId, comp, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, context);
    }

    /**
     * The Copy Incremental operation copies a snapshot of the source page blob to a destination page blob. The snapshot is copied such that only the differential changes between the previously copied snapshot are transferred to the destination. The copied snapshots are complete copies of the original snapshot and can be read or copied from as usual. This API is supported since REST version 2016-05-31.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param copySource Specifies the name of the source page blob snapshot. This value is a URL of up to 2 KB in length that specifies a page blob snapshot. The value should be URL-encoded as it would appear in a request URI. The source blob must either be public or must be authenticated via a shared access signature.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param modifiedAccessConditions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<PageBlobsCopyIncrementalResponse> copyIncrementalWithRestResponseAsync(String containerName, String blob, URL copySource, Integer timeout, String requestId, ModifiedAccessConditions modifiedAccessConditions, Context context) {
        final String comp = "incrementalcopy";
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
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.copyIncremental(containerName, blob, this.client.url(), timeout, copySource, this.client.version(), requestId, comp, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, context);
    }
}
