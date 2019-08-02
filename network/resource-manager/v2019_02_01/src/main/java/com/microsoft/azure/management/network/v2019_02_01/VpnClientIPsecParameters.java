/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_02_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2019_02_01.implementation.NetworkManager;
import com.microsoft.azure.management.network.v2019_02_01.implementation.VpnClientIPsecParametersInner;

/**
 * Type representing VpnClientIPsecParameters.
 */
public interface VpnClientIPsecParameters extends HasInner<VpnClientIPsecParametersInner>, HasManager<NetworkManager> {
    /**
     * @return the dhGroup value.
     */
    DhGroup dhGroup();

    /**
     * @return the ikeEncryption value.
     */
    IkeEncryption ikeEncryption();

    /**
     * @return the ikeIntegrity value.
     */
    IkeIntegrity ikeIntegrity();

    /**
     * @return the ipsecEncryption value.
     */
    IpsecEncryption ipsecEncryption();

    /**
     * @return the ipsecIntegrity value.
     */
    IpsecIntegrity ipsecIntegrity();

    /**
     * @return the pfsGroup value.
     */
    PfsGroup pfsGroup();

    /**
     * @return the saDataSizeKilobytes value.
     */
    int saDataSizeKilobytes();

    /**
     * @return the saLifeTimeSeconds value.
     */
    int saLifeTimeSeconds();

}
