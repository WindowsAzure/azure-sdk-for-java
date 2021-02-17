// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Skus. */
public interface Skus {
    /**
     * Gets the sku details for the given resource type and sku name.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param sku The SKU.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.providerhub.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the sku details for the given resource type and sku name.
     */
    SkuResource get(String providerNamespace, String resourceType, String sku);

    /**
     * Gets the sku details for the given resource type and sku name.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param sku The SKU.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.providerhub.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the sku details for the given resource type and sku name.
     */
    Response<SkuResource> getWithResponse(String providerNamespace, String resourceType, String sku, Context context);

    /**
     * Deletes a resource type sku.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param sku The SKU.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.providerhub.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String providerNamespace, String resourceType, String sku);

    /**
     * Deletes a resource type sku.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param sku The SKU.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.providerhub.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(String providerNamespace, String resourceType, String sku, Context context);

    /**
     * Gets the sku details for the given resource type and sku name.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param nestedResourceTypeFirst The first child resource type.
     * @param sku The SKU.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.providerhub.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the sku details for the given resource type and sku name.
     */
    SkuResource getNestedResourceTypeFirst(
        String providerNamespace, String resourceType, String nestedResourceTypeFirst, String sku);

    /**
     * Gets the sku details for the given resource type and sku name.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param nestedResourceTypeFirst The first child resource type.
     * @param sku The SKU.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.providerhub.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the sku details for the given resource type and sku name.
     */
    Response<SkuResource> getNestedResourceTypeFirstWithResponse(
        String providerNamespace, String resourceType, String nestedResourceTypeFirst, String sku, Context context);

    /**
     * Creates or updates the resource type skus in the given resource type.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param nestedResourceTypeFirst The first child resource type.
     * @param sku The SKU.
     * @param properties The required body parameters supplied to the resource sku operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.providerhub.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    SkuResource createOrUpdateNestedResourceTypeFirst(
        String providerNamespace,
        String resourceType,
        String nestedResourceTypeFirst,
        String sku,
        ResourceTypeSku properties);

    /**
     * Creates or updates the resource type skus in the given resource type.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param nestedResourceTypeFirst The first child resource type.
     * @param sku The SKU.
     * @param properties The required body parameters supplied to the resource sku operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.providerhub.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<SkuResource> createOrUpdateNestedResourceTypeFirstWithResponse(
        String providerNamespace,
        String resourceType,
        String nestedResourceTypeFirst,
        String sku,
        ResourceTypeSku properties,
        Context context);

    /**
     * Deletes a resource type sku.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param nestedResourceTypeFirst The first child resource type.
     * @param sku The SKU.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.providerhub.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteNestedResourceTypeFirst(
        String providerNamespace, String resourceType, String nestedResourceTypeFirst, String sku);

    /**
     * Deletes a resource type sku.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param nestedResourceTypeFirst The first child resource type.
     * @param sku The SKU.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.providerhub.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteNestedResourceTypeFirstWithResponse(
        String providerNamespace, String resourceType, String nestedResourceTypeFirst, String sku, Context context);

    /**
     * Gets the sku details for the given resource type and sku name.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param nestedResourceTypeFirst The first child resource type.
     * @param nestedResourceTypeSecond The second child resource type.
     * @param sku The SKU.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.providerhub.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the sku details for the given resource type and sku name.
     */
    SkuResource getNestedResourceTypeSecond(
        String providerNamespace,
        String resourceType,
        String nestedResourceTypeFirst,
        String nestedResourceTypeSecond,
        String sku);

    /**
     * Gets the sku details for the given resource type and sku name.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param nestedResourceTypeFirst The first child resource type.
     * @param nestedResourceTypeSecond The second child resource type.
     * @param sku The SKU.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.providerhub.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the sku details for the given resource type and sku name.
     */
    Response<SkuResource> getNestedResourceTypeSecondWithResponse(
        String providerNamespace,
        String resourceType,
        String nestedResourceTypeFirst,
        String nestedResourceTypeSecond,
        String sku,
        Context context);

