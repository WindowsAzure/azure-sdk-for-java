// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob.implementation;

import com.azure.core.annotations.BodyParam;
import com.azure.core.annotations.DELETE;
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
import com.azure.core.implementation.CollectionFormat;
import com.azure.core.implementation.DateTimeRfc1123;
import com.azure.core.implementation.RestProxy;
import com.azure.core.implementation.serializer.jackson.JacksonAdapter;
import com.azure.core.util.Context;
import com.azure.storage.blob.models.ContainersAcquireLeaseResponse;
import com.azure.storage.blob.models.ContainersBreakLeaseResponse;
import com.azure.storage.blob.models.ContainersChangeLeaseResponse;
import com.azure.storage.blob.models.ContainersCreateResponse;
import com.azure.storage.blob.models.ContainersDeleteResponse;
import com.azure.storage.blob.models.ContainersGetAccessPolicyResponse;
import com.azure.storage.blob.models.ContainersGetAccountInfoResponse;
import com.azure.storage.blob.models.ContainersGetPropertiesResponse;
import com.azure.storage.blob.models.ContainersListBlobFlatSegmentResponse;
import com.azure.storage.blob.models.ContainersListBlobHierarchySegmentResponse;
import com.azure.storage.blob.models.ContainersReleaseLeaseResponse;
import com.azure.storage.blob.models.ContainersRenewLeaseResponse;
import com.azure.storage.blob.models.ContainersSetAccessPolicyResponse;
import com.azure.storage.blob.models.ContainersSetMetadataResponse;
import com.azure.storage.blob.models.LeaseAccessConditions;
import com.azure.storage.blob.models.ListBlobsIncludeItem;
import com.azure.storage.blob.models.ModifiedAccessConditions;
import com.azure.storage.blob.models.PublicAccessType;
import com.azure.storage.blob.models.SignedIdentifier;
import com.azure.storage.blob.models.StorageErrorException;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * Containers.
 */
