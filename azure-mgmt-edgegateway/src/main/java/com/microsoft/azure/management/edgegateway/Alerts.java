/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.edgegateway;

import rx.Observable;
import com.microsoft.azure.management.edgegateway.implementation.AlertsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Alerts.
 */
public interface Alerts extends HasInner<AlertsInner> {
    /**
     * Gets an alert by name.
     *
     * @param deviceName The device name.
     * @param name The alert name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Alert> getAsync(String deviceName, String name, String resourceGroupName);

    /**
     * Gets all the alerts for a data box edge/gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Alert> listByDataBoxEdgeDeviceAsync(final String deviceName, final String resourceGroupName);

}
