// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.network.models.GetVpnSitesConfigurationRequest;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in VpnSitesConfigurations. */
public final class VpnSitesConfigurationsClient {
    private final ClientLogger logger = new ClientLogger(VpnSitesConfigurationsClient.class);

    /** The proxy service used to perform REST calls. */
    private final VpnSitesConfigurationsService service;

    /** The service client containing this operation class. */
    private final NetworkManagementClient client;

    /**
     * Initializes an instance of VpnSitesConfigurationsClient.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public VpnSitesConfigurationsClient(NetworkManagementClient client) {
        this.service =
            RestProxy
                .create(VpnSitesConfigurationsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for NetworkManagementClientVpnSitesConfigurations to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "NetworkManagementCli")
    private interface VpnSitesConfigurationsService {
        @Headers({"Accept: application/json;q=0.9", "Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualWans"
                + "/{virtualWANName}/vpnConfiguration")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Flux<ByteBuffer>>> download(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("virtualWANName") String virtualWanName,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") GetVpnSitesConfigurationRequest request,
            Context context);
    }

    /**
     * Gives the sas-url to download the configurations for vpn-sites in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWanName The name of the VirtualWAN for which configuration of all vpn-sites is needed.
     * @param request List of Vpn-Sites.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Flux<ByteBuffer>>> downloadWithResponseAsync(
        String resourceGroupName, String virtualWanName, GetVpnSitesConfigurationRequest request) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (virtualWanName == null) {
            return Mono.error(new IllegalArgumentException("Parameter virtualWanName is required and cannot be null."));
        }
        if (request == null) {
            return Mono.error(new IllegalArgumentException("Parameter request is required and cannot be null."));
        } else {
            request.validate();
        }
        final String apiVersion = "2020-05-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .download(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            virtualWanName,
                            apiVersion,
                            request,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gives the sas-url to download the configurations for vpn-sites in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWanName The name of the VirtualWAN for which configuration of all vpn-sites is needed.
     * @param request List of Vpn-Sites.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Flux<ByteBuffer>>> downloadWithResponseAsync(
        String resourceGroupName, String virtualWanName, GetVpnSitesConfigurationRequest request, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (virtualWanName == null) {
            return Mono.error(new IllegalArgumentException("Parameter virtualWanName is required and cannot be null."));
        }
        if (request == null) {
            return Mono.error(new IllegalArgumentException("Parameter request is required and cannot be null."));
        } else {
            request.validate();
        }
        final String apiVersion = "2020-05-01";
        context = this.client.mergeContext(context);
        return service
            .download(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                virtualWanName,
                apiVersion,
                request,
                context);
    }

    /**
     * Gives the sas-url to download the configurations for vpn-sites in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWanName The name of the VirtualWAN for which configuration of all vpn-sites is needed.
     * @param request List of Vpn-Sites.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDownloadAsync(
        String resourceGroupName, String virtualWanName, GetVpnSitesConfigurationRequest request) {
        Mono<Response<Flux<ByteBuffer>>> mono = downloadWithResponseAsync(resourceGroupName, virtualWanName, request);
        return this
            .client
            .<Void, Void>getLroResult(mono, this.client.getHttpPipeline(), Void.class, Void.class, Context.NONE);
    }

    /**
     * Gives the sas-url to download the configurations for vpn-sites in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWanName The name of the VirtualWAN for which configuration of all vpn-sites is needed.
     * @param request List of Vpn-Sites.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<PollResult<Void>, Void> beginDownloadAsync(
        String resourceGroupName, String virtualWanName, GetVpnSitesConfigurationRequest request, Context context) {
        context = this.client.mergeContext(context);
        Mono<Response<Flux<ByteBuffer>>> mono =
            downloadWithResponseAsync(resourceGroupName, virtualWanName, request, context);
        return this
            .client
            .<Void, Void>getLroResult(mono, this.client.getHttpPipeline(), Void.class, Void.class, context);
    }

    /**
     * Gives the sas-url to download the configurations for vpn-sites in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWanName The name of the VirtualWAN for which configuration of all vpn-sites is needed.
     * @param request List of Vpn-Sites.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SyncPoller<PollResult<Void>, Void> beginDownload(
        String resourceGroupName, String virtualWanName, GetVpnSitesConfigurationRequest request) {
        return beginDownloadAsync(resourceGroupName, virtualWanName, request).getSyncPoller();
    }

    /**
     * Gives the sas-url to download the configurations for vpn-sites in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWanName The name of the VirtualWAN for which configuration of all vpn-sites is needed.
     * @param request List of Vpn-Sites.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SyncPoller<PollResult<Void>, Void> beginDownload(
        String resourceGroupName, String virtualWanName, GetVpnSitesConfigurationRequest request, Context context) {
        return beginDownloadAsync(resourceGroupName, virtualWanName, request, context).getSyncPoller();
    }

    /**
     * Gives the sas-url to download the configurations for vpn-sites in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWanName The name of the VirtualWAN for which configuration of all vpn-sites is needed.
     * @param request List of Vpn-Sites.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> downloadAsync(
        String resourceGroupName, String virtualWanName, GetVpnSitesConfigurationRequest request) {
        return beginDownloadAsync(resourceGroupName, virtualWanName, request)
            .last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Gives the sas-url to download the configurations for vpn-sites in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWanName The name of the VirtualWAN for which configuration of all vpn-sites is needed.
     * @param request List of Vpn-Sites.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> downloadAsync(
        String resourceGroupName, String virtualWanName, GetVpnSitesConfigurationRequest request, Context context) {
        return beginDownloadAsync(resourceGroupName, virtualWanName, request, context)
            .last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Gives the sas-url to download the configurations for vpn-sites in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWanName The name of the VirtualWAN for which configuration of all vpn-sites is needed.
     * @param request List of Vpn-Sites.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void download(String resourceGroupName, String virtualWanName, GetVpnSitesConfigurationRequest request) {
        downloadAsync(resourceGroupName, virtualWanName, request).block();
    }

    /**
     * Gives the sas-url to download the configurations for vpn-sites in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param virtualWanName The name of the VirtualWAN for which configuration of all vpn-sites is needed.
     * @param request List of Vpn-Sites.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void download(
        String resourceGroupName, String virtualWanName, GetVpnSitesConfigurationRequest request, Context context) {
        downloadAsync(resourceGroupName, virtualWanName, request, context).block();
    }
}
