// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob.implementation;

import com.azure.core.annotations.DELETE;
import com.azure.core.annotations.ExpectedResponses;
import com.azure.core.annotations.GET;
import com.azure.core.annotations.HEAD;
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
import com.azure.storage.blob.models.AccessTier;
import com.azure.storage.blob.models.BlobHTTPHeaders;
import com.azure.storage.blob.models.BlobsAbortCopyFromURLResponse;
import com.azure.storage.blob.models.BlobsAcquireLeaseResponse;
import com.azure.storage.blob.models.BlobsBreakLeaseResponse;
import com.azure.storage.blob.models.BlobsChangeLeaseResponse;
import com.azure.storage.blob.models.BlobsCopyFromURLResponse;
import com.azure.storage.blob.models.BlobsCreateSnapshotResponse;
import com.azure.storage.blob.models.BlobsDeleteResponse;
import com.azure.storage.blob.models.BlobsDownloadResponse;
import com.azure.storage.blob.models.BlobsGetAccountInfoResponse;
import com.azure.storage.blob.models.BlobsGetPropertiesResponse;
import com.azure.storage.blob.models.BlobsReleaseLeaseResponse;
import com.azure.storage.blob.models.BlobsRenewLeaseResponse;
import com.azure.storage.blob.models.BlobsSetHTTPHeadersResponse;
import com.azure.storage.blob.models.BlobsSetMetadataResponse;
import com.azure.storage.blob.models.BlobsSetTierResponse;
import com.azure.storage.blob.models.BlobsStartCopyFromURLResponse;
import com.azure.storage.blob.models.BlobsUndeleteResponse;
import com.azure.storage.blob.models.DeleteSnapshotsOptionType;
import com.azure.storage.blob.models.EncryptionAlgorithmType;
import com.azure.storage.blob.models.LeaseAccessConditions;
import com.azure.storage.blob.models.ModifiedAccessConditions;
import com.azure.storage.blob.models.SourceModifiedAccessConditions;
import com.azure.storage.blob.models.StorageErrorException;
import java.net.URL;
import java.time.OffsetDateTime;
import java.util.Map;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * Blobs.
 */
