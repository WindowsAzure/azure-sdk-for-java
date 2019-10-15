// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.implementation;

import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Head;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Patch;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.implementation.DateTimeRfc1123;
import com.azure.core.implementation.RestProxy;
import com.azure.core.util.Context;
import com.azure.storage.blob.implementation.models.DataLakeStorageErrorException;
import com.azure.storage.blob.implementation.models.DirectoryHttpHeaders;
import com.azure.storage.blob.implementation.models.DirectorysCreateResponse;
import com.azure.storage.blob.implementation.models.DirectorysDeleteResponse;
import com.azure.storage.blob.implementation.models.DirectorysGetAccessControlResponse;
import com.azure.storage.blob.implementation.models.DirectorysRenameResponse;
import com.azure.storage.blob.implementation.models.DirectorysSetAccessControlResponse;
import com.azure.storage.blob.models.LeaseAccessConditions;
import com.azure.storage.blob.models.ModifiedAccessConditions;
import com.azure.storage.blob.models.PathRenameMode;
import com.azure.storage.blob.models.SourceModifiedAccessConditions;
import java.time.OffsetDateTime;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * Directorys.
 */
public final class DirectorysImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private DirectorysService service;

    /**
     * The service client containing this operation class.
     */
    private AzureBlobStorageImpl client;

    /**
     * Initializes an instance of DirectorysImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public DirectorysImpl(AzureBlobStorageImpl client) {
        this.service = RestProxy.create(DirectorysService.class, client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureBlobStorageDirectorys
     * to be used by the proxy service to perform REST calls.
     */
    @Host("{url}")
    @ServiceInterface(name = "AzureBlobStorageDirectorys")
    private interface DirectorysService {
        @Put("{filesystem}/{path}")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(DataLakeStorageErrorException.class)
        Mono<DirectorysCreateResponse> create(@PathParam("filesystem") String filesystem, @PathParam("path") String path, @HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-properties") String directoryProperties, @HeaderParam("x-ms-permissions") String posixPermissions, @HeaderParam("x-ms-umask") String posixUmask, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("resource") String resource, @HeaderParam("x-ms-cache-control") String cacheControl, @HeaderParam("x-ms-content-type") String contentType, @HeaderParam("x-ms-content-encoding") String contentEncoding, @HeaderParam("x-ms-content-language") String contentLanguage, @HeaderParam("x-ms-content-disposition") String contentDisposition, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, Context context);

        @Put("{filesystem}/{path}")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(DataLakeStorageErrorException.class)
        Mono<DirectorysRenameResponse> rename(@PathParam("filesystem") String filesystem, @PathParam("path") String path, @HostParam("url") String url, @QueryParam("timeout") Integer timeout, @QueryParam("continuation") String marker, @QueryParam("mode") PathRenameMode pathRenameMode, @HeaderParam("x-ms-rename-source") String renameSource, @HeaderParam("x-ms-properties") String directoryProperties, @HeaderParam("x-ms-permissions") String posixPermissions, @HeaderParam("x-ms-umask") String posixUmask, @HeaderParam("x-ms-source-lease-id") String sourceLeaseId, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @HeaderParam("x-ms-cache-control") String cacheControl, @HeaderParam("x-ms-content-type") String contentType, @HeaderParam("x-ms-content-encoding") String contentEncoding, @HeaderParam("x-ms-content-language") String contentLanguage, @HeaderParam("x-ms-content-disposition") String contentDisposition, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, @HeaderParam("x-ms-source-if-modified-since") DateTimeRfc1123 sourceIfModifiedSince, @HeaderParam("x-ms-source-if-unmodified-since") DateTimeRfc1123 sourceIfUnmodifiedSince, @HeaderParam("x-ms-source-if-match") String sourceIfMatch, @HeaderParam("x-ms-source-if-none-match") String sourceIfNoneMatch, Context context);

        @Delete("{filesystem}/{path}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(DataLakeStorageErrorException.class)
        Mono<DirectorysDeleteResponse> delete(@PathParam("filesystem") String filesystem, @PathParam("path") String path, @HostParam("url") String url, @QueryParam("timeout") Integer timeout, @QueryParam("recursive") boolean recursiveDirectoryDelete, @QueryParam("continuation") String marker, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, Context context);

        @Patch("{filesystem}/{path}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(DataLakeStorageErrorException.class)
        Mono<DirectorysSetAccessControlResponse> setAccessControl(@HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-owner") String owner, @HeaderParam("x-ms-group") String group, @HeaderParam("x-ms-permissions") String posixPermissions, @HeaderParam("x-ms-acl") String posixAcl, @HeaderParam("x-ms-client-request-id") String requestId, @HeaderParam("x-ms-version") String version, @QueryParam("action") String action, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, Context context);

        @Head("{filesystem}/{path}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(DataLakeStorageErrorException.class)
        Mono<DirectorysGetAccessControlResponse> getAccessControl(@HostParam("url") String url, @QueryParam("timeout") Integer timeout, @QueryParam("upn") Boolean upn, @HeaderParam("x-ms-client-request-id") String requestId, @HeaderParam("x-ms-version") String version, @QueryParam("action") String action, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("If-Match") String ifMatch, @HeaderParam("If-None-Match") String ifNoneMatch, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, Context context);
    }

    /**
     * Create a directory. By default, the destination is overwritten and if the destination already exists and has a lease the lease is broken. This operation supports conditional HTTP requests.  For more information, see [Specifying Conditional Headers for Blob Service Operations](https://docs.microsoft.com/en-us/rest/api/storageservices/specifying-conditional-headers-for-blob-service-operations).  To fail if the destination already exists, use a conditional request with If-None-Match: "*".
     *
     * @param filesystem The filesystem name.
     * @param path The namespace path to a file or directory.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DirectorysCreateResponse> createWithRestResponseAsync(String filesystem, String path, Context context) {
        final Integer timeout = null;
        final String directoryProperties = null;
        final String posixPermissions = null;
        final String posixUmask = null;
        final String requestId = null;
        final String resource = "directory";
        final String cacheControl = null;
        final String contentType = null;
        final String contentEncoding = null;
        final String contentLanguage = null;
        final String contentDisposition = null;
        final String leaseId = null;
        final String ifMatch = null;
        final String ifNoneMatch = null;
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        return service.create(filesystem, path, this.client.getUrl(), timeout, directoryProperties, posixPermissions, posixUmask, this.client.getVersion().getVersionString(), requestId, resource, cacheControl, contentType, contentEncoding, contentLanguage, contentDisposition, leaseId, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, context);
    }

    /**
     * Create a directory. By default, the destination is overwritten and if the destination already exists and has a lease the lease is broken. This operation supports conditional HTTP requests.  For more information, see [Specifying Conditional Headers for Blob Service Operations](https://docs.microsoft.com/en-us/rest/api/storageservices/specifying-conditional-headers-for-blob-service-operations).  To fail if the destination already exists, use a conditional request with If-None-Match: "*".
     *
     * @param filesystem The filesystem name.
     * @param path The namespace path to a file or directory.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param directoryProperties Optional.  User-defined properties to be stored with the file or directory, in the format of a comma-separated list of name and value pairs "n1=v1, n2=v2, ...", where each value is base64 encoded.
     * @param posixPermissions Optional and only valid if Hierarchical Namespace is enabled for the account. Sets POSIX access permissions for the file owner, the file owning group, and others. Each class may be granted read, write, or execute permission.  The sticky bit is also supported.  Both symbolic (rwxrw-rw-) and 4-digit octal notation (e.g. 0766) are supported.
     * @param posixUmask Only valid if Hierarchical Namespace is enabled for the account. This umask restricts permission settings for file and directory, and will only be applied when default Acl does not exist in parent directory. If the umask bit has set, it means that the corresponding permission will be disabled. Otherwise the corresponding permission will be determined by the permission. A 4-digit octal notation (e.g. 0022) is supported here. If no umask was specified, a default umask - 0027 will be used.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param directoryHttpHeaders Additional parameters for the operation.
     * @param leaseAccessConditions Additional parameters for the operation.
     * @param modifiedAccessConditions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DirectorysCreateResponse> createWithRestResponseAsync(String filesystem, String path, Integer timeout, String directoryProperties, String posixPermissions, String posixUmask, String requestId, DirectoryHttpHeaders directoryHttpHeaders, LeaseAccessConditions leaseAccessConditions, ModifiedAccessConditions modifiedAccessConditions, Context context) {
        final String resource = "directory";
        String cacheControl = null;
        if (directoryHttpHeaders != null) {
            cacheControl = directoryHttpHeaders.getCacheControl();
        }
        String contentType = null;
        if (directoryHttpHeaders != null) {
            contentType = directoryHttpHeaders.getContentType();
        }
        String contentEncoding = null;
        if (directoryHttpHeaders != null) {
            contentEncoding = directoryHttpHeaders.getContentEncoding();
        }
        String contentLanguage = null;
        if (directoryHttpHeaders != null) {
            contentLanguage = directoryHttpHeaders.getContentLanguage();
        }
        String contentDisposition = null;
        if (directoryHttpHeaders != null) {
            contentDisposition = directoryHttpHeaders.getContentDisposition();
        }
        String leaseId = null;
        if (leaseAccessConditions != null) {
            leaseId = leaseAccessConditions.getLeaseId();
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
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.create(filesystem, path, this.client.getUrl(), timeout, directoryProperties, posixPermissions, posixUmask, this.client.getVersion().getVersionString(), requestId, resource, cacheControl, contentType, contentEncoding, contentLanguage, contentDisposition, leaseId, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, context);
    }

    /**
     * Rename a directory. By default, the destination is overwritten and if the destination already exists and has a lease the lease is broken. This operation supports conditional HTTP requests. For more information, see [Specifying Conditional Headers for Blob Service Operations](https://docs.microsoft.com/en-us/rest/api/storageservices/specifying-conditional-headers-for-blob-service-operations). To fail if the destination already exists, use a conditional request with If-None-Match: "*".
     *
     * @param filesystem The filesystem name.
     * @param path The namespace path to a file or directory.
     * @param renameSource The file or directory to be renamed. The value must have the following format: "/{filesysystem}/{path}".  If "x-ms-properties" is specified, the properties will overwrite the existing properties; otherwise, the existing properties will be preserved.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DirectorysRenameResponse> renameWithRestResponseAsync(String filesystem, String path, String renameSource, Context context) {
        final Integer timeout = null;
        final String marker = null;
        final String directoryProperties = null;
        final String posixPermissions = null;
        final String posixUmask = null;
        final String sourceLeaseId = null;
        final String requestId = null;
        final String cacheControl = null;
        final String contentType = null;
        final String contentEncoding = null;
        final String contentLanguage = null;
        final String contentDisposition = null;
        final String leaseId = null;
        final String ifMatch = null;
        final String ifNoneMatch = null;
        final String sourceIfMatch = null;
        final String sourceIfNoneMatch = null;
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        DateTimeRfc1123 sourceIfModifiedSinceConverted = null;
        DateTimeRfc1123 sourceIfUnmodifiedSinceConverted = null;
        return service.rename(filesystem, path, this.client.getUrl(), timeout, marker, this.client.getPathRenameMode(), renameSource, directoryProperties, posixPermissions, posixUmask, sourceLeaseId, this.client.getVersion().getVersionString(), requestId, cacheControl, contentType, contentEncoding, contentLanguage, contentDisposition, leaseId, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, sourceIfModifiedSinceConverted, sourceIfUnmodifiedSinceConverted, sourceIfMatch, sourceIfNoneMatch, context);
    }

    /**
     * Rename a directory. By default, the destination is overwritten and if the destination already exists and has a lease the lease is broken. This operation supports conditional HTTP requests. For more information, see [Specifying Conditional Headers for Blob Service Operations](https://docs.microsoft.com/en-us/rest/api/storageservices/specifying-conditional-headers-for-blob-service-operations). To fail if the destination already exists, use a conditional request with If-None-Match: "*".
     *
     * @param filesystem The filesystem name.
     * @param path The namespace path to a file or directory.
     * @param renameSource The file or directory to be renamed. The value must have the following format: "/{filesysystem}/{path}".  If "x-ms-properties" is specified, the properties will overwrite the existing properties; otherwise, the existing properties will be preserved.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param marker When renaming a directory, the number of paths that are renamed with each invocation is limited.  If the number of paths to be renamed exceeds this limit, a continuation token is returned in this response header.  When a continuation token is returned in the response, it must be specified in a subsequent invocation of the rename operation to continue renaming the directory.
     * @param directoryProperties Optional.  User-defined properties to be stored with the file or directory, in the format of a comma-separated list of name and value pairs "n1=v1, n2=v2, ...", where each value is base64 encoded.
     * @param posixPermissions Optional and only valid if Hierarchical Namespace is enabled for the account. Sets POSIX access permissions for the file owner, the file owning group, and others. Each class may be granted read, write, or execute permission.  The sticky bit is also supported.  Both symbolic (rwxrw-rw-) and 4-digit octal notation (e.g. 0766) are supported.
     * @param posixUmask Only valid if Hierarchical Namespace is enabled for the account. This umask restricts permission settings for file and directory, and will only be applied when default Acl does not exist in parent directory. If the umask bit has set, it means that the corresponding permission will be disabled. Otherwise the corresponding permission will be determined by the permission. A 4-digit octal notation (e.g. 0022) is supported here. If no umask was specified, a default umask - 0027 will be used.
     * @param sourceLeaseId A lease ID for the source path. If specified, the source path must have an active lease and the leaase ID must match.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param directoryHttpHeaders Additional parameters for the operation.
     * @param leaseAccessConditions Additional parameters for the operation.
     * @param modifiedAccessConditions Additional parameters for the operation.
     * @param sourceModifiedAccessConditions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DirectorysRenameResponse> renameWithRestResponseAsync(String filesystem, String path, String renameSource, Integer timeout, String marker, String directoryProperties, String posixPermissions, String posixUmask, String sourceLeaseId, String requestId, DirectoryHttpHeaders directoryHttpHeaders, LeaseAccessConditions leaseAccessConditions, ModifiedAccessConditions modifiedAccessConditions, SourceModifiedAccessConditions sourceModifiedAccessConditions, Context context) {
        String cacheControl = null;
        if (directoryHttpHeaders != null) {
            cacheControl = directoryHttpHeaders.getCacheControl();
        }
        String contentType = null;
        if (directoryHttpHeaders != null) {
            contentType = directoryHttpHeaders.getContentType();
        }
        String contentEncoding = null;
        if (directoryHttpHeaders != null) {
            contentEncoding = directoryHttpHeaders.getContentEncoding();
        }
        String contentLanguage = null;
        if (directoryHttpHeaders != null) {
            contentLanguage = directoryHttpHeaders.getContentLanguage();
        }
        String contentDisposition = null;
        if (directoryHttpHeaders != null) {
            contentDisposition = directoryHttpHeaders.getContentDisposition();
        }
        String leaseId = null;
        if (leaseAccessConditions != null) {
            leaseId = leaseAccessConditions.getLeaseId();
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
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        DateTimeRfc1123 sourceIfModifiedSinceConverted = sourceIfModifiedSince == null ? null : new DateTimeRfc1123(sourceIfModifiedSince);
        DateTimeRfc1123 sourceIfUnmodifiedSinceConverted = sourceIfUnmodifiedSince == null ? null : new DateTimeRfc1123(sourceIfUnmodifiedSince);
        return service.rename(filesystem, path, this.client.getUrl(), timeout, marker, this.client.getPathRenameMode(), renameSource, directoryProperties, posixPermissions, posixUmask, sourceLeaseId, this.client.getVersion().getVersionString(), requestId, cacheControl, contentType, contentEncoding, contentLanguage, contentDisposition, leaseId, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, sourceIfModifiedSinceConverted, sourceIfUnmodifiedSinceConverted, sourceIfMatch, sourceIfNoneMatch, context);
    }

    /**
     * Deletes the directory.
     *
     * @param filesystem The filesystem name.
     * @param path The namespace path to a file or directory.
     * @param recursiveDirectoryDelete If "true", all paths beneath the directory will be deleted. If "false" and the directory is non-empty, an error occurs.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DirectorysDeleteResponse> deleteWithRestResponseAsync(String filesystem, String path, boolean recursiveDirectoryDelete, Context context) {
        final Integer timeout = null;
        final String marker = null;
        final String requestId = null;
        final String leaseId = null;
        final String ifMatch = null;
        final String ifNoneMatch = null;
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        return service.delete(filesystem, path, this.client.getUrl(), timeout, recursiveDirectoryDelete, marker, this.client.getVersion().getVersionString(), requestId, leaseId, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, context);
    }

    /**
     * Deletes the directory.
     *
     * @param filesystem The filesystem name.
     * @param path The namespace path to a file or directory.
     * @param recursiveDirectoryDelete If "true", all paths beneath the directory will be deleted. If "false" and the directory is non-empty, an error occurs.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param marker When renaming a directory, the number of paths that are renamed with each invocation is limited.  If the number of paths to be renamed exceeds this limit, a continuation token is returned in this response header.  When a continuation token is returned in the response, it must be specified in a subsequent invocation of the rename operation to continue renaming the directory.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param leaseAccessConditions Additional parameters for the operation.
     * @param modifiedAccessConditions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DirectorysDeleteResponse> deleteWithRestResponseAsync(String filesystem, String path, boolean recursiveDirectoryDelete, Integer timeout, String marker, String requestId, LeaseAccessConditions leaseAccessConditions, ModifiedAccessConditions modifiedAccessConditions, Context context) {
        String leaseId = null;
        if (leaseAccessConditions != null) {
            leaseId = leaseAccessConditions.getLeaseId();
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
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.delete(filesystem, path, this.client.getUrl(), timeout, recursiveDirectoryDelete, marker, this.client.getVersion().getVersionString(), requestId, leaseId, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, ifMatch, ifNoneMatch, context);
    }

    /**
     * Set the owner, group, permissions, or access control list for a directory.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DirectorysSetAccessControlResponse> setAccessControlWithRestResponseAsync(Context context) {
        final Integer timeout = null;
        final String owner = null;
        final String group = null;
        final String posixPermissions = null;
        final String posixAcl = null;
        final String requestId = null;
        final String action = "setAccessControl";
        final String leaseId = null;
        final String ifMatch = null;
        final String ifNoneMatch = null;
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        return service.setAccessControl(this.client.getUrl(), timeout, owner, group, posixPermissions, posixAcl, requestId, this.client.getVersion().getVersionString(), action, leaseId, ifMatch, ifNoneMatch, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, context);
    }

    /**
     * Set the owner, group, permissions, or access control list for a directory.
     *
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param owner Optional. The owner of the blob or directory.
     * @param group Optional. The owning group of the blob or directory.
     * @param posixPermissions Optional and only valid if Hierarchical Namespace is enabled for the account. Sets POSIX access permissions for the file owner, the file owning group, and others. Each class may be granted read, write, or execute permission.  The sticky bit is also supported.  Both symbolic (rwxrw-rw-) and 4-digit octal notation (e.g. 0766) are supported.
     * @param posixAcl Sets POSIX access control rights on files and directories. The value is a comma-separated list of access control entries. Each access control entry (ACE) consists of a scope, a type, a user or group identifier, and permissions in the format "[scope:][type]:[id]:[permissions]".
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param leaseAccessConditions Additional parameters for the operation.
     * @param modifiedAccessConditions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DirectorysSetAccessControlResponse> setAccessControlWithRestResponseAsync(Integer timeout, String owner, String group, String posixPermissions, String posixAcl, String requestId, LeaseAccessConditions leaseAccessConditions, ModifiedAccessConditions modifiedAccessConditions, Context context) {
        final String action = "setAccessControl";
        String leaseId = null;
        if (leaseAccessConditions != null) {
            leaseId = leaseAccessConditions.getLeaseId();
        }
        String ifMatch = null;
        if (modifiedAccessConditions != null) {
            ifMatch = modifiedAccessConditions.getIfMatch();
        }
        String ifNoneMatch = null;
        if (modifiedAccessConditions != null) {
            ifNoneMatch = modifiedAccessConditions.getIfNoneMatch();
        }
        OffsetDateTime ifModifiedSince = null;
        if (modifiedAccessConditions != null) {
            ifModifiedSince = modifiedAccessConditions.getIfModifiedSince();
        }
        OffsetDateTime ifUnmodifiedSince = null;
        if (modifiedAccessConditions != null) {
            ifUnmodifiedSince = modifiedAccessConditions.getIfUnmodifiedSince();
        }
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.setAccessControl(this.client.getUrl(), timeout, owner, group, posixPermissions, posixAcl, requestId, this.client.getVersion().getVersionString(), action, leaseId, ifMatch, ifNoneMatch, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, context);
    }

    /**
     * Get the owner, group, permissions, or access control list for a directory.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DirectorysGetAccessControlResponse> getAccessControlWithRestResponseAsync(Context context) {
        final Integer timeout = null;
        final Boolean upn = null;
        final String requestId = null;
        final String action = "getAccessControl";
        final String leaseId = null;
        final String ifMatch = null;
        final String ifNoneMatch = null;
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        return service.getAccessControl(this.client.getUrl(), timeout, upn, requestId, this.client.getVersion().getVersionString(), action, leaseId, ifMatch, ifNoneMatch, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, context);
    }

    /**
     * Get the owner, group, permissions, or access control list for a directory.
     *
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param upn Optional. Valid only when Hierarchical Namespace is enabled for the account. If "true", the identity values returned in the x-ms-owner, x-ms-group, and x-ms-acl response headers will be transformed from Azure Active Directory Object IDs to User Principal Names.  If "false", the values will be returned as Azure Active Directory Object IDs. The default value is false.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param leaseAccessConditions Additional parameters for the operation.
     * @param modifiedAccessConditions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DirectorysGetAccessControlResponse> getAccessControlWithRestResponseAsync(Integer timeout, Boolean upn, String requestId, LeaseAccessConditions leaseAccessConditions, ModifiedAccessConditions modifiedAccessConditions, Context context) {
        final String action = "getAccessControl";
        String leaseId = null;
        if (leaseAccessConditions != null) {
            leaseId = leaseAccessConditions.getLeaseId();
        }
        String ifMatch = null;
        if (modifiedAccessConditions != null) {
            ifMatch = modifiedAccessConditions.getIfMatch();
        }
        String ifNoneMatch = null;
        if (modifiedAccessConditions != null) {
            ifNoneMatch = modifiedAccessConditions.getIfNoneMatch();
        }
        OffsetDateTime ifModifiedSince = null;
        if (modifiedAccessConditions != null) {
            ifModifiedSince = modifiedAccessConditions.getIfModifiedSince();
        }
        OffsetDateTime ifUnmodifiedSince = null;
        if (modifiedAccessConditions != null) {
            ifUnmodifiedSince = modifiedAccessConditions.getIfUnmodifiedSince();
        }
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.getAccessControl(this.client.getUrl(), timeout, upn, requestId, this.client.getVersion().getVersionString(), action, leaseId, ifMatch, ifNoneMatch, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, context);
    }
}
