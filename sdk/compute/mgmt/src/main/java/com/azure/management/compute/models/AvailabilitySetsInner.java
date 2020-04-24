// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute.models;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Headers;
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
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.CloudException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.management.compute.AvailabilitySetUpdate;
import com.azure.management.resources.fluentcore.collection.InnerSupportsDelete;
import com.azure.management.resources.fluentcore.collection.InnerSupportsGet;
import com.azure.management.resources.fluentcore.collection.InnerSupportsListing;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in AvailabilitySets. */
public final class AvailabilitySetsInner
    implements InnerSupportsGet<AvailabilitySetInner>,
        InnerSupportsListing<AvailabilitySetInner>,
        InnerSupportsDelete<Void> {
    /** The proxy service used to perform REST calls. */
    private final AvailabilitySetsService service;

    /** The service client containing this operation class. */
    private final ComputeManagementClientImpl client;

    /**
     * Initializes an instance of AvailabilitySetsInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    AvailabilitySetsInner(ComputeManagementClientImpl client) {
        this.service =
            RestProxy.create(AvailabilitySetsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ComputeManagementClientAvailabilitySets to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ComputeManagementCli")
    private interface AvailabilitySetsService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Put(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute"
                + "/availabilitySets/{availabilitySetName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<AvailabilitySetInner>> createOrUpdate(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("availabilitySetName") String availabilitySetName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @BodyParam("application/json") AvailabilitySetInner parameters,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Patch(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute"
                + "/availabilitySets/{availabilitySetName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<AvailabilitySetInner>> update(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("availabilitySetName") String availabilitySetName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @BodyParam("application/json") AvailabilitySetUpdate parameters,
            Context context);

        @Headers({"Accept: application/json;q=0.9", "Content-Type: application/json"})
        @Delete(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute"
                + "/availabilitySets/{availabilitySetName}")
        @ExpectedResponses({200, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> delete(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("availabilitySetName") String availabilitySetName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute"
                + "/availabilitySets/{availabilitySetName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<AvailabilitySetInner>> getByResourceGroup(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("availabilitySetName") String availabilitySetName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Compute/availabilitySets")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<AvailabilitySetListResultInner>> list(
            @HostParam("$host") String host,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("$expand") String expand,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute"
                + "/availabilitySets")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<AvailabilitySetListResultInner>> listByResourceGroup(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute"
                + "/availabilitySets/{availabilitySetName}/vmSizes")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<VirtualMachineSizeListResultInner>> listAvailableSizes(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("availabilitySetName") String availabilitySetName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<AvailabilitySetListResultInner>> listBySubscriptionNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<AvailabilitySetListResultInner>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, Context context);
    }

    /**
     * Create or update an availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName The name of the availability set.
     * @param parameters Specifies information about the availability set that the virtual machine should be assigned
     *     to. Virtual machines specified in the same availability set are allocated to different nodes to maximize
     *     availability. For more information about availability sets, see [Manage the availability of virtual
     *     machines](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-manage-availability?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json).
     *     &lt;br&gt;&lt;br&gt; For more information on Azure planned maintenance, see [Planned maintenance for virtual
     *     machines in
     *     Azure](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-planned-maintenance?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json)
     *     &lt;br&gt;&lt;br&gt; Currently, a VM can only be added to availability set at creation time. An existing VM
     *     cannot be added to an availability set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the availability set that the virtual machine should be assigned to.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<AvailabilitySetInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName, String availabilitySetName, AvailabilitySetInner parameters) {
        final String apiVersion = "2019-03-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .createOrUpdate(
                            this.client.getHost(),
                            resourceGroupName,
                            availabilitySetName,
                            apiVersion,
                            this.client.getSubscriptionId(),
                            parameters,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Create or update an availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName The name of the availability set.
     * @param parameters Specifies information about the availability set that the virtual machine should be assigned
     *     to. Virtual machines specified in the same availability set are allocated to different nodes to maximize
     *     availability. For more information about availability sets, see [Manage the availability of virtual
     *     machines](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-manage-availability?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json).
     *     &lt;br&gt;&lt;br&gt; For more information on Azure planned maintenance, see [Planned maintenance for virtual
     *     machines in
     *     Azure](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-planned-maintenance?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json)
     *     &lt;br&gt;&lt;br&gt; Currently, a VM can only be added to availability set at creation time. An existing VM
     *     cannot be added to an availability set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the availability set that the virtual machine should be assigned to.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AvailabilitySetInner> createOrUpdateAsync(
        String resourceGroupName, String availabilitySetName, AvailabilitySetInner parameters) {
        return createOrUpdateWithResponseAsync(resourceGroupName, availabilitySetName, parameters)
            .flatMap(
                (SimpleResponse<AvailabilitySetInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Create or update an availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName The name of the availability set.
     * @param parameters Specifies information about the availability set that the virtual machine should be assigned
     *     to. Virtual machines specified in the same availability set are allocated to different nodes to maximize
     *     availability. For more information about availability sets, see [Manage the availability of virtual
     *     machines](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-manage-availability?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json).
     *     &lt;br&gt;&lt;br&gt; For more information on Azure planned maintenance, see [Planned maintenance for virtual
     *     machines in
     *     Azure](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-planned-maintenance?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json)
     *     &lt;br&gt;&lt;br&gt; Currently, a VM can only be added to availability set at creation time. An existing VM
     *     cannot be added to an availability set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the availability set that the virtual machine should be assigned to.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public AvailabilitySetInner createOrUpdate(
        String resourceGroupName, String availabilitySetName, AvailabilitySetInner parameters) {
        return createOrUpdateAsync(resourceGroupName, availabilitySetName, parameters).block();
    }

    /**
     * Update an availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName The name of the availability set.
     * @param parameters Specifies information about the availability set that the virtual machine should be assigned
     *     to. Only tags may be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the availability set that the virtual machine should be assigned to.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<AvailabilitySetInner>> updateWithResponseAsync(
        String resourceGroupName, String availabilitySetName, AvailabilitySetUpdate parameters) {
        final String apiVersion = "2019-03-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .update(
                            this.client.getHost(),
                            resourceGroupName,
                            availabilitySetName,
                            apiVersion,
                            this.client.getSubscriptionId(),
                            parameters,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Update an availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName The name of the availability set.
     * @param parameters Specifies information about the availability set that the virtual machine should be assigned
     *     to. Only tags may be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the availability set that the virtual machine should be assigned to.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AvailabilitySetInner> updateAsync(
        String resourceGroupName, String availabilitySetName, AvailabilitySetUpdate parameters) {
        return updateWithResponseAsync(resourceGroupName, availabilitySetName, parameters)
            .flatMap(
                (SimpleResponse<AvailabilitySetInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Update an availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName The name of the availability set.
     * @param parameters Specifies information about the availability set that the virtual machine should be assigned
     *     to. Only tags may be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the availability set that the virtual machine should be assigned to.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public AvailabilitySetInner update(
        String resourceGroupName, String availabilitySetName, AvailabilitySetUpdate parameters) {
        return updateAsync(resourceGroupName, availabilitySetName, parameters).block();
    }

    /**
     * Delete an availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName The name of the availability set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(String resourceGroupName, String availabilitySetName) {
        final String apiVersion = "2019-03-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .delete(
                            this.client.getHost(),
                            resourceGroupName,
                            availabilitySetName,
                            apiVersion,
                            this.client.getSubscriptionId(),
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Delete an availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName The name of the availability set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String availabilitySetName) {
        return deleteWithResponseAsync(resourceGroupName, availabilitySetName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Delete an availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName The name of the availability set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String availabilitySetName) {
        deleteAsync(resourceGroupName, availabilitySetName).block();
    }

    /**
     * Retrieves information about an availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName The name of the availability set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the availability set that the virtual machine should be assigned to.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<AvailabilitySetInner>> getByResourceGroupWithResponseAsync(
        String resourceGroupName, String availabilitySetName) {
        final String apiVersion = "2019-03-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .getByResourceGroup(
                            this.client.getHost(),
                            resourceGroupName,
                            availabilitySetName,
                            apiVersion,
                            this.client.getSubscriptionId(),
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Retrieves information about an availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName The name of the availability set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the availability set that the virtual machine should be assigned to.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AvailabilitySetInner> getByResourceGroupAsync(String resourceGroupName, String availabilitySetName) {
        return getByResourceGroupWithResponseAsync(resourceGroupName, availabilitySetName)
            .flatMap(
                (SimpleResponse<AvailabilitySetInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Retrieves information about an availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName The name of the availability set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the availability set that the virtual machine should be assigned to.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public AvailabilitySetInner getByResourceGroup(String resourceGroupName, String availabilitySetName) {
        return getByResourceGroupAsync(resourceGroupName, availabilitySetName).block();
    }

    /**
     * Lists all availability sets in a subscription.
     *
     * @param expand The expand expression to apply to the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Availability Set operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<AvailabilitySetInner>> listSinglePageAsync(String expand) {
        final String apiVersion = "2019-03-01";
        return FluxUtil
            .withContext(
                context ->
                    service.list(this.client.getHost(), apiVersion, this.client.getSubscriptionId(), expand, context))
            .<PagedResponse<AvailabilitySetInner>>map(
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
     * Lists all availability sets in a subscription.
     *
     * @param expand The expand expression to apply to the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Availability Set operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<AvailabilitySetInner> listAsync(String expand) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(expand), nextLink -> listBySubscriptionNextSinglePageAsync(nextLink));
    }

    /**
     * Lists all availability sets in a subscription.
     *
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Availability Set operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<AvailabilitySetInner> listAsync() {
        final String expand = null;
        final Context context = null;
        return new PagedFlux<>(
            () -> listSinglePageAsync(expand), nextLink -> listBySubscriptionNextSinglePageAsync(nextLink));
    }

    /**
     * Lists all availability sets in a subscription.
     *
     * @param expand The expand expression to apply to the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Availability Set operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<AvailabilitySetInner> list(String expand) {
        return new PagedIterable<>(listAsync(expand));
    }

    /**
     * Lists all availability sets in a subscription.
     *
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Availability Set operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<AvailabilitySetInner> list() {
        final String expand = null;
        final Context context = null;
        return new PagedIterable<>(listAsync(expand));
    }

    /**
     * Lists all availability sets in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Availability Set operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<AvailabilitySetInner>> listByResourceGroupSinglePageAsync(String resourceGroupName) {
        final String apiVersion = "2019-03-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByResourceGroup(
                            this.client.getHost(),
                            resourceGroupName,
                            apiVersion,
                            this.client.getSubscriptionId(),
                            context))
            .<PagedResponse<AvailabilitySetInner>>map(
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
     * Lists all availability sets in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Availability Set operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<AvailabilitySetInner> listByResourceGroupAsync(String resourceGroupName) {
        return new PagedFlux<>(
            () -> listByResourceGroupSinglePageAsync(resourceGroupName), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Lists all availability sets in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Availability Set operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<AvailabilitySetInner> listByResourceGroup(String resourceGroupName) {
        return new PagedIterable<>(listByResourceGroupAsync(resourceGroupName));
    }

    /**
     * Lists all available virtual machine sizes that can be used to create a new virtual machine in an existing
     * availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName The name of the availability set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Virtual Machine operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<VirtualMachineSizeInner>> listAvailableSizesSinglePageAsync(
        String resourceGroupName, String availabilitySetName) {
        final String apiVersion = "2019-03-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listAvailableSizes(
                            this.client.getHost(),
                            resourceGroupName,
                            availabilitySetName,
                            apiVersion,
                            this.client.getSubscriptionId(),
                            context))
            .<PagedResponse<VirtualMachineSizeInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Lists all available virtual machine sizes that can be used to create a new virtual machine in an existing
     * availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName The name of the availability set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Virtual Machine operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<VirtualMachineSizeInner> listAvailableSizesAsync(
        String resourceGroupName, String availabilitySetName) {
        return new PagedFlux<>(() -> listAvailableSizesSinglePageAsync(resourceGroupName, availabilitySetName));
    }

    /**
     * Lists all available virtual machine sizes that can be used to create a new virtual machine in an existing
     * availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName The name of the availability set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Virtual Machine operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<VirtualMachineSizeInner> listAvailableSizes(
        String resourceGroupName, String availabilitySetName) {
        return new PagedIterable<>(listAvailableSizesAsync(resourceGroupName, availabilitySetName));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Availability Set operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<AvailabilitySetInner>> listBySubscriptionNextSinglePageAsync(String nextLink) {
        return FluxUtil
            .withContext(context -> service.listBySubscriptionNext(nextLink, context))
            .<PagedResponse<AvailabilitySetInner>>map(
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
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Availability Set operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<AvailabilitySetInner>> listNextSinglePageAsync(String nextLink) {
        return FluxUtil
            .withContext(context -> service.listNext(nextLink, context))
            .<PagedResponse<AvailabilitySetInner>>map(
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
}
