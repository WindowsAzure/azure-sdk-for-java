/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.trafficmanager.v2017_03_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.trafficmanager.v2017_03_01.implementation.NetworkManager;
import com.microsoft.azure.management.trafficmanager.v2017_03_01.implementation.EndpointInner;
import java.util.List;

/**
 * Type representing Endpoint.
 */
public interface Endpoint extends HasInner<EndpointInner>, HasManager<NetworkManager> {
    /**
     * @return the endpointLocation value.
     */
    String endpointLocation();

    /**
     * @return the endpointMonitorStatus value.
     */
    String endpointMonitorStatus();

    /**
     * @return the endpointStatus value.
     */
    String endpointStatus();

    /**
     * @return the geoMapping value.
     */
    List<String> geoMapping();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the minChildEndpoints value.
     */
    Long minChildEndpoints();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the priority value.
     */
    Long priority();

    /**
     * @return the target value.
     */
    String target();

    /**
     * @return the targetResourceId value.
     */
    String targetResourceId();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the weight value.
     */
    Long weight();

}
