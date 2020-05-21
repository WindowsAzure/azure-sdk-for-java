// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.management.storage.fluent;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Patch;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.management.storage.StorageManagementClient;
import com.azure.management.storage.fluent.inner.BlobContainerInner;
import com.azure.management.storage.fluent.inner.ImmutabilityPolicyInner;
import com.azure.management.storage.fluent.inner.LeaseContainerResponseInner;
import com.azure.management.storage.fluent.inner.LegalHoldInner;
import com.azure.management.storage.fluent.inner.ListContainerItemInner;
import com.azure.management.storage.fluent.inner.ListContainerItemsInner;
import com.azure.management.storage.models.BlobContainersCreateOrUpdateImmutabilityPolicyResponse;
import com.azure.management.storage.models.BlobContainersDeleteImmutabilityPolicyResponse;
import com.azure.management.storage.models.BlobContainersExtendImmutabilityPolicyResponse;
import com.azure.management.storage.models.BlobContainersGetImmutabilityPolicyResponse;
import com.azure.management.storage.models.BlobContainersLockImmutabilityPolicyResponse;
import com.azure.management.storage.models.LeaseContainerRequest;
import com.azure.management.storage.models.ListSharesExpand;
import java.util.List;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in BlobContainers. */
public final class BlobContainersClient {
    private final ClientLogger logger = new ClientLogger(BlobContainersClient.class);

    /** The proxy service used to perform REST calls. */
    private final BlobContainersService service;

    /** The service client containing this operation class. */
    private final StorageManagementClient client;

