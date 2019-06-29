// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.file.implementation;

import com.azure.core.annotations.BodyParam;
import com.azure.core.annotations.DELETE;
import com.azure.core.annotations.ExpectedResponses;
import com.azure.core.annotations.GET;
import com.azure.core.annotations.HeaderParam;
import com.azure.core.annotations.Host;
import com.azure.core.annotations.HostParam;
import com.azure.core.annotations.PUT;
import com.azure.core.annotations.QueryParam;
import com.azure.core.annotations.Service;
import com.azure.core.annotations.UnexpectedResponseExceptionType;
import com.azure.core.implementation.RestProxy;
import com.azure.core.util.Context;
import com.azure.storage.file.models.DeleteSnapshotsOptionType;
import com.azure.storage.file.models.SharesCreateResponse;
import com.azure.storage.file.models.SharesCreateSnapshotResponse;
import com.azure.storage.file.models.SharesDeleteResponse;
import com.azure.storage.file.models.SharesGetAccessPolicyResponse;
import com.azure.storage.file.models.SharesGetPropertiesResponse;
import com.azure.storage.file.models.SharesGetStatisticsResponse;
import com.azure.storage.file.models.SharesSetAccessPolicyResponse;
import com.azure.storage.file.models.SharesSetMetadataResponse;
import com.azure.storage.file.models.SharesSetQuotaResponse;
import com.azure.storage.file.models.SignedIdentifier;
import com.azure.storage.file.models.StorageErrorException;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Map;

/**
 * An instance of this class provides access to all the operations defined in
 * Shares.
 */
