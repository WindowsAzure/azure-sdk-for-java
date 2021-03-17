// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.fluent.models.ClientSecretContractInner;
import com.azure.resourcemanager.apimanagement.fluent.models.IdentityProviderContractInner;
import com.azure.resourcemanager.apimanagement.models.IdentityProviderCreateContract;
import com.azure.resourcemanager.apimanagement.models.IdentityProviderType;
import com.azure.resourcemanager.apimanagement.models.IdentityProviderUpdateParameters;

/** An instance of this class provides access to all the operations defined in IdentityProvidersClient. */
public interface IdentityProvidersClient {
    /**
     * Lists a collection of Identity Provider configured in the specified service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of all the Identity Providers configured on the service instance.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<IdentityProviderContractInner> listByService(String resourceGroupName, String serviceName);

    /**
     * Lists a collection of Identity Provider configured in the specified service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of all the Identity Providers configured on the service instance.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<IdentityProviderContractInner> listByService(
        String resourceGroupName, String serviceName, Context context);

    /**
     * Gets the entity state (Etag) version of the identityProvider specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param identityProviderName Identity Provider Type identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void getEntityTag(String resourceGroupName, String serviceName, IdentityProviderType identityProviderName);

    /**
     * Gets the entity state (Etag) version of the identityProvider specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param identityProviderName Identity Provider Type identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the entity state (Etag) version of the identityProvider specified by its identifier.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> getEntityTagWithResponse(
        String resourceGroupName, String serviceName, IdentityProviderType identityProviderName, Context context);

    /**
     * Gets the configuration details of the identity Provider configured in specified service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param identityProviderName Identity Provider Type identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the configuration details of the identity Provider configured in specified service instance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IdentityProviderContractInner get(
        String resourceGroupName, String serviceName, IdentityProviderType identityProviderName);

    /**
     * Gets the configuration details of the identity Provider configured in specified service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param identityProviderName Identity Provider Type identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the configuration details of the identity Provider configured in specified service instance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<IdentityProviderContractInner> getWithResponse(
        String resourceGroupName, String serviceName, IdentityProviderType identityProviderName, Context context);

    /**
     * Creates or Updates the IdentityProvider configuration.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param identityProviderName Identity Provider Type identifier.
     * @param parameters Create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return identity Provider details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IdentityProviderContractInner createOrUpdate(
        String resourceGroupName,
        String serviceName,
        IdentityProviderType identityProviderName,
        IdentityProviderCreateContract parameters);

    /**
     * Creates or Updates the IdentityProvider configuration.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param identityProviderName Identity Provider Type identifier.
     * @param parameters Create parameters.
     * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return identity Provider details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<IdentityProviderContractInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String serviceName,
        IdentityProviderType identityProviderName,
        IdentityProviderCreateContract parameters,
        String ifMatch,
        Context context);

    /**
     * Updates an existing IdentityProvider configuration.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param identityProviderName Identity Provider Type identifier.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param parameters Update parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return identity Provider details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IdentityProviderContractInner update(
        String resourceGroupName,
        String serviceName,
        IdentityProviderType identityProviderName,
        String ifMatch,
        IdentityProviderUpdateParameters parameters);

    /**
     * Updates an existing IdentityProvider configuration.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param identityProviderName Identity Provider Type identifier.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param parameters Update parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return identity Provider details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<IdentityProviderContractInner> updateWithResponse(
        String resourceGroupName,
        String serviceName,
        IdentityProviderType identityProviderName,
        String ifMatch,
        IdentityProviderUpdateParameters parameters,
        Context context);

    /**
     * Deletes the specified identity provider configuration.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param identityProviderName Identity Provider Type identifier.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(
        String resourceGroupName, String serviceName, IdentityProviderType identityProviderName, String ifMatch);

    /**
     * Deletes the specified identity provider configuration.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param identityProviderName Identity Provider Type identifier.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
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
        IdentityProviderType identityProviderName,
        String ifMatch,
        Context context);

    /**
     * Gets the client secret details of the Identity Provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param identityProviderName Identity Provider Type identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the client secret details of the Identity Provider.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ClientSecretContractInner listSecrets(
        String resourceGroupName, String serviceName, IdentityProviderType identityProviderName);

    /**
     * Gets the client secret details of the Identity Provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param identityProviderName Identity Provider Type identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the client secret details of the Identity Provider.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ClientSecretContractInner> listSecretsWithResponse(
        String resourceGroupName, String serviceName, IdentityProviderType identityProviderName, Context context);
}
