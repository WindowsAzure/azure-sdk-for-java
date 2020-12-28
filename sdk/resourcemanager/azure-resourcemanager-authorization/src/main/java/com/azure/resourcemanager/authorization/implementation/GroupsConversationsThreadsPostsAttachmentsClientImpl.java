// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.authorization.fluent.GroupsConversationsThreadsPostsAttachmentsClient;
import com.azure.resourcemanager.authorization.fluent.models.GroupsConversationsThreadsPostsAttachmentsCreateUploadSessionRequestBody;
import com.azure.resourcemanager.authorization.fluent.models.MicrosoftGraphUploadSessionInner;
import com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * GroupsConversationsThreadsPostsAttachmentsClient.
 */
public final class GroupsConversationsThreadsPostsAttachmentsClientImpl
    implements GroupsConversationsThreadsPostsAttachmentsClient {
    private final ClientLogger logger = new ClientLogger(GroupsConversationsThreadsPostsAttachmentsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final GroupsConversationsThreadsPostsAttachmentsService service;

    /** The service client containing this operation class. */
    private final MicrosoftGraphClientImpl client;

    /**
     * Initializes an instance of GroupsConversationsThreadsPostsAttachmentsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    GroupsConversationsThreadsPostsAttachmentsClientImpl(MicrosoftGraphClientImpl client) {
        this.service =
            RestProxy
                .create(
                    GroupsConversationsThreadsPostsAttachmentsService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MicrosoftGraphClientGroupsConversationsThreadsPostsAttachments to be
     * used by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MicrosoftGraphClient")
    private interface GroupsConversationsThreadsPostsAttachmentsService {
        @Headers({"Content-Type: application/json"})
        @Post(
            "/groups/{group-id}/conversations/{conversation-id}/threads/{conversationThread-id}/posts/{post-id}"
                + "/attachments/microsoft.graph.createUploadSession")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(OdataErrorMainException.class)
        Mono<Response<MicrosoftGraphUploadSessionInner>> createUploadSession(
            @HostParam("$host") String endpoint,
            @PathParam("group-id") String groupId,
            @PathParam("conversation-id") String conversationId,
            @PathParam("conversationThread-id") String conversationThreadId,
            @PathParam("post-id") String postId,
            @BodyParam("application/json")
                GroupsConversationsThreadsPostsAttachmentsCreateUploadSessionRequestBody body,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Invoke action createUploadSession.
     *
     * @param groupId key: id of group.
     * @param conversationId key: id of conversation.
     * @param conversationThreadId key: id of conversationThread.
     * @param postId key: id of post.
     * @param body Action parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws OdataErrorMainException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return uploadSession.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<MicrosoftGraphUploadSessionInner>> createUploadSessionWithResponseAsync(
        String groupId,
        String conversationId,
        String conversationThreadId,
        String postId,
        GroupsConversationsThreadsPostsAttachmentsCreateUploadSessionRequestBody body) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (groupId == null) {
            return Mono.error(new IllegalArgumentException("Parameter groupId is required and cannot be null."));
        }
        if (conversationId == null) {
            return Mono.error(new IllegalArgumentException("Parameter conversationId is required and cannot be null."));
        }
        if (conversationThreadId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter conversationThreadId is required and cannot be null."));
        }
        if (postId == null) {
            return Mono.error(new IllegalArgumentException("Parameter postId is required and cannot be null."));
        }
        if (body == null) {
            return Mono.error(new IllegalArgumentException("Parameter body is required and cannot be null."));
        } else {
            body.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .createUploadSession(
                            this.client.getEndpoint(),
                            groupId,
                            conversationId,
                            conversationThreadId,
                            postId,
                            body,
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Invoke action createUploadSession.
     *
     * @param groupId key: id of group.
     * @param conversationId key: id of conversation.
     * @param conversationThreadId key: id of conversationThread.
     * @param postId key: id of post.
     * @param body Action parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws OdataErrorMainException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return uploadSession.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<MicrosoftGraphUploadSessionInner>> createUploadSessionWithResponseAsync(
        String groupId,
        String conversationId,
        String conversationThreadId,
        String postId,
        GroupsConversationsThreadsPostsAttachmentsCreateUploadSessionRequestBody body,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (groupId == null) {
            return Mono.error(new IllegalArgumentException("Parameter groupId is required and cannot be null."));
        }
        if (conversationId == null) {
            return Mono.error(new IllegalArgumentException("Parameter conversationId is required and cannot be null."));
        }
        if (conversationThreadId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter conversationThreadId is required and cannot be null."));
        }
        if (postId == null) {
            return Mono.error(new IllegalArgumentException("Parameter postId is required and cannot be null."));
        }
        if (body == null) {
            return Mono.error(new IllegalArgumentException("Parameter body is required and cannot be null."));
        } else {
            body.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .createUploadSession(
                this.client.getEndpoint(),
                groupId,
                conversationId,
                conversationThreadId,
                postId,
                body,
                accept,
                context);
    }

    /**
     * Invoke action createUploadSession.
     *
     * @param groupId key: id of group.
     * @param conversationId key: id of conversation.
     * @param conversationThreadId key: id of conversationThread.
     * @param postId key: id of post.
     * @param body Action parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws OdataErrorMainException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return uploadSession.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<MicrosoftGraphUploadSessionInner> createUploadSessionAsync(
        String groupId,
        String conversationId,
        String conversationThreadId,
        String postId,
        GroupsConversationsThreadsPostsAttachmentsCreateUploadSessionRequestBody body) {
        return createUploadSessionWithResponseAsync(groupId, conversationId, conversationThreadId, postId, body)
            .flatMap(
                (Response<MicrosoftGraphUploadSessionInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Invoke action createUploadSession.
     *
     * @param groupId key: id of group.
     * @param conversationId key: id of conversation.
     * @param conversationThreadId key: id of conversationThread.
     * @param postId key: id of post.
     * @param body Action parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws OdataErrorMainException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return uploadSession.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public MicrosoftGraphUploadSessionInner createUploadSession(
        String groupId,
        String conversationId,
        String conversationThreadId,
        String postId,
        GroupsConversationsThreadsPostsAttachmentsCreateUploadSessionRequestBody body) {
        return createUploadSessionAsync(groupId, conversationId, conversationThreadId, postId, body).block();
    }

    /**
     * Invoke action createUploadSession.
     *
     * @param groupId key: id of group.
     * @param conversationId key: id of conversation.
     * @param conversationThreadId key: id of conversationThread.
     * @param postId key: id of post.
     * @param body Action parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws OdataErrorMainException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return uploadSession.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<MicrosoftGraphUploadSessionInner> createUploadSessionWithResponse(
        String groupId,
        String conversationId,
        String conversationThreadId,
        String postId,
        GroupsConversationsThreadsPostsAttachmentsCreateUploadSessionRequestBody body,
        Context context) {
        return createUploadSessionWithResponseAsync(
                groupId, conversationId, conversationThreadId, postId, body, context)
            .block();
    }
}
