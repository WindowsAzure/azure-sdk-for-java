// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.authorization.fluent.models.GroupsOnenotePagesParentNotebookSectionGroupsSectionsParentNotebookCopyNotebookRequestBody;
import com.azure.resourcemanager.authorization.fluent.models.MicrosoftGraphOnenoteOperationInner;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * GroupsOnenotePagesParentNotebookSectionGroupsSectionsParentNotebooksClient.
 */
public interface GroupsOnenotePagesParentNotebookSectionGroupsSectionsParentNotebooksClient {
    /**
     * Invoke action copyNotebook.
     *
     * @param groupId key: id of group.
     * @param onenotePageId key: id of onenotePage.
     * @param sectionGroupId key: id of sectionGroup.
     * @param onenoteSectionId key: id of onenoteSection.
     * @param body Action parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return onenoteOperation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<MicrosoftGraphOnenoteOperationInner>> copyNotebookWithResponseAsync(
        String groupId,
        String onenotePageId,
        String sectionGroupId,
        String onenoteSectionId,
        GroupsOnenotePagesParentNotebookSectionGroupsSectionsParentNotebookCopyNotebookRequestBody body);

    /**
     * Invoke action copyNotebook.
     *
     * @param groupId key: id of group.
     * @param onenotePageId key: id of onenotePage.
     * @param sectionGroupId key: id of sectionGroup.
     * @param onenoteSectionId key: id of onenoteSection.
     * @param body Action parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return onenoteOperation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<MicrosoftGraphOnenoteOperationInner> copyNotebookAsync(
        String groupId,
        String onenotePageId,
        String sectionGroupId,
        String onenoteSectionId,
        GroupsOnenotePagesParentNotebookSectionGroupsSectionsParentNotebookCopyNotebookRequestBody body);

    /**
     * Invoke action copyNotebook.
     *
     * @param groupId key: id of group.
     * @param onenotePageId key: id of onenotePage.
     * @param sectionGroupId key: id of sectionGroup.
     * @param onenoteSectionId key: id of onenoteSection.
     * @param body Action parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return onenoteOperation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MicrosoftGraphOnenoteOperationInner copyNotebook(
        String groupId,
        String onenotePageId,
        String sectionGroupId,
        String onenoteSectionId,
        GroupsOnenotePagesParentNotebookSectionGroupsSectionsParentNotebookCopyNotebookRequestBody body);

    /**
     * Invoke action copyNotebook.
     *
     * @param groupId key: id of group.
     * @param onenotePageId key: id of onenotePage.
     * @param sectionGroupId key: id of sectionGroup.
     * @param onenoteSectionId key: id of onenoteSection.
     * @param body Action parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return onenoteOperation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MicrosoftGraphOnenoteOperationInner> copyNotebookWithResponse(
        String groupId,
        String onenotePageId,
        String sectionGroupId,
        String onenoteSectionId,
        GroupsOnenotePagesParentNotebookSectionGroupsSectionsParentNotebookCopyNotebookRequestBody body,
        Context context);
}
