/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_04_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2020_04_01.implementation.NetworkManager;
import com.microsoft.azure.management.network.v2020_04_01.implementation.TopologyInner;
import org.joda.time.DateTime;
import java.util.List;

/**
 * Type representing Topology.
 */
public interface Topology extends HasInner<TopologyInner>, HasManager<NetworkManager> {
    /**
     * @return the createdDateTime value.
     */
    DateTime createdDateTime();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the lastModified value.
     */
    DateTime lastModified();

    /**
     * @return the resources value.
     */
    List<TopologyResource> resources();

}
