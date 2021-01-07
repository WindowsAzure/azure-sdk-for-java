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
import com.azure.resourcemanager.authorization.fluent.models.DirectoryRolesDirectoryRoleExpand;
import com.azure.resourcemanager.authorization.fluent.models.DirectoryRolesDirectoryRoleOrderby;
import com.azure.resourcemanager.authorization.fluent.models.DirectoryRolesDirectoryRoleSelect;
import com.azure.resourcemanager.authorization.fluent.models.MicrosoftGraphDirectoryRoleInner;
import java.util.List;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in DirectoryRolesDirectoryRolesClient. */
public interface DirectoryRolesDirectoryRolesClient {
    /**
     * Get entities from directoryRoles.
     *
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
     * @return entities from directoryRoles.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<MicrosoftGraphDirectoryRoleInner> listDirectoryRoleAsync(
        Integer top,
        Integer skip,
        String search,
        String filter,
        Boolean count,
        List<DirectoryRolesDirectoryRoleOrderby> orderby,
        List<DirectoryRolesDirectoryRoleSelect> select,
        List<DirectoryRolesDirectoryRoleExpand> expand);

    /**
     * Get entities from directoryRoles.
     *
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return entities from directoryRoles.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<MicrosoftGraphDirectoryRoleInner> listDirectoryRoleAsync();

    /**
     * Get entities from directoryRoles.
     *
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return entities from directoryRoles.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MicrosoftGraphDirectoryRoleInner> listDirectoryRole();

    /**
     * Get entities from directoryRoles.
     *
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
     * @return entities from directoryRoles.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MicrosoftGraphDirectoryRoleInner> listDirectoryRole(
        Integer top,
        Integer skip,
        String search,
        String filter,
        Boolean count,
        List<DirectoryRolesDirectoryRoleOrderby> orderby,
        List<DirectoryRolesDirectoryRoleSelect> select,
        List<DirectoryRolesDirectoryRoleExpand> expand,
        Context context);

    /**
     * Add new entity to directoryRoles.
     *
     * @param body New entity.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents an Azure Active Directory object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<MicrosoftGraphDirectoryRoleInner>> createDirectoryRoleWithResponseAsync(
        MicrosoftGraphDirectoryRoleInner body);

    /**
     * Add new entity to directoryRoles.
     *
     * @param body New entity.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents an Azure Active Directory object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<MicrosoftGraphDirectoryRoleInner> createDirectoryRoleAsync(MicrosoftGraphDirectoryRoleInner body);

    /**
     * Add new entity to directoryRoles.
     *
     * @param body New entity.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents an Azure Active Directory object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MicrosoftGraphDirectoryRoleInner createDirectoryRole(MicrosoftGraphDirectoryRoleInner body);

    /**
     * Add new entity to directoryRoles.
     *
     * @param body New entity.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents an Azure Active Directory object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MicrosoftGraphDirectoryRoleInner> createDirectoryRoleWithResponse(
        MicrosoftGraphDirectoryRoleInner body, Context context);

    /**
     * Get entity from directoryRoles by key.
     *
     * @param directoryRoleId key: id of directoryRole.
     * @param select Select properties to be returned.
     * @param expand Expand related entities.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return entity from directoryRoles by key.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<MicrosoftGraphDirectoryRoleInner>> getDirectoryRoleWithResponseAsync(
        String directoryRoleId,
        List<DirectoryRolesDirectoryRoleSelect> select,
        List<DirectoryRolesDirectoryRoleExpand> expand);

    /**
     * Get entity from directoryRoles by key.
     *
     * @param directoryRoleId key: id of directoryRole.
     * @param select Select properties to be returned.
     * @param expand Expand related entities.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return entity from directoryRoles by key.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<MicrosoftGraphDirectoryRoleInner> getDirectoryRoleAsync(
        String directoryRoleId,
        List<DirectoryRolesDirectoryRoleSelect> select,
        List<DirectoryRolesDirectoryRoleExpand> expand);

    /**
     * Get entity from directoryRoles by key.
     *
     * @param directoryRoleId key: id of directoryRole.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return entity from directoryRoles by key.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<MicrosoftGraphDirectoryRoleInner> getDirectoryRoleAsync(String directoryRoleId);

    /**
     * Get entity from directoryRoles by key.
     *
     * @param directoryRoleId key: id of directoryRole.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return entity from directoryRoles by key.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MicrosoftGraphDirectoryRoleInner getDirectoryRole(String directoryRoleId);

    /**
     * Get entity from directoryRoles by key.
     *
     * @param directoryRoleId key: id of directoryRole.
     * @param select Select properties to be returned.
     * @param expand Expand related entities.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return entity from directoryRoles by key.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MicrosoftGraphDirectoryRoleInner> getDirectoryRoleWithResponse(
        String directoryRoleId,
        List<DirectoryRolesDirectoryRoleSelect> select,
        List<DirectoryRolesDirectoryRoleExpand> expand,
        Context context);

    /**
     * Update entity in directoryRoles.
     *
     * @param directoryRoleId key: id of directoryRole.
     * @param body New property values.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> updateDirectoryRoleWithResponseAsync(
        String directoryRoleId, MicrosoftGraphDirectoryRoleInner body);

    /**
     * Update entity in directoryRoles.
     *
     * @param directoryRoleId key: id of directoryRole.
     * @param body New property values.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> updateDirectoryRoleAsync(String directoryRoleId, MicrosoftGraphDirectoryRoleInner body);

    /**
     * Update entity in directoryRoles.
     *
     * @param directoryRoleId key: id of directoryRole.
     * @param body New property values.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void updateDirectoryRole(String directoryRoleId, MicrosoftGraphDirectoryRoleInner body);

    /**
     * Update entity in directoryRoles.
     *
     * @param directoryRoleId key: id of directoryRole.
     * @param body New property values.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> updateDirectoryRoleWithResponse(
        String directoryRoleId, MicrosoftGraphDirectoryRoleInner body, Context context);

    /**
     * Delete entity from directoryRoles.
     *
     * @param directoryRoleId key: id of directoryRole.
     * @param ifMatch ETag.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> deleteDirectoryRoleWithResponseAsync(String directoryRoleId, String ifMatch);

    /**
     * Delete entity from directoryRoles.
     *
     * @param directoryRoleId key: id of directoryRole.
     * @param ifMatch ETag.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteDirectoryRoleAsync(String directoryRoleId, String ifMatch);

    /**
     * Delete entity from directoryRoles.
     *
     * @param directoryRoleId key: id of directoryRole.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteDirectoryRoleAsync(String directoryRoleId);

    /**
     * Delete entity from directoryRoles.
     *
     * @param directoryRoleId key: id of directoryRole.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void deleteDirectoryRole(String directoryRoleId);

    /**
     * Delete entity from directoryRoles.
     *
     * @param directoryRoleId key: id of directoryRole.
     * @param ifMatch ETag.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteDirectoryRoleWithResponse(String directoryRoleId, String ifMatch, Context context);
}
