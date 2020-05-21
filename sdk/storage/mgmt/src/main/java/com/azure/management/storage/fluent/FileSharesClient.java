// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.management.storage.fluent;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
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
import com.azure.management.storage.fluent.inner.FileShareInner;
import com.azure.management.storage.fluent.inner.FileShareItemInner;
import com.azure.management.storage.fluent.inner.FileShareItemsInner;
import com.azure.management.storage.models.DeletedShare;
import com.azure.management.storage.models.GetShareExpand;
import com.azure.management.storage.models.ListSharesExpand;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in FileShares. */
public final class FileSharesClient {
    private final ClientLogger logger = new ClientLogger(FileSharesClient.class);

    /** The proxy service used to perform REST calls. */
    private final FileSharesService service;

    /** The service client containing this operation class. */
    private final StorageManagementClient client;

    /**
     * Initializes an instance of FileSharesClient.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public FileSharesClient(StorageManagementClient client) {
        this.service =
            RestProxy.create(FileSharesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for StorageManagementClientFileShares to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "StorageManagementCli")
    private interface FileSharesService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage"
                + "/storageAccounts/{accountName}/fileServices/default/shares")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<SimpleResponse<FileShareItemsInner>> list(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("$maxpagesize") String maxpagesize,
            @QueryParam("$filter") String filter,
            @QueryParam("$expand") ListSharesExpand expand,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Put(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage"
                + "/storageAccounts/{accountName}/fileServices/default/shares/{shareName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<SimpleResponse<FileShareInner>> create(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @PathParam("shareName") String shareName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @BodyParam("application/json") FileShareInner fileShare,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Patch(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage"
                + "/storageAccounts/{accountName}/fileServices/default/shares/{shareName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<SimpleResponse<FileShareInner>> update(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @PathParam("shareName") String shareName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @BodyParam("application/json") FileShareInner fileShare,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage"
                + "/storageAccounts/{accountName}/fileServices/default/shares/{shareName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<SimpleResponse<FileShareInner>> get(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @PathParam("shareName") String shareName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("$expand") GetShareExpand expand,
            Context context);

        @Headers({"Accept: application/json;q=0.9", "Content-Type: application/json"})
        @Delete(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage"
                + "/storageAccounts/{accountName}/fileServices/default/shares/{shareName}")
        @ExpectedResponses({200, 204})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Void>> delete(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @PathParam("shareName") String shareName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            Context context);

        @Headers({"Accept: application/json;q=0.9", "Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage"
                + "/storageAccounts/{accountName}/fileServices/default/shares/{shareName}/restore")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Void>> restore(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @PathParam("shareName") String shareName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @BodyParam("application/json") DeletedShare deletedShare,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<SimpleResponse<FileShareItemsInner>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, Context context);
    }

    /**
     * Lists all shares.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param maxpagesize Optional. Specified maximum number of shares that can be included in the list.
     * @param filter Optional. When specified, only share names starting with the filter will be listed.
     * @param expand Optional, used to expand the properties within share's properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response schema.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<FileShareItemInner>> listSinglePageAsync(
        String resourceGroupName, String accountName, String maxpagesize, String filter, ListSharesExpand expand) {
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
                            expand,
                            context))
            .<PagedResponse<FileShareItemInner>>map(
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
     * Lists all shares.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param maxpagesize Optional. Specified maximum number of shares that can be included in the list.
     * @param filter Optional. When specified, only share names starting with the filter will be listed.
     * @param expand Optional, used to expand the properties within share's properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response schema.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<FileShareItemInner>> listSinglePageAsync(
        String resourceGroupName,
        String accountName,
        String maxpagesize,
        String filter,
        ListSharesExpand expand,
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
                expand,
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
     * Lists all shares.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param maxpagesize Optional. Specified maximum number of shares that can be included in the list.
     * @param filter Optional. When specified, only share names starting with the filter will be listed.
     * @param expand Optional, used to expand the properties within share's properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response schema.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<FileShareItemInner> listAsync(
        String resourceGroupName, String accountName, String maxpagesize, String filter, ListSharesExpand expand) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, accountName, maxpagesize, filter, expand),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Lists all shares.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param maxpagesize Optional. Specified maximum number of shares that can be included in the list.
     * @param filter Optional. When specified, only share names starting with the filter will be listed.
     * @param expand Optional, used to expand the properties within share's properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response schema.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<FileShareItemInner> listAsync(
        String resourceGroupName,
        String accountName,
        String maxpagesize,
        String filter,
        ListSharesExpand expand,
        Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, accountName, maxpagesize, filter, expand, context),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Lists all shares.
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
    public PagedFlux<FileShareItemInner> listAsync(String resourceGroupName, String accountName) {
        final String maxpagesize = null;
        final String filter = null;
        final ListSharesExpand expand = null;
        final Context context = null;
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, accountName, maxpagesize, filter, expand),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Lists all shares.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param maxpagesize Optional. Specified maximum number of shares that can be included in the list.
     * @param filter Optional. When specified, only share names starting with the filter will be listed.
     * @param expand Optional, used to expand the properties within share's properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response schema.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<FileShareItemInner> list(
        String resourceGroupName, String accountName, String maxpagesize, String filter, ListSharesExpand expand) {
        return new PagedIterable<>(listAsync(resourceGroupName, accountName, maxpagesize, filter, expand));
    }

    /**
     * Lists all shares.
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
    public PagedIterable<FileShareItemInner> list(String resourceGroupName, String accountName) {
        final String maxpagesize = null;
        final String filter = null;
        final ListSharesExpand expand = null;
        final Context context = null;
        return new PagedIterable<>(listAsync(resourceGroupName, accountName, maxpagesize, filter, expand));
    }

    /**
     * Creates a new share under the specified account as described by request body. The share resource includes
     * metadata and properties for that share. It does not include a list of the files contained by the share.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param shareName The name of the file share within the specified storage account. File share names must be
     *     between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-)
     *     character must be immediately preceded and followed by a letter or number.
     * @param fileShare Properties of the file share, including Id, resource name, resource type, Etag.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of the file share, including Id, resource name, resource type, Etag.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<FileShareInner>> createWithResponseAsync(
        String resourceGroupName, String accountName, String shareName, FileShareInner fileShare) {
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
        if (shareName == null) {
            return Mono.error(new IllegalArgumentException("Parameter shareName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (fileShare == null) {
            return Mono.error(new IllegalArgumentException("Parameter fileShare is required and cannot be null."));
        } else {
            fileShare.validate();
        }
        return FluxUtil
            .withContext(
                context ->
                    service
                        .create(
                            this.client.getHost(),
                            resourceGroupName,
                            accountName,
                            shareName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            fileShare,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Creates a new share under the specified account as described by request body. The share resource includes
     * metadata and properties for that share. It does not include a list of the files contained by the share.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param shareName The name of the file share within the specified storage account. File share names must be
     *     between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-)
     *     character must be immediately preceded and followed by a letter or number.
     * @param fileShare Properties of the file share, including Id, resource name, resource type, Etag.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of the file share, including Id, resource name, resource type, Etag.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<FileShareInner>> createWithResponseAsync(
        String resourceGroupName, String accountName, String shareName, FileShareInner fileShare, Context context) {
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
        if (shareName == null) {
            return Mono.error(new IllegalArgumentException("Parameter shareName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (fileShare == null) {
            return Mono.error(new IllegalArgumentException("Parameter fileShare is required and cannot be null."));
        } else {
            fileShare.validate();
        }
        return service
            .create(
                this.client.getHost(),
                resourceGroupName,
                accountName,
                shareName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                fileShare,
                context);
    }

    /**
     * Creates a new share under the specified account as described by request body. The share resource includes
     * metadata and properties for that share. It does not include a list of the files contained by the share.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param shareName The name of the file share within the specified storage account. File share names must be
     *     between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-)
     *     character must be immediately preceded and followed by a letter or number.
     * @param fileShare Properties of the file share, including Id, resource name, resource type, Etag.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of the file share, including Id, resource name, resource type, Etag.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<FileShareInner> createAsync(
        String resourceGroupName, String accountName, String shareName, FileShareInner fileShare) {
        return createWithResponseAsync(resourceGroupName, accountName, shareName, fileShare)
            .flatMap(
                (SimpleResponse<FileShareInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Creates a new share under the specified account as described by request body. The share resource includes
     * metadata and properties for that share. It does not include a list of the files contained by the share.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param shareName The name of the file share within the specified storage account. File share names must be
     *     between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-)
     *     character must be immediately preceded and followed by a letter or number.
     * @param fileShare Properties of the file share, including Id, resource name, resource type, Etag.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of the file share, including Id, resource name, resource type, Etag.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public FileShareInner create(
        String resourceGroupName, String accountName, String shareName, FileShareInner fileShare) {
        return createAsync(resourceGroupName, accountName, shareName, fileShare).block();
    }

    /**
     * Updates share properties as specified in request body. Properties not mentioned in the request will not be
     * changed. Update fails if the specified share does not already exist.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param shareName The name of the file share within the specified storage account. File share names must be
     *     between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-)
     *     character must be immediately preceded and followed by a letter or number.
     * @param fileShare Properties of the file share, including Id, resource name, resource type, Etag.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of the file share, including Id, resource name, resource type, Etag.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<FileShareInner>> updateWithResponseAsync(
        String resourceGroupName, String accountName, String shareName, FileShareInner fileShare) {
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
        if (shareName == null) {
            return Mono.error(new IllegalArgumentException("Parameter shareName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (fileShare == null) {
            return Mono.error(new IllegalArgumentException("Parameter fileShare is required and cannot be null."));
        } else {
            fileShare.validate();
        }
        return FluxUtil
            .withContext(
                context ->
                    service
                        .update(
                            this.client.getHost(),
                            resourceGroupName,
                            accountName,
                            shareName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            fileShare,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Updates share properties as specified in request body. Properties not mentioned in the request will not be
     * changed. Update fails if the specified share does not already exist.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param shareName The name of the file share within the specified storage account. File share names must be
     *     between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-)
     *     character must be immediately preceded and followed by a letter or number.
     * @param fileShare Properties of the file share, including Id, resource name, resource type, Etag.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of the file share, including Id, resource name, resource type, Etag.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<FileShareInner>> updateWithResponseAsync(
        String resourceGroupName, String accountName, String shareName, FileShareInner fileShare, Context context) {
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
        if (shareName == null) {
            return Mono.error(new IllegalArgumentException("Parameter shareName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (fileShare == null) {
            return Mono.error(new IllegalArgumentException("Parameter fileShare is required and cannot be null."));
        } else {
            fileShare.validate();
        }
        return service
            .update(
                this.client.getHost(),
                resourceGroupName,
                accountName,
                shareName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                fileShare,
                context);
    }

    /**
     * Updates share properties as specified in request body. Properties not mentioned in the request will not be
     * changed. Update fails if the specified share does not already exist.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param shareName The name of the file share within the specified storage account. File share names must be
     *     between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-)
     *     character must be immediately preceded and followed by a letter or number.
     * @param fileShare Properties of the file share, including Id, resource name, resource type, Etag.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of the file share, including Id, resource name, resource type, Etag.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<FileShareInner> updateAsync(
        String resourceGroupName, String accountName, String shareName, FileShareInner fileShare) {
        return updateWithResponseAsync(resourceGroupName, accountName, shareName, fileShare)
            .flatMap(
                (SimpleResponse<FileShareInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Updates share properties as specified in request body. Properties not mentioned in the request will not be
     * changed. Update fails if the specified share does not already exist.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param shareName The name of the file share within the specified storage account. File share names must be
     *     between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-)
     *     character must be immediately preceded and followed by a letter or number.
     * @param fileShare Properties of the file share, including Id, resource name, resource type, Etag.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of the file share, including Id, resource name, resource type, Etag.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public FileShareInner update(
        String resourceGroupName, String accountName, String shareName, FileShareInner fileShare) {
        return updateAsync(resourceGroupName, accountName, shareName, fileShare).block();
    }

    /**
     * Gets properties of a specified share.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param shareName The name of the file share within the specified storage account. File share names must be
     *     between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-)
     *     character must be immediately preceded and followed by a letter or number.
     * @param expand Optional, used to expand the properties within share's properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a specified share.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<FileShareInner>> getWithResponseAsync(
        String resourceGroupName, String accountName, String shareName, GetShareExpand expand) {
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
        if (shareName == null) {
            return Mono.error(new IllegalArgumentException("Parameter shareName is required and cannot be null."));
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
                            shareName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            expand,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets properties of a specified share.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param shareName The name of the file share within the specified storage account. File share names must be
     *     between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-)
     *     character must be immediately preceded and followed by a letter or number.
     * @param expand Optional, used to expand the properties within share's properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a specified share.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<FileShareInner>> getWithResponseAsync(
        String resourceGroupName, String accountName, String shareName, GetShareExpand expand, Context context) {
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
        if (shareName == null) {
            return Mono.error(new IllegalArgumentException("Parameter shareName is required and cannot be null."));
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
                shareName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                expand,
                context);
    }

    /**
     * Gets properties of a specified share.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param shareName The name of the file share within the specified storage account. File share names must be
     *     between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-)
     *     character must be immediately preceded and followed by a letter or number.
     * @param expand Optional, used to expand the properties within share's properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a specified share.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<FileShareInner> getAsync(
        String resourceGroupName, String accountName, String shareName, GetShareExpand expand) {
        return getWithResponseAsync(resourceGroupName, accountName, shareName, expand)
            .flatMap(
                (SimpleResponse<FileShareInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets properties of a specified share.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param shareName The name of the file share within the specified storage account. File share names must be
     *     between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-)
     *     character must be immediately preceded and followed by a letter or number.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a specified share.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<FileShareInner> getAsync(String resourceGroupName, String accountName, String shareName) {
        final GetShareExpand expand = null;
        final Context context = null;
        return getWithResponseAsync(resourceGroupName, accountName, shareName, expand)
            .flatMap(
                (SimpleResponse<FileShareInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets properties of a specified share.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param shareName The name of the file share within the specified storage account. File share names must be
     *     between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-)
     *     character must be immediately preceded and followed by a letter or number.
     * @param expand Optional, used to expand the properties within share's properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a specified share.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public FileShareInner get(String resourceGroupName, String accountName, String shareName, GetShareExpand expand) {
        return getAsync(resourceGroupName, accountName, shareName, expand).block();
    }

    /**
     * Gets properties of a specified share.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param shareName The name of the file share within the specified storage account. File share names must be
     *     between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-)
     *     character must be immediately preceded and followed by a letter or number.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a specified share.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public FileShareInner get(String resourceGroupName, String accountName, String shareName) {
        final GetShareExpand expand = null;
        final Context context = null;
        return getAsync(resourceGroupName, accountName, shareName, expand).block();
    }

    /**
     * Deletes specified share under its account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param shareName The name of the file share within the specified storage account. File share names must be
     *     between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-)
     *     character must be immediately preceded and followed by a letter or number.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(
        String resourceGroupName, String accountName, String shareName) {
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
        if (shareName == null) {
            return Mono.error(new IllegalArgumentException("Parameter shareName is required and cannot be null."));
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
                            shareName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Deletes specified share under its account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param shareName The name of the file share within the specified storage account. File share names must be
     *     between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-)
     *     character must be immediately preceded and followed by a letter or number.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(
        String resourceGroupName, String accountName, String shareName, Context context) {
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
        if (shareName == null) {
            return Mono.error(new IllegalArgumentException("Parameter shareName is required and cannot be null."));
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
                shareName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                context);
    }

    /**
     * Deletes specified share under its account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param shareName The name of the file share within the specified storage account. File share names must be
     *     between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-)
     *     character must be immediately preceded and followed by a letter or number.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String accountName, String shareName) {
        return deleteWithResponseAsync(resourceGroupName, accountName, shareName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes specified share under its account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param shareName The name of the file share within the specified storage account. File share names must be
     *     between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-)
     *     character must be immediately preceded and followed by a letter or number.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String accountName, String shareName) {
        deleteAsync(resourceGroupName, accountName, shareName).block();
    }

    /**
     * Restore a file share within a valid retention days if share soft delete is enabled.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param shareName The name of the file share within the specified storage account. File share names must be
     *     between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-)
     *     character must be immediately preceded and followed by a letter or number.
     * @param deletedShareName Required. Identify the name of the deleted share that will be restored.
     * @param deletedShareVersion Required. Identify the version of the deleted share that will be restored.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> restoreWithResponseAsync(
        String resourceGroupName,
        String accountName,
        String shareName,
        String deletedShareName,
        String deletedShareVersion) {
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
        if (shareName == null) {
            return Mono.error(new IllegalArgumentException("Parameter shareName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (deletedShareName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter deletedShareName is required and cannot be null."));
        }
        if (deletedShareVersion == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter deletedShareVersion is required and cannot be null."));
        }
        DeletedShare deletedShare = new DeletedShare();
        deletedShare.withDeletedShareName(deletedShareName);
        deletedShare.withDeletedShareVersion(deletedShareVersion);
        return FluxUtil
            .withContext(
                context ->
                    service
                        .restore(
                            this.client.getHost(),
                            resourceGroupName,
                            accountName,
                            shareName,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            deletedShare,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Restore a file share within a valid retention days if share soft delete is enabled.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param shareName The name of the file share within the specified storage account. File share names must be
     *     between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-)
     *     character must be immediately preceded and followed by a letter or number.
     * @param deletedShareName Required. Identify the name of the deleted share that will be restored.
     * @param deletedShareVersion Required. Identify the version of the deleted share that will be restored.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> restoreWithResponseAsync(
        String resourceGroupName,
        String accountName,
        String shareName,
        String deletedShareName,
        String deletedShareVersion,
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
        if (shareName == null) {
            return Mono.error(new IllegalArgumentException("Parameter shareName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (deletedShareName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter deletedShareName is required and cannot be null."));
        }
        if (deletedShareVersion == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter deletedShareVersion is required and cannot be null."));
        }
        DeletedShare deletedShare = new DeletedShare();
        deletedShare.withDeletedShareName(deletedShareName);
        deletedShare.withDeletedShareVersion(deletedShareVersion);
        return service
            .restore(
                this.client.getHost(),
                resourceGroupName,
                accountName,
                shareName,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                deletedShare,
                context);
    }

    /**
     * Restore a file share within a valid retention days if share soft delete is enabled.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param shareName The name of the file share within the specified storage account. File share names must be
     *     between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-)
     *     character must be immediately preceded and followed by a letter or number.
     * @param deletedShareName Required. Identify the name of the deleted share that will be restored.
     * @param deletedShareVersion Required. Identify the version of the deleted share that will be restored.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> restoreAsync(
        String resourceGroupName,
        String accountName,
        String shareName,
        String deletedShareName,
        String deletedShareVersion) {
        return restoreWithResponseAsync(
                resourceGroupName, accountName, shareName, deletedShareName, deletedShareVersion)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Restore a file share within a valid retention days if share soft delete is enabled.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     *     must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param shareName The name of the file share within the specified storage account. File share names must be
     *     between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-)
     *     character must be immediately preceded and followed by a letter or number.
     * @param deletedShareName Required. Identify the name of the deleted share that will be restored.
     * @param deletedShareVersion Required. Identify the version of the deleted share that will be restored.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void restore(
        String resourceGroupName,
        String accountName,
        String shareName,
        String deletedShareName,
        String deletedShareVersion) {
        restoreAsync(resourceGroupName, accountName, shareName, deletedShareName, deletedShareVersion).block();
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
    public Mono<PagedResponse<FileShareItemInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        return FluxUtil
            .withContext(context -> service.listNext(nextLink, context))
            .<PagedResponse<FileShareItemInner>>map(
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
    public Mono<PagedResponse<FileShareItemInner>> listNextSinglePageAsync(String nextLink, Context context) {
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
