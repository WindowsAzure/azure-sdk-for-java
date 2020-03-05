/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_11_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2019_11_01.implementation.NetworkManager;
import com.microsoft.azure.management.network.v2019_11_01.implementation.AzureFirewallFqdnTagInner;

/**
 * Type representing AzureFirewallFqdnTag.
 */
public interface AzureFirewallFqdnTag extends HasInner<AzureFirewallFqdnTagInner>, Resource, GroupableResourceCore<NetworkManager, AzureFirewallFqdnTagInner>, HasResourceGroup, HasManager<NetworkManager> {
    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the fqdnTagName value.
     */
    String fqdnTagName();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

}
