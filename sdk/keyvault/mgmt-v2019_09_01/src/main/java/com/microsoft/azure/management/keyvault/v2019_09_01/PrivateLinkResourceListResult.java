/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.keyvault.v2019_09_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.keyvault.v2019_09_01.implementation.KeyVaultManager;
import com.microsoft.azure.management.keyvault.v2019_09_01.implementation.PrivateLinkResourceListResultInner;
import com.microsoft.azure.management.keyvault.v2019_09_01.implementation.PrivateLinkResourceInner;
import java.util.List;

/**
 * Type representing PrivateLinkResourceListResult.
 */
public interface PrivateLinkResourceListResult extends HasInner<PrivateLinkResourceListResultInner>, HasManager<KeyVaultManager> {
    /**
     * @return the value value.
     */
    List<PrivateLinkResourceInner> value();

}
