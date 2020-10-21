/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_11_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2018_11_01.implementation.NetworkManager;
import com.microsoft.azure.management.network.v2018_11_01.implementation.AvailableProvidersListInner;
import java.util.List;

/**
 * Type representing AvailableProvidersList.
 */
public interface AvailableProvidersList extends HasInner<AvailableProvidersListInner>, HasManager<NetworkManager> {
    /**
     * @return the countries value.
     */
    List<AvailableProvidersListCountry> countries();

}
