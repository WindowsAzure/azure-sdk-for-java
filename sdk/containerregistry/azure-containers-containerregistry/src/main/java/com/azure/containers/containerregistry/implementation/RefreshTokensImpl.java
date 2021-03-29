// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry.implementation;

import com.azure.containers.containerregistry.implementation.models.AcrErrorsException;
import com.azure.containers.containerregistry.implementation.models.Paths108HwamOauth2ExchangePostRequestbodyContentApplicationXWwwFormUrlencodedSchema;
import com.azure.containers.containerregistry.implementation.models.RefreshToken;
import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in RefreshTokens. */
public final class RefreshTokensImpl {
    /** The proxy service used to perform REST calls. */
    private final RefreshTokensService service;

    /** The service client containing this operation class. */
    private final ContainerRegistryImpl client;

    /**
     * Initializes an instance of RefreshTokensImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    RefreshTokensImpl(ContainerRegistryImpl client) {
        this.service =
                RestProxy.create(RefreshTokensService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ContainerRegistryRefreshTokens to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "ContainerRegistryRef")
    public interface RefreshTokensService {
        // @Multipart not supported by RestProxy
        @Post("/oauth2/exchange")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(AcrErrorsException.class)
        Mono<Response<RefreshToken>> getFromExchange(
                @HostParam("endpoint") String endpoint,
                @BodyParam("application/x-www-form-urlencoded")
                        Paths108HwamOauth2ExchangePostRequestbodyContentApplicationXWwwFormUrlencodedSchema accessToken,
                @HeaderParam("Accept") String accept,
                Context context);
    }

    /**
     * Exchange AAD tokens for an ACR refresh Token.
     *
     * @param accessToken The accessToken parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws AcrErrorsException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RefreshToken>> getFromExchangeWithResponseAsync(
            Paths108HwamOauth2ExchangePostRequestbodyContentApplicationXWwwFormUrlencodedSchema accessToken) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context -> service.getFromExchange(this.client.getEndpoint(), accessToken, accept, context));
    }

    /**
     * Exchange AAD tokens for an ACR refresh Token.
     *
     * @param accessToken The accessToken parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws AcrErrorsException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RefreshToken>> getFromExchangeWithResponseAsync(
            Paths108HwamOauth2ExchangePostRequestbodyContentApplicationXWwwFormUrlencodedSchema accessToken,
            Context context) {
        final String accept = "application/json";
        return service.getFromExchange(this.client.getEndpoint(), accessToken, accept, context);
    }

    /**
     * Exchange AAD tokens for an ACR refresh Token.
     *
     * @param accessToken The accessToken parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws AcrErrorsException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RefreshToken> getFromExchangeAsync(
            Paths108HwamOauth2ExchangePostRequestbodyContentApplicationXWwwFormUrlencodedSchema accessToken) {
        return getFromExchangeWithResponseAsync(accessToken)
                .flatMap(
                        (Response<RefreshToken> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Exchange AAD tokens for an ACR refresh Token.
     *
     * @param accessToken The accessToken parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws AcrErrorsException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RefreshToken> getFromExchangeAsync(
            Paths108HwamOauth2ExchangePostRequestbodyContentApplicationXWwwFormUrlencodedSchema accessToken,
            Context context) {
        return getFromExchangeWithResponseAsync(accessToken, context)
                .flatMap(
                        (Response<RefreshToken> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }
}
