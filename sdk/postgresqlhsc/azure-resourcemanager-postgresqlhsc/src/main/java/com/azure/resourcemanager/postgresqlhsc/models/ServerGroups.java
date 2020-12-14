// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlhsc.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ServerGroups. */
public interface ServerGroups {
    /**
     * List all the server groups in a given subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of server groups.
     */
    PagedIterable<ServerGroup> list();

    /**
     * List all the server groups in a given subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of server groups.
     */
    PagedIterable<ServerGroup> list(Context context);

    /**
     * List all the server groups in a given resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of server groups.
     */
    PagedIterable<ServerGroup> listByResourceGroup(String resourceGroupName);

    /**
     * List all the server groups in a given resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of server groups.
     */
    PagedIterable<ServerGroup> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets information about a server group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverGroupName The name of the server group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a server group.
     */
    ServerGroup getByResourceGroup(String resourceGroupName, String serverGroupName);

    /**
     * Gets information about a server group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverGroupName The name of the server group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a server group.
     */
    Response<ServerGroup> getByResourceGroupWithResponse(
        String resourceGroupName, String serverGroupName, Context context);

    /**
     * Deletes a server group together with servers in it.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverGroupName The name of the server group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String serverGroupName);

    /**
     * Deletes a server group together with servers in it.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverGroupName The name of the server group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String serverGroupName, Context context);

    /**
     * Restarts the server group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverGroupName The name of the server group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void restart(String resourceGroupName, String serverGroupName);

    /**
     * Restarts the server group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverGroupName The name of the server group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void restart(String resourceGroupName, String serverGroupName, Context context);

    /**
     * Starts the server group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverGroupName The name of the server group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start(String resourceGroupName, String serverGroupName);

    /**
     * Starts the server group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverGroupName The name of the server group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start(String resourceGroupName, String serverGroupName, Context context);

    /**
     * Stops the server group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverGroupName The name of the server group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop(String resourceGroupName, String serverGroupName);

    /**
     * Stops the server group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverGroupName The name of the server group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop(String resourceGroupName, String serverGroupName, Context context);

    /**
     * Check the availability of name for resource.
     *
     * @param nameAvailabilityRequest Request from client to check resource name availability.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a resource name availability.
     */
    NameAvailability checkNameAvailability(NameAvailabilityRequest nameAvailabilityRequest);

    /**
     * Check the availability of name for resource.
     *
     * @param nameAvailabilityRequest Request from client to check resource name availability.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a resource name availability.
     */
    Response<NameAvailability> checkNameAvailabilityWithResponse(
        NameAvailabilityRequest nameAvailabilityRequest, Context context);

    /**
     * Gets information about a server group.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a server group.
     */
    ServerGroup getById(String id);

    /**
     * Gets information about a server group.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a server group.
     */
    Response<ServerGroup> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a server group together with servers in it.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a server group together with servers in it.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new ServerGroup resource.
     *
     * @param name resource name.
     * @return the first stage of the new ServerGroup definition.
     */
    ServerGroup.DefinitionStages.Blank define(String name);
}
