/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_05_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2018_05_01.implementation.NetworkManager;
import java.util.List;
import com.microsoft.azure.management.network.v2018_05_01.implementation.BgpServiceCommunityInner;

/**
 * Type representing BgpServiceCommunity.
 */
public interface BgpServiceCommunity extends HasInner<BgpServiceCommunityInner>, Resource, GroupableResourceCore<NetworkManager, BgpServiceCommunityInner>, HasResourceGroup, HasManager<NetworkManager> {
    /**
     * @return the bgpCommunities value.
     */
    List<BGPCommunity> bgpCommunities();

    /**
     * @return the serviceName value.
     */
    String serviceName();

}
