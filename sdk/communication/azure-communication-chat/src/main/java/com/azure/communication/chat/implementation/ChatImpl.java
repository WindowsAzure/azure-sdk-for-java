// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.chat.implementation;

import com.azure.communication.chat.implementation.models.ChatThread;
import com.azure.communication.chat.implementation.models.ChatThreadsInfoCollection;
import com.azure.communication.chat.implementation.models.CreateChatThreadOptions;
import com.azure.communication.chat.implementation.models.CreateChatThreadResult;
import com.azure.communication.chat.models.ChatThreadInfo;
import com.azure.communication.chat.models.CommunicationErrorResponseException;
import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
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
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import java.time.OffsetDateTime;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Chats. */
public final class ChatImpl {
    /** The proxy service used to perform REST calls. */
    private final ChatsService service;

    /** The service client containing this operation class. */
    private final AzureCommunicationChatServiceImpl client;

    /**
     * Initializes an instance of ChatsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ChatImpl(AzureCommunicationChatServiceImpl client) {
        this.service = RestProxy.create(ChatsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureCommunicationChatServiceChats to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "AzureCommunicationCh")
    private interface ChatsService {
        @Post("/chat/threads")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(CommunicationErrorResponseException.class)
        Mono<Response<CreateChatThreadResult>> createChatThread(
            @HostParam("endpoint") String endpoint,
            @HeaderParam("repeatability-Request-Id") String repeatabilityRequestId,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") CreateChatThreadOptions createChatThreadRequest,
            @HeaderParam("Accept") String accept,
            Context context);

        @Get("/chat/threads")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CommunicationErrorResponseException.class)
        Mono<Response<ChatThreadsInfoCollection>> listChatThreads(
            @HostParam("endpoint") String endpoint,
            @QueryParam("maxPageSize") Integer maxPageSize,
            @QueryParam("startTime") OffsetDateTime startTime,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Get("/chat/threads/{chatThreadId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CommunicationErrorResponseException.class)
        Mono<Response<ChatThread>> getChatThread(
            @HostParam("endpoint") String endpoint,
            @PathParam("chatThreadId") String chatThreadId,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Delete("/chat/threads/{chatThreadId}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(CommunicationErrorResponseException.class)
        Mono<Response<Void>> deleteChatThread(
            @HostParam("endpoint") String endpoint,
            @PathParam("chatThreadId") String chatThreadId,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CommunicationErrorResponseException.class)
        Mono<Response<ChatThreadsInfoCollection>> listChatThreadsNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("endpoint") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Creates a chat thread.
     *
     * @param createChatThreadRequest Request payload for creating a chat thread.
     * @param repeatabilityRequestId If specified, the client directs that the request is repeatable; that is, that the
     *     client can make the request multiple times with the same Repeatability-Request-Id and get back an appropriate
     *     response without the server executing the request multiple times. The value of the Repeatability-Request-Id
     *     is an opaque string representing a client-generated, globally unique for all time, identifier for the
     *     request. It is recommended to use version 4 (random) UUIDs.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the create chat thread operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<CreateChatThreadResult>> createChatThreadWithResponseAsync(
        CreateChatThreadOptions createChatThreadRequest, String repeatabilityRequestId) {
        final String accept = "application/json";
        return FluxUtil.withContext(
            context ->
                service.createChatThread(
                    this.client.getEndpoint(),
                    repeatabilityRequestId,
                    this.client.getApiVersion(),
                    createChatThreadRequest,
                    accept,
                    context));
    }

    /**
     * Creates a chat thread.
     *
     * @param createChatThreadRequest Request payload for creating a chat thread.
     * @param repeatabilityRequestId If specified, the client directs that the request is repeatable; that is, that the
     *     client can make the request multiple times with the same Repeatability-Request-Id and get back an appropriate
     *     response without the server executing the request multiple times. The value of the Repeatability-Request-Id
     *     is an opaque string representing a client-generated, globally unique for all time, identifier for the
     *     request. It is recommended to use version 4 (random) UUIDs.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the create chat thread operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<CreateChatThreadResult>> createChatThreadWithResponseAsync(
        CreateChatThreadOptions createChatThreadRequest, String repeatabilityRequestId, Context context) {
        final String accept = "application/json";
        return service.createChatThread(
            this.client.getEndpoint(),
            repeatabilityRequestId,
            this.client.getApiVersion(),
            createChatThreadRequest,
            accept,
            context);
    }

    /**
     * Creates a chat thread.
     *
     * @param createChatThreadRequest Request payload for creating a chat thread.
     * @param repeatabilityRequestId If specified, the client directs that the request is repeatable; that is, that the
     *     client can make the request multiple times with the same Repeatability-Request-Id and get back an appropriate
     *     response without the server executing the request multiple times. The value of the Repeatability-Request-Id
     *     is an opaque string representing a client-generated, globally unique for all time, identifier for the
     *     request. It is recommended to use version 4 (random) UUIDs.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the create chat thread operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CreateChatThreadResult> createChatThreadAsync(
        CreateChatThreadOptions createChatThreadRequest, String repeatabilityRequestId) {
        return createChatThreadWithResponseAsync(createChatThreadRequest, repeatabilityRequestId)
            .flatMap(
                (Response<CreateChatThreadResult> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Creates a chat thread.
     *
     * @param createChatThreadRequest Request payload for creating a chat thread.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the create chat thread operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CreateChatThreadResult> createChatThreadAsync(CreateChatThreadOptions createChatThreadRequest) {
        final String repeatabilityRequestId = null;
        return createChatThreadWithResponseAsync(createChatThreadRequest, repeatabilityRequestId)
            .flatMap(
                (Response<CreateChatThreadResult> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Creates a chat thread.
     *
     * @param createChatThreadRequest Request payload for creating a chat thread.
     * @param repeatabilityRequestId If specified, the client directs that the request is repeatable; that is, that the
     *     client can make the request multiple times with the same Repeatability-Request-Id and get back an appropriate
     *     response without the server executing the request multiple times. The value of the Repeatability-Request-Id
     *     is an opaque string representing a client-generated, globally unique for all time, identifier for the
     *     request. It is recommended to use version 4 (random) UUIDs.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the create chat thread operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CreateChatThreadResult> createChatThreadAsync(
        CreateChatThreadOptions createChatThreadRequest, String repeatabilityRequestId, Context context) {
        return createChatThreadWithResponseAsync(createChatThreadRequest, repeatabilityRequestId, context)
            .flatMap(
                (Response<CreateChatThreadResult> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Creates a chat thread.
     *
     * @param createChatThreadRequest Request payload for creating a chat thread.
     * @param repeatabilityRequestId If specified, the client directs that the request is repeatable; that is, that the
     *     client can make the request multiple times with the same Repeatability-Request-Id and get back an appropriate
     *     response without the server executing the request multiple times. The value of the Repeatability-Request-Id
     *     is an opaque string representing a client-generated, globally unique for all time, identifier for the
     *     request. It is recommended to use version 4 (random) UUIDs.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the create chat thread operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CreateChatThreadResult createChatThread(
        CreateChatThreadOptions createChatThreadRequest, String repeatabilityRequestId) {
        return createChatThreadAsync(createChatThreadRequest, repeatabilityRequestId).block();
    }

    /**
     * Creates a chat thread.
     *
     * @param createChatThreadRequest Request payload for creating a chat thread.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the create chat thread operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CreateChatThreadResult createChatThread(CreateChatThreadOptions createChatThreadRequest) {
        final String repeatabilityRequestId = null;
        return createChatThreadAsync(createChatThreadRequest, repeatabilityRequestId).block();
    }

    /**
     * Creates a chat thread.
     *
     * @param createChatThreadRequest Request payload for creating a chat thread.
     * @param repeatabilityRequestId If specified, the client directs that the request is repeatable; that is, that the
     *     client can make the request multiple times with the same Repeatability-Request-Id and get back an appropriate
     *     response without the server executing the request multiple times. The value of the Repeatability-Request-Id
     *     is an opaque string representing a client-generated, globally unique for all time, identifier for the
     *     request. It is recommended to use version 4 (random) UUIDs.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the create chat thread operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<CreateChatThreadResult> createChatThreadWithResponse(
        CreateChatThreadOptions createChatThreadRequest, String repeatabilityRequestId, Context context) {
        return createChatThreadWithResponseAsync(createChatThreadRequest, repeatabilityRequestId, context).block();
    }

    /**
     * Gets the list of chat threads of a user.
     *
     * @param maxPageSize The maximum number of chat threads returned per page.
     * @param startTime The earliest point in time to get chat threads up to. The timestamp should be in RFC3339 format:
     *     `yyyy-MM-ddTHH:mm:ssZ`.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of chat threads of a user.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ChatThreadInfo>> listChatThreadsSinglePageAsync(
        Integer maxPageSize, OffsetDateTime startTime) {
        final String accept = "application/json";
        return FluxUtil.withContext(
            context ->
                service.listChatThreads(
                    this.client.getEndpoint(),
                    maxPageSize,
                    startTime,
                    this.client.getApiVersion(),
                    accept,
                    context))
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().getValue(),
                        res.getValue().getNextLink(),
                        null));
    }

    /**
     * Gets the list of chat threads of a user.
     *
     * @param maxPageSize The maximum number of chat threads returned per page.
     * @param startTime The earliest point in time to get chat threads up to. The timestamp should be in RFC3339 format:
     *     `yyyy-MM-ddTHH:mm:ssZ`.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of chat threads of a user.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ChatThreadInfo>> listChatThreadsSinglePageAsync(
        Integer maxPageSize, OffsetDateTime startTime, Context context) {
        final String accept = "application/json";
        return service.listChatThreads(
            this.client.getEndpoint(), maxPageSize, startTime, this.client.getApiVersion(), accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().getValue(),
                        res.getValue().getNextLink(),
                        null));
    }

    /**
     * Gets the list of chat threads of a user.
     *
     * @param maxPageSize The maximum number of chat threads returned per page.
     * @param startTime The earliest point in time to get chat threads up to. The timestamp should be in RFC3339 format:
     *     `yyyy-MM-ddTHH:mm:ssZ`.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of chat threads of a user.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ChatThreadInfo> listChatThreadsAsync(Integer maxPageSize, OffsetDateTime startTime) {
        return new PagedFlux<>(
            () -> listChatThreadsSinglePageAsync(maxPageSize, startTime),
            nextLink -> listChatThreadsNextSinglePageAsync(nextLink));
    }

    /**
     * Gets the list of chat threads of a user.
     *
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of chat threads of a user.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ChatThreadInfo> listChatThreadsAsync() {
        final Integer maxPageSize = null;
        final OffsetDateTime startTime = null;
        return new PagedFlux<>(
            () -> listChatThreadsSinglePageAsync(maxPageSize, startTime),
            nextLink -> listChatThreadsNextSinglePageAsync(nextLink));
    }

    /**
     * Gets the list of chat threads of a user.
     *
     * @param maxPageSize The maximum number of chat threads returned per page.
     * @param startTime The earliest point in time to get chat threads up to. The timestamp should be in RFC3339 format:
     *     `yyyy-MM-ddTHH:mm:ssZ`.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of chat threads of a user.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ChatThreadInfo> listChatThreadsAsync(
        Integer maxPageSize, OffsetDateTime startTime, Context context) {
        return new PagedFlux<>(
            () -> listChatThreadsSinglePageAsync(maxPageSize, startTime, context),
            nextLink -> listChatThreadsNextSinglePageAsync(nextLink, context));
    }

    /**
     * Gets the list of chat threads of a user.
     *
     * @param maxPageSize The maximum number of chat threads returned per page.
     * @param startTime The earliest point in time to get chat threads up to. The timestamp should be in RFC3339 format:
     *     `yyyy-MM-ddTHH:mm:ssZ`.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of chat threads of a user.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ChatThreadInfo> listChatThreads(Integer maxPageSize, OffsetDateTime startTime) {
        return new PagedIterable<>(listChatThreadsAsync(maxPageSize, startTime));
    }

    /**
     * Gets the list of chat threads of a user.
     *
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of chat threads of a user.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ChatThreadInfo> listChatThreads() {
        final Integer maxPageSize = null;
        final OffsetDateTime startTime = null;
        return new PagedIterable<>(listChatThreadsAsync(maxPageSize, startTime));
    }

    /**
     * Gets the list of chat threads of a user.
     *
     * @param maxPageSize The maximum number of chat threads returned per page.
     * @param startTime The earliest point in time to get chat threads up to. The timestamp should be in RFC3339 format:
     *     `yyyy-MM-ddTHH:mm:ssZ`.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of chat threads of a user.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ChatThreadInfo> listChatThreads(
        Integer maxPageSize, OffsetDateTime startTime, Context context) {
        return new PagedIterable<>(listChatThreadsAsync(maxPageSize, startTime, context));
    }

    /**
     * Gets a chat thread.
     *
     * @param chatThreadId Id of the thread.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a chat thread.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ChatThread>> getChatThreadWithResponseAsync(String chatThreadId) {
        final String accept = "application/json";
        return FluxUtil.withContext(
            context ->
                service.getChatThread(
                    this.client.getEndpoint(), chatThreadId, this.client.getApiVersion(), accept, context));
    }

    /**
     * Gets a chat thread.
     *
     * @param chatThreadId Id of the thread.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a chat thread.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ChatThread>> getChatThreadWithResponseAsync(String chatThreadId, Context context) {
        final String accept = "application/json";
        return service.getChatThread(
            this.client.getEndpoint(), chatThreadId, this.client.getApiVersion(), accept, context);
    }

    /**
     * Gets a chat thread.
     *
     * @param chatThreadId Id of the thread.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a chat thread.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ChatThread> getChatThreadAsync(String chatThreadId) {
        return getChatThreadWithResponseAsync(chatThreadId)
            .flatMap(
                (Response<ChatThread> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets a chat thread.
     *
     * @param chatThreadId Id of the thread.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a chat thread.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ChatThread> getChatThreadAsync(String chatThreadId, Context context) {
        return getChatThreadWithResponseAsync(chatThreadId, context)
            .flatMap(
                (Response<ChatThread> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets a chat thread.
     *
     * @param chatThreadId Id of the thread.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a chat thread.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ChatThread getChatThread(String chatThreadId) {
        return getChatThreadAsync(chatThreadId).block();
    }

    /**
     * Gets a chat thread.
     *
     * @param chatThreadId Id of the thread.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a chat thread.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ChatThread> getChatThreadWithResponse(String chatThreadId, Context context) {
        return getChatThreadWithResponseAsync(chatThreadId, context).block();
    }

    /**
     * Deletes a thread.
     *
     * @param chatThreadId Id of the thread to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteChatThreadWithResponseAsync(String chatThreadId) {
        final String accept = "application/json";
        return FluxUtil.withContext(
            context ->
                service.deleteChatThread(
                    this.client.getEndpoint(), chatThreadId, this.client.getApiVersion(), accept, context));
    }

    /**
     * Deletes a thread.
     *
     * @param chatThreadId Id of the thread to be deleted.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteChatThreadWithResponseAsync(String chatThreadId, Context context) {
        final String accept = "application/json";
        return service.deleteChatThread(
            this.client.getEndpoint(), chatThreadId, this.client.getApiVersion(), accept, context);
    }

    /**
     * Deletes a thread.
     *
     * @param chatThreadId Id of the thread to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteChatThreadAsync(String chatThreadId) {
        return deleteChatThreadWithResponseAsync(chatThreadId).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes a thread.
     *
     * @param chatThreadId Id of the thread to be deleted.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteChatThreadAsync(String chatThreadId, Context context) {
        return deleteChatThreadWithResponseAsync(chatThreadId, context).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes a thread.
     *
     * @param chatThreadId Id of the thread to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void deleteChatThread(String chatThreadId) {
        deleteChatThreadAsync(chatThreadId).block();
    }

    /**
     * Deletes a thread.
     *
     * @param chatThreadId Id of the thread to be deleted.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteChatThreadWithResponse(String chatThreadId, Context context) {
        return deleteChatThreadWithResponseAsync(chatThreadId, context).block();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of chat threads.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ChatThreadInfo>> listChatThreadsNextSinglePageAsync(String nextLink) {
        final String accept = "application/json";
        return FluxUtil.withContext(
            context -> service.listChatThreadsNext(nextLink, this.client.getEndpoint(), accept, context))
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().getValue(),
                        res.getValue().getNextLink(),
                        null));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of chat threads.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ChatThreadInfo>> listChatThreadsNextSinglePageAsync(String nextLink, Context context) {
        final String accept = "application/json";
        return service.listChatThreadsNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().getValue(),
                        res.getValue().getNextLink(),
                        null));
    }
}
