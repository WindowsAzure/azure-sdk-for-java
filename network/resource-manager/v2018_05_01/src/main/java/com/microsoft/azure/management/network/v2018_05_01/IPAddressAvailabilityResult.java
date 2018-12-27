/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_05_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2018_05_01.implementation.NetworkManager;
import com.microsoft.azure.management.network.v2018_05_01.implementation.IPAddressAvailabilityResultInner;
import java.util.List;

/**
 * Type representing IPAddressAvailabilityResult.
 */
public interface IPAddressAvailabilityResult extends HasInner<IPAddressAvailabilityResultInner>, HasManager<NetworkManager> {
    /**
     * @return the available value.
     */
    Boolean available();

    /**
     * @return the availableIPAddresses value.
     */
    List<String> availableIPAddresses();

}
