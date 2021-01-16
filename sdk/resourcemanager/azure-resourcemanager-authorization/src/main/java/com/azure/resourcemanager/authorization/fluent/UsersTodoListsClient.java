// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.authorization.fluent.models.MicrosoftGraphExtensionInner;
import com.azure.resourcemanager.authorization.fluent.models.MicrosoftGraphTodoTaskInner;
import com.azure.resourcemanager.authorization.fluent.models.UsersTodoListsExpand;
import com.azure.resourcemanager.authorization.fluent.models.UsersTodoListsOrderby;
import com.azure.resourcemanager.authorization.fluent.models.UsersTodoListsSelect;
import java.util.List;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in UsersTodoListsClient. */
public interface UsersTodoListsClient {
    /**
     * Get extensions from users.
     *
     * @param userId key: id of user.
     * @param todoTaskListId key: id of todoTaskList.
     * @param top Show only the first n items.
     * @param skip Skip the first n items.
     * @param search Search items by search phrases.
     * @param filter Filter items by property values.
     * @param count Include count of items.
     * @param orderby Order items by property values.
     * @param select Select properties to be returned.
     * @param expand Expand related entities.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return extensions from users.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<MicrosoftGraphExtensionInner> listExtensionsAsync(
        String userId,
        String todoTaskListId,
        Integer top,
        Integer skip,
        String search,
        String filter,
        Boolean count,
        List<UsersTodoListsOrderby> orderby,
        List<String> select,
        List<String> expand);

    /**
     * Get extensions from users.
     *
     * @param userId key: id of user.
     * @param todoTaskListId key: id of todoTaskList.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return extensions from users.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<MicrosoftGraphExtensionInner> listExtensionsAsync(String userId, String todoTaskListId);

    /**
     * Get extensions from users.
     *
     * @param userId key: id of user.
     * @param todoTaskListId key: id of todoTaskList.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return extensions from users.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MicrosoftGraphExtensionInner> listExtensions(String userId, String todoTaskListId);

    /**
     * Get extensions from users.
     *
     * @param userId key: id of user.
     * @param todoTaskListId key: id of todoTaskList.
     * @param top Show only the first n items.
     * @param skip Skip the first n items.
     * @param search Search items by search phrases.
     * @param filter Filter items by property values.
     * @param count Include count of items.
     * @param orderby Order items by property values.
     * @param select Select properties to be returned.
     * @param expand Expand related entities.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return extensions from users.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MicrosoftGraphExtensionInner> listExtensions(
        String userId,
        String todoTaskListId,
        Integer top,
        Integer skip,
        String search,
        String filter,
        Boolean count,
        List<UsersTodoListsOrderby> orderby,
        List<String> select,
        List<String> expand,
        Context context);

    /**
     * Create new navigation property to extensions for users.
     *
     * @param userId key: id of user.
     * @param todoTaskListId key: id of todoTaskList.
     * @param body New navigation property.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return extension.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<MicrosoftGraphExtensionInner>> createExtensionsWithResponseAsync(
        String userId, String todoTaskListId, MicrosoftGraphExtensionInner body);

    /**
     * Create new navigation property to extensions for users.
     *
     * @param userId key: id of user.
     * @param todoTaskListId key: id of todoTaskList.
     * @param body New navigation property.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return extension.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<MicrosoftGraphExtensionInner> createExtensionsAsync(
        String userId, String todoTaskListId, MicrosoftGraphExtensionInner body);

    /**
     * Create new navigation property to extensions for users.
     *
     * @param userId key: id of user.
     * @param todoTaskListId key: id of todoTaskList.
     * @param body New navigation property.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return extension.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MicrosoftGraphExtensionInner createExtensions(
        String userId, String todoTaskListId, MicrosoftGraphExtensionInner body);

    /**
     * Create new navigation property to extensions for users.
     *
     * @param userId key: id of user.
     * @param todoTaskListId key: id of todoTaskList.
     * @param body New navigation property.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return extension.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MicrosoftGraphExtensionInner> createExtensionsWithResponse(
        String userId, String todoTaskListId, MicrosoftGraphExtensionInner body, Context context);

    /**
     * Get extensions from users.
     *
     * @param userId key: id of user.
     * @param todoTaskListId key: id of todoTaskList.
     * @param extensionId key: id of extension.
     * @param select Select properties to be returned.
     * @param expand Expand related entities.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return extensions from users.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<MicrosoftGraphExtensionInner>> getExtensionsWithResponseAsync(
        String userId, String todoTaskListId, String extensionId, List<String> select, List<String> expand);

    /**
     * Get extensions from users.
     *
     * @param userId key: id of user.
     * @param todoTaskListId key: id of todoTaskList.
     * @param extensionId key: id of extension.
     * @param select Select properties to be returned.
     * @param expand Expand related entities.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return extensions from users.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<MicrosoftGraphExtensionInner> getExtensionsAsync(
        String userId, String todoTaskListId, String extensionId, List<String> select, List<String> expand);

    /**
     * Get extensions from users.
     *
     * @param userId key: id of user.
     * @param todoTaskListId key: id of todoTaskList.
     * @param extensionId key: id of extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return extensions from users.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<MicrosoftGraphExtensionInner> getExtensionsAsync(String userId, String todoTaskListId, String extensionId);

    /**
     * Get extensions from users.
     *
     * @param userId key: id of user.
     * @param todoTaskListId key: id of todoTaskList.
     * @param extensionId key: id of extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return extensions from users.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MicrosoftGraphExtensionInner getExtensions(String userId, String todoTaskListId, String extensionId);

    /**
     * Get extensions from users.
     *
     * @param userId key: id of user.
     * @param todoTaskListId key: id of todoTaskList.
     * @param extensionId key: id of extension.
     * @param select Select properties to be returned.
     * @param expand Expand related entities.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return extensions from users.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MicrosoftGraphExtensionInner> getExtensionsWithResponse(
        String userId,
        String todoTaskListId,
        String extensionId,
        List<String> select,
        List<String> expand,
        Context context);

    /**
     * Update the navigation property extensions in users.
     *
     * @param userId key: id of user.
     * @param todoTaskListId key: id of todoTaskList.
     * @param extensionId key: id of extension.
     * @param body New navigation property values.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> updateExtensionsWithResponseAsync(
        String userId, String todoTaskListId, String extensionId, MicrosoftGraphExtensionInner body);

    /**
     * Update the navigation property extensions in users.
     *
     * @param userId key: id of user.
     * @param todoTaskListId key: id of todoTaskList.
     * @param extensionId key: id of extension.
     * @param body New navigation property values.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> updateExtensionsAsync(
        String userId, String todoTaskListId, String extensionId, MicrosoftGraphExtensionInner body);

    /**
     * Update the navigation property extensions in users.
     *
     * @param userId key: id of user.
     * @param todoTaskListId key: id of todoTaskList.
     * @param extensionId key: id of extension.
     * @param body New navigation property values.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void updateExtensions(String userId, String todoTaskListId, String extensionId, MicrosoftGraphExtensionInner body);

    /**
     * Update the navigation property extensions in users.
     *
     * @param userId key: id of user.
     * @param todoTaskListId key: id of todoTaskList.
     * @param extensionId key: id of extension.
     * @param body New navigation property values.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> updateExtensionsWithResponse(
        String userId, String todoTaskListId, String extensionId, MicrosoftGraphExtensionInner body, Context context);

    /**
     * Delete navigation property extensions for users.
     *
     * @param userId key: id of user.
     * @param todoTaskListId key: id of todoTaskList.
     * @param extensionId key: id of extension.
     * @param ifMatch ETag.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> deleteExtensionsWithResponseAsync(
        String userId, String todoTaskListId, String extensionId, String ifMatch);

    /**
     * Delete navigation property extensions for users.
     *
     * @param userId key: id of user.
     * @param todoTaskListId key: id of todoTaskList.
     * @param extensionId key: id of extension.
     * @param ifMatch ETag.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteExtensionsAsync(String userId, String todoTaskListId, String extensionId, String ifMatch);

    /**
     * Delete navigation property extensions for users.
     *
     * @param userId key: id of user.
     * @param todoTaskListId key: id of todoTaskList.
     * @param extensionId key: id of extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteExtensionsAsync(String userId, String todoTaskListId, String extensionId);

    /**
     * Delete navigation property extensions for users.
     *
     * @param userId key: id of user.
     * @param todoTaskListId key: id of todoTaskList.
     * @param extensionId key: id of extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void deleteExtensions(String userId, String todoTaskListId, String extensionId);

    /**
     * Delete navigation property extensions for users.
     *
     * @param userId key: id of user.
     * @param todoTaskListId key: id of todoTaskList.
     * @param extensionId key: id of extension.
     * @param ifMatch ETag.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteExtensionsWithResponse(
        String userId, String todoTaskListId, String extensionId, String ifMatch, Context context);

    /**
     * Get tasks from users.
     *
     * @param userId key: id of user.
     * @param todoTaskListId key: id of todoTaskList.
     * @param top Show only the first n items.
     * @param skip Skip the first n items.
     * @param search Search items by search phrases.
     * @param filter Filter items by property values.
     * @param count Include count of items.
     * @param orderby Order items by property values.
     * @param select Select properties to be returned.
     * @param expand Expand related entities.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return tasks from users.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<MicrosoftGraphTodoTaskInner> listTasksAsync(
        String userId,
        String todoTaskListId,
        Integer top,
        Integer skip,
        String search,
        String filter,
        Boolean count,
        List<UsersTodoListsOrderby> orderby,
        List<UsersTodoListsSelect> select,
        List<UsersTodoListsExpand> expand);

    /**
     * Get tasks from users.
     *
     * @param userId key: id of user.
     * @param todoTaskListId key: id of todoTaskList.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return tasks from users.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<MicrosoftGraphTodoTaskInner> listTasksAsync(String userId, String todoTaskListId);

    /**
     * Get tasks from users.
     *
     * @param userId key: id of user.
     * @param todoTaskListId key: id of todoTaskList.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return tasks from users.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MicrosoftGraphTodoTaskInner> listTasks(String userId, String todoTaskListId);

    /**
     * Get tasks from users.
     *
     * @param userId key: id of user.
     * @param todoTaskListId key: id of todoTaskList.
     * @param top Show only the first n items.
     * @param skip Skip the first n items.
     * @param search Search items by search phrases.
     * @param filter Filter items by property values.
     * @param count Include count of items.
     * @param orderby Order items by property values.
     * @param select Select properties to be returned.
     * @param expand Expand related entities.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return tasks from users.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MicrosoftGraphTodoTaskInner> listTasks(
        String userId,
        String todoTaskListId,
        Integer top,
        Integer skip,
        String search,
        String filter,
        Boolean count,
        List<UsersTodoListsOrderby> orderby,
        List<UsersTodoListsSelect> select,
        List<UsersTodoListsExpand> expand,
        Context context);

    /**
     * Create new navigation property to tasks for users.
     *
     * @param userId key: id of user.
     * @param todoTaskListId key: id of todoTaskList.
     * @param body New navigation property.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return todoTask.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<MicrosoftGraphTodoTaskInner>> createTasksWithResponseAsync(
        String userId, String todoTaskListId, MicrosoftGraphTodoTaskInner body);

    /**
     * Create new navigation property to tasks for users.
     *
     * @param userId key: id of user.
     * @param todoTaskListId key: id of todoTaskList.
     * @param body New navigation property.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return todoTask.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<MicrosoftGraphTodoTaskInner> createTasksAsync(
        String userId, String todoTaskListId, MicrosoftGraphTodoTaskInner body);

    /**
     * Create new navigation property to tasks for users.
     *
     * @param userId key: id of user.
     * @param todoTaskListId key: id of todoTaskList.
     * @param body New navigation property.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return todoTask.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MicrosoftGraphTodoTaskInner createTasks(String userId, String todoTaskListId, MicrosoftGraphTodoTaskInner body);

    /**
     * Create new navigation property to tasks for users.
     *
     * @param userId key: id of user.
     * @param todoTaskListId key: id of todoTaskList.
     * @param body New navigation property.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return todoTask.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MicrosoftGraphTodoTaskInner> createTasksWithResponse(
        String userId, String todoTaskListId, MicrosoftGraphTodoTaskInner body, Context context);

    /**
     * Get tasks from users.
     *
     * @param userId key: id of user.
     * @param todoTaskListId key: id of todoTaskList.
     * @param todoTaskId key: id of todoTask.
     * @param select Select properties to be returned.
     * @param expand Expand related entities.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return tasks from users.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<MicrosoftGraphTodoTaskInner>> getTasksWithResponseAsync(
        String userId,
        String todoTaskListId,
        String todoTaskId,
        List<UsersTodoListsSelect> select,
        List<UsersTodoListsExpand> expand);

    /**
     * Get tasks from users.
     *
     * @param userId key: id of user.
     * @param todoTaskListId key: id of todoTaskList.
     * @param todoTaskId key: id of todoTask.
     * @param select Select properties to be returned.
     * @param expand Expand related entities.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return tasks from users.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<MicrosoftGraphTodoTaskInner> getTasksAsync(
        String userId,
        String todoTaskListId,
        String todoTaskId,
        List<UsersTodoListsSelect> select,
        List<UsersTodoListsExpand> expand);

    /**
     * Get tasks from users.
     *
     * @param userId key: id of user.
     * @param todoTaskListId key: id of todoTaskList.
     * @param todoTaskId key: id of todoTask.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return tasks from users.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<MicrosoftGraphTodoTaskInner> getTasksAsync(String userId, String todoTaskListId, String todoTaskId);

    /**
     * Get tasks from users.
     *
     * @param userId key: id of user.
     * @param todoTaskListId key: id of todoTaskList.
     * @param todoTaskId key: id of todoTask.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return tasks from users.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MicrosoftGraphTodoTaskInner getTasks(String userId, String todoTaskListId, String todoTaskId);

    /**
     * Get tasks from users.
     *
     * @param userId key: id of user.
     * @param todoTaskListId key: id of todoTaskList.
     * @param todoTaskId key: id of todoTask.
     * @param select Select properties to be returned.
     * @param expand Expand related entities.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return tasks from users.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MicrosoftGraphTodoTaskInner> getTasksWithResponse(
        String userId,
        String todoTaskListId,
        String todoTaskId,
        List<UsersTodoListsSelect> select,
        List<UsersTodoListsExpand> expand,
        Context context);

    /**
     * Update the navigation property tasks in users.
     *
     * @param userId key: id of user.
     * @param todoTaskListId key: id of todoTaskList.
     * @param todoTaskId key: id of todoTask.
     * @param body New navigation property values.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> updateTasksWithResponseAsync(
        String userId, String todoTaskListId, String todoTaskId, MicrosoftGraphTodoTaskInner body);

    /**
     * Update the navigation property tasks in users.
     *
     * @param userId key: id of user.
     * @param todoTaskListId key: id of todoTaskList.
     * @param todoTaskId key: id of todoTask.
     * @param body New navigation property values.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> updateTasksAsync(
        String userId, String todoTaskListId, String todoTaskId, MicrosoftGraphTodoTaskInner body);

    /**
     * Update the navigation property tasks in users.
     *
     * @param userId key: id of user.
     * @param todoTaskListId key: id of todoTaskList.
     * @param todoTaskId key: id of todoTask.
     * @param body New navigation property values.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void updateTasks(String userId, String todoTaskListId, String todoTaskId, MicrosoftGraphTodoTaskInner body);

    /**
     * Update the navigation property tasks in users.
     *
     * @param userId key: id of user.
     * @param todoTaskListId key: id of todoTaskList.
     * @param todoTaskId key: id of todoTask.
     * @param body New navigation property values.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> updateTasksWithResponse(
        String userId, String todoTaskListId, String todoTaskId, MicrosoftGraphTodoTaskInner body, Context context);

    /**
     * Delete navigation property tasks for users.
     *
     * @param userId key: id of user.
     * @param todoTaskListId key: id of todoTaskList.
     * @param todoTaskId key: id of todoTask.
     * @param ifMatch ETag.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> deleteTasksWithResponseAsync(
        String userId, String todoTaskListId, String todoTaskId, String ifMatch);

    /**
     * Delete navigation property tasks for users.
     *
     * @param userId key: id of user.
     * @param todoTaskListId key: id of todoTaskList.
     * @param todoTaskId key: id of todoTask.
     * @param ifMatch ETag.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteTasksAsync(String userId, String todoTaskListId, String todoTaskId, String ifMatch);

    /**
     * Delete navigation property tasks for users.
     *
     * @param userId key: id of user.
     * @param todoTaskListId key: id of todoTaskList.
     * @param todoTaskId key: id of todoTask.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteTasksAsync(String userId, String todoTaskListId, String todoTaskId);

    /**
     * Delete navigation property tasks for users.
     *
     * @param userId key: id of user.
     * @param todoTaskListId key: id of todoTaskList.
     * @param todoTaskId key: id of todoTask.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void deleteTasks(String userId, String todoTaskListId, String todoTaskId);

    /**
     * Delete navigation property tasks for users.
     *
     * @param userId key: id of user.
     * @param todoTaskListId key: id of todoTaskList.
     * @param todoTaskId key: id of todoTask.
     * @param ifMatch ETag.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteTasksWithResponse(
        String userId, String todoTaskListId, String todoTaskId, String ifMatch, Context context);
}