    /**
     * Initializes an instance of BlobContainersClient.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public BlobContainersClient(StorageManagementClient client) {
        this.service =
            RestProxy.create(BlobContainersService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for StorageManagementClientBlobContainers to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "StorageManagementCli")
    private interface BlobContainersService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage"
                + "/storageAccounts/{accountName}/blobServices/default/containers")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<SimpleResponse<ListContainerItemsInner>> list(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("$maxpagesize") String maxpagesize,
            @QueryParam("$filter") String filter,
            @QueryParam("$include") ListSharesExpand include,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Put(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage"
                + "/storageAccounts/{accountName}/blobServices/default/containers/{containerName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<SimpleResponse<BlobContainerInner>> create(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @PathParam("containerName") String containerName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @BodyParam("application/json") BlobContainerInner blobContainer,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Patch(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage"
                + "/storageAccounts/{accountName}/blobServices/default/containers/{containerName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<SimpleResponse<BlobContainerInner>> update(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @PathParam("containerName") String containerName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @BodyParam("application/json") BlobContainerInner blobContainer,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage"
                + "/storageAccounts/{accountName}/blobServices/default/containers/{containerName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<SimpleResponse<BlobContainerInner>> get(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @PathParam("containerName") String containerName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            Context context);

        @Headers({"Accept: application/json;q=0.9", "Content-Type: application/json"})
        @Delete(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage"
                + "/storageAccounts/{accountName}/blobServices/default/containers/{containerName}")
        @ExpectedResponses({200, 204})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Void>> delete(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @PathParam("containerName") String containerName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage"
                + "/storageAccounts/{accountName}/blobServices/default/containers/{containerName}/setLegalHold")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<SimpleResponse<LegalHoldInner>> setLegalHold(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @PathParam("containerName") String containerName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @BodyParam("application/json") LegalHoldInner legalHold,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage"
                + "/storageAccounts/{accountName}/blobServices/default/containers/{containerName}/clearLegalHold")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<SimpleResponse<LegalHoldInner>> clearLegalHold(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @PathParam("containerName") String containerName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @BodyParam("application/json") LegalHoldInner legalHold,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Put(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage"
                + "/storageAccounts/{accountName}/blobServices/default/containers/{containerName}/immutabilityPolicies"
                + "/{immutabilityPolicyName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<BlobContainersCreateOrUpdateImmutabilityPolicyResponse> createOrUpdateImmutabilityPolicy(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @PathParam("containerName") String containerName,
            @PathParam("immutabilityPolicyName") String immutabilityPolicyName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("If-Match") String ifMatch,
            @BodyParam("application/json") ImmutabilityPolicyInner parameters,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage"
                + "/storageAccounts/{accountName}/blobServices/default/containers/{containerName}/immutabilityPolicies"
                + "/{immutabilityPolicyName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<BlobContainersGetImmutabilityPolicyResponse> getImmutabilityPolicy(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @PathParam("containerName") String containerName,
            @PathParam("immutabilityPolicyName") String immutabilityPolicyName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("If-Match") String ifMatch,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Delete(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage"
                + "/storageAccounts/{accountName}/blobServices/default/containers/{containerName}/immutabilityPolicies"
                + "/{immutabilityPolicyName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<BlobContainersDeleteImmutabilityPolicyResponse> deleteImmutabilityPolicy(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @PathParam("containerName") String containerName,
            @PathParam("immutabilityPolicyName") String immutabilityPolicyName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("If-Match") String ifMatch,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage"
                + "/storageAccounts/{accountName}/blobServices/default/containers/{containerName}/immutabilityPolicies"
                + "/default/lock")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<BlobContainersLockImmutabilityPolicyResponse> lockImmutabilityPolicy(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @PathParam("containerName") String containerName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("If-Match") String ifMatch,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage"
                + "/storageAccounts/{accountName}/blobServices/default/containers/{containerName}/immutabilityPolicies"
                + "/default/extend")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<BlobContainersExtendImmutabilityPolicyResponse> extendImmutabilityPolicy(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @PathParam("containerName") String containerName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("If-Match") String ifMatch,
            @BodyParam("application/json") ImmutabilityPolicyInner parameters,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage"
                + "/storageAccounts/{accountName}/blobServices/default/containers/{containerName}/lease")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<SimpleResponse<LeaseContainerResponseInner>> lease(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @PathParam("containerName") String containerName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @BodyParam("application/json") LeaseContainerRequest parameters,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<SimpleResponse<ListContainerItemsInner>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, Context context);
    }

    /**
     * Lists all containers and does not support a prefix like data plane. Also SRP today does not return continuation
     * token.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param maxpagesize Optional. Specified maximum number of containers that can be included in the list.
     * @param filter Optional. When specified, only container names starting with the filter will be listed.
     * @param include Optional, used to include the properties for soft deleted blob containers.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response schema.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ListContainerItemInner>> listSinglePageAsync(
        String resourceGroupName, String accountName, String maxpagesize, String filter, ListSharesExpand include) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getHost(),
                            resourceGroupName,
                            accountName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            maxpagesize,
                            filter,
                            include,
                            context))
            .<PagedResponse<ListContainerItemInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Lists all containers and does not support a prefix like data plane. Also SRP today does not return continuation
     * token.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param maxpagesize Optional. Specified maximum number of containers that can be included in the list.
     * @param filter Optional. When specified, only container names starting with the filter will be listed.
     * @param include Optional, used to include the properties for soft deleted blob containers.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response schema.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ListContainerItemInner>> listSinglePageAsync(
        String resourceGroupName,
        String accountName,
        String maxpagesize,
        String filter,
        ListSharesExpand include,
        Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        return service
            .list(
                this.client.getHost(),
                resourceGroupName,
                accountName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                maxpagesize,
                filter,
                include,
                context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }

    /**
     * Lists all containers and does not support a prefix like data plane. Also SRP today does not return continuation
     * token.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param maxpagesize Optional. Specified maximum number of containers that can be included in the list.
     * @param filter Optional. When specified, only container names starting with the filter will be listed.
     * @param include Optional, used to include the properties for soft deleted blob containers.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response schema.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ListContainerItemInner> listAsync(
        String resourceGroupName, String accountName, String maxpagesize, String filter, ListSharesExpand include) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, accountName, maxpagesize, filter, include),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Lists all containers and does not support a prefix like data plane. Also SRP today does not return continuation
     * token.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param maxpagesize Optional. Specified maximum number of containers that can be included in the list.
     * @param filter Optional. When specified, only container names starting with the filter will be listed.
     * @param include Optional, used to include the properties for soft deleted blob containers.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response schema.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ListContainerItemInner> listAsync(
        String resourceGroupName,
        String accountName,
        String maxpagesize,
        String filter,
        ListSharesExpand include,
        Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, accountName, maxpagesize, filter, include, context),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Lists all containers and does not support a prefix like data plane. Also SRP today does not return continuation
     * token.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response schema.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ListContainerItemInner> listAsync(String resourceGroupName, String accountName) {
        final String maxpagesize = null;
        final String filter = null;
        final ListSharesExpand include = null;
        final Context context = null;
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, accountName, maxpagesize, filter, include),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Lists all containers and does not support a prefix like data plane. Also SRP today does not return continuation
     * token.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param maxpagesize Optional. Specified maximum number of containers that can be included in the list.
     * @param filter Optional. When specified, only container names starting with the filter will be listed.
     * @param include Optional, used to include the properties for soft deleted blob containers.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response schema.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ListContainerItemInner> list(
        String resourceGroupName, String accountName, String maxpagesize, String filter, ListSharesExpand include) {
        return new PagedIterable<>(listAsync(resourceGroupName, accountName, maxpagesize, filter, include));
    }

    /**
     * Lists all containers and does not support a prefix like data plane. Also SRP today does not return continuation
     * token.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response schema.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ListContainerItemInner> list(String resourceGroupName, String accountName) {
        final String maxpagesize = null;
        final String filter = null;
        final ListSharesExpand include = null;
        final Context context = null;
        return new PagedIterable<>(listAsync(resourceGroupName, accountName, maxpagesize, filter, include));
    }

    /**
     * Creates a new container under the specified account as described by request body. The container resource includes
     * metadata and properties for that container. It does not include a list of the blobs contained by the container.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @param blobContainer Properties of the blob container, including Id, resource name, resource type, Etag.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of the blob container, including Id, resource name, resource type, Etag.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<BlobContainerInner>> createWithResponseAsync(
        String resourceGroupName, String accountName, String containerName, BlobContainerInner blobContainer) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (containerName == null) {
            return Mono.error(new IllegalArgumentException("Parameter containerName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (blobContainer == null) {
            return Mono.error(new IllegalArgumentException("Parameter blobContainer is required and cannot be null."));
        } else {
            blobContainer.validate();
        }
        return FluxUtil
            .withContext(
                context ->
                    service
                        .create(
                            this.client.getHost(),
                            resourceGroupName,
                            accountName,
                            containerName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            blobContainer,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Creates a new container under the specified account as described by request body. The container resource includes
     * metadata and properties for that container. It does not include a list of the blobs contained by the container.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @param blobContainer Properties of the blob container, including Id, resource name, resource type, Etag.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of the blob container, including Id, resource name, resource type, Etag.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<BlobContainerInner>> createWithResponseAsync(
        String resourceGroupName,
        String accountName,
        String containerName,
        BlobContainerInner blobContainer,
        Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (containerName == null) {
            return Mono.error(new IllegalArgumentException("Parameter containerName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (blobContainer == null) {
            return Mono.error(new IllegalArgumentException("Parameter blobContainer is required and cannot be null."));
        } else {
            blobContainer.validate();
        }
        return service
            .create(
                this.client.getHost(),
                resourceGroupName,
                accountName,
                containerName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                blobContainer,
                context);
    }

    /**
     * Creates a new container under the specified account as described by request body. The container resource includes
     * metadata and properties for that container. It does not include a list of the blobs contained by the container.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @param blobContainer Properties of the blob container, including Id, resource name, resource type, Etag.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of the blob container, including Id, resource name, resource type, Etag.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<BlobContainerInner> createAsync(
        String resourceGroupName, String accountName, String containerName, BlobContainerInner blobContainer) {
        return createWithResponseAsync(resourceGroupName, accountName, containerName, blobContainer)
            .flatMap(
                (SimpleResponse<BlobContainerInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Creates a new container under the specified account as described by request body. The container resource includes
     * metadata and properties for that container. It does not include a list of the blobs contained by the container.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @param blobContainer Properties of the blob container, including Id, resource name, resource type, Etag.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of the blob container, including Id, resource name, resource type, Etag.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public BlobContainerInner create(
        String resourceGroupName, String accountName, String containerName, BlobContainerInner blobContainer) {
        return createAsync(resourceGroupName, accountName, containerName, blobContainer).block();
    }

    /**
     * Updates container properties as specified in request body. Properties not mentioned in the request will be
     * unchanged. Update fails if the specified container doesn't already exist.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @param blobContainer Properties of the blob container, including Id, resource name, resource type, Etag.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of the blob container, including Id, resource name, resource type, Etag.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<BlobContainerInner>> updateWithResponseAsync(
        String resourceGroupName, String accountName, String containerName, BlobContainerInner blobContainer) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (containerName == null) {
            return Mono.error(new IllegalArgumentException("Parameter containerName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (blobContainer == null) {
            return Mono.error(new IllegalArgumentException("Parameter blobContainer is required and cannot be null."));
        } else {
            blobContainer.validate();
        }
        return FluxUtil
            .withContext(
                context ->
                    service
                        .update(
                            this.client.getHost(),
                            resourceGroupName,
                            accountName,
                            containerName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            blobContainer,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Updates container properties as specified in request body. Properties not mentioned in the request will be
     * unchanged. Update fails if the specified container doesn't already exist.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @param blobContainer Properties of the blob container, including Id, resource name, resource type, Etag.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of the blob container, including Id, resource name, resource type, Etag.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<BlobContainerInner>> updateWithResponseAsync(
        String resourceGroupName,
        String accountName,
        String containerName,
        BlobContainerInner blobContainer,
        Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (containerName == null) {
            return Mono.error(new IllegalArgumentException("Parameter containerName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (blobContainer == null) {
            return Mono.error(new IllegalArgumentException("Parameter blobContainer is required and cannot be null."));
        } else {
            blobContainer.validate();
        }
        return service
            .update(
                this.client.getHost(),
                resourceGroupName,
                accountName,
                containerName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                blobContainer,
                context);
    }

    /**
     * Updates container properties as specified in request body. Properties not mentioned in the request will be
     * unchanged. Update fails if the specified container doesn't already exist.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @param blobContainer Properties of the blob container, including Id, resource name, resource type, Etag.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of the blob container, including Id, resource name, resource type, Etag.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<BlobContainerInner> updateAsync(
        String resourceGroupName, String accountName, String containerName, BlobContainerInner blobContainer) {
        return updateWithResponseAsync(resourceGroupName, accountName, containerName, blobContainer)
            .flatMap(
                (SimpleResponse<BlobContainerInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Updates container properties as specified in request body. Properties not mentioned in the request will be
     * unchanged. Update fails if the specified container doesn't already exist.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @param blobContainer Properties of the blob container, including Id, resource name, resource type, Etag.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of the blob container, including Id, resource name, resource type, Etag.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public BlobContainerInner update(
        String resourceGroupName, String accountName, String containerName, BlobContainerInner blobContainer) {
        return updateAsync(resourceGroupName, accountName, containerName, blobContainer).block();
    }

    /**
     * Gets properties of a specified container.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a specified container.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<BlobContainerInner>> getWithResponseAsync(
        String resourceGroupName, String accountName, String containerName) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (containerName == null) {
            return Mono.error(new IllegalArgumentException("Parameter containerName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getHost(),
                            resourceGroupName,
                            accountName,
                            containerName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets properties of a specified container.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a specified container.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<BlobContainerInner>> getWithResponseAsync(
        String resourceGroupName, String accountName, String containerName, Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (containerName == null) {
            return Mono.error(new IllegalArgumentException("Parameter containerName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        return service
            .get(
                this.client.getHost(),
                resourceGroupName,
                accountName,
                containerName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                context);
    }

    /**
     * Gets properties of a specified container.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a specified container.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<BlobContainerInner> getAsync(String resourceGroupName, String accountName, String containerName) {
        return getWithResponseAsync(resourceGroupName, accountName, containerName)
            .flatMap(
                (SimpleResponse<BlobContainerInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets properties of a specified container.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a specified container.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public BlobContainerInner get(String resourceGroupName, String accountName, String containerName) {
        return getAsync(resourceGroupName, accountName, containerName).block();
    }

    /**
     * Deletes specified container under its account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(
        String resourceGroupName, String accountName, String containerName) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (containerName == null) {
            return Mono.error(new IllegalArgumentException("Parameter containerName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        return FluxUtil
            .withContext(
                context ->
                    service
                        .delete(
                            this.client.getHost(),
                            resourceGroupName,
                            accountName,
                            containerName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Deletes specified container under its account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(
        String resourceGroupName, String accountName, String containerName, Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (containerName == null) {
            return Mono.error(new IllegalArgumentException("Parameter containerName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        return service
            .delete(
                this.client.getHost(),
                resourceGroupName,
                accountName,
                containerName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                context);
    }

    /**
     * Deletes specified container under its account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String accountName, String containerName) {
        return deleteWithResponseAsync(resourceGroupName, accountName, containerName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes specified container under its account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String accountName, String containerName) {
        deleteAsync(resourceGroupName, accountName, containerName).block();
    }

    /**
     * Sets legal hold tags. Setting the same tag results in an idempotent operation. SetLegalHold follows an append
     * pattern and does not clear out the existing tags that are not specified in the request.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @param tags Each tag should be 3 to 23 alphanumeric characters and is normalized to lower case at SRP.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the LegalHold property of a blob container.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<LegalHoldInner>> setLegalHoldWithResponseAsync(
        String resourceGroupName, String accountName, String containerName, List<String> tags) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (containerName == null) {
            return Mono.error(new IllegalArgumentException("Parameter containerName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (tags == null) {
            return Mono.error(new IllegalArgumentException("Parameter tags is required and cannot be null."));
        }
        LegalHoldInner legalHold = new LegalHoldInner();
        legalHold.withTags(tags);
        return FluxUtil
            .withContext(
                context ->
                    service
                        .setLegalHold(
                            this.client.getHost(),
                            resourceGroupName,
                            accountName,
                            containerName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            legalHold,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Sets legal hold tags. Setting the same tag results in an idempotent operation. SetLegalHold follows an append
     * pattern and does not clear out the existing tags that are not specified in the request.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @param tags Each tag should be 3 to 23 alphanumeric characters and is normalized to lower case at SRP.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the LegalHold property of a blob container.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<LegalHoldInner>> setLegalHoldWithResponseAsync(
        String resourceGroupName, String accountName, String containerName, List<String> tags, Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (containerName == null) {
            return Mono.error(new IllegalArgumentException("Parameter containerName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (tags == null) {
            return Mono.error(new IllegalArgumentException("Parameter tags is required and cannot be null."));
        }
        LegalHoldInner legalHold = new LegalHoldInner();
        legalHold.withTags(tags);
        return service
            .setLegalHold(
                this.client.getHost(),
                resourceGroupName,
                accountName,
                containerName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                legalHold,
                context);
    }

    /**
     * Sets legal hold tags. Setting the same tag results in an idempotent operation. SetLegalHold follows an append
     * pattern and does not clear out the existing tags that are not specified in the request.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @param tags Each tag should be 3 to 23 alphanumeric characters and is normalized to lower case at SRP.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the LegalHold property of a blob container.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LegalHoldInner> setLegalHoldAsync(
        String resourceGroupName, String accountName, String containerName, List<String> tags) {
        return setLegalHoldWithResponseAsync(resourceGroupName, accountName, containerName, tags)
            .flatMap(
                (SimpleResponse<LegalHoldInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Sets legal hold tags. Setting the same tag results in an idempotent operation. SetLegalHold follows an append
     * pattern and does not clear out the existing tags that are not specified in the request.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @param tags Each tag should be 3 to 23 alphanumeric characters and is normalized to lower case at SRP.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the LegalHold property of a blob container.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LegalHoldInner setLegalHold(
        String resourceGroupName, String accountName, String containerName, List<String> tags) {
        return setLegalHoldAsync(resourceGroupName, accountName, containerName, tags).block();
    }

    /**
     * Clears legal hold tags. Clearing the same or non-existent tag results in an idempotent operation. ClearLegalHold
     * clears out only the specified tags in the request.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @param tags Each tag should be 3 to 23 alphanumeric characters and is normalized to lower case at SRP.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the LegalHold property of a blob container.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<LegalHoldInner>> clearLegalHoldWithResponseAsync(
        String resourceGroupName, String accountName, String containerName, List<String> tags) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (containerName == null) {
            return Mono.error(new IllegalArgumentException("Parameter containerName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (tags == null) {
            return Mono.error(new IllegalArgumentException("Parameter tags is required and cannot be null."));
        }
        LegalHoldInner legalHold = new LegalHoldInner();
        legalHold.withTags(tags);
        return FluxUtil
            .withContext(
                context ->
                    service
                        .clearLegalHold(
                            this.client.getHost(),
                            resourceGroupName,
                            accountName,
                            containerName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            legalHold,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Clears legal hold tags. Clearing the same or non-existent tag results in an idempotent operation. ClearLegalHold
     * clears out only the specified tags in the request.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @param tags Each tag should be 3 to 23 alphanumeric characters and is normalized to lower case at SRP.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the LegalHold property of a blob container.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<LegalHoldInner>> clearLegalHoldWithResponseAsync(
        String resourceGroupName, String accountName, String containerName, List<String> tags, Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (containerName == null) {
            return Mono.error(new IllegalArgumentException("Parameter containerName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (tags == null) {
            return Mono.error(new IllegalArgumentException("Parameter tags is required and cannot be null."));
        }
        LegalHoldInner legalHold = new LegalHoldInner();
        legalHold.withTags(tags);
        return service
            .clearLegalHold(
                this.client.getHost(),
                resourceGroupName,
                accountName,
                containerName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                legalHold,
                context);
    }

    /**
     * Clears legal hold tags. Clearing the same or non-existent tag results in an idempotent operation. ClearLegalHold
     * clears out only the specified tags in the request.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @param tags Each tag should be 3 to 23 alphanumeric characters and is normalized to lower case at SRP.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the LegalHold property of a blob container.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LegalHoldInner> clearLegalHoldAsync(
        String resourceGroupName, String accountName, String containerName, List<String> tags) {
        return clearLegalHoldWithResponseAsync(resourceGroupName, accountName, containerName, tags)
            .flatMap(
                (SimpleResponse<LegalHoldInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Clears legal hold tags. Clearing the same or non-existent tag results in an idempotent operation. ClearLegalHold
     * clears out only the specified tags in the request.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @param tags Each tag should be 3 to 23 alphanumeric characters and is normalized to lower case at SRP.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the LegalHold property of a blob container.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LegalHoldInner clearLegalHold(
        String resourceGroupName, String accountName, String containerName, List<String> tags) {
        return clearLegalHoldAsync(resourceGroupName, accountName, containerName, tags).block();
    }

    /**
     * Creates or updates an unlocked immutability policy. ETag in If-Match is honored if given but not required for
     * this operation.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @param ifMatch The entity state (ETag) version of the immutability policy to update. A value of "*" can be used
     *     to apply the operation only if the immutability policy already exists. If omitted, this operation will always
     *     be applied.
     * @param immutabilityPeriodSinceCreationInDays The immutability period for the blobs in the container since the
     *     policy creation, in days.
     * @param allowProtectedAppendWrites This property can only be changed for unlocked time-based retention policies.
     *     When enabled, new blocks can be written to an append blob while maintaining immutability protection and
     *     compliance. Only new blocks can be added and any existing blocks cannot be modified or deleted. This property
     *     cannot be changed with ExtendImmutabilityPolicy API.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ImmutabilityPolicy property of a blob container, including Id, resource name, resource type, Etag.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<BlobContainersCreateOrUpdateImmutabilityPolicyResponse>
        createOrUpdateImmutabilityPolicyWithResponseAsync(
            String resourceGroupName,
            String accountName,
            String containerName,
            String ifMatch,
            Integer immutabilityPeriodSinceCreationInDays,
            Boolean allowProtectedAppendWrites) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (containerName == null) {
            return Mono.error(new IllegalArgumentException("Parameter containerName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String immutabilityPolicyName = "default";
        ImmutabilityPolicyInner parametersInternal = null;
        if (immutabilityPeriodSinceCreationInDays != null || allowProtectedAppendWrites != null) {
            parametersInternal = new ImmutabilityPolicyInner();
            parametersInternal.withImmutabilityPeriodSinceCreationInDays(immutabilityPeriodSinceCreationInDays);
            parametersInternal.withAllowProtectedAppendWrites(allowProtectedAppendWrites);
        }
        ImmutabilityPolicyInner parameters = parametersInternal;
        return FluxUtil
            .withContext(
                context ->
                    service
                        .createOrUpdateImmutabilityPolicy(
                            this.client.getHost(),
                            resourceGroupName,
                            accountName,
                            containerName,
                            immutabilityPolicyName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            ifMatch,
                            parameters,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Creates or updates an unlocked immutability policy. ETag in If-Match is honored if given but not required for
     * this operation.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @param ifMatch The entity state (ETag) version of the immutability policy to update. A value of "*" can be used
     *     to apply the operation only if the immutability policy already exists. If omitted, this operation will always
     *     be applied.
     * @param immutabilityPeriodSinceCreationInDays The immutability period for the blobs in the container since the
     *     policy creation, in days.
     * @param allowProtectedAppendWrites This property can only be changed for unlocked time-based retention policies.
     *     When enabled, new blocks can be written to an append blob while maintaining immutability protection and
     *     compliance. Only new blocks can be added and any existing blocks cannot be modified or deleted. This property
     *     cannot be changed with ExtendImmutabilityPolicy API.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ImmutabilityPolicy property of a blob container, including Id, resource name, resource type, Etag.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<BlobContainersCreateOrUpdateImmutabilityPolicyResponse>
        createOrUpdateImmutabilityPolicyWithResponseAsync(
            String resourceGroupName,
            String accountName,
            String containerName,
            String ifMatch,
            Integer immutabilityPeriodSinceCreationInDays,
            Boolean allowProtectedAppendWrites,
            Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (containerName == null) {
            return Mono.error(new IllegalArgumentException("Parameter containerName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String immutabilityPolicyName = "default";
        ImmutabilityPolicyInner parametersInternal = null;
        if (immutabilityPeriodSinceCreationInDays != null || allowProtectedAppendWrites != null) {
            parametersInternal = new ImmutabilityPolicyInner();
            parametersInternal.withImmutabilityPeriodSinceCreationInDays(immutabilityPeriodSinceCreationInDays);
            parametersInternal.withAllowProtectedAppendWrites(allowProtectedAppendWrites);
        }
        ImmutabilityPolicyInner parameters = parametersInternal;
        return service
            .createOrUpdateImmutabilityPolicy(
                this.client.getHost(),
                resourceGroupName,
                accountName,
                containerName,
                immutabilityPolicyName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                ifMatch,
                parameters,
                context);
    }

    /**
     * Creates or updates an unlocked immutability policy. ETag in If-Match is honored if given but not required for
     * this operation.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @param ifMatch The entity state (ETag) version of the immutability policy to update. A value of "*" can be used
     *     to apply the operation only if the immutability policy already exists. If omitted, this operation will always
     *     be applied.
     * @param immutabilityPeriodSinceCreationInDays The immutability period for the blobs in the container since the
     *     policy creation, in days.
     * @param allowProtectedAppendWrites This property can only be changed for unlocked time-based retention policies.
     *     When enabled, new blocks can be written to an append blob while maintaining immutability protection and
     *     compliance. Only new blocks can be added and any existing blocks cannot be modified or deleted. This property
     *     cannot be changed with ExtendImmutabilityPolicy API.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ImmutabilityPolicy property of a blob container, including Id, resource name, resource type, Etag.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ImmutabilityPolicyInner> createOrUpdateImmutabilityPolicyAsync(
        String resourceGroupName,
        String accountName,
        String containerName,
        String ifMatch,
        Integer immutabilityPeriodSinceCreationInDays,
        Boolean allowProtectedAppendWrites) {
        return createOrUpdateImmutabilityPolicyWithResponseAsync(
                resourceGroupName,
                accountName,
                containerName,
                ifMatch,
                immutabilityPeriodSinceCreationInDays,
                allowProtectedAppendWrites)
            .flatMap(
                (BlobContainersCreateOrUpdateImmutabilityPolicyResponse res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Creates or updates an unlocked immutability policy. ETag in If-Match is honored if given but not required for
     * this operation.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @param ifMatch The entity state (ETag) version of the immutability policy to update. A value of "*" can be used
     *     to apply the operation only if the immutability policy already exists. If omitted, this operation will always
     *     be applied.
     * @param immutabilityPeriodSinceCreationInDays The immutability period for the blobs in the container since the
     *     policy creation, in days.
     * @param allowProtectedAppendWrites This property can only be changed for unlocked time-based retention policies.
     *     When enabled, new blocks can be written to an append blob while maintaining immutability protection and
     *     compliance. Only new blocks can be added and any existing blocks cannot be modified or deleted. This property
     *     cannot be changed with ExtendImmutabilityPolicy API.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ImmutabilityPolicy property of a blob container, including Id, resource name, resource type, Etag.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ImmutabilityPolicyInner createOrUpdateImmutabilityPolicy(
        String resourceGroupName,
        String accountName,
        String containerName,
        String ifMatch,
        Integer immutabilityPeriodSinceCreationInDays,
        Boolean allowProtectedAppendWrites) {
        return createOrUpdateImmutabilityPolicyAsync(
                resourceGroupName,
                accountName,
                containerName,
                ifMatch,
                immutabilityPeriodSinceCreationInDays,
                allowProtectedAppendWrites)
            .block();
    }

    /**
     * Gets the existing immutability policy along with the corresponding ETag in response headers and body.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @param ifMatch The entity state (ETag) version of the immutability policy to update. A value of "*" can be used
     *     to apply the operation only if the immutability policy already exists. If omitted, this operation will always
     *     be applied.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the existing immutability policy along with the corresponding ETag in response headers and body.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<BlobContainersGetImmutabilityPolicyResponse> getImmutabilityPolicyWithResponseAsync(
        String resourceGroupName, String accountName, String containerName, String ifMatch) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (containerName == null) {
            return Mono.error(new IllegalArgumentException("Parameter containerName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String immutabilityPolicyName = "default";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .getImmutabilityPolicy(
                            this.client.getHost(),
                            resourceGroupName,
                            accountName,
                            containerName,
                            immutabilityPolicyName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            ifMatch,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets the existing immutability policy along with the corresponding ETag in response headers and body.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @param ifMatch The entity state (ETag) version of the immutability policy to update. A value of "*" can be used
     *     to apply the operation only if the immutability policy already exists. If omitted, this operation will always
     *     be applied.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the existing immutability policy along with the corresponding ETag in response headers and body.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<BlobContainersGetImmutabilityPolicyResponse> getImmutabilityPolicyWithResponseAsync(
        String resourceGroupName, String accountName, String containerName, String ifMatch, Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (containerName == null) {
            return Mono.error(new IllegalArgumentException("Parameter containerName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String immutabilityPolicyName = "default";
        return service
            .getImmutabilityPolicy(
                this.client.getHost(),
                resourceGroupName,
                accountName,
                containerName,
                immutabilityPolicyName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                ifMatch,
                context);
    }

    /**
     * Gets the existing immutability policy along with the corresponding ETag in response headers and body.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @param ifMatch The entity state (ETag) version of the immutability policy to update. A value of "*" can be used
     *     to apply the operation only if the immutability policy already exists. If omitted, this operation will always
     *     be applied.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the existing immutability policy along with the corresponding ETag in response headers and body.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ImmutabilityPolicyInner> getImmutabilityPolicyAsync(
        String resourceGroupName, String accountName, String containerName, String ifMatch) {
        return getImmutabilityPolicyWithResponseAsync(resourceGroupName, accountName, containerName, ifMatch)
            .flatMap(
                (BlobContainersGetImmutabilityPolicyResponse res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets the existing immutability policy along with the corresponding ETag in response headers and body.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the existing immutability policy along with the corresponding ETag in response headers and body.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ImmutabilityPolicyInner> getImmutabilityPolicyAsync(
        String resourceGroupName, String accountName, String containerName) {
        final String ifMatch = null;
        final Context context = null;
        return getImmutabilityPolicyWithResponseAsync(resourceGroupName, accountName, containerName, ifMatch)
            .flatMap(
                (BlobContainersGetImmutabilityPolicyResponse res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets the existing immutability policy along with the corresponding ETag in response headers and body.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @param ifMatch The entity state (ETag) version of the immutability policy to update. A value of "*" can be used
     *     to apply the operation only if the immutability policy already exists. If omitted, this operation will always
     *     be applied.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the existing immutability policy along with the corresponding ETag in response headers and body.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ImmutabilityPolicyInner getImmutabilityPolicy(
        String resourceGroupName, String accountName, String containerName, String ifMatch) {
        return getImmutabilityPolicyAsync(resourceGroupName, accountName, containerName, ifMatch).block();
    }

    /**
     * Gets the existing immutability policy along with the corresponding ETag in response headers and body.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the existing immutability policy along with the corresponding ETag in response headers and body.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ImmutabilityPolicyInner getImmutabilityPolicy(
        String resourceGroupName, String accountName, String containerName) {
        final String ifMatch = null;
        final Context context = null;
        return getImmutabilityPolicyAsync(resourceGroupName, accountName, containerName, ifMatch).block();
    }

    /**
     * Aborts an unlocked immutability policy. The response of delete has immutabilityPeriodSinceCreationInDays set to
     * 0. ETag in If-Match is required for this operation. Deleting a locked immutability policy is not allowed, only
     * way is to delete the container after deleting all blobs inside the container.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @param ifMatch The entity state (ETag) version of the immutability policy to update. A value of "*" can be used
     *     to apply the operation only if the immutability policy already exists. If omitted, this operation will always
     *     be applied.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ImmutabilityPolicy property of a blob container, including Id, resource name, resource type, Etag.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<BlobContainersDeleteImmutabilityPolicyResponse> deleteImmutabilityPolicyWithResponseAsync(
        String resourceGroupName, String accountName, String containerName, String ifMatch) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (containerName == null) {
            return Mono.error(new IllegalArgumentException("Parameter containerName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (ifMatch == null) {
            return Mono.error(new IllegalArgumentException("Parameter ifMatch is required and cannot be null."));
        }
        final String immutabilityPolicyName = "default";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .deleteImmutabilityPolicy(
                            this.client.getHost(),
                            resourceGroupName,
                            accountName,
                            containerName,
                            immutabilityPolicyName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            ifMatch,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Aborts an unlocked immutability policy. The response of delete has immutabilityPeriodSinceCreationInDays set to
     * 0. ETag in If-Match is required for this operation. Deleting a locked immutability policy is not allowed, only
     * way is to delete the container after deleting all blobs inside the container.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @param ifMatch The entity state (ETag) version of the immutability policy to update. A value of "*" can be used
     *     to apply the operation only if the immutability policy already exists. If omitted, this operation will always
     *     be applied.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ImmutabilityPolicy property of a blob container, including Id, resource name, resource type, Etag.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<BlobContainersDeleteImmutabilityPolicyResponse> deleteImmutabilityPolicyWithResponseAsync(
        String resourceGroupName, String accountName, String containerName, String ifMatch, Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (containerName == null) {
            return Mono.error(new IllegalArgumentException("Parameter containerName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (ifMatch == null) {
            return Mono.error(new IllegalArgumentException("Parameter ifMatch is required and cannot be null."));
        }
        final String immutabilityPolicyName = "default";
        return service
            .deleteImmutabilityPolicy(
                this.client.getHost(),
                resourceGroupName,
                accountName,
                containerName,
                immutabilityPolicyName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                ifMatch,
                context);
    }

    /**
     * Aborts an unlocked immutability policy. The response of delete has immutabilityPeriodSinceCreationInDays set to
     * 0. ETag in If-Match is required for this operation. Deleting a locked immutability policy is not allowed, only
     * way is to delete the container after deleting all blobs inside the container.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @param ifMatch The entity state (ETag) version of the immutability policy to update. A value of "*" can be used
     *     to apply the operation only if the immutability policy already exists. If omitted, this operation will always
     *     be applied.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ImmutabilityPolicy property of a blob container, including Id, resource name, resource type, Etag.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ImmutabilityPolicyInner> deleteImmutabilityPolicyAsync(
        String resourceGroupName, String accountName, String containerName, String ifMatch) {
        return deleteImmutabilityPolicyWithResponseAsync(resourceGroupName, accountName, containerName, ifMatch)
            .flatMap(
                (BlobContainersDeleteImmutabilityPolicyResponse res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Aborts an unlocked immutability policy. The response of delete has immutabilityPeriodSinceCreationInDays set to
     * 0. ETag in If-Match is required for this operation. Deleting a locked immutability policy is not allowed, only
     * way is to delete the container after deleting all blobs inside the container.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @param ifMatch The entity state (ETag) version of the immutability policy to update. A value of "*" can be used
     *     to apply the operation only if the immutability policy already exists. If omitted, this operation will always
     *     be applied.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ImmutabilityPolicy property of a blob container, including Id, resource name, resource type, Etag.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ImmutabilityPolicyInner deleteImmutabilityPolicy(
        String resourceGroupName, String accountName, String containerName, String ifMatch) {
        return deleteImmutabilityPolicyAsync(resourceGroupName, accountName, containerName, ifMatch).block();
    }

    /**
     * Sets the ImmutabilityPolicy to Locked state. The only action allowed on a Locked policy is
     * ExtendImmutabilityPolicy action. ETag in If-Match is required for this operation.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @param ifMatch The entity state (ETag) version of the immutability policy to update. A value of "*" can be used
     *     to apply the operation only if the immutability policy already exists. If omitted, this operation will always
     *     be applied.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ImmutabilityPolicy property of a blob container, including Id, resource name, resource type, Etag.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<BlobContainersLockImmutabilityPolicyResponse> lockImmutabilityPolicyWithResponseAsync(
        String resourceGroupName, String accountName, String containerName, String ifMatch) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (containerName == null) {
            return Mono.error(new IllegalArgumentException("Parameter containerName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (ifMatch == null) {
            return Mono.error(new IllegalArgumentException("Parameter ifMatch is required and cannot be null."));
        }
        return FluxUtil
            .withContext(
                context ->
                    service
                        .lockImmutabilityPolicy(
                            this.client.getHost(),
                            resourceGroupName,
                            accountName,
                            containerName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            ifMatch,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Sets the ImmutabilityPolicy to Locked state. The only action allowed on a Locked policy is
     * ExtendImmutabilityPolicy action. ETag in If-Match is required for this operation.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @param ifMatch The entity state (ETag) version of the immutability policy to update. A value of "*" can be used
     *     to apply the operation only if the immutability policy already exists. If omitted, this operation will always
     *     be applied.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ImmutabilityPolicy property of a blob container, including Id, resource name, resource type, Etag.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<BlobContainersLockImmutabilityPolicyResponse> lockImmutabilityPolicyWithResponseAsync(
        String resourceGroupName, String accountName, String containerName, String ifMatch, Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (containerName == null) {
            return Mono.error(new IllegalArgumentException("Parameter containerName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (ifMatch == null) {
            return Mono.error(new IllegalArgumentException("Parameter ifMatch is required and cannot be null."));
        }
        return service
            .lockImmutabilityPolicy(
                this.client.getHost(),
                resourceGroupName,
                accountName,
                containerName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                ifMatch,
                context);
    }

    /**
     * Sets the ImmutabilityPolicy to Locked state. The only action allowed on a Locked policy is
     * ExtendImmutabilityPolicy action. ETag in If-Match is required for this operation.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @param ifMatch The entity state (ETag) version of the immutability policy to update. A value of "*" can be used
     *     to apply the operation only if the immutability policy already exists. If omitted, this operation will always
     *     be applied.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ImmutabilityPolicy property of a blob container, including Id, resource name, resource type, Etag.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ImmutabilityPolicyInner> lockImmutabilityPolicyAsync(
        String resourceGroupName, String accountName, String containerName, String ifMatch) {
        return lockImmutabilityPolicyWithResponseAsync(resourceGroupName, accountName, containerName, ifMatch)
            .flatMap(
                (BlobContainersLockImmutabilityPolicyResponse res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Sets the ImmutabilityPolicy to Locked state. The only action allowed on a Locked policy is
     * ExtendImmutabilityPolicy action. ETag in If-Match is required for this operation.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @param ifMatch The entity state (ETag) version of the immutability policy to update. A value of "*" can be used
     *     to apply the operation only if the immutability policy already exists. If omitted, this operation will always
     *     be applied.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ImmutabilityPolicy property of a blob container, including Id, resource name, resource type, Etag.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ImmutabilityPolicyInner lockImmutabilityPolicy(
        String resourceGroupName, String accountName, String containerName, String ifMatch) {
        return lockImmutabilityPolicyAsync(resourceGroupName, accountName, containerName, ifMatch).block();
    }

    /**
     * Extends the immutabilityPeriodSinceCreationInDays of a locked immutabilityPolicy. The only action allowed on a
     * Locked policy will be this action. ETag in If-Match is required for this operation.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @param ifMatch The entity state (ETag) version of the immutability policy to update. A value of "*" can be used
     *     to apply the operation only if the immutability policy already exists. If omitted, this operation will always
     *     be applied.
     * @param immutabilityPeriodSinceCreationInDays The immutability period for the blobs in the container since the
     *     policy creation, in days.
     * @param allowProtectedAppendWrites This property can only be changed for unlocked time-based retention policies.
     *     When enabled, new blocks can be written to an append blob while maintaining immutability protection and
     *     compliance. Only new blocks can be added and any existing blocks cannot be modified or deleted. This property
     *     cannot be changed with ExtendImmutabilityPolicy API.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ImmutabilityPolicy property of a blob container, including Id, resource name, resource type, Etag.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<BlobContainersExtendImmutabilityPolicyResponse> extendImmutabilityPolicyWithResponseAsync(
        String resourceGroupName,
        String accountName,
        String containerName,
        String ifMatch,
        Integer immutabilityPeriodSinceCreationInDays,
        Boolean allowProtectedAppendWrites) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (containerName == null) {
            return Mono.error(new IllegalArgumentException("Parameter containerName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (ifMatch == null) {
            return Mono.error(new IllegalArgumentException("Parameter ifMatch is required and cannot be null."));
        }
        ImmutabilityPolicyInner parametersInternal = null;
        if (immutabilityPeriodSinceCreationInDays != null || allowProtectedAppendWrites != null) {
            parametersInternal = new ImmutabilityPolicyInner();
            parametersInternal.withImmutabilityPeriodSinceCreationInDays(immutabilityPeriodSinceCreationInDays);
            parametersInternal.withAllowProtectedAppendWrites(allowProtectedAppendWrites);
        }
        ImmutabilityPolicyInner parameters = parametersInternal;
        return FluxUtil
            .withContext(
                context ->
                    service
                        .extendImmutabilityPolicy(
                            this.client.getHost(),
                            resourceGroupName,
                            accountName,
                            containerName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            ifMatch,
                            parameters,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Extends the immutabilityPeriodSinceCreationInDays of a locked immutabilityPolicy. The only action allowed on a
     * Locked policy will be this action. ETag in If-Match is required for this operation.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @param ifMatch The entity state (ETag) version of the immutability policy to update. A value of "*" can be used
     *     to apply the operation only if the immutability policy already exists. If omitted, this operation will always
     *     be applied.
     * @param immutabilityPeriodSinceCreationInDays The immutability period for the blobs in the container since the
     *     policy creation, in days.
     * @param allowProtectedAppendWrites This property can only be changed for unlocked time-based retention policies.
     *     When enabled, new blocks can be written to an append blob while maintaining immutability protection and
     *     compliance. Only new blocks can be added and any existing blocks cannot be modified or deleted. This property
     *     cannot be changed with ExtendImmutabilityPolicy API.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ImmutabilityPolicy property of a blob container, including Id, resource name, resource type, Etag.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<BlobContainersExtendImmutabilityPolicyResponse> extendImmutabilityPolicyWithResponseAsync(
        String resourceGroupName,
        String accountName,
        String containerName,
        String ifMatch,
        Integer immutabilityPeriodSinceCreationInDays,
        Boolean allowProtectedAppendWrites,
        Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (containerName == null) {
            return Mono.error(new IllegalArgumentException("Parameter containerName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (ifMatch == null) {
            return Mono.error(new IllegalArgumentException("Parameter ifMatch is required and cannot be null."));
        }
        ImmutabilityPolicyInner parametersInternal = null;
        if (immutabilityPeriodSinceCreationInDays != null || allowProtectedAppendWrites != null) {
            parametersInternal = new ImmutabilityPolicyInner();
            parametersInternal.withImmutabilityPeriodSinceCreationInDays(immutabilityPeriodSinceCreationInDays);
            parametersInternal.withAllowProtectedAppendWrites(allowProtectedAppendWrites);
        }
        ImmutabilityPolicyInner parameters = parametersInternal;
        return service
            .extendImmutabilityPolicy(
                this.client.getHost(),
                resourceGroupName,
                accountName,
                containerName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                ifMatch,
                parameters,
                context);
    }

    /**
     * Extends the immutabilityPeriodSinceCreationInDays of a locked immutabilityPolicy. The only action allowed on a
     * Locked policy will be this action. ETag in If-Match is required for this operation.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @param ifMatch The entity state (ETag) version of the immutability policy to update. A value of "*" can be used
     *     to apply the operation only if the immutability policy already exists. If omitted, this operation will always
     *     be applied.
     * @param immutabilityPeriodSinceCreationInDays The immutability period for the blobs in the container since the
     *     policy creation, in days.
     * @param allowProtectedAppendWrites This property can only be changed for unlocked time-based retention policies.
     *     When enabled, new blocks can be written to an append blob while maintaining immutability protection and
     *     compliance. Only new blocks can be added and any existing blocks cannot be modified or deleted. This property
     *     cannot be changed with ExtendImmutabilityPolicy API.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ImmutabilityPolicy property of a blob container, including Id, resource name, resource type, Etag.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ImmutabilityPolicyInner> extendImmutabilityPolicyAsync(
        String resourceGroupName,
        String accountName,
        String containerName,
        String ifMatch,
        Integer immutabilityPeriodSinceCreationInDays,
        Boolean allowProtectedAppendWrites) {
        return extendImmutabilityPolicyWithResponseAsync(
                resourceGroupName,
                accountName,
                containerName,
                ifMatch,
                immutabilityPeriodSinceCreationInDays,
                allowProtectedAppendWrites)
            .flatMap(
                (BlobContainersExtendImmutabilityPolicyResponse res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Extends the immutabilityPeriodSinceCreationInDays of a locked immutabilityPolicy. The only action allowed on a
     * Locked policy will be this action. ETag in If-Match is required for this operation.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @param ifMatch The entity state (ETag) version of the immutability policy to update. A value of "*" can be used
     *     to apply the operation only if the immutability policy already exists. If omitted, this operation will always
     *     be applied.
     * @param immutabilityPeriodSinceCreationInDays The immutability period for the blobs in the container since the
     *     policy creation, in days.
     * @param allowProtectedAppendWrites This property can only be changed for unlocked time-based retention policies.
     *     When enabled, new blocks can be written to an append blob while maintaining immutability protection and
     *     compliance. Only new blocks can be added and any existing blocks cannot be modified or deleted. This property
     *     cannot be changed with ExtendImmutabilityPolicy API.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ImmutabilityPolicy property of a blob container, including Id, resource name, resource type, Etag.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ImmutabilityPolicyInner extendImmutabilityPolicy(
        String resourceGroupName,
        String accountName,
        String containerName,
        String ifMatch,
        Integer immutabilityPeriodSinceCreationInDays,
        Boolean allowProtectedAppendWrites) {
        return extendImmutabilityPolicyAsync(
                resourceGroupName,
                accountName,
                containerName,
                ifMatch,
                immutabilityPeriodSinceCreationInDays,
                allowProtectedAppendWrites)
            .block();
    }

    /**
     * The Lease Container operation establishes and manages a lock on a container for delete operations. The lock
     * duration can be 15 to 60 seconds, or can be infinite.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @param parameters Lease Container request schema.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return lease Container response schema.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<LeaseContainerResponseInner>> leaseWithResponseAsync(
        String resourceGroupName, String accountName, String containerName, LeaseContainerRequest parameters) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (containerName == null) {
            return Mono.error(new IllegalArgumentException("Parameter containerName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (parameters != null) {
            parameters.validate();
        }
        return FluxUtil
            .withContext(
                context ->
                    service
                        .lease(
                            this.client.getHost(),
                            resourceGroupName,
                            accountName,
                            containerName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            parameters,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * The Lease Container operation establishes and manages a lock on a container for delete operations. The lock
     * duration can be 15 to 60 seconds, or can be infinite.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @param parameters Lease Container request schema.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return lease Container response schema.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<LeaseContainerResponseInner>> leaseWithResponseAsync(
        String resourceGroupName,
        String accountName,
        String containerName,
        LeaseContainerRequest parameters,
        Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (containerName == null) {
            return Mono.error(new IllegalArgumentException("Parameter containerName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (parameters != null) {
            parameters.validate();
        }
        return service
            .lease(
                this.client.getHost(),
                resourceGroupName,
                accountName,
                containerName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                parameters,
                context);
    }

    /**
     * The Lease Container operation establishes and manages a lock on a container for delete operations. The lock
     * duration can be 15 to 60 seconds, or can be infinite.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @param parameters Lease Container request schema.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return lease Container response schema.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LeaseContainerResponseInner> leaseAsync(
        String resourceGroupName, String accountName, String containerName, LeaseContainerRequest parameters) {
        return leaseWithResponseAsync(resourceGroupName, accountName, containerName, parameters)
            .flatMap(
                (SimpleResponse<LeaseContainerResponseInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * The Lease Container operation establishes and manages a lock on a container for delete operations. The lock
     * duration can be 15 to 60 seconds, or can be infinite.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return lease Container response schema.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LeaseContainerResponseInner> leaseAsync(
        String resourceGroupName, String accountName, String containerName) {
        final LeaseContainerRequest parameters = null;
        final Context context = null;
        return leaseWithResponseAsync(resourceGroupName, accountName, containerName, parameters)
            .flatMap(
                (SimpleResponse<LeaseContainerResponseInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * The Lease Container operation establishes and manages a lock on a container for delete operations. The lock
     * duration can be 15 to 60 seconds, or can be infinite.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @param parameters Lease Container request schema.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return lease Container response schema.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LeaseContainerResponseInner lease(
        String resourceGroupName, String accountName, String containerName, LeaseContainerRequest parameters) {
        return leaseAsync(resourceGroupName, accountName, containerName, parameters).block();
    }

    /**
     * The Lease Container operation establishes and manages a lock on a container for delete operations. The lock
     * duration can be 15 to 60 seconds, or can be infinite.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param containerName The name of the blob container within the specified storage account. Blob container names
     *     must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every
     *     dash (-) character must be immediately preceded and followed by a letter or number.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return lease Container response schema.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LeaseContainerResponseInner lease(String resourceGroupName, String accountName, String containerName) {
        final LeaseContainerRequest parameters = null;
        final Context context = null;
        return leaseAsync(resourceGroupName, accountName, containerName, parameters).block();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response schema.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ListContainerItemInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        return FluxUtil
            .withContext(context -> service.listNext(nextLink, context))
            .<PagedResponse<ListContainerItemInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response schema.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ListContainerItemInner>> listNextSinglePageAsync(String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        return service
            .listNext(nextLink, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }
}
