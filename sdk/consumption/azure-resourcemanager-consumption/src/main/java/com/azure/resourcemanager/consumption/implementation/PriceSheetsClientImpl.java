// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.implementation;

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
import com.azure.resourcemanager.consumption.fluent.PriceSheetsClient;
import com.azure.resourcemanager.consumption.fluent.models.PriceSheetResultInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in PriceSheetsClient. */
public final class PriceSheetsClientImpl implements PriceSheetsClient {
    private final ClientLogger logger = new ClientLogger(PriceSheetsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final PriceSheetsService service;

    /** The service client containing this operation class. */
    private final ConsumptionManagementClientImpl client;

    /**
     * Initializes an instance of PriceSheetsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    PriceSheetsClientImpl(ConsumptionManagementClientImpl client) {
        this.service =
            RestProxy.create(PriceSheetsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ConsumptionManagementClientPriceSheets to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ConsumptionManagemen")
    private interface PriceSheetsService {
        @Headers({"Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Consumption/pricesheets/default")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PriceSheetResultInner>> get(
            @HostParam("$host") String endpoint,
            @QueryParam("$expand") String expand,
            @QueryParam("$skiptoken") String skiptoken,
            @QueryParam("$top") Integer top,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/providers/Microsoft.Billing/billingPeriods/{billingPeriodName}/providers"
                + "/Microsoft.Consumption/pricesheets/default")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PriceSheetResultInner>> getByBillingPeriod(
            @HostParam("$host") String endpoint,
            @QueryParam("$expand") String expand,
            @QueryParam("$skiptoken") String skiptoken,
            @QueryParam("$top") Integer top,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @PathParam("billingPeriodName") String billingPeriodName,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets the price sheet for a scope by subscriptionId. Price sheet is available via this API only for May 1, 2014 or
     * later.
     *
     * @param expand May be used to expand the properties/meterDetails within a price sheet. By default, these fields
     *     are not included when returning price sheet.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result. If a previous response
     *     contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that
     *     specifies a starting point to use for subsequent calls.
     * @param top May be used to limit the number of results to the top N results.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the price sheet for a scope by subscriptionId.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PriceSheetResultInner>> getWithResponseAsync(String expand, String skiptoken, Integer top) {
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
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            expand,
                            skiptoken,
                            top,
                            this.client.getSubscriptionId(),
                            this.client.getApiVersion(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets the price sheet for a scope by subscriptionId. Price sheet is available via this API only for May 1, 2014 or
     * later.
     *
     * @param expand May be used to expand the properties/meterDetails within a price sheet. By default, these fields
     *     are not included when returning price sheet.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result. If a previous response
     *     contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that
     *     specifies a starting point to use for subsequent calls.
     * @param top May be used to limit the number of results to the top N results.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the price sheet for a scope by subscriptionId.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PriceSheetResultInner>> getWithResponseAsync(
        String expand, String skiptoken, Integer top, Context context) {
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
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                expand,
                skiptoken,
                top,
                this.client.getSubscriptionId(),
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Gets the price sheet for a scope by subscriptionId. Price sheet is available via this API only for May 1, 2014 or
     * later.
     *
     * @param expand May be used to expand the properties/meterDetails within a price sheet. By default, these fields
     *     are not included when returning price sheet.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result. If a previous response
     *     contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that
     *     specifies a starting point to use for subsequent calls.
     * @param top May be used to limit the number of results to the top N results.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the price sheet for a scope by subscriptionId.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PriceSheetResultInner> getAsync(String expand, String skiptoken, Integer top) {
        return getWithResponseAsync(expand, skiptoken, top)
            .flatMap(
                (Response<PriceSheetResultInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets the price sheet for a scope by subscriptionId. Price sheet is available via this API only for May 1, 2014 or
     * later.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the price sheet for a scope by subscriptionId.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PriceSheetResultInner> getAsync() {
        final String expand = null;
        final String skiptoken = null;
        final Integer top = null;
        return getWithResponseAsync(expand, skiptoken, top)
            .flatMap(
                (Response<PriceSheetResultInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets the price sheet for a scope by subscriptionId. Price sheet is available via this API only for May 1, 2014 or
     * later.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the price sheet for a scope by subscriptionId.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PriceSheetResultInner get() {
        final String expand = null;
        final String skiptoken = null;
        final Integer top = null;
        return getAsync(expand, skiptoken, top).block();
    }

    /**
     * Gets the price sheet for a scope by subscriptionId. Price sheet is available via this API only for May 1, 2014 or
     * later.
     *
     * @param expand May be used to expand the properties/meterDetails within a price sheet. By default, these fields
     *     are not included when returning price sheet.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result. If a previous response
     *     contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that
     *     specifies a starting point to use for subsequent calls.
     * @param top May be used to limit the number of results to the top N results.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the price sheet for a scope by subscriptionId.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<PriceSheetResultInner> getWithResponse(
        String expand, String skiptoken, Integer top, Context context) {
        return getWithResponseAsync(expand, skiptoken, top, context).block();
    }

    /**
     * Get the price sheet for a scope by subscriptionId and billing period. Price sheet is available via this API only
     * for May 1, 2014 or later.
     *
     * @param billingPeriodName Billing Period Name.
     * @param expand May be used to expand the properties/meterDetails within a price sheet. By default, these fields
     *     are not included when returning price sheet.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result. If a previous response
     *     contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that
     *     specifies a starting point to use for subsequent calls.
     * @param top May be used to limit the number of results to the top N results.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the price sheet for a scope by subscriptionId and billing period.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PriceSheetResultInner>> getByBillingPeriodWithResponseAsync(
        String billingPeriodName, String expand, String skiptoken, Integer top) {
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
        if (billingPeriodName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter billingPeriodName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .getByBillingPeriod(
                            this.client.getEndpoint(),
                            expand,
                            skiptoken,
                            top,
                            this.client.getSubscriptionId(),
                            this.client.getApiVersion(),
                            billingPeriodName,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the price sheet for a scope by subscriptionId and billing period. Price sheet is available via this API only
     * for May 1, 2014 or later.
     *
     * @param billingPeriodName Billing Period Name.
     * @param expand May be used to expand the properties/meterDetails within a price sheet. By default, these fields
     *     are not included when returning price sheet.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result. If a previous response
     *     contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that
     *     specifies a starting point to use for subsequent calls.
     * @param top May be used to limit the number of results to the top N results.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the price sheet for a scope by subscriptionId and billing period.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PriceSheetResultInner>> getByBillingPeriodWithResponseAsync(
        String billingPeriodName, String expand, String skiptoken, Integer top, Context context) {
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
        if (billingPeriodName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter billingPeriodName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .getByBillingPeriod(
                this.client.getEndpoint(),
                expand,
                skiptoken,
                top,
                this.client.getSubscriptionId(),
                this.client.getApiVersion(),
                billingPeriodName,
                accept,
                context);
    }

    /**
     * Get the price sheet for a scope by subscriptionId and billing period. Price sheet is available via this API only
     * for May 1, 2014 or later.
     *
     * @param billingPeriodName Billing Period Name.
     * @param expand May be used to expand the properties/meterDetails within a price sheet. By default, these fields
     *     are not included when returning price sheet.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result. If a previous response
     *     contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that
     *     specifies a starting point to use for subsequent calls.
     * @param top May be used to limit the number of results to the top N results.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the price sheet for a scope by subscriptionId and billing period.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PriceSheetResultInner> getByBillingPeriodAsync(
        String billingPeriodName, String expand, String skiptoken, Integer top) {
        return getByBillingPeriodWithResponseAsync(billingPeriodName, expand, skiptoken, top)
            .flatMap(
                (Response<PriceSheetResultInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Get the price sheet for a scope by subscriptionId and billing period. Price sheet is available via this API only
     * for May 1, 2014 or later.
     *
     * @param billingPeriodName Billing Period Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the price sheet for a scope by subscriptionId and billing period.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PriceSheetResultInner> getByBillingPeriodAsync(String billingPeriodName) {
        final String expand = null;
        final String skiptoken = null;
        final Integer top = null;
        return getByBillingPeriodWithResponseAsync(billingPeriodName, expand, skiptoken, top)
            .flatMap(
                (Response<PriceSheetResultInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Get the price sheet for a scope by subscriptionId and billing period. Price sheet is available via this API only
     * for May 1, 2014 or later.
     *
     * @param billingPeriodName Billing Period Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the price sheet for a scope by subscriptionId and billing period.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PriceSheetResultInner getByBillingPeriod(String billingPeriodName) {
        final String expand = null;
        final String skiptoken = null;
        final Integer top = null;
        return getByBillingPeriodAsync(billingPeriodName, expand, skiptoken, top).block();
    }

    /**
     * Get the price sheet for a scope by subscriptionId and billing period. Price sheet is available via this API only
     * for May 1, 2014 or later.
     *
     * @param billingPeriodName Billing Period Name.
     * @param expand May be used to expand the properties/meterDetails within a price sheet. By default, these fields
     *     are not included when returning price sheet.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result. If a previous response
     *     contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that
     *     specifies a starting point to use for subsequent calls.
     * @param top May be used to limit the number of results to the top N results.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the price sheet for a scope by subscriptionId and billing period.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<PriceSheetResultInner> getByBillingPeriodWithResponse(
        String billingPeriodName, String expand, String skiptoken, Integer top, Context context) {
        return getByBillingPeriodWithResponseAsync(billingPeriodName, expand, skiptoken, top, context).block();
    }
}
