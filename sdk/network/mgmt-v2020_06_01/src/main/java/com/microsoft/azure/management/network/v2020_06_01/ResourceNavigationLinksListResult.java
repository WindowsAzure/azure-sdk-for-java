/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2020_06_01.implementation.NetworkManager;
import com.microsoft.azure.management.network.v2020_06_01.implementation.ResourceNavigationLinksListResultInner;
import com.microsoft.azure.management.network.v2020_06_01.implementation.ResourceNavigationLinkInner;
import java.util.List;

/**
 * Type representing ResourceNavigationLinksListResult.
 */
public interface ResourceNavigationLinksListResult extends HasInner<ResourceNavigationLinksListResultInner>, HasManager<NetworkManager> {
    /**
     * @return the nextLink value.
     */
    String nextLink();

    /**
     * @return the value value.
     */
    List<ResourceNavigationLinkInner> value();

}
