// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.databoxedge.fluent.models.AlertInner;

/** An instance of this class provides access to all the operations defined in AlertsClient. */
public interface AlertsClient {
    /**
     * Gets all the alerts for a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the alerts for a Data Box Edge/Data Box Gateway device.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AlertInner> listByDataBoxEdgeDevice(String deviceName, String resourceGroupName);

    /**
     * Gets all the alerts for a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the alerts for a Data Box Edge/Data Box Gateway device.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AlertInner> listByDataBoxEdgeDevice(String deviceName, String resourceGroupName, Context context);

    /**
     * Gets an alert by name.
     *
     * @param deviceName The device name.
     * @param name The alert name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an alert by name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AlertInner get(String deviceName, String name, String resourceGroupName);

    /**
     * Gets an alert by name.
     *
     * @param deviceName The device name.
     * @param name The alert name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an alert by name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AlertInner> getWithResponse(String deviceName, String name, String resourceGroupName, Context context);
}
