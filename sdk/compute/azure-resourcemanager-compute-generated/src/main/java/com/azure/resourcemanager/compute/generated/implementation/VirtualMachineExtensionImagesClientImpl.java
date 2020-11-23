// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.fluent.VirtualMachineExtensionImagesClient;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineExtensionImageInner;
import java.util.List;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in VirtualMachineExtensionImagesClient. */
public final class VirtualMachineExtensionImagesClientImpl implements VirtualMachineExtensionImagesClient {
    private final ClientLogger logger = new ClientLogger(VirtualMachineExtensionImagesClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final VirtualMachineExtensionImagesService service;

    /** The service client containing this operation class. */
    private final ComputeManagementClientImpl client;

    /**
     * Initializes an instance of VirtualMachineExtensionImagesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    VirtualMachineExtensionImagesClientImpl(ComputeManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    VirtualMachineExtensionImagesService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ComputeManagementClientVirtualMachineExtensionImages to be used by
     * the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ComputeManagementCli")
    private interface VirtualMachineExtensionImagesService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/publishers"
                + "/{publisherName}/artifacttypes/vmextension/types/{type}/versions/{version}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<VirtualMachineExtensionImageInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("location") String location,
            @PathParam("publisherName") String publisherName,
            @PathParam("type") String type,
            @PathParam("version") String version,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/publishers"
                + "/{publisherName}/artifacttypes/vmextension/types")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<List<VirtualMachineExtensionImageInner>>> listTypes(
            @HostParam("$host") String endpoint,
            @PathParam("location") String location,
            @PathParam("publisherName") String publisherName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/publishers"
                + "/{publisherName}/artifacttypes/vmextension/types/{type}/versions")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<List<VirtualMachineExtensionImageInner>>> listVersions(
            @HostParam("$host") String endpoint,
            @PathParam("location") String location,
            @PathParam("publisherName") String publisherName,
            @PathParam("type") String type,
            @QueryParam("$filter") String filter,
            @QueryParam("$top") Integer top,
            @QueryParam("$orderby") String orderby,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets a virtual machine extension image.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName The publisherName parameter.
     * @param type The type parameter.
     * @param version The version parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a virtual machine extension image.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<VirtualMachineExtensionImageInner>> getWithResponseAsync(
        String location, String publisherName, String type, String version) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (publisherName == null) {
            return Mono.error(new IllegalArgumentException("Parameter publisherName is required and cannot be null."));
        }
        if (type == null) {
            return Mono.error(new IllegalArgumentException("Parameter type is required and cannot be null."));
        }
        if (version == null) {
            return Mono.error(new IllegalArgumentException("Parameter version is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2020-06-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            location,
                            publisherName,
                            type,
                            version,
                            apiVersion,
                            this.client.getSubscriptionId(),
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets a virtual machine extension image.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName The publisherName parameter.
     * @param type The type parameter.
     * @param version The version parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a virtual machine extension image.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<VirtualMachineExtensionImageInner>> getWithResponseAsync(
        String location, String publisherName, String type, String version, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (publisherName == null) {
            return Mono.error(new IllegalArgumentException("Parameter publisherName is required and cannot be null."));
        }
        if (type == null) {
            return Mono.error(new IllegalArgumentException("Parameter type is required and cannot be null."));
        }
        if (version == null) {
            return Mono.error(new IllegalArgumentException("Parameter version is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2020-06-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                location,
                publisherName,
                type,
                version,
                apiVersion,
                this.client.getSubscriptionId(),
                accept,
                context);
    }

    /**
     * Gets a virtual machine extension image.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName The publisherName parameter.
     * @param type The type parameter.
     * @param version The version parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a virtual machine extension image.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<VirtualMachineExtensionImageInner> getAsync(
        String location, String publisherName, String type, String version) {
        return getWithResponseAsync(location, publisherName, type, version)
            .flatMap(
                (Response<VirtualMachineExtensionImageInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets a virtual machine extension image.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName The publisherName parameter.
     * @param type The type parameter.
     * @param version The version parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a virtual machine extension image.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VirtualMachineExtensionImageInner get(String location, String publisherName, String type, String version) {
        return getAsync(location, publisherName, type, version).block();
    }

    /**
     * Gets a virtual machine extension image.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName The publisherName parameter.
     * @param type The type parameter.
     * @param version The version parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a virtual machine extension image.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<VirtualMachineExtensionImageInner> getWithResponse(
        String location, String publisherName, String type, String version, Context context) {
        return getWithResponseAsync(location, publisherName, type, version, context).block();
    }

    /**
     * Gets a list of virtual machine extension image types.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName The publisherName parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of virtual machine extension image types.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<List<VirtualMachineExtensionImageInner>>> listTypesWithResponseAsync(
        String location, String publisherName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (publisherName == null) {
            return Mono.error(new IllegalArgumentException("Parameter publisherName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2020-06-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listTypes(
                            this.client.getEndpoint(),
                            location,
                            publisherName,
                            apiVersion,
                            this.client.getSubscriptionId(),
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets a list of virtual machine extension image types.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName The publisherName parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of virtual machine extension image types.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<List<VirtualMachineExtensionImageInner>>> listTypesWithResponseAsync(
        String location, String publisherName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (publisherName == null) {
            return Mono.error(new IllegalArgumentException("Parameter publisherName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2020-06-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listTypes(
                this.client.getEndpoint(),
                location,
                publisherName,
                apiVersion,
                this.client.getSubscriptionId(),
                accept,
                context);
    }

    /**
     * Gets a list of virtual machine extension image types.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName The publisherName parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of virtual machine extension image types.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<List<VirtualMachineExtensionImageInner>> listTypesAsync(String location, String publisherName) {
        return listTypesWithResponseAsync(location, publisherName)
            .flatMap(
                (Response<List<VirtualMachineExtensionImageInner>> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets a list of virtual machine extension image types.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName The publisherName parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of virtual machine extension image types.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public List<VirtualMachineExtensionImageInner> listTypes(String location, String publisherName) {
        return listTypesAsync(location, publisherName).block();
    }

    /**
     * Gets a list of virtual machine extension image types.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName The publisherName parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of virtual machine extension image types.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<List<VirtualMachineExtensionImageInner>> listTypesWithResponse(
        String location, String publisherName, Context context) {
        return listTypesWithResponseAsync(location, publisherName, context).block();
    }

    /**
     * Gets a list of virtual machine extension image versions.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName The publisherName parameter.
     * @param type The type parameter.
     * @param filter The filter to apply on the operation.
     * @param top The top parameter.
     * @param orderby The orderby parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of virtual machine extension image versions.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<List<VirtualMachineExtensionImageInner>>> listVersionsWithResponseAsync(
        String location, String publisherName, String type, String filter, Integer top, String orderby) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (publisherName == null) {
            return Mono.error(new IllegalArgumentException("Parameter publisherName is required and cannot be null."));
        }
        if (type == null) {
            return Mono.error(new IllegalArgumentException("Parameter type is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2020-06-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listVersions(
                            this.client.getEndpoint(),
                            location,
                            publisherName,
                            type,
                            filter,
                            top,
                            orderby,
                            apiVersion,
                            this.client.getSubscriptionId(),
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets a list of virtual machine extension image versions.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName The publisherName parameter.
     * @param type The type parameter.
     * @param filter The filter to apply on the operation.
     * @param top The top parameter.
     * @param orderby The orderby parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of virtual machine extension image versions.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<List<VirtualMachineExtensionImageInner>>> listVersionsWithResponseAsync(
        String location,
        String publisherName,
        String type,
        String filter,
        Integer top,
        String orderby,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (publisherName == null) {
            return Mono.error(new IllegalArgumentException("Parameter publisherName is required and cannot be null."));
        }
        if (type == null) {
            return Mono.error(new IllegalArgumentException("Parameter type is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2020-06-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listVersions(
                this.client.getEndpoint(),
                location,
                publisherName,
                type,
                filter,
                top,
                orderby,
                apiVersion,
                this.client.getSubscriptionId(),
                accept,
                context);
    }

    /**
     * Gets a list of virtual machine extension image versions.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName The publisherName parameter.
     * @param type The type parameter.
     * @param filter The filter to apply on the operation.
     * @param top The top parameter.
     * @param orderby The orderby parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of virtual machine extension image versions.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<List<VirtualMachineExtensionImageInner>> listVersionsAsync(
        String location, String publisherName, String type, String filter, Integer top, String orderby) {
        return listVersionsWithResponseAsync(location, publisherName, type, filter, top, orderby)
            .flatMap(
                (Response<List<VirtualMachineExtensionImageInner>> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets a list of virtual machine extension image versions.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName The publisherName parameter.
     * @param type The type parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of virtual machine extension image versions.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<List<VirtualMachineExtensionImageInner>> listVersionsAsync(
        String location, String publisherName, String type) {
        final String filter = null;
        final Integer top = null;
        final String orderby = null;
        return listVersionsWithResponseAsync(location, publisherName, type, filter, top, orderby)
            .flatMap(
                (Response<List<VirtualMachineExtensionImageInner>> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets a list of virtual machine extension image versions.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName The publisherName parameter.
     * @param type The type parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of virtual machine extension image versions.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public List<VirtualMachineExtensionImageInner> listVersions(String location, String publisherName, String type) {
        final String filter = null;
        final Integer top = null;
        final String orderby = null;
        return listVersionsAsync(location, publisherName, type, filter, top, orderby).block();
    }

    /**
     * Gets a list of virtual machine extension image versions.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName The publisherName parameter.
     * @param type The type parameter.
     * @param filter The filter to apply on the operation.
     * @param top The top parameter.
     * @param orderby The orderby parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of virtual machine extension image versions.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<List<VirtualMachineExtensionImageInner>> listVersionsWithResponse(
        String location,
        String publisherName,
        String type,
        String filter,
        Integer top,
        String orderby,
        Context context) {
        return listVersionsWithResponseAsync(location, publisherName, type, filter, top, orderby, context).block();
    }
}
