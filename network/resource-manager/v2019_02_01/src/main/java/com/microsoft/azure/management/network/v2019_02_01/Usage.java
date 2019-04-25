/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_02_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.network.v2019_02_01.implementation.UsageInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2019_02_01.implementation.NetworkManager;

/**
 * Type representing Usage.
 */
public interface Usage extends HasInner<UsageInner>, HasManager<NetworkManager> {
    /**
     * @return the currentValue value.
     */
    long currentValue();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the limit value.
     */
    long limit();

    /**
     * @return the name value.
     */
    UsageName name();

    /**
     * @return the unit value.
     */
    String unit();

}