public final class BlobsImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private BlobsService service;

    /**
     * The service client containing this operation class.
     */
    private AzureBlobStorageImpl client;

    /**
     * Initializes an instance of BlobsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public BlobsImpl(AzureBlobStorageImpl client) {
        this.service = RestProxy.create(BlobsService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for Blobs to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{url}")
    @Service("Storage Blobs")
    private interface BlobsService {
        @GET("{containerName}/{blob}")
        @ExpectedResponses({200, 206, 304})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<BlobsDownloadResponse> download(@PathParam("containerName") String containerName, @PathParam("blob") String blob, @HostParam("url") String url, @QueryParam("snapshot") String snapshot, @QueryParam("versionid") String versionId, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-range") String range, @HeaderParam("x-ms-range-get-content-md5") Boolean rangeGetContentMD5, @QueryParam("x-ms-encryption-key") String encryptionKey, @QueryParam("x-ms-encryption-key-sha256") String encryptionKeySha256, @QueryParam("x-ms-encryption-algorithm") EncryptionAlgorithmType encryptionAlgorithm, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, Context context);

        @HEAD("{containerName}/{blob}")
        @ExpectedResponses({200, 304})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<BlobsGetPropertiesResponse> getProperties(@PathParam("containerName") String containerName, @PathParam("blob") String blob, @HostParam("url") String url, @QueryParam("snapshot") String snapshot, @QueryParam("versionid") String versionId, @QueryParam("timeout") Integer timeout, @QueryParam("x-ms-encryption-key") String encryptionKey, @QueryParam("x-ms-encryption-key-sha256") String encryptionKeySha256, @QueryParam("x-ms-encryption-algorithm") EncryptionAlgorithmType encryptionAlgorithm, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, Context context);

        @DELETE("{containerName}/{blob}")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<BlobsDeleteResponse> delete(@PathParam("containerName") String containerName, @PathParam("blob") String blob, @HostParam("url") String url, @QueryParam("snapshot") String snapshot, @QueryParam("versionid") String versionId, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-delete-snapshots") DeleteSnapshotsOptionType deleteSnapshots, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, Context context);

        @PUT("{containerName}/{blob}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<BlobsUndeleteResponse> undelete(@PathParam("containerName") String containerName, @PathParam("blob") String blob, @HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("comp") String comp, Context context);

        @PUT("{containerName}/{blob}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<BlobsSetHTTPHeadersResponse> setHTTPHeaders(@PathParam("containerName") String containerName, @PathParam("blob") String blob, @HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("comp") String comp, @HeaderParam("x-ms-blob-cache-control") String blobCacheControl, @HeaderParam("x-ms-blob-content-type") String blobContentType, @HeaderParam("x-ms-blob-content-md5") String blobContentMD5, @HeaderParam("x-ms-blob-content-encoding") String blobContentEncoding, @HeaderParam("x-ms-blob-content-language") String blobContentLanguage, @HeaderParam("x-ms-blob-content-disposition") String blobContentDisposition, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, Context context);

        @PUT("{containerName}/{blob}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<BlobsSetMetadataResponse> setMetadata(@PathParam("containerName") String containerName, @PathParam("blob") String blob, @HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-meta-") Map<String, String> metadata, @QueryParam("x-ms-encryption-key") String encryptionKey, @QueryParam("x-ms-encryption-key-sha256") String encryptionKeySha256, @QueryParam("x-ms-encryption-algorithm") EncryptionAlgorithmType encryptionAlgorithm, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("comp") String comp, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, Context context);

        @PUT("{containerName}/{blob}")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<BlobsAcquireLeaseResponse> acquireLease(@PathParam("containerName") String containerName, @PathParam("blob") String blob, @HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-lease-duration") Integer duration, @HeaderParam("x-ms-proposed-lease-id") String proposedLeaseId, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("comp") String comp, @HeaderParam("x-ms-lease-action") String action, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, Context context);

        @PUT("{containerName}/{blob}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<BlobsReleaseLeaseResponse> releaseLease(@PathParam("containerName") String containerName, @PathParam("blob") String blob, @HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("comp") String comp, @HeaderParam("x-ms-lease-action") String action, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, Context context);

        @PUT("{containerName}/{blob}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<BlobsRenewLeaseResponse> renewLease(@PathParam("containerName") String containerName, @PathParam("blob") String blob, @HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("comp") String comp, @HeaderParam("x-ms-lease-action") String action, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, Context context);

        @PUT("{containerName}/{blob}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<BlobsChangeLeaseResponse> changeLease(@PathParam("containerName") String containerName, @PathParam("blob") String blob, @HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("x-ms-proposed-lease-id") String proposedLeaseId, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("comp") String comp, @HeaderParam("x-ms-lease-action") String action, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, Context context);

        @PUT("{containerName}/{blob}")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<BlobsBreakLeaseResponse> breakLease(@PathParam("containerName") String containerName, @PathParam("blob") String blob, @HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-lease-break-period") Integer breakPeriod, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("comp") String comp, @HeaderParam("x-ms-lease-action") String action, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, Context context);

        @PUT("{containerName}/{blob}")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<BlobsCreateSnapshotResponse> createSnapshot(@PathParam("containerName") String containerName, @PathParam("blob") String blob, @HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-meta-") Map<String, String> metadata, @QueryParam("x-ms-encryption-key") String encryptionKey, @QueryParam("x-ms-encryption-key-sha256") String encryptionKeySha256, @QueryParam("x-ms-encryption-algorithm") EncryptionAlgorithmType encryptionAlgorithm, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("comp") String comp, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, @HeaderParam("x-ms-lease-id") String leaseId, Context context);

        @PUT("{containerName}/{blob}")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<BlobsStartCopyFromURLResponse> startCopyFromURL(@PathParam("containerName") String containerName, @PathParam("blob") String blob, @HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-meta-") Map<String, String> metadata, @HeaderParam("x-ms-copy-source") URL copySource, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @HeaderParam("x-ms-source-if-modified-since") DateTimeRfc1123 sourceIfModifiedSince, @HeaderParam("x-ms-source-if-unmodified-since") DateTimeRfc1123 sourceIfUnmodifiedSince, @HeaderParam("x-ms-source-if-match") String sourceIfMatch, @HeaderParam("x-ms-source-if-none-match") String sourceIfNoneMatch, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, @HeaderParam("x-ms-lease-id") String leaseId, Context context);

        @PUT("{containerName}/{blob}")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<BlobsCopyFromURLResponse> copyFromURL(@PathParam("containerName") String containerName, @PathParam("blob") String blob, @HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-meta-") Map<String, String> metadata, @HeaderParam("x-ms-copy-source") URL copySource, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @HeaderParam("x-ms-requires-sync") String xMsRequiresSync, @HeaderParam("x-ms-source-if-modified-since") DateTimeRfc1123 sourceIfModifiedSince, @HeaderParam("x-ms-source-if-unmodified-since") DateTimeRfc1123 sourceIfUnmodifiedSince, @HeaderParam("x-ms-source-if-match") String sourceIfMatch, @HeaderParam("x-ms-source-if-none-match") String sourceIfNoneMatch, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, @HeaderParam("x-ms-lease-id") String leaseId, Context context);

        @PUT("{containerName}/{blob}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<BlobsAbortCopyFromURLResponse> abortCopyFromURL(@PathParam("containerName") String containerName, @PathParam("blob") String blob, @HostParam("url") String url, @QueryParam("copyid") String copyId, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("comp") String comp, @HeaderParam("x-ms-copy-action") String copyActionAbortConstant, @HeaderParam("x-ms-lease-id") String leaseId, Context context);

        @PUT("{containerName}/{blob}")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<BlobsSetTierResponse> setTier(@PathParam("containerName") String containerName, @PathParam("blob") String blob, @HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-access-tier") AccessTier tier, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("comp") String comp, @HeaderParam("x-ms-lease-id") String leaseId, Context context);

        @GET("{containerName}/{blob}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<BlobsGetAccountInfoResponse> getAccountInfo(@PathParam("containerName") String containerName, @PathParam("blob") String blob, @HostParam("url") String url, @HeaderParam("x-ms-version") String version, @QueryParam("restype") String restype, @QueryParam("comp") String comp, Context context);
    }

    /**
     * The Download operation reads or downloads a blob from the system, including its metadata and properties. You can also call Download to read a snapshot or verison.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<BlobsDownloadResponse> downloadWithRestResponseAsync(String containerName, String blob, Context context) {
        final String snapshot = null;
        final String versionId = null;
        final Integer timeout = null;
        final String range = null;
        final Boolean rangeGetContentMD5 = null;
        final String encryptionKey = null;
        final String encryptionKeySha256 = null;
        final EncryptionAlgorithmType encryptionAlgorithm = null;
        final String requestId = null;
        final String leaseId = null;
        final String ifMatch = null;
        final String ifNoneMatch = null;
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        return service.download(containerName, blob, this.client.url(), snapshot, versionId, timeout, range, rangeGetContentMD5, encryptionKey, encryptionKeySha256, encryptionAlgorithm, this.client.version(), requestId, leaseId, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, context);
    }

    /**
     * The Download operation reads or downloads a blob from the system, including its metadata and properties. You can also call Download to read a snapshot or verison.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param snapshot The snapshot parameter is an opaque DateTime value that, when present, specifies the blob snapshot to retrieve. For more information on working with blob snapshots, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/creating-a-snapshot-of-a-blob"&gt;Creating a Snapshot of a Blob.&lt;/a&gt;.
     * @param versionId The version ID parameter is an opaque DateTime value that, when present, specifies the blob version to retrieve.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param range Return only the bytes of the blob in the specified range.
     * @param rangeGetContentMD5 When set to true and specified together with the Range, the service returns the MD5 hash for the range, as long as the range is less than or equal to 4 MB in size.
     * @param encryptionKey Optional. Specifies the encryption key to use to encrypt the data provided in the request. If not specified, encryption is performed with the root account encryption key.  For more information, see Encryption at Rest for Azure Storage Services.
     * @param encryptionKeySha256 The SHA-256 hash of the provided encryption key. Must be provided if the x-ms-encryption-key header is provided.
     * @param encryptionAlgorithm The algorithm used to produce the encryption key hash. Currently, the only accepted value is "AES256". Must be provided if the x-ms-encryption-key header is provided. Possible values include: 'AES256'.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param leaseAccessConditions Additional parameters for the operation.
     * @param modifiedAccessConditions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<BlobsDownloadResponse> downloadWithRestResponseAsync(String containerName, String blob, String snapshot, String versionId, Integer timeout, String range, Boolean rangeGetContentMD5, String encryptionKey, String encryptionKeySha256, EncryptionAlgorithmType encryptionAlgorithm, String requestId, LeaseAccessConditions leaseAccessConditions, ModifiedAccessConditions modifiedAccessConditions, Context context) {
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
        return service.download(containerName, blob, this.client.url(), snapshot, versionId, timeout, range, rangeGetContentMD5, encryptionKey, encryptionKeySha256, encryptionAlgorithm, this.client.version(), requestId, leaseId, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, context);
    }

    /**
     * The Get Properties operation returns all user-defined metadata, standard HTTP properties, and system properties for the blob. It does not return the content of the blob.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<BlobsGetPropertiesResponse> getPropertiesWithRestResponseAsync(String containerName, String blob, Context context) {
        final String snapshot = null;
        final String versionId = null;
        final Integer timeout = null;
        final String encryptionKey = null;
        final String encryptionKeySha256 = null;
        final EncryptionAlgorithmType encryptionAlgorithm = null;
        final String requestId = null;
        final String leaseId = null;
        final String ifMatch = null;
        final String ifNoneMatch = null;
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        return service.getProperties(containerName, blob, this.client.url(), snapshot, versionId, timeout, encryptionKey, encryptionKeySha256, encryptionAlgorithm, this.client.version(), requestId, leaseId, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, context);
    }

    /**
     * The Get Properties operation returns all user-defined metadata, standard HTTP properties, and system properties for the blob. It does not return the content of the blob.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param snapshot The snapshot parameter is an opaque DateTime value that, when present, specifies the blob snapshot to retrieve. For more information on working with blob snapshots, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/creating-a-snapshot-of-a-blob"&gt;Creating a Snapshot of a Blob.&lt;/a&gt;.
     * @param versionId The version ID parameter is an opaque DateTime value that, when present, specifies the blob version to retrieve.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param encryptionKey Optional. Specifies the encryption key to use to encrypt the data provided in the request. If not specified, encryption is performed with the root account encryption key.  For more information, see Encryption at Rest for Azure Storage Services.
     * @param encryptionKeySha256 The SHA-256 hash of the provided encryption key. Must be provided if the x-ms-encryption-key header is provided.
     * @param encryptionAlgorithm The algorithm used to produce the encryption key hash. Currently, the only accepted value is "AES256". Must be provided if the x-ms-encryption-key header is provided. Possible values include: 'AES256'.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param leaseAccessConditions Additional parameters for the operation.
     * @param modifiedAccessConditions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<BlobsGetPropertiesResponse> getPropertiesWithRestResponseAsync(String containerName, String blob, String snapshot, String versionId, Integer timeout, String encryptionKey, String encryptionKeySha256, EncryptionAlgorithmType encryptionAlgorithm, String requestId, LeaseAccessConditions leaseAccessConditions, ModifiedAccessConditions modifiedAccessConditions, Context context) {
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
        return service.getProperties(containerName, blob, this.client.url(), snapshot, versionId, timeout, encryptionKey, encryptionKeySha256, encryptionAlgorithm, this.client.version(), requestId, leaseId, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, context);
    }

    /**
     * If the storage account's soft delete feature is disabled then, when a blob is deleted, it is permanently removed from the storage account. If the storage account's soft delete feature is enabled, then, when a blob is deleted, it is marked for deletion and becomes inaccessible immediately. However, the storage service retains the blob or snapshot for the number of days specified by the DeleteRetentionPolicy section of [Storage service properties] (Set-Blob-Service-Properties.md). After the specified number of days has passed, the blob's data is permanently removed from the storage account. Note that you continue to be charged for the soft-deleted blob's storage until it is permanently removed. Use the List Blobs API and specify the "include=deleted" query parameter to discover which blobs and snapshots have been soft deleted. You can then use the Undelete Blob API to restore a soft-deleted blob. All other operations on a soft-deleted blob or snapshot causes the service to return an HTTP status code of 404 (ResourceNotFound). If the storage account's automatic snapshot feature is enabled, then, when a blob is deleted, an automatic snapshot is created. The blob becomes inaccessible immediately. All other operations on the blob causes the service to return an HTTP status code of 404 (ResourceNotFound). You can access automatic snapshot using snapshot timestamp or version id. You can restore the blob by calling Put or Copy Blob API with automatic snapshot as source. Deleting automatic snapshot requires shared key or special SAS/RBAC permissions.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<BlobsDeleteResponse> deleteWithRestResponseAsync(String containerName, String blob, Context context) {
        final String snapshot = null;
        final String versionId = null;
        final Integer timeout = null;
        final DeleteSnapshotsOptionType deleteSnapshots = null;
        final String requestId = null;
        final String leaseId = null;
        final String ifMatch = null;
        final String ifNoneMatch = null;
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        return service.delete(containerName, blob, this.client.url(), snapshot, versionId, timeout, deleteSnapshots, this.client.version(), requestId, leaseId, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, context);
    }

    /**
     * If the storage account's soft delete feature is disabled then, when a blob is deleted, it is permanently removed from the storage account. If the storage account's soft delete feature is enabled, then, when a blob is deleted, it is marked for deletion and becomes inaccessible immediately. However, the storage service retains the blob or snapshot for the number of days specified by the DeleteRetentionPolicy section of [Storage service properties] (Set-Blob-Service-Properties.md). After the specified number of days has passed, the blob's data is permanently removed from the storage account. Note that you continue to be charged for the soft-deleted blob's storage until it is permanently removed. Use the List Blobs API and specify the "include=deleted" query parameter to discover which blobs and snapshots have been soft deleted. You can then use the Undelete Blob API to restore a soft-deleted blob. All other operations on a soft-deleted blob or snapshot causes the service to return an HTTP status code of 404 (ResourceNotFound). If the storage account's automatic snapshot feature is enabled, then, when a blob is deleted, an automatic snapshot is created. The blob becomes inaccessible immediately. All other operations on the blob causes the service to return an HTTP status code of 404 (ResourceNotFound). You can access automatic snapshot using snapshot timestamp or version id. You can restore the blob by calling Put or Copy Blob API with automatic snapshot as source. Deleting automatic snapshot requires shared key or special SAS/RBAC permissions.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param snapshot The snapshot parameter is an opaque DateTime value that, when present, specifies the blob snapshot to retrieve. For more information on working with blob snapshots, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/creating-a-snapshot-of-a-blob"&gt;Creating a Snapshot of a Blob.&lt;/a&gt;.
     * @param versionId The version ID parameter is an opaque DateTime value that, when present, specifies the blob version to retrieve.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param deleteSnapshots Required if the blob has associated snapshots. Specify one of the following two options: include: Delete the base blob and all of its snapshots. only: Delete only the blob's snapshots and not the blob itself. Possible values include: 'include', 'only'.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param leaseAccessConditions Additional parameters for the operation.
     * @param modifiedAccessConditions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<BlobsDeleteResponse> deleteWithRestResponseAsync(String containerName, String blob, String snapshot, String versionId, Integer timeout, DeleteSnapshotsOptionType deleteSnapshots, String requestId, LeaseAccessConditions leaseAccessConditions, ModifiedAccessConditions modifiedAccessConditions, Context context) {
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
        return service.delete(containerName, blob, this.client.url(), snapshot, versionId, timeout, deleteSnapshots, this.client.version(), requestId, leaseId, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, context);
    }

    /**
     * Undelete a blob that was previously soft deleted.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<BlobsUndeleteResponse> undeleteWithRestResponseAsync(String containerName, String blob, Context context) {
        final Integer timeout = null;
        final String requestId = null;
        final String comp = "undelete";
        return service.undelete(containerName, blob, this.client.url(), timeout, this.client.version(), requestId, comp, context);
    }

    /**
     * Undelete a blob that was previously soft deleted.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<BlobsUndeleteResponse> undeleteWithRestResponseAsync(String containerName, String blob, Integer timeout, String requestId, Context context) {
        final String comp = "undelete";
        return service.undelete(containerName, blob, this.client.url(), timeout, this.client.version(), requestId, comp, context);
    }

    /**
     * The Set HTTP Headers operation sets system properties on the blob.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<BlobsSetHTTPHeadersResponse> setHTTPHeadersWithRestResponseAsync(String containerName, String blob, Context context) {
        final Integer timeout = null;
        final String requestId = null;
        final String comp = "properties";
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
        return service.setHTTPHeaders(containerName, blob, this.client.url(), timeout, this.client.version(), requestId, comp, blobCacheControl, blobContentType, blobContentMD5Converted, blobContentEncoding, blobContentLanguage, blobContentDisposition, leaseId, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, context);
    }

    /**
     * The Set HTTP Headers operation sets system properties on the blob.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param blobHTTPHeaders Additional parameters for the operation.
     * @param leaseAccessConditions Additional parameters for the operation.
     * @param modifiedAccessConditions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<BlobsSetHTTPHeadersResponse> setHTTPHeadersWithRestResponseAsync(String containerName, String blob, Integer timeout, String requestId, BlobHTTPHeaders blobHTTPHeaders, LeaseAccessConditions leaseAccessConditions, ModifiedAccessConditions modifiedAccessConditions, Context context) {
        final String comp = "properties";
        String blobCacheControl = null;
        if (blobHTTPHeaders != null) {
            blobCacheControl = blobHTTPHeaders.blobCacheControl();
        }
        String blobContentType = null;
        if (blobHTTPHeaders != null) {
            blobContentType = blobHTTPHeaders.blobContentType();
        }
        byte[] blobContentMD5 = null;
        if (blobHTTPHeaders != null) {
            blobContentMD5 = blobHTTPHeaders.blobContentMD5();
        }
        String blobContentEncoding = null;
        if (blobHTTPHeaders != null) {
            blobContentEncoding = blobHTTPHeaders.blobContentEncoding();
        }
        String blobContentLanguage = null;
        if (blobHTTPHeaders != null) {
            blobContentLanguage = blobHTTPHeaders.blobContentLanguage();
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
        return service.setHTTPHeaders(containerName, blob, this.client.url(), timeout, this.client.version(), requestId, comp, blobCacheControl, blobContentType, blobContentMD5Converted, blobContentEncoding, blobContentLanguage, blobContentDisposition, leaseId, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, context);
    }

    /**
     * The Set Blob Metadata operation sets user-defined metadata for the specified blob as one or more name-value pairs.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<BlobsSetMetadataResponse> setMetadataWithRestResponseAsync(String containerName, String blob, Context context) {
        final Integer timeout = null;
        final Map<String, String> metadata = null;
        final String encryptionKey = null;
        final String encryptionKeySha256 = null;
        final EncryptionAlgorithmType encryptionAlgorithm = null;
        final String requestId = null;
        final String comp = "metadata";
        final String leaseId = null;
        final String ifMatch = null;
        final String ifNoneMatch = null;
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        return service.setMetadata(containerName, blob, this.client.url(), timeout, metadata, encryptionKey, encryptionKeySha256, encryptionAlgorithm, this.client.version(), requestId, comp, leaseId, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, context);
    }

    /**
     * The Set Blob Metadata operation sets user-defined metadata for the specified blob as one or more name-value pairs.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param metadata Optional. Specifies a user-defined name-value pair associated with the blob. If no name-value pairs are specified, the operation will copy the metadata from the source blob or file to the destination blob. If one or more name-value pairs are specified, the destination blob is created with the specified metadata, and metadata is not copied from the source blob or file. Note that beginning with version 2009-09-19, metadata names must adhere to the naming rules for C# identifiers. See Naming and Referencing Containers, Blobs, and Metadata for more information.
     * @param encryptionKey Optional. Specifies the encryption key to use to encrypt the data provided in the request. If not specified, encryption is performed with the root account encryption key.  For more information, see Encryption at Rest for Azure Storage Services.
     * @param encryptionKeySha256 The SHA-256 hash of the provided encryption key. Must be provided if the x-ms-encryption-key header is provided.
     * @param encryptionAlgorithm The algorithm used to produce the encryption key hash. Currently, the only accepted value is "AES256". Must be provided if the x-ms-encryption-key header is provided. Possible values include: 'AES256'.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param leaseAccessConditions Additional parameters for the operation.
     * @param modifiedAccessConditions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<BlobsSetMetadataResponse> setMetadataWithRestResponseAsync(String containerName, String blob, Integer timeout, Map<String, String> metadata, String encryptionKey, String encryptionKeySha256, EncryptionAlgorithmType encryptionAlgorithm, String requestId, LeaseAccessConditions leaseAccessConditions, ModifiedAccessConditions modifiedAccessConditions, Context context) {
        final String comp = "metadata";
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
        return service.setMetadata(containerName, blob, this.client.url(), timeout, metadata, encryptionKey, encryptionKeySha256, encryptionAlgorithm, this.client.version(), requestId, comp, leaseId, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, context);
    }

    /**
     * [Update] The Lease Blob operation establishes and manages a lock on a blob for write and delete operations.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<BlobsAcquireLeaseResponse> acquireLeaseWithRestResponseAsync(String containerName, String blob, Context context) {
        final Integer timeout = null;
        final Integer duration = null;
        final String proposedLeaseId = null;
        final String requestId = null;
        final String comp = "lease";
        final String action = "acquire";
        final String ifMatch = null;
        final String ifNoneMatch = null;
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        return service.acquireLease(containerName, blob, this.client.url(), timeout, duration, proposedLeaseId, this.client.version(), requestId, comp, action, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, context);
    }

    /**
     * [Update] The Lease Blob operation establishes and manages a lock on a blob for write and delete operations.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param duration Specifies the duration of the lease, in seconds, or negative one (-1) for a lease that never expires. A non-infinite lease can be between 15 and 60 seconds. A lease duration cannot be changed using renew or change.
     * @param proposedLeaseId Proposed lease ID, in a GUID string format. The Blob service returns 400 (Invalid request) if the proposed lease ID is not in the correct format. See Guid Constructor (String) for a list of valid GUID string formats.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param modifiedAccessConditions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<BlobsAcquireLeaseResponse> acquireLeaseWithRestResponseAsync(String containerName, String blob, Integer timeout, Integer duration, String proposedLeaseId, String requestId, ModifiedAccessConditions modifiedAccessConditions, Context context) {
        final String comp = "lease";
        final String action = "acquire";
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
        return service.acquireLease(containerName, blob, this.client.url(), timeout, duration, proposedLeaseId, this.client.version(), requestId, comp, action, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, context);
    }

    /**
     * [Update] The Lease Blob operation establishes and manages a lock on a blob for write and delete operations.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param leaseId Specifies the current lease ID on the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<BlobsReleaseLeaseResponse> releaseLeaseWithRestResponseAsync(String containerName, String blob, String leaseId, Context context) {
        final Integer timeout = null;
        final String requestId = null;
        final String comp = "lease";
        final String action = "release";
        final String ifMatch = null;
        final String ifNoneMatch = null;
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        return service.releaseLease(containerName, blob, this.client.url(), timeout, leaseId, this.client.version(), requestId, comp, action, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, context);
    }

    /**
     * [Update] The Lease Blob operation establishes and manages a lock on a blob for write and delete operations.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param leaseId Specifies the current lease ID on the resource.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param modifiedAccessConditions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<BlobsReleaseLeaseResponse> releaseLeaseWithRestResponseAsync(String containerName, String blob, String leaseId, Integer timeout, String requestId, ModifiedAccessConditions modifiedAccessConditions, Context context) {
        final String comp = "lease";
        final String action = "release";
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
        return service.releaseLease(containerName, blob, this.client.url(), timeout, leaseId, this.client.version(), requestId, comp, action, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, context);
    }

    /**
     * [Update] The Lease Blob operation establishes and manages a lock on a blob for write and delete operations.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param leaseId Specifies the current lease ID on the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<BlobsRenewLeaseResponse> renewLeaseWithRestResponseAsync(String containerName, String blob, String leaseId, Context context) {
        final Integer timeout = null;
        final String requestId = null;
        final String comp = "lease";
        final String action = "renew";
        final String ifMatch = null;
        final String ifNoneMatch = null;
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        return service.renewLease(containerName, blob, this.client.url(), timeout, leaseId, this.client.version(), requestId, comp, action, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, context);
    }

    /**
     * [Update] The Lease Blob operation establishes and manages a lock on a blob for write and delete operations.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param leaseId Specifies the current lease ID on the resource.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param modifiedAccessConditions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<BlobsRenewLeaseResponse> renewLeaseWithRestResponseAsync(String containerName, String blob, String leaseId, Integer timeout, String requestId, ModifiedAccessConditions modifiedAccessConditions, Context context) {
        final String comp = "lease";
        final String action = "renew";
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
        return service.renewLease(containerName, blob, this.client.url(), timeout, leaseId, this.client.version(), requestId, comp, action, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, context);
    }

    /**
     * [Update] The Lease Blob operation establishes and manages a lock on a blob for write and delete operations.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param leaseId Specifies the current lease ID on the resource.
     * @param proposedLeaseId Proposed lease ID, in a GUID string format. The Blob service returns 400 (Invalid request) if the proposed lease ID is not in the correct format. See Guid Constructor (String) for a list of valid GUID string formats.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<BlobsChangeLeaseResponse> changeLeaseWithRestResponseAsync(String containerName, String blob, String leaseId, String proposedLeaseId, Context context) {
        final Integer timeout = null;
        final String requestId = null;
        final String comp = "lease";
        final String action = "change";
        final String ifMatch = null;
        final String ifNoneMatch = null;
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        return service.changeLease(containerName, blob, this.client.url(), timeout, leaseId, proposedLeaseId, this.client.version(), requestId, comp, action, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, context);
    }

    /**
     * [Update] The Lease Blob operation establishes and manages a lock on a blob for write and delete operations.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param leaseId Specifies the current lease ID on the resource.
     * @param proposedLeaseId Proposed lease ID, in a GUID string format. The Blob service returns 400 (Invalid request) if the proposed lease ID is not in the correct format. See Guid Constructor (String) for a list of valid GUID string formats.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param modifiedAccessConditions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<BlobsChangeLeaseResponse> changeLeaseWithRestResponseAsync(String containerName, String blob, String leaseId, String proposedLeaseId, Integer timeout, String requestId, ModifiedAccessConditions modifiedAccessConditions, Context context) {
        final String comp = "lease";
        final String action = "change";
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
        return service.changeLease(containerName, blob, this.client.url(), timeout, leaseId, proposedLeaseId, this.client.version(), requestId, comp, action, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, context);
    }

    /**
     * [Update] The Lease Blob operation establishes and manages a lock on a blob for write and delete operations.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<BlobsBreakLeaseResponse> breakLeaseWithRestResponseAsync(String containerName, String blob, Context context) {
        final Integer timeout = null;
        final Integer breakPeriod = null;
        final String requestId = null;
        final String comp = "lease";
        final String action = "break";
        final String ifMatch = null;
        final String ifNoneMatch = null;
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        return service.breakLease(containerName, blob, this.client.url(), timeout, breakPeriod, this.client.version(), requestId, comp, action, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, context);
    }

    /**
     * [Update] The Lease Blob operation establishes and manages a lock on a blob for write and delete operations.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param breakPeriod For a break operation, proposed duration the lease should continue before it is broken, in seconds, between 0 and 60. This break period is only used if it is shorter than the time remaining on the lease. If longer, the time remaining on the lease is used. A new lease will not be available before the break period has expired, but the lease may be held for longer than the break period. If this header does not appear with a break operation, a fixed-duration lease breaks after the remaining lease period elapses, and an infinite lease breaks immediately.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param modifiedAccessConditions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<BlobsBreakLeaseResponse> breakLeaseWithRestResponseAsync(String containerName, String blob, Integer timeout, Integer breakPeriod, String requestId, ModifiedAccessConditions modifiedAccessConditions, Context context) {
        final String comp = "lease";
        final String action = "break";
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
        return service.breakLease(containerName, blob, this.client.url(), timeout, breakPeriod, this.client.version(), requestId, comp, action, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, context);
    }

    /**
     * The Create Snapshot operation creates a read-only snapshot of a blob.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<BlobsCreateSnapshotResponse> createSnapshotWithRestResponseAsync(String containerName, String blob, Context context) {
        final Integer timeout = null;
        final Map<String, String> metadata = null;
        final String encryptionKey = null;
        final String encryptionKeySha256 = null;
        final EncryptionAlgorithmType encryptionAlgorithm = null;
        final String requestId = null;
        final String comp = "snapshot";
        final String ifMatch = null;
        final String ifNoneMatch = null;
        final String leaseId = null;
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        return service.createSnapshot(containerName, blob, this.client.url(), timeout, metadata, encryptionKey, encryptionKeySha256, encryptionAlgorithm, this.client.version(), requestId, comp, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, leaseId, context);
    }

    /**
     * The Create Snapshot operation creates a read-only snapshot of a blob.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param metadata Optional. Specifies a user-defined name-value pair associated with the blob. If no name-value pairs are specified, the operation will copy the metadata from the source blob or file to the destination blob. If one or more name-value pairs are specified, the destination blob is created with the specified metadata, and metadata is not copied from the source blob or file. Note that beginning with version 2009-09-19, metadata names must adhere to the naming rules for C# identifiers. See Naming and Referencing Containers, Blobs, and Metadata for more information.
     * @param encryptionKey Optional. Specifies the encryption key to use to encrypt the data provided in the request. If not specified, encryption is performed with the root account encryption key.  For more information, see Encryption at Rest for Azure Storage Services.
     * @param encryptionKeySha256 The SHA-256 hash of the provided encryption key. Must be provided if the x-ms-encryption-key header is provided.
     * @param encryptionAlgorithm The algorithm used to produce the encryption key hash. Currently, the only accepted value is "AES256". Must be provided if the x-ms-encryption-key header is provided. Possible values include: 'AES256'.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param modifiedAccessConditions Additional parameters for the operation.
     * @param leaseAccessConditions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<BlobsCreateSnapshotResponse> createSnapshotWithRestResponseAsync(String containerName, String blob, Integer timeout, Map<String, String> metadata, String encryptionKey, String encryptionKeySha256, EncryptionAlgorithmType encryptionAlgorithm, String requestId, ModifiedAccessConditions modifiedAccessConditions, LeaseAccessConditions leaseAccessConditions, Context context) {
        final String comp = "snapshot";
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
        String leaseId = null;
        if (leaseAccessConditions != null) {
            leaseId = leaseAccessConditions.leaseId();
        }
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.createSnapshot(containerName, blob, this.client.url(), timeout, metadata, encryptionKey, encryptionKeySha256, encryptionAlgorithm, this.client.version(), requestId, comp, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, leaseId, context);
    }

    /**
     * The Start Copy From URL operation copies a blob or an internet resource to a new blob.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param copySource Specifies the name of the source page blob snapshot. This value is a URL of up to 2 KB in length that specifies a page blob snapshot. The value should be URL-encoded as it would appear in a request URI. The source blob must either be public or must be authenticated via a shared access signature.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<BlobsStartCopyFromURLResponse> startCopyFromURLWithRestResponseAsync(String containerName, String blob, URL copySource, Context context) {
        final Integer timeout = null;
        final Map<String, String> metadata = null;
        final String requestId = null;
        final String sourceIfMatch = null;
        final String sourceIfNoneMatch = null;
        final String ifMatch = null;
        final String ifNoneMatch = null;
        final String leaseId = null;
        DateTimeRfc1123 sourceIfModifiedSinceConverted = null;
        DateTimeRfc1123 sourceIfUnmodifiedSinceConverted = null;
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        return service.startCopyFromURL(containerName, blob, this.client.url(), timeout, metadata, copySource, this.client.version(), requestId, sourceIfModifiedSinceConverted, sourceIfUnmodifiedSinceConverted, sourceIfMatch, sourceIfNoneMatch, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, leaseId, context);
    }

    /**
     * The Start Copy From URL operation copies a blob or an internet resource to a new blob.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param copySource Specifies the name of the source page blob snapshot. This value is a URL of up to 2 KB in length that specifies a page blob snapshot. The value should be URL-encoded as it would appear in a request URI. The source blob must either be public or must be authenticated via a shared access signature.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param metadata Optional. Specifies a user-defined name-value pair associated with the blob. If no name-value pairs are specified, the operation will copy the metadata from the source blob or file to the destination blob. If one or more name-value pairs are specified, the destination blob is created with the specified metadata, and metadata is not copied from the source blob or file. Note that beginning with version 2009-09-19, metadata names must adhere to the naming rules for C# identifiers. See Naming and Referencing Containers, Blobs, and Metadata for more information.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param sourceModifiedAccessConditions Additional parameters for the operation.
     * @param modifiedAccessConditions Additional parameters for the operation.
     * @param leaseAccessConditions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<BlobsStartCopyFromURLResponse> startCopyFromURLWithRestResponseAsync(String containerName, String blob, URL copySource, Integer timeout, Map<String, String> metadata, String requestId, SourceModifiedAccessConditions sourceModifiedAccessConditions, ModifiedAccessConditions modifiedAccessConditions, LeaseAccessConditions leaseAccessConditions, Context context) {
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
        String leaseId = null;
        if (leaseAccessConditions != null) {
            leaseId = leaseAccessConditions.leaseId();
        }
        DateTimeRfc1123 sourceIfModifiedSinceConverted = sourceIfModifiedSince == null ? null : new DateTimeRfc1123(sourceIfModifiedSince);
        DateTimeRfc1123 sourceIfUnmodifiedSinceConverted = sourceIfUnmodifiedSince == null ? null : new DateTimeRfc1123(sourceIfUnmodifiedSince);
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.startCopyFromURL(containerName, blob, this.client.url(), timeout, metadata, copySource, this.client.version(), requestId, sourceIfModifiedSinceConverted, sourceIfUnmodifiedSinceConverted, sourceIfMatch, sourceIfNoneMatch, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, leaseId, context);
    }

    /**
     * The Copy From URL operation copies a blob or an internet resource to a new blob. It will not return a response until the copy is complete.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param copySource Specifies the name of the source page blob snapshot. This value is a URL of up to 2 KB in length that specifies a page blob snapshot. The value should be URL-encoded as it would appear in a request URI. The source blob must either be public or must be authenticated via a shared access signature.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<BlobsCopyFromURLResponse> copyFromURLWithRestResponseAsync(String containerName, String blob, URL copySource, Context context) {
        final Integer timeout = null;
        final Map<String, String> metadata = null;
        final String requestId = null;
        final String xMsRequiresSync = "true";
        final String sourceIfMatch = null;
        final String sourceIfNoneMatch = null;
        final String ifMatch = null;
        final String ifNoneMatch = null;
        final String leaseId = null;
        DateTimeRfc1123 sourceIfModifiedSinceConverted = null;
        DateTimeRfc1123 sourceIfUnmodifiedSinceConverted = null;
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        return service.copyFromURL(containerName, blob, this.client.url(), timeout, metadata, copySource, this.client.version(), requestId, xMsRequiresSync, sourceIfModifiedSinceConverted, sourceIfUnmodifiedSinceConverted, sourceIfMatch, sourceIfNoneMatch, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, leaseId, context);
    }

    /**
     * The Copy From URL operation copies a blob or an internet resource to a new blob. It will not return a response until the copy is complete.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param copySource Specifies the name of the source page blob snapshot. This value is a URL of up to 2 KB in length that specifies a page blob snapshot. The value should be URL-encoded as it would appear in a request URI. The source blob must either be public or must be authenticated via a shared access signature.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param metadata Optional. Specifies a user-defined name-value pair associated with the blob. If no name-value pairs are specified, the operation will copy the metadata from the source blob or file to the destination blob. If one or more name-value pairs are specified, the destination blob is created with the specified metadata, and metadata is not copied from the source blob or file. Note that beginning with version 2009-09-19, metadata names must adhere to the naming rules for C# identifiers. See Naming and Referencing Containers, Blobs, and Metadata for more information.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param sourceModifiedAccessConditions Additional parameters for the operation.
     * @param modifiedAccessConditions Additional parameters for the operation.
     * @param leaseAccessConditions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<BlobsCopyFromURLResponse> copyFromURLWithRestResponseAsync(String containerName, String blob, URL copySource, Integer timeout, Map<String, String> metadata, String requestId, SourceModifiedAccessConditions sourceModifiedAccessConditions, ModifiedAccessConditions modifiedAccessConditions, LeaseAccessConditions leaseAccessConditions, Context context) {
        final String xMsRequiresSync = "true";
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
        String leaseId = null;
        if (leaseAccessConditions != null) {
            leaseId = leaseAccessConditions.leaseId();
        }
        DateTimeRfc1123 sourceIfModifiedSinceConverted = sourceIfModifiedSince == null ? null : new DateTimeRfc1123(sourceIfModifiedSince);
        DateTimeRfc1123 sourceIfUnmodifiedSinceConverted = sourceIfUnmodifiedSince == null ? null : new DateTimeRfc1123(sourceIfUnmodifiedSince);
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.copyFromURL(containerName, blob, this.client.url(), timeout, metadata, copySource, this.client.version(), requestId, xMsRequiresSync, sourceIfModifiedSinceConverted, sourceIfUnmodifiedSinceConverted, sourceIfMatch, sourceIfNoneMatch, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, leaseId, context);
    }

    /**
     * The Abort Copy From URL operation aborts a pending Copy From URL operation, and leaves a destination blob with zero length and full metadata.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param copyId The copy identifier provided in the x-ms-copy-id header of the original Copy Blob operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<BlobsAbortCopyFromURLResponse> abortCopyFromURLWithRestResponseAsync(String containerName, String blob, String copyId, Context context) {
        final Integer timeout = null;
        final String requestId = null;
        final String comp = "copy";
        final String copyActionAbortConstant = "abort";
        final String leaseId = null;
        return service.abortCopyFromURL(containerName, blob, this.client.url(), copyId, timeout, this.client.version(), requestId, comp, copyActionAbortConstant, leaseId, context);
    }

    /**
     * The Abort Copy From URL operation aborts a pending Copy From URL operation, and leaves a destination blob with zero length and full metadata.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param copyId The copy identifier provided in the x-ms-copy-id header of the original Copy Blob operation.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param leaseAccessConditions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<BlobsAbortCopyFromURLResponse> abortCopyFromURLWithRestResponseAsync(String containerName, String blob, String copyId, Integer timeout, String requestId, LeaseAccessConditions leaseAccessConditions, Context context) {
        final String comp = "copy";
        final String copyActionAbortConstant = "abort";
        String leaseId = null;
        if (leaseAccessConditions != null) {
            leaseId = leaseAccessConditions.leaseId();
        }
        return service.abortCopyFromURL(containerName, blob, this.client.url(), copyId, timeout, this.client.version(), requestId, comp, copyActionAbortConstant, leaseId, context);
    }

    /**
     * The Set Tier operation sets the tier on a blob. The operation is allowed on a page blob in a premium storage account and on a block blob in a blob storage account (locally redundant storage only). A premium page blob's tier determines the allowed size, IOPS, and bandwidth of the blob. A block blob's tier determines Hot/Cool/Archive storage type. This operation does not update the blob's ETag.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param tier Indicates the tier to be set on the blob. Possible values include: 'P4', 'P6', 'P10', 'P20', 'P30', 'P40', 'P50', 'Hot', 'Cool', 'Archive'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<BlobsSetTierResponse> setTierWithRestResponseAsync(String containerName, String blob, AccessTier tier, Context context) {
        final Integer timeout = null;
        final String requestId = null;
        final String comp = "tier";
        final String leaseId = null;
        return service.setTier(containerName, blob, this.client.url(), timeout, tier, this.client.version(), requestId, comp, leaseId, context);
    }

    /**
     * The Set Tier operation sets the tier on a blob. The operation is allowed on a page blob in a premium storage account and on a block blob in a blob storage account (locally redundant storage only). A premium page blob's tier determines the allowed size, IOPS, and bandwidth of the blob. A block blob's tier determines Hot/Cool/Archive storage type. This operation does not update the blob's ETag.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param tier Indicates the tier to be set on the blob. Possible values include: 'P4', 'P6', 'P10', 'P20', 'P30', 'P40', 'P50', 'Hot', 'Cool', 'Archive'.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param leaseAccessConditions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<BlobsSetTierResponse> setTierWithRestResponseAsync(String containerName, String blob, AccessTier tier, Integer timeout, String requestId, LeaseAccessConditions leaseAccessConditions, Context context) {
        final String comp = "tier";
        String leaseId = null;
        if (leaseAccessConditions != null) {
            leaseId = leaseAccessConditions.leaseId();
        }
        return service.setTier(containerName, blob, this.client.url(), timeout, tier, this.client.version(), requestId, comp, leaseId, context);
    }

    /**
     * Returns the sku name and account kind.
     *
     * @param containerName The container name.
     * @param blob The blob name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<BlobsGetAccountInfoResponse> getAccountInfoWithRestResponseAsync(String containerName, String blob, Context context) {
        final String restype = "account";
        final String comp = "properties";
        return service.getAccountInfo(containerName, blob, this.client.url(), this.client.version(), restype, comp, context);
    }
}
