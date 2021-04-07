// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

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
import com.azure.resourcemanager.synapse.fluent.IntegrationRuntimeObjectMetadatasClient;
import com.azure.resourcemanager.synapse.fluent.models.SsisObjectMetadataListResponseInner;
import com.azure.resourcemanager.synapse.fluent.models.SsisObjectMetadataStatusResponseInner;
import com.azure.resourcemanager.synapse.models.GetSsisObjectMetadataRequest;
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
    private final SynapseManagementClientImpl client;

    /**
     * Initializes an instance of IntegrationRuntimeObjectMetadatasClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    IntegrationRuntimeObjectMetadatasClientImpl(SynapseManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    IntegrationRuntimeObjectMetadatasService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SynapseManagementClientIntegrationRuntimeObjectMetadatas to be used
     * by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SynapseManagementCli")
    private interface IntegrationRuntimeObjectMetadatasService {
        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces"
                + "/{workspaceName}/integrationRuntimes/{integrationRuntimeName}/getObjectMetadata")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<SsisObjectMetadataListResponseInner>> list(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("workspaceName") String workspaceName,
            @PathParam("integrationRuntimeName") String integrationRuntimeName,
            @BodyParam("application/json") GetSsisObjectMetadataRequest getMetadataRequest,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces"
                + "/{workspaceName}/integrationRuntimes/{integrationRuntimeName}/refreshObjectMetadata")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Flux<ByteBuffer>>> refresh(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("workspaceName") String workspaceName,
            @PathParam("integrationRuntimeName") String integrationRuntimeName,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Get object metadata from an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param getMetadataRequest The parameters for getting a SSIS object metadata.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object metadata from an integration runtime.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SsisObjectMetadataListResponseInner>> listWithResponseAsync(
        String resourceGroupName,
        String workspaceName,
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
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
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
                        .list(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            workspaceName,
                            integrationRuntimeName,
                            getMetadataRequest,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get object metadata from an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param getMetadataRequest The parameters for getting a SSIS object metadata.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object metadata from an integration runtime.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SsisObjectMetadataListResponseInner>> listWithResponseAsync(
        String resourceGroupName,
        String workspaceName,
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
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
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
            .list(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                workspaceName,
                integrationRuntimeName,
                getMetadataRequest,
                accept,
                context);
    }

    /**
     * Get object metadata from an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param getMetadataRequest The parameters for getting a SSIS object metadata.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object metadata from an integration runtime.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<SsisObjectMetadataListResponseInner> listAsync(
        String resourceGroupName,
        String workspaceName,
        String integrationRuntimeName,
        GetSsisObjectMetadataRequest getMetadataRequest) {
        return listWithResponseAsync(resourceGroupName, workspaceName, integrationRuntimeName, getMetadataRequest)
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
     * Get object metadata from an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object metadata from an integration runtime.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<SsisObjectMetadataListResponseInner> listAsync(
        String resourceGroupName, String workspaceName, String integrationRuntimeName) {
        final GetSsisObjectMetadataRequest getMetadataRequest = null;
        return listWithResponseAsync(resourceGroupName, workspaceName, integrationRuntimeName, getMetadataRequest)
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
     * Get object metadata from an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object metadata from an integration runtime.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SsisObjectMetadataListResponseInner list(
        String resourceGroupName, String workspaceName, String integrationRuntimeName) {
        final GetSsisObjectMetadataRequest getMetadataRequest = null;
        return listAsync(resourceGroupName, workspaceName, integrationRuntimeName, getMetadataRequest).block();
    }

    /**
     * Get object metadata from an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param getMetadataRequest The parameters for getting a SSIS object metadata.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object metadata from an integration runtime.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SsisObjectMetadataListResponseInner> listWithResponse(
        String resourceGroupName,
        String workspaceName,
        String integrationRuntimeName,
        GetSsisObjectMetadataRequest getMetadataRequest,
        Context context) {
        return listWithResponseAsync(
                resourceGroupName, workspaceName, integrationRuntimeName, getMetadataRequest, context)
            .block();
    }

    /**
     * Refresh the object metadata in an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> refreshWithResponseAsync(
        String resourceGroupName, String workspaceName, String integrationRuntimeName) {
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
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
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
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            workspaceName,
                            integrationRuntimeName,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Refresh the object metadata in an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> refreshWithResponseAsync(
        String resourceGroupName, String workspaceName, String integrationRuntimeName, Context context) {
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
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
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
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                workspaceName,
                integrationRuntimeName,
                accept,
                context);
    }

    /**
     * Refresh the object metadata in an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private PollerFlux<PollResult<SsisObjectMetadataStatusResponseInner>, SsisObjectMetadataStatusResponseInner>
        beginRefreshAsync(String resourceGroupName, String workspaceName, String integrationRuntimeName) {
        Mono<Response<Flux<ByteBuffer>>> mono =
            refreshWithResponseAsync(resourceGroupName, workspaceName, integrationRuntimeName);
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
     * Refresh the object metadata in an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private PollerFlux<PollResult<SsisObjectMetadataStatusResponseInner>, SsisObjectMetadataStatusResponseInner>
        beginRefreshAsync(
            String resourceGroupName, String workspaceName, String integrationRuntimeName, Context context) {
        context = this.client.mergeContext(context);
        Mono<Response<Flux<ByteBuffer>>> mono =
            refreshWithResponseAsync(resourceGroupName, workspaceName, integrationRuntimeName, context);
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
     * Refresh the object metadata in an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SyncPoller<PollResult<SsisObjectMetadataStatusResponseInner>, SsisObjectMetadataStatusResponseInner>
        beginRefresh(String resourceGroupName, String workspaceName, String integrationRuntimeName) {
        return beginRefreshAsync(resourceGroupName, workspaceName, integrationRuntimeName).getSyncPoller();
    }

    /**
     * Refresh the object metadata in an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SyncPoller<PollResult<SsisObjectMetadataStatusResponseInner>, SsisObjectMetadataStatusResponseInner>
        beginRefresh(String resourceGroupName, String workspaceName, String integrationRuntimeName, Context context) {
        return beginRefreshAsync(resourceGroupName, workspaceName, integrationRuntimeName, context).getSyncPoller();
    }

    /**
     * Refresh the object metadata in an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<SsisObjectMetadataStatusResponseInner> refreshAsync(
        String resourceGroupName, String workspaceName, String integrationRuntimeName) {
        return beginRefreshAsync(resourceGroupName, workspaceName, integrationRuntimeName)
            .last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Refresh the object metadata in an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<SsisObjectMetadataStatusResponseInner> refreshAsync(
        String resourceGroupName, String workspaceName, String integrationRuntimeName, Context context) {
        return beginRefreshAsync(resourceGroupName, workspaceName, integrationRuntimeName, context)
            .last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Refresh the object metadata in an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SsisObjectMetadataStatusResponseInner refresh(
        String resourceGroupName, String workspaceName, String integrationRuntimeName) {
        return refreshAsync(resourceGroupName, workspaceName, integrationRuntimeName).block();
    }

    /**
     * Refresh the object metadata in an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of the operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SsisObjectMetadataStatusResponseInner refresh(
        String resourceGroupName, String workspaceName, String integrationRuntimeName, Context context) {
        return refreshAsync(resourceGroupName, workspaceName, integrationRuntimeName, context).block();
    }
}
