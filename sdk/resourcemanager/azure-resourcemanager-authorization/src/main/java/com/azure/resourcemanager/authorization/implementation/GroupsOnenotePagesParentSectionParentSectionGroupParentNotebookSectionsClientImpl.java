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
import com.azure.resourcemanager.authorization.fluent.GroupsOnenotePagesParentSectionParentSectionGroupParentNotebookSectionsClient;
import com.azure.resourcemanager.authorization.fluent.models.GroupsOnenotePagesParentSectionParentSectionGroupParentNotebookSectionsCopyToNotebookRequestBody;
import com.azure.resourcemanager.authorization.fluent.models.GroupsOnenotePagesParentSectionParentSectionGroupParentNotebookSectionsCopyToSectionGroupRequestBody;
import com.azure.resourcemanager.authorization.fluent.models.MicrosoftGraphOnenoteOperationInner;
import com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * GroupsOnenotePagesParentSectionParentSectionGroupParentNotebookSectionsClient.
 */
public final class GroupsOnenotePagesParentSectionParentSectionGroupParentNotebookSectionsClientImpl
    implements GroupsOnenotePagesParentSectionParentSectionGroupParentNotebookSectionsClient {
    private final ClientLogger logger =
        new ClientLogger(GroupsOnenotePagesParentSectionParentSectionGroupParentNotebookSectionsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final GroupsOnenotePagesParentSectionParentSectionGroupParentNotebookSectionsService service;

    /** The service client containing this operation class. */
    private final MicrosoftGraphClientImpl client;

    /**
     * Initializes an instance of GroupsOnenotePagesParentSectionParentSectionGroupParentNotebookSectionsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    GroupsOnenotePagesParentSectionParentSectionGroupParentNotebookSectionsClientImpl(MicrosoftGraphClientImpl client) {
        this.service =
            RestProxy
                .create(
                    GroupsOnenotePagesParentSectionParentSectionGroupParentNotebookSectionsService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * MicrosoftGraphClientGroupsOnenotePagesParentSectionParentSectionGroupParentNotebookSections to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MicrosoftGraphClient")
    private interface GroupsOnenotePagesParentSectionParentSectionGroupParentNotebookSectionsService {
        @Headers({"Content-Type: application/json"})
        @Post(
            "/groups/{group-id}/onenote/pages/{onenotePage-id}/parentSection/parentSectionGroup/parentNotebook/sections"
                + "/{onenoteSection-id}/microsoft.graph.copyToNotebook")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(OdataErrorMainException.class)
        Mono<Response<MicrosoftGraphOnenoteOperationInner>> copyToNotebook(
            @HostParam("$host") String endpoint,
            @PathParam("group-id") String groupId,
            @PathParam("onenotePage-id") String onenotePageId,
            @PathParam("onenoteSection-id") String onenoteSectionId,
            @BodyParam("application/json")
                GroupsOnenotePagesParentSectionParentSectionGroupParentNotebookSectionsCopyToNotebookRequestBody body,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Post(
            "/groups/{group-id}/onenote/pages/{onenotePage-id}/parentSection/parentSectionGroup/parentNotebook/sections"
                + "/{onenoteSection-id}/microsoft.graph.copyToSectionGroup")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(OdataErrorMainException.class)
        Mono<Response<MicrosoftGraphOnenoteOperationInner>> copyToSectionGroup(
            @HostParam("$host") String endpoint,
            @PathParam("group-id") String groupId,
            @PathParam("onenotePage-id") String onenotePageId,
            @PathParam("onenoteSection-id") String onenoteSectionId,
            @BodyParam("application/json")
                GroupsOnenotePagesParentSectionParentSectionGroupParentNotebookSectionsCopyToSectionGroupRequestBody
                    body,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Invoke action copyToNotebook.
     *
     * @param groupId key: id of group.
     * @param onenotePageId key: id of onenotePage.
     * @param onenoteSectionId key: id of onenoteSection.
     * @param body Action parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws OdataErrorMainException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return onenoteOperation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<MicrosoftGraphOnenoteOperationInner>> copyToNotebookWithResponseAsync(
        String groupId,
        String onenotePageId,
        String onenoteSectionId,
        GroupsOnenotePagesParentSectionParentSectionGroupParentNotebookSectionsCopyToNotebookRequestBody body) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (groupId == null) {
            return Mono.error(new IllegalArgumentException("Parameter groupId is required and cannot be null."));
        }
        if (onenotePageId == null) {
            return Mono.error(new IllegalArgumentException("Parameter onenotePageId is required and cannot be null."));
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
                        .copyToNotebook(
                            this.client.getEndpoint(), groupId, onenotePageId, onenoteSectionId, body, accept, context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Invoke action copyToNotebook.
     *
     * @param groupId key: id of group.
     * @param onenotePageId key: id of onenotePage.
     * @param onenoteSectionId key: id of onenoteSection.
     * @param body Action parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws OdataErrorMainException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return onenoteOperation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<MicrosoftGraphOnenoteOperationInner>> copyToNotebookWithResponseAsync(
        String groupId,
        String onenotePageId,
        String onenoteSectionId,
        GroupsOnenotePagesParentSectionParentSectionGroupParentNotebookSectionsCopyToNotebookRequestBody body,
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
        if (onenotePageId == null) {
            return Mono.error(new IllegalArgumentException("Parameter onenotePageId is required and cannot be null."));
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
            .copyToNotebook(this.client.getEndpoint(), groupId, onenotePageId, onenoteSectionId, body, accept, context);
    }

    /**
     * Invoke action copyToNotebook.
     *
     * @param groupId key: id of group.
     * @param onenotePageId key: id of onenotePage.
     * @param onenoteSectionId key: id of onenoteSection.
     * @param body Action parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws OdataErrorMainException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return onenoteOperation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<MicrosoftGraphOnenoteOperationInner> copyToNotebookAsync(
        String groupId,
        String onenotePageId,
        String onenoteSectionId,
        GroupsOnenotePagesParentSectionParentSectionGroupParentNotebookSectionsCopyToNotebookRequestBody body) {
        return copyToNotebookWithResponseAsync(groupId, onenotePageId, onenoteSectionId, body)
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
     * Invoke action copyToNotebook.
     *
     * @param groupId key: id of group.
     * @param onenotePageId key: id of onenotePage.
     * @param onenoteSectionId key: id of onenoteSection.
     * @param body Action parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws OdataErrorMainException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return onenoteOperation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public MicrosoftGraphOnenoteOperationInner copyToNotebook(
        String groupId,
        String onenotePageId,
        String onenoteSectionId,
        GroupsOnenotePagesParentSectionParentSectionGroupParentNotebookSectionsCopyToNotebookRequestBody body) {
        return copyToNotebookAsync(groupId, onenotePageId, onenoteSectionId, body).block();
    }

    /**
     * Invoke action copyToNotebook.
     *
     * @param groupId key: id of group.
     * @param onenotePageId key: id of onenotePage.
     * @param onenoteSectionId key: id of onenoteSection.
     * @param body Action parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws OdataErrorMainException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return onenoteOperation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<MicrosoftGraphOnenoteOperationInner> copyToNotebookWithResponse(
        String groupId,
        String onenotePageId,
        String onenoteSectionId,
        GroupsOnenotePagesParentSectionParentSectionGroupParentNotebookSectionsCopyToNotebookRequestBody body,
        Context context) {
        return copyToNotebookWithResponseAsync(groupId, onenotePageId, onenoteSectionId, body, context).block();
    }

    /**
     * Invoke action copyToSectionGroup.
     *
     * @param groupId key: id of group.
     * @param onenotePageId key: id of onenotePage.
     * @param onenoteSectionId key: id of onenoteSection.
     * @param body Action parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws OdataErrorMainException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return onenoteOperation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<MicrosoftGraphOnenoteOperationInner>> copyToSectionGroupWithResponseAsync(
        String groupId,
        String onenotePageId,
        String onenoteSectionId,
        GroupsOnenotePagesParentSectionParentSectionGroupParentNotebookSectionsCopyToSectionGroupRequestBody body) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (groupId == null) {
            return Mono.error(new IllegalArgumentException("Parameter groupId is required and cannot be null."));
        }
        if (onenotePageId == null) {
            return Mono.error(new IllegalArgumentException("Parameter onenotePageId is required and cannot be null."));
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
                        .copyToSectionGroup(
                            this.client.getEndpoint(), groupId, onenotePageId, onenoteSectionId, body, accept, context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Invoke action copyToSectionGroup.
     *
     * @param groupId key: id of group.
     * @param onenotePageId key: id of onenotePage.
     * @param onenoteSectionId key: id of onenoteSection.
     * @param body Action parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws OdataErrorMainException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return onenoteOperation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<MicrosoftGraphOnenoteOperationInner>> copyToSectionGroupWithResponseAsync(
        String groupId,
        String onenotePageId,
        String onenoteSectionId,
        GroupsOnenotePagesParentSectionParentSectionGroupParentNotebookSectionsCopyToSectionGroupRequestBody body,
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
        if (onenotePageId == null) {
            return Mono.error(new IllegalArgumentException("Parameter onenotePageId is required and cannot be null."));
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
            .copyToSectionGroup(
                this.client.getEndpoint(), groupId, onenotePageId, onenoteSectionId, body, accept, context);
    }

    /**
     * Invoke action copyToSectionGroup.
     *
     * @param groupId key: id of group.
     * @param onenotePageId key: id of onenotePage.
     * @param onenoteSectionId key: id of onenoteSection.
     * @param body Action parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws OdataErrorMainException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return onenoteOperation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<MicrosoftGraphOnenoteOperationInner> copyToSectionGroupAsync(
        String groupId,
        String onenotePageId,
        String onenoteSectionId,
        GroupsOnenotePagesParentSectionParentSectionGroupParentNotebookSectionsCopyToSectionGroupRequestBody body) {
        return copyToSectionGroupWithResponseAsync(groupId, onenotePageId, onenoteSectionId, body)
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
     * Invoke action copyToSectionGroup.
     *
     * @param groupId key: id of group.
     * @param onenotePageId key: id of onenotePage.
     * @param onenoteSectionId key: id of onenoteSection.
     * @param body Action parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws OdataErrorMainException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return onenoteOperation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public MicrosoftGraphOnenoteOperationInner copyToSectionGroup(
        String groupId,
        String onenotePageId,
        String onenoteSectionId,
        GroupsOnenotePagesParentSectionParentSectionGroupParentNotebookSectionsCopyToSectionGroupRequestBody body) {
        return copyToSectionGroupAsync(groupId, onenotePageId, onenoteSectionId, body).block();
    }

    /**
     * Invoke action copyToSectionGroup.
     *
     * @param groupId key: id of group.
     * @param onenotePageId key: id of onenotePage.
     * @param onenoteSectionId key: id of onenoteSection.
     * @param body Action parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws OdataErrorMainException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return onenoteOperation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<MicrosoftGraphOnenoteOperationInner> copyToSectionGroupWithResponse(
        String groupId,
        String onenotePageId,
        String onenoteSectionId,
        GroupsOnenotePagesParentSectionParentSectionGroupParentNotebookSectionsCopyToSectionGroupRequestBody body,
        Context context) {
        return copyToSectionGroupWithResponseAsync(groupId, onenotePageId, onenoteSectionId, body, context).block();
    }
}