    /**
     * Creates or updates the resource type skus in the given resource type.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param nestedResourceTypeFirst The first child resource type.
     * @param nestedResourceTypeSecond The second child resource type.
     * @param sku The SKU.
     * @param properties The required body parameters supplied to the resource sku operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.providerhub.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    SkuResource createOrUpdateNestedResourceTypeSecond(
        String providerNamespace,
        String resourceType,
        String nestedResourceTypeFirst,
        String nestedResourceTypeSecond,
        String sku,
        ResourceTypeSku properties);

    /**
     * Creates or updates the resource type skus in the given resource type.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param nestedResourceTypeFirst The first child resource type.
     * @param nestedResourceTypeSecond The second child resource type.
     * @param sku The SKU.
     * @param properties The required body parameters supplied to the resource sku operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.providerhub.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<SkuResource> createOrUpdateNestedResourceTypeSecondWithResponse(
        String providerNamespace,
        String resourceType,
        String nestedResourceTypeFirst,
        String nestedResourceTypeSecond,
        String sku,
        ResourceTypeSku properties,
        Context context);

    /**
     * Deletes a resource type sku.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param nestedResourceTypeFirst The first child resource type.
     * @param nestedResourceTypeSecond The second child resource type.
     * @param sku The SKU.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.providerhub.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteNestedResourceTypeSecond(
        String providerNamespace,
        String resourceType,
        String nestedResourceTypeFirst,
        String nestedResourceTypeSecond,
        String sku);

    /**
     * Deletes a resource type sku.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param nestedResourceTypeFirst The first child resource type.
     * @param nestedResourceTypeSecond The second child resource type.
     * @param sku The SKU.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.providerhub.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteNestedResourceTypeSecondWithResponse(
        String providerNamespace,
        String resourceType,
        String nestedResourceTypeFirst,
        String nestedResourceTypeSecond,
        String sku,
        Context context);

    /**
     * Gets the sku details for the given resource type and sku name.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param nestedResourceTypeFirst The first child resource type.
     * @param nestedResourceTypeSecond The second child resource type.
     * @param nestedResourceTypeThird The third child resource type.
     * @param sku The SKU.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.providerhub.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the sku details for the given resource type and sku name.
     */
    SkuResource getNestedResourceTypeThird(
        String providerNamespace,
        String resourceType,
        String nestedResourceTypeFirst,
        String nestedResourceTypeSecond,
        String nestedResourceTypeThird,
        String sku);

    /**
     * Gets the sku details for the given resource type and sku name.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param nestedResourceTypeFirst The first child resource type.
     * @param nestedResourceTypeSecond The second child resource type.
     * @param nestedResourceTypeThird The third child resource type.
     * @param sku The SKU.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.providerhub.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the sku details for the given resource type and sku name.
     */
    Response<SkuResource> getNestedResourceTypeThirdWithResponse(
        String providerNamespace,
        String resourceType,
        String nestedResourceTypeFirst,
        String nestedResourceTypeSecond,
        String nestedResourceTypeThird,
        String sku,
        Context context);

    /**
     * Creates or updates the resource type skus in the given resource type.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param nestedResourceTypeFirst The first child resource type.
     * @param nestedResourceTypeSecond The second child resource type.
     * @param nestedResourceTypeThird The third child resource type.
     * @param sku The SKU.
     * @param properties The required body parameters supplied to the resource sku operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.providerhub.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    SkuResource createOrUpdateNestedResourceTypeThird(
        String providerNamespace,
        String resourceType,
        String nestedResourceTypeFirst,
        String nestedResourceTypeSecond,
        String nestedResourceTypeThird,
        String sku,
        ResourceTypeSku properties);

    /**
     * Creates or updates the resource type skus in the given resource type.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param nestedResourceTypeFirst The first child resource type.
     * @param nestedResourceTypeSecond The second child resource type.
     * @param nestedResourceTypeThird The third child resource type.
     * @param sku The SKU.
     * @param properties The required body parameters supplied to the resource sku operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.providerhub.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<SkuResource> createOrUpdateNestedResourceTypeThirdWithResponse(
        String providerNamespace,
        String resourceType,
        String nestedResourceTypeFirst,
        String nestedResourceTypeSecond,
        String nestedResourceTypeThird,
        String sku,
        ResourceTypeSku properties,
        Context context);

    /**
     * Deletes a resource type sku.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param nestedResourceTypeFirst The first child resource type.
     * @param nestedResourceTypeSecond The second child resource type.
     * @param nestedResourceTypeThird The third child resource type.
     * @param sku The SKU.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.providerhub.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteNestedResourceTypeThird(
        String providerNamespace,
        String resourceType,
        String nestedResourceTypeFirst,
        String nestedResourceTypeSecond,
        String nestedResourceTypeThird,
        String sku);

    /**
     * Deletes a resource type sku.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param nestedResourceTypeFirst The first child resource type.
     * @param nestedResourceTypeSecond The second child resource type.
     * @param nestedResourceTypeThird The third child resource type.
     * @param sku The SKU.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.providerhub.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteNestedResourceTypeThirdWithResponse(
        String providerNamespace,
        String resourceType,
        String nestedResourceTypeFirst,
        String nestedResourceTypeSecond,
        String nestedResourceTypeThird,
        String sku,
        Context context);

    /**
     * Gets the list of skus for the given resource type.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.providerhub.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of skus for the given resource type.
     */
    PagedIterable<SkuResource> listByResourceTypeRegistrations(String providerNamespace, String resourceType);