public final class SharesImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private SharesService service;

    /**
     * The service client containing this operation class.
     */
    private AzureFileStorageImpl client;

    /**
     * Initializes an instance of SharesImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public SharesImpl(AzureFileStorageImpl client) {
        this.service = RestProxy.create(SharesService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for Shares to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{url}")
    @Service("Storage Files Shares")
    private interface SharesService {
        @PUT("{shareName}")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<SharesCreateResponse> create(@HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-meta-") Map<String, String> metadata, @HeaderParam("x-ms-share-quota") Integer quota, @HeaderParam("x-ms-version") String version, @QueryParam("restype") String restype, Context context);

        @GET("{shareName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<SharesGetPropertiesResponse> getProperties(@HostParam("url") String url, @QueryParam("sharesnapshot") String sharesnapshot, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @QueryParam("restype") String restype, Context context);

        @DELETE("{shareName}")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<SharesDeleteResponse> delete(@HostParam("url") String url, @QueryParam("sharesnapshot") String sharesnapshot, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-delete-snapshots") DeleteSnapshotsOptionType deleteSnapshots, @QueryParam("restype") String restype, Context context);

        @PUT("{shareName}")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<SharesCreateSnapshotResponse> createSnapshot(@HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-meta-") Map<String, String> metadata, @HeaderParam("x-ms-version") String version, @QueryParam("restype") String restype, @QueryParam("comp") String comp, Context context);

        @PUT("{shareName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<SharesSetQuotaResponse> setQuota(@HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-share-quota") Integer quota, @QueryParam("restype") String restype, @QueryParam("comp") String comp, Context context);

        @PUT("{shareName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<SharesSetMetadataResponse> setMetadata(@HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-meta-") Map<String, String> metadata, @HeaderParam("x-ms-version") String version, @QueryParam("restype") String restype, @QueryParam("comp") String comp, Context context);

        @GET("{shareName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<SharesGetAccessPolicyResponse> getAccessPolicy(@HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @QueryParam("restype") String restype, @QueryParam("comp") String comp, Context context);

        @PUT("{shareName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<SharesSetAccessPolicyResponse> setAccessPolicy(@HostParam("url") String url, @BodyParam("application/xml; charset=utf-8") SignedIdentifiersWrapper shareAcl, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @QueryParam("restype") String restype, @QueryParam("comp") String comp, Context context);

        @GET("{shareName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<SharesGetStatisticsResponse> getStatistics(@HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @QueryParam("restype") String restype, @QueryParam("comp") String comp, Context context);
    }

    /**
     * Creates a new share under the specified account. If the share with the same name already exists, the operation fails.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<SharesCreateResponse> createWithRestResponseAsync(Context context) {
        final Integer timeout = null;
        final Map<String, String> metadata = null;
        final Integer quota = null;
        final String restype = "share";
        return service.create(this.client.url(), timeout, metadata, quota, this.client.version(), restype, context);
    }

    /**
     * Creates a new share under the specified account. If the share with the same name already exists, the operation fails.
     *
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/Setting-Timeouts-for-File-Service-Operations?redirectedfrom=MSDN"&gt;Setting Timeouts for File Service Operations.&lt;/a&gt;.
     * @param metadata A name-value pair to associate with a file storage object.
     * @param quota Specifies the maximum size of the share, in gigabytes.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<SharesCreateResponse> createWithRestResponseAsync(Integer timeout, Map<String, String> metadata, Integer quota, Context context) {
        final String restype = "share";
        return service.create(this.client.url(), timeout, metadata, quota, this.client.version(), restype, context);
    }

    /**
     * Returns all user-defined metadata and system properties for the specified share or share snapshot. The data returned does not include the share's list of files.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<SharesGetPropertiesResponse> getPropertiesWithRestResponseAsync(Context context) {
        final String sharesnapshot = null;
        final Integer timeout = null;
        final String restype = "share";
        return service.getProperties(this.client.url(), sharesnapshot, timeout, this.client.version(), restype, context);
    }

    /**
     * Returns all user-defined metadata and system properties for the specified share or share snapshot. The data returned does not include the share's list of files.
     *
     * @param sharesnapshot The snapshot parameter is an opaque DateTime value that, when present, specifies the share snapshot to query.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/Setting-Timeouts-for-File-Service-Operations?redirectedfrom=MSDN"&gt;Setting Timeouts for File Service Operations.&lt;/a&gt;.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<SharesGetPropertiesResponse> getPropertiesWithRestResponseAsync(String sharesnapshot, Integer timeout, Context context) {
        final String restype = "share";
        return service.getProperties(this.client.url(), sharesnapshot, timeout, this.client.version(), restype, context);
    }

    /**
     * Operation marks the specified share or share snapshot for deletion. The share or share snapshot and any files contained within it are later deleted during garbage collection.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<SharesDeleteResponse> deleteWithRestResponseAsync(Context context) {
        final String sharesnapshot = null;
        final Integer timeout = null;
        final DeleteSnapshotsOptionType deleteSnapshots = null;
        final String restype = "share";
        return service.delete(this.client.url(), sharesnapshot, timeout, this.client.version(), deleteSnapshots, restype, context);
    }

    /**
     * Operation marks the specified share or share snapshot for deletion. The share or share snapshot and any files contained within it are later deleted during garbage collection.
     *
     * @param sharesnapshot The snapshot parameter is an opaque DateTime value that, when present, specifies the share snapshot to query.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/Setting-Timeouts-for-File-Service-Operations?redirectedfrom=MSDN"&gt;Setting Timeouts for File Service Operations.&lt;/a&gt;.
     * @param deleteSnapshots Specifies the option include to delete the base share and all of its snapshots. Possible values include: 'include'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<SharesDeleteResponse> deleteWithRestResponseAsync(String sharesnapshot, Integer timeout, DeleteSnapshotsOptionType deleteSnapshots, Context context) {
        final String restype = "share";
        return service.delete(this.client.url(), sharesnapshot, timeout, this.client.version(), deleteSnapshots, restype, context);
    }

    /**
     * Creates a read-only snapshot of a share.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<SharesCreateSnapshotResponse> createSnapshotWithRestResponseAsync(Context context) {
        final Integer timeout = null;
        final Map<String, String> metadata = null;
        final String restype = "share";
        final String comp = "snapshot";
        return service.createSnapshot(this.client.url(), timeout, metadata, this.client.version(), restype, comp, context);
    }

    /**
     * Creates a read-only snapshot of a share.
     *
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/Setting-Timeouts-for-File-Service-Operations?redirectedfrom=MSDN"&gt;Setting Timeouts for File Service Operations.&lt;/a&gt;.
     * @param metadata A name-value pair to associate with a file storage object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<SharesCreateSnapshotResponse> createSnapshotWithRestResponseAsync(Integer timeout, Map<String, String> metadata, Context context) {
        final String restype = "share";
        final String comp = "snapshot";
        return service.createSnapshot(this.client.url(), timeout, metadata, this.client.version(), restype, comp, context);
    }

    /**
     * Sets quota for the specified share.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<SharesSetQuotaResponse> setQuotaWithRestResponseAsync(Context context) {
        final Integer timeout = null;
        final Integer quota = null;
        final String restype = "share";
        final String comp = "properties";
        return service.setQuota(this.client.url(), timeout, this.client.version(), quota, restype, comp, context);
    }

    /**
     * Sets quota for the specified share.
     *
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/Setting-Timeouts-for-File-Service-Operations?redirectedfrom=MSDN"&gt;Setting Timeouts for File Service Operations.&lt;/a&gt;.
     * @param quota Specifies the maximum size of the share, in gigabytes.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<SharesSetQuotaResponse> setQuotaWithRestResponseAsync(Integer timeout, Integer quota, Context context) {
        final String restype = "share";
        final String comp = "properties";
        return service.setQuota(this.client.url(), timeout, this.client.version(), quota, restype, comp, context);
    }

    /**
     * Sets one or more user-defined name-value pairs for the specified share.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<SharesSetMetadataResponse> setMetadataWithRestResponseAsync(Context context) {
        final Integer timeout = null;
        final Map<String, String> metadata = null;
        final String restype = "share";
        final String comp = "metadata";
        return service.setMetadata(this.client.url(), timeout, metadata, this.client.version(), restype, comp, context);
    }

    /**
     * Sets one or more user-defined name-value pairs for the specified share.
     *
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/Setting-Timeouts-for-File-Service-Operations?redirectedfrom=MSDN"&gt;Setting Timeouts for File Service Operations.&lt;/a&gt;.
     * @param metadata A name-value pair to associate with a file storage object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<SharesSetMetadataResponse> setMetadataWithRestResponseAsync(Integer timeout, Map<String, String> metadata, Context context) {
        final String restype = "share";
        final String comp = "metadata";
        return service.setMetadata(this.client.url(), timeout, metadata, this.client.version(), restype, comp, context);
    }

    /**
     * Returns information about stored access policies specified on the share.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<SharesGetAccessPolicyResponse> getAccessPolicyWithRestResponseAsync(Context context) {
        final Integer timeout = null;
        final String restype = "share";
        final String comp = "acl";
        return service.getAccessPolicy(this.client.url(), timeout, this.client.version(), restype, comp, context);
    }

    /**
     * Returns information about stored access policies specified on the share.
     *
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/Setting-Timeouts-for-File-Service-Operations?redirectedfrom=MSDN"&gt;Setting Timeouts for File Service Operations.&lt;/a&gt;.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<SharesGetAccessPolicyResponse> getAccessPolicyWithRestResponseAsync(Integer timeout, Context context) {
        final String restype = "share";
        final String comp = "acl";
        return service.getAccessPolicy(this.client.url(), timeout, this.client.version(), restype, comp, context);
    }

    /**
     * Sets a stored access policy for use with shared access signatures.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<SharesSetAccessPolicyResponse> setAccessPolicyWithRestResponseAsync(Context context) {
        final Integer timeout = null;
        final String restype = "share";
        final String comp = "acl";
        SignedIdentifiersWrapper shareAclConverted = new SignedIdentifiersWrapper(null);
        return service.setAccessPolicy(this.client.url(), shareAclConverted, timeout, this.client.version(), restype, comp, context);
    }

    /**
     * Sets a stored access policy for use with shared access signatures.
     *
     * @param shareAcl The ACL for the share.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/Setting-Timeouts-for-File-Service-Operations?redirectedfrom=MSDN"&gt;Setting Timeouts for File Service Operations.&lt;/a&gt;.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<SharesSetAccessPolicyResponse> setAccessPolicyWithRestResponseAsync(List<SignedIdentifier> shareAcl, Integer timeout, Context context) {
        final String restype = "share";
        final String comp = "acl";
        SignedIdentifiersWrapper shareAclConverted = new SignedIdentifiersWrapper(shareAcl);
        return service.setAccessPolicy(this.client.url(), shareAclConverted, timeout, this.client.version(), restype, comp, context);
    }

    /**
     * Retrieves statistics related to the share.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<SharesGetStatisticsResponse> getStatisticsWithRestResponseAsync(Context context) {
        final Integer timeout = null;
        final String restype = "share";
        final String comp = "stats";
        return service.getStatistics(this.client.url(), timeout, this.client.version(), restype, comp, context);
    }

    /**
     * Retrieves statistics related to the share.
     *
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/Setting-Timeouts-for-File-Service-Operations?redirectedfrom=MSDN"&gt;Setting Timeouts for File Service Operations.&lt;/a&gt;.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<SharesGetStatisticsResponse> getStatisticsWithRestResponseAsync(Integer timeout, Context context) {
        final String restype = "share";
        final String comp = "stats";
        return service.getStatistics(this.client.url(), timeout, this.client.version(), restype, comp, context);
    }
}
