// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.authorization.fluent.models.GroupsOnenoteSectionGroupsParentNotebookSectionsCopyToNotebookRequestBody;
import com.azure.resourcemanager.authorization.fluent.models.GroupsOnenoteSectionGroupsParentNotebookSectionsCopyToSectionGroupRequestBody;
import com.azure.resourcemanager.authorization.fluent.models.MicrosoftGraphOnenoteOperationInner;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * GroupsOnenoteSectionGroupsParentNotebookSectionsClient.
 */
public interface GroupsOnenoteSectionGroupsParentNotebookSectionsClient {
    /**
     * Invoke action copyToNotebook.
     *
     * @param groupId key: id of group.
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
    Mono<Response<MicrosoftGraphOnenoteOperationInner>> copyToNotebookWithResponseAsync(
        String groupId,
        String sectionGroupId,
        String onenoteSectionId,
        GroupsOnenoteSectionGroupsParentNotebookSectionsCopyToNotebookRequestBody body);

    /**
     * Invoke action copyToNotebook.
     *
     * @param groupId key: id of group.
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
    Mono<MicrosoftGraphOnenoteOperationInner> copyToNotebookAsync(
        String groupId,
        String sectionGroupId,
        String onenoteSectionId,
        GroupsOnenoteSectionGroupsParentNotebookSectionsCopyToNotebookRequestBody body);

    /**
     * Invoke action copyToNotebook.
     *
     * @param groupId key: id of group.
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
    MicrosoftGraphOnenoteOperationInner copyToNotebook(
        String groupId,
        String sectionGroupId,
        String onenoteSectionId,
        GroupsOnenoteSectionGroupsParentNotebookSectionsCopyToNotebookRequestBody body);

    /**
     * Invoke action copyToNotebook.
     *
     * @param groupId key: id of group.
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
    Response<MicrosoftGraphOnenoteOperationInner> copyToNotebookWithResponse(
        String groupId,
        String sectionGroupId,
        String onenoteSectionId,
        GroupsOnenoteSectionGroupsParentNotebookSectionsCopyToNotebookRequestBody body,
        Context context);

    /**
     * Invoke action copyToSectionGroup.
     *
     * @param groupId key: id of group.
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
    Mono<Response<MicrosoftGraphOnenoteOperationInner>> copyToSectionGroupWithResponseAsync(
        String groupId,
        String sectionGroupId,
        String onenoteSectionId,
        GroupsOnenoteSectionGroupsParentNotebookSectionsCopyToSectionGroupRequestBody body);

    /**
     * Invoke action copyToSectionGroup.
     *
     * @param groupId key: id of group.
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
    Mono<MicrosoftGraphOnenoteOperationInner> copyToSectionGroupAsync(
        String groupId,
        String sectionGroupId,
        String onenoteSectionId,
        GroupsOnenoteSectionGroupsParentNotebookSectionsCopyToSectionGroupRequestBody body);

    /**
     * Invoke action copyToSectionGroup.
     *
     * @param groupId key: id of group.
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
    MicrosoftGraphOnenoteOperationInner copyToSectionGroup(
        String groupId,
        String sectionGroupId,
        String onenoteSectionId,
        GroupsOnenoteSectionGroupsParentNotebookSectionsCopyToSectionGroupRequestBody body);

    /**
     * Invoke action copyToSectionGroup.
     *
     * @param groupId key: id of group.
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
    Response<MicrosoftGraphOnenoteOperationInner> copyToSectionGroupWithResponse(
        String groupId,
        String sectionGroupId,
        String onenoteSectionId,
        GroupsOnenoteSectionGroupsParentNotebookSectionsCopyToSectionGroupRequestBody body,
        Context context);
}
