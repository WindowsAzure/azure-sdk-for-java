/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.network.v2020_06_01.implementation.ProbeInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2020_06_01.implementation.NetworkManager;
import java.util.List;
import com.microsoft.azure.SubResource;

/**
 * Type representing Probe.
 */
public interface Probe extends HasInner<ProbeInner>, Indexable, Refreshable<Probe>, HasManager<NetworkManager> {
    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the intervalInSeconds value.
     */
    Integer intervalInSeconds();

    /**
     * @return the loadBalancingRules value.
     */
    List<SubResource> loadBalancingRules();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the numberOfProbes value.
     */
    Integer numberOfProbes();

    /**
     * @return the port value.
     */
    int port();

    /**
     * @return the protocol value.
     */
    ProbeProtocol protocol();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the requestPath value.
     */
    String requestPath();

    /**
     * @return the type value.
     */
    String type();

}
