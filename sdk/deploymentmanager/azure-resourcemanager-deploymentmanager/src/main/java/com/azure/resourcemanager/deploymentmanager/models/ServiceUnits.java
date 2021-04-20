// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deploymentmanager.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import java.util.List;

/** Resource collection API of ServiceUnits. */
public interface ServiceUnits {
    /**
     * Gets the service unit.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceTopologyName The name of the service topology .
     * @param serviceName The name of the service resource.
     * @param serviceUnitName The name of the service unit resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the service unit.
     */
    ServiceUnitResource get(
        String resourceGroupName, String serviceTopologyName, String serviceName, String serviceUnitName);

    /**
     * Gets the service unit.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceTopologyName The name of the service topology .
     * @param serviceName The name of the service resource.
     * @param serviceUnitName The name of the service unit resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the service unit.
     */
    Response<ServiceUnitResource> getWithResponse(
        String resourceGroupName,
        String serviceTopologyName,
        String serviceName,
        String serviceUnitName,
        Context context);

    /**
     * Deletes the service unit.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceTopologyName The name of the service topology .
     * @param serviceName The name of the service resource.
     * @param serviceUnitName The name of the service unit resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String serviceTopologyName, String serviceName, String serviceUnitName);

    /**
     * Deletes the service unit.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceTopologyName The name of the service topology .
     * @param serviceName The name of the service resource.
     * @param serviceUnitName The name of the service unit resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName,
        String serviceTopologyName,
        String serviceName,
        String serviceUnitName,
        Context context);

    /**
     * Lists the service units under a service in the service topology.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceTopologyName The name of the service topology .
     * @param serviceName The name of the service resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of service units.
     */
    List<ServiceUnitResource> list(String resourceGroupName, String serviceTopologyName, String serviceName);

    /**
     * Lists the service units under a service in the service topology.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceTopologyName The name of the service topology .
     * @param serviceName The name of the service resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of service units.
     */
    Response<List<ServiceUnitResource>> listWithResponse(
        String resourceGroupName, String serviceTopologyName, String serviceName, Context context);

    /**
     * Gets the service unit.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the service unit.
     */
    ServiceUnitResource getById(String id);

    /**
     * Gets the service unit.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the service unit.
     */
    Response<ServiceUnitResource> getByIdWithResponse(String id, Context context);

    /**
     * Deletes the service unit.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the service unit.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new ServiceUnitResource resource.
     *
     * @param name resource name.
     * @return the first stage of the new ServiceUnitResource definition.
     */
    ServiceUnitResource.DefinitionStages.Blank define(String name);
}
