// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.fluent.models.GenerateSsoUrlResultInner;
import com.azure.resourcemanager.apimanagement.fluent.models.UserContractInner;
import com.azure.resourcemanager.apimanagement.fluent.models.UserTokenResultInner;
import com.azure.resourcemanager.apimanagement.models.AppType;
import com.azure.resourcemanager.apimanagement.models.UserCreateParameters;
import com.azure.resourcemanager.apimanagement.models.UserTokenParameters;
import com.azure.resourcemanager.apimanagement.models.UserUpdateParameters;

/** An instance of this class provides access to all the operations defined in UsersClient. */
public interface UsersClient {
    /**
     * Lists a collection of registered users in the specified service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Users list representation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<UserContractInner> listByService(String resourceGroupName, String serviceName);

    /**
     * Lists a collection of registered users in the specified service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param filter | Field | Usage | Supported operators | Supported functions
     *     |&lt;/br&gt;|-------------|-------------|-------------|-------------|&lt;/br&gt;| name | filter | ge, le, eq,
     *     ne, gt, lt | substringof, contains, startswith, endswith |&lt;/br&gt;| firstName | filter | ge, le, eq, ne,
     *     gt, lt | substringof, contains, startswith, endswith |&lt;/br&gt;| lastName | filter | ge, le, eq, ne, gt, lt
     *     | substringof, contains, startswith, endswith |&lt;/br&gt;| email | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;| state | filter | eq | |&lt;/br&gt;|
     *     registrationDate | filter | ge, le, eq, ne, gt, lt | |&lt;/br&gt;| note | filter | ge, le, eq, ne, gt, lt |
     *     substringof, contains, startswith, endswith |&lt;/br&gt;| groups | expand | | |&lt;/br&gt;.
     * @param top Number of records to return.
     * @param skip Number of records to skip.
     * @param expandGroups Detailed Group in response.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Users list representation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<UserContractInner> listByService(
        String resourceGroupName,
        String serviceName,
        String filter,
        Integer top,
        Integer skip,
        Boolean expandGroups,
        Context context);

    /**
     * Gets the entity state (Etag) version of the user specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param userId User identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void getEntityTag(String resourceGroupName, String serviceName, String userId);

    /**
     * Gets the entity state (Etag) version of the user specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param userId User identifier. Must be unique in the current API Management service instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the entity state (Etag) version of the user specified by its identifier.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> getEntityTagWithResponse(
        String resourceGroupName, String serviceName, String userId, Context context);

    /**
     * Gets the details of the user specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param userId User identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the user specified by its identifier.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    UserContractInner get(String resourceGroupName, String serviceName, String userId);

    /**
     * Gets the details of the user specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param userId User identifier. Must be unique in the current API Management service instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the user specified by its identifier.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<UserContractInner> getWithResponse(
        String resourceGroupName, String serviceName, String userId, Context context);

    /**
     * Creates or Updates a user.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param userId User identifier. Must be unique in the current API Management service instance.
     * @param parameters Create or update parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return user details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    UserContractInner createOrUpdate(
        String resourceGroupName, String serviceName, String userId, UserCreateParameters parameters);

    /**
     * Creates or Updates a user.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param userId User identifier. Must be unique in the current API Management service instance.
     * @param parameters Create or update parameters.
     * @param notify Send an Email notification to the User.
     * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return user details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<UserContractInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String serviceName,
        String userId,
        UserCreateParameters parameters,
        Boolean notify,
        String ifMatch,
        Context context);

    /**
     * Updates the details of the user specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param userId User identifier. Must be unique in the current API Management service instance.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param parameters Update parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return user details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    UserContractInner update(
        String resourceGroupName, String serviceName, String userId, String ifMatch, UserUpdateParameters parameters);

    /**
     * Updates the details of the user specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param userId User identifier. Must be unique in the current API Management service instance.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param parameters Update parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return user details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<UserContractInner> updateWithResponse(
        String resourceGroupName,
        String serviceName,
        String userId,
        String ifMatch,
        UserUpdateParameters parameters,
        Context context);

    /**
     * Deletes specific user.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param userId User identifier. Must be unique in the current API Management service instance.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String serviceName, String userId, String ifMatch);

    /**
     * Deletes specific user.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param userId User identifier. Must be unique in the current API Management service instance.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param deleteSubscriptions Whether to delete user's subscription or not.
     * @param notify Send an Account Closed Email notification to the User.
     * @param appType Determines the type of application which send the create user request. Default is legacy publisher
     *     portal.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName,
        String serviceName,
        String userId,
        String ifMatch,
        Boolean deleteSubscriptions,
        Boolean notify,
        AppType appType,
        Context context);

    /**
     * Retrieves a redirection URL containing an authentication token for signing a given user into the developer
     * portal.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param userId User identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return generate SSO Url operations response details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GenerateSsoUrlResultInner generateSsoUrl(String resourceGroupName, String serviceName, String userId);

    /**
     * Retrieves a redirection URL containing an authentication token for signing a given user into the developer
     * portal.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param userId User identifier. Must be unique in the current API Management service instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return generate SSO Url operations response details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<GenerateSsoUrlResultInner> generateSsoUrlWithResponse(
        String resourceGroupName, String serviceName, String userId, Context context);

    /**
     * Gets the Shared Access Authorization Token for the User.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param userId User identifier. Must be unique in the current API Management service instance.
     * @param parameters Create Authorization Token parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Shared Access Authorization Token for the User.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    UserTokenResultInner getSharedAccessToken(
        String resourceGroupName, String serviceName, String userId, UserTokenParameters parameters);

    /**
     * Gets the Shared Access Authorization Token for the User.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param userId User identifier. Must be unique in the current API Management service instance.
     * @param parameters Create Authorization Token parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Shared Access Authorization Token for the User.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<UserTokenResultInner> getSharedAccessTokenWithResponse(
        String resourceGroupName, String serviceName, String userId, UserTokenParameters parameters, Context context);
}
