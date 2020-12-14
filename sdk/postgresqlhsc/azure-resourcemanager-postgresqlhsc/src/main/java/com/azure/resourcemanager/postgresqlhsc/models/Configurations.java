// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlhsc.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.postgresqlhsc.fluent.models.ServerGroupConfigurationInner;

/** Resource collection API of Configurations. */
public interface Configurations {
    /**
     * List all the configurations of a server in server group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverGroupName The name of the server group.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of server configurations.
     */
    PagedIterable<ServerConfiguration> listByServer(
        String resourceGroupName, String serverGroupName, String serverName);

    /**
     * List all the configurations of a server in server group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverGroupName The name of the server group.
     * @param serverName The name of the server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of server configurations.
     */
    PagedIterable<ServerConfiguration> listByServer(
        String resourceGroupName, String serverGroupName, String serverName, Context context);

    /**
     * List all the configurations of a server group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverGroupName The name of the server group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of server group configurations.
     */
    PagedIterable<ServerGroupConfiguration> listByServerGroup(String resourceGroupName, String serverGroupName);

    /**
     * List all the configurations of a server group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverGroupName The name of the server group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of server group configurations.
     */
    PagedIterable<ServerGroupConfiguration> listByServerGroup(
        String resourceGroupName, String serverGroupName, Context context);

    /**
     * Updates configuration of server role groups in a server group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverGroupName The name of the server group.
     * @param configurationName The name of the server group configuration.
     * @param parameters Represents the configuration list of server role groups in a server group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the configuration list of server role groups in a server group.
     */
    ServerGroupConfiguration update(
        String resourceGroupName,
        String serverGroupName,
        String configurationName,
        ServerGroupConfigurationInner parameters);

    /**
     * Updates configuration of server role groups in a server group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverGroupName The name of the server group.
     * @param configurationName The name of the server group configuration.
     * @param parameters Represents the configuration list of server role groups in a server group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the configuration list of server role groups in a server group.
     */
    ServerGroupConfiguration update(
        String resourceGroupName,
        String serverGroupName,
        String configurationName,
        ServerGroupConfigurationInner parameters,
        Context context);

    /**
     * Gets information about single server group configuration.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverGroupName The name of the server group.
     * @param configurationName The name of the server group configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about single server group configuration.
     */
    ServerGroupConfiguration get(String resourceGroupName, String serverGroupName, String configurationName);

    /**
     * Gets information about single server group configuration.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverGroupName The name of the server group.
     * @param configurationName The name of the server group configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about single server group configuration.
     */
    Response<ServerGroupConfiguration> getWithResponse(
        String resourceGroupName, String serverGroupName, String configurationName, Context context);
}
