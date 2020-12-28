// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.authorization.fluent.models.GroupsOnenotePagesCopyToSectionRequestBody;
import com.azure.resourcemanager.authorization.fluent.models.GroupsOnenotePagesOnenotePatchContentRequestBody;
import com.azure.resourcemanager.authorization.fluent.models.MicrosoftGraphOnenoteOperationInner;
import com.azure.resourcemanager.authorization.fluent.models.MicrosoftGraphOnenotePagePreviewInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in GroupsOnenotePagesClient. */
public interface GroupsOnenotePagesClient {
    /**
     * Invoke action copyToSection.
     *
     * @param groupId key: id of group.
     * @param onenotePageId key: id of onenotePage.
     * @param body Action parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return onenoteOperation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<MicrosoftGraphOnenoteOperationInner>> copyToSectionWithResponseAsync(
        String groupId, String onenotePageId, GroupsOnenotePagesCopyToSectionRequestBody body);

    /**
     * Invoke action copyToSection.
     *
     * @param groupId key: id of group.
     * @param onenotePageId key: id of onenotePage.
     * @param body Action parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return onenoteOperation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<MicrosoftGraphOnenoteOperationInner> copyToSectionAsync(
        String groupId, String onenotePageId, GroupsOnenotePagesCopyToSectionRequestBody body);

    /**
     * Invoke action copyToSection.
     *
     * @param groupId key: id of group.
     * @param onenotePageId key: id of onenotePage.
     * @param body Action parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return onenoteOperation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MicrosoftGraphOnenoteOperationInner copyToSection(
        String groupId, String onenotePageId, GroupsOnenotePagesCopyToSectionRequestBody body);

    /**
     * Invoke action copyToSection.
     *
     * @param groupId key: id of group.
     * @param onenotePageId key: id of onenotePage.
     * @param body Action parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return onenoteOperation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MicrosoftGraphOnenoteOperationInner> copyToSectionWithResponse(
        String groupId, String onenotePageId, GroupsOnenotePagesCopyToSectionRequestBody body, Context context);

    /**
     * Invoke action onenotePatchContent.
     *
     * @param groupId key: id of group.
     * @param onenotePageId key: id of onenotePage.
     * @param body Action parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> onenotePatchContentWithResponseAsync(
        String groupId, String onenotePageId, GroupsOnenotePagesOnenotePatchContentRequestBody body);

    /**
     * Invoke action onenotePatchContent.
     *
     * @param groupId key: id of group.
     * @param onenotePageId key: id of onenotePage.
     * @param body Action parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> onenotePatchContentAsync(
        String groupId, String onenotePageId, GroupsOnenotePagesOnenotePatchContentRequestBody body);

    /**
     * Invoke action onenotePatchContent.
     *
     * @param groupId key: id of group.
     * @param onenotePageId key: id of onenotePage.
     * @param body Action parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void onenotePatchContent(
        String groupId, String onenotePageId, GroupsOnenotePagesOnenotePatchContentRequestBody body);

    /**
     * Invoke action onenotePatchContent.
     *
     * @param groupId key: id of group.
     * @param onenotePageId key: id of onenotePage.
     * @param body Action parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> onenotePatchContentWithResponse(
        String groupId, String onenotePageId, GroupsOnenotePagesOnenotePatchContentRequestBody body, Context context);

    /**
     * Invoke function preview.
     *
     * @param groupId key: id of group.
     * @param onenotePageId key: id of onenotePage.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return onenotePagePreview.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<MicrosoftGraphOnenotePagePreviewInner>> previewWithResponseAsync(
        String groupId, String onenotePageId);

    /**
     * Invoke function preview.
     *
     * @param groupId key: id of group.
     * @param onenotePageId key: id of onenotePage.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return onenotePagePreview.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<MicrosoftGraphOnenotePagePreviewInner> previewAsync(String groupId, String onenotePageId);

    /**
     * Invoke function preview.
     *
     * @param groupId key: id of group.
     * @param onenotePageId key: id of onenotePage.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return onenotePagePreview.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MicrosoftGraphOnenotePagePreviewInner preview(String groupId, String onenotePageId);

    /**
     * Invoke function preview.
     *
     * @param groupId key: id of group.
     * @param onenotePageId key: id of onenotePage.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return onenotePagePreview.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MicrosoftGraphOnenotePagePreviewInner> previewWithResponse(
        String groupId, String onenotePageId, Context context);
}
