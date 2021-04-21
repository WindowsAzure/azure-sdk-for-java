// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.customerinsights.fluent.models.ConnectorMappingResourceFormatInner;

/** An instance of this class provides access to all the operations defined in ConnectorMappingsClient. */
public interface ConnectorMappingsClient {
    /**
     * Creates a connector mapping or updates an existing connector mapping in the connector.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param connectorName The name of the connector.
     * @param mappingName The name of the connector mapping.
     * @param parameters Parameters supplied to the CreateOrUpdate Connector Mapping operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the connector mapping resource format.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ConnectorMappingResourceFormatInner createOrUpdate(
        String resourceGroupName,
        String hubName,
        String connectorName,
        String mappingName,
        ConnectorMappingResourceFormatInner parameters);

    /**
     * Creates a connector mapping or updates an existing connector mapping in the connector.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param connectorName The name of the connector.
     * @param mappingName The name of the connector mapping.
     * @param parameters Parameters supplied to the CreateOrUpdate Connector Mapping operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the connector mapping resource format.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ConnectorMappingResourceFormatInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String hubName,
        String connectorName,
        String mappingName,
        ConnectorMappingResourceFormatInner parameters,
        Context context);

    /**
     * Gets a connector mapping in the connector.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param connectorName The name of the connector.
     * @param mappingName The name of the connector mapping.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a connector mapping in the connector.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ConnectorMappingResourceFormatInner get(
        String resourceGroupName, String hubName, String connectorName, String mappingName);

    /**
     * Gets a connector mapping in the connector.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param connectorName The name of the connector.
     * @param mappingName The name of the connector mapping.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a connector mapping in the connector.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ConnectorMappingResourceFormatInner> getWithResponse(
        String resourceGroupName, String hubName, String connectorName, String mappingName, Context context);

    /**
     * Deletes a connector mapping in the connector.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param connectorName The name of the connector.
     * @param mappingName The name of the connector mapping.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String hubName, String connectorName, String mappingName);

    /**
     * Deletes a connector mapping in the connector.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param connectorName The name of the connector.
     * @param mappingName The name of the connector mapping.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String hubName, String connectorName, String mappingName, Context context);

    /**
     * Gets all the connector mappings in the specified connector.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param connectorName The name of the connector.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the connector mappings in the specified connector.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ConnectorMappingResourceFormatInner> listByConnector(
        String resourceGroupName, String hubName, String connectorName);

    /**
     * Gets all the connector mappings in the specified connector.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param connectorName The name of the connector.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the connector mappings in the specified connector.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ConnectorMappingResourceFormatInner> listByConnector(
        String resourceGroupName, String hubName, String connectorName, Context context);
}
