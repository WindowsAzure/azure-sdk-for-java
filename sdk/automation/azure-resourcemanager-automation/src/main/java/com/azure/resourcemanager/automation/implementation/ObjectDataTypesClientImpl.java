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
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.automation.fluent.ObjectDataTypesClient;
import com.azure.resourcemanager.automation.fluent.models.TypeFieldInner;
import com.azure.resourcemanager.automation.models.TypeFieldListResult;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ObjectDataTypesClient. */
public final class ObjectDataTypesClientImpl implements ObjectDataTypesClient {
    private final ClientLogger logger = new ClientLogger(ObjectDataTypesClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final ObjectDataTypesService service;

    /** The service client containing this operation class. */
    private final AutomationClientImpl client;

    /**
     * Initializes an instance of ObjectDataTypesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ObjectDataTypesClientImpl(AutomationClientImpl client) {
        this.service =
            RestProxy.create(ObjectDataTypesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AutomationClientObjectDataTypes to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AutomationClientObje")
    private interface ObjectDataTypesService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Automation"
                + "/automationAccounts/{automationAccountName}/modules/{moduleName}/objectDataTypes/{typeName}/fields")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<TypeFieldListResult>> listFieldsByModuleAndType(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("automationAccountName") String automationAccountName,
            @PathParam("moduleName") String moduleName,
            @PathParam("typeName") String typeName,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Automation"
                + "/automationAccounts/{automationAccountName}/objectDataTypes/{typeName}/fields")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<TypeFieldListResult>> listFieldsByType(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("automationAccountName") String automationAccountName,
            @PathParam("typeName") String typeName,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Retrieve a list of fields of a given type identified by module name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param moduleName The name of module.
     * @param typeName The name of type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the list fields operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<TypeFieldInner>> listFieldsByModuleAndTypeSinglePageAsync(
        String resourceGroupName, String automationAccountName, String moduleName, String typeName) {
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
        if (moduleName == null) {
            return Mono.error(new IllegalArgumentException("Parameter moduleName is required and cannot be null."));
        }
        if (typeName == null) {
            return Mono.error(new IllegalArgumentException("Parameter typeName is required and cannot be null."));
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
                        .listFieldsByModuleAndType(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            automationAccountName,
                            moduleName,
                            typeName,
                            this.client.getSubscriptionId(),
                            apiVersion,
                            accept,
                            context))
            .<PagedResponse<TypeFieldInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Retrieve a list of fields of a given type identified by module name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param moduleName The name of module.
     * @param typeName The name of type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the list fields operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<TypeFieldInner>> listFieldsByModuleAndTypeSinglePageAsync(
        String resourceGroupName, String automationAccountName, String moduleName, String typeName, Context context) {
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
        if (moduleName == null) {
            return Mono.error(new IllegalArgumentException("Parameter moduleName is required and cannot be null."));
        }
        if (typeName == null) {
            return Mono.error(new IllegalArgumentException("Parameter typeName is required and cannot be null."));
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
            .listFieldsByModuleAndType(
                this.client.getEndpoint(),
                resourceGroupName,
                automationAccountName,
                moduleName,
                typeName,
                this.client.getSubscriptionId(),
                apiVersion,
                accept,
                context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null));
    }

    /**
     * Retrieve a list of fields of a given type identified by module name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param moduleName The name of module.
     * @param typeName The name of type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the list fields operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<TypeFieldInner> listFieldsByModuleAndTypeAsync(
        String resourceGroupName, String automationAccountName, String moduleName, String typeName) {
        return new PagedFlux<>(
            () ->
                listFieldsByModuleAndTypeSinglePageAsync(
                    resourceGroupName, automationAccountName, moduleName, typeName));
    }

    /**
     * Retrieve a list of fields of a given type identified by module name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param moduleName The name of module.
     * @param typeName The name of type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the list fields operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<TypeFieldInner> listFieldsByModuleAndTypeAsync(
        String resourceGroupName, String automationAccountName, String moduleName, String typeName, Context context) {
        return new PagedFlux<>(
            () ->
                listFieldsByModuleAndTypeSinglePageAsync(
                    resourceGroupName, automationAccountName, moduleName, typeName, context));
    }

    /**
     * Retrieve a list of fields of a given type identified by module name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param moduleName The name of module.
     * @param typeName The name of type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the list fields operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<TypeFieldInner> listFieldsByModuleAndType(
        String resourceGroupName, String automationAccountName, String moduleName, String typeName) {
        return new PagedIterable<>(
            listFieldsByModuleAndTypeAsync(resourceGroupName, automationAccountName, moduleName, typeName));
    }

    /**
     * Retrieve a list of fields of a given type identified by module name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param moduleName The name of module.
     * @param typeName The name of type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the list fields operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<TypeFieldInner> listFieldsByModuleAndType(
        String resourceGroupName, String automationAccountName, String moduleName, String typeName, Context context) {
        return new PagedIterable<>(
            listFieldsByModuleAndTypeAsync(resourceGroupName, automationAccountName, moduleName, typeName, context));
    }

    /**
     * Retrieve a list of fields of a given type across all accessible modules.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param typeName The name of type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the list fields operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<TypeFieldInner>> listFieldsByTypeSinglePageAsync(
        String resourceGroupName, String automationAccountName, String typeName) {
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
        if (typeName == null) {
            return Mono.error(new IllegalArgumentException("Parameter typeName is required and cannot be null."));
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
                        .listFieldsByType(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            automationAccountName,
                            typeName,
                            this.client.getSubscriptionId(),
                            apiVersion,
                            accept,
                            context))
            .<PagedResponse<TypeFieldInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Retrieve a list of fields of a given type across all accessible modules.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param typeName The name of type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the list fields operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<TypeFieldInner>> listFieldsByTypeSinglePageAsync(
        String resourceGroupName, String automationAccountName, String typeName, Context context) {
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
        if (typeName == null) {
            return Mono.error(new IllegalArgumentException("Parameter typeName is required and cannot be null."));
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
            .listFieldsByType(
                this.client.getEndpoint(),
                resourceGroupName,
                automationAccountName,
                typeName,
                this.client.getSubscriptionId(),
                apiVersion,
                accept,
                context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null));
    }

    /**
     * Retrieve a list of fields of a given type across all accessible modules.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param typeName The name of type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the list fields operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<TypeFieldInner> listFieldsByTypeAsync(
        String resourceGroupName, String automationAccountName, String typeName) {
        return new PagedFlux<>(
            () -> listFieldsByTypeSinglePageAsync(resourceGroupName, automationAccountName, typeName));
    }

    /**
     * Retrieve a list of fields of a given type across all accessible modules.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param typeName The name of type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the list fields operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<TypeFieldInner> listFieldsByTypeAsync(
        String resourceGroupName, String automationAccountName, String typeName, Context context) {
        return new PagedFlux<>(
            () -> listFieldsByTypeSinglePageAsync(resourceGroupName, automationAccountName, typeName, context));
    }

    /**
     * Retrieve a list of fields of a given type across all accessible modules.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param typeName The name of type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the list fields operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<TypeFieldInner> listFieldsByType(
        String resourceGroupName, String automationAccountName, String typeName) {
        return new PagedIterable<>(listFieldsByTypeAsync(resourceGroupName, automationAccountName, typeName));
    }

    /**
     * Retrieve a list of fields of a given type across all accessible modules.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param typeName The name of type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the list fields operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<TypeFieldInner> listFieldsByType(
        String resourceGroupName, String automationAccountName, String typeName, Context context) {
        return new PagedIterable<>(listFieldsByTypeAsync(resourceGroupName, automationAccountName, typeName, context));
    }
}
