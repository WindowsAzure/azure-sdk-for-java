// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
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
import com.azure.resourcemanager.authorization.fluent.GroupsOnenoteNotebooksClient;
import com.azure.resourcemanager.authorization.fluent.models.GroupsOnenoteNotebooksCopyNotebookRequestBody;
import com.azure.resourcemanager.authorization.fluent.models.GroupsOnenoteNotebooksGetNotebookFromWebUrlRequestBody;
import com.azure.resourcemanager.authorization.fluent.models.MicrosoftGraphCopyNotebookModelInner;
import com.azure.resourcemanager.authorization.fluent.models.MicrosoftGraphOnenoteOperationInner;
import com.azure.resourcemanager.authorization.fluent.models.MicrosoftGraphRecentNotebookInner;
import com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException;
import java.util.List;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in GroupsOnenoteNotebooksClient. */
public final class GroupsOnenoteNotebooksClientImpl implements GroupsOnenoteNotebooksClient {
    private final ClientLogger logger = new ClientLogger(GroupsOnenoteNotebooksClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final GroupsOnenoteNotebooksService service;

    /** The service client containing this operation class. */
    private final MicrosoftGraphClientImpl client;

    /**
     * Initializes an instance of GroupsOnenoteNotebooksClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    GroupsOnenoteNotebooksClientImpl(MicrosoftGraphClientImpl client) {
        this.service =
            RestProxy
                .create(GroupsOnenoteNotebooksService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MicrosoftGraphClientGroupsOnenoteNotebooks to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MicrosoftGraphClient")
    private interface GroupsOnenoteNotebooksService {
        @Headers({"Content-Type: application/json"})
        @Post("/groups/{group-id}/onenote/notebooks/{notebook-id}/microsoft.graph.copyNotebook")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(OdataErrorMainException.class)
        Mono<Response<MicrosoftGraphOnenoteOperationInner>> copyNotebook(
            @HostParam("$host") String endpoint,
            @PathParam("group-id") String groupId,
            @PathParam("notebook-id") String notebookId,
            @BodyParam("application/json") GroupsOnenoteNotebooksCopyNotebookRequestBody body,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Post("/groups/{group-id}/onenote/notebooks/microsoft.graph.getNotebookFromWebUrl")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(OdataErrorMainException.class)
        Mono<Response<MicrosoftGraphCopyNotebookModelInner>> getNotebookFromWebUrl(
            @HostParam("$host") String endpoint,
            @PathParam("group-id") String groupId,
            @BodyParam("application/json") GroupsOnenoteNotebooksGetNotebookFromWebUrlRequestBody body,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/groups/{group-id}/onenote/notebooks"
                + "/microsoft.graph.getRecentNotebooks(includePersonalNotebooks={includePersonalNotebooks})")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(OdataErrorMainException.class)
        Mono<Response<List<MicrosoftGraphRecentNotebookInner>>> getRecentNotebooks(
            @HostParam("$host") String endpoint,
            @PathParam("group-id") String groupId,
            @PathParam("includePersonalNotebooks") boolean includePersonalNotebooks,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Invoke action copyNotebook.
     *
     * @param groupId key: id of group.
     * @param notebookId key: id of notebook.
     * @param body Action parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws OdataErrorMainException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return onenoteOperation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<MicrosoftGraphOnenoteOperationInner>> copyNotebookWithResponseAsync(
        String groupId, String notebookId, GroupsOnenoteNotebooksCopyNotebookRequestBody body) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (groupId == null) {
            return Mono.error(new IllegalArgumentException("Parameter groupId is required and cannot be null."));
        }
        if (notebookId == null) {
            return Mono.error(new IllegalArgumentException("Parameter notebookId is required and cannot be null."));
        }
        if (body == null) {
            return Mono.error(new IllegalArgumentException("Parameter body is required and cannot be null."));
        } else {
            body.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context -> service.copyNotebook(this.client.getEndpoint(), groupId, notebookId, body, accept, context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Invoke action copyNotebook.
     *
     * @param groupId key: id of group.
     * @param notebookId key: id of notebook.
     * @param body Action parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws OdataErrorMainException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return onenoteOperation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<MicrosoftGraphOnenoteOperationInner>> copyNotebookWithResponseAsync(
        String groupId, String notebookId, GroupsOnenoteNotebooksCopyNotebookRequestBody body, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (groupId == null) {
            return Mono.error(new IllegalArgumentException("Parameter groupId is required and cannot be null."));
        }
        if (notebookId == null) {
            return Mono.error(new IllegalArgumentException("Parameter notebookId is required and cannot be null."));
        }
        if (body == null) {
            return Mono.error(new IllegalArgumentException("Parameter body is required and cannot be null."));
        } else {
            body.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.copyNotebook(this.client.getEndpoint(), groupId, notebookId, body, accept, context);
    }

    /**
     * Invoke action copyNotebook.
     *
     * @param groupId key: id of group.
     * @param notebookId key: id of notebook.
     * @param body Action parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws OdataErrorMainException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return onenoteOperation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<MicrosoftGraphOnenoteOperationInner> copyNotebookAsync(
        String groupId, String notebookId, GroupsOnenoteNotebooksCopyNotebookRequestBody body) {
        return copyNotebookWithResponseAsync(groupId, notebookId, body)
            .flatMap(
                (Response<MicrosoftGraphOnenoteOperationInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Invoke action copyNotebook.
     *
     * @param groupId key: id of group.
     * @param notebookId key: id of notebook.
     * @param body Action parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws OdataErrorMainException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return onenoteOperation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public MicrosoftGraphOnenoteOperationInner copyNotebook(
        String groupId, String notebookId, GroupsOnenoteNotebooksCopyNotebookRequestBody body) {
        return copyNotebookAsync(groupId, notebookId, body).block();
    }

    /**
     * Invoke action copyNotebook.
     *
     * @param groupId key: id of group.
     * @param notebookId key: id of notebook.
     * @param body Action parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws OdataErrorMainException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return onenoteOperation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<MicrosoftGraphOnenoteOperationInner> copyNotebookWithResponse(
        String groupId, String notebookId, GroupsOnenoteNotebooksCopyNotebookRequestBody body, Context context) {
        return copyNotebookWithResponseAsync(groupId, notebookId, body, context).block();
    }

    /**
     * Invoke action getNotebookFromWebUrl.
     *
     * @param groupId key: id of group.
     * @param body Action parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws OdataErrorMainException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return copyNotebookModel.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<MicrosoftGraphCopyNotebookModelInner>> getNotebookFromWebUrlWithResponseAsync(
        String groupId, GroupsOnenoteNotebooksGetNotebookFromWebUrlRequestBody body) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (groupId == null) {
            return Mono.error(new IllegalArgumentException("Parameter groupId is required and cannot be null."));
        }
        if (body == null) {
            return Mono.error(new IllegalArgumentException("Parameter body is required and cannot be null."));
        } else {
            body.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context -> service.getNotebookFromWebUrl(this.client.getEndpoint(), groupId, body, accept, context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Invoke action getNotebookFromWebUrl.
     *
     * @param groupId key: id of group.
     * @param body Action parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws OdataErrorMainException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return copyNotebookModel.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<MicrosoftGraphCopyNotebookModelInner>> getNotebookFromWebUrlWithResponseAsync(
        String groupId, GroupsOnenoteNotebooksGetNotebookFromWebUrlRequestBody body, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (groupId == null) {
            return Mono.error(new IllegalArgumentException("Parameter groupId is required and cannot be null."));
        }
        if (body == null) {
            return Mono.error(new IllegalArgumentException("Parameter body is required and cannot be null."));
        } else {
            body.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.getNotebookFromWebUrl(this.client.getEndpoint(), groupId, body, accept, context);
    }

    /**
     * Invoke action getNotebookFromWebUrl.
     *
     * @param groupId key: id of group.
     * @param body Action parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws OdataErrorMainException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return copyNotebookModel.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<MicrosoftGraphCopyNotebookModelInner> getNotebookFromWebUrlAsync(
        String groupId, GroupsOnenoteNotebooksGetNotebookFromWebUrlRequestBody body) {
        return getNotebookFromWebUrlWithResponseAsync(groupId, body)
            .flatMap(
                (Response<MicrosoftGraphCopyNotebookModelInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Invoke action getNotebookFromWebUrl.
     *
     * @param groupId key: id of group.
     * @param body Action parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws OdataErrorMainException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return copyNotebookModel.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public MicrosoftGraphCopyNotebookModelInner getNotebookFromWebUrl(
        String groupId, GroupsOnenoteNotebooksGetNotebookFromWebUrlRequestBody body) {
        return getNotebookFromWebUrlAsync(groupId, body).block();
    }

    /**
     * Invoke action getNotebookFromWebUrl.
     *
     * @param groupId key: id of group.
     * @param body Action parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws OdataErrorMainException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return copyNotebookModel.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<MicrosoftGraphCopyNotebookModelInner> getNotebookFromWebUrlWithResponse(
        String groupId, GroupsOnenoteNotebooksGetNotebookFromWebUrlRequestBody body, Context context) {
        return getNotebookFromWebUrlWithResponseAsync(groupId, body, context).block();
    }

    /**
     * Invoke function getRecentNotebooks.
     *
     * @param groupId key: id of group.
     * @param includePersonalNotebooks The includePersonalNotebooks parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws OdataErrorMainException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of microsoft.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<List<MicrosoftGraphRecentNotebookInner>>> getRecentNotebooksWithResponseAsync(
        String groupId, boolean includePersonalNotebooks) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (groupId == null) {
            return Mono.error(new IllegalArgumentException("Parameter groupId is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .getRecentNotebooks(
                            this.client.getEndpoint(), groupId, includePersonalNotebooks, accept, context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Invoke function getRecentNotebooks.
     *
     * @param groupId key: id of group.
     * @param includePersonalNotebooks The includePersonalNotebooks parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws OdataErrorMainException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of microsoft.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<List<MicrosoftGraphRecentNotebookInner>>> getRecentNotebooksWithResponseAsync(
        String groupId, boolean includePersonalNotebooks, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (groupId == null) {
            return Mono.error(new IllegalArgumentException("Parameter groupId is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .getRecentNotebooks(this.client.getEndpoint(), groupId, includePersonalNotebooks, accept, context);
    }

    /**
     * Invoke function getRecentNotebooks.
     *
     * @param groupId key: id of group.
     * @param includePersonalNotebooks The includePersonalNotebooks parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws OdataErrorMainException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of microsoft.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<List<MicrosoftGraphRecentNotebookInner>> getRecentNotebooksAsync(
        String groupId, boolean includePersonalNotebooks) {
        return getRecentNotebooksWithResponseAsync(groupId, includePersonalNotebooks)
            .flatMap(
                (Response<List<MicrosoftGraphRecentNotebookInner>> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Invoke function getRecentNotebooks.
     *
     * @param groupId key: id of group.
     * @param includePersonalNotebooks The includePersonalNotebooks parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws OdataErrorMainException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of microsoft.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public List<MicrosoftGraphRecentNotebookInner> getRecentNotebooks(
        String groupId, boolean includePersonalNotebooks) {
        return getRecentNotebooksAsync(groupId, includePersonalNotebooks).block();
    }

    /**
     * Invoke function getRecentNotebooks.
     *
     * @param groupId key: id of group.
     * @param includePersonalNotebooks The includePersonalNotebooks parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws OdataErrorMainException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of microsoft.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<List<MicrosoftGraphRecentNotebookInner>> getRecentNotebooksWithResponse(
        String groupId, boolean includePersonalNotebooks, Context context) {
        return getRecentNotebooksWithResponseAsync(groupId, includePersonalNotebooks, context).block();
    }
}
