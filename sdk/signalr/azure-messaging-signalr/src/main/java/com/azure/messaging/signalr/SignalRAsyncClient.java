// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.signalr;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.messaging.signalr.implementation.client.AzureWebSocketServiceRestAPI;
import com.azure.messaging.signalr.implementation.client.WebSocketConnectionApis;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static com.azure.core.util.tracing.Tracer.AZ_TRACING_NAMESPACE_KEY;

/**
 * Client for connecting to a SignalR hub.
 */
@ServiceClient(
    builder = SignalRClientBuilder.class,
    isAsync = true
//    serviceInterfaces = WebSocketConnectionApisService.class // TODO (jgiles) private interface, can't set it
)
public final class SignalRAsyncClient {
    static final String SIGNALR_TRACING_NAMESPACE_VALUE = "Microsoft.SignalRService";

    private final ClientLogger logger = new ClientLogger(SignalRAsyncClient.class);

    private final AzureWebSocketServiceRestAPI innerClient;
    private final WebSocketConnectionApis api;

    // The name of the hub this client is connected to
    private final String hub;

    // The SignalR API version being used by this client
    private final SignalRServiceVersion serviceVersion;

    // package-private (instantiated through builder)
    SignalRAsyncClient(final AzureWebSocketServiceRestAPI innerClient,
                       final String hub,
                       final SignalRServiceVersion serviceVersion) {
        this.innerClient = innerClient;
        this.api = innerClient.getWebSocketConnectionApis();
        this.hub = hub;
        this.serviceVersion = serviceVersion;
    }

    // TODO (jgiles) this is a nicer pattern than what we have in existing client libraries
    static Context configureTracing(final Context context) {
        return (context == null ? Context.NONE : context)
           .addData(AZ_TRACING_NAMESPACE_KEY, SIGNALR_TRACING_NAMESPACE_VALUE);
    }

    /**
     * Creates a new client for connecting to a specified SignalR group.
     *
     * @param group The name of the group.
     * @return A new client for connecting to a specified SignalR group.
     */
    public SignalRGroupAsyncClient getGroupAsyncClient(final String group) {
        return new SignalRGroupAsyncClient(innerClient, hub, group);
    }

