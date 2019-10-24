/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_09_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.network.v2019_09_01.implementation.VpnSiteLinkInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2019_09_01.implementation.NetworkManager;

/**
 * Type representing VpnSiteLink.
 */
public interface VpnSiteLink extends HasInner<VpnSiteLinkInner>, Indexable, Refreshable<VpnSiteLink>, HasManager<NetworkManager> {
    /**
     * @return the bgpProperties value.
     */
    VpnLinkBgpSettings bgpProperties();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the ipAddress value.
     */
    String ipAddress();

    /**
     * @return the linkProperties value.
     */
    VpnLinkProviderProperties linkProperties();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the type value.
     */
    String type();

}
