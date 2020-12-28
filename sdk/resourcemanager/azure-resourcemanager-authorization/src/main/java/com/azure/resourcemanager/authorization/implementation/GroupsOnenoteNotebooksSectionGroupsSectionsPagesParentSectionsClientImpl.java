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
import com.azure.resourcemanager.authorization.fluent.GroupsOnenoteNotebooksSectionGroupsSectionsPagesParentSectionsClient;
import com.azure.resourcemanager.authorization.fluent.models.GroupsOnenoteNotebooksSectionGroupsSectionsPagesParentSectionCopyToNotebookRequestBody;
import com.azure.resourcemanager.authorization.fluent.models.GroupsOnenoteNotebooksSectionGroupsSectionsPagesParentSectionCopyToSectionGroupRequestBody;
import com.azure.resourcemanager.authorization.fluent.models.MicrosoftGraphOnenoteOperationInner;
import com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * GroupsOnenoteNotebooksSectionGroupsSectionsPagesParentSectionsClient.
 */
public final class GroupsOnenoteNotebooksSectionGroupsSectionsPagesParentSectionsClientImpl
    implements GroupsOnenoteNotebooksSectionGroupsSectionsPagesParentSectionsClient {
    private final ClientLogger logger =
        new ClientLogger(GroupsOnenoteNotebooksSectionGroupsSectionsPagesParentSectionsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final GroupsOnenoteNotebooksSectionGroupsSectionsPagesParentSectionsService service;

    /** The service client containing this operation class. */
    private final MicrosoftGraphClientImpl client;

    /**
     * Initializes an instance of GroupsOnenoteNotebooksSectionGroupsSectionsPagesParentSectionsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    GroupsOnenoteNotebooksSectionGroupsSectionsPagesParentSectionsClientImpl(MicrosoftGraphClientImpl client) {
        this.service =
            RestProxy
                .create(
                    GroupsOnenoteNotebooksSectionGroupsSectionsPagesParentSectionsService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * MicrosoftGraphClientGroupsOnenoteNotebooksSectionGroupsSectionsPagesParentSections to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MicrosoftGraphClient")
    private interface GroupsOnenoteNotebooksSectionGroupsSectionsPagesParentSectionsService {
        @Headers({"Content-Type: application/json"})
        @Post(
            "/groups/{group-id}/onenote/notebooks/{notebook-id}/sectionGroups/{sectionGroup-id}/sections"
                + "/{onenoteSection-id}/pages/{onenotePage-id}/parentSection/microsoft.graph.copyToNotebook")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(OdataErrorMainException.class)
        Mono<Response<MicrosoftGraphOnenoteOperationInner>> copyToNotebook(
            @HostParam("$host") String endpoint,
            @PathParam("group-id") String groupId,
            @PathParam("notebook-id") String notebookId,
            @PathParam("sectionGroup-id") String sectionGroupId,
            @PathParam("onenoteSection-id") String onenoteSectionId,
            @PathParam("onenotePage-id") String onenotePageId,
            @BodyParam("application/json")
                GroupsOnenoteNotebooksSectionGroupsSectionsPagesParentSectionCopyToNotebookRequestBody body,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Post(
            "/groups/{group-id}/onenote/notebooks/{notebook-id}/sectionGroups/{sectionGroup-id}/sections"
                + "/{onenoteSection-id}/pages/{onenotePage-id}/parentSection/microsoft.graph.copyToSectionGroup")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(OdataErrorMainException.class)
        Mono<Response<MicrosoftGraphOnenoteOperationInner>> copyToSectionGroup(
            @HostParam("$host") String endpoint,
            @PathParam("group-id") String groupId,
            @PathParam("notebook-id") String notebookId,
            @PathParam("sectionGroup-id") String sectionGroupId,
            @PathParam("onenoteSection-id") String onenoteSectionId,
            @PathParam("onenotePage-id") String onenotePageId,
            @BodyParam("application/json")
                GroupsOnenoteNotebooksSectionGroupsSectionsPagesParentSectionCopyToSectionGroupRequestBody body,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Invoke action copyToNotebook.
     *
     * @param groupId key: id of group.
     * @param notebookId key: id of notebook.
     * @param sectionGroupId key: id of sectionGroup.
     * @param onenoteSectionId key: id of onenoteSection.
     * @param onenotePageId key: id of onenotePage.
     * @param body Action parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws OdataErrorMainException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return onenoteOperation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<MicrosoftGraphOnenoteOperationInner>> copyToNotebookWithResponseAsync(
        String groupId,
        String notebookId,
        String sectionGroupId,
        String onenoteSectionId,
        String onenotePageId,
        GroupsOnenoteNotebooksSectionGroupsSectionsPagesParentSectionCopyToNotebookRequestBody body) {
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
        if (sectionGroupId == null) {
            return Mono.error(new IllegalArgumentException("Parameter sectionGroupId is required and cannot be null."));
        }
        if (onenoteSectionId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter onenoteSectionId is required and cannot be null."));
        }
        if (onenotePageId == null) {
            return Mono.error(new IllegalArgumentException("Parameter onenotePageId is required and cannot be null."));
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
                            this.client.getEndpoint(),
                            groupId,
                            notebookId,
                            sectionGroupId,
                            onenoteSectionId,
                            onenotePageId,
                            body,
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Invoke action copyToNotebook.
     *
     * @param groupId key: id of group.
     * @param notebookId key: id of notebook.
     * @param sectionGroupId key: id of sectionGroup.
     * @param onenoteSectionId key: id of onenoteSection.
     * @param onenotePageId key: id of onenotePage.
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
        String notebookId,
        String sectionGroupId,
        String onenoteSectionId,
        String onenotePageId,
        GroupsOnenoteNotebooksSectionGroupsSectionsPagesParentSectionCopyToNotebookRequestBody body,
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
        if (notebookId == null) {
            return Mono.error(new IllegalArgumentException("Parameter notebookId is required and cannot be null."));
        }
        if (sectionGroupId == null) {
            return Mono.error(new IllegalArgumentException("Parameter sectionGroupId is required and cannot be null."));
        }
        if (onenoteSectionId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter onenoteSectionId is required and cannot be null."));
        }
        if (onenotePageId == null) {
            return Mono.error(new IllegalArgumentException("Parameter onenotePageId is required and cannot be null."));
        }
        if (body == null) {
            return Mono.error(new IllegalArgumentException("Parameter body is required and cannot be null."));
        } else {
            body.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .copyToNotebook(
                this.client.getEndpoint(),
                groupId,
                notebookId,
                sectionGroupId,
                onenoteSectionId,
                onenotePageId,
                body,
                accept,
                context);
    }

    /**
     * Invoke action copyToNotebook.
     *
     * @param groupId key: id of group.
     * @param notebookId key: id of notebook.
     * @param sectionGroupId key: id of sectionGroup.
     * @param onenoteSectionId key: id of onenoteSection.
     * @param onenotePageId key: id of onenotePage.
     * @param body Action parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws OdataErrorMainException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return onenoteOperation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<MicrosoftGraphOnenoteOperationInner> copyToNotebookAsync(
        String groupId,
        String notebookId,
        String sectionGroupId,
        String onenoteSectionId,
        String onenotePageId,
        GroupsOnenoteNotebooksSectionGroupsSectionsPagesParentSectionCopyToNotebookRequestBody body) {
        return copyToNotebookWithResponseAsync(
                groupId, notebookId, sectionGroupId, onenoteSectionId, onenotePageId, body)
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
     * @param notebookId key: id of notebook.
     * @param sectionGroupId key: id of sectionGroup.
     * @param onenoteSectionId key: id of onenoteSection.
     * @param onenotePageId key: id of onenotePage.
     * @param body Action parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws OdataErrorMainException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return onenoteOperation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public MicrosoftGraphOnenoteOperationInner copyToNotebook(
        String groupId,
        String notebookId,
        String sectionGroupId,
        String onenoteSectionId,
        String onenotePageId,
        GroupsOnenoteNotebooksSectionGroupsSectionsPagesParentSectionCopyToNotebookRequestBody body) {
        return copyToNotebookAsync(groupId, notebookId, sectionGroupId, onenoteSectionId, onenotePageId, body).block();
    }

    /**
     * Invoke action copyToNotebook.
     *
     * @param groupId key: id of group.
     * @param notebookId key: id of notebook.
     * @param sectionGroupId key: id of sectionGroup.
     * @param onenoteSectionId key: id of onenoteSection.
     * @param onenotePageId key: id of onenotePage.
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
        String notebookId,
        String sectionGroupId,
        String onenoteSectionId,
        String onenotePageId,
        GroupsOnenoteNotebooksSectionGroupsSectionsPagesParentSectionCopyToNotebookRequestBody body,
        Context context) {
        return copyToNotebookWithResponseAsync(
                groupId, notebookId, sectionGroupId, onenoteSectionId, onenotePageId, body, context)
            .block();
    }

    /**
     * Invoke action copyToSectionGroup.
     *
     * @param groupId key: id of group.
     * @param notebookId key: id of notebook.
     * @param sectionGroupId key: id of sectionGroup.
     * @param onenoteSectionId key: id of onenoteSection.
     * @param onenotePageId key: id of onenotePage.
     * @param body Action parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws OdataErrorMainException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return onenoteOperation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<MicrosoftGraphOnenoteOperationInner>> copyToSectionGroupWithResponseAsync(
        String groupId,
        String notebookId,
        String sectionGroupId,
        String onenoteSectionId,
        String onenotePageId,
        GroupsOnenoteNotebooksSectionGroupsSectionsPagesParentSectionCopyToSectionGroupRequestBody body) {
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
        if (sectionGroupId == null) {
            return Mono.error(new IllegalArgumentException("Parameter sectionGroupId is required and cannot be null."));
        }
        if (onenoteSectionId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter onenoteSectionId is required and cannot be null."));
        }
        if (onenotePageId == null) {
            return Mono.error(new IllegalArgumentException("Parameter onenotePageId is required and cannot be null."));
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
                            this.client.getEndpoint(),
                            groupId,
                            notebookId,
                            sectionGroupId,
                            onenoteSectionId,
                            onenotePageId,
                            body,
                            accept,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Invoke action copyToSectionGroup.
     *
     * @param groupId key: id of group.
     * @param notebookId key: id of notebook.
     * @param sectionGroupId key: id of sectionGroup.
     * @param onenoteSectionId key: id of onenoteSection.
     * @param onenotePageId key: id of onenotePage.
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
        String notebookId,
        String sectionGroupId,
        String onenoteSectionId,
        String onenotePageId,
        GroupsOnenoteNotebooksSectionGroupsSectionsPagesParentSectionCopyToSectionGroupRequestBody body,
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
        if (notebookId == null) {
            return Mono.error(new IllegalArgumentException("Parameter notebookId is required and cannot be null."));
        }
        if (sectionGroupId == null) {
            return Mono.error(new IllegalArgumentException("Parameter sectionGroupId is required and cannot be null."));
        }
        if (onenoteSectionId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter onenoteSectionId is required and cannot be null."));
        }
        if (onenotePageId == null) {
            return Mono.error(new IllegalArgumentException("Parameter onenotePageId is required and cannot be null."));
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
                this.client.getEndpoint(),
                groupId,
                notebookId,
                sectionGroupId,
                onenoteSectionId,
                onenotePageId,
                body,
                accept,
                context);
    }

    /**
     * Invoke action copyToSectionGroup.
     *
     * @param groupId key: id of group.
     * @param notebookId key: id of notebook.
     * @param sectionGroupId key: id of sectionGroup.
     * @param onenoteSectionId key: id of onenoteSection.
     * @param onenotePageId key: id of onenotePage.
     * @param body Action parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws OdataErrorMainException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return onenoteOperation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<MicrosoftGraphOnenoteOperationInner> copyToSectionGroupAsync(
        String groupId,
        String notebookId,
        String sectionGroupId,
        String onenoteSectionId,
        String onenotePageId,
        GroupsOnenoteNotebooksSectionGroupsSectionsPagesParentSectionCopyToSectionGroupRequestBody body) {
        return copyToSectionGroupWithResponseAsync(
                groupId, notebookId, sectionGroupId, onenoteSectionId, onenotePageId, body)
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
     * @param notebookId key: id of notebook.
     * @param sectionGroupId key: id of sectionGroup.
     * @param onenoteSectionId key: id of onenoteSection.
     * @param onenotePageId key: id of onenotePage.
     * @param body Action parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws OdataErrorMainException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return onenoteOperation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public MicrosoftGraphOnenoteOperationInner copyToSectionGroup(
        String groupId,
        String notebookId,
        String sectionGroupId,
        String onenoteSectionId,
        String onenotePageId,
        GroupsOnenoteNotebooksSectionGroupsSectionsPagesParentSectionCopyToSectionGroupRequestBody body) {
        return copyToSectionGroupAsync(groupId, notebookId, sectionGroupId, onenoteSectionId, onenotePageId, body)
            .block();
    }

    /**
     * Invoke action copyToSectionGroup.
     *
     * @param groupId key: id of group.
     * @param notebookId key: id of notebook.
     * @param sectionGroupId key: id of sectionGroup.
     * @param onenoteSectionId key: id of onenoteSection.
     * @param onenotePageId key: id of onenotePage.
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
        String notebookId,
        String sectionGroupId,
        String onenoteSectionId,
        String onenotePageId,
        GroupsOnenoteNotebooksSectionGroupsSectionsPagesParentSectionCopyToSectionGroupRequestBody body,
        Context context) {
        return copyToSectionGroupWithResponseAsync(
                groupId, notebookId, sectionGroupId, onenoteSectionId, onenotePageId, body, context)
            .block();
    }
}
