// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.core.annotation.BodyParam;
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
import com.azure.resourcemanager.security.fluent.AutoProvisioningSettingsClient;
import com.azure.resourcemanager.security.fluent.models.AutoProvisioningSettingInner;
import com.azure.resourcemanager.security.models.AutoProvisioningSettingList;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in AutoProvisioningSettingsClient. */
public final class AutoProvisioningSettingsClientImpl implements AutoProvisioningSettingsClient {
    private final ClientLogger logger = new ClientLogger(AutoProvisioningSettingsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final AutoProvisioningSettingsService service;

    /** The service client containing this operation class. */
    private final SecurityCenterImpl client;

    /**
     * Initializes an instance of AutoProvisioningSettingsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    AutoProvisioningSettingsClientImpl(SecurityCenterImpl client) {
        this.service =
            RestProxy
                .create(AutoProvisioningSettingsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SecurityCenterAutoProvisioningSettings to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SecurityCenterAutoPr")
    private interface AutoProvisioningSettingsService {
        @Headers({"Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Security/autoProvisioningSettings")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<AutoProvisioningSettingList>> list(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Security/autoProvisioningSettings/{settingName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<AutoProvisioningSettingInner>> get(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("settingName") String settingName,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Put("/subscriptions/{subscriptionId}/providers/Microsoft.Security/autoProvisioningSettings/{settingName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<AutoProvisioningSettingInner>> create(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("settingName") String settingName,
            @BodyParam("application/json") AutoProvisioningSettingInner setting,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<AutoProvisioningSettingList>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Exposes the auto provisioning settings of the subscriptions.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of all the auto provisioning settings response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<AutoProvisioningSettingInner>> listSinglePageAsync() {
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
        final String apiVersion = "2017-08-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(this.client.getEndpoint(), apiVersion, this.client.getSubscriptionId(), accept, context))
            .<PagedResponse<AutoProvisioningSettingInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Exposes the auto provisioning settings of the subscriptions.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of all the auto provisioning settings response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<AutoProvisioningSettingInner>> listSinglePageAsync(Context context) {
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
        final String apiVersion = "2017-08-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(this.client.getEndpoint(), apiVersion, this.client.getSubscriptionId(), accept, context)
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
     * Exposes the auto provisioning settings of the subscriptions.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of all the auto provisioning settings response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<AutoProvisioningSettingInner> listAsync() {
        return new PagedFlux<>(() -> listSinglePageAsync(), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Exposes the auto provisioning settings of the subscriptions.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of all the auto provisioning settings response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<AutoProvisioningSettingInner> listAsync(Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(context), nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Exposes the auto provisioning settings of the subscriptions.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of all the auto provisioning settings response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<AutoProvisioningSettingInner> list() {
        return new PagedIterable<>(listAsync());
    }

    /**
     * Exposes the auto provisioning settings of the subscriptions.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of all the auto provisioning settings response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<AutoProvisioningSettingInner> list(Context context) {
        return new PagedIterable<>(listAsync(context));
    }

    /**
     * Details of a specific setting.
     *
     * @param settingName Auto provisioning setting key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return auto provisioning setting.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<AutoProvisioningSettingInner>> getWithResponseAsync(String settingName) {
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
        if (settingName == null) {
            return Mono.error(new IllegalArgumentException("Parameter settingName is required and cannot be null."));
        }
        final String apiVersion = "2017-08-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            apiVersion,
                            this.client.getSubscriptionId(),
                            settingName,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Details of a specific setting.
     *
     * @param settingName Auto provisioning setting key.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return auto provisioning setting.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<AutoProvisioningSettingInner>> getWithResponseAsync(String settingName, Context context) {
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
        if (settingName == null) {
            return Mono.error(new IllegalArgumentException("Parameter settingName is required and cannot be null."));
        }
        final String apiVersion = "2017-08-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(this.client.getEndpoint(), apiVersion, this.client.getSubscriptionId(), settingName, accept, context);
    }

    /**
     * Details of a specific setting.
     *
     * @param settingName Auto provisioning setting key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return auto provisioning setting.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<AutoProvisioningSettingInner> getAsync(String settingName) {
        return getWithResponseAsync(settingName)
            .flatMap(
                (Response<AutoProvisioningSettingInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Details of a specific setting.
     *
     * @param settingName Auto provisioning setting key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return auto provisioning setting.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public AutoProvisioningSettingInner get(String settingName) {
        return getAsync(settingName).block();
    }

    /**
     * Details of a specific setting.
     *
     * @param settingName Auto provisioning setting key.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return auto provisioning setting.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<AutoProvisioningSettingInner> getWithResponse(String settingName, Context context) {
        return getWithResponseAsync(settingName, context).block();
    }

    /**
     * Details of a specific setting.
     *
     * @param settingName Auto provisioning setting key.
     * @param setting Auto provisioning setting key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return auto provisioning setting.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<AutoProvisioningSettingInner>> createWithResponseAsync(
        String settingName, AutoProvisioningSettingInner setting) {
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
        if (settingName == null) {
            return Mono.error(new IllegalArgumentException("Parameter settingName is required and cannot be null."));
        }
        if (setting == null) {
            return Mono.error(new IllegalArgumentException("Parameter setting is required and cannot be null."));
        } else {
            setting.validate();
        }
        final String apiVersion = "2017-08-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .create(
                            this.client.getEndpoint(),
                            apiVersion,
                            this.client.getSubscriptionId(),
                            settingName,
                            setting,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Details of a specific setting.
     *
     * @param settingName Auto provisioning setting key.
     * @param setting Auto provisioning setting key.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return auto provisioning setting.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<AutoProvisioningSettingInner>> createWithResponseAsync(
        String settingName, AutoProvisioningSettingInner setting, Context context) {
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
        if (settingName == null) {
            return Mono.error(new IllegalArgumentException("Parameter settingName is required and cannot be null."));
        }
        if (setting == null) {
            return Mono.error(new IllegalArgumentException("Parameter setting is required and cannot be null."));
        } else {
            setting.validate();
        }
        final String apiVersion = "2017-08-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .create(
                this.client.getEndpoint(),
                apiVersion,
                this.client.getSubscriptionId(),
                settingName,
                setting,
                accept,
                context);
    }

    /**
     * Details of a specific setting.
     *
     * @param settingName Auto provisioning setting key.
     * @param setting Auto provisioning setting key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return auto provisioning setting.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<AutoProvisioningSettingInner> createAsync(String settingName, AutoProvisioningSettingInner setting) {
        return createWithResponseAsync(settingName, setting)
            .flatMap(
                (Response<AutoProvisioningSettingInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Details of a specific setting.
     *
     * @param settingName Auto provisioning setting key.
     * @param setting Auto provisioning setting key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return auto provisioning setting.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public AutoProvisioningSettingInner create(String settingName, AutoProvisioningSettingInner setting) {
        return createAsync(settingName, setting).block();
    }

    /**
     * Details of a specific setting.
     *
     * @param settingName Auto provisioning setting key.
     * @param setting Auto provisioning setting key.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return auto provisioning setting.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<AutoProvisioningSettingInner> createWithResponse(
        String settingName, AutoProvisioningSettingInner setting, Context context) {
        return createWithResponseAsync(settingName, setting, context).block();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of all the auto provisioning settings response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<AutoProvisioningSettingInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<AutoProvisioningSettingInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of all the auto provisioning settings response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<AutoProvisioningSettingInner>> listNextSinglePageAsync(
        String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listNext(nextLink, this.client.getEndpoint(), accept, context)
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