    /**
     * Returns whether the service is considered healthy.
     * @return whether the service is considered healthy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SignalRHubStatus> getStatus() {
        return innerClient.getHealthApis()
                   .headIndexWithResponseAsync(Context.NONE)// TODO (jgiles) we should introduce a withResponse overload
                   .map(SignalRHubStatus::new);
    }

    /**
     * Broadcast a text message to all connections on this hub.
     *
     * @param message The message to send.
     * @param excludedConnectionIds An optional var-args of connection IDs to not broadcast the message to.
     * @return A {@link Mono} containing a {@link Response} with a null value, but status code and response headers
     *      representing the response from the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> sendToAll(final String message, final String... excludedConnectionIds) {
        return sendToAll(message,
            excludedConnectionIds == null ? Collections.emptyList() : Arrays.asList(excludedConnectionIds),
            Context.NONE);
    }

    /**
     * Broadcast a text message to all connections on this hub.
     *
     * @param message The message to send.
     * @param excludedConnectionIds An optional list of connection IDs to not broadcast the message to.
     * @return A {@link Mono} containing a {@link Response} with a null value, but status code and response headers
     *      representing the response from the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> sendToAll(final String message, final List<String> excludedConnectionIds) {
        return sendToAll(message, excludedConnectionIds, Context.NONE);
    }

    // package-private
    Mono<Response<Void>> sendToAll(final String data, final List<String> excludedUsers, Context context) {
        context = configureTracing(context);
        return (hub == null
                    ? api.postDefaultHubBroadcastWithResponseAsync(data, excludedUsers, context)
                    : api.postBroadcastWithResponseAsync(hub, data, excludedUsers, context))
           .doOnSubscribe(ignoredValue -> logger.info("Broadcasting message '{}'", data))
           .doOnSuccess(response -> logger.info("Broadcasted message: '{}', response: {}", data, response.getValue()))
           .doOnError(error -> logger.warning("Failed to broadcast message '{}', response: {}", data, error));
    }

    /**
     * Broadcast a binary message to all connections on this hub.
     *
     * @param message The message to send.
     * @param excludedConnectionIds An optional var-args of connection IDs to not broadcast the message to.
     * @return A {@link Mono} containing a {@link Response} with a null value, but status code and response headers
     *      representing the response from the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> sendToAll(final byte[] message, final String... excludedConnectionIds) {
        return sendToAll(message,
            excludedConnectionIds == null ? Collections.emptyList() : Arrays.asList(excludedConnectionIds),
            Context.NONE);
    }

    /**
     * Broadcast a binary message to all connections on this hub.
     *
     * @param message The message to send.
     * @param excludedConnectionIds An optional list of connection IDs to not broadcast the message to.
     * @return A {@link Mono} containing a {@link Response} with a null value, but status code and response headers
     *      representing the response from the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> sendToAll(final byte[] message, final List<String> excludedConnectionIds) {
        return sendToAll(message, excludedConnectionIds, Context.NONE);
    }

    // package-private
    Mono<Response<Void>> sendToAll(final byte[] message,
                                   final List<String> excludedConnectionIds,
                                   Context context) {
        final Flux<ByteBuffer> byteFlux = Flux.just(ByteBuffer.wrap(message));
        context = configureTracing(context);

        return (hub == null
                ? api.postDefaultHubBroadcastWithResponseAsync(byteFlux, message.length, excludedConnectionIds, context)
                : api.postBroadcastWithResponseAsync(hub, byteFlux, message.length, excludedConnectionIds, context))
           .doOnSubscribe(ignoredValue -> logger.info("Broadcasting binary data"))
           .doOnSuccess(response -> logger.info("Broadcasted binary data, response: {}", response.getValue()))
           .doOnError(error -> logger.warning("Failed to broadcast binary data, response: {}", error));
    }

    /**
     * Send a text message to a specific user.
     *
     * @param userId User name to send to.
     * @param message The message to send.
     * @return A {@link Mono} containing a {@link Response} with a null value, but status code and response headers
     *      representing the response from the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> sendToUser(final String userId, final String message) {
        return sendToUser(userId, message, Context.NONE);
    }

    // package-private
    Mono<Response<Void>> sendToUser(final String userId, final String message, Context context) {
        context = configureTracing(context);
        return (hub == null
                ? api.postSendToDefaultHubUserWithResponseAsync(userId, message, context)
                : api.postSendToUserWithResponseAsync(hub, userId, message, context))
           .doOnSubscribe(ignoredValue -> logger.info("Sending to user '{}' message: '{}'", userId, message))
           .doOnSuccess(response -> logger.info("Sent to user '{}' message: '{}', response: {}",
               userId, message, response.getValue()))
           .doOnError(error -> logger.warning("Failed to send message '{}' to user '{}', response: {}",
               message, userId, error));
    }

    /**
     * Send a binary message to a specific user.
     *
     * @param userId User name to send to.
     * @param message The binary message to send.
     * @return A {@link Mono} containing a {@link Response} with a null value, but status code and response headers
     *      representing the response from the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> sendToUser(final String userId, final byte[] message) {
        return sendToUser(userId, message, Context.NONE);
    }

    // package-private
    Mono<Response<Void>> sendToUser(final String userId, final byte[] message, Context context) {
        final Flux<ByteBuffer> byteFlux = Flux.just(ByteBuffer.wrap(message));
        context = configureTracing(context);
        return (hub == null
                ? api.postSendToDefaultHubUserWithResponseAsync(userId, byteFlux, message.length, context)
                : api.postSendToUserWithResponseAsync(hub, userId, byteFlux, message.length, context))
           .doOnSubscribe(ignoredValue -> logger.info("Sending binary data to user"))
           .doOnSuccess(response -> logger.info("Sent binary data to user, response: {}", response.getValue()))
           .doOnError(error -> logger.warning("Failed to send binary data to user, response: {}", error));
    }

    /**
     * Send a message to a specific connection
     *
     * @param connectionId Connection ID to send to.
     * @param message The message to send.
     * @return A {@link Mono} containing a {@link Response} with a null value, but status code and response headers
     *      representing the response from the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> sendToConnection(final String connectionId, final String message) {
        return sendToConnection(connectionId, message, Context.NONE);
    }

    // package-private
    Mono<Response<Void>> sendToConnection(final String connectionId, final String message, Context context) {
        context = configureTracing(context);
        return (hub == null
                ? api.postSendToDefaultHubConnectionWithResponseAsync(connectionId, message, context)
                : api.postSendToConnectionWithResponseAsync(hub, connectionId, message, context))
           .doOnSubscribe(ignoredValue ->
               logger.info("Sending to connection '{}' message: '{}'", connectionId, message))
           .doOnSuccess(response ->
               logger.info("Sent to connection '{}' message: '{}', response: {}",
                   connectionId, message, response.getValue()))
           .doOnError(error ->
               logger.warning("Failed to send message '{}' to connection '{}', response: {}",
                   message, connectionId, error));
    }

    /**
     * Send a binary message to a specific connection
     *
     * @param connectionId Connection ID to send to.
     * @param message The binary message to send.
     * @return A {@link Mono} containing a {@link Response} with a null value, but status code and response headers
     *      representing the response from the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> sendToConnection(final String connectionId, final byte[] message) {
        return sendToConnectionWithResponse(connectionId, message, Context.NONE);
    }

    // package-private
    Mono<Response<Void>> sendToConnectionWithResponse(final String connectionId,
                                                      final byte[] message,
                                                      Context context) {
        final Flux<ByteBuffer> byteFlux = Flux.just(ByteBuffer.wrap(message));
        context = configureTracing(context);
        return (hub == null
                ? api.postSendToDefaultHubConnectionWithResponseAsync(connectionId, byteFlux, message.length, context)
                : api.postSendToConnectionWithResponseAsync(hub, connectionId, byteFlux, message.length, context))
           .doOnSubscribe(ignoredValue -> logger.info("Sending binary message to connection"))
           .doOnSuccess(response -> logger.info("Sent binary message to connection, response: {}", response.getValue()))
           .doOnError(error -> logger.warning("Failed to send binary message to connection, response: {}", error));
    }

    /**
     * Remove a specific user from all groups they are joined to.
     *
     * @param userId The user ID to remove from all groups.
     * @return A {@link Mono} containing a {@link Response} with a null value, but status code and response headers
     *      representing the response from the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> removeUserFromAllGroups(final String userId) {
        return removeUserFromAllGroups(userId, Context.NONE);
    }

    // package-private
    Mono<Response<Void>> removeUserFromAllGroups(final String userId, Context context) {
        context = configureTracing(context);
        return (hub == null
                ? api.deleteRemoveUserFromAllDefaultHubGroupsWithResponseAsync(userId, context)
                : api.deleteRemoveUserFromAllGroupsWithResponseAsync(hub, userId, context))
           .doOnSubscribe(ignoredValue -> logger.info("Removing user '{}' from all groups"))
           .doOnSuccess(response -> logger.info("Removed user '{}' from all groups, response: {}", response.getValue()))
           .doOnError(error -> logger.warning("Failed to remove user '{}' from all groups, response: {}", error));
    }

    /**
     * Check if a particular user is connected to this hub.
     *
     * @param userId The user name to check for.
     * @return A {@link Mono} containing a {@link Response} with a Boolean value representing whether the user exists in
     *      this hub, as well as status code and response headers representing the response from the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Boolean> userExists(final String userId) {
        return userExistsWithResponse(userId).map(Response::getValue);
    }

    /**
     * Check if a particular user is connected to this hub.
     *
     * @param userId The user name to check for.
     * @return A {@link Mono} containing a {@link Response} with a Boolean value representing whether the user exists in
     *      this hub, as well as status code and response headers representing the response from the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Boolean>> userExistsWithResponse(final String userId) {
        return userExistsWithResponse(userId, Context.NONE);
    }

    // package-private
    Mono<Response<Boolean>> userExistsWithResponse(final String userId, Context context) {
        context = configureTracing(context);
        return (hub == null
                ? api.headCheckDefaultHubUserExistenceWithResponseAsync(userId, context)
                : api.headCheckUserExistenceWithResponseAsync(hub, userId, context))
           .doOnSubscribe(ignoredValue -> logger.info("Checking if user '{}' exists", userId))
           .doOnSuccess(response -> logger.info("Checked if user '{}' exists, response: {}",
               userId, response.getValue()))
           .doOnError(error -> logger.warning("Failed to check if user '{}' exists, response: {}", userId, error));
    }

    /**
     * Check if a particular group exists (i.e. has active connections).
     *
     * @param group The group name to check for.
     * @return A {@link Mono} containing a {@link Response} with a Boolean value representing whether the group exists,
     *      as well as status code and response headers representing the response from the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Boolean> groupExists(final String group) {
        return groupExistsWithResponse(group).map(Response::getValue);
    }

    /**
     * Check if a particular group exists (i.e. has active connections).
     *
     * @param group The group name to check for.
     * @return A {@link Mono} containing a {@link Response} with a Boolean value representing whether the group exists,
     *      as well as status code and response headers representing the response from the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Boolean>> groupExistsWithResponse(final String group) {
        return groupExistsWithResponse(group, Context.NONE);
    }

    // package-private
    Mono<Response<Boolean>> groupExistsWithResponse(final String group, Context context) {
        context = configureTracing(context);
        return (hub == null
                ? api.headCheckDefaultHubUserExistenceWithResponseAsync(group, context)
                : api.headCheckUserExistenceWithResponseAsync(hub, group, context))
           .doOnSubscribe(ignoredValue -> logger.info("Checking if group '{}' exists", group))
           .doOnSuccess(response -> logger.info("Checked if group '{}' exists, response: {}",
               group, response.getValue()))
           .doOnError(error -> logger.warning("Failed to check if group '{}' exists, response: {}", group, error));
    }

    /**
     * Close a specific connection to this hub.
     *
     * @param connectionId Connection ID to close.
     * @return A {@link Mono} containing a {@link Response} with a null value, but status code and response headers
     *      representing the response from the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> closeConnection(final String connectionId) {
        return closeConnection(connectionId, null);
    }

    /**
     * Close a specific connection to this hub.
     *
     * @param connectionId Connection ID to close.
     * @param reason The reason why the connection was closed.
     * @return A {@link Mono} containing a {@link Response} with a null value, but status code and response headers
     *      representing the response from the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> closeConnection(final String connectionId, final String reason) {
        return closeConnectionWithResponse(connectionId, reason, Context.NONE);
    }

    // package-private
    Mono<Response<Void>> closeConnectionWithResponse(final String connectionId,
                                                     final String reason,
                                                     Context context) {
        context = configureTracing(context);
        return (hub == null
                ? api.deleteCloseDefaultHubClientConnectionWithResponseAsync(connectionId, reason, context)
                : api.deleteCloseClientConnectionWithResponseAsync(hub, connectionId, reason, context))
           .doOnSubscribe(ignoredValue -> logger.info("Closing connection {}", connectionId))
           .doOnSuccess(response -> logger.info("Closed connection {}, response: {}",
               connectionId, response.getValue()))
           .doOnError(error -> logger.warning("Failed to close connection {}, response: {}", connectionId, error));
    }

    /**
     * Check if a specific connection is connected to this hub.
     *
     * @param connectionId Connection ID to check.
     * @return A {@link Mono} containing a {@link Response} with a Boolean value representing whether the connection
     *     exists in this hub, as well as status code and response headers representing the response from the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Boolean> connectionExists(final String connectionId) {
        return connectionExistsWithResponse(connectionId).map(Response::getValue);
    }

    /**
     * Check if a specific connection is connected to this hub.
     *
     * @param connectionId Connection ID to check.
     * @return A {@link Mono} containing a {@link Response} with a Boolean value representing whether the connection
     *     exists in this hub, as well as status code and response headers representing the response from the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Boolean>> connectionExistsWithResponse(final String connectionId) {
        return connectionExistsWithResponse(connectionId, Context.NONE);
    }

    // package-private
    Mono<Response<Boolean>> connectionExistsWithResponse(final String connectionId, Context context) {
        context = configureTracing(context);
        return (hub == null
                ? api.headCheckDefaultHubConnectionExistenceWithResponseAsync(connectionId, context)
                : api.headCheckConnectionExistenceWithResponseAsync(hub, connectionId, context))
           .doOnSubscribe(ignoredValue -> logger.info("Checking if connection '{}' exists", connectionId))
           .doOnSuccess(response -> logger.info("Checked if connection '{}' exists, response: {}",
               connectionId, response.getValue()))
           .doOnError(error -> logger.warning("Failed to check if connection '{}' exists, response: {}",
               connectionId, error));
    }
}
