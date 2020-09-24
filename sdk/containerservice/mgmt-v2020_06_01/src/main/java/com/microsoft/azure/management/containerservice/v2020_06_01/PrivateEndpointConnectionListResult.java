/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2020_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.containerservice.v2020_06_01.implementation.ContainerServiceManager;
import com.microsoft.azure.management.containerservice.v2020_06_01.implementation.PrivateEndpointConnectionListResultInner;
import com.microsoft.azure.management.containerservice.v2020_06_01.implementation.PrivateEndpointConnectionInner;
import java.util.List;

/**
 * Type representing PrivateEndpointConnectionListResult.
 */
public interface PrivateEndpointConnectionListResult extends HasInner<PrivateEndpointConnectionListResultInner>, HasManager<ContainerServiceManager> {
    /**
     * @return the value value.
     */
    List<PrivateEndpointConnectionInner> value();

}