    /**
     * Gets the list of skus for the given resource type.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.providerhub.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of skus for the given resource type.
     */
    PagedIterable<SkuResource> listByResourceTypeRegistrations(
        String providerNamespace, String resourceType, Context context);

    /**
     * Gets the list of skus for the given resource type.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param nestedResourceTypeFirst The first child resource type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.providerhub.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of skus for the given resource type.
     */
    PagedIterable<SkuResource> listByResourceTypeRegistrationsNestedResourceTypeFirst(
        String providerNamespace, String resourceType, String nestedResourceTypeFirst);

    /**
     * Gets the list of skus for the given resource type.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param nestedResourceTypeFirst The first child resource type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.providerhub.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of skus for the given resource type.
     */
    PagedIterable<SkuResource> listByResourceTypeRegistrationsNestedResourceTypeFirst(
        String providerNamespace, String resourceType, String nestedResourceTypeFirst, Context context);

    /**
     * Gets the list of skus for the given resource type.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param nestedResourceTypeFirst The first child resource type.
     * @param nestedResourceTypeSecond The second child resource type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.providerhub.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of skus for the given resource type.
     */
    PagedIterable<SkuResource> listByResourceTypeRegistrationsNestedResourceTypeSecond(
        String providerNamespace, String resourceType, String nestedResourceTypeFirst, String nestedResourceTypeSecond);

    /**
     * Gets the list of skus for the given resource type.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param nestedResourceTypeFirst The first child resource type.
     * @param nestedResourceTypeSecond The second child resource type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.providerhub.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of skus for the given resource type.
     */
    PagedIterable<SkuResource> listByResourceTypeRegistrationsNestedResourceTypeSecond(
        String providerNamespace,
        String resourceType,
        String nestedResourceTypeFirst,
        String nestedResourceTypeSecond,
        Context context);

    /**
     * Gets the list of skus for the given resource type.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param nestedResourceTypeFirst The first child resource type.
     * @param nestedResourceTypeSecond The second child resource type.
     * @param nestedResourceTypeThird The third child resource type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.providerhub.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of skus for the given resource type.
     */
    PagedIterable<SkuResource> listByResourceTypeRegistrationsNestedResourceTypeThird(
        String providerNamespace,
        String resourceType,
        String nestedResourceTypeFirst,
        String nestedResourceTypeSecond,
        String nestedResourceTypeThird);

    /**
     * Gets the list of skus for the given resource type.
     *
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param resourceType The resource type.
     * @param nestedResourceTypeFirst The first child resource type.
     * @param nestedResourceTypeSecond The second child resource type.
     * @param nestedResourceTypeThird The third child resource type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.providerhub.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of skus for the given resource type.
     */
    PagedIterable<SkuResource> listByResourceTypeRegistrationsNestedResourceTypeThird(
        String providerNamespace,
        String resourceType,
        String nestedResourceTypeFirst,
        String nestedResourceTypeSecond,
        String nestedResourceTypeThird,
        Context context);

    /**
     * Gets the sku details for the given resource type and sku name.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.providerhub.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the sku details for the given resource type and sku name.
     */
    SkuResource getById(String id);

    /**
     * Gets the sku details for the given resource type and sku name.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.providerhub.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the sku details for the given resource type and sku name.
     */
    Response<SkuResource> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a resource type sku.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.providerhub.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a resource type sku.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.providerhub.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new SkuResource resource.
     *
     * @param name resource name.
     * @return the first stage of the new SkuResource definition.
     */
    SkuResource.DefinitionStages.Blank define(String name);
}
