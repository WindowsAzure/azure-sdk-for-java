// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute.models;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
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
import com.azure.core.util.polling.AsyncPollResponse;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * VirtualMachineScaleSetExtensions.
 */
public final class VirtualMachineScaleSetExtensionsInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private VirtualMachineScaleSetExtensionsService service;

    /**
     * The service client containing this operation class.
     */
    private ComputeManagementClientImpl client;

    /**
     * Initializes an instance of VirtualMachineScaleSetExtensionsInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public VirtualMachineScaleSetExtensionsInner(ComputeManagementClientImpl client) {
        this.service = RestProxy.create(VirtualMachineScaleSetExtensionsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * ComputeManagementClientVirtualMachineScaleSetExtensions to be used by
     * the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ComputeManagementClientVirtualMachineScaleSetExtensions")
    private interface VirtualMachineScaleSetExtensionsService {
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/extensions/{vmssExtensionName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("vmScaleSetName") String vmScaleSetName, @PathParam("vmssExtensionName") String vmssExtensionName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") VirtualMachineScaleSetExtensionInner extensionParameters, @QueryParam("api-version") String apiVersion);

        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/extensions/{vmssExtensionName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> delete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("vmScaleSetName") String vmScaleSetName, @PathParam("vmssExtensionName") String vmssExtensionName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/extensions/{vmssExtensionName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<VirtualMachineScaleSetExtensionInner>> get(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("vmScaleSetName") String vmScaleSetName, @PathParam("vmssExtensionName") String vmssExtensionName, @QueryParam("$expand") String expand, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/extensions")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<VirtualMachineScaleSetExtensionListResultInner>> list(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("vmScaleSetName") String vmScaleSetName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/extensions/{vmssExtensionName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<VirtualMachineScaleSetExtensionInner>> beginCreateOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("vmScaleSetName") String vmScaleSetName, @PathParam("vmssExtensionName") String vmssExtensionName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") VirtualMachineScaleSetExtensionInner extensionParameters, @QueryParam("api-version") String apiVersion);

        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/extensions/{vmssExtensionName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> beginDelete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("vmScaleSetName") String vmScaleSetName, @PathParam("vmssExtensionName") String vmssExtensionName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<VirtualMachineScaleSetExtensionListResultInner>> listNext(@PathParam(value = "nextLink", encoded = true) String nextLink);
    }

    /**
     * The operation to create or update an extension.
     * 
     * @param resourceGroupName 
     * @param vmScaleSetName 
     * @param vmssExtensionName 
     * @param extensionParameters Describes a Virtual Machine Scale Set Extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(String resourceGroupName, String vmScaleSetName, String vmssExtensionName, VirtualMachineScaleSetExtensionInner extensionParameters) {
        final String apiVersion = "2019-03-01";
        return service.createOrUpdate(this.client.getHost(), resourceGroupName, vmScaleSetName, vmssExtensionName, this.client.getSubscriptionId(), extensionParameters, apiVersion);
    }

    /**
     * The operation to create or update an extension.
     * 
     * @param resourceGroupName 
     * @param vmScaleSetName 
     * @param vmssExtensionName 
     * @param extensionParameters Describes a Virtual Machine Scale Set Extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VirtualMachineScaleSetExtensionInner> createOrUpdateAsync(String resourceGroupName, String vmScaleSetName, String vmssExtensionName, VirtualMachineScaleSetExtensionInner extensionParameters) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = createOrUpdateWithResponseAsync(resourceGroupName, vmScaleSetName, vmssExtensionName, extensionParameters);
        return client.<VirtualMachineScaleSetExtensionInner, VirtualMachineScaleSetExtensionInner>getLroResultAsync(response, client.getHttpPipeline(), VirtualMachineScaleSetExtensionInner.class, VirtualMachineScaleSetExtensionInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * The operation to create or update an extension.
     * 
     * @param resourceGroupName 
     * @param vmScaleSetName 
     * @param vmssExtensionName 
     * @param extensionParameters Describes a Virtual Machine Scale Set Extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VirtualMachineScaleSetExtensionInner createOrUpdate(String resourceGroupName, String vmScaleSetName, String vmssExtensionName, VirtualMachineScaleSetExtensionInner extensionParameters) {
        return createOrUpdateAsync(resourceGroupName, vmScaleSetName, vmssExtensionName, extensionParameters).block();
    }

    /**
     * The operation to delete the extension.
     * 
     * @param resourceGroupName 
     * @param vmScaleSetName 
     * @param vmssExtensionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String vmScaleSetName, String vmssExtensionName) {
        final String apiVersion = "2019-03-01";
        return service.delete(this.client.getHost(), resourceGroupName, vmScaleSetName, vmssExtensionName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * The operation to delete the extension.
     * 
     * @param resourceGroupName 
     * @param vmScaleSetName 
     * @param vmssExtensionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String vmScaleSetName, String vmssExtensionName) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = deleteWithResponseAsync(resourceGroupName, vmScaleSetName, vmssExtensionName);
        return client.<Void, Void>getLroResultAsync(response, client.getHttpPipeline(), Void.class, Void.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * The operation to delete the extension.
     * 
     * @param resourceGroupName 
     * @param vmScaleSetName 
     * @param vmssExtensionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String vmScaleSetName, String vmssExtensionName) {
        deleteAsync(resourceGroupName, vmScaleSetName, vmssExtensionName).block();
    }

    /**
     * The operation to get the extension.
     * 
     * @param resourceGroupName 
     * @param vmScaleSetName 
     * @param vmssExtensionName 
     * @param expand 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<VirtualMachineScaleSetExtensionInner>> getWithResponseAsync(String resourceGroupName, String vmScaleSetName, String vmssExtensionName, String expand) {
        final String apiVersion = "2019-03-01";
        return service.get(this.client.getHost(), resourceGroupName, vmScaleSetName, vmssExtensionName, expand, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * The operation to get the extension.
     * 
     * @param resourceGroupName 
     * @param vmScaleSetName 
     * @param vmssExtensionName 
     * @param expand 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VirtualMachineScaleSetExtensionInner> getAsync(String resourceGroupName, String vmScaleSetName, String vmssExtensionName, String expand) {
        return getWithResponseAsync(resourceGroupName, vmScaleSetName, vmssExtensionName, expand)
            .flatMap((SimpleResponse<VirtualMachineScaleSetExtensionInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * The operation to get the extension.
     * 
     * @param resourceGroupName 
     * @param vmScaleSetName 
     * @param vmssExtensionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VirtualMachineScaleSetExtensionInner> getAsync(String resourceGroupName, String vmScaleSetName, String vmssExtensionName) {
        final String expand = null;
        final String apiVersion = "2019-03-01";
        return getWithResponseAsync(resourceGroupName, vmScaleSetName, vmssExtensionName, expand)
            .flatMap((SimpleResponse<VirtualMachineScaleSetExtensionInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * The operation to get the extension.
     * 
     * @param resourceGroupName 
     * @param vmScaleSetName 
     * @param vmssExtensionName 
     * @param expand 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VirtualMachineScaleSetExtensionInner get(String resourceGroupName, String vmScaleSetName, String vmssExtensionName, String expand) {
        return getAsync(resourceGroupName, vmScaleSetName, vmssExtensionName, expand).block();
    }

    /**
     * The operation to get the extension.
     * 
     * @param resourceGroupName 
     * @param vmScaleSetName 
     * @param vmssExtensionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VirtualMachineScaleSetExtensionInner get(String resourceGroupName, String vmScaleSetName, String vmssExtensionName) {
        final String expand = null;
        final String apiVersion = "2019-03-01";
        return getAsync(resourceGroupName, vmScaleSetName, vmssExtensionName, expand).block();
    }

    /**
     * Gets a list of all extensions in a VM scale set.
     * 
     * @param resourceGroupName 
     * @param vmScaleSetName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<VirtualMachineScaleSetExtensionInner>> listSinglePageAsync(String resourceGroupName, String vmScaleSetName) {
        final String apiVersion = "2019-03-01";
        return service.list(this.client.getHost(), resourceGroupName, vmScaleSetName, this.client.getSubscriptionId(), apiVersion).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }

    /**
     * Gets a list of all extensions in a VM scale set.
     * 
     * @param resourceGroupName 
     * @param vmScaleSetName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<VirtualMachineScaleSetExtensionInner> listAsync(String resourceGroupName, String vmScaleSetName) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, vmScaleSetName),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets a list of all extensions in a VM scale set.
     * 
     * @param resourceGroupName 
     * @param vmScaleSetName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<VirtualMachineScaleSetExtensionInner> list(String resourceGroupName, String vmScaleSetName) {
        return new PagedIterable<>(listAsync(resourceGroupName, vmScaleSetName));
    }

    /**
     * The operation to create or update an extension.
     * 
     * @param resourceGroupName 
     * @param vmScaleSetName 
     * @param vmssExtensionName 
     * @param extensionParameters Describes a Virtual Machine Scale Set Extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<VirtualMachineScaleSetExtensionInner>> beginCreateOrUpdateWithResponseAsync(String resourceGroupName, String vmScaleSetName, String vmssExtensionName, VirtualMachineScaleSetExtensionInner extensionParameters) {
        final String apiVersion = "2019-03-01";
        return service.beginCreateOrUpdate(this.client.getHost(), resourceGroupName, vmScaleSetName, vmssExtensionName, this.client.getSubscriptionId(), extensionParameters, apiVersion);
    }

    /**
     * The operation to create or update an extension.
     * 
     * @param resourceGroupName 
     * @param vmScaleSetName 
     * @param vmssExtensionName 
     * @param extensionParameters Describes a Virtual Machine Scale Set Extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VirtualMachineScaleSetExtensionInner> beginCreateOrUpdateAsync(String resourceGroupName, String vmScaleSetName, String vmssExtensionName, VirtualMachineScaleSetExtensionInner extensionParameters) {
        return beginCreateOrUpdateWithResponseAsync(resourceGroupName, vmScaleSetName, vmssExtensionName, extensionParameters)
            .flatMap((SimpleResponse<VirtualMachineScaleSetExtensionInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * The operation to create or update an extension.
     * 
     * @param resourceGroupName 
     * @param vmScaleSetName 
     * @param vmssExtensionName 
     * @param extensionParameters Describes a Virtual Machine Scale Set Extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VirtualMachineScaleSetExtensionInner beginCreateOrUpdate(String resourceGroupName, String vmScaleSetName, String vmssExtensionName, VirtualMachineScaleSetExtensionInner extensionParameters) {
        return beginCreateOrUpdateAsync(resourceGroupName, vmScaleSetName, vmssExtensionName, extensionParameters).block();
    }

    /**
     * The operation to delete the extension.
     * 
     * @param resourceGroupName 
     * @param vmScaleSetName 
     * @param vmssExtensionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginDeleteWithResponseAsync(String resourceGroupName, String vmScaleSetName, String vmssExtensionName) {
        final String apiVersion = "2019-03-01";
        return service.beginDelete(this.client.getHost(), resourceGroupName, vmScaleSetName, vmssExtensionName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * The operation to delete the extension.
     * 
     * @param resourceGroupName 
     * @param vmScaleSetName 
     * @param vmssExtensionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginDeleteAsync(String resourceGroupName, String vmScaleSetName, String vmssExtensionName) {
        return beginDeleteWithResponseAsync(resourceGroupName, vmScaleSetName, vmssExtensionName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * The operation to delete the extension.
     * 
     * @param resourceGroupName 
     * @param vmScaleSetName 
     * @param vmssExtensionName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDelete(String resourceGroupName, String vmScaleSetName, String vmssExtensionName) {
        beginDeleteAsync(resourceGroupName, vmScaleSetName, vmssExtensionName).block();
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<VirtualMachineScaleSetExtensionInner>> listNextSinglePageAsync(String nextLink) {
        return service.listNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }
}
