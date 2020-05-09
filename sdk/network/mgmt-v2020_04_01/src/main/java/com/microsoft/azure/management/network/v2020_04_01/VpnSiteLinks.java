/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_04_01;

import rx.Observable;
import com.microsoft.azure.management.network.v2020_04_01.implementation.VpnSiteLinksInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing VpnSiteLinks.
 */
public interface VpnSiteLinks extends HasInner<VpnSiteLinksInner> {
    /**
     * Retrieves the details of a VPN site link.
     *
     * @param resourceGroupName The resource group name of the VpnSite.
     * @param vpnSiteName The name of the VpnSite.
     * @param vpnSiteLinkName The name of the VpnSiteLink being retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VpnSiteLink> getAsync(String resourceGroupName, String vpnSiteName, String vpnSiteLinkName);

    /**
     * Lists all the vpnSiteLinks in a resource group for a vpn site.
     *
     * @param resourceGroupName The resource group name of the VpnSite.
     * @param vpnSiteName The name of the VpnSite.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VpnSiteLink> listByVpnSiteAsync(final String resourceGroupName, final String vpnSiteName);

}
