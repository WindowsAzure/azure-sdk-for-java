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
import com.azure.resourcemanager.authorization.fluent.GroupsOnenoteSectionGroupsSectionsParentNotebooksClient;
import com.azure.resourcemanager.authorization.fluent.models.GroupsOnenoteSectionGroupsSectionsParentNotebookCopyNotebookRequestBody;
import com.azure.resourcemanager.authorization.fluent.models.MicrosoftGraphOnenoteOperationInner;
import com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * GroupsOnenoteSectionGroupsSectionsParentNotebooksClient.
 */
public final class GroupsOnenoteSectionGroupsSectionsParentNotebooksClientImpl
    implements GroupsOnenoteSectionGroupsSectionsParentNotebooksClient {
    private final ClientLogger logger =
        new ClientLogger(GroupsOnenoteSectionGroupsSectionsParentNotebooksClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final GroupsOnenoteSectionGroupsSectionsParentNotebooksService service;

    /** The service client containing this operation class. */
    private final MicrosoftGraphClientImpl client;

    /**
     * Initializes an instance of GroupsOnenoteSectionGroupsSectionsParentNotebooksClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    GroupsOnenoteSectionGroupsSectionsParentNotebooksClientImpl(MicrosoftGraphClientImpl client) {
        this.service =
            RestProxy
                .create(
                    GroupsOnenoteSectionGroupsSectionsParentNotebooksService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MicrosoftGraphClientGroupsOnenoteSectionGroupsSectionsParentNotebooks
     * to be used by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MicrosoftGraphClient")
    private interface GroupsOnenoteSectionGroupsSectionsParentNotebooksService {
        @Headers({"Content-Type: application/json"})
        @Post(
            "/groups/{group-id}/onenote/sectionGroups/{sectionGroup-id}/sections/{onenoteSection-id}/parentNotebook"
                + "/microsoft.graph.copyNotebook")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(OdataErrorMainException.class)
        Mono<Response<MicrosoftGraphOnenoteOperationInner>> copyNotebook(
            @HostParam("$host") String endpoint,
            @PathParam("group-id") String groupId,
            @PathParam("sectionGroup-id") String sectionGroupId,
            @PathParam("onenoteSection-id") String onenoteSectionId,
            @BodyParam("application/json") GroupsOnenoteSectionGroupsSectionsParentNotebookCopyNotebookRequestBody body,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Invoke action copyNotebook.
     *
     * @param groupId key: id of group.
     * @param sectionGroupId key: id of sectionGroup.
     * @param onenoteSectionId key: id of onenoteSection.
     * @param body Action parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws OdataErrorMainException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return onenoteOperation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<MicrosoftGraphOnenoteOperationInner>> copyNotebookWithResponseAsync(
        String groupId,
        String sectionGroupId,
        String onenoteSectionId,
        GroupsOnenoteSectionGroupsSectionsParentNotebookCopyNotebookRequestBody body) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (groupId == null) {
            return Mono.error(new IllegalArgumentException("Parameter groupId is required and cannot be null."));
        }
        if (sectionGroupId == null) {
            return Mono.error(new IllegalArgumentException("Parameter sectionGroupId is required and cannot be null."));
        }
        if (onenoteSectionId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter onenoteSectionId is required and cannot be null."));
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
                        .copyNotebook(
                            this.client.getEndpoint(),
                            groupId,
                            sectionGroupId,
                            onenoteSectionId,
                            body,
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Invoke action copyNotebook.
     *
     * @param groupId key: id of group.
     * @param sectionGroupId key: id of sectionGroup.
     * @param onenoteSectionId key: id of onenoteSection.
     * @param body Action parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws OdataErrorMainException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return onenoteOperation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<MicrosoftGraphOnenoteOperationInner>> copyNotebookWithResponseAsync(
        String groupId,
        String sectionGroupId,
        String onenoteSectionId,
        GroupsOnenoteSectionGroupsSectionsParentNotebookCopyNotebookRequestBody body,
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
        if (sectionGroupId == null) {
            return Mono.error(new IllegalArgumentException("Parameter sectionGroupId is required and cannot be null."));
        }
        if (onenoteSectionId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter onenoteSectionId is required and cannot be null."));
        }
        if (body == null) {
            return Mono.error(new IllegalArgumentException("Parameter body is required and cannot be null."));
        } else {
            body.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .copyNotebook(this.client.getEndpoint(), groupId, sectionGroupId, onenoteSectionId, body, accept, context);
    }

    /**
     * Invoke action copyNotebook.
     *
     * @param groupId key: id of group.
     * @param sectionGroupId key: id of sectionGroup.
     * @param onenoteSectionId key: id of onenoteSection.
     * @param body Action parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws OdataErrorMainException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return onenoteOperation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<MicrosoftGraphOnenoteOperationInner> copyNotebookAsync(
        String groupId,
        String sectionGroupId,
        String onenoteSectionId,
        GroupsOnenoteSectionGroupsSectionsParentNotebookCopyNotebookRequestBody body) {
        return copyNotebookWithResponseAsync(groupId, sectionGroupId, onenoteSectionId, body)
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
     * @param sectionGroupId key: id of sectionGroup.
     * @param onenoteSectionId key: id of onenoteSection.
     * @param body Action parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws OdataErrorMainException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return onenoteOperation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public MicrosoftGraphOnenoteOperationInner copyNotebook(
        String groupId,
        String sectionGroupId,
        String onenoteSectionId,
        GroupsOnenoteSectionGroupsSectionsParentNotebookCopyNotebookRequestBody body) {
        return copyNotebookAsync(groupId, sectionGroupId, onenoteSectionId, body).block();
    }

    /**
     * Invoke action copyNotebook.
     *
     * @param groupId key: id of group.
     * @param sectionGroupId key: id of sectionGroup.
     * @param onenoteSectionId key: id of onenoteSection.
     * @param body Action parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws OdataErrorMainException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return onenoteOperation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<MicrosoftGraphOnenoteOperationInner> copyNotebookWithResponse(
        String groupId,
        String sectionGroupId,
        String onenoteSectionId,
        GroupsOnenoteSectionGroupsSectionsParentNotebookCopyNotebookRequestBody body,
        Context context) {
        return copyNotebookWithResponseAsync(groupId, sectionGroupId, onenoteSectionId, body, context).block();
    }
}
