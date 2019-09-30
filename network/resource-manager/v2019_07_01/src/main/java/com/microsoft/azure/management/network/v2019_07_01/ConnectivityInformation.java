/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_07_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2019_07_01.implementation.NetworkManager;
import com.microsoft.azure.management.network.v2019_07_01.implementation.ConnectivityInformationInner;
import java.util.List;

/**
 * Type representing ConnectivityInformation.
 */
public interface ConnectivityInformation extends HasInner<ConnectivityInformationInner>, HasManager<NetworkManager> {
    /**
     * @return the avgLatencyInMs value.
     */
    Integer avgLatencyInMs();

    /**
     * @return the connectionStatus value.
     */
    ConnectionStatus connectionStatus();

    /**
     * @return the hops value.
     */
    List<ConnectivityHop> hops();

    /**
     * @return the maxLatencyInMs value.
     */
    Integer maxLatencyInMs();

    /**
     * @return the minLatencyInMs value.
     */
    Integer minLatencyInMs();

    /**
     * @return the probesFailed value.
     */
    Integer probesFailed();

    /**
     * @return the probesSent value.
     */
    Integer probesSent();

}
