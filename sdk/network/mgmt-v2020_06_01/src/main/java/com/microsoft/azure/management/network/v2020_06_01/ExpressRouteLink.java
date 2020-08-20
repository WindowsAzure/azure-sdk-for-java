/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.network.v2020_06_01.implementation.ExpressRouteLinkInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2020_06_01.implementation.NetworkManager;

/**
 * Type representing ExpressRouteLink.
 */
public interface ExpressRouteLink extends HasInner<ExpressRouteLinkInner>, Indexable, Refreshable<ExpressRouteLink>, HasManager<NetworkManager> {
    /**
     * @return the adminState value.
     */
    ExpressRouteLinkAdminState adminState();

    /**
     * @return the connectorType value.
     */
    ExpressRouteLinkConnectorType connectorType();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the interfaceName value.
     */
    String interfaceName();

    /**
     * @return the macSecConfig value.
     */
    ExpressRouteLinkMacSecConfig macSecConfig();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the patchPanelId value.
     */
    String patchPanelId();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the rackId value.
     */
    String rackId();

    /**
     * @return the routerName value.
     */
    String routerName();

}
