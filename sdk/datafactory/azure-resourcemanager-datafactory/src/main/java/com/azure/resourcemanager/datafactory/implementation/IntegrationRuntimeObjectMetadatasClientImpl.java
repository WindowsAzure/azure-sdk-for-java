// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
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
import com.azure.resourcemanager.datafactory.fluent.IntegrationRuntimeObjectMetadatasClient;
import com.azure.resourcemanager.datafactory.fluent.models.SsisObjectMetadataListResponseInner;
import com.azure.resourcemanager.datafactory.fluent.models.SsisObjectMetadataStatusResponseInner;
import com.azure.resourcemanager.datafactory.models.GetSsisObjectMetadataRequest;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in IntegrationRuntimeObjectMetadatasClient.
 */
public final class IntegrationRuntimeObjectMetadatasClientImpl implements IntegrationRuntimeObjectMetadatasClient {
    private final ClientLogger logger = new ClientLogger(IntegrationRuntimeObjectMetadatasClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final IntegrationRuntimeObjectMetadatasService service;

    /** The service client containing this operation class. */
    private final DataFactoryManagementClientImpl client;

    /**
     * Initializes an instance of IntegrationRuntimeObjectMetadatasClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    IntegrationRuntimeObjectMetadatasClientImpl(DataFactoryManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    IntegrationRuntimeObjectMetadatasService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for DataFactoryManagementClientIntegrationRuntimeObjectMetadatas to be
     * used by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "DataFactoryManagemen")
    private interface IntegrationRuntimeObjectMetadatasService {
        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DataFactory"
                + "/factories/{factoryName}/integrationRuntimes/{integrationRuntimeName}/refreshObjectMetadata")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Flux<ByteBuffer>>> refresh(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("factoryName") String factoryName,
            @PathParam("integrationRuntimeName") String integrationRuntimeName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DataFactory"
                + "/factories/{factoryName}/integrationRuntimes/{integrationRuntimeName}/getObjectMetadata")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<SsisObjectMetadataListResponseInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("factoryName") String factoryName,
            @PathParam("integrationRuntimeName") String integrationRuntimeName,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") GetSsisObjectMetadataRequest getMetadataRequest,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Refresh a SSIS integration runtime object metadata.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> refreshWithResponseAsync(
        String resourceGroupName, String factoryName, String integrationRuntimeName) {
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
        if (factoryName == null) {
            return Mono.error(new IllegalArgumentException("Parameter factoryName is required and cannot be null."));
        }
        if (integrationRuntimeName == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter integrationRuntimeName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .refresh(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            factoryName,
                            integrationRuntimeName,
                            this.client.getApiVersion(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Refresh a SSIS integration runtime object metadata.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> refreshWithResponseAsync(
        String resourceGroupName, String factoryName, String integrationRuntimeName, Context context) {
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
        if (factoryName == null) {
            return Mono.error(new IllegalArgumentException("Parameter factoryName is required and cannot be null."));
        }
        if (integrationRuntimeName == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter integrationRuntimeName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .refresh(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                factoryName,
                integrationRuntimeName,
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Refresh a SSIS integration runtime object metadata.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private PollerFlux<PollResult<SsisObjectMetadataStatusResponseInner>, SsisObjectMetadataStatusResponseInner>
        beginRefreshAsync(String resourceGroupName, String factoryName, String integrationRuntimeName) {
        Mono<Response<Flux<ByteBuffer>>> mono =
            refreshWithResponseAsync(resourceGroupName, factoryName, integrationRuntimeName);
        return this
            .client
            .<SsisObjectMetadataStatusResponseInner, SsisObjectMetadataStatusResponseInner>getLroResult(
                mono,
                this.client.getHttpPipeline(),
                SsisObjectMetadataStatusResponseInner.class,
                SsisObjectMetadataStatusResponseInner.class,
                Context.NONE);
    }

    /**
     * Refresh a SSIS integration runtime object metadata.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private PollerFlux<PollResult<SsisObjectMetadataStatusResponseInner>, SsisObjectMetadataStatusResponseInner>
        beginRefreshAsync(
            String resourceGroupName, String factoryName, String integrationRuntimeName, Context context) {
        context = this.client.mergeContext(context);
        Mono<Response<Flux<ByteBuffer>>> mono =
            refreshWithResponseAsync(resourceGroupName, factoryName, integrationRuntimeName, context);
        return this
            .client
            .<SsisObjectMetadataStatusResponseInner, SsisObjectMetadataStatusResponseInner>getLroResult(
                mono,
                this.client.getHttpPipeline(),
                SsisObjectMetadataStatusResponseInner.class,
                SsisObjectMetadataStatusResponseInner.class,
                context);
    }

    /**
     * Refresh a SSIS integration runtime object metadata.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SyncPoller<PollResult<SsisObjectMetadataStatusResponseInner>, SsisObjectMetadataStatusResponseInner>
        beginRefresh(String resourceGroupName, String factoryName, String integrationRuntimeName) {
        return beginRefreshAsync(resourceGroupName, factoryName, integrationRuntimeName).getSyncPoller();
    }

    /**
     * Refresh a SSIS integration runtime object metadata.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SyncPoller<PollResult<SsisObjectMetadataStatusResponseInner>, SsisObjectMetadataStatusResponseInner>
        beginRefresh(String resourceGroupName, String factoryName, String integrationRuntimeName, Context context) {
        return beginRefreshAsync(resourceGroupName, factoryName, integrationRuntimeName, context).getSyncPoller();
    }

    /**
     * Refresh a SSIS integration runtime object metadata.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<SsisObjectMetadataStatusResponseInner> refreshAsync(
        String resourceGroupName, String factoryName, String integrationRuntimeName) {
        return beginRefreshAsync(resourceGroupName, factoryName, integrationRuntimeName)
            .last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Refresh a SSIS integration runtime object metadata.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<SsisObjectMetadataStatusResponseInner> refreshAsync(
        String resourceGroupName, String factoryName, String integrationRuntimeName, Context context) {
        return beginRefreshAsync(resourceGroupName, factoryName, integrationRuntimeName, context)
            .last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Refresh a SSIS integration runtime object metadata.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SsisObjectMetadataStatusResponseInner refresh(
        String resourceGroupName, String factoryName, String integrationRuntimeName) {
        return refreshAsync(resourceGroupName, factoryName, integrationRuntimeName).block();
    }

    /**
     * Refresh a SSIS integration runtime object metadata.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SsisObjectMetadataStatusResponseInner refresh(
        String resourceGroupName, String factoryName, String integrationRuntimeName, Context context) {
        return refreshAsync(resourceGroupName, factoryName, integrationRuntimeName, context).block();
    }

    /**
     * Get a SSIS integration runtime object metadata by specified path. The return is pageable metadata list.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @param getMetadataRequest The parameters for getting a SSIS object metadata.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SSIS integration runtime object metadata by specified path.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SsisObjectMetadataListResponseInner>> getWithResponseAsync(
        String resourceGroupName,
        String factoryName,
        String integrationRuntimeName,
        GetSsisObjectMetadataRequest getMetadataRequest) {
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
        if (factoryName == null) {
            return Mono.error(new IllegalArgumentException("Parameter factoryName is required and cannot be null."));
        }
        if (integrationRuntimeName == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter integrationRuntimeName is required and cannot be null."));
        }
        if (getMetadataRequest != null) {
            getMetadataRequest.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            factoryName,
                            integrationRuntimeName,
                            this.client.getApiVersion(),
                            getMetadataRequest,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get a SSIS integration runtime object metadata by specified path. The return is pageable metadata list.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @param getMetadataRequest The parameters for getting a SSIS object metadata.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SSIS integration runtime object metadata by specified path.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SsisObjectMetadataListResponseInner>> getWithResponseAsync(
        String resourceGroupName,
        String factoryName,
        String integrationRuntimeName,
        GetSsisObjectMetadataRequest getMetadataRequest,
        Context context) {
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
        if (factoryName == null) {
            return Mono.error(new IllegalArgumentException("Parameter factoryName is required and cannot be null."));
        }
        if (integrationRuntimeName == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter integrationRuntimeName is required and cannot be null."));
        }
        if (getMetadataRequest != null) {
            getMetadataRequest.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                factoryName,
                integrationRuntimeName,
                this.client.getApiVersion(),
                getMetadataRequest,
                accept,
                context);
    }

    /**
     * Get a SSIS integration runtime object metadata by specified path. The return is pageable metadata list.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @param getMetadataRequest The parameters for getting a SSIS object metadata.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SSIS integration runtime object metadata by specified path.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<SsisObjectMetadataListResponseInner> getAsync(
        String resourceGroupName,
        String factoryName,
        String integrationRuntimeName,
        GetSsisObjectMetadataRequest getMetadataRequest) {
        return getWithResponseAsync(resourceGroupName, factoryName, integrationRuntimeName, getMetadataRequest)
            .flatMap(
                (Response<SsisObjectMetadataListResponseInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Get a SSIS integration runtime object metadata by specified path. The return is pageable metadata list.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SSIS integration runtime object metadata by specified path.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<SsisObjectMetadataListResponseInner> getAsync(
        String resourceGroupName, String factoryName, String integrationRuntimeName) {
        final GetSsisObjectMetadataRequest getMetadataRequest = null;
        return getWithResponseAsync(resourceGroupName, factoryName, integrationRuntimeName, getMetadataRequest)
            .flatMap(
                (Response<SsisObjectMetadataListResponseInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Get a SSIS integration runtime object metadata by specified path. The return is pageable metadata list.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SSIS integration runtime object metadata by specified path.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SsisObjectMetadataListResponseInner get(
        String resourceGroupName, String factoryName, String integrationRuntimeName) {
        final GetSsisObjectMetadataRequest getMetadataRequest = null;
        return getAsync(resourceGroupName, factoryName, integrationRuntimeName, getMetadataRequest).block();
    }

    /**
     * Get a SSIS integration runtime object metadata by specified path. The return is pageable metadata list.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @param getMetadataRequest The parameters for getting a SSIS object metadata.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SSIS integration runtime object metadata by specified path.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SsisObjectMetadataListResponseInner> getWithResponse(
        String resourceGroupName,
        String factoryName,
        String integrationRuntimeName,
        GetSsisObjectMetadataRequest getMetadataRequest,
        Context context) {
        return getWithResponseAsync(resourceGroupName, factoryName, integrationRuntimeName, getMetadataRequest, context)
            .block();
    }
}
