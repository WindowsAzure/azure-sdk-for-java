/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.OutboundEnvironmentEndpointInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.AppServiceManager;
import java.util.List;

/**
 * Type representing OutboundEnvironmentEndpoint.
 */
public interface OutboundEnvironmentEndpoint extends HasInner<OutboundEnvironmentEndpointInner>, HasManager<AppServiceManager> {
    /**
     * @return the category value.
     */
    String category();

    /**
     * @return the endpoints value.
     */
    List<EndpointDependency> endpoints();

}
