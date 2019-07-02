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
import com.microsoft.azure.management.network.v2019_02_01.implementation.ConnectionResetSharedKeyInner;

/**
 * Type representing ConnectionResetSharedKey.
 */
public interface ConnectionResetSharedKey extends HasInner<ConnectionResetSharedKeyInner>, HasManager<NetworkManager> {
    /**
     * @return the keyLength value.
     */
    int keyLength();

}