public final class ContainersImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private ContainersService service;

    /**
     * The service client containing this operation class.
     */
    private AzureBlobStorageImpl client;

    /**
     * Initializes an instance of ContainersImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public ContainersImpl(AzureBlobStorageImpl client) {
        this.service = RestProxy.create(ContainersService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for Containers to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{url}")
    @Service("Storage Blobs Containers")
    private interface ContainersService {
        @PUT("{containerName}")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<ContainersCreateResponse> create(@PathParam("containerName") String containerName, @HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-meta-") Map<String, String> metadata, @HeaderParam("x-ms-blob-public-access") PublicAccessType access, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("restype") String restype, Context context);

        @GET("{containerName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<ContainersGetPropertiesResponse> getProperties(@PathParam("containerName") String containerName, @HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("restype") String restype, @HeaderParam("x-ms-lease-id") String leaseId, Context context);

        @DELETE("{containerName}")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<ContainersDeleteResponse> delete(@PathParam("containerName") String containerName, @HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("restype") String restype, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, Context context);

        @PUT("{containerName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<ContainersSetMetadataResponse> setMetadata(@PathParam("containerName") String containerName, @HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-meta-") Map<String, String> metadata, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("restype") String restype, @QueryParam("comp") String comp, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, Context context);

        @GET("{containerName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<ContainersGetAccessPolicyResponse> getAccessPolicy(@PathParam("containerName") String containerName, @HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("restype") String restype, @QueryParam("comp") String comp, @HeaderParam("x-ms-lease-id") String leaseId, Context context);

        @PUT("{containerName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<ContainersSetAccessPolicyResponse> setAccessPolicy(@PathParam("containerName") String containerName, @HostParam("url") String url, @BodyParam("application/xml; charset=utf-8") SignedIdentifiersWrapper containerAcl, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-blob-public-access") PublicAccessType access, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("restype") String restype, @QueryParam("comp") String comp, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, Context context);

        @PUT("{containerName}")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<ContainersAcquireLeaseResponse> acquireLease(@PathParam("containerName") String containerName, @HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-lease-duration") Integer duration, @HeaderParam("x-ms-proposed-lease-id") String proposedLeaseId, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("comp") String comp, @QueryParam("restype") String restype, @HeaderParam("x-ms-lease-action") String action, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, Context context);

        @PUT("{containerName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<ContainersReleaseLeaseResponse> releaseLease(@PathParam("containerName") String containerName, @HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("comp") String comp, @QueryParam("restype") String restype, @HeaderParam("x-ms-lease-action") String action, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, Context context);

        @PUT("{containerName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<ContainersRenewLeaseResponse> renewLease(@PathParam("containerName") String containerName, @HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("comp") String comp, @QueryParam("restype") String restype, @HeaderParam("x-ms-lease-action") String action, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, Context context);

        @PUT("{containerName}")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<ContainersBreakLeaseResponse> breakLease(@PathParam("containerName") String containerName, @HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-lease-break-period") Integer breakPeriod, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("comp") String comp, @QueryParam("restype") String restype, @HeaderParam("x-ms-lease-action") String action, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, Context context);

        @PUT("{containerName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<ContainersChangeLeaseResponse> changeLease(@PathParam("containerName") String containerName, @HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-lease-id") String leaseId, @HeaderParam("x-ms-proposed-lease-id") String proposedLeaseId, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("comp") String comp, @QueryParam("restype") String restype, @HeaderParam("x-ms-lease-action") String action, @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince, @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince, Context context);

        @GET("{containerName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<ContainersListBlobFlatSegmentResponse> listBlobFlatSegment(@PathParam("containerName") String containerName, @HostParam("url") String url, @QueryParam("prefix") String prefix, @QueryParam("marker") String marker, @QueryParam("maxresults") Integer maxresults, @QueryParam("include") String include, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("restype") String restype, @QueryParam("comp") String comp, Context context);

        @GET("{containerName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<ContainersListBlobHierarchySegmentResponse> listBlobHierarchySegment(@PathParam("containerName") String containerName, @HostParam("url") String url, @QueryParam("prefix") String prefix, @QueryParam("delimiter") String delimiter, @QueryParam("marker") String marker, @QueryParam("maxresults") Integer maxresults, @QueryParam("include") String include, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("restype") String restype, @QueryParam("comp") String comp, Context context);

        @GET("{containerName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<ContainersGetAccountInfoResponse> getAccountInfo(@PathParam("containerName") String containerName, @HostParam("url") String url, @HeaderParam("x-ms-version") String version, @QueryParam("restype") String restype, @QueryParam("comp") String comp, Context context);
    }

    /**
     * creates a new container under the specified account. If the container with the same name already exists, the operation fails.
     *
     * @param containerName The container name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<ContainersCreateResponse> createWithRestResponseAsync(String containerName, Context context) {
        final Integer timeout = null;
        final Map<String, String> metadata = null;
        final PublicAccessType access = null;
        final String requestId = null;
        final String restype = "container";
        return service.create(containerName, this.client.url(), timeout, metadata, access, this.client.version(), requestId, restype, context);
    }

    /**
     * creates a new container under the specified account. If the container with the same name already exists, the operation fails.
     *
     * @param containerName The container name.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param metadata Optional. Specifies a user-defined name-value pair associated with the blob. If no name-value pairs are specified, the operation will copy the metadata from the source blob or file to the destination blob. If one or more name-value pairs are specified, the destination blob is created with the specified metadata, and metadata is not copied from the source blob or file. Note that beginning with version 2009-09-19, metadata names must adhere to the naming rules for C# identifiers. See Naming and Referencing Containers, Blobs, and Metadata for more information.
     * @param access Specifies whether data in the container may be accessed publicly and the level of access. Possible values include: 'container', 'blob'.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<ContainersCreateResponse> createWithRestResponseAsync(String containerName, Integer timeout, Map<String, String> metadata, PublicAccessType access, String requestId, Context context) {
        final String restype = "container";
        return service.create(containerName, this.client.url(), timeout, metadata, access, this.client.version(), requestId, restype, context);
    }

    /**
     * returns all user-defined metadata and system properties for the specified container. The data returned does not include the container's list of blobs.
     *
     * @param containerName The container name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<ContainersGetPropertiesResponse> getPropertiesWithRestResponseAsync(String containerName, Context context) {
        final Integer timeout = null;
        final String requestId = null;
        final String restype = "container";
        final String leaseId = null;
        return service.getProperties(containerName, this.client.url(), timeout, this.client.version(), requestId, restype, leaseId, context);
    }

    /**
     * returns all user-defined metadata and system properties for the specified container. The data returned does not include the container's list of blobs.
     *
     * @param containerName The container name.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param leaseAccessConditions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<ContainersGetPropertiesResponse> getPropertiesWithRestResponseAsync(String containerName, Integer timeout, String requestId, LeaseAccessConditions leaseAccessConditions, Context context) {
        final String restype = "container";
        String leaseId = null;
        if (leaseAccessConditions != null) {
            leaseId = leaseAccessConditions.leaseId();
        }
        return service.getProperties(containerName, this.client.url(), timeout, this.client.version(), requestId, restype, leaseId, context);
    }

    /**
     * operation marks the specified container for deletion. The container and any blobs contained within it are later deleted during garbage collection.
     *
     * @param containerName The container name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<ContainersDeleteResponse> deleteWithRestResponseAsync(String containerName, Context context) {
        final Integer timeout = null;
        final String requestId = null;
        final String restype = "container";
        final String leaseId = null;
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        return service.delete(containerName, this.client.url(), timeout, this.client.version(), requestId, restype, leaseId, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, context);
    }

    /**
     * operation marks the specified container for deletion. The container and any blobs contained within it are later deleted during garbage collection.
     *
     * @param containerName The container name.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param leaseAccessConditions Additional parameters for the operation.
     * @param modifiedAccessConditions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<ContainersDeleteResponse> deleteWithRestResponseAsync(String containerName, Integer timeout, String requestId, LeaseAccessConditions leaseAccessConditions, ModifiedAccessConditions modifiedAccessConditions, Context context) {
        final String restype = "container";
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
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.delete(containerName, this.client.url(), timeout, this.client.version(), requestId, restype, leaseId, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, context);
    }

    /**
     * operation sets one or more user-defined name-value pairs for the specified container.
     *
     * @param containerName The container name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<ContainersSetMetadataResponse> setMetadataWithRestResponseAsync(String containerName, Context context) {
        final Integer timeout = null;
        final Map<String, String> metadata = null;
        final String requestId = null;
        final String restype = "container";
        final String comp = "metadata";
        final String leaseId = null;
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        return service.setMetadata(containerName, this.client.url(), timeout, metadata, this.client.version(), requestId, restype, comp, leaseId, ifModifiedSinceConverted, context);
    }

    /**
     * operation sets one or more user-defined name-value pairs for the specified container.
     *
     * @param containerName The container name.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param metadata Optional. Specifies a user-defined name-value pair associated with the blob. If no name-value pairs are specified, the operation will copy the metadata from the source blob or file to the destination blob. If one or more name-value pairs are specified, the destination blob is created with the specified metadata, and metadata is not copied from the source blob or file. Note that beginning with version 2009-09-19, metadata names must adhere to the naming rules for C# identifiers. See Naming and Referencing Containers, Blobs, and Metadata for more information.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param leaseAccessConditions Additional parameters for the operation.
     * @param modifiedAccessConditions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<ContainersSetMetadataResponse> setMetadataWithRestResponseAsync(String containerName, Integer timeout, Map<String, String> metadata, String requestId, LeaseAccessConditions leaseAccessConditions, ModifiedAccessConditions modifiedAccessConditions, Context context) {
        final String restype = "container";
        final String comp = "metadata";
        String leaseId = null;
        if (leaseAccessConditions != null) {
            leaseId = leaseAccessConditions.leaseId();
        }
        OffsetDateTime ifModifiedSince = null;
        if (modifiedAccessConditions != null) {
            ifModifiedSince = modifiedAccessConditions.ifModifiedSince();
        }
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        return service.setMetadata(containerName, this.client.url(), timeout, metadata, this.client.version(), requestId, restype, comp, leaseId, ifModifiedSinceConverted, context);
    }

    /**
     * gets the permissions for the specified container. The permissions indicate whether container data may be accessed publicly.
     *
     * @param containerName The container name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<ContainersGetAccessPolicyResponse> getAccessPolicyWithRestResponseAsync(String containerName, Context context) {
        final Integer timeout = null;
        final String requestId = null;
        final String restype = "container";
        final String comp = "acl";
        final String leaseId = null;
        return service.getAccessPolicy(containerName, this.client.url(), timeout, this.client.version(), requestId, restype, comp, leaseId, context);
    }

    /**
     * gets the permissions for the specified container. The permissions indicate whether container data may be accessed publicly.
     *
     * @param containerName The container name.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param leaseAccessConditions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<ContainersGetAccessPolicyResponse> getAccessPolicyWithRestResponseAsync(String containerName, Integer timeout, String requestId, LeaseAccessConditions leaseAccessConditions, Context context) {
        final String restype = "container";
        final String comp = "acl";
        String leaseId = null;
        if (leaseAccessConditions != null) {
            leaseId = leaseAccessConditions.leaseId();
        }
        return service.getAccessPolicy(containerName, this.client.url(), timeout, this.client.version(), requestId, restype, comp, leaseId, context);
    }

    /**
     * sets the permissions for the specified container. The permissions indicate whether blobs in a container may be accessed publicly.
     *
     * @param containerName The container name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<ContainersSetAccessPolicyResponse> setAccessPolicyWithRestResponseAsync(String containerName, Context context) {
        final Integer timeout = null;
        final PublicAccessType access = null;
        final String requestId = null;
        final String restype = "container";
        final String comp = "acl";
        final String leaseId = null;
        SignedIdentifiersWrapper containerAclConverted = new SignedIdentifiersWrapper(null);
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        return service.setAccessPolicy(containerName, this.client.url(), containerAclConverted, timeout, access, this.client.version(), requestId, restype, comp, leaseId, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, context);
    }

    /**
     * sets the permissions for the specified container. The permissions indicate whether blobs in a container may be accessed publicly.
     *
     * @param containerName The container name.
     * @param containerAcl the acls for the container.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param access Specifies whether data in the container may be accessed publicly and the level of access. Possible values include: 'container', 'blob'.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param leaseAccessConditions Additional parameters for the operation.
     * @param modifiedAccessConditions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<ContainersSetAccessPolicyResponse> setAccessPolicyWithRestResponseAsync(String containerName, List<SignedIdentifier> containerAcl, Integer timeout, PublicAccessType access, String requestId, LeaseAccessConditions leaseAccessConditions, ModifiedAccessConditions modifiedAccessConditions, Context context) {
        final String restype = "container";
        final String comp = "acl";
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
        SignedIdentifiersWrapper containerAclConverted = new SignedIdentifiersWrapper(containerAcl);
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.setAccessPolicy(containerName, this.client.url(), containerAclConverted, timeout, access, this.client.version(), requestId, restype, comp, leaseId, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, context);
    }

    /**
     * [Update] establishes and manages a lock on a container for delete operations. The lock duration can be 15 to 60 seconds, or can be infinite.
     *
     * @param containerName The container name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<ContainersAcquireLeaseResponse> acquireLeaseWithRestResponseAsync(String containerName, Context context) {
        final Integer timeout = null;
        final Integer duration = null;
        final String proposedLeaseId = null;
        final String requestId = null;
        final String comp = "lease";
        final String restype = "container";
        final String action = "acquire";
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        return service.acquireLease(containerName, this.client.url(), timeout, duration, proposedLeaseId, this.client.version(), requestId, comp, restype, action, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, context);
    }

    /**
     * [Update] establishes and manages a lock on a container for delete operations. The lock duration can be 15 to 60 seconds, or can be infinite.
     *
     * @param containerName The container name.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param duration Specifies the duration of the lease, in seconds, or negative one (-1) for a lease that never expires. A non-infinite lease can be between 15 and 60 seconds. A lease duration cannot be changed using renew or change.
     * @param proposedLeaseId Proposed lease ID, in a GUID string format. The Blob service returns 400 (Invalid request) if the proposed lease ID is not in the correct format. See Guid Constructor (String) for a list of valid GUID string formats.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param modifiedAccessConditions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<ContainersAcquireLeaseResponse> acquireLeaseWithRestResponseAsync(String containerName, Integer timeout, Integer duration, String proposedLeaseId, String requestId, ModifiedAccessConditions modifiedAccessConditions, Context context) {
        final String comp = "lease";
        final String restype = "container";
        final String action = "acquire";
        OffsetDateTime ifModifiedSince = null;
        if (modifiedAccessConditions != null) {
            ifModifiedSince = modifiedAccessConditions.ifModifiedSince();
        }
        OffsetDateTime ifUnmodifiedSince = null;
        if (modifiedAccessConditions != null) {
            ifUnmodifiedSince = modifiedAccessConditions.ifUnmodifiedSince();
        }
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.acquireLease(containerName, this.client.url(), timeout, duration, proposedLeaseId, this.client.version(), requestId, comp, restype, action, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, context);
    }

    /**
     * [Update] establishes and manages a lock on a container for delete operations. The lock duration can be 15 to 60 seconds, or can be infinite.
     *
     * @param containerName The container name.
     * @param leaseId Specifies the current lease ID on the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<ContainersReleaseLeaseResponse> releaseLeaseWithRestResponseAsync(String containerName, String leaseId, Context context) {
        final Integer timeout = null;
        final String requestId = null;
        final String comp = "lease";
        final String restype = "container";
        final String action = "release";
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        return service.releaseLease(containerName, this.client.url(), timeout, leaseId, this.client.version(), requestId, comp, restype, action, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, context);
    }

    /**
     * [Update] establishes and manages a lock on a container for delete operations. The lock duration can be 15 to 60 seconds, or can be infinite.
     *
     * @param containerName The container name.
     * @param leaseId Specifies the current lease ID on the resource.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param modifiedAccessConditions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<ContainersReleaseLeaseResponse> releaseLeaseWithRestResponseAsync(String containerName, String leaseId, Integer timeout, String requestId, ModifiedAccessConditions modifiedAccessConditions, Context context) {
        final String comp = "lease";
        final String restype = "container";
        final String action = "release";
        OffsetDateTime ifModifiedSince = null;
        if (modifiedAccessConditions != null) {
            ifModifiedSince = modifiedAccessConditions.ifModifiedSince();
        }
        OffsetDateTime ifUnmodifiedSince = null;
        if (modifiedAccessConditions != null) {
            ifUnmodifiedSince = modifiedAccessConditions.ifUnmodifiedSince();
        }
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.releaseLease(containerName, this.client.url(), timeout, leaseId, this.client.version(), requestId, comp, restype, action, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, context);
    }

    /**
     * [Update] establishes and manages a lock on a container for delete operations. The lock duration can be 15 to 60 seconds, or can be infinite.
     *
     * @param containerName The container name.
     * @param leaseId Specifies the current lease ID on the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<ContainersRenewLeaseResponse> renewLeaseWithRestResponseAsync(String containerName, String leaseId, Context context) {
        final Integer timeout = null;
        final String requestId = null;
        final String comp = "lease";
        final String restype = "container";
        final String action = "renew";
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        return service.renewLease(containerName, this.client.url(), timeout, leaseId, this.client.version(), requestId, comp, restype, action, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, context);
    }

    /**
     * [Update] establishes and manages a lock on a container for delete operations. The lock duration can be 15 to 60 seconds, or can be infinite.
     *
     * @param containerName The container name.
     * @param leaseId Specifies the current lease ID on the resource.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param modifiedAccessConditions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<ContainersRenewLeaseResponse> renewLeaseWithRestResponseAsync(String containerName, String leaseId, Integer timeout, String requestId, ModifiedAccessConditions modifiedAccessConditions, Context context) {
        final String comp = "lease";
        final String restype = "container";
        final String action = "renew";
        OffsetDateTime ifModifiedSince = null;
        if (modifiedAccessConditions != null) {
            ifModifiedSince = modifiedAccessConditions.ifModifiedSince();
        }
        OffsetDateTime ifUnmodifiedSince = null;
        if (modifiedAccessConditions != null) {
            ifUnmodifiedSince = modifiedAccessConditions.ifUnmodifiedSince();
        }
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.renewLease(containerName, this.client.url(), timeout, leaseId, this.client.version(), requestId, comp, restype, action, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, context);
    }

    /**
     * [Update] establishes and manages a lock on a container for delete operations. The lock duration can be 15 to 60 seconds, or can be infinite.
     *
     * @param containerName The container name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<ContainersBreakLeaseResponse> breakLeaseWithRestResponseAsync(String containerName, Context context) {
        final Integer timeout = null;
        final Integer breakPeriod = null;
        final String requestId = null;
        final String comp = "lease";
        final String restype = "container";
        final String action = "break";
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        return service.breakLease(containerName, this.client.url(), timeout, breakPeriod, this.client.version(), requestId, comp, restype, action, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, context);
    }

    /**
     * [Update] establishes and manages a lock on a container for delete operations. The lock duration can be 15 to 60 seconds, or can be infinite.
     *
     * @param containerName The container name.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param breakPeriod For a break operation, proposed duration the lease should continue before it is broken, in seconds, between 0 and 60. This break period is only used if it is shorter than the time remaining on the lease. If longer, the time remaining on the lease is used. A new lease will not be available before the break period has expired, but the lease may be held for longer than the break period. If this header does not appear with a break operation, a fixed-duration lease breaks after the remaining lease period elapses, and an infinite lease breaks immediately.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param modifiedAccessConditions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<ContainersBreakLeaseResponse> breakLeaseWithRestResponseAsync(String containerName, Integer timeout, Integer breakPeriod, String requestId, ModifiedAccessConditions modifiedAccessConditions, Context context) {
        final String comp = "lease";
        final String restype = "container";
        final String action = "break";
        OffsetDateTime ifModifiedSince = null;
        if (modifiedAccessConditions != null) {
            ifModifiedSince = modifiedAccessConditions.ifModifiedSince();
        }
        OffsetDateTime ifUnmodifiedSince = null;
        if (modifiedAccessConditions != null) {
            ifUnmodifiedSince = modifiedAccessConditions.ifUnmodifiedSince();
        }
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.breakLease(containerName, this.client.url(), timeout, breakPeriod, this.client.version(), requestId, comp, restype, action, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, context);
    }

    /**
     * [Update] establishes and manages a lock on a container for delete operations. The lock duration can be 15 to 60 seconds, or can be infinite.
     *
     * @param containerName The container name.
     * @param leaseId Specifies the current lease ID on the resource.
     * @param proposedLeaseId Proposed lease ID, in a GUID string format. The Blob service returns 400 (Invalid request) if the proposed lease ID is not in the correct format. See Guid Constructor (String) for a list of valid GUID string formats.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<ContainersChangeLeaseResponse> changeLeaseWithRestResponseAsync(String containerName, String leaseId, String proposedLeaseId, Context context) {
        final Integer timeout = null;
        final String requestId = null;
        final String comp = "lease";
        final String restype = "container";
        final String action = "change";
        DateTimeRfc1123 ifModifiedSinceConverted = null;
        DateTimeRfc1123 ifUnmodifiedSinceConverted = null;
        return service.changeLease(containerName, this.client.url(), timeout, leaseId, proposedLeaseId, this.client.version(), requestId, comp, restype, action, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, context);
    }

    /**
     * [Update] establishes and manages a lock on a container for delete operations. The lock duration can be 15 to 60 seconds, or can be infinite.
     *
     * @param containerName The container name.
     * @param leaseId Specifies the current lease ID on the resource.
     * @param proposedLeaseId Proposed lease ID, in a GUID string format. The Blob service returns 400 (Invalid request) if the proposed lease ID is not in the correct format. See Guid Constructor (String) for a list of valid GUID string formats.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param modifiedAccessConditions Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<ContainersChangeLeaseResponse> changeLeaseWithRestResponseAsync(String containerName, String leaseId, String proposedLeaseId, Integer timeout, String requestId, ModifiedAccessConditions modifiedAccessConditions, Context context) {
        final String comp = "lease";
        final String restype = "container";
        final String action = "change";
        OffsetDateTime ifModifiedSince = null;
        if (modifiedAccessConditions != null) {
            ifModifiedSince = modifiedAccessConditions.ifModifiedSince();
        }
        OffsetDateTime ifUnmodifiedSince = null;
        if (modifiedAccessConditions != null) {
            ifUnmodifiedSince = modifiedAccessConditions.ifUnmodifiedSince();
        }
        DateTimeRfc1123 ifModifiedSinceConverted = ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted = ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.changeLease(containerName, this.client.url(), timeout, leaseId, proposedLeaseId, this.client.version(), requestId, comp, restype, action, ifModifiedSinceConverted, ifUnmodifiedSinceConverted, context);
    }

    /**
     * [Update] The List Blobs operation returns a list of the blobs under the specified container.
     *
     * @param containerName The container name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<ContainersListBlobFlatSegmentResponse> listBlobFlatSegmentWithRestResponseAsync(String containerName, Context context) {
        final String prefix = null;
        final String marker = null;
        final Integer maxresults = null;
        final Integer timeout = null;
        final String requestId = null;
        final String restype = "container";
        final String comp = "list";
        String includeConverted = null;
        return service.listBlobFlatSegment(containerName, this.client.url(), prefix, marker, maxresults, includeConverted, timeout, this.client.version(), requestId, restype, comp, context);
    }

    /**
     * [Update] The List Blobs operation returns a list of the blobs under the specified container.
     *
     * @param containerName The container name.
     * @param prefix Filters the results to return only containers whose name begins with the specified prefix.
     * @param marker A string value that identifies the portion of the list of containers to be returned with the next listing operation. The operation returns the NextMarker value within the response body if the listing operation did not return all containers remaining to be listed with the current page. The NextMarker value can be used as the value for the marker parameter in a subsequent call to request the next page of list items. The marker value is opaque to the client.
     * @param maxresults Specifies the maximum number of containers to return. If the request does not specify maxresults, or specifies a value greater than 5000, the server will return up to 5000 items. Note that if the listing operation crosses a partition boundary, then the service will return a continuation token for retrieving the remainder of the results. For this reason, it is possible that the service will return fewer results than specified by maxresults, or than the default of 5000.
     * @param include Include this parameter to specify one or more datasets to include in the response.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<ContainersListBlobFlatSegmentResponse> listBlobFlatSegmentWithRestResponseAsync(String containerName, String prefix, String marker, Integer maxresults, List<ListBlobsIncludeItem> include, Integer timeout, String requestId, Context context) {
        final String restype = "container";
        final String comp = "list";
        String includeConverted = JacksonAdapter.createDefaultSerializerAdapter().serializeList(include, CollectionFormat.CSV);
        return service.listBlobFlatSegment(containerName, this.client.url(), prefix, marker, maxresults, includeConverted, timeout, this.client.version(), requestId, restype, comp, context);
    }

    /**
     * [Update] The List Blobs operation returns a list of the blobs under the specified container.
     *
     * @param containerName The container name.
     * @param delimiter When the request includes this parameter, the operation returns a BlobPrefix element in the response body that acts as a placeholder for all blobs whose names begin with the same substring up to the appearance of the delimiter character. The delimiter may be a single character or a string.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<ContainersListBlobHierarchySegmentResponse> listBlobHierarchySegmentWithRestResponseAsync(String containerName, String delimiter, Context context) {
        final String prefix = null;
        final String marker = null;
        final Integer maxresults = null;
        final Integer timeout = null;
        final String requestId = null;
        final String restype = "container";
        final String comp = "list";
        String includeConverted = null;
        return service.listBlobHierarchySegment(containerName, this.client.url(), prefix, delimiter, marker, maxresults, includeConverted, timeout, this.client.version(), requestId, restype, comp, context);
    }

    /**
     * [Update] The List Blobs operation returns a list of the blobs under the specified container.
     *
     * @param containerName The container name.
     * @param delimiter When the request includes this parameter, the operation returns a BlobPrefix element in the response body that acts as a placeholder for all blobs whose names begin with the same substring up to the appearance of the delimiter character. The delimiter may be a single character or a string.
     * @param prefix Filters the results to return only containers whose name begins with the specified prefix.
     * @param marker A string value that identifies the portion of the list of containers to be returned with the next listing operation. The operation returns the NextMarker value within the response body if the listing operation did not return all containers remaining to be listed with the current page. The NextMarker value can be used as the value for the marker parameter in a subsequent call to request the next page of list items. The marker value is opaque to the client.
     * @param maxresults Specifies the maximum number of containers to return. If the request does not specify maxresults, or specifies a value greater than 5000, the server will return up to 5000 items. Note that if the listing operation crosses a partition boundary, then the service will return a continuation token for retrieving the remainder of the results. For this reason, it is possible that the service will return fewer results than specified by maxresults, or than the default of 5000.
     * @param include Include this parameter to specify one or more datasets to include in the response.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<ContainersListBlobHierarchySegmentResponse> listBlobHierarchySegmentWithRestResponseAsync(String containerName, String delimiter, String prefix, String marker, Integer maxresults, List<ListBlobsIncludeItem> include, Integer timeout, String requestId, Context context) {
        final String restype = "container";
        final String comp = "list";
        String includeConverted = JacksonAdapter.createDefaultSerializerAdapter().serializeList(include, CollectionFormat.CSV);
        return service.listBlobHierarchySegment(containerName, this.client.url(), prefix, delimiter, marker, maxresults, includeConverted, timeout, this.client.version(), requestId, restype, comp, context);
    }

    /**
     * Returns the sku name and account kind.
     *
     * @param containerName The container name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<ContainersGetAccountInfoResponse> getAccountInfoWithRestResponseAsync(String containerName, Context context) {
        final String restype = "account";
        final String comp = "properties";
        return service.getAccountInfo(containerName, this.client.url(), this.client.version(), restype, comp, context);
    }
}
