/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_11_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2018_11_01.implementation.NetworkManager;
import com.microsoft.azure.management.network.v2018_11_01.implementation.ApplicationGatewayBackendHealthInner;
import java.util.List;

/**
 * Type representing ApplicationGatewayBackendHealth.
 */
public interface ApplicationGatewayBackendHealth extends HasInner<ApplicationGatewayBackendHealthInner>, HasManager<NetworkManager> {
    /**
     * @return the backendAddressPools value.
     */
    List<ApplicationGatewayBackendHealthPool> backendAddressPools();

}
