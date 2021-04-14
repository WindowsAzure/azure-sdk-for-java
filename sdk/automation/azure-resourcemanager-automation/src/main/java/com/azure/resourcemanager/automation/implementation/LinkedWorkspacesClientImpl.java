// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.implementation;

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
import com.azure.resourcemanager.automation.fluent.LinkedWorkspacesClient;
import com.azure.resourcemanager.automation.fluent.models.LinkedWorkspaceInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in LinkedWorkspacesClient. */
public final class LinkedWorkspacesClientImpl implements LinkedWorkspacesClient {
    private final ClientLogger logger = new ClientLogger(LinkedWorkspacesClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final LinkedWorkspacesService service;

    /** The service client containing this operation class. */
    private final AutomationClientImpl client;

    /**
     * Initializes an instance of LinkedWorkspacesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    LinkedWorkspacesClientImpl(AutomationClientImpl client) {
        this.service =
            RestProxy.create(LinkedWorkspacesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AutomationClientLinkedWorkspaces to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AutomationClientLink")
    private interface LinkedWorkspacesService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Automation"
                + "/automationAccounts/{automationAccountName}/linkedWorkspace")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<LinkedWorkspaceInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("automationAccountName") String automationAccountName,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Retrieve the linked workspace for the account id.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the linked workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<LinkedWorkspaceInner>> getWithResponseAsync(
        String resourceGroupName, String automationAccountName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (automationAccountName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter automationAccountName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2019-06-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            automationAccountName,
                            this.client.getSubscriptionId(),
                            apiVersion,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Retrieve the linked workspace for the account id.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the linked workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<LinkedWorkspaceInner>> getWithResponseAsync(
        String resourceGroupName, String automationAccountName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (automationAccountName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter automationAccountName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2019-06-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                resourceGroupName,
                automationAccountName,
                this.client.getSubscriptionId(),
                apiVersion,
                accept,
                context);
    }

    /**
     * Retrieve the linked workspace for the account id.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the linked workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<LinkedWorkspaceInner> getAsync(String resourceGroupName, String automationAccountName) {
        return getWithResponseAsync(resourceGroupName, automationAccountName)
            .flatMap(
                (Response<LinkedWorkspaceInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Retrieve the linked workspace for the account id.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the linked workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LinkedWorkspaceInner get(String resourceGroupName, String automationAccountName) {
        return getAsync(resourceGroupName, automationAccountName).block();
    }

    /**
     * Retrieve the linked workspace for the account id.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the linked workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<LinkedWorkspaceInner> getWithResponse(
        String resourceGroupName, String automationAccountName, Context context) {
        return getWithResponseAsync(resourceGroupName, automationAccountName, context).block();
    }
}
