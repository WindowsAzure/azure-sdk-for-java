// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.security.fluent.models.ConnectorSettingInner;

/** An instance of this class provides access to all the operations defined in ConnectorsClient. */
public interface ConnectorsClient {
    /**
     * Cloud accounts connectors of a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return for a subscription, list of all cloud account connectors and their settings.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ConnectorSettingInner> list();

    /**
     * Cloud accounts connectors of a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return for a subscription, list of all cloud account connectors and their settings.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ConnectorSettingInner> list(Context context);

    /**
     * Details of a specific cloud account connector.
     *
     * @param connectorName Name of the cloud account connector.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the connector setting.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ConnectorSettingInner get(String connectorName);

    /**
     * Details of a specific cloud account connector.
     *
     * @param connectorName Name of the cloud account connector.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the connector setting.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ConnectorSettingInner> getWithResponse(String connectorName, Context context);

    /**
     * Create a cloud account connector or update an existing one. Connect to your cloud account. For AWS, use either
     * account credentials or role-based authentication. For GCP, use account organization credentials.
     *
     * @param connectorName Name of the cloud account connector.
     * @param connectorSetting Settings for the cloud account connector.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the connector setting.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ConnectorSettingInner createOrUpdate(String connectorName, ConnectorSettingInner connectorSetting);

    /**
     * Create a cloud account connector or update an existing one. Connect to your cloud account. For AWS, use either
     * account credentials or role-based authentication. For GCP, use account organization credentials.
     *
     * @param connectorName Name of the cloud account connector.
     * @param connectorSetting Settings for the cloud account connector.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the connector setting.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ConnectorSettingInner> createOrUpdateWithResponse(
        String connectorName, ConnectorSettingInner connectorSetting, Context context);

    /**
     * Delete a cloud account connector from a subscription.
     *
     * @param connectorName Name of the cloud account connector.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String connectorName);

    /**
     * Delete a cloud account connector from a subscription.
     *
     * @param connectorName Name of the cloud account connector.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String connectorName, Context context);
}
