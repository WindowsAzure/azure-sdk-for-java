// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
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
import com.azure.resourcemanager.machinelearningservices.fluent.PrivateEndpointConnectionsClient;
import com.azure.resourcemanager.machinelearningservices.fluent.models.PrivateEndpointConnectionInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in PrivateEndpointConnectionsClient. */
public final class PrivateEndpointConnectionsClientImpl implements PrivateEndpointConnectionsClient {
    private final ClientLogger logger = new ClientLogger(PrivateEndpointConnectionsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final PrivateEndpointConnectionsService service;

    /** The service client containing this operation class. */
    private final AzureMachineLearningWorkspacesImpl client;

    /**
     * Initializes an instance of PrivateEndpointConnectionsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    PrivateEndpointConnectionsClientImpl(AzureMachineLearningWorkspacesImpl client) {
        this.service =
            RestProxy
                .create(
                    PrivateEndpointConnectionsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureMachineLearningWorkspacesPrivateEndpointConnections to be used
     * by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AzureMachineLearning")
    private interface PrivateEndpointConnectionsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers"
                + "/Microsoft.MachineLearningServices/workspaces/{workspaceName}/privateEndpointConnections"
                + "/{privateEndpointConnectionName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PrivateEndpointConnectionInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("workspaceName") String workspaceName,
            @PathParam("privateEndpointConnectionName") String privateEndpointConnectionName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Put(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers"
                + "/Microsoft.MachineLearningServices/workspaces/{workspaceName}/privateEndpointConnections"
                + "/{privateEndpointConnectionName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PrivateEndpointConnectionInner>> put(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("workspaceName") String workspaceName,
            @PathParam("privateEndpointConnectionName") String privateEndpointConnectionName,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") PrivateEndpointConnectionInner properties,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Delete(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers"
                + "/Microsoft.MachineLearningServices/workspaces/{workspaceName}/privateEndpointConnections"
                + "/{privateEndpointConnectionName}")
        @ExpectedResponses({200, 204})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Void>> delete(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("workspaceName") String workspaceName,
            @PathParam("privateEndpointConnectionName") String privateEndpointConnectionName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets the specified private endpoint connection associated with the workspace.
     *
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint connection associated with the workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PrivateEndpointConnectionInner>> getWithResponseAsync(
        String resourceGroupName, String workspaceName, String privateEndpointConnectionName) {
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
        if (privateEndpointConnectionName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter privateEndpointConnectionName is required and cannot be null."));
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
                            workspaceName,
                            privateEndpointConnectionName,
                            this.client.getApiVersion(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets the specified private endpoint connection associated with the workspace.
     *
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint connection associated with the workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PrivateEndpointConnectionInner>> getWithResponseAsync(
        String resourceGroupName, String workspaceName, String privateEndpointConnectionName, Context context) {
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
        if (privateEndpointConnectionName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter privateEndpointConnectionName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                workspaceName,
                privateEndpointConnectionName,
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Gets the specified private endpoint connection associated with the workspace.
     *
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint connection associated with the workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PrivateEndpointConnectionInner> getAsync(
        String resourceGroupName, String workspaceName, String privateEndpointConnectionName) {
        return getWithResponseAsync(resourceGroupName, workspaceName, privateEndpointConnectionName)
            .flatMap(
                (Response<PrivateEndpointConnectionInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets the specified private endpoint connection associated with the workspace.
     *
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint connection associated with the workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PrivateEndpointConnectionInner get(
        String resourceGroupName, String workspaceName, String privateEndpointConnectionName) {
        return getAsync(resourceGroupName, workspaceName, privateEndpointConnectionName).block();
    }

    /**
     * Gets the specified private endpoint connection associated with the workspace.
     *
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint connection associated with the workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<PrivateEndpointConnectionInner> getWithResponse(
        String resourceGroupName, String workspaceName, String privateEndpointConnectionName, Context context) {
        return getWithResponseAsync(resourceGroupName, workspaceName, privateEndpointConnectionName, context).block();
    }

    /**
     * Update the state of specified private endpoint connection associated with the workspace.
     *
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the workspace.
     * @param properties The private endpoint connection properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Private Endpoint Connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PrivateEndpointConnectionInner>> putWithResponseAsync(
        String resourceGroupName,
        String workspaceName,
        String privateEndpointConnectionName,
        PrivateEndpointConnectionInner properties) {
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
        if (privateEndpointConnectionName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter privateEndpointConnectionName is required and cannot be null."));
        }
        if (properties == null) {
            return Mono.error(new IllegalArgumentException("Parameter properties is required and cannot be null."));
        } else {
            properties.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .put(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            workspaceName,
                            privateEndpointConnectionName,
                            this.client.getApiVersion(),
                            properties,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Update the state of specified private endpoint connection associated with the workspace.
     *
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the workspace.
     * @param properties The private endpoint connection properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Private Endpoint Connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PrivateEndpointConnectionInner>> putWithResponseAsync(
        String resourceGroupName,
        String workspaceName,
        String privateEndpointConnectionName,
        PrivateEndpointConnectionInner properties,
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
        if (privateEndpointConnectionName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter privateEndpointConnectionName is required and cannot be null."));
        }
        if (properties == null) {
            return Mono.error(new IllegalArgumentException("Parameter properties is required and cannot be null."));
        } else {
            properties.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .put(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                workspaceName,
                privateEndpointConnectionName,
                this.client.getApiVersion(),
                properties,
                accept,
                context);
    }

    /**
     * Update the state of specified private endpoint connection associated with the workspace.
     *
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the workspace.
     * @param properties The private endpoint connection properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Private Endpoint Connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PrivateEndpointConnectionInner> putAsync(
        String resourceGroupName,
        String workspaceName,
        String privateEndpointConnectionName,
        PrivateEndpointConnectionInner properties) {
        return putWithResponseAsync(resourceGroupName, workspaceName, privateEndpointConnectionName, properties)
            .flatMap(
                (Response<PrivateEndpointConnectionInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Update the state of specified private endpoint connection associated with the workspace.
     *
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the workspace.
     * @param properties The private endpoint connection properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Private Endpoint Connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PrivateEndpointConnectionInner put(
        String resourceGroupName,
        String workspaceName,
        String privateEndpointConnectionName,
        PrivateEndpointConnectionInner properties) {
        return putAsync(resourceGroupName, workspaceName, privateEndpointConnectionName, properties).block();
    }

    /**
     * Update the state of specified private endpoint connection associated with the workspace.
     *
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the workspace.
     * @param properties The private endpoint connection properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Private Endpoint Connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<PrivateEndpointConnectionInner> putWithResponse(
        String resourceGroupName,
        String workspaceName,
        String privateEndpointConnectionName,
        PrivateEndpointConnectionInner properties,
        Context context) {
        return putWithResponseAsync(
                resourceGroupName, workspaceName, privateEndpointConnectionName, properties, context)
            .block();
    }

    /**
     * Deletes the specified private endpoint connection associated with the workspace.
     *
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> deleteWithResponseAsync(
        String resourceGroupName, String workspaceName, String privateEndpointConnectionName) {
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
        if (privateEndpointConnectionName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter privateEndpointConnectionName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .delete(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            workspaceName,
                            privateEndpointConnectionName,
                            this.client.getApiVersion(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Deletes the specified private endpoint connection associated with the workspace.
     *
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> deleteWithResponseAsync(
        String resourceGroupName, String workspaceName, String privateEndpointConnectionName, Context context) {
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
        if (privateEndpointConnectionName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter privateEndpointConnectionName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .delete(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                workspaceName,
                privateEndpointConnectionName,
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Deletes the specified private endpoint connection associated with the workspace.
     *
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> deleteAsync(
        String resourceGroupName, String workspaceName, String privateEndpointConnectionName) {
        return deleteWithResponseAsync(resourceGroupName, workspaceName, privateEndpointConnectionName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes the specified private endpoint connection associated with the workspace.
     *
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String workspaceName, String privateEndpointConnectionName) {
        deleteAsync(resourceGroupName, workspaceName, privateEndpointConnectionName).block();
    }

    /**
     * Deletes the specified private endpoint connection associated with the workspace.
     *
     * @param resourceGroupName Name of the resource group in which workspace is located.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteWithResponse(
        String resourceGroupName, String workspaceName, String privateEndpointConnectionName, Context context) {
        return deleteWithResponseAsync(resourceGroupName, workspaceName, privateEndpointConnectionName, context)
            .block();
    }
}
