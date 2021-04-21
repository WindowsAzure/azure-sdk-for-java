// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.subscription.implementation;

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
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.subscription.fluent.AliasClient;
import com.azure.resourcemanager.subscription.fluent.models.PutAliasListResultInner;
import com.azure.resourcemanager.subscription.fluent.models.PutAliasResponseInner;
import com.azure.resourcemanager.subscription.models.PutAliasRequest;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in AliasClient. */
public final class AliasClientImpl implements AliasClient {
    private final ClientLogger logger = new ClientLogger(AliasClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final AliasService service;

    /** The service client containing this operation class. */
    private final SubscriptionClientImpl client;

    /**
     * Initializes an instance of AliasClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    AliasClientImpl(SubscriptionClientImpl client) {
        this.service = RestProxy.create(AliasService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SubscriptionClientAlias to be used by the proxy service to perform
     * REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SubscriptionClientAl")
    private interface AliasService {
        @Headers({"Content-Type: application/json"})
        @Put("/providers/Microsoft.Subscription/aliases/{aliasName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Flux<ByteBuffer>>> create(
            @HostParam("$host") String endpoint,
            @PathParam("aliasName") String aliasName,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") PutAliasRequest body,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("/providers/Microsoft.Subscription/aliases/{aliasName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PutAliasResponseInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("aliasName") String aliasName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Delete("/providers/Microsoft.Subscription/aliases/{aliasName}")
        @ExpectedResponses({200, 204})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Void>> delete(
            @HostParam("$host") String endpoint,
            @PathParam("aliasName") String aliasName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("/providers/Microsoft.Subscription/aliases")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PutAliasListResultInner>> list(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Create Alias Subscription.
     *
     * @param aliasName Alias Name.
     * @param body The parameters required to create a new subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return subscription Information with the alias.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> createWithResponseAsync(String aliasName, PutAliasRequest body) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (aliasName == null) {
            return Mono.error(new IllegalArgumentException("Parameter aliasName is required and cannot be null."));
        }
        if (body == null) {
            return Mono.error(new IllegalArgumentException("Parameter body is required and cannot be null."));
        } else {
            body.validate();
        }
        final String apiVersion = "2020-09-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context -> service.create(this.client.getEndpoint(), aliasName, apiVersion, body, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Create Alias Subscription.
     *
     * @param aliasName Alias Name.
     * @param body The parameters required to create a new subscription.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return subscription Information with the alias.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> createWithResponseAsync(
        String aliasName, PutAliasRequest body, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (aliasName == null) {
            return Mono.error(new IllegalArgumentException("Parameter aliasName is required and cannot be null."));
        }
        if (body == null) {
            return Mono.error(new IllegalArgumentException("Parameter body is required and cannot be null."));
        } else {
            body.validate();
        }
        final String apiVersion = "2020-09-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.create(this.client.getEndpoint(), aliasName, apiVersion, body, accept, context);
    }

    /**
     * Create Alias Subscription.
     *
     * @param aliasName Alias Name.
     * @param body The parameters required to create a new subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return subscription Information with the alias.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private PollerFlux<PollResult<PutAliasResponseInner>, PutAliasResponseInner> beginCreateAsync(
        String aliasName, PutAliasRequest body) {
        Mono<Response<Flux<ByteBuffer>>> mono = createWithResponseAsync(aliasName, body);
        return this
            .client
            .<PutAliasResponseInner, PutAliasResponseInner>getLroResult(
                mono,
                this.client.getHttpPipeline(),
                PutAliasResponseInner.class,
                PutAliasResponseInner.class,
                Context.NONE);
    }

    /**
     * Create Alias Subscription.
     *
     * @param aliasName Alias Name.
     * @param body The parameters required to create a new subscription.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return subscription Information with the alias.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private PollerFlux<PollResult<PutAliasResponseInner>, PutAliasResponseInner> beginCreateAsync(
        String aliasName, PutAliasRequest body, Context context) {
        context = this.client.mergeContext(context);
        Mono<Response<Flux<ByteBuffer>>> mono = createWithResponseAsync(aliasName, body, context);
        return this
            .client
            .<PutAliasResponseInner, PutAliasResponseInner>getLroResult(
                mono, this.client.getHttpPipeline(), PutAliasResponseInner.class, PutAliasResponseInner.class, context);
    }

    /**
     * Create Alias Subscription.
     *
     * @param aliasName Alias Name.
     * @param body The parameters required to create a new subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return subscription Information with the alias.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SyncPoller<PollResult<PutAliasResponseInner>, PutAliasResponseInner> beginCreate(
        String aliasName, PutAliasRequest body) {
        return beginCreateAsync(aliasName, body).getSyncPoller();
    }

    /**
     * Create Alias Subscription.
     *
     * @param aliasName Alias Name.
     * @param body The parameters required to create a new subscription.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return subscription Information with the alias.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SyncPoller<PollResult<PutAliasResponseInner>, PutAliasResponseInner> beginCreate(
        String aliasName, PutAliasRequest body, Context context) {
        return beginCreateAsync(aliasName, body, context).getSyncPoller();
    }

    /**
     * Create Alias Subscription.
     *
     * @param aliasName Alias Name.
     * @param body The parameters required to create a new subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return subscription Information with the alias.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PutAliasResponseInner> createAsync(String aliasName, PutAliasRequest body) {
        return beginCreateAsync(aliasName, body).last().flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Create Alias Subscription.
     *
     * @param aliasName Alias Name.
     * @param body The parameters required to create a new subscription.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return subscription Information with the alias.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PutAliasResponseInner> createAsync(String aliasName, PutAliasRequest body, Context context) {
        return beginCreateAsync(aliasName, body, context).last().flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Create Alias Subscription.
     *
     * @param aliasName Alias Name.
     * @param body The parameters required to create a new subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return subscription Information with the alias.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PutAliasResponseInner create(String aliasName, PutAliasRequest body) {
        return createAsync(aliasName, body).block();
    }

    /**
     * Create Alias Subscription.
     *
     * @param aliasName Alias Name.
     * @param body The parameters required to create a new subscription.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return subscription Information with the alias.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PutAliasResponseInner create(String aliasName, PutAliasRequest body, Context context) {
        return createAsync(aliasName, body, context).block();
    }

    /**
     * Get Alias Subscription.
     *
     * @param aliasName Alias Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return alias Subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PutAliasResponseInner>> getWithResponseAsync(String aliasName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (aliasName == null) {
            return Mono.error(new IllegalArgumentException("Parameter aliasName is required and cannot be null."));
        }
        final String apiVersion = "2020-09-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.get(this.client.getEndpoint(), aliasName, apiVersion, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get Alias Subscription.
     *
     * @param aliasName Alias Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return alias Subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PutAliasResponseInner>> getWithResponseAsync(String aliasName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (aliasName == null) {
            return Mono.error(new IllegalArgumentException("Parameter aliasName is required and cannot be null."));
        }
        final String apiVersion = "2020-09-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), aliasName, apiVersion, accept, context);
    }

    /**
     * Get Alias Subscription.
     *
     * @param aliasName Alias Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return alias Subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PutAliasResponseInner> getAsync(String aliasName) {
        return getWithResponseAsync(aliasName)
            .flatMap(
                (Response<PutAliasResponseInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Get Alias Subscription.
     *
     * @param aliasName Alias Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return alias Subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PutAliasResponseInner get(String aliasName) {
        return getAsync(aliasName).block();
    }

    /**
     * Get Alias Subscription.
     *
     * @param aliasName Alias Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return alias Subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<PutAliasResponseInner> getWithResponse(String aliasName, Context context) {
        return getWithResponseAsync(aliasName, context).block();
    }

    /**
     * Delete Alias.
     *
     * @param aliasName Alias Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> deleteWithResponseAsync(String aliasName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (aliasName == null) {
            return Mono.error(new IllegalArgumentException("Parameter aliasName is required and cannot be null."));
        }
        final String apiVersion = "2020-09-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.delete(this.client.getEndpoint(), aliasName, apiVersion, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Delete Alias.
     *
     * @param aliasName Alias Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> deleteWithResponseAsync(String aliasName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (aliasName == null) {
            return Mono.error(new IllegalArgumentException("Parameter aliasName is required and cannot be null."));
        }
        final String apiVersion = "2020-09-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.delete(this.client.getEndpoint(), aliasName, apiVersion, accept, context);
    }

    /**
     * Delete Alias.
     *
     * @param aliasName Alias Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> deleteAsync(String aliasName) {
        return deleteWithResponseAsync(aliasName).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Delete Alias.
     *
     * @param aliasName Alias Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String aliasName) {
        deleteAsync(aliasName).block();
    }

    /**
     * Delete Alias.
     *
     * @param aliasName Alias Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteWithResponse(String aliasName, Context context) {
        return deleteWithResponseAsync(aliasName, context).block();
    }

    /**
     * Get Alias Subscription.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return alias Subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PutAliasListResultInner>> listWithResponseAsync() {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String apiVersion = "2020-09-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.list(this.client.getEndpoint(), apiVersion, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get Alias Subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return alias Subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<PutAliasListResultInner>> listWithResponseAsync(Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String apiVersion = "2020-09-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.list(this.client.getEndpoint(), apiVersion, accept, context);
    }

    /**
     * Get Alias Subscription.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return alias Subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PutAliasListResultInner> listAsync() {
        return listWithResponseAsync()
            .flatMap(
                (Response<PutAliasListResultInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Get Alias Subscription.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return alias Subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PutAliasListResultInner list() {
        return listAsync().block();
    }

    /**
     * Get Alias Subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return alias Subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<PutAliasListResultInner> listWithResponse(Context context) {
        return listWithResponseAsync(context).block();
    }
}
