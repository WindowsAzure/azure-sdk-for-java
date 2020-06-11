// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
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
import com.azure.resourcemanager.authorization.GraphRbacManagementClient;
import com.azure.resourcemanager.authorization.fluent.inner.DomainInner;
import com.azure.resourcemanager.authorization.fluent.inner.DomainListResultInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Domains. */
public final class DomainsClient {
    private final ClientLogger logger = new ClientLogger(DomainsClient.class);

    /** The proxy service used to perform REST calls. */
    private final DomainsService service;

    /** The service client containing this operation class. */
    private final GraphRbacManagementClient client;

    /**
     * Initializes an instance of DomainsClient.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public DomainsClient(GraphRbacManagementClient client) {
        this.service = RestProxy.create(DomainsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for GraphRbacManagementClientDomains to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "GraphRbacManagementC")
    private interface DomainsService {
        @Headers({"Accept: application/json,text/json", "Content-Type: application/json"})
        @Get("/{tenantID}/domains")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DomainListResultInner>> list(
            @HostParam("$host") String endpoint,
            @QueryParam("$filter") String filter,
            @QueryParam("api-version") String apiVersion,
            @PathParam("tenantID") String tenantId,
            Context context);

        @Headers({"Accept: application/json,text/json", "Content-Type: application/json"})
        @Get("/{tenantID}/domains/{domainName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DomainInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("domainName") String domainName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("tenantID") String tenantId,
            Context context);
    }

    /**
     * Gets a list of domains for the current tenant.
     *
     * @param filter The filter to apply to the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of domains for the current tenant.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<DomainInner>> listSinglePageAsync(String filter) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getTenantId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getTenantId() is required and cannot be null."));
        }
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            filter,
                            this.client.getApiVersion(),
                            this.client.getTenantId(),
                            context))
            .<PagedResponse<DomainInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets a list of domains for the current tenant.
     *
     * @param filter The filter to apply to the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of domains for the current tenant.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<DomainInner>> listSinglePageAsync(String filter, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getTenantId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getTenantId() is required and cannot be null."));
        }
        return service
            .list(this.client.getEndpoint(), filter, this.client.getApiVersion(), this.client.getTenantId(), context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null));
    }

    /**
     * Gets a list of domains for the current tenant.
     *
     * @param filter The filter to apply to the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of domains for the current tenant.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<DomainInner> listAsync(String filter) {
        return new PagedFlux<>(() -> listSinglePageAsync(filter));
    }

    /**
     * Gets a list of domains for the current tenant.
     *
     * @param filter The filter to apply to the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of domains for the current tenant.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<DomainInner> listAsync(String filter, Context context) {
        return new PagedFlux<>(() -> listSinglePageAsync(filter, context));
    }

    /**
     * Gets a list of domains for the current tenant.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of domains for the current tenant.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<DomainInner> listAsync() {
        final String filter = null;
        final Context context = null;
        return new PagedFlux<>(() -> listSinglePageAsync(filter));
    }

    /**
     * Gets a list of domains for the current tenant.
     *
     * @param filter The filter to apply to the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of domains for the current tenant.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DomainInner> list(String filter) {
        return new PagedIterable<>(listAsync(filter));
    }

    /**
     * Gets a list of domains for the current tenant.
     *
     * @param filter The filter to apply to the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of domains for the current tenant.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DomainInner> list(String filter, Context context) {
        return new PagedIterable<>(listAsync(filter, context));
    }

    /**
     * Gets a list of domains for the current tenant.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of domains for the current tenant.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DomainInner> list() {
        final String filter = null;
        final Context context = null;
        return new PagedIterable<>(listAsync(filter));
    }

    /**
     * Gets a specific domain in the current tenant.
     *
     * @param domainName name of the domain.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific domain in the current tenant.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<DomainInner>> getWithResponseAsync(String domainName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (domainName == null) {
            return Mono.error(new IllegalArgumentException("Parameter domainName is required and cannot be null."));
        }
        if (this.client.getTenantId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getTenantId() is required and cannot be null."));
        }
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            domainName,
                            this.client.getApiVersion(),
                            this.client.getTenantId(),
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets a specific domain in the current tenant.
     *
     * @param domainName name of the domain.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific domain in the current tenant.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<DomainInner>> getWithResponseAsync(String domainName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (domainName == null) {
            return Mono.error(new IllegalArgumentException("Parameter domainName is required and cannot be null."));
        }
        if (this.client.getTenantId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getTenantId() is required and cannot be null."));
        }
        return service
            .get(
                this.client.getEndpoint(), domainName, this.client.getApiVersion(), this.client.getTenantId(), context);
    }

    /**
     * Gets a specific domain in the current tenant.
     *
     * @param domainName name of the domain.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific domain in the current tenant.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DomainInner> getAsync(String domainName) {
        return getWithResponseAsync(domainName)
            .flatMap(
                (Response<DomainInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets a specific domain in the current tenant.
     *
     * @param domainName name of the domain.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific domain in the current tenant.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DomainInner> getAsync(String domainName, Context context) {
        return getWithResponseAsync(domainName, context)
            .flatMap(
                (Response<DomainInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets a specific domain in the current tenant.
     *
     * @param domainName name of the domain.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific domain in the current tenant.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DomainInner get(String domainName) {
        return getAsync(domainName).block();
    }

    /**
     * Gets a specific domain in the current tenant.
     *
     * @param domainName name of the domain.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific domain in the current tenant.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DomainInner get(String domainName, Context context) {
        return getAsync(domainName, context).block();
    }
}
